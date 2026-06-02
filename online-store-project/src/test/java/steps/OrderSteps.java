package steps;

import io.cucumber.java.en.*;

public class OrderSteps {

    @Given("the customer has products in the cart")
    public void customerHasProductsInCart() {
        System.out.println("Customer has products in the cart");
    }

    @When("the customer places the order")
    public void customerPlacesOrder() {
        System.out.println("Customer places the order");
    }

    @Then("the order should be created successfully")
    public void orderCreatedSuccessfully() {
        System.out.println("Order created successfully");
    }

    @Given("the cart is empty")
    public void cartIsEmpty() {
        System.out.println("Cart is empty");
    }

    @Then("an empty cart message should be displayed")
    public void emptyCartMessageDisplayed() {
        System.out.println("Empty cart message displayed");
    }

    @Given("the payment is invalid")
    public void paymentIsInvalid() {
        System.out.println("Payment is invalid");
    }

    @Then("a payment error message should be displayed")
    public void paymentErrorMessageDisplayed() {
        System.out.println("Payment error message displayed");
    }

    @Given("the payment is valid")
    public void paymentIsValid() {
        System.out.println("Payment is valid");
    }

    @Then("the payment should be processed successfully")
    public void paymentProcessedSuccessfully() {
        System.out.println("Payment processed successfully");
    }

    @Given("the user is not logged in")
    public void userIsNotLoggedIn() {
        System.out.println("User is not logged in");
    }

    @When("the user places an order")
    public void userPlacesOrder() {
        System.out.println("User places an order");
    }

    @Then("the system should request login")
    public void systemShouldRequestLogin() {
        System.out.println("System requests login");
    }
}
