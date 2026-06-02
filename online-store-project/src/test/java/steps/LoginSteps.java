package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("the user enters valid username and password")
    public void validCredentials() {
        System.out.println("Valid credentials entered");
    }

    @When("the user clicks the login button")
    public void clickLoginButton() {
        System.out.println("Login button clicked");
    }

    @Then("the user should be logged in successfully")
    public void successfulLogin() {
        System.out.println("User logged in successfully");
    }

    @Given("the user enters invalid password")
    public void invalidPassword() {
        System.out.println("Invalid password entered");
    }

    @Then("an error message should be displayed")
    public void errorMessageDisplayed() {
        System.out.println("Error message displayed");
    }

    @Given("the username field is empty")
    public void emptyUsername() {
        System.out.println("Username is empty");
    }

    @Then("a validation message should be displayed")
    public void validationMessageDisplayed() {
        System.out.println("Validation message displayed");
    }

    @Given("the password field is empty")
    public void emptyPassword() {
        System.out.println("Password is empty");
    }

    @Given("the admin enters valid credentials")
    public void adminCredentials() {
        System.out.println("Admin credentials entered");
    }

    @When("the admin clicks the login button")
    public void adminLoginButton() {
        System.out.println("Admin login button clicked");
    }

    @Then("the admin should be logged in successfully")
    public void adminLoggedIn() {
        System.out.println("Admin logged in successfully");
    }
}