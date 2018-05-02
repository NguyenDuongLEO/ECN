package core.pageobject.fs28;

import core.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProtectedFormLogin extends BasePage {
    final WebDriver driver;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement inputPassword;
    @FindBy(xpath = "//input[@name='Submit']")
    public WebElement submitLogin;
    @FindBy(xpath = "//h1")
    public WebElement headerOfLeadCaptureForm;

    public ProtectedFormLogin(WebDriver driver){
        this.driver = driver;
    }

    public void checkingLoginSuccessfully(){
        if(headerOfLeadCaptureForm.getText().trim().toLowerCase().equals("lead capture form")){
            System.out.println("======================");
            System.out.println("Test Script 01 is PASSED! Login successfully");
            System.out.println("======================");
        }
        else {
            System.out.println("======================");
            System.out.println("Test Script 01 is FAILED! Login unsuccessfully");
            System.out.println("======================");
        }
    }
}
