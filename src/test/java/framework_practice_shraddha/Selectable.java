package framework_practice_shraddha;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Selectable {
	WebDriver driver;
  @Test
  public void jque() throws InterruptedException {
	  driver.get("https://jqueryui.com/selectable/");
	  driver.manage().window().maximize();
	  driver.switchTo().frame(0);
	  Thread.sleep(2000);
	  List<WebElement> alele= driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content ui-selectee')]"));
	  System.out.println(alele.size());
	  Thread.sleep(2000);
	  Actions action = new Actions(driver);
	  action.moveToElement(alele.get(3)).click().perform();
	  Thread.sleep(3000);
	  for(int i=0; i<alele.size(); i++) {
		  alele.get(i).click();
		  Thread.sleep(3000);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
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
