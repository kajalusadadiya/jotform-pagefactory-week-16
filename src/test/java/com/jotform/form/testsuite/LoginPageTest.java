package com.jotform.form.testsuite;

import com.jotform.form.pages.HomePage;
import com.jotform.form.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
    }

    @Test

    public void fillDetailsOnTestForm() throws InterruptedException {
        homePage.clickOnStartNextBtn();
        homePage.enterFirstName("Bablo");
        homePage.enterLastName("Bebli");
        homePage.clickOnFirstNameNextBtn();

        homePage.uploadFile("C:\\\\Users\\\\Kajal Usadadiya\\\\Desktop\\\\StudySchedule.xisx");
        homePage.clickOnBrowseFileNextBtn();

        homePage.dragAndDropSignature();

        homePage.clickOnSignNextBtn();
        homePage.clickOnCalender();

        homePage.selectDate();
        homePage.clickOnDateNextBtb();
        homePage.selectMaidenName();

        homePage.sendYourAns("Babli's mum");

        homePage.clickOnSubmitBtn();
    }
}

