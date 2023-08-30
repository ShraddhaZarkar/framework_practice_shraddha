package framework_practice_shraddha;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class multiframe {
	WebDriver driver;
  @Test
  public void dummy() throws InterruptedException {
	  driver.get("http://www.dummypoint.com/Frame.html");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.name("promtalert")).click();
	  driver.switchTo().alert().sendKeys("shraddha");
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  
	  driver.switchTo().parentFrame();
	  driver.switchTo().frame(1);
	  driver.findElement(By.xpath("//button[@name='promtalert']")).click();
	  driver.switchTo().alert().sendKeys("kavir");
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  
	  driver.switchTo().parentFrame();
	  driver.switchTo().frame(2);
	  driver.findElement(By.xpath("//button[@name='promtalert']")).click();
	  driver.switchTo().alert().sendKeys("ajinkya");
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  
	  
	  driver.switchTo().parentFrame();
	  driver.switchTo().frame(3);
	  WebElement frm = driver.findElement(By.xpath("//p[text()='Frame 4 paragraph.']"));
	  System.out.println(frm.getText());
	  Thread.sleep(3000);
	  
	  
	  
	  
	  
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
