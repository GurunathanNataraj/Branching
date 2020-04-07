import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ObjectRepository.FlipkartHomePage;
import ObjectRepository.FlipkartLoginPage;
import ObjectRepository.FlipkartSignupPage;

public class PageObjectModel {
	
WebDriver driver;
	
	@BeforeClass
	public WebDriver InitiateWebDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("start-maximized"); 
	    options.addArguments("enable-automation"); 
	    options.addArguments("--no-sandbox"); 
	    options.addArguments("--disable-infobars"); 
	    options.addArguments("--disable-dev-shm-usage"); 
	    options.addArguments("--disable-browser-side-navigation"); 
	    options.addArguments("--disable-gpu");
	    
		driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://flipkart.com");
		
		return driver;
	}
	
	@AfterClass
	public void CloseBrowser()
	
	{
		driver.close();
	}
	
	
	@Test
	public void FlipKartSignIn() throws Exception
	{
	
        Actions action=new Actions(driver);
        FlipkartHomePage homepage=new FlipkartHomePage(driver);
		action.moveToElement(homepage.LoginButton()).build().perform();
		Thread.sleep(5000);
		
		FlipkartLoginPage loginpage=new FlipkartLoginPage(driver);
		//driver.findElement(By.linkText("Sign Up")).click();
		loginpage.CreateAccount().click();
		
		FlipkartSignupPage signuppage=new FlipkartSignupPage(driver);
		signuppage.MobileNumber().sendKeys("8508016677");
		signuppage.ContinueButton().click();
		signuppage.EnterOTP().sendKeys("123456");
		signuppage.SetPassword().sendKeys("Password77");
		signuppage.SignUpButton().click();
		
	}

}
