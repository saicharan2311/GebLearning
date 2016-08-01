package pages

import geb.Page
import modules.HighLightsModule
import org.openqa.selenium.StaleElementReferenceException

/**
 * Created by saic on 7/26/2016.
 */
class GebHomePage extends Page {

    static url = "http://gebish.org"
    static at = {

        waitFor {
            title == "Geb - Very Groovy Browser Automation"
        }
        waitFor {

          js.('document.readyState') == 'complete'
        }
    }

    static content = {


        highlights {

            $("#sidebar .sidemenu").module(HighLightsModule)
        }
        sectionTitles {
                $("#main h1")*.text()

        }
    }
}
