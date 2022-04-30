package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	private WebDriver driver;
	
	@FindBy(id = "reg_username")
	WebElement registerUsernameInput;
	
	@FindBy(id = "reg_email")
	WebElement registerEmailInput;
	
	@FindBy(id = "reg_password")
	WebElement registerPasswordInput;
	
	@FindBy(name = "register")
	WebElement registerButton;
	
	@FindBy(xpath = "//*[@class='woocommerce-error']/li")
	WebElement existingEmailErrorText;
	
	public RegisterPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage setTextRegisterUsernameInput(String username) {
		registerUsernameInput.sendKeys(username);
		return this;
	}
	
	public RegisterPage setTextRegisterEmailInput(String email) {
		registerEmailInput.sendKeys(email);
		return this;
	}
	
	public RegisterPage setTextRegisterPasswordInput(String password) {
		registerPasswordInput.sendKeys(password);
		return this;
	}
	
	public RegisterPage clickRegisterButton() {
		registerButton.click();
		return this;
	}
	
	public boolean  isDisplayedExistingEmailErrorText() {
		return existingEmailErrorText.isDisplayed();
	}
	
	//Commot functions
	public void registerAccount(String username, String email, String password) {
		registerUsernameInput.sendKeys(username);
		registerEmailInput.sendKeys(email);
		registerPasswordInput.sendKeys(password);
		registerButton.click();
	}	
}
