package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver; 
	
	@Given("Open browser and hit the url")
	public void open_browser_and_hit_the_url() {
	   System.out.println(">> Open browser and hit the url");
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.manasvi.tech/Mayur_inventory");
	}

	@When("Admin enter username {string} and password {string}")
	public void admin_enter_username_and_password(String username, String password) {
		  System.out.println(">> Admin enter username: "+username+" and password :"+password);
		  driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("admin");
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("1");
	}

	@And("Click on login button")
	public void click_on_login_button() {
		  System.out.println(">> Click on login button");
		  driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/button")).click();
	}

	@Then("Admin must login and dashboard should display")
	public void admin_must_login_and_dashboard_should_display() {
		  System.out.println(">> Admin must login and dashboard should display");
		  
	}

	@When("Admin enter invalid username {string} and password {string}")
	public void admin_enter_invalid_username_and_password(String invalidusername, String password) {
		  System.out.println(">> Admin enter invalid username: "+invalidusername+" and password :"+password);
		  driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("Admin");
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("1");
	}

	@Then("Admin must get error message")
	public void admin_must_get_error_message() {
		  System.out.println(">> Admin must get error message");
		  
	}

	@When("Admin enter username {string} and invalid password {string}")
	public void admin_enter_username_and_invalid_password(String username, String invalidpassword) {
		  System.out.println(">> Admin enter username "+username+" and invalid password :"+invalidpassword);
		  driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("admin");
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("123");
	}

	@When("Admin enter Blank username {string} and blank password {string}")
	public void admin_enter_blank_username_and_blank_password(String busername, String bpassword) {
		  System.out.println(">> Admin enter Blank username: "+busername+" and blank password :"+bpassword);
		  driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).sendKeys("");
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
			 driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).sendKeys("");
	}

	@Then("Admin must get blank error message")
	public void admin_must_get_blank_error_message() {
		  System.out.println(">> Admin must get blank error message");
		  driver.close();
	}
	
}
