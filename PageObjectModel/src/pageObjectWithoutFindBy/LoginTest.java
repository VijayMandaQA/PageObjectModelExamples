package pageObjectWithoutFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginObjects;

public class LoginTest {
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, LoginTest.class);
		
		LoginObjects.uname.sendKeys("Admin");
		LoginObjects.pWord.sendKeys("admin123");
		LoginObjects.loginButton.click();
	}
}
