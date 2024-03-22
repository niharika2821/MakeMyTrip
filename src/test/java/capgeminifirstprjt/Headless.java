package capgeminifirstprjt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless {

	public static void main(String[] args) {
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://www.javatpoint.com/java-tutorial");
		System.out.println(driver.getTitle());
		
		// TODO Auto-generated method stub

	}

}
