package App_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MattersPage 
{

	int seconds = 5;
	Duration duration = Duration.ofSeconds(seconds);
	WebDriver driver = null;
	WebDriverWait wait;

	public MattersPage(WebDriver driver) 
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, duration);
	}

	By Search_Header = By.xpath("//h2[text()='SEARCH']");
	
	
	public String VerifySuccessfull_Login()
	{ return driver.getTitle(); }
}
