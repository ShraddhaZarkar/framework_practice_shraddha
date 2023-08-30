package framework_practice_shraddha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ExcelSheet {
	WebDriver driver;
  @Test
  public void f() {
	  HSSFWorkbook workbook = new HSSFWorkbook("path of excelsheet");
	  HSSFSheet she = workbook.getSheet(sheet1);
	  for(i=0; i<she.getLsatRowNum(); i++);
	  HSSFRow rw = she.getRow(i);
	  HSSFCell col = rw.getCell(0);
	  String s = col.getStringCellValue();
	  System.out.println(s)
	  
	  
	  HSSFWorkbook workbook = new HSSFWorkbook(link of excel sheet);
	  HSSFSheet sheet = workbook.getSheet(Sheet1);
	  for(i=0; i<getLastRowNum(); i++) {
		  HSSFRow rows = sheet.getRow(i);
		  HSSFCell col = rows.getCell(0);
		  String val = col,getStringCellValue();
		  syso(val);
		  
		  
	HSSFWorkbook workbook = new HSSFWorkbook(pathof excelsheet);
	HSSFSheet she = workbook.getSheet(Sheet1);
	for(i=0; i<getLastRowNum(); i++) {
		HSSFRow rows = she.getRow(i);
		HSSFCell col = rows.getCell(0);
		String val = col.getStringCellValue();
		syso(val)
	}
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver","/Users/shraddhazarkar/Home/Shraddha_Testing_WS/framework_practice_shraddha/chromedriver-mac-arm64 3");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
