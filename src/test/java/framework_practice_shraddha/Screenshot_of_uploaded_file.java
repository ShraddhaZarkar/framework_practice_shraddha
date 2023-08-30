package framework_practice_shraddha;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Screenshot_of_uploaded_file {
	WebDriver driver;
	
  @Test
  public void guru() throws InterruptedException, IOException {
	  driver.get("https://demo.guru99.com/test/upload/");
	  driver.manage().window().maximize();  
	  driver.findElement(By.id("uploadfile_0")).sendKeys("/Users/shraddhazarkar/Desktop/Seleniumfolder/loop.pdf");
	  Thread.sleep(2000);
	  driver.findElement(By.id("terms")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("submitbutton")).click();
	// File srnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 //FileHandler.copy(srnshot, new File("/Users/shraddhazarkar/Desktop/Seleniumfolder/screen2.png")); 
	 // File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 // FileHandler.copy(srcfile,new File("/Users/shraddhazarkar/Desktop/Seleniumfolder/screenshot3.png"));
	  File scrnsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrnsht, new File("/Users/shraddhazarkar/Desktop/Seleniumfolder/screen4.png"));
	  
	  
	  
	  
	  
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
