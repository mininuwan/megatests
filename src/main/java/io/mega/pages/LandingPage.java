package io.mega.pages;

import io.mega.ui.BaseAutomationPage;
import org.openqa.selenium.By;

import static io.mega.functions.Common.wait_MiliSec;

public class LandingPage extends BaseAutomationPage {
    // private static By loginBtn = By.xpath("");
    private static By landingPageBanner = By.xpath("//div[@class='startpage top-header top-to-bott anim']");
    private static By loginBtn = By.xpath("(//button[@class='mega-button top-login-button'])[1]");
    private static By inputLoginName = By.xpath("//input[@name='login-name2']");
    private static By inputLoginPassword = By.xpath("//input[@name='login-password2']");
    private static By btnLogin = By.xpath("//button[@class='mega-button positive login-button large right']");

    public boolean isLandingPageBannerDisplayed(){
        return getDriver().findElement(landingPageBanner).isDisplayed();
    }

    public void loginToApplication(){
        getDriver().findElement(loginBtn).click();
        wait_MiliSec(10000);
        getDriver().findElement(inputLoginName).sendKeys("mininuwan@gmail.com");
        getDriver().findElement(inputLoginPassword).sendKeys("Qwer1234@a1");
        getDriver().findElement(btnLogin).click();
        wait_MiliSec(10000);
    }

    public void onlyEnterUserCredentials(){
        getDriver().findElement(loginBtn).click();
        wait_MiliSec(10000);
        getDriver().findElement(inputLoginName).sendKeys("mininuwan@gmail.com");
        getDriver().findElement(inputLoginPassword).sendKeys("Qwer1234@a1");
    }

    public void submitUserCredentials(){
        getDriver().findElement(btnLogin).click();
        wait_MiliSec(10000);
    }
}
