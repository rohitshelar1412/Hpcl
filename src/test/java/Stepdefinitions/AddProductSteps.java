package Stepdefinitions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class AddProductSteps {

	WebDriver driver;
	
	@Given("I am logged in to the website enter username {string} and password {string}")
	public void i_am_logged_in_to_the_website_enter_username_and_password(String username, String password) throws InterruptedException {
		System.out.println(">> I am logged in to the website enter username :"+username+" and password :"+password);
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

	@When("I click on the Product button")
	public void i_click_on_the_product_button() throws InterruptedException {
		System.out.println(">> I click on the Product button");
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
	}

	@And("I click on the Add Product field")
	public void i_click_on_the_add_product_field() {
		System.out.println(">> I click on the Add Product field");
		driver.findElement(By.xpath("//*[@id=\"product\"]/li[2]/a")).click();
		
	}

	@And("I input Product ID as {string}")
	public void i_input_product_id_as(String id) {
		System.out.println(">> I input Product ID as :"+id);
		driver.findElement(By.xpath("//*[@id=\"vinputid\"]")).sendKeys("55");
		
	}

	@And("I enter the product name as {string}")
	public void i_enter_the_product_name_as(String pnm) {
		System.out.println(">> I enter the product name as :"+pnm);
		driver.findElement(By.xpath("//*[@id=\"vinputname\"]")).sendKeys("Mouse");
	}

	@And("I select the warehouse as {string}")
	public void i_select_the_warehouse_as(String warehouse) throws InterruptedException {
		System.out.println(">> I select the warehouse as :"+warehouse);
		WebElement ddown = driver.findElement(By.xpath(" //*[@id=\"warehouse1\"]"));
		Select select = new Select(ddown);

		select.selectByVisibleText("Ram");
		Thread.sleep(2000);
	}

	@And("I select the rack as {string}")
	public void i_select_the_rack_as(String rack) throws InterruptedException {
		System.out.println(">> I select the rack as :"+rack);
		WebElement rdown = driver.findElement(By.xpath("//*[@id=\"rack\"] "));
		Select select = new Select(rdown);

		select.selectByVisibleText("Sham");
		Thread.sleep(2000);
	}

	@And("I select the sub-rack as {string}")
	public void i_select_the_sub_rack_as(String subrack) throws InterruptedException {
		System.out.println(">> I select the sub-rack as :"+subrack);
		WebElement sdown = driver.findElement(By.xpath("//*[@id=\"Subrack\"] "));
		Select select = new Select(sdown);

		select.selectByVisibleText("RS");
		Thread.sleep(2000);
	}

	@And("I enter the price as {string}")
	public void i_enter_the_price_as(String price) {
		System.out.println(">> I enter the price as :"+price);
        driver.findElement(By.xpath("//*[@id=\"product-form\"]/div[3]/div[1]/input[1]")).sendKeys("200");
	}

	@And("I enter the opening stock as {string}")
	public void i_enter_the_opening_stock_as(String ostock) {
		System.out.println(">> I enter the opening stock as :"+ostock);
       driver.findElement(By.xpath("//*[@id=\"product-form\"]/div[3]/div[2]/input")).sendKeys("5");
	}

	@And("I choose VDE")
	public void i_choose_vde() throws InterruptedException {
		System.out.println(">> I choose VDE");
		WebElement sdown = driver.findElement(By.xpath(" //*[@id=\"vde\"]"));
		Select select = new Select(sdown);

		select.selectByVisibleText("D");
		Thread.sleep(2000);
	}

	@And("I select the machine name as {string}")
	public void i_select_the_machine_name_as(String mname) throws InterruptedException {
		System.out.println(">> I select the machine name as :"+mname);
		WebElement sdown = driver.findElement(By.xpath(" //*[@id=\"machine_name\"]"));
		Select select = new Select(sdown);

		select.selectByVisibleText("Other");
		Thread.sleep(2000);
	}

	@And("I enter the supplier name as {string}")
	public void i_enter_the_supplier_name_as(String sname) throws InterruptedException {
		System.out.println(">> I enter the supplier name as : "+sname);
		 // Locate the drop down element
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div[4]/div[2]/div/div[1]"));

        // Click on the drop down to expand the options
        dropdown.click();

        // Locate the desired option within the drop down
        WebElement option = driver.findElement(By.xpath("//*[@id=\"choices--supplier_name-item-choice-2\"]"));

        // Click on the option to select it
        option.click();

	}

	@And("I select the quality as {string}")
	public void i_select_the_quality_as(String qlty) throws InterruptedException {
		System.out.println(">> I select the quality as: " + qlty);
		// Locate the drop down element
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div[4]/div[3]/div/div[1]/div"));

        // Click on the drop down to expand the options
        dropdown.click();

        // Locate the desired option within the drop down
        WebElement option = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[4]/div[3]/div/div[2]/div/div[2]"));

        // Click on the option to select it
        option.click();
	}

	@And("I upload an image")
	public void i_upload_an_image() {
		System.out.println(">> I upload an image");
	
        driver.findElement(By.xpath("//*[@id=\"inputGroupFile01\"]")).sendKeys("C:\\1.jpg");
	}

	@And("I click on the Add Product button")
	public void i_click_on_the_add_product_button() {
		System.out.println(">> I click on the Add Product button");
        driver.findElement(By.xpath("//*[@id=\"product-form\"]/div[6]/div[1]/button")).click();
        driver.close();
	}

	@Then("The product should be successfully added")
	public void the_product_should_be_successfully_added() {
     System.out.println(">> The product should be successfully added");

	}
	
}
