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

public class ProductReportSteps {

	WebDriver driver;
	
	@Given("We login into website enter username {string} and password {string}")
	public void we_login_into_website_enter_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("<< We login into website enter username :" + username + " and password :" + password);
		
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

	@When("Click on the reports label")
	public void click_on_the_reports_label() throws InterruptedException {
		System.out.println("<< Click on the reports label");
       driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[6]/a")).click();
       Thread.sleep(2000);
	}

	@And("Click on the product report label")
	public void click_on_the_product_report_label() {
		System.out.println("<< Click on the product report label");
		driver.findElement(By.xpath("//*[@id=\"reports\"]/li[1]/a")).click();
	}

	@And("Select From field date")
	public void select_from_field_date() {
		System.out.println("<< Select From field date");
		driver.findElement(By.xpath("//*[@id=\"from_date\"]")).sendKeys("01062023");
	}

	@And("Select To field date")
	public void select_to_field_date() {
		System.out.println("<< Select To field date");
		driver.findElement(By.xpath("//*[@id=\"todate\"]")).sendKeys("12072023");
	}

	@And("Select product dropdown")
	public void select_product_dropdown() {
		System.out.println("<< Select product dropdown");
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id=\"product\"]"));
		Select serviceSelect = new Select(Dropdown);
		serviceSelect.selectByVisibleText("pen");
	}

	@And("Click on generate report button")
	public void click_on_generate_report_button() {
		System.out.println("<< Click on generate report button");
		driver.findElement(By.xpath("//*[@id=\"before_report\"]/form/div[2]/div/input")).click();
	}

	@Then("Report should be Show successfully")
	public void report_should_be_show_successfully() {
		System.out.println("<< Report should be Show successfully");
         driver.close();
	}
}
