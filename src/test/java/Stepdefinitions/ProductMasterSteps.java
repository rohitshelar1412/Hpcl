package Stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductMasterSteps {

	WebDriver driver;
	
	@Given("I am login in to the website enter username {string} and password {string}")
	public void i_am_login_in_to_the_website_enter_username_and_password(String username, String password) throws InterruptedException {
	    System.out.println(">> I am login in to the website enter username "+username+" and password "+password);
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

	@And("I click on the Product label")
	public void i_click_on_the_product_label() throws InterruptedException {
		System.out.println(">> I click on the Product label");
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
	}

	@And("I click on the product master label")
	public void i_click_on_the_product_master_label() {
		System.out.println(">> I click on the product master label");
		driver.findElement(By.xpath("//*[@id=\"product\"]/li[1]/a")).click();
	}

	@And("I input Product name in to the search field")
	public void i_input_product_name_in_to_the_search_field() {
		System.out.println(">> I input Product name in to the search field");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("L");
	}

	@And("Show the expected result")
	public void show_the_expected_result() {
		System.out.println(">> Show the expected result");
		
	}

	@And("I click on delete button")
	public void i_click_on_delete_button() {
		System.out.println(">> I click on delete button");
		// Scroll down using JavaScript Executor
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
		
		driver.findElement(By.xpath("//*[@id=\"search_data\"]/div[3]/div[2]/a[4]")).click();
		
		Alert alert = driver.switchTo().alert();

		// Accept the alert (click OK)
		alert.accept();
	}

	@Then("Product should be deleted")
	public void product_should_be_deleted() {
		System.out.println(">> Product should be deleted");
		driver.close();
	}

	
}
