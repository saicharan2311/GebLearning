package specs

import geb.spock.GebSpec
import org.apache.tools.ant.Project
import org.openqa.selenium.By
import pages.ConceptsHomePage
import pages.ProjectCreatePage
import pages.StudioHomePage
import pages.StudioLoginPage

/**
 * Created by saic on 7/26/2016.
 */
class LoginSpec extends GebSpec {
    def setup() {
        driver.manage().window().maximize()
    }
     def "Verification of login credentials for given user"(){
         given:
         def username="saicharan.srinivas@imaginea.com"
           def password="password"
           when:
           loginform.emailid << username
           loginform.password<< password
           loginform.submitbutton.click()
           then:
           at StudioHomePage
      }

    def "Verify the default number of concepts present in studio home page"(){
        given:
        to StudioLoginPage
        when:"User opens login page"
        loginPage("saicharan.srinivas@imaginea.com","Karthik")
        at StudioHomePage

        then:"When user navigates to home page after successful login"
       assert concepts.conceptslist.size()>=12
    }

    def "Click on the given concept and verify the name of concept in new window"() {
        given:
        to StudioLoginPage
        when:
        loginPage("saicharan.srinivas@imaginea.com", "Karthik")
        waitFor { StudioHomePage }
        at StudioHomePage
        clickConcept("NanoPaint")
        shiftToNewWindow()
        waitFor {at ConceptsHomePage}

        then:
        assert concepttab.getConceptName.contains("NanoPaint")
    }

    def "Create a new project and verify the project creation"(){
        given:
        to StudioLoginPage
        when:
        loginPage("saicharan.srinivas@imaginea.com","Karthik")
        waitFor { StudioHomePage }
        at StudioHomePage
        concepts.project_newbutton.click()
        waitFor{ ProjectCreatePage}
        at ProjectCreatePage
        enterProjectName("New_123468")
        waitFor{ createProjectWindow.projectSaveButton.displayed}
        createProjectWindow.projectSaveButton.jquery.click()
        then:
        println"Clicked button"
    }

    def cleanup() {
        driver.quit()
    }
}
