package modules

/**
 * Created by saic on 7/26/2016.
 */
import geb.Module
class NielsenLoginModule extends Module{

    static content={

            emailid{
                $("input",id:"username")
            }
            password {
                $("input", id: "password")
            }
            submitbutton{
                $("input",id:"submit")
            }

    }

}
