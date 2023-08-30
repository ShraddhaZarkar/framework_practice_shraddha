package framework_practice_shraddha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class test_locaters {
	WebDriver driver;
	
  @Test
  public void fb() throws InterruptedException {
	  driver.get("https://www.facebook.com/");
	  System.out.println("currentUrl=" +driver.getCurrentUrl());
	  System.out.println("TITLE= " +driver.getTitle());
	  Thread.sleep(2000);
	  WebElement fbs = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	  System.out.println("size=" +fbs.getSize());
	  
	  WebElement xyz = driver.findElement(By.xpath("//h2[@class='_8eso']"));
	  System.out.println("get text=" +xyz.getText());
	 // System.out.println("font= " +xyz.)
	  
	  WebElement infld = driver.findElement(By.id("email"));
	  infld.isDisplayed();
	  infld.isEnabled();
	  infld.isSelected();
	  infld.sendKeys("Shraddha");
	  
	  WebElement psfld = driver.findElement(By.id("pass"));
	  System.out.println("Psfld = "  +psfld.getSize());
	  psfld.isDisplayed();
	  psfld.isEnabled();
	  psfld.isSelected();
	  psfld.sendKeys("Kavir");
	  Thread.sleep(2000);
	  
	  //driver.findElement(By.xpath("//button[@name='login']")).click();
	 // Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	  Thread.sleep(2000);
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver","/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
	  driver= new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
