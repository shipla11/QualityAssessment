package StepDefination;

import Pages.ButtonsPage;
import Pages.TestBoxSubmitPage;
import Utility.FunctionCaller;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ButtonsClickSteps extends ButtonsPage {

    @When("user cliks on Buttons Icon")
    public void user_cliks_on_buttons_icon() {
         clickOnButtons();
    }
    @When("user cliks on Double click button")
    public void user_cliks_on_doublie_click_button() {
        doubleClickOnButton();
    }
    @Then("user is able to validate Double click message {string}")
    public void user_is_able_to_validate_double_click_message(String string) {
        Assert.assertEquals("Double click Validation:", string, getDoubleClickMessage());
    }
    @When("user cliks on Right click button")
    public void user_cliks_on_right_click_button() {
        rightClickOnButton();
    }

    @Then("user is able to validate Right click message {string}")
    public void user_is_able_to_validate_Right_click_message(String string) {
        Assert.assertEquals("Right click Validation:", string, getRightClickMessage());
    }

    @When("user cliks on single click button")
    public void user_cliks_on_single_click_button() {
        dynamicClickOnButton();
    }

    @Then("user is able to validate Dynamic click message {string}")
    public void user_is_able_to_validate_dynamic_click_message(String string) {
        Assert.assertEquals("Dynamic click Validation:", string, getDynamicClickMessage());
    }


}
