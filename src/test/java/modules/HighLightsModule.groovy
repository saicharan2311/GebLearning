package modules

import geb.Module

/**
 * Created by saic on 7/26/2016.
 */
class HighLightsModule  extends Module{

    static content = {
        highlightsLink {

            text -> $("a", text: text).module(SelectableLinkModule)

        }
        jQueryLikeApi{
            highlightsLink("jQuery-like API")
        }
    }
}
