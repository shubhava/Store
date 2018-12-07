package SeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutomationTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhava\\Desktop\\chromedriver.exe");
		//in the above line we have set the path property for Web driver
		ChromeDriver driver;
		driver=new ChromeDriver(); //We have created Object of imported Chrome Class
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.name("identifier")).sendKeys("shbmvashisht@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("XX");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
		
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\shubhava\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		//InternetExplorerDriver test= new InternetExplorerDriver();
		//test.get("https://www.youtube.com");  // here i called the pre-defined method by created object

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\shubhava\\Downloads\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		//FirefoxDriver fire=new FirefoxDriver();
		//fire.get("https://www.youtube.com");
		
		
	}

}
