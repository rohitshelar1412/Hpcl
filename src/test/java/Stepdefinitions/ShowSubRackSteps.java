package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShowSubRackSteps {

	WebDriver driver;

	@Given("Open the Webbrowser and hit the url")
	public void open_the_webbrowser_and_hit_the_url() {
		System.out.println("<< Open the Webbrowser and hit the url");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.manasvi.tech/Mayur_inventory");
	}

	@When("Admin enter valid username {string} and valid password {string} of website")
	public void admin_enter_valid_username_and_valid_password_of_website(String username, String password)
			throws InterruptedException {
		System.out.println(
				"<< Admin enter valid username :" + username + " and valid password : " + password + " of website");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input"))
				.sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input"))
				.sendKeys("1");
		Thread.sleep(2000);
	}

	@And("Click on login button and go to main  page")
	public void click_on_login_button_and_go_to_main_page() {
		System.out.println("<< Click on login button and go to main  page");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/button")).click();
	}

	@When("Click on add subrack button")
	public void click_on_add_subrack_button() throws InterruptedException {
		System.out.println("<< Click on add subrack button");
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[3]/a")).click();
		Thread.sleep(2000);
	}

	@When("Click on show Subrack button")
	public void click_on_show_subrack_button() {
		System.out.println("<< Click on show Subrack button");
		driver.findElement(By.xpath("//*[@id=\"subrack\"]/li[2]/a")).click();
	}

	@When("Select warehouse from dropdown")
	public void select_warehouse_from_dropdown() throws InterruptedException {
		System.out.println("<< Select warehouse from dropdown");
		WebElement ddown = driver.findElement(By.xpath("//*[@id=\"Warehouse\"]"));
		Select select = new Select(ddown);

		select.selectByVisibleText("Ram");
		Thread.sleep(2000);
	}

	@When("Select rack from dropdown")
	public void select_rack_from_dropdown() throws InterruptedException {
		System.out.println("<< Select rack from dropdown");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"rack\"]"));
		Select select = new Select(dropdown);

		select.selectByVisibleText("Sham");
		Thread.sleep(2000);
	}

	@Then("Sub Rack should be show")
	public void sub_rack_should_be_show() {
		System.out.println("<< Sub Rack should be show");

	}

	@When("Click on delete button")
	public void click_on_delete_button() {
		System.out.println("<< Click on delete button");
		driver.findElement(By.xpath("//*[@id=\"Subrack\"]/div[3]/div/div/div[2]/a[2]")).click();
		driver.close();
	}

	@Then("Sub Rack should be deleted successfully")
	public void sub_rack_should_be_deleted_successfully() {
		System.out.println("<< Sub Rack should be deleted successfully");

	}

}
