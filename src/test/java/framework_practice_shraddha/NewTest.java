package framework_practice_shraddha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

	@Test
	public void loginpb() throws InterruptedException {
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(DurationOfSeconds(10));
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9503952106");
		driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Zarkar@1105");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		
		
		
		

	}

	private Duration DurationOfSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("WebDriver.chrome.driver",
				"/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.close();

	}

}
