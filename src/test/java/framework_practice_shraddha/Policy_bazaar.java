package framework_practice_shraddha;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Policy_bazaar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver",
				"/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		///html/body/div[5]/div[2]/div/ul/li[7]/a
		///html/body/div[5]/div[2]/div/ul/li[7]/a
		//Select drpdn = new Select(driver.findElement(By.xpath("(//div[@id='central-login-drop-down-arrow'])[2]")));
		//drpdn.selectByVisibleText("USA/CANADA");
		driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();

		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9503952106");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
		Thread.sleep(2000);

		//<input type="password" name="password" id="central-login-password" placeholder=" ">
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("Zarkar@1105");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		WebElement myact=driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions action = new Actions(driver);
		action.moveToElement(myact).perform();
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		Set<String> alwind = driver.getWindowHandles();
		ArrayList<String> wind = new ArrayList<String>(alwind);
		driver.switchTo().window(wind.get(1));
		String actualname = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String expextedname = "Sattyajit Shridhar Zarkar";
		if(actualname.equals(expextedname)) {
			System.out.println("testcase is pass.");
		}
		else {
			System.out.println("test case is fale.");
		}
		

	

	
	}

}
