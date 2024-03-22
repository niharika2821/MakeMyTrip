package capgeminifirstprjt;

//import org.htmlunit.javascript.host.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException,InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		//FirefoxOptions opt=new FirefoxOptions();
		opt.setCapability("se:name","My first grid test");
		WebDriver driver =new RemoteWebDriver(new URL("http://10.211.176.176:4444"),opt);
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(5000);
		driver.quit();
		// TODO Auto-generated method stub

	}

}
