package com.ebay;

import com.intuit.karate.junit5.Karate;

class KarateTestRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("apiTest/Users").relativeTo(getClass());
    }

    @Karate.Test
    Karate testReqresAPIs() {
        return Karate.run("apiTest/FirstTest").relativeTo(getClass());
    }

}
