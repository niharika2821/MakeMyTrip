package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	By UserName=By.id("username");
	By Password=By.id("password");
	By login=By.id("login");
	public void enterusername(String user) {
	driver.findElement(UserName).sendKeys(user);
	}
	public void enterpassword(String pass) {
		driver.findElement(Password).sendKeys(pass);
	}
	public void loginclick() {
		driver.findElement(login).click();
		
	}
	
	

}
