package com.gh486dx.definitions;

import com.gh486dx.utils.HelperClass;
import io.cucumber.java.AfterAll;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;

public class Hooks {

    @BeforeAll
    public static void before_all() throws MalformedURLException {
        HelperClass.setUp();
    }

    @After
    public void after() {
        // Resets the App after each test scenario
        String bundleId = HelperClass.getAndroidDriver().getCapabilities().getCapability("appPackage").toString();
        HelperClass.getAndroidDriver().terminateApp(bundleId);
        HelperClass.getAndroidDriver().activateApp(bundleId);
    }

    @AfterAll
    public static void after_all() {
        HelperClass.tearDown();
    }
}