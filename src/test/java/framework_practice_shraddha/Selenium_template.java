package framework_practice_shraddha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Selenium_template {
	WebDriver driver;

	@Test
	public void dummy1() throws InterruptedException {
		driver.get("http://www.dummypoint.com/seleniumtemplate.html");
		driver.manage().window().maximize();

		// inputField
		driver.findElement(By.id("user_input")).sendKeys("Kavir");

		System.out.println("******************************************");

		// radiobutton
		List<WebElement> allbtn = driver.findElements(By.name("radio"));
		System.out.println(allbtn.size());
		allbtn.get(2).click();
		for (int i = 0; i < allbtn.size(); i++)

		{
			allbtn.get(i).click();

		}
		System.out.println("*****************************************");

		// checkbx
		List<WebElement> ckbx = driver.findElements(By.name("checkbox"));
		System.out.println(ckbx.size());
		for (int i = 0; i < ckbx.size(); i++) {
			if (!ckbx.get(i).isSelected()) {

				ckbx.get(i).click();

			}
		}
		System.out.println("*****************************************");

		// dropdown
		Select drpdn = new Select(driver.findElement(By.id("dropdown")));
		drpdn.selectByIndex(2);

		System.out.println("*****************************************");

		// multidelect
		Select alele = new Select(driver.findElement(By.id("multiselect")));
		alele.selectByIndex(2);

		alele.selectByIndex(3);

		alele.deselectAll();

		alele.selectByIndex(1);

		System.out.println("*****************************************");

		// submittbtn
		driver.findElement(By.id("submitbutton")).click();
		System.out.println("*****************************************");
		
		//File srcn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileHandler.copy(srcn, new File("/Users/shraddhazarkar/Desktop/Seleniumfolder");
	}

	@Test
	public void dummy2() throws InterruptedException {
		driver.get("http://www.dummypoint.com/Form.html");
		driver.findElement(By.id("name")).sendKeys("abc");

		driver.findElement(By.id("email")).sendKeys("abcdefghijklmnopqrstuvwxyz");

		driver.findElement(By.id("g")).click();
		driver.findElement(By.id("tech")).sendKeys("tech");

		driver.findElement(By.id("message")).sendKeys("hi");

		WebElement capele = driver.findElement(By.id("captcha_image"));
		System.out.println(capele.getText());

		WebElement input = driver.findElement(By.id("captcha"));
		System.out.println("input for captcha" + input.getSize());
		Actions action = new Actions(driver);
		action.moveToElement(capele).clickAndHold().moveToElement(input).perform();

		System.out.println("*****************************************");
	}

	@Test
	public void dummy3() throws InterruptedException {

		driver.get("http://www.dummypoint.com/DragAndDrop.html");

		WebElement sour = driver.findElement(By.xpath("//div[@id='drop']"));
		WebElement targ = driver.findElement(By.xpath("//p[@id='drag']"));
		Actions action = new Actions(driver);
		action.moveToElement(targ).clickAndHold().dragAndDrop(targ, sour).perform();

		System.out.println("*****************************************");

	}

	@Test
	public void dummy4() throws InterruptedException {

		/*
		 * driver.get("http://www.dummypoint.com/Frame.html");
		 * driver.switchTo().frame(0); Thread.sleep(2000);
		 * driver.findElement(By.name("promtalert")).click();
		 * driver.switchTo().alert().sendKeys("abs");
		 * driver.switchTo().alert().accept(); Thread.sleep(2000);
		 * 
		 * driver.switchTo().parentFrame(); driver.switchTo().frame(1);
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[@name='promtalert']")).click();
		 * driver.switchTo().alert().sendKeys("zxy");
		 * driver.switchTo().alert().accept(); Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * driver.switchTo().parentFrame(); driver.switchTo().frame(2);
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[@name='promtalert']")).click();
		 * driver.switchTo().alert().sendKeys("pqr");
		 * driver.switchTo().alert().accept(); Thread.sleep(3000);
		 * 
		 * driver.switchTo().parentFrame(); driver.switchTo().frame(3);
		 * Thread.sleep(3000); WebElement s =
		 * driver.findElement(By.xpath("//p[text='Frame 4 paragraph.']"));
		 * System.out.println(s.getText()); Thread.sleep(3000);
		 * 
		 */

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

	@Test
	public void dummy5() throws InterruptedException {
		driver.get("http://www.dummypoint.com/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.getWindowHandle();
		Set<String> alwd = driver.getWindowHandles();
		System.out.println("size of window = " +alwd.size());
		for(String s:alwd) {
			driver.switchTo().window(s).close();
			Thread.sleep(2000);
		}
	}

	@Test
	public void dummy6() {
		driver.get("http://www.dummypoint.com/Actions.html");
		
		driver.findElement(By.xpath("//input[@id='user_input']")).sendKeys("sss");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement sende = driver.findElement(By.id("keyseditbox"));
		sende.sendKeys("aaa");
		sende.sendKeys(Keys.DELETE);
		
	}

	@Test
	public void dummy7() throws InterruptedException {
		
		driver.get("http://www.dummypoint.com/Tables.html");
		driver.manage().window().maximize();
		WebElement tbt = driver.findElement(By.id("tt"));
		
		Thread.sleep(2000);
		List<WebElement> alrw = tbt.findElements(By.tagName("tr"));
		System.out.println(alrw.size());
		for(WebElement r:alrw) {
			System.out.println(r.getText());
			Thread.sleep(2000);
		}
		
		
		
		for(int i=0; i<alrw.size(); i++) {
		List<WebElement> alcm = alrw.get(i).findElements(By.tagName("td"));
		System.out.println(alrw.size());
		for(WebElement e:alcm) {
			System.out.println(e.getText());
		}
		}
		List<WebElement> headele = alrw.get(0
				).findElements(By.tagName("th"));
		for(WebElement h:headele) {
			System.out.println(h.getText());
		}
		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("WebDriver.chromr.driver",
				"/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
