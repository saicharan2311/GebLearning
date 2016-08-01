package pages

import geb.Page
import modules.GoogleSearchModule

/**
 * Created with IntelliJ IDEA.
 * User: santhoshp
 * Date: 11/1/14
 * Time: 3:18 PM
 * To change this template use File | Settings | File Templates.
 */
class GoogleHomePage extends Page {

    // pages can define their location, either absolutely or relative to a base
    static url = "http://google.com/ncr"

    // “at checkers” allow verifying that the browser is at the expected page
    static at = { title == "Google" }

    static content = {
        // include the previously defined module
        search { module GoogleSearchModule, buttonValue: "Google Search" }
    }
}
