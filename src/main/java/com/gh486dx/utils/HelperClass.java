package com.gh486dx.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.MalformedURLException;
import java.net.URL;

public class HelperClass {

    private static HelperClass helperClass;

    private static AndroidDriver androidDriver;

    private static AppiumDriverLocalService server;

    private HelperClass() throws MalformedURLException {
        // Start Appium Server
        server = AppiumDriverLocalService.buildDefaultService();
        server.start();

        // Start Android Driver
        String workingDirectory = (System.getProperty("user.dir"));
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(workingDirectory + "//myapp.apk");
        androidDriver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"), options // Default local address for Appium 2.X
        );
    }

    public static AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    public static void setUp() throws MalformedURLException {
        if (helperClass == null) {
            //noinspection InstantiationOfUtilityClass
            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
        if (server != null) {
            server.stop();
        }
        helperClass = null;
    }

}