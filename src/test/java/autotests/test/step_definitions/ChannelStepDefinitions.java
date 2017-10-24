package autotests.test.step_definitions;

import autotests.test.helpers.AdditionalConditions;
import autotests.test.model.common.ChannelModel;
import autotests.test.model.common.ClientModel;
import autotests.test.pageobjects.ChannelPageObject;
import autotests.test.pageobjects.ClientPageObject;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class ChannelStepDefinitions {
    private ChannelModel channelModel = new ChannelModel();
    @Then("^I click on the channels menu$")
    public void i_click_on_the_channels_menu() throws Throwable {
        PageFactory.initElements(Hooks.driver, ChannelPageObject.class);
        AdditionalConditions.waitOnAngular(Hooks.driver);
        Hooks.driver.navigate().to("http://192.168.0.253:9000/#/channels");
        AdditionalConditions.waitOnAngular(Hooks.driver);
    }
    @Then("^I click on Add Channel$")
    public void i_click_on_Add_Channel() throws Throwable {
        channelModel.clickAddChannel();

    }


    @Then("^I add basic info$")
    public void i_add_basic_info(DataTable dataTable) throws Throwable {
        String channelName = dataTable.asMaps(String.class, String.class).get(0).get("channelName");
        String channelDescription = dataTable.asMaps(String.class, String.class).get(0).get("channelDescription");

        channelModel.addChannelName(channelName);
        channelModel.addChannelDescription(channelDescription);
    }

    @Then("^I add Request Info$")public void i_add_Request_Info(DataTable dataTable) throws Throwable {
       //  | urlPath   | addRequestMatchClient |
        channelModel.selectRequestMatchTab();
        String urlPath = dataTable.asMaps(String.class, String.class).get(0).get("urlPath");
        String addRequestMatchClient = dataTable.asMaps(String.class, String.class).get(0).get("addRequestMatchClient");

        channelModel.addPatternURL(urlPath);
        channelModel.addRequestMatchClient(addRequestMatchClient);

    }

    @Then("^I add Roue info$")
    public void i_add_Roue_info(DataTable dataTable) throws Throwable {


        String routName = dataTable.asMaps(String.class, String.class).get(0).get("routName");
        String hostAddress = dataTable.asMaps(String.class, String.class).get(0).get("hostAddress");
        String hostPort = dataTable.asMaps(String.class, String.class).get(0).get("hostPort");
        channelModel.selectRoutesTab();
        channelModel.addRoutButton();
        channelModel.addRouteName(routName);
        channelModel.addRouteHost(hostAddress);
        channelModel.addRoutePort(hostPort);



    }

    @Then("^I save the channel$")
    public void i_save_the_channel() throws Throwable {

channelModel.saveChannel();
    }
}
