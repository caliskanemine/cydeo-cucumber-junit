package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters librarian username");

        // throw new io.cucumber.java.PendingException();
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters librarian password");

        // throw new io.cucumber.java.PendingException();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should see the dashboard");

        // throw new io.cucumber.java.PendingException();

    }


    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("User enters student password");
    }


    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("User enters admin password");
    }


    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        System.out.println("User is on the library login page");
    }
}
