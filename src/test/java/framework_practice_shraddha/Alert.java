package framework_practice_shraddha;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert {
	WebDriver driver;
  @Test
  public void dummy() throws InterruptedException {
	  driver.get("http://www.dummypoint.com/Windows.html");
	  driver.manage().window().maximize();
	  WebElement albtn = driver.findElement(By.name("alertbutton"));
	  albtn.click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);
	  
	  WebElement promtb = driver.findElement(By.name("promtalertb"));
	  promtb.click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().sendKeys("shraddha");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.name("confirmalertb")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(5000);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver","/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
	  driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	driver.close();  
	  
  }

}
