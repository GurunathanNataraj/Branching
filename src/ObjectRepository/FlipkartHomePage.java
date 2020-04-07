package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartHomePage {
	
	WebDriver driver;
	
	public FlipkartHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Login=By.xpath("//a[text()='Login']");
	
	public WebElement LoginButton()
	{
		return driver.findElement(Login);
	}
}
