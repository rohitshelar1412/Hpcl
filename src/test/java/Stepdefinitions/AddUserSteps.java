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

public class AddUserSteps {

	WebDriver driver;

	@Given("Login into the  website with valid data enter username {string} and password {string}")
	public void login_into_the_website_with_valid_data_enter_username_and_password(String username, String password)
			throws InterruptedException {
		System.out.println(">> Login into the  website with valid data enter username :" + username + " and password :"
				+ password);

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

	@When("Click on settings button")
	public void click_on_settings_button() throws InterruptedException {
		System.out.println(">> Click on settings button");
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[7]/a")).click();
		Thread.sleep(2000);
	}

	@And("Click on Add User button")
	public void click_on_add_user_button() throws InterruptedException {
		System.out.println(">> Click on Add User button");
		driver.findElement(By.xpath("//*[@id=\"settings\"]/li[3]/a")).click();
		Thread.sleep(2000);
	}

	@And("Click on add button and enter data in all fields")
	public void click_on_add_button_and_enter_data_in_all_fields() throws InterruptedException {
		System.out.println(">> Click on add button and enter data in all fields");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div/h3/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[1]/input")).clear();
		driver.findElement(By.xpath("//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[1]/input")).sendKeys("MS");
		
		driver.findElement(By.xpath("//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[2]/input")).sendKeys("ms@gmail.com");
		
		WebElement Dropdown = driver.findElement(By.xpath("//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[3]/select"));
		Select serviceSelect = new Select(Dropdown);
		serviceSelect.selectByVisibleText("User");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[4]/input")).clear();
		driver.findElement(By.xpath("//div[@id=\"modal-space\"]/div/div/div/div[2]/form/div/div[4]/input")).sendKeys("MS123");
		driver.findElement(By.xpath("//*[@id=\"butsave\"]")).click();
	}

	@Then("User add successfully")
	public void user_add_successfully() {
		System.out.println(">> User add successfully");

	}

	@And("Click on delete button  of user")
	public void click_on_delete_button_of_user() {
		System.out.println("Click on delete button  of user");
		// Scroll down using JavaScript Executor

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");

		driver.findElement(By.xpath("//*[@id=\"table-body-addUsers\"]/tr[6]/td[6]/i")).click();

		Alert alert = driver.switchTo().alert();

		// Accept the alert (click OK)
		alert.accept();
	}

	@Then("User delete successfully")
	public void user_delete_successfully() {
		System.out.println(">> User delete successfully");

	}

}
