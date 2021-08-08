package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileObjects {
	
	@FindBy(xpath = "//b[contains(text(),'My Info')]")
	public static WebElement myInfo;
	@FindBy(xpath = "//input[@id='btnSave']")
	public static WebElement edit;
	@FindBy(xpath = "//input[@id='personal_txtEmployeeId']")
	public static WebElement empID;
	@FindBy(xpath = "//input[@id='btnSave']")
	public static WebElement save;
	
	
	
	
	/*public static WebElement myInfo(WebDriver driver) {
		return driver.findElement(By.xpath("//b[contains(text(),'My Info')]"));
	}
	
	public static WebElement edit(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='btnSave']"));
	}
	
	public static WebElement empID(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
	}
	
	
	public static WebElement save(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='btnSave']"));
	}*/
	
	
	

	
}
