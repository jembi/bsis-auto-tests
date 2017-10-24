package autotests.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClientPageObject extends BasePage {
    public ClientPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using ="//a[@href='#/clients']")
    public static WebElement clientMenu;


    @FindBy(how = How.XPATH, using = "//*[@id='body']/div/div/div[2]/div/div[4]/button")
    public static WebElement addClientButton;

    @FindBy(how = How.XPATH, using = "//*[@id='body]/div/div/div[2]/div/div[2]/div/button")
    public static WebElement addRoleButton;

    @FindBy(how = How.XPATH, using = "//button[@ng-click='submitFormClients()']")
    public static WebElement saveClientPage;

    @FindBy(how = How.XPATH, using = "//*[@id='no-more-tables']/table/tbody/tr[1]/td[10]/button[1]")
    public static WebElement editClientButton;


    //driver.findElement(By.cssSelector("[ng-model*='TransationModeId']"));
    public static WebElement SaveClientPage()
    {
        //button[contains(@ng-click,'sendForApproval')]
        return driver.findElement(By.linkText(" Clients"));
        //input[@ng-model='loginPassword']
        //button[@ng-click='Save changes']
    }


    public static WebElement clientMenuItem()
    {
        //return driver.findElement(By.xpath("//a[@href='#/clients']"));
        return driver.findElement(By.linkText(" Clients"));
       // return driver.findElement(By.cssSelector("a[href*='#/clients']"));
    }
}
