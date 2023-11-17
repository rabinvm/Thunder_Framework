package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class itemssearches {
	WebDriver driver;
	
	
	
	//;lksjd;lkjf ;oalsd.
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		////idjo;ajsd
		///jnkdjhasdl kfhjla ksdh flkasjdi
	}
	@When("I enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String string) {
		WebElement searchbar = driver.findElement(By.id("APjFqb"));
		searchbar.sendKeys(string);
	}
	@When("I click on the search botton")
	public void i_click_on_the_search_botton() {
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.submit();
	}
	@Then("I can see the search results successfully")
	public void i_can_see_the_search_results_successfully() {
		WebElement searchresults = driver.findElement(By.id("result-stats"));
		System.out.println("==========================");
		String resultText = searchresults.getText();
		System.out.println(resultText);
		System.out.println("===================");
		Assert.assertTrue(searchresults.isDisplayed());
		driver.quit();
	}
}
