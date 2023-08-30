package framework_prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginToPBApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(DurationOfSeconds(10));
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		Select drpdn = new Select(driver.findElement(By.id("central-login-drop-down-arrow")));
		drpdn.selectByVisibleText("USA/CANADA");
		driver.findElement(By.id("central-login-module-sign-mobile")).sendKeys("9503952106");
		driver.findElement(By.id("central-loggin-with-pwd")).click();
		
		
		
		
		driver.close();
		
		
		
	}

	private static Duration DurationOfSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
