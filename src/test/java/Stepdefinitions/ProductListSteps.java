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

public class ProductListSteps {

	WebDriver driver;
	
	@Given("login into the  website enter username {string} and password {string} click login button")
	public void login_into_the_website_enter_username_and_password_click_login_button(String username, String password) throws InterruptedException {
     System.out.println(">> login into the  website enter username :"+username+" and password :"+password+" click login button");

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

	@When("Click on reports label")
	public void click_on_reports_label() throws InterruptedException {
		System.out.println(">> Click on reports label");
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[6]/a")).click();
	       Thread.sleep(2000);
	}

	@And("Click on the product List label")
	public void click_on_the_product_list_label() {
		System.out.println(">> Click on the product List label");
     driver.findElement(By.xpath("//*[@id=\"reports\"]/li[2]/a")).click();
	}

	@And("Select machine name dropdown")
	public void select_machine_name_dropdown() throws InterruptedException {
		System.out.println(">> Select machine name dropdown");
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"machine_name\"]"));
		Select serviceSelect = new Select(Dropdown);
		serviceSelect.selectByVisibleText("All");
		Thread.sleep(2000);
	}

	@And("Select product name dropdown")
	public void select_product_name_dropdown() throws InterruptedException {
		System.out.println(">> Select product name dropdown");
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id=\"product\"]"));
		Select serviceSelect = new Select(Dropdown);
		serviceSelect.selectByVisibleText("All");
		Thread.sleep(2000);
	}

	@And("Select company name dropdown")
	public void select_company_name_dropdown() throws InterruptedException {
		System.out.println(">> Select company name dropdown");
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"supplier\"]"));
		Select serviceSelect = new Select(Dropdown);
		serviceSelect.selectByVisibleText("All");
		Thread.sleep(2000);
	}

	@And("Click on generate report label")
	public void click_on_generate_report_label() {
		System.out.println(">> Click on generate report label");
         driver.findElement(By.xpath("//*[@id=\"before_report\"]/form/div[2]/div/input")).click();
	}

	@Then("Report list should be Show successfully")
	public void report_list_should_be_show_successfully() {
		System.out.println(">> Report list should be Show successfully");

	}
}
