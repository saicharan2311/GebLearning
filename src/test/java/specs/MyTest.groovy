package specs

import geb.Browser
import geb.spock.GebSpec
import pages.GebHomePage

/**
 * Created by saic on 7/26/2016.
 */
class MyTest extends  GebSpec{

    def setup(){
        driver.manage().window().maximize()
    }
    def "can access The Book of Geb via homepage"() {
        when:
                to GebHomePage

        and:

        highlights.jQueryLikeApi.click()

        then:
        sectionTitles == ["Navigating Content", "Form Control Shortcuts"]
        highlights.jQueryLikeApi.selected
    }
}
