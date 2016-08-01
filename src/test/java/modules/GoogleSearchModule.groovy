package modules

import geb.Module
import pages.GoogleResultsPage
/**
 * Created with IntelliJ IDEA.
 * User: santhoshp
 * Date: 11/1/14
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */

// Modules are reusable fragments that can be used across pages that can be paramaterised
// here we are using a module to model the search function on the home and results pages
class GoogleSearchModule extends Module {

    // a paramaterised value set when the module is included
    def buttonValue

    // the content DSL
    static content = {

        // name the search input control “field”, defining it with the jQuery like navigator
        field { $("input", name: "q") }

        // the search button declares that it takes us to the results page, and uses the
        // parameterised buttonValue to define itself
        button(to: GoogleResultsPage) {
            $("input", value: buttonValue)
        }
    }
}