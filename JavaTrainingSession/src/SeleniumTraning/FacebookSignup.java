package SeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhava\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Bule");
		driver.findElement(By.name("lastname")).sendKeys("Fero");
		driver.findElement(By.name("reg_email__")).sendKeys("test.113476@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test.113476@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Aa123456!");
		WebElement date=driver.findElement(By.id("day"));
		Select day=new Select(date);  // Here we have imported select class which is used to select the object
		day.selectByValue("19");
		
		driver.findElement(By.id("month"));
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(6);
		
		
		
		//WebElement name=driver.findElement(By.id("u_0_7"));
		name.click(); // here we are creating a variable
		// of Type webelement storing the identifier value in it
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div[3]/button")).click();
		
		

	}

}
