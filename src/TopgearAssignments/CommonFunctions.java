package TopgearAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	public static WebDriver driver;
	
	public WebDriver InitiateWebDriver(String URL) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("start-maximized"); 
	    options.addArguments("enable-automation"); 
	    options.addArguments("--no-sandbox"); 
	    options.addArguments("--disable-infobars"); 
	    options.addArguments("--disable-dev-shm-usage"); 
	    options.addArguments("--disable-browser-side-navigation"); 
	    options.addArguments("--disable-gpu");
	    
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		
		
		driver.get(URL);
		
		return driver;
	}
	
	public void setText(WebElement ele,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		if(ele.isDisplayed())
		{
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.sendKeys(value);
		}
		
	}
	


}
