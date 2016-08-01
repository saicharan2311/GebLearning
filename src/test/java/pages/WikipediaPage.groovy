package pages

import geb.Page

/**
 * Created with IntelliJ IDEA.
 * User: santhoshp
 * Date: 11/1/14
 * Time: 3:37 PM
 * To change this template use File | Settings | File Templates.
 */
class WikipediaPage extends Page
{
    static at = { title.contains('Wikipedia') }
}
