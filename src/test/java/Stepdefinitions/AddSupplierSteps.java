package Stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddSupplierSteps {
	
	WebDriver driver;
	
	
	
	@Given("Open website and click on url")
	public void open_website_and_click_on_url() {
		System.out.println(">> Open website and click on url");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.manasvi.tech/Mayur_inventory");
	}

	@When("Admin enter validusername {string} and validpassword {string} and click on login btn")
	public void admin_enter_validusername_and_validpassword_and_click_on_login_btn(String validusername, String validpassword) throws InterruptedException {
		System.out.println(">> Admin enter validusername : "+validusername+" and validpassword : "+validpassword+" and click on login btn");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input"))
				.sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input"))
				.sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/button")).click();
	}

	@Then("Admin enter all data and click on add button")
	public void admin_enter_all_data_and_click_on_add_button() {
	    System.out.println(">> Admin enter all data and click on add button");
	    String filePath = "E:\\AddSuplier.xlsx";
		try (Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath))) 
		{
			Sheet sheet = workbook.getSheetAt(0); 
			for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) 
			{
				driver.findElement(By.xpath("//a[text()=\" Suppliers\"]")).click();
				driver.findElement(By.xpath("//a[normalize-space()='Add Supplier']")).click();
				Row row = sheet.getRow(rowIndex);
				if (row != null) {
					String supplierid = getCellValueAsString(row.getCell(0));
					String suppliername =getCellValueAsString(row.getCell(1));
					String erpcode = getCellValueAsString(row.getCell(2));
					String supplieraddress = getCellValueAsString(row.getCell(3));
					String emailaddress = getCellValueAsString(row.getCell(4));
					String contactno=getCellValueAsString(row.getCell(5));
					String selecttype=getCellValueAsString(row.getCell(6));
					String gstno=getCellValueAsString(row.getCell(7));
					String fileupload=getCellValueAsString(row.getCell(8));

					driver.findElement(By.xpath("//input[@id='vinputid']")).sendKeys(supplierid);
					driver.findElement(By.xpath("//input[@id='vinputname']")).sendKeys(suppliername);
					driver.findElement(By.xpath("//input[@id='erpcode']")).sendKeys(erpcode);
					driver.findElement(By.xpath("//textarea[@id='vinputaddr']")).sendKeys(supplieraddress);
					driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailaddress);
					driver.findElement(By.xpath("//input[@id='cno']")).sendKeys(contactno);
					
					WebElement serviceDropdown = driver.findElement(By.xpath("//select[@id='VT1']"));
					Select serviceSelect = new Select(serviceDropdown);
					serviceSelect.selectByVisibleText(selecttype);
					
					driver.findElement(By.xpath("//input[@id='gstid']")).sendKeys(gstno);
					driver.findElement(By.xpath("//input[@name='file']")).sendKeys(fileupload);
					
					driver.findElement(By.xpath("//button[@name='submit']")).click();
					
					Alert alert = driver.switchTo().alert();

					alert.accept();


				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getCellValueAsString(Cell cell) 
	{
		if (cell == null) 
		{
			return "";
		}
		cell.setCellType(CellType.STRING); // Set the cell type to string to get the value as string
		return cell.getStringCellValue();
	}
}
