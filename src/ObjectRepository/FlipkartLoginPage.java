package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartLoginPage {
	WebDriver driver;
	
	public FlipkartLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By CreateAccount=By.xpath("//a[text()='New to Flipkart? Create an account']");
	
	public WebElement CreateAccount()
	{
		return driver.findElement(CreateAccount);
	}
	
}
