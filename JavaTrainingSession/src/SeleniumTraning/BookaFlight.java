package SeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookaFlight {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhava\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]").sendKeys("DEL");
		driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("DXB");
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		WebElement mon=driver.findElement(By.xpath("//span[contains(text(),'December')]"));
			
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'26')]")).click();
		System.out.println("Departure Date Selected");
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();	
		
		
		
	}

}

