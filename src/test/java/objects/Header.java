package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
private WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"masthead\"]/div/div/div[4]/div/a")
	WebElement clickAccountLinkBtn;
	
	@FindBy(xpath = "(//span[text()='Products']/parent::a)[1]")
	WebElement clickProductLinkBtn;
	
	
	public Header(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}
	
	public Header clickProductLinkBtn() {
		clickProductLinkBtn.click();
		return this;
	}
	
	public Header clickAccountLink() {
		clickAccountLinkBtn.click();
		return this;
	}
}
