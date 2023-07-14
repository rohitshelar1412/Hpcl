package Stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddWarehouseSteps {

	WebDriver driver;

	@Given("Open browser and hit the url and user must be login Admin enter username {string} and password {string}")
	public void open_browser_and_hit_the_url_and_user_must_be_login_admin_enter_username_and_password(String username,
			String password) throws InterruptedException {
		System.out.println(">> Open browser and hit the url and user must be login Admin enter username : " + username
				+ " and password :" + password);
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

	@When("user click on Inventory structure button and add warehouse button")
	public void user_click_on_inventory_structure_button_and_add_warehouse_button() throws InterruptedException {
		System.out.println(">> user click on Inventory structure button and add warehouse button");

		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"inventory_structure\"]/li[1]/a")).click();
	}

	@And("Enter number  {string} on no of warehouse field")
	public void enter_number_on_no_of_warehouse_field(String number) throws InterruptedException {
		System.out.println(">> Enter number : " + number + " on no of warehouse field");
		driver.findElement(By.xpath("//*[@id=\"warehouse\"]")).sendKeys("1");
		Thread.sleep(2000);
	}

	@And("Click on add button")
	public void click_on_add_button() throws InterruptedException {
		System.out.println(">> Click on add button");
		driver.findElement(By.xpath("//*[@id=\"addwarehouse\"]")).click();
		Thread.sleep(2000);

	}

	@And("if alert is present accept")
	public void if_alert_is_present_accept() {
		System.out.println(">> if alert is present accept");
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

	
	}

	@And("Enter warehouse name {string}")
	public void enter_warehouse_name(String nm) throws InterruptedException {
		System.out.println(">> Enter warehouse name :" + nm);
		driver.findElement(By.xpath("//*[@id=\"0\"]")).sendKeys("Ram");
		Thread.sleep(2000);
	}

	@And("Enter rack number {string}")
	public void enter_rack_number(String rnum) throws InterruptedException {
		System.out.println(">> Enter rack number :" + rnum);
		driver.findElement(By.xpath("//*[@id=\"10\"]")).sendKeys("1");
		Thread.sleep(2000);
	}

	@And("click on next button")
	public void click_on_next_button() throws InterruptedException {
		System.out.println(">> click on next button");
		driver.findElement(By.xpath("//*[@id=\"togglee\"]")).click();
		Thread.sleep(2000);
	}

	@And("Enter rack name {string}")
	public void enter_rack_name(String rnm) throws InterruptedException {
		System.out.println(">> Enter rack name :" + rnm);
		driver.findElement(By.xpath("//*[@id=\"20\"]")).sendKeys("Sham");
		Thread.sleep(2000);
	}

	@And("Click on finish button")
	public void click_on_finish_button() {
		System.out.println(">> Click on finish button");
		driver.findElement(By.xpath("//*[@id=\"togglee\"]")).click();

	}

	@Then("Warehouse should be added")
	public void warehouse_should_be_added() {
		System.out.println(">> Warehouse should be added");
		driver.close();
	}

	@And("Enter invalid number  {string} on no of warehouse field")
	public void enter_invalid_number_on_no_of_warehouse_field(String innumber) throws InterruptedException {
		System.out.println(">> Enter invalid number :" + innumber + " on no of warehouse field");
		driver.findElement(By.xpath("//*[@id=\"warehouse\"]")).sendKeys("A");

		Thread.sleep(2000);
	}

	
	@Then("Warning message should be display")
	public void warning_message_should_be_display() {
		System.out.println(">> Warning message should be display");

		driver.close();
	}

	@And("Enter Blank number  {string} on no of warehouse field")
	public void enter_blank_number_on_no_of_warehouse_field(String bnumber) throws InterruptedException {
		System.out.println(">> Enter Blank number  :" + bnumber + " on no of warehouse field");
		driver.findElement(By.xpath("//*[@id=\"warehouse\"]")).sendKeys("");

		Thread.sleep(2000);
	}

	
}
