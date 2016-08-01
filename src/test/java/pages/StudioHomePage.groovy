package pages

import geb.Page
import modules.NielsenStudioModule
import modules.ProjectCreationModule
import org.openqa.selenium.By

/**
 * Created by saic on 7/26/2016.
 */
class StudioHomePage extends Page {

    static url = "https://studio.nielsen.com/platformservices/studio/#/home"
    static at = {

        waitFor {
            $("div", class: "homepage-parent-row").isDisplayed()
        }
        waitFor {
            js.('jQuery.active') == 0
        }
    }
    static content = {

        concepts { module NielsenStudioModule }
        project{module ProjectCreationModule}
    }

    def clickConcept(String conceptName) {
        waitFor{
            concepts.conceptLink(conceptName).isDisplayed()
        }
        waitFor{concepts.conceptLink(conceptName).click()}
        sleep(4000)
    }

    def shiftToNewWindow() {

        Set<String> handles = driver.getWindowHandles()
        List<String> listOfHandles = new ArrayList<String>(handles)
        driver.switchTo().window(listOfHandles.get(1))
    }


}
