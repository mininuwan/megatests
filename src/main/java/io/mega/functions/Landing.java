package io.mega.functions;

import io.mega.pages.LandingPage;

public class Landing {
    public static LandingPage landingPage = new LandingPage();

    public static boolean isLandingPageBannerDisplayed(){
        return landingPage.isLandingPageBannerDisplayed();
    }

    public static void loginToApplication(){
        landingPage.loginToApplication();
    }

    public static void onlyEnterUserCredentials(){
        landingPage.onlyEnterUserCredentials();
    }

    public static void submitUserCredentials(){
        landingPage.submitUserCredentials();
    }

}
