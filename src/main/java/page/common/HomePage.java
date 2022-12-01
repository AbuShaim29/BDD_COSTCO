package page.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
import common.CommonWaits;

public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//a[@id='header_sign_in']")
	WebElement signInButtonElement;
	@FindBy(xpath = "//input[@id='signInName']")
    WebElement emailElement;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordElement;
	@FindBy(xpath = "//button[@id='next']")
	WebElement signInElement;
	
	
	public void clicksignIn() {
		click(signInButtonElement);
	}
	public void inputemail(String email) {
		input(emailElement, email);
	}
	
	public void inputPassword(String password) {
		input(passwordElement, password);
	}
	public void clicksignIn2() {
		click(signInElement);
	}
	
	
	public void LoginSteps(String email,String password) {
		click(signInButtonElement);
		input(emailElement, email);
		input(passwordElement, password);
		click(signInElement);
	}
	
}
