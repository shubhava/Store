package SeleniumTraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait { //it means to keep on checking til the given time

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhava\\Desktop\\chromedriver.exe");
		
		//Objects and variables initialization
		ChromeDriver driver=new ChromeDriver();
		
		
		//deleting cookies
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//	set the time out
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//it will wait for 30 secs//
		//Can use Thread as well instead of this
		
		driver.findElement(By.xpath("//*[@label='Find Trains']")).click();
		
		
		
		
		

	}

}
