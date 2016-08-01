package pages

import geb.Page
import modules.ConceptsModule


/**
 * Created by saic on 7/27/2016.
 */
class ConceptsHomePage  extends Page{

    static content={
        concepttab{module ConceptsModule}

    }
    static at={

        waitFor { js.('jQuery.active') == 0 }
        waitFor{
            $("#actionBtn").displayed
        }
    }

    def getConceptName(){
        return concepttab.nameOfConcept.text()
    }


}
