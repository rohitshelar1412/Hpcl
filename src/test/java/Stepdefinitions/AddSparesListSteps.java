package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddSparesListSteps {

	WebDriver driver;
	
	@Given("Login into the  website with correct data enter username {string} and password {string}")
	public void login_into_the_website_with_correct_data_enter_username_and_password(String username, String password) throws InterruptedException {
    System.out.println(">> Login into the  website with correct data enter username :"+username+" and password :"+password);

    
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

	@And("Click on spares list button")
	public void click_on_spares_list_button() throws InterruptedException {
		System.out.println(">> Click on spares list button");
      driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[8]/a")).click();
      Thread.sleep(2000);
	}

	@And("Click on boom button")
	public void click_on_boom_button() throws InterruptedException {
		System.out.println(">> Click on boom button");
		driver.findElement(By.xpath("//*[@id=\"data\"]/li[1]/a")).click();
	      Thread.sleep(2000);
	}

	@And("Click on add data button and enter data in all fields")
	public void click_on_add_data_button_and_enter_data_in_all_fields() throws InterruptedException {
		System.out.println(">> Click on add data button and enter data in all fields");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div/a")).click();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//*[@id=\"sub_category\"]")).sendKeys("SSS");//Sub Category
	      driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("Cutter");//Equipment Name
	      driver.findElement(By.xpath("//*[@id=\"part_name\"]")).sendKeys("Hammer");//Part Name
	      driver.findElement(By.xpath("//*[@id=\"part_no\"]")).sendKeys("2");//Part No
	      driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("100");//Quantity
	      driver.findElement(By.xpath("//*[@id=\"condition\"]")).sendKeys("Good");//Condition
	      driver.findElement(By.xpath("//*[@id=\"per_unit_value\"]")).sendKeys("10");//Per Unit Value
	      driver.findElement(By.xpath("//*[@id=\"location_in_warehouse\"]")).sendKeys("Nashik");//Location in warehouse
	      driver.findElement(By.xpath("//*[@id=\"pis_matrix\"]")).sendKeys("ws");//PIS Matrix
	      driver.findElement(By.xpath("//*[@id=\"pp_matrix\"]")).sendKeys("ms");//PP Matrix
	      
	      driver.findElement(By.xpath("//*[@id=\"supplier-form\"]/div[7]/div/button")).click();//click on add button
	}

	@Then("Spares list add successfully")
	public void spares_list_add_successfully() {
		System.out.println(">> Spares list add successfully");

	}
	
}
