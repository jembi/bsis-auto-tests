package autotests.test.step_definitions;

import autotests.test.helpers.AdditionalConditions;
import autotests.test.pageobjects.ChannelPageObject;
import autotests.test.pageobjects.VisualizerPageObject;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class VisualizerStepDefinitions {

    @Then("^I click on the visualizers menu$")
    public void i_click_on_the_visualizers_menu() throws Throwable {
        PageFactory.initElements(Hooks.driver, VisualizerPageObject.class);
        AdditionalConditions.waitOnAngular(Hooks.driver);
        Hooks.driver.navigate().to("http://192.168.0.253:9000/#/visualizer");
        AdditionalConditions.waitOnAngular(Hooks.driver);
    }
    @Then("^I click on Add a Visualizer$")
    public void i_click_on_Add_a_Visualizer() throws Throwable {

    }

    @Then("^I add Visualizer details$")
    public void i_add_Visualizer_details(DataTable dataTable) throws Throwable {

    }

    @Then("^I save the Visualizer$")
    public void i_save_the_Visualizer() throws Throwable {

    }
}
