import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class TestNG {
	
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
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Login']"))).build().perform();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
		
		driver.findElement(By.xpath("//span[text()='Enter Mobile number']/parent::label/parent::div/input")).sendKeys("8508016677");
		
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		
		driver.findElement(By.xpath("//span[text()='Enter OTP']/parent::label/parent::div/input")).sendKeys("123456");
		
		driver.findElement(By.xpath("//span[text()='Set Password']/parent::label/parent::div/input")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@type='submit']/following::span[text()='Signup'][2]")).click();
		
	}
	
	

}
