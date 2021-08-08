package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjects {
	
	
	@FindBy(name="txtUsername")
	public static WebElement uname;
	@FindBy(id="txtPassword")
	public static WebElement pWord;
	@FindBy(id="btnLogin")
	public static WebElement loginButton;
	


	/*
		public static WebElement uName(WebDriver driver) {
			return driver.findElement(By.id("txtUsername"));	
		}
		
		public static WebElement pWord(WebDriver driver) {
			return driver.findElement(By.id("txtPassword"));
		}
		public static WebElement loginButton(WebDriver driver) {
			return driver.findElement(By.id("btnLogin"));
		}
	*/

	

}
