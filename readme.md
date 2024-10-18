## GH Interview Appium Android example

https://github.com/GH-486DX/GH-Interview-Appium-Android

### Intro

Example of using Java, UiAutomator2, appium-java-client, Appium 2.X and Maven to show testing some actions against a basic **Android** test application (being run locally via emulation):

* `myapp.apk` - local copy in the root directory.

It uses Page Object Model for locators, and Cucumber with TestNG for BDD test syntax. It also starts the Appium Server locally during test initialisation.

The Cucumber test Features are located in: `src/test/resources/features`

[Appium Inspector](https://github.com/appium/appium-inspector) was used to inspect the application's elements. Example capabilities:

```
{
  "platformName": "Android",
  "appium:automationName": "UiAutomator2",
  "appium:platformVersion": "15",
  "appium:deviceName": "Medium Phone API 35",
  "appium:app": "<full-path-to-myapp.apk>"
}
```

### Requirements & setup:

Below should be working on your machine:

* `java -version`
* `mvn -v`
* `npm -v`
* `appium -v`
  * Ensure that Appium Server is able to start without error.
  * Ensure that the UiAutomator2 driver is installed: `appium driver install uiautomator2`
* [Android Studio](https://developer.android.com/studio) - Virtual Device Manager.
  * Ensure that the [required Android Studio environment variables](https://developer.android.com/tools/variables) are set.

### Running the tests:

(Appium Server should be launched by the test framework automatically)

1. Launch an [emulated Android device via Android Studio](https://developer.android.com/studio/run/managing-avds) (default device should be sufficient).
2. Launch tests: `mvn test`