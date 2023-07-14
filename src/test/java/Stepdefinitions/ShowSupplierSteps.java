package Stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShowSupplierSteps {

	WebDriver driver;

	@Given("login to the website enter username {string} and password {string}")
	public void login_to_the_website_enter_username_and_password(String username, String password)
			throws InterruptedException {
		System.out.println(">> login to the website enter username :" + username + " and password :" + password);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.manasvi.tech/Mayur_inventory");

		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input"))
				.sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input"))
				.sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/button")).click();
	}

	@When("Click on the supplier label")
	public void click_on_the_supplier_label() throws InterruptedException {
		System.out.println(">> Click on the supplier label");
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[5]/a")).click();
		Thread.sleep(2000);
	}

	@And("Click on the show supplier label")
	public void click_on_the_show_supplier_label() {
		System.out.println(">> Click on the show supplier label");
		driver.findElement(By.xpath("//*[@id=\"vendor\"]/li[2]/a")).click();
	}

	@And("Enter supplier name in to the search field")
	public void enter_supplier_name_in_to_the_search_field() {
		System.out.println(">> Enter supplier name in to the search field");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("P");
	}

	@Then("Expected result should be show")
	public void expected_result_should_be_show() {
		System.out.println(">> Expected result should be show");

	}

	@And("Click on delete supplier buttton")
	public void click_on_delete_supplier_buttton() {
		System.out.println(">> Click on delete supplier buttton");

        // Scroll down using JavaScript Executor

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		
		driver.findElement(By.xpath("//*[@id=\"search_data\"]/div[3]/div/a[3]")).click();
		
		Alert alert = driver.switchTo().alert();

		// Accept the alert (click OK)
		alert.accept();
	}

	@Then("Supplier should be deleted successfully")
	public void supplier_should_be_deleted_successfully() {
		System.out.println(">> Supplier should be deleted successfully");

	}

	@And("Click on any supplier view button")
	public void click_on_any_supplier_view_button() {
		System.out.println(">> Click on any supplier view button");
		 // Scroll down using JavaScript Executor

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		
		driver.findElement(By.xpath("//*[@id=\"search_data\"]/div[1]/div/a[2]")).click();
	}

	@Then("View page should be open successfully")
	public void view_page_should_be_open_successfully() {
		System.out.println(">> View page should be open successfully");

	}

	@And("Click on edit button")
	public void click_on_edit_button() {
		System.out.println(">> Click on edit button");
		// Scroll down using JavaScript Executor

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500);");
		
		driver.findElement(By.xpath("//*[@id=\"search_data\"]/div[1]/div/a[1]")).click();
	}

	@And("Enter data in all fields and click on edit button")
	public void enter_data_in_all_fields_and_click_on_edit_button() {
		System.out.println(">> Enter data in all fields and click on edit button");
 
		driver.findElement(By.xpath("//*[@id=\"vinputid\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"vinputid\"]")).sendKeys("88");
		driver.findElement(By.xpath("//*[@id=\"vinputname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"vinputname\"]")).sendKeys("Rohit");
		driver.findElement(By.xpath("//*[@id=\"erpcode\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"erpcode\"]")).sendKeys("108");
		driver.findElement(By.xpath("//*[@id=\"vinputaddr\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"vinputaddr\"]")).sendKeys("Niphad");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rs1412@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cno\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"cno\"]")).sendKeys("9511819174");
		
		
		WebElement serviceDropdown = driver.findElement(By.xpath("//*[@id=\"VT1\"]"));
		Select serviceSelect = new Select(serviceDropdown);
		serviceSelect.selectByVisibleText("C");
		
		driver.findElement(By.xpath("//*[@id=\"gstid\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"gstid\"]")).sendKeys("3535");
		
		driver.findElement(By.xpath("//*[@id=\"supplier-form\"]/div[7]/div/input")).sendKeys("C:\\1.jpg");
		
		
		driver.findElement(By.xpath("//*[@id=\"supplier-form\"]/div[8]/div/button")).click();
		
//		Alert alert = driver.switchTo().alert();
//		
//
//		alert.accept();
	}

	@Then("Supplier edited successfully")
	public void supplier_edited_successfully() {
		System.out.println(">> Supplier edited successfully");

	}
}
