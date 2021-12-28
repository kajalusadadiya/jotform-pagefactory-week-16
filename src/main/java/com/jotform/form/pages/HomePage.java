package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);//create constructor
    }


    @FindBy(xpath = "//button[@id='jfCard-welcome-start']")
    WebElement nextButton;

    @FindBy(css = "#first_3")
    WebElement firstName;

    @FindBy(css = "#last_3")
    WebElement lastName;

    @FindBy(xpath = "//div[@data-type='control_fullname']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement firstnamenextbutton;

    @FindBy(xpath = "//label[normalize-space()='Browse Files']")
    WebElement browseBtn;

    @FindBy(xpath = "//div[@data-type='control_fileupload']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement browsNextBtn;
    @FindBy(xpath = "//canvas[@aria-label='E-Signature Field']")
    WebElement signaturepad;
    @FindBy(xpath = "//div[@data-type='control_signature']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement clickonSignatureNextBtn;
    @FindBy(xpath = "//span[@aria-label='Calendar icon']//*[name()='svg']")
    WebElement calender;
    @FindBy (xpath = "//input[@id='lite_mode_10']")
    WebElement dateBox;
    @FindBy(xpath = "//div[@data-type='control_datetime']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement clickOnDatePageNextBtn;

    @FindBy(xpath ="//span[@class='jfDropdown-toggle']" )
    WebElement selectMaidenName;
    @FindBy(xpath="/html[1]/body[1]/div[5]/form[1]/ul[1]/li[5]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/ul[1]/li[2]")
    WebElement yourAnswer;
    @FindBy(xpath="//button[@class='jfInput-button forSubmit form-submit-button u-right']")
    WebElement submitBtn;


    public void clickOnStartNextBtn() {
        clickOnElement(nextButton);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
    }

    public void clickOnFirstNameNextBtn() {
        clickOnElement(firstnamenextbutton);

    }

    public void uploadFile(String value) {
        sendTextToElement(browseBtn, value);
    }

    public void clickOnBrowseFileNextBtn() {
        clickOnElement(browsNextBtn);
    }

    public void dragAndDropSignature() {
        dragAndDrop(signaturepad);

    }

    public void clickOnSignNextBtn() {
        clickOnElement(clickonSignatureNextBtn);
    }

    public void clickOnCalender() {
        clickOnElement(calender);
    }
    public void selectDate(){
        sendTextToElement(dateBox,"2021-12-21");


    }
    public void clickOnDateNextBtb(){
        clickOnElement(clickOnDatePageNextBtn);
    }

    public void selectMaidenName(){
        clickOnElement(selectMaidenName);
    }
    public void sendYourAns(String text){
        sendTextToElement(yourAnswer,text);
    }
    public void clickOnSubmitBtn(){
        clickOnElement(submitBtn);
    }

}
