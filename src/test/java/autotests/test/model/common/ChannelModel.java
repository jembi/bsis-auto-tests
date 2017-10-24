package autotests.test.model.common;

import autotests.test.helpers.DriverFunctions;
import autotests.test.step_definitions.Hooks;
import org.openqa.selenium.By;

import java.util.Date;

public class ChannelModel {

    public void clickAddChannel() {

        DriverFunctions.waitForElement(Hooks.driver, By.xpath("//*[@id='body']/div/div/div[2]/div/div[2]/button"));
        Hooks.driver.findElement(By.xpath("//*[@id='body']/div/div/div[2]/div/div[2]/button")).click();
    }

    public void addChannelName(String channelName) {
        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-model*='channel.name']"));
        String uniqueName = channelName + new Date().toString();
        Hooks.driver.findElement(By.cssSelector("[ng-model*='channel.name']")).sendKeys(uniqueName);
    }

    public void addChannelDescription(String channelDescrption) {
        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-model*='channel.description']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='channel.description']")).sendKeys(channelDescrption);
    }

    //Requests
    public void selectRequestMatchTab() {
        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-controller*='channelRequestMatchingCtrl']"));
        Hooks.driver.findElement(By.cssSelector("[ng-controller*='channelRequestMatchingCtrl']")).click();
    }

    public void addPatternURL(String patternUrl) {
        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-model*='channel.urlPattern']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='channel.urlPattern']")).sendKeys(patternUrl);
    }

    public void addRequestMatchClient(String requestClient) {

        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-model*='allowedRoles']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='allowedRoles']")).sendKeys(requestClient);

        //  DriverFunctions.waitForElement(Hooks.driver,By.className("ng-scope ng-binding"));
        // Hooks.driver.findElement(By.className("ng-scope ng-binding")).click();

    }


    //Routes
    public void selectRoutesTab() {
        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-controller*='channelRoutesCtrl']"));
        Hooks.driver.findElement(By.cssSelector("[ng-controller*='channelRoutesCtrl']")).click();
    }

    public void addRoutButton() {
        // DriverFunctions.waitForElement(Hooks.driver,By.cssSelector("[ng-click*='addEditRoute('new', null, null)']"));
        //  Hooks.driver.findElement(By.cssSelector("[ng-click*='addEditRoute('new', null, null)']"));

        DriverFunctions.clickElementTypeWithText(Hooks.driver, "button", "Add New Route");
    }

    public void addRouteName(String routeName) {

        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-model*='newRoute.name']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='newRoute.name']")).sendKeys(routeName);
    }

    public void addRouteHost(String hostName) {
        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-model*='newRoute.host']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='newRoute.host']")).sendKeys(hostName);
    }

    public void addRoutePort(String portName) {
        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-model*='newRoute.port']"));
        Hooks.driver.findElement(By.cssSelector("[ng-model*='newRoute.port']")).sendKeys(portName);
    }

    public void saveChannel() {
        DriverFunctions.waitForElement(Hooks.driver, By.cssSelector("[ng-click*='submitFormChannels()']"));
        Hooks.driver.findElement(By.cssSelector("[ng-click*='submitFormChannels()']")).click();
    }


}
