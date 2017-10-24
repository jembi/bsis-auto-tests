package autotests.test.model.common;

import autotests.test.helpers.DriverFunctions;
import autotests.test.pageobjects.AdminLoginPageObject;
import autotests.test.step_definitions.Hooks;
import org.openqa.selenium.By;

import static autotests.test.step_definitions.Hooks.driver;

public class AdminLoginModel {
   // public AdminLoginPageObject adminLoginObj;

    public void enterUsername(String Text) {
        //  AdminLoginPageObject.usernameField.sendKeys(Text);


       //AdminLoginPageObject.getUsernameField().sendKeys(Text);
       //input[@ng-model='loginEmail']") );
        DriverFunctions.waitForElement(Hooks.driver,By.xpath("//input[@ng-model='loginEmail']") );
        AdminLoginPageObject.usernameField.sendKeys(Text);
     }

    public void enterPassword(String Text) {
        DriverFunctions.waitForElement(Hooks.driver,By.xpath("//input[@ng-model='loginPassword']") );
        AdminLoginPageObject.passwordField.sendKeys(Text);
    }

    public void clickLogin() {
        AdminLoginPageObject.loginButton.click();
    }

    public void clickProfile()
    {
        DriverFunctions.waitForElement(Hooks.driver,By.xpath("//*[@id='header']/div/div/div/div[2]/div[1]/div/nav/ul/li/a") );
        AdminLoginPageObject.profileAccount.click();
    }

    public void clickLogout()
    {
        //DriverFunctions.waitForElement(Hooks.driver,By.xpath("//input[@ng-model='loginPassword']") );
        AdminLoginPageObject.logoutButton.click();
    }

    public void checkCurrentURl()
    {
        System.out.println(driver.getCurrentUrl());
    }

}
