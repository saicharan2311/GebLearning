package modules

import geb.Module

/**
 * Created by saic on 7/26/2016.
 */
class SelectableLinkModule extends Module{

    boolean isSelected(){
        parent().hasClass("selected")
    }
}
