package steps;

import io.cucumber.java.en.*;

public class CartSteps {

    @Given("the customer is logged in")
    public void customerIsLoggedIn() {
        System.out.println("Customer is logged in");
    }

    @Given("the product is available")
    public void productIsAvailable() {
        System.out.println("Product is available");
    }

    @When("the customer adds the product to the cart")
    public void addProductToCart() {
        System.out.println("Product added to cart");
    }

    @Then("the product should be added to the cart")
    public void productShouldBeAdded() {
        System.out.println("Product is in cart");
    }

    @Given("the product is out of stock")
    public void productOutOfStock() {
        System.out.println("Product is out of stock");
    }

    @Then("an out of stock message should be displayed")
    public void outOfStockMessage() {
        System.out.println("Out of stock message displayed");
    }

    @Given("the customer is not logged in")
    public void customerNotLoggedIn() {
        System.out.println("Customer is not logged in");
    }

    @Then("the system should ask the customer to login")
    public void askCustomerToLogin() {
        System.out.println("Please login first");
    }

    @Given("the customer enters invalid quantity")
    public void invalidQuantity() {
        System.out.println("Invalid quantity entered");
    }

    @Then("a quantity validation message should be displayed")
    public void quantityValidationMessage() {
        System.out.println("Quantity validation message displayed");
    }

    @Given("several products are available")
    public void severalProductsAvailable() {
        System.out.println("Several products are available");
    }

    @When("the customer adds multiple products to the cart")
    public void addMultipleProducts() {
        System.out.println("Multiple products added to cart");
    }

    @Then("all selected products should be added to the cart")
    public void allProductsAdded() {
        System.out.println("All selected products are in cart");
    }
}