package capgeminifirstprjt;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
	public class MakeMyTrip {
		public static void main(String[] args) throws InterruptedException, AWTException {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-frame']"));
		driver.switchTo().frame(frame); 
		WebElement clsBtn =driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"));
		clsBtn.click();
		String parentWindowHandle=driver.getWindowHandle();
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-cy='signInByMailButton']")).click();
		driver.findElement(By.xpath("//input[@data-cy='userName']")).sendKeys("gsaisri2002@gmail.com");
		//driver.findElement(By.xpath("//button[@data-cy='continueBtn']//span[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cont=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-cy='continueBtn']//span[1]")));
		cont.click();
	

		
		
		//System.out.println("Closed Button");
		//driver.quit();
		
		}

	}


