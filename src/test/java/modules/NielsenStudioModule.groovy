package modules

import geb.Module

/**
 * Created by saic on 7/26/2016.
 */
class NielsenStudioModule extends Module{

    static content={
        conceptslist{
            return $("h3").allElements()
        }

        conceptLink{
            concept -> $('h3', title: concept)
        }
        project_newbutton{
            $('button',id:"projects-new-btn")
        }

    }
}
