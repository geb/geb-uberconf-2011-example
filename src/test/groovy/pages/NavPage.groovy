package pages

import geb.*
import modules.*

class NavPage extends BasePage {
    static content = {
        nav { module(Navigation, $("ul#showNavButtons")) }
    }
}