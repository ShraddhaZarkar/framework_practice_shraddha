package framework_practice_shraddha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class facebook {
	WebDriver driver;
	
  @Test
  public void zerodha() {
	  driver.get("https://zerodha.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Signup")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver", "/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
