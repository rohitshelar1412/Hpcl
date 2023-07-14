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

public class AddSubRackSteps {

	WebDriver driver;

	@Given("Open the browser and hit url")
	public void open_the_browser_and_hit_url() {
		System.out.println(">> Open the browser and hit url ");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.manasvi.tech/Mayur_inventory");
	}

	@When("Admin enter valid username {string} and valid password {string}")
	public void admin_enter_valid_username_and_valid_password(String string, String string2)
			throws InterruptedException {
		System.out.println(">> Admin enter valid username {string} and valid password {string} ");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[1]/input"))
				.sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/div[2]/input"))
				.sendKeys("1");
		Thread.sleep(2000);
	}

	@And("Click on login button and go to home page of inventory")
	public void click_on_login_button_and_go_to_home_page_of_inventory() {
		System.out.println(">> Click on login button and go to home page of inventory ");
		driver.findElement(By.xpath("//*[@id=\"back_img\"]/section/div/div/div/div/div/form/button")).click();
	}

	@And("Click on sub rack  button")
	public void click_on_sub_rack_button() throws InterruptedException {
		System.out.println(">> Click on sub rack  button ");
		driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul[1]/li[3]/a")).click();
		Thread.sleep(2000);
	}

	@And("Click on add sub rack button")
	public void click_on_add_sub_rack_button() throws InterruptedException {
		System.out.println(">> Click on add sub rack button ");
		driver.findElement(By.xpath("//*[@id=\"subrack\"]/li[1]/a")).click();
		Thread.sleep(2000);
	}

	@And("Select warehouse")
	public void select_warehouse() throws InterruptedException {
		System.out.println(">> Select warehouse ");
		WebElement ddown = driver.findElement(By.xpath("//*[@id=\"warehouse\"]"));
		Select select = new Select(ddown);

		select.selectByVisibleText("Ram");
		Thread.sleep(2000);
	}

	@And("Select rack")
	public void select_rack() throws InterruptedException {
		System.out.println(">> Select rack ");
		WebElement dropdown = driver.findElement(By.id("rack"));
		Select select = new Select(dropdown);

		select.selectByVisibleText("Sham");
		Thread.sleep(2000);

	}

	@And("Enter Number of sub rack {string}")
	public void enter_number_of_sub_rack(String num) throws InterruptedException {
		System.out.println(">> Enter Number of sub rack : " + num);
		driver.findElement(By.xpath("//*[@id=\"Subrack\"]")).sendKeys("1");
		Thread.sleep(2000);
	}

	@And("Enter sub rack name {string}")
	public void enter_sub_rack_name(String name) throws InterruptedException {
		System.out.println(">> Enter sub rack name : " + name);
		driver.findElement(By.xpath("//*[@id=\"sub[]\"]")).sendKeys("RS");
		Thread.sleep(2000);
	}

	@And("Click on add subrack")
	public void click_on_add_subrack() throws InterruptedException {
		System.out.println(">> Click on add subrack");
		driver.findElement(By.xpath("//*[@id=\"Hide\"]/input")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Then("Sub rack added successfully")
	public void sub_rack_added_successfully() {
		System.out.println(">> Sub rack added successfully");

	}

	@And("Enter two sub rack {string}")
	public void enter_two_sub_rack(String twonum) throws InterruptedException {
		System.out.println(">> Enter two sub rack :"+twonum);
		driver.findElement(By.xpath("//*[@id=\"Subrack\"]")).sendKeys("2");
		Thread.sleep(2000);
	}

	@And("Enter sub rack name {string} and {string}")
	public void enter_sub_rack_name_and(String nm1, String nm2) throws InterruptedException {
		System.out.println(">>  Enter sub rack name :" + nm1 + " and :" + nm2);
		driver.findElement(By.xpath("//label[text()=\"Subrack No 1\"]//input")).sendKeys("NS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=\"Subrack No 2\"]//input")).sendKeys("SS");
	}
}
