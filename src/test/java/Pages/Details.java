package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Details {
	WebDriver driver;
	public Details(WebDriver driver) {
		this.driver=driver;
	}
	By Fname=By.id("first_name");
	By Lname=By.id("last_name");
	By address=By.id("address");
	By creditnum=By.id("cc_num");
	By credittype=By.id("cc_type");
	By creditmonth=By.id("cc_exp_month");
	By credityear=By.id("cc_exp_year");

}
