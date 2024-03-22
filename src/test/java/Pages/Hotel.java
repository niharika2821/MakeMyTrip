package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hotel {
	WebDriver driver;
	public Hotel(WebDriver driver) {
		this.driver=driver;	
	}
	By hotel=By.id("radiobutton_1");
	By click=By.id("continue");
	public void selecthotel() {
		driver.findElement(hotel).click();
	}
	public void continueclick() {
		driver.findElement(click).click();
	}

}

