package autotests.test.step_definitions;

import autotests.test.model.common.AddUserModel;
import cucumber.api.java.en.Then;

public class AddUserStepDefinitions {

    AddUserModel userModel = new AddUserModel();
    @Then("^I navigate to the users section$")
    public void i_navigate_to_the_users_section() throws Throwable {
        userModel.navigateToUsersTab();

    }

    @Then("^I click on Add a new User$")
    public void i_click_on_Add_a_new_User() throws Throwable {

    }

}
