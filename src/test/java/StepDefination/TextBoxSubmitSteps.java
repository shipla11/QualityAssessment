package StepDefination;

import Pages.TestBoxSubmitPage;
import Utility.FunctionCaller;
import io.cucumber.java.en.When;

public class TextBoxSubmitSteps extends TestBoxSubmitPage {

    @When("user selects data from excel sheet {string} {int}")
    public void user_selects_data_from_excel_sheet(String string, Integer int1) {
        FunctionCaller.loadExcelParameter(string, int1);
    }

    @When("user cliks on Elements Application")
    public void user_cliks_on_elements_application() {
        clickOnElements();
    }
    @When("user enters {string}, {string}, {string} and {string}")
    public void user_enters_and(String string, String string2, String string3, String string4) {
        enterUserName(string);
        enteruserEmail(string2);
        entercurrentAddress(string3);
        enterpermanentAddress(string4);
    }
    @When("user clicks on Submit button")
    public void user_clicks_on_submit_button() {
        clickOnSubmit();
    }


    @When("user cliks on Text Box")
    public void user_cliks_on_text_box() {
        clickOnTextBox();
    }

}
