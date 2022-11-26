package io.mega.steps.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.mega.common.Constants;
import io.mega.functions.Home;
import io.mega.functions.Landing;
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

        Assertions.assertTrue(Landing.isLandingPageBannerDisplayed());
    }

    @When("The user enters username and password")
    public void theUserEntersUsernameAndPassword() {
        Landing.onlyEnterUserCredentials();
    }

    @And("The user clicks the login button")
    public void theUserClicksTheLoginButton() {
        Landing.submitUserCredentials();
    }

    @Then("The user navigated to the home page")
    public void theUserNavigatedToTheHomePage() {
        Assertions.assertTrue(Home.isBtnBinMenuDisplayed());
    }

    @Then("The user creates a new text file")
    public void theUserCreatesANewTextFile() {
        Home.CreatesANewTextFile();
    }

    @Then("Enters the content megatesting")
    public void entersTheContentMegatesting() {
        Home.addFileContent();
    }

    @Then("Saves the new text file")
    public void savesTheNewTextFile() {
        Home.saveAndCloseNewFile();
    }

    @Then("Verify a.txt is created")
    public void verifyATxtIsCreated() {
        Assertions.assertTrue(Home.isTextFileDisplayedInHome());
    }


    @Given("The user is already logged in")
    public void theUserIsAlreadyLoggedIn() {
        wait_MiliSec(4000);
        getDriver().get(Constants.ASSIGNMENT_ONE_LANDING_PAGE);
        wait_MiliSec(10000);

        Assertions.assertTrue(Landing.isLandingPageBannerDisplayed());
        Landing.loginToApplication();
        Assertions.assertTrue(Home.isBtnBinMenuDisplayed());
    }

    @When("The user finds the text file")
    public void theUserFindsTheTextFile() {
        Assertions.assertTrue(Home.isTextFileDisplayedInHome());
    }

    @And("The user delets the text file")
    public void theUserDeletsTheTextFile() {
        Home.deleteTextFile();
    }

    @Then("Verify deleted file moves to the Rubbish Bin")
    public void verifyDeletedFileMovesToTheRubbishBin() {
        Home.navigateToRubbishBin();
        Assertions.assertTrue(Home.isTextFileDisplayedInRubbishBin());
    }

    @Given("The user is on Rubbish Bin")
    public void theUserIsOnRubbishBin() {
        wait_MiliSec(4000);
        getDriver().get(Constants.ASSIGNMENT_ONE_LANDING_PAGE);
        wait_MiliSec(10000);

        Assertions.assertTrue(Landing.isLandingPageBannerDisplayed());
        Landing.loginToApplication();
        Assertions.assertTrue(Home.isBtnBinMenuDisplayed());
        Home.navigateToRubbishBin();
    }

    @When("The user finds the text file in Rubbish Bin")
    public void theUserFindsTheTextFileInRubbishBin() {
        Assertions.assertTrue(Home.isTextFileDisplayedInRubbishBin());
    }

    @And("The user can restore the text file")
    public void theUserCanRestoreTheTextFile() {
        Home.restoreTheDeletedFile();
    }

    @Then("Verify the file is restored to File Manager")
    public void verifyTheFileIsRestoredToFileManager() {
        Assertions.assertTrue(Home.isRestoredFileDisplayedInHome());
    }
}
