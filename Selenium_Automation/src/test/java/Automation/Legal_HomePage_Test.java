package Automation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import App_Pages.HomePage;
import App_Pages.MattersPage;

public class Legal_HomePage_Test 
{
	SelectBrowser browser;
	WebDriver driver;
	HomePage legalHomePage;
	MattersPage mattersPage;
	
	ExtentReports extent = new ExtentReports();
    ExtentSparkReporter htmlReporter = new ExtentSparkReporter("Tests_Report.html");
        
    @BeforeTest
    public void TestInitialise()
    {
    	browser = new SelectBrowser();
    	driver = browser.getDriver("chrome");
    	legalHomePage = new HomePage(driver);
    	mattersPage = new MattersPage(driver);
    	extent.attachReporter(htmlReporter);
    	System.out.println("Step 1) Test Initialised.");
    }
    
    public void LaunchLegalPage_Test()
    {
    	ExtentTest Test1 = extent.createTest("Launch CollecltLink Legal LoginTest","This Test Collectlink Legal Page Launches Successfully.");
    	try
    	{
    		Test1.log(Status.INFO,"Launched Legal Page .");
    		driver.get("https://sglegal.collectlink.ca/");
    		System.out.println("Step 2) Legal Page Launched.");
     		Test1.pass("Legal Page Launched.");
    	}
        catch(Exception ex)
    	{ 
        	System.out.println(ex);
        	Test1.fail("Legal Page failed to Launch.");
        }
    }
  
    @Test
    public void LegalLogin_Test()
    {
    	ExtentTest Test2 = extent.createTest("CollecltLink Legal LoginTest","This Test is to validate Successfull Login to Collectlink Legal Page.");
    	try
    	{
    		Test2.log(Status.INFO,"Login to Legal Page .");
    		LaunchLegalPage_Test();
    		legalHomePage.SetLoginId("s_apfcb");
            legalHomePage.SetPassword("Testing@1982");
            legalHomePage.ClickLoginID();
            System.out.println("Step 3) Logedin to Legal Page.");
            
            Test2.log(Status.INFO,"Verify Login Successfull.");
            String actualTitle = mattersPage.VerifySuccessfull_Login();
            Assert.assertEquals("CollectLink - matters", actualTitle);
            System.out.println("Step 4) Verified: Login Successfull.");
            Test2.pass("Successfully Logedin to Legal Page.");
        }
        catch(Exception ex)
    	{ 
        	System.out.println(ex);
        	Test2.pass("Legal Page Login Failed.");
        }
    }
    
    @AfterTest
    public void TestTearDown()
    {
    	ExtentTest Test3 = extent.createTest("CollecltLink Legal LoginTest","This Test is to validate Successfull Login to Collectlink Legal Page.");
    	try
    	{
    		Test3.log(Status.INFO,"Close Browser and drivers.");
    		driver.close();
    		driver.quit();
    		Test3.pass("Successfully closed all drivers.");
    		extent.flush();
    		System.out.println("Step 5) Test finished Successfully.");
    	}
        catch(Exception ex)
    	{ 
        	System.out.println(ex);
        	Test3.pass("Failed to close drivers.");
        }
    }
    
}
