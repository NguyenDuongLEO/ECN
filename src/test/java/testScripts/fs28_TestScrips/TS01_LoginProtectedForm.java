package testScripts.fs28_TestScrips;
import data.FormsiteData;
import org.testng.annotations.Test;
import testScripts.BaseTest;

public class TS01_LoginProtectedForm extends BaseTest {
    @Test
    public static void loginProtectedForm() {
        protectedFormLogin.inputPassword.sendKeys(FormsiteData.PASSWORDLOGIN);
        protectedFormLogin.submitLogin.click();
        protectedFormLogin.checkingLoginSuccessfully();
    }

}
