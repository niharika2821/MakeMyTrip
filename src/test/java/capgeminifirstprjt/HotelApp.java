package capgeminifirstprjt;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelApp {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("vasuvespag");
		driver.findElement(By.id("password")).sendKeys("vasu1234");
		driver.findElement(By.id("login")).click();
		
		WebElement location=driver.findElement(By.id("location"));
		Select value =new Select(location);
		value.selectByVisibleText("New York");
		driver.findElement(By.id("Submit")).click();
		
		WebElement Hotel=driver.findElement(By.id("radiobutton_1"));
		Hotel.click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Abhi");
		driver.findElement(By.id("last_name")).sendKeys("Ram");
		driver.findElement(By.id("address")).sendKeys("121-1,LB Nagar,Hyderabad");
		driver.findElement(By.id("cc_num")).sendKeys("4567890234709761");
		
		WebElement creditcard=driver.findElement(By.id("cc_type"));
		Select type=new Select(creditcard);
		type.selectByVisibleText("VISA");
		
		WebElement month=driver.findElement(By.id("cc_exp_month"));
		Select expmonth=new Select(month);
		expmonth.selectByVisibleText("April");
		
		WebElement year=driver.findElement(By.id("cc_exp_year"));
		Select expyear=new Select(year);
		expyear.selectByVisibleText("2030");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("456");
		
		driver.findElement(By.id("book_now")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement order = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
        String text = order.getAttribute("value");
        System.out.println("Order No:"+text);
        }



		// TODO Auto-generated method stub
	}



