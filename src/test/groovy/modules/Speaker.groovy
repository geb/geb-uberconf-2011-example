package modules

import geb.*
import pages.*

class Speaker extends Module {

    static content = {
        nameLink(to: SpeakerPage) { $("a", 0) }
        picture(to: SpeakerPage) { $("img") }
        name { nameLink.text() }
        shortBio { $("h2.shortBio em").text() }
        bio { $("div.abstract").text() }
    }

}