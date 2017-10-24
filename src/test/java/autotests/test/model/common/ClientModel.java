package autotests.test.model.common;

import autotests.test.helpers.AdditionalConditions;
import autotests.test.helpers.DriverFunctions;
import autotests.test.pageobjects.ClientPageObject;
import autotests.test.step_definitions.Hooks;
import org.openqa.selenium.By;

import java.util.Date;

import static autotests.test.pageobjects.ClientPageObject.*;

public class ClientModel {

    public void selectClientMenu()
    {  AdditionalConditions.waitOnAngular(Hooks.driver);
       ClientPageObject.clientMenuItem().click();
    }
    public void selectRole(){
        AdditionalConditions.waitOnAngular(Hooks.driver);
        DriverFunctions.waitForElement(Hooks.driver,By.xpath("//*[@id='body]/div/div/div[2]/div/div[2]/div/button"));
        addRoleButton.click();
    }
    public void selectClient(){
        AdditionalConditions.waitOnAngular(Hooks.driver);
        DriverFunctions.waitForElement(Hooks.driver,By.xpath("//*[@id='body']/div/div/div[2]/div/div[4]/button"));
        addClientButton.click();
    }
    public void saveClientPage(){
        DriverFunctions.waitForElement(Hooks.driver,By.xpath("//button[@ng-click='submitFormClients()']"));
        saveClientPage.click();
    }

    //Client Details
    public void addClientID(String clientID){
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='client.clientID']"));
        String uniqueclientID = clientID + new Date().toString();

        Hooks.driver.findElement(By.cssSelector("[ng-model*='client.clientID']")).sendKeys(uniqueclientID);
    }
    public void addClientName(String clientID){
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='client.name']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='client.name']")).sendKeys(clientID);
    }
    public void addclientOrganisation(String clientID){
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='client.organization']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='client.organization']")).sendKeys(clientID);
    }
    public void addroleName(String clientID){
        String uniqueclientID = clientID + new Date().toString();
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='formData.newClientRole']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='formData.newClientRole']")).sendKeys(uniqueclientID);
    }
    public void addauthPass(String clientID){
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='temp.password']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='temp.password']")).sendKeys(clientID);
    }
    public void addauthPassConf(String clientID){
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='temp.passwordConfirm']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='temp.passwordConfirm']")).sendKeys(clientID);
    }

    //Edit details

    public void addsoftwareName(String softwareName)
    {
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='client.softwareName']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='client.softwareName']")).sendKeys(softwareName);
    }
    public void addDescription(String softwareName)
    {
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='client.description']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='client.description']")).sendKeys(softwareName);
    }
    public void addLocation (String softwareName)
    {
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='client.location']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='client.location']")).sendKeys(softwareName);
    }
    public void addcontactPerson(String softwareName)
    {
        DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-model*='client.contactPerson']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='client.contactPerson']")).sendKeys(softwareName);
    }

    public void clickEditClientRow()
    {

        DriverFunctions.waitForElement(Hooks.driver,By.xpath("//*[@id='no-more-tables']/table/tbody/tr[1]/td[10]/button[1]"));
        editClientButton.click();



      //  DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("button[ng-click='editClient(client)']"));
      //  Hooks.driver.findElement(By.cssSelector("button[ng-click='editClient(client)']")).click();
    }


    public void addClientName() {

    }

}
