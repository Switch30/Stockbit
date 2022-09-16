package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class test2 {

	WebDriver driver = null;
	
	@Given("User2 go to “https:\\/\\/demoqa.com\\/books”")
	public void user_go_to_https_demoqa_com_books() {
		System.out.println("Inside 1");
		System.setProperty("webdriver.chrome.driver","D:\\Oracle\\Stockbit\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/books");
	}

	@When("User2 in “Book Store” page")
	public void user_in_book_store_page() {
		System.out.println("Inside 2");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books"); 
	}

	@And("User2 search book “qa engineer”")
	public void user_search_book_qa_engineer() {
		System.out.println("Inside 3");
		WebElement search = driver.findElement(By.id("searchBox"));
		search.sendKeys("qa engineer");
	}

	@Then("User2 see “No rows found”")
	public void user_see_no_rows_found() {
		System.out.println("Inside 4");
		Assert.assertEquals(driver.findElement(By.className("rt-noData")).getText(), "No rows found"); 
	}
}
