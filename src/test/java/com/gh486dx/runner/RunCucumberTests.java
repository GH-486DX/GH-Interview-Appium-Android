package com.gh486dx.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/"},
        glue = {"com.gh486dx.definitions"})

public class RunCucumberTests extends AbstractTestNGCucumberTests {
}
