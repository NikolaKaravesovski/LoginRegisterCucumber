package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	@FindBy(id = "username")
	 
	 WebElement loginUsernameInput;
	
	@FindBy(id = "password")
	 
	 WebElement loginPasswordInput;
	
	@FindBy(name = "rememberme")
	WebElement loginRememberMeButton;
	
	@FindBy(name = "login")
	 
     WebElement loginButton;
  
     public LoginPage(WebDriver webDriver) {
		  this.driver = webDriver;
		  PageFactory.initElements(driver,this);
	  }
	 
	
	 public void loginAccount(String username,String password) {
		 
		 loginUsernameInput.sendKeys(username);
		 loginPasswordInput.sendKeys(password);
		 loginRememberMeButton.click();
		 loginButton.click();
	 }
}
