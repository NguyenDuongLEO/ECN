package core.pageobject.fs28;

import core.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LeadCaptureForm extends BasePage {
    final WebDriver driver;

    @FindBy(xpath = "//input[@id='RESULT_TextField-1']")
    public WebElement inputFirstName;

    @FindBy(xpath = "//input[@id=\"RESULT_TextField-2\"]")
    public WebElement inputLastName;

    @FindBy(xpath = "//input[@id=\"RESULT_TextField-3\"]")
    public WebElement inputStreetAddress;

    @FindBy(xpath = "//input[@id='RESULT_TextField-4']")
    public WebElement inputAddressLine2;

    @FindBy(xpath = "//input[@id='RESULT_TextField-5']")
    public WebElement inputCity;

    @FindBy(xpath = "//select[@id='RESULT_RadioButton-6']")
    public WebElement clickSelectState;

    @FindBy(xpath = "//select[@id='RESULT_RadioButton-6']//*[contains(text(),'New York')]")
    public WebElement selectState;

    @FindBy(xpath = "//input[@id='RESULT_TextField-7']")
    public WebElement inputZipCode;

    @FindBy(xpath = "//input[@id='RESULT_TextField-8']")
    public WebElement inputPhoneNumber;

    @FindBy(xpath = "//input[@id='RESULT_TextField-9']")
    public WebElement inputEmailAddress;

    @FindBy(xpath = "//input[@id='RESULT_TextField-10']")
    public WebElement inputDateOfDemo;

    @FindBy(xpath = "//input[@id='FSsubmit']")
    public WebElement submitLeadForm;

    public LeadCaptureForm(WebDriver driver){
        this.driver = driver;
    }

    public void checkingSubmitSuccessfully(){
        if(driver.getTitle().trim().toLowerCase().equals("thank you!")) {
            System.out.println("======================");
            System.out.println("Test Script 02 is PASS! Submit the form successfully");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Script 02 is FAILED! Submit the form unsuccessfully");
            System.out.println("======================");
        }
    }
}
