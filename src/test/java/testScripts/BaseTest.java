package testScripts;

import core.pageobject.BasePage;
import core.pageobject.fs28.LeadCaptureForm;
import core.pageobject.fs28.ProtectedFormLogin;
import data.FormsiteData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    protected static ProtectedFormLogin protectedFormLogin;
    protected static LeadCaptureForm leadCaptureForm;
    protected static BasePage basePage;

    @BeforeMethod
    protected void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        protectedFormLogin = PageFactory.initElements(driver, ProtectedFormLogin.class);
        leadCaptureForm = PageFactory.initElements(driver, LeadCaptureForm.class);
        basePage = new BasePage();
        driver.get(FormsiteData.URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    protected void tearDownMethod() {
        driver.quit();
    }
}
