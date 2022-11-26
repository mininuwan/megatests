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


}
