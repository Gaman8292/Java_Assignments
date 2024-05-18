package Automation;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectBrowser 
{
	File projectDirectory = new File(System.getProperty("user.dir"));
	String filesFolderPath = projectDirectory.getParent();
    String driverPath = filesFolderPath + "/Webdrivers/";
	
    public WebDriver getDriver(String browser) 
    {
        WebDriver driver;

        switch (browser.toLowerCase()) 
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--guest");
                chromeOptions.addArguments("--disable-extensions");
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("--disable-infobars");
                chromeOptions.addArguments("--disable-notifications");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", driverPath+"msedgedriver.exe");
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--guest");
                edgeOptions.addArguments("--disable-extensions");
                edgeOptions.addArguments("--start-maximized");
                edgeOptions.addArguments("--disable-infobars");
                edgeOptions.addArguments("--disable-notifications");
                edgeOptions.addArguments("--no-sandbox");
                edgeOptions.addArguments("--disable-dev-shm-usage");
                edgeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                throw new IllegalArgumentException("Invalid browser: " + browser);
        }
        return driver;
    }
}
