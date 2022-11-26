package io.mega.functions;

import io.mega.pages.LinuxLandingPage;

public class LinuxLanding {
    public static LinuxLandingPage linuxLandingPage = new LinuxLandingPage();

    public static void navigateToLinuxTab(){
        linuxLandingPage.navigateToLinuxTab();
    }

    public static void expandOptionList(){
        linuxLandingPage.expandOptionList();
    }

    public static String selectAnOS(String osName){
        return linuxLandingPage.selectAnOS(osName);
    }

    public static boolean isOSDownloadedToHardDisk(String downloadedFileName){
        return linuxLandingPage.isOSDownloadedToHardDisk(downloadedFileName);
    }
}
