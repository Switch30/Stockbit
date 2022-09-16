package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class test3 {
	
	WebDriver driver = null;
	
	@Given("User3 go to “https:\\/\\/demoqa.com\\/books”")
	public void user_go_to_https_demoqa_com_books() {
		System.out.println("Inside 1");
		System.setProperty("webdriver.chrome.driver","D:\\Oracle\\Stockbit\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/books");
	}

	@When("User3 in “Book Store” page")
	public void user_in_book_store_page() {
		System.out.println("Inside 2");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books"); 
	}
	@And("User3 search book “Git Pocket Guide”")
	public void user_search_book_git_pocket_guide() {
		System.out.println("Inside 3");
		WebElement search = driver.findElement(By.id("searchBox"));
		search.sendKeys("Git Pocket Guide");
	}

	@And("User3 click book “Git Pocket Guide”")
	public void user_click_book_git_pocket_guide() {
		System.out.println("Inside 4");
		WebElement book = driver.findElement(By.id("see-book-Git Pocket Guide"));
		book.click();
	}

	@Then("User3 see “Git Pocket Guide”")
	public void user_see_git_pocket_guide() {
		System.out.println("Inside 5");
		Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'Git Pocket Guide')]")).getText(), "Git Pocket Guide"); 
	}
}
