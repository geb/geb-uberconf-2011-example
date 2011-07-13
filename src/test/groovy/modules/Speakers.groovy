package modules

import geb.*
import pages.*

class Speakers extends Module {

    static content = {
        // Obtain the the first speaker module where the name contains the given name
        speakerByName { name -> module(Speaker, speakerNameLink(name).parents("div.speakerItem")) }

        // Gets the first speaker name link that contains the given string, case insensitively
        speakerNameLink { name -> $("a", text: iContains(name)) }
    }

    def getAt(String speakerName) {
        speakerByName(speakerName)
    }
}