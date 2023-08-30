package framework_practice_shraddha;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Tables {
	WebDriver driver;
  @Test
  public void dummy() throws InterruptedException {
	  
	  driver.get("http://www.dummypoint.com/Tables.html");
	  driver.manage().window().maximize();
	  WebElement tablet = driver.findElement(By.xpath("//div[@id='tt']"));
	  System.out.println(tablet.getSize());
	  
	  //for allrows
	  
	  List<WebElement> allrows = tablet.findElements(By.tagName("tr"));
	  System.out.println(allrows.size());
	  Thread.sleep(2000);
	  for(WebElement alrs:allrows) {
		  System.out.println(alrs.getText());
		  
	  }
	  
	  //for allcolumns
	  for(int i=1; i<allrows.size(); i++) {
		  List<WebElement> allcols = allrows.get(i).findElements(By.tagName("td"));
		  System.out.println(allcols.size());
		  Thread.sleep(2000);
		  for(WebElement col:allcols) {
			  System.out.println("Column:" +col.getText());
		  
		  }
	  
	  }
	  
	 //header
	  List<WebElement> alhead = allrows.get(0).findElements(By.tagName("th"));
	  System.out.println(alhead.size());
	  for(WebElement h:alhead) {
		  System.out.println("header:" +h.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
	  driver = new ChromeDriver();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
	  
  }

}
