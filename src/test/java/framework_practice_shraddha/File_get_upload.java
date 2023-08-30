package framework_practice_shraddha;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class File_get_upload {
	WebDriver driver;
	
  @Test
  public void guru() throws InterruptedException {
	  driver.get("https://demo.guru99.com/test/upload/");
	  driver.findElement(By.id("uploadfile_0")).sendKeys("/Users/shraddhazarkar/Desktop/Seleniumfolder/loop.pdf");
	  driver.findElement(By.id("terms")).click();
	 WebElement subtn = driver.findElement(By.id("submitbutton"));
	 System.out.println("size= "  +subtn.getSize());
	 System.out.println("text = " +subtn.getText());
	 subtn.click();
	 Thread.sleep(3000);
	 
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.class chrome.driver", "/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
	  driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
