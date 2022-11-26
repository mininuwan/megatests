package io.mega.steps.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.mega.common.Constants;
import io.mega.functions.LinuxLanding;
import io.mega.ui.BaseAutomationPage;
import org.junit.jupiter.api.Assertions;
import static io.mega.functions.Common.wait_MiliSec;

public class MegaAssignmentTwoSteps extends BaseAutomationPage {
    String downloadedFileName = "";
    @Given("The user is on linux landing page")
    public void theUserIsOnLinuxLandingPage() {
        wait_MiliSec(4000);
        getDriver().get(Constants.ASSIGNMENT_TWO_LANDING_PAGE);
        wait_MiliSec(5000);
        LinuxLanding.navigateToLinuxTab();
        LinuxLanding.expandOptionList();
    }
    @When("The user selects Arch Linux and download")
    public void theUserSelectsArchLinuxAndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Arch Linux");
    }

    @Then("Verify the OS is downloaded")
    public void verifyTheOSIsDownloaded() {
        Assertions.assertTrue(LinuxLanding.isOSDownloadedToHardDisk(downloadedFileName));
    }

    @When("The user selects CentOS7 and download")
    public void theUserSelectsCentOS7AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("CentOS 7");
    }

    @When("The user selects CentOS 8 and download")
    public void theUserSelectsCentOS8AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("CentOS 8");
    }

    @When("The user selects Debian 9 and download")
    public void theUserSelectsDebian9AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Debian 9");
    }

    @When("The user selects Debian 10 and download")
    public void theUserSelectsDebian10AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Debian 10");
    }

    @When("The user selects Debian 11 and download")
    public void theUserSelectsDebian11AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Debian 11");
    }

    @When("The user selects Debian Testing and download")
    public void theUserSelectsDebianTestingAndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Debian Testing");
    }

    @When("The user selects elementary OS Juno and download")
    public void theUserSelectsElementaryOSJunoAndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("elementary OS Juno");
    }

    @When("The user selects Fedora 33 and download")
    public void theUserSelectsFedora33AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Fedora 33");
    }

    @When("The user selects Fedora 34 and download")
    public void theUserSelectsFedora34AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Fedora 34");
    }

    @When("The user selects Fedora 35 and download")
    public void theUserSelectsFedora35AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Fedora 35");
    }

    @When("The user selects Fedora 36 and download")
    public void theUserSelectsFedora36AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Fedora 36");
    }

    @When("The user selects Fedora 37 and download")
    public void theUserSelectsFedora37AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Fedora 37");
    }

    @When("The user selects Mint 19 and download")
    public void theUserSelectsMint19AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Mint 19");
    }
    @When("The user selects Mint 20 and download")
    public void theUserSelectsMint20AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Mint 20");
    }
    @When("The user selects Mint 21 and download")
    public void theUserSelectsMint21AndDownload() {
        downloadedFileName = LinuxLanding.selectAnOS("Mint 21");
    }

    @When("The user selects openSUSE Leap 15 and download")
    public void theUserSelectsAndDownload_openSUSELeap15() {
        downloadedFileName = LinuxLanding.selectAnOS("openSUSE Leap 15");
    }

    @When("The user selects openSUSE Leap 15.3 and download")
    public void theUserSelectsAndDownload_openSUSELeap153() {
        downloadedFileName = LinuxLanding.selectAnOS("openSUSE Leap 15.3");
    }

    @When("The user selects openSUSE Leap 15.4 and download")
    public void theUserSelectsAndDownload_openSUSELeap154() {
        downloadedFileName = LinuxLanding.selectAnOS("openSUSE Leap 15.4");
    }

    @When("The user selects openSUSE Tumbleweed and download")
    public void theUserSelectsAndDownload_openSUSETumbleweed() {
        downloadedFileName = LinuxLanding.selectAnOS("openSUSE Tumbleweed");
    }

    @When("The user selects Raspbian 10 Buster and download")
    public void theUserSelectsAndDownload_Raspbian10() {
        downloadedFileName = LinuxLanding.selectAnOS("Raspbian 10 (Buster)");
    }

    @When("The user selects Raspbian 9 Stretch and download")
    public void theUserSelectsAndDownload_Raspbian9() {
        downloadedFileName = LinuxLanding.selectAnOS("Raspbian 9 (Stretch)");
    }

    @When("The user selects Red Hat 7 and download")
    public void theUserSelectsAndDownload_RedHat7() {
        downloadedFileName = LinuxLanding.selectAnOS("Red Hat 7");
    }

    @When("The user selects Red Hat 8 and download")
    public void theUserSelectsAndDownload_RedHat8() {
        downloadedFileName = LinuxLanding.selectAnOS("Red Hat 8");
    }

    @When("The user selects Ubuntu 18.04 and download")
    public void theUserSelectsAndDownload_Ubuntu1804() {
        downloadedFileName = LinuxLanding.selectAnOS("Ubuntu 18.04");
    }

    @When("The user selects Ubuntu 20.04 and download")
    public void theUserSelectsAndDownload_Ubuntu2004() {
        downloadedFileName = LinuxLanding.selectAnOS("Ubuntu 20.04");
    }

    @When("The user selects Ubuntu 21.04 and download")
    public void theUserSelectsAndDownload_Ubuntu2104() {
        downloadedFileName = LinuxLanding.selectAnOS("Ubuntu 21.04");
    }

    @When("The user selects Ubuntu 21.10 and download")
    public void theUserSelectsAndDownload_Ubuntu2110() {
        downloadedFileName = LinuxLanding.selectAnOS("Ubuntu 21.10");
    }

    @When("The user selects Ubuntu 22.04 and download")
    public void theUserSelectsAndDownload_Ubuntu2204() {
        downloadedFileName = LinuxLanding.selectAnOS("Ubuntu 22.04");
    }

    @When("The user selects Ubuntu 22.10 and download")
    public void theUserSelectsAndDownload_Ubuntu2210() {
        downloadedFileName = LinuxLanding.selectAnOS("Ubuntu 22.10");
    }
}
