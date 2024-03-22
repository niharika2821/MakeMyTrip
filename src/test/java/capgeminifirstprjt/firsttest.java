package capgeminifirstprjt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hackerrank.com/auth/login/java");
		//driver.findElement(By.id("")).click();
		driver.findElement(By.id("input-1")).sendKeys("niharikaragu2105@gmail.com");
		driver.findElement(By.id("input-2")).sendKeys("1234");
		//<span text="login"> Login </span>
		//driver.findElement(By.id("hr_v2")).click();
		System.out.println("capgeminifirstprjt");
		// TODO Auto-generated method stub
	}

}
