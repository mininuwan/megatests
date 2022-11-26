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

    public static void restoreTheDeletedFile(){
        homePage.restoreTheDeletedFile();
    }

    public static boolean isRestoredFileDisplayedInHome(){
        return homePage.isRestoredFileDisplayedInHome();
    }

    public static void CreatesANewTextFile(){
        homePage.CreatesANewTextFile();
    }

    public static void addFileContent(){
        homePage.addFileContent();
    }

    public static void saveAndCloseNewFile(){
        homePage.saveAndCloseNewFile();
    }
}
