package testScripts.fs28_TestScrips;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import testScripts.API.APITest;
import testScripts.BaseTest;

public class MainTestExecute extends BaseTest {
    @Test
    public void executeTS01LoginTestScript(){
        TS01_LoginProtectedForm.loginProtectedForm();
    }
    @Test
    public void executeTS02InputLeadCaptureForm(){
        TS02_InputLeadCaptureForm.inputLeadCaptureForm();
    }
    @AfterClass
    public void executeAPITest(){
        APITest.verifyFormsiteResponse();
    }
}
