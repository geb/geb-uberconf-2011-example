package modules

import geb.*

class Navigation extends Module {

    static content = {
        currentName { current.text() }
        current { all.find("a.current") }
        all { $("li") }
        link { $("li a", text: iContains(it)) }
    }
    
    def getAt(String linkText) {
        link(linkText)
    }
}