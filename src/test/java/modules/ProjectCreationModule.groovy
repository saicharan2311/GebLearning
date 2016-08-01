package modules

import geb.Module

/**
 * Created by saic on 7/28/2016.
 */
class ProjectCreationModule extends Module {

    static content={
        createProjectDialog{
            $('div',class:"modal-content")
        }
        projectHeading{
            $('h1',id:"myModalLabel")
        }
        projectName{
            $('input',id:"new-project-name-text")
        }
        projectType{
            $("#new-project-type-tab ul input",0)
        }
        projectSaveButton{
            $("#new-project-save-btn")
        }
    }
}
