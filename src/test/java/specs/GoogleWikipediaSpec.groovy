package specs
import geb.spock.GebSpec
import pages.*


class GoogleWikipediaSpec extends GebSpec {

    def "first result for wikipedia search should be wikipedia"() {
        given:
        to GoogleHomePage

        expect:
        at GoogleHomePage

        when:
        search.field.value("wikipedia")


        then:
        waitFor { at GoogleResultsPage }

        and:
        firstResultLink.text()== "Wikipedia, the free encyclopedia"

        when:
        firstResultLink.click()

        then:
        waitFor { at WikipediaPage }
    }
}

