package pages

import modules.*

class FrontPage extends NavPage {

    static url = "home"
    static at = { assert nav.currentName == "Event Home"; true }

}