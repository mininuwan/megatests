package io.mega.functions;

import io.mega.pages.HomePage;

public class Home {
    public static HomePage homePage = new HomePage();

    public static boolean isBtnBinMenuDisplayed(){
        return homePage.isBtnBinMenuDisplayed();
    }

    public static boolean isTextFileDisplayedInHome(){
        return homePage.isTextFileDisplayedInHome();
    }

    public static void deleteTextFile(){
        homePage.deleteTextFile();
    }

    public static void navigateToRubbishBin(){
        homePage.navigateToRubbishBin();
    }

    public static boolean isTextFileDisplayedInRubbishBin(){
        return homePage.isTextFileDisplayedInRubbishBin();
    }
}