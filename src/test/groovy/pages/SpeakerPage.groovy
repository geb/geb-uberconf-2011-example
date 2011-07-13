package pages

class SpeakerPage extends BasePage {

    // If the title contains 'Biography', we are at a speaker page
    static at = { title.contains("Biography") }

    static content = {
        // Not strictly needed, but reads better in specs
        speakerName { pageName }
        presentations(cache: true) {
            $("div.presentationsLong h3").collect { heading ->
                new Presentation(
                    title: heading.text(),
                    description: heading.nextAll("p")*.text().join("\n\n")
                )
            }
        }
    }

    static class Presentation {
        String title
        String description
    }

}