import pages.*
import spock.lang.*
import geb.spock.*

@Stepwise
class PetersSpeakerPageSpec extends GebReportingSpec {
    
    def "at the front page"() {
        when:
        to FrontPage
        
        then:
        at FrontPage
    }
    
    def "go to the speakers page"() {
        when:
        nav["Speakers"].click()
        
        then:
        at SpeakersPage
    }
    
    def "Peter is listed as a speaker"() {
        when:
        def peter = speakers["Peter Niederwieser"]
    
        then:
        peter.shortBio == "Creator of the Spock Framework"
        
        and:
        peter.bio.contains "Peter is a Principal Software Engineer at Gradleware"
    }
    
    def "go to Peter's speaker page"() {
        when:
        speakers["Peter Niederwieser"].nameLink.click()
        
        then:
        at SpeakerPage
        
        and:
        speakerName == "Peter Niederwieser"
    }
    
    def "check Peter's talks"() {
        expect:
        presentations[1].title == "Smarter Testing with Spock"
        presentations[1].description.contains "Next, we will explore some of Spock's extensions"
        
        and:
        presentations[2].title == "Functional Web Testing with Geb and Spock"
        presentations[2].description.contains "In this session, you will learn everything you need to know to start using Geb in your own projects"
    }
    
}