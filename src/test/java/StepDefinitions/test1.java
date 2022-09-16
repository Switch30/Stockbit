package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import io.cucumber.java.en.*;
import org.junit.Assert;

public class test1 {

	WebDriver driver = null;
	
	@Given("User1 go to “https:\\/\\/demoqa.com\\/select-menu”")
	public void user_go_to_https_demoqa_com_select_menu() {
		System.out.println("Inside 1");
		System.setProperty("webdriver.chrome.driver","D:\\Oracle\\Stockbit\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver(); 
		
		driver.navigate().to("https://demoqa.com/select-menu");
	}

	@When("User1 in “select menu” page")
	public void user_in_select_menu_page() {
		System.out.println("Inside 2");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/select-menu"); 
	}

	@And("User1 choose select value “Another root option”")
	public void user_choose_select_value_another_root_option() throws InterruptedException {
		System.out.println("Inside 3");
		WebElement dropdown = driver.findElement(By.id("withOptGroup"));
		dropdown.click();
		
		WebElement value1 = driver.findElement(By.xpath("//*[contains(text(),'Another root option')]"));
		value1.click();
	}

	@And("User1 choose select one “Other”")
	public void user_choose_select_one_other() throws InterruptedException {
		System.out.println("Inside 4");
		WebElement dropdown = driver.findElement(By.id("selectOne"));
		dropdown.click();
		
		WebElement value1 = driver.findElement(By.xpath("//*[contains(text(),'Other')]"));
		value1.click();
	}

	@And("User1 choose old style select menu “Aqua”")
	public void user_choose_old_style_select_menu_aqua() throws InterruptedException {
		System.out.println("Inside 5");
		Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		se.selectByVisibleText("Aqua");
	}

	@And("User1 choose multi select drop down “all color”")
	public void user_choose_multi_select_drop_down_all_color() throws InterruptedException, AWTException {
		System.out.println("Inside 6");
		WebElement value1 = driver.findElement(By.xpath("//*[contains(text(),'Select...')]"));
		value1.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_ENTER); //press enter key
			robot.keyRelease(KeyEvent.VK_ENTER); //release enter key
		}
		
	}

	@Then("User1 success input all select menu")
	public void user_success_input_all_select_menu() {
		System.out.println("Inside 7");
	}
	
}
