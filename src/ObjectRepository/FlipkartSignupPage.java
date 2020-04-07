package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartSignupPage {
	
	WebDriver driver;
	
	public FlipkartSignupPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By mobilenumber=By.xpath("//span[text()='Enter Mobile number']/parent::label/parent::div/input");
	By continuebbutton = By.xpath("//span[text()='CONTINUE']");
	By enterOTP = By.xpath("//span[text()='Enter OTP']/parent::label/parent::div/input");
	By setpassword = By.xpath("//span[text()='Set Password']/parent::label/parent::div/input");
	By SignUpButton = By.xpath("//button[@type='submit']/following::span[text()='Signup'][2]");
	
	public WebElement MobileNumber()
	{
		return driver.findElement(mobilenumber);
	}
	
	public WebElement ContinueButton()
	{
		return driver.findElement(continuebbutton);
	}
	
	public WebElement EnterOTP()
	{
		return driver.findElement(enterOTP);
	}
	
	public WebElement SetPassword()
	{
		return driver.findElement(setpassword);
	}
	
	public WebElement SignUpButton()
	{
		return driver.findElement(SignUpButton);
	}
	
	
	
	
	
}
