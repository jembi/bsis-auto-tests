package autotests.test.model.common;

import autotests.test.helpers.AdditionalConditions;
import autotests.test.helpers.DriverFunctions;
import autotests.test.pageobjects.AddUserPageObject;
import autotests.test.pageobjects.ClientPageObject;
import autotests.test.step_definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;

public class AddUserModel {

    public void navigateToUsersTab()
    {

        AdditionalConditions.waitOnAngular(Hooks.driver);
        PageFactory.initElements(Hooks.driver, AddUserPageObject.class);
        AdditionalConditions.waitOnAngular(Hooks.driver);
        Hooks.driver.navigate().to("http://192.168.0.253:9000/#/users");
        AdditionalConditions.waitOnAngular(Hooks.driver);
       // DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-model*='client.clientID']"));

    }
}
