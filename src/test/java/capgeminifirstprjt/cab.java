package capgeminifirstprjt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cab {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-frame']"));
		driver.switchTo().frame(frame); 
		WebElement clsBtn =driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"));
		clsBtn.click();
		String parentWindowHandle=driver.getWindowHandle();
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chCabs']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
		city.click();
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		//span[text()="Hyderabad"]
//		Actions actions = new Actions(driver);
//		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
//		.sendKeys(Keys.ENTER).build().perform();
		// TODO Auto-generated method stub

	}

}
