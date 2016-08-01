package pages

import geb.Page
import modules.NielsenLoginModule
import modules.NielsenStudioModule

/**
 * Created by saic on 7/26/2016.
 */
class StudioLoginPage extends Page {

    static url = "https://studio.nielsen.com"

    static at = {
        title.contains("Nielsen Studio")

    }
    static content={

        loginform{module NielsenLoginModule}

    }

    def loginPage(String userName,String userPassword){
        loginform.emailid.firstElement().sendKeys(userName)
        loginform.password.firstElement().sendKeys(userPassword)
        loginform.submitbutton.firstElement().click()
    }
}
