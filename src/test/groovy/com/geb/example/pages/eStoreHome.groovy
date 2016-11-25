package com.geb.example.pages

import geb.Page
import org.openqa.selenium.By

/**
 * Created by Naveen
 */

class eStoreHome extends Page {

    static at = {
        title.contains("My Store")
    }

    static content = {
        signIn { $(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"))}
    }
}
