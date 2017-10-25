package autotests.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminLoginPageObject extends BasePage {

    public AdminLoginPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@ng-model='credentials.username']")
    public static WebElement usernameField;


    @FindBy(how = How.XPATH, using = "//input[@ng-model='credentials.password']")
    public static WebElement passwordField;


    @FindBy(how = How.XPATH, using = "//*[@id='wrap']/div/div[1]/form/button")
    public static WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div/div/div/div[2]/div[1]/div/nav/ul/li/a")
    public static WebElement profileAccount;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div/div/div/div[2]/div[1]/div/nav/ul/li/ul/li[3]/a")
    public static WebElement logoutButton;


}
