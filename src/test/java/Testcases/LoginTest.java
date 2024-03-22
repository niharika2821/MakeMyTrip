package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Location;
import Pages.LoginPage;
import Pages.Hotel;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		LoginPage obj=new LoginPage(driver);
		obj.enterusername("vasuvespag");
		obj.enterpassword("vasu1234");
		obj.loginclick();
		Location obj1=new Location(driver);
		obj1.selectlocation("New York");
		obj1.submitclick();	
		Hotel obj2=new Hotel(driver);
		obj2.selecthotel();
		obj2.continueclick();
		
		}
		// TODO Auto-generated method stub

	}

