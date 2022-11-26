package io.mega.pages;

import io.mega.ui.BaseAutomationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static io.mega.functions.Common.wait_MiliSec;

public class HomePage extends BaseAutomationPage {
    // private static By loginBtn = By.xpath("");
    private static By btnBinMenu = By.xpath("(//button[normalize-space()='Rubbish bin'])[1]");
    private static String xPathFileName = "(//span[text()='a.txt']) [1]";
    private static By savedFile = By.xpath(xPathFileName);
    private static String xRubbishFileName = "//span[text()='a.txt']";
    private static By deletedFile = By.xpath(xRubbishFileName);
    private static By moveToBin = By.xpath("//a[@class='dropdown-item remove-item']");
    private static By btnMoveToBinYes = By.xpath("(//button[@class='mega-button positive confirm']) [1]");
    private static By optRestore = By.xpath("//a[@class='dropdown-item revert-item']");
    private static By restoredFile = By.xpath(xPathFileName);

    private static By rightClickBody = By.xpath("//div[@class='megaList-content']");
    private static By optNewFile = By.xpath("//span[text()='New text file']");
    private static By inputNewFileName = By.xpath("//input[@name='dialog-new-file']");
    private static By btnCreate = By.xpath("//button[@class='mega-button positive fm-dialog-new-file-button create-file']");

    private static By btnSave = By.xpath("//button[@class='mega-button positive gradient save-btn']");
    private static By btnCloseTextArea = By.xpath("(//button[@class='close-btn']) [2]");

    public boolean isBtnBinMenuDisplayed(){
        return getDriver().findElement(btnBinMenu).isDisplayed();
    }

    public boolean isTextFileDisplayedInHome(){
        return getDriver().findElement(savedFile).isDisplayed();
    }

    public void deleteTextFile(){
        Actions actions = new Actions(getDriver());
        actions.contextClick(getDriver().findElement(savedFile)).perform();
        wait_MiliSec(5000);
        if(getDriver().findElement(moveToBin).isDisplayed()){
            getDriver().findElement(moveToBin).click();
            wait_MiliSec(5000);

            getDriver().findElement(btnMoveToBinYes).click();
            wait_MiliSec(10000);
        }
    }

    public void navigateToRubbishBin(){
        getDriver().findElement(btnBinMenu).click();
        wait_MiliSec(10000);
    }

    public boolean isTextFileDisplayedInRubbishBin(){
        return getDriver().findElement(deletedFile).isDisplayed();
    }

    public void restoreTheDeletedFile(){
        Actions actions = new Actions(getDriver());
        actions.contextClick(getDriver().findElement(deletedFile)).perform();
        wait_MiliSec(5000);

        if(getDriver().findElement(optRestore).isDisplayed()){
            getDriver().findElement(optRestore).click();
            wait_MiliSec(10000);
        }
    }

    public boolean isRestoredFileDisplayedInHome(){
        return getDriver().findElement(restoredFile).isDisplayed();
    }

    public void CreatesANewTextFile(){
        Actions actions = new Actions(getDriver());
        actions.contextClick(getDriver().findElement(rightClickBody)).perform();
        wait_MiliSec(5000);
        if(getDriver().findElement(optNewFile).isDisplayed()){
            getDriver().findElement(optNewFile).click();
            wait_MiliSec(5000);

            String fileName = "a";
            getDriver().findElement(inputNewFileName).sendKeys(fileName);
            wait_MiliSec(3000);

            getDriver().findElement(btnCreate).click();
            wait_MiliSec(10000);
        }
    }

    public void addFileContent(){
        String txtBodyContent = "megatesting";
        new Actions(getDriver()).sendKeys(txtBodyContent).perform();
        wait_MiliSec(5000);
    }

    public void saveAndCloseNewFile(){
        getDriver().findElement(btnSave).click();
        wait_MiliSec(10000);

        getDriver().findElement(btnCloseTextArea).click();
        wait_MiliSec(10000);
    }

}
