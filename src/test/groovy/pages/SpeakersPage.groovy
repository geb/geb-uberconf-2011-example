package pages

import geb.*
import modules.Speakers

class SpeakersPage extends NavPage {

    static at = { assert pageName == "Speakers"; true }

    static content = {
        speakers { module Speakers, $("div#summaryList") }
    }
}