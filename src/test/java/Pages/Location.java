package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Location {
	WebDriver driver;
	public Location(WebDriver driver) {
		this.driver=driver;
	}
	By Place=By.id("location");
	By click=By.id("Submit");
	public void selectlocation(String select) {
		WebElement city=driver.findElement(Place);
		Select value =new Select((city));
		value.selectByVisibleText("New York");
	}
	public void submitclick() {
		driver.findElement(click).click();
	}
	
	

}
