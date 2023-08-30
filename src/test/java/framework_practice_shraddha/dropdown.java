package framework_practice_shraddha;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class dropdown {
	WebDriver driver;

	@Test
	public void dummy() throws InterruptedException {
		driver.get("http://www.dummypoint.com/seleniumtemplate.html");
		driver.manage().window().maximize();

		// for radioButton
		List<WebElement> rdbtn = driver.findElements(By.name("radio"));
		System.out.println(rdbtn.size());
		for (int i = 0; i < rdbtn.size(); i++) {
			rdbtn.get(i).click();
			Thread.sleep(3000);
		}

		// for checkbox
		List<WebElement> chkbx = driver.findElements(By.name("checkbox"));
		System.out.println(chkbx.size());

		for (int j = 0; j < chkbx.size(); j++) {
			if (!chkbx.get(j).isSelected())

				chkbx.get(j).click();
			Thread.sleep(3000);
			chkbx.get(2).click();

		}

		// for dropdown()
		Select dropele = new Select(driver.findElement(By.id("dropdown")));
		dropele.selectByIndex(2);

		/*
		 * Thread.sleep(2000); dropele.deselectByIndex(2); Thread.sleep(2000);
		 * dropele.selectByValue("OptionThree"); Thread.sleep(2000);
		 * dropele.deselectByValue("OptionThree"); Thread.sleep(2000);
		 * dropele.selectByVisibleText("Option1"); Thread.sleep(2000);
		 */

		// multiselect

		Select mulele = new Select(driver.findElement(By.id("multiselect")));
		mulele.selectByIndex(2);
		Thread.sleep(3000);
		
		//submitbtn
		driver.findElement(By.id("submitbutton")).click();
		
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
