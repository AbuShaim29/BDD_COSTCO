package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
WebDriver driver;
WebElement element;
	
	
	@Given("user navigate to homepage")
	public void user_navigate_to_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.costco.com/");
	   System.out.println("This is given");
	}
	

	@Then("user click on sign In button")
	public void user_click_on_sign_in_button() {
		element = driver.findElement(By.xpath("//a[@id='header_sign_in']"));
		element.click();
		 System.out.println("This is Then");
	}

	@Then("user input email")
	public void user_input_email() {
		element = driver.findElement(By.xpath("//input[@id='signInName']"));
		element.sendKeys("abcd21@gmail.com");
		 System.out.println("This is Then");
	}

	@Then("user input password")
	public void user_input_password() {
		element =driver.findElement(By.xpath("//input[@id='password']"));
		element.sendKeys("123456");
		 System.out.println("This is Then");  
	}

	@Then("click on sign in button")
	public void click_on_sign_in_button() {
		element=driver.findElement(By.xpath("//button[@id='next']"));
		 System.out.println("This is Then");
	    	}
}
