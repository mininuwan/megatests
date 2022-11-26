package io.mega.steps.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.mega.common.Constants;
import io.mega.ui.BaseAutomationPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static io.mega.functions.Common.wait_MiliSec;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MegaAssignmentOneSteps extends BaseAutomationPage {
    @Given("The user is on landing page")
    public void theUserIsOnLandingPage() {
        wait_MiliSec(4000);
        getDriver().get(Constants.ASSIGNMENT_ONE_LANDING_PAGE);
        wait_MiliSec(10000);

        WebElement landingPageBanner = getDriver().findElement(By.xpath("//div[@class='startpage top-header top-to-bott anim']"));
        Assertions.assertTrue(landingPageBanner.isDisplayed());
    }

    @When("The user enters username and password")
    public void theUserEntersUsernameAndPassword() {
        WebElement loginBtn = getDriver().findElement(By.xpath("(//button[@class='mega-button top-login-button'])[1]"));
        loginBtn.click();
        wait_MiliSec(5000);

        WebElement inputLoginName = getDriver().findElement(By.xpath("//input[@name='login-name2']"));
        WebElement inputLoginPassword = getDriver().findElement(By.xpath("//input[@name='login-password2']"));

        inputLoginName.sendKeys("mininuwan@gmail.com");
        inputLoginPassword.sendKeys("Qwer1234@a1");
    }

    @And("The user clicks the login button")
    public void theUserClicksTheLoginButton() {
        WebElement btnLogin = getDriver().findElement(By.xpath("//button[@class='mega-button positive login-button large right']"));
        btnLogin.click();
        wait_MiliSec(10000);
    }

    @Then("The user navigated to the home page")
    public void theUserNavigatedToTheHomePage() {
        WebElement btnBinMenu = getDriver().findElement(By.xpath("(//button[normalize-space()='Rubbish bin'])[1]"));
        Assertions.assertTrue(btnBinMenu.isDisplayed());
    }

    @Then("The user creates a new text file")
    public void theUserCreatesANewTextFile() {
        Actions actions = new Actions(getDriver());
        WebElement rightClickBody = getDriver().findElement(By.xpath("//div[@class='megaList-content']"));
        actions.contextClick(rightClickBody).perform();
        wait_MiliSec(5000);

        WebElement optNewFile = getDriver().findElement(By.xpath("//span[text()='New text file']"));
        if(optNewFile.isDisplayed()) {
            optNewFile.click();
            wait_MiliSec(3000);

            WebElement inputNewFileName = getDriver().findElement(By.xpath("//input[@name='dialog-new-file']"));
            String fileName = RandomStringUtils.randomAlphabetic(3);
            fileName = "a";
            inputNewFileName.sendKeys(fileName);
            wait_MiliSec(3000);

            WebElement btnCreate = getDriver().findElement(By.xpath("//button[@class='mega-button positive fm-dialog-new-file-button create-file']"));
            btnCreate.click();
            wait_MiliSec(10000);
        }
    }

    @Then("Enters the content megatesting")
    public void entersTheContentMegatesting() {
        String txtBodyContent = RandomStringUtils.randomAlphabetic(10);
        txtBodyContent = "megatesting";
        new Actions(getDriver()).sendKeys(txtBodyContent).perform();
        wait_MiliSec(5000);
    }

    @Then("Saves the new text file")
    public void savesTheNewTextFile() {
        WebElement btnSave = getDriver().findElement(By.xpath("//button[@class='mega-button positive gradient save-btn']"));
        btnSave.click();
        wait_MiliSec(10000);

        WebElement btnCloseTextArea = getDriver().findElement(By.xpath("(//button[@class='close-btn']) [2]"));
        btnCloseTextArea.click();
        wait_MiliSec(10000);
    }

    @Then("Verify a.txt is created")
    public void verifyATxtIsCreated() {
        String xPathFileName = "(//span[text()='a.txt']) [1]";
        //span[text()='OHZ.txt']
        //span[@class='data-block-bg ']
        WebElement savedFile = getDriver().findElement(By.xpath(xPathFileName));
        Assertions.assertTrue(savedFile.isDisplayed());
        wait_MiliSec(3000);
    }
}