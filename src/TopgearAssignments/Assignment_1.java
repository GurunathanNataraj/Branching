package TopgearAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment_1 extends CommonFunctions {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		CommonFunctions cf=new CommonFunctions();
		driver=cf.InitiateWebDriver("https://google.com");
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("guru");
		cf.setText(driver.findElement(By.xpath("//input[@title='Search']")),"guru");
		 
		
		
	}

}
