package modules

import geb.Module

/**
 * Created by saic on 7/27/2016.
 */
class ConceptsModule extends Module{

    static content={
       nameOfConcept{
           $("#_name")
       }
       getConceptName{ $("#_name").text()}

    }
}
