package framework_practice_shraddha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandled {
	WebDriver driver;
  @Test
  public void dummy() throws InterruptedException {
		/*
		 * driver.get("http://www.dummypoint.com/Windows.html");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//input[@type='button']")).click();
		 * driver.getWindowHandle(); Set<String> allwd = driver.getWindowHandles();
		 * System.out.println(allwd.size()); for(String s: allwd) {
		 * driver.switchTo().window(s).close(); Thread.sleep(2000);
		 */ 
	  driver.get("http://www.dummypoint.com/Windows.html");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@type='button']")).click();
	  driver.getWindowHandle();
	  Set<String> alwd = driver.getWindowHandles();
	  for(String s1:alwd) {
		  driver.switchTo().window(s1).close();
		  Thread.sleep(2000);
	  
	  
			/*
			 * driver.get(""); driver.manage().window().maximize();
			 * driver.findElement(By.xpath("")).click(); driver.getWindowHandle();
			 * Set<String> aled = driver.getWindowHandles();
			 * System.out.println(aled.size());
			 * 
			 * for(String s:aled) {
			 * 
			 * driver.switchTo().window(s).close(); Thread.sleep(3000);
			 */
	  }
	  
	  
	  
	  
	  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver","/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
