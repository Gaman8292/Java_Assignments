package App_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage 
{
	int seconds = 5;
	Duration duration = Duration.ofSeconds(seconds);
	WebDriver driver = null;
	WebDriverWait wait;

	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, duration);
	}

	By Login_TextBox = By.xpath("//input[@class='txt']");
	By Passwor_TextBox = By.xpath("//input[@type='password']");
	By Login_Button = By.xpath("//input[@type='submit']");

	public void SetLoginId(String LoginId) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login_TextBox));
		driver.findElement(Login_TextBox).sendKeys(LoginId);
	}

	public void SetPassword(String Password) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login_Button));
		driver.findElement(Passwor_TextBox).sendKeys(Password);
	}

	public void ClickLoginID() 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login_Button));
		driver.findElement(Login_Button).click();
	}
	
}
