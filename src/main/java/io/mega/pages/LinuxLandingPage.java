package io.mega.pages;

import io.mega.ui.BaseAutomationPage;
import org.openqa.selenium.By;

import java.io.File;

import static io.mega.functions.Common.wait_MiliSec;
public class LinuxLandingPage extends BaseAutomationPage {
    // private static By loginBtn = By.xpath("");
    private static By linuxBtn = By.xpath("(//a[@data-os='linux'])[1]");
    private static By optOS = By.xpath("(//span[contains(text(),'Please select your Linux distribution')])[1]");

    private static By btnDownload = By.xpath("(//button[@class='mega-button positive transition megaapp-linux-download download'])[1]");

    public void navigateToLinuxTab(){
        getDriver().findElement(linuxBtn).click();
        wait_MiliSec(2000);
    }

    public void expandOptionList(){
        getDriver().findElement(optOS).click();
        wait_MiliSec(2000);
    }

    public String selectAnOS(String osName){
        String xPathOptionMenuOS = "//div[@data-client='" + osName + "']";
        By optMenuOS = By.xpath(xPathOptionMenuOS);

        if(getDriver().findElement(optMenuOS).isDisplayed()){
            String dataLink = getDriver().findElement(optMenuOS).getAttribute("data-link");
            String[] arrDataLink = dataLink.split("/");
            getDriver().findElement(optMenuOS).click();
            wait_MiliSec(3000);

            getDriver().findElement(btnDownload).click();
            wait_MiliSec(10000);
            return arrDataLink[arrDataLink.length-1];
        }
        else{
            return "file name not found";
        }
    }

    public boolean isOSDownloadedToHardDisk(String downloadedFileName){
        boolean isFileDownloaded = false;

        File dir = new File("/Users/charakaw/Downloads");
        File[] dir_contents = dir.listFiles();
        for (int i = 0; i < dir_contents.length; i++){
            //System.out.println(dir_contents[i].getName());

            if(dir_contents[i].getName().equals(downloadedFileName)){
                isFileDownloaded = true;
                break;
            }
            else {
                isFileDownloaded = false;
            }

            //data-client="elementary OS Juno"
            //data-link="https://mega.nz/linux/repo/xUbuntu_18.04/amd64/megasync-xUbuntu_18.04_amd64.deb"
        }
        return isFileDownloaded;
    }
}
