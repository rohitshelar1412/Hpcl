package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShowWarehouseSteps {

	WebDriver driver;
	@Given("Open the browser and hit the url")
	public void open_the_browser_and_hit_the_url() {
		System.out.println(">> Open the browser and hit the url ");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.manasvi.tech/Mayur_inventory");
	}

	@And("Admin enter valid username {string} and password {string}")
	public void admin_enter_valid_username_and_password(String username, String password) throws InterruptedException {
		System.out.println(">>  Admin enter valid username :"+username+" and password :"+password);
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input"))
				.sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input"))
				.sendKeys("1");
		Thread.sleep(2000);
	}

	@And("Click on login button and go to home page")
	public void click_on_login_button_and_go_to_home_page() {
		System.out.println(">>  Click on login button and go to home page");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/button")).click();
	}

	@And("Click on inventory structure button")
	public void click_on_inventory_structure_button() throws InterruptedException {
		System.out.println(">>  Click on inventory structure button");
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
	}

	@And("Click on show warehouse button")
	public void click_on_show_warehouse_button() throws InterruptedException {
		System.out.println(">>  Click on show warehouse button");
		driver.findElement(By.xpath("//*[@id=\"inventory_structure\"]/li[2]/a")).click();
		Thread.sleep(2000);
	}

	@Then("Select warehouse name")
	public void select_warehouse_name() {
	    System.out.println(">>  Select warehouse name");
	    WebElement ddown=driver.findElement(By.xpath("//*[@id=\"dashboard_warehouse\"]"));
	    Select select=new Select (ddown);
	    
	    select.selectByVisibleText("Ram");
	    driver.close();
	}

}
