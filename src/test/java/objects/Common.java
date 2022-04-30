package objects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common {
	private WebDriver driver;
	
	public void testSetUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("http://qacourse.churlinoski.mk/");
		driver.findElement(By.xpath("//*[@class=\"woocommerce-store-notice__dismiss-link\"]")).click();
	}
	
	public void testTearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	public Common(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	public int generateRndForReg() {
		Random randomGenerator = new Random();
        return randomGenerator.nextInt(100000);
	}
}
