package com.geb.example.pages

import geb.Page
import org.openqa.selenium.By

/**
 * Created by Naveen
 */

class eStoreLogin extends Page {

    static at = {
        title.contains ("My Store")
    }

    static content = {
        emailField { $("input", id:"email") }
        pwdField { $("input", id:"passwd")}
        signBtn { $(By.id("SubmitLogin"))}
    }
}
