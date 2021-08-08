package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginObjects;
import pageObjects.ProfileObjects;

public class ProfileUpdate {

	@Test
	public void profile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, ProfileObjects.class);
		PageFactory.initElements(driver, LoginObjects.class);
		
		LoginObjects.uname.sendKeys("Admin");
		LoginObjects.pWord.sendKeys("admin123");
		LoginObjects.loginButton.click();
		
		ProfileObjects.myInfo.click();
		ProfileObjects.edit.click();
		ProfileObjects.empID.clear();
		ProfileObjects.empID.sendKeys("2345");
		ProfileObjects.save.click();
		
		
		/*LoginObjects.uName(driver).sendKeys("Admin");
		LoginObjects.pWord(driver).sendKeys("admin123");
		LoginObjects.loginButton(driver).click();

		Thread.sleep(3000);
		ProfileObjects.myInfo(driver).click();
		ProfileObjects.edit(driver).click();
		ProfileObjects.empID(driver).clear();
		ProfileObjects.empID(driver).sendKeys("3452");
		
		ProfileObjects.save(driver).click();*/
		
	}

}
