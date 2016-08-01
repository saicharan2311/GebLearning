package pages

import geb.Page
import modules.ProjectCreationModule

/**
 * Created by saic on 7/28/2016.
 */
class ProjectCreatePage  extends Page{

    static at={

        waitFor{
            createProjectWindow.createProjectDialog.isDisplayed()
        }
    }

    static content = {

        createProjectWindow { module ProjectCreationModule }

    }

    def enterProjectName(String name){
        createProjectWindow.projectName.firstElement().sendKeys(name)
    }
}
