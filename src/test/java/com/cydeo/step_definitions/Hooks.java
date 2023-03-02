package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    /*
    In the class we will be able to pass pre- & post- conditions
    to each scenario and each step
     */

   // @Before(order = 1) //import from io.cucumber.java, not from junit
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

   // @Before(value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====this will only to scenarios with @login tag");
    }

   // @Before(value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only to scenarios with @db tag");
    }

    @After
    public void teardownScenario(Scenario scenario){

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

   // @BeforeStep
    public void setupMethod(){
        System.out.println("-----> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("-----> applying tearDown using @AfterStep");
    }
}
