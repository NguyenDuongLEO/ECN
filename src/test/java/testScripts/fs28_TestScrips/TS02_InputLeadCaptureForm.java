package testScripts.fs28_TestScrips;

import data.FormsiteData;
import org.testng.annotations.Test;
import testScripts.BaseTest;

public class TS02_InputLeadCaptureForm extends BaseTest {
    @Test
    public static void inputLeadCaptureForm(){
        protectedFormLogin.inputPassword.sendKeys(FormsiteData.PASSWORDLOGIN);
        protectedFormLogin.submitLogin.click();
        leadCaptureForm.inputFirstName.sendKeys(FormsiteData.FIRSTNAME);
        leadCaptureForm.inputLastName.sendKeys(FormsiteData.LASTNAME);
        leadCaptureForm.inputStreetAddress.sendKeys(FormsiteData.STREETADDRESS);
        leadCaptureForm.inputAddressLine2.sendKeys(FormsiteData.ADDRESSLINE2);
        leadCaptureForm.inputCity.sendKeys(FormsiteData.CITY);
        leadCaptureForm.clickSelectState.click();
        leadCaptureForm.selectState.click();
        leadCaptureForm.inputZipCode.sendKeys(FormsiteData.ZIPCODE);
        leadCaptureForm.inputPhoneNumber.sendKeys(FormsiteData.PHONENUMBER);
        leadCaptureForm.inputEmailAddress.sendKeys(FormsiteData.EMAILADDRESS);
        leadCaptureForm.inputDateOfDemo.sendKeys(FormsiteData.DATEOFDEMO);
        leadCaptureForm.submitLeadForm.click();
        leadCaptureForm.checkingSubmitSuccessfully();
    }

}
