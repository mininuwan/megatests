package io.mega.steps;

import io.mega.webdriver.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
    /**
     * Runs before each test(feature) with tag '@ui'
     */
    @Before("@ui")
    public void beforeEach(){
        WebDriverFactory.createDriver();
    }

    /**
     * Runs after each test(features) with tag '@ui' whether pass or fail
     */
    @After("@ui")
    public void afterEach() {
        WebDriverFactory.cleanUpDriver();
    }
}
