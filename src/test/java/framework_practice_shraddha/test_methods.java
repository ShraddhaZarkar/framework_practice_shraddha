package framework_practice_shraddha;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class test_methods{
	WebDriver driver;
  @Test(priority=0)
  public void gmail() throws InterruptedException {
	  driver.get("http://www.gmail.com/");
	  Thread.sleep(2000);
	  System.out.println("url= " +driver.getCurrentUrl());
	  System.out.println("Title= " +driver.getTitle());
	  driver.manage().window().minimize();
	  driver.manage().window().maximize();
	  
	  
	  
  }
  
  @Test(priority=1)
  public void amazon() throws InterruptedException {
	  driver.get("https://www.amazon.com/");
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  driver.navigate().back();
	  driver.close();
  }
  
  @Test(priority=2)
  public void fb() throws InterruptedException {
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
  System.getProperty("WebDriver.chrome.driver","/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
	  driver = new ChromeDriver();
  
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
