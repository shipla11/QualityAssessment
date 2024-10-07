package StepDefination;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends LoginPage {

    @Given("user launches the application")
    public void user_launches_the_application() {
        launchUrl();
    }
    @When("user cliks on BookStore Application")
    public void user_cliks_on_book_store_application() {
        clickBookstore();
    }
    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        clickLoginbtn();
    }
    @When("user enter {string} and {string}")
    public void user_enter_and(String userName, String password) {
        enterUsername(userName);
        enterPassword(password);
    }
    @Then("user successfully logged in to application")
    public void user_successfully_logged_in_to_application() {
        System.out.println("successfully Logged IN");
    }

}
