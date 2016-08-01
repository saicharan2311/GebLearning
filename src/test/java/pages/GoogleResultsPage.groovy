package pages

import geb.Page
/**
 * Created with IntelliJ IDEA.
 * User: santhoshp
 * Date: 11/1/14
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
class GoogleResultsPage extends Page {
    static at = { title.endsWith "Google Search" }
    static content = {
        // reuse our previously defined module
        search { module GoogleSearchModule, buttonValue: "Search" }

        // content definitions can compose and build from other definitions
        results { $("h3.r") }
        result { i -> results[i] }
        resultLink { i -> result(i).find("a") }
        firstResultLink { resultLink(0) }
    }
}