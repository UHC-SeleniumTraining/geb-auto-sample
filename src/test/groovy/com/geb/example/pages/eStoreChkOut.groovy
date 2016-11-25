package com.geb.example.pages

import geb.Page
import org.openqa.selenium.By

/**
 * Created by Naveen
 */

class eStoreChkOut extends Page {

    static at = {
        title.contains ("Faded Short Sleeve T-shirts - My Store")
    }
    static content = {

        addCart { $(By.id("add_to_cart"))}
        proceedckhout { $(By.linkText("Proceed to checkout"))}
        actualCnt { $(By.className("ajax_cart_quantity"))}

    }

}
