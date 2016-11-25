package com.geb.example.pages

import geb.Page
import org.openqa.selenium.By

/**
 * Created by Naveen
 */

class eStoreProduct extends Page {

    static at = {
        title.contains("My account - My Store")
    }

    static content = {
        itemSearch { $(By.id("search_query_top")) }
        itemSel { $(title: "Faded Short Sleeve T-shirts", alt: "Faded Short Sleeve T-shirts") }
        itemCnt { $(By.id("quantity_wanted")) }
        itemSize { $(By.id("group_1")) }

    }
}