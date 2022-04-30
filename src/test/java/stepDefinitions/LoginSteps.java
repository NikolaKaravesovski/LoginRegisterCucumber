package stepDefinitions;

import static org.junit.Assert.assertTrue;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Common;
import objects.Header;
import objects.LoginPage;
import objects.RegisterPage;

public class LoginSteps {

	public WebDriver driver = new ChromeDriver();
	public Header headerobj = new Header(driver);
	public RegisterPage registerobj = new RegisterPage(driver);
	public LoginPage loginobj = new LoginPage(driver);
	public Common commonobj = new Common(driver);

	@Before
	public void setUp() {
		driver.manage().window().maximize();
		commonobj.testSetUp();
	}

	@After
	public void burnDown() throws InterruptedException {
		commonobj.testTearDown();
	}

	@Given("^.+ opened the browser and navigated to login page")
	public void openBrowse() {
		headerobj.clickAccountLink();
	}

	@When("^I login in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void insertValidUsernameAndPassword(String arg1, String arg2) throws InterruptedException {
		loginobj.loginAccount(arg1, arg2);
	}

	@Then("^I should be redirected to (.+?) page$")
	public void validateAccountPage(String arg1) {
		if (arg1.equals("accoint")) {
			Boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"post-9\"]/div/nav")).isDisplayed();
			assertTrue(isDisplayed);
			driver.close();
		} else if (arg1.equals("login")) {
			Boolean isDisplayed = driver.findElement(By.name("login")).isDisplayed();
			assertTrue(isDisplayed);
		}
	}

	@When("^I register with username \"([^\"]*)\" password \"([^\"]*)\" and email \"([^\"]*)\"$")

	public void populateRegistrationForm(String arg1, String arg2, String arg3) throws InterruptedException {

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		if (arg1.equals("random")) {
			arg1 = "test" + Integer.toString(randomInt);
		}
		if (arg3.equals("random")) {
			arg3 = "test" + Integer.toString(randomInt) + "@test.te";
		}
		registerobj.registerAccount(arg1, arg3, arg2);
	}
}