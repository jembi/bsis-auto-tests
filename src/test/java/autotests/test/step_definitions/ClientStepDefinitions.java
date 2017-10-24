package autotests.test.step_definitions;

import autotests.test.helpers.AdditionalConditions;
import autotests.test.model.common.ClientModel;
import autotests.test.model.common.CommonModel;
import autotests.test.pageobjects.ClientPageObject;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class ClientStepDefinitions {
    private CommonModel commonModel = new CommonModel();
    private ClientModel clientModel = new ClientModel();

    @Then("^I click on the clients menu$")
    public void i_click_on_the_clients_menu() throws Throwable {
        AdditionalConditions.waitOnAngular(Hooks.driver);
        PageFactory.initElements(Hooks.driver, ClientPageObject.class);
        AdditionalConditions.waitOnAngular(Hooks.driver);
        Hooks.driver.navigate().to("http://192.168.0.253:9000/#/clients");
        AdditionalConditions.waitOnAngular(Hooks.driver);
    }

    @Then("^and a client name$")
    public void and_a_client_name(DataTable dataTable) throws Throwable {
        PageFactory.initElements(Hooks.driver, ClientPageObject.class);
        AdditionalConditions.waitOnAngular(Hooks.driver);
        clientModel.selectClient();

        //Add Details for the Client
        String clientID = dataTable.asMaps(String.class, String.class).get(0).get("clientName");
        String clientName = dataTable.asMaps(String.class, String.class).get(0).get("clientName");
        String clientOrganisation = dataTable.asMaps(String.class, String.class).get(0).get("clientOrganisation");
        String roleName = dataTable.asMaps(String.class, String.class).get(0).get("roleName");
        String authPass = dataTable.asMaps(String.class, String.class).get(0).get("authPass");
        String authPassConf = dataTable.asMaps(String.class, String.class).get(0).get("authPassConf");

        //Insert details into model
        clientModel.addClientID(clientID);
        clientModel.addClientName(clientName);
        clientModel.addclientOrganisation(clientOrganisation);
        clientModel.addroleName(roleName);
        clientModel.addauthPass(authPass);
        clientModel.addauthPassConf(authPassConf);



    }

    @Then("^save the client$")
    public void save_the_client() throws Throwable {
        AdditionalConditions.waitOnAngular(Hooks.driver);
        clientModel.saveClientPage();
    }

    //Editing the client
    @Then("^click on a client row$")
    public void click_on_a_client_row() throws Throwable {
            clientModel.clickEditClientRow();

    }

    @Then("^I edit the Client Details$")
    public void i_edit_the_Client_Details(DataTable dataTable) throws Throwable {
        PageFactory.initElements(Hooks.driver, ClientPageObject.class);
        AdditionalConditions.waitOnAngular(Hooks.driver);


        //Add Details for the Client

        String clientName = dataTable.asMaps(String.class, String.class).get(0).get("clientName");
        String clientOrganisation = dataTable.asMaps(String.class, String.class).get(0).get("clientOrganisation");
        String softwareName = dataTable.asMaps(String.class, String.class).get(0).get("softwareName");
        String Description = dataTable.asMaps(String.class, String.class).get(0).get("Description");
        String Location = dataTable.asMaps(String.class, String.class).get(0).get("Location");
        String contactPerson = dataTable.asMaps(String.class, String.class).get(0).get("contactPerson");
        //Insert details into model

        clientModel.addClientName(clientName);
        clientModel.addclientOrganisation(clientOrganisation);
        clientModel.addsoftwareName(softwareName);
        clientModel.addDescription(Description);
        clientModel.addLocation (Location );
        clientModel.addcontactPerson(contactPerson);


    }

    @Then("^and a Role name$")
    public void and_a_Role_name() throws Throwable {
        PageFactory.initElements(Hooks.driver, ClientPageObject.class);
        AdditionalConditions.waitOnAngular(Hooks.driver);
        clientModel.selectRole();
    }

    @Then("^save the Role$")
    public void save_the_Role() throws Throwable {

    }



}
