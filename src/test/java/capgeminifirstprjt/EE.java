package capgeminifirstprjt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EE {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHolidays']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Robot robo=new Robot();
//		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
//		city.click();
		robo.keyPress(KeyEvent.VK_ESCAPE);
		robo.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement fromField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter City']")));
		Thread.sleep(5000);
		WebElement city1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@text()='Explore Europe']")));
		city1.click();
	
}

}
