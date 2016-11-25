

package com.geb.example.specs

import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys
import.org.openqa.selenium

import com.geb.example.pages.eStoreHome
import com.geb.example.pages.eStoreLogin
import com.geb.example.pages.eStoreProduct

class eStoreSpecTest extends GebReportingSpec {

    def "Launch App and Click Sign in"() {
        when: 'I launch App'
            to eStoreHome
        and: 'I click Sign in'
            signIn.click()
        then: 'I am at home page'
            at eStoreLogin
    }

    def "Login to eStore Home"() {
        when: 'I am at home page'
            at eStoreLogin
        and: 'I login with credentials'
            waitFor {emailField.present}
            emailField.value("testingse@gmail.com")
            pwdField.value("testing123")
            signBtn.click()
        then: ' I get into profile page'
            at eStoreProduct
    }

    def "Search for T-Shirt"() {
      when: 'I am at product search page'
      at eStoreProduct
      then: 'I search for T-Shirt and select'
      itemSearch.value("T-Shirt")
      Thread.sleep(2000)
      itemSearch << Keys.chord(Keys.ENTER)
      waitFor {itemSel.present}
      itemSel.click()
      Thread.sleep(2000)
  }
}