package SeleniumTraning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSendEmail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhava\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.name("identifier")).sendKeys("auto.purpose123@gmail.com");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("Ab123456!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//WebElement clickable=driver.findElement(By.xpath("//span[contains(text(),'Done')]"));
		//WebDriverWait wait=new WebDriverWait(driver, 6);
		//wait.until(ExpectedConditions.elementToBeClickable(clickable));
		//clickable.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=':9h']")).sendKeys("Shubham.vashist@amdocs.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Test Email");
		
		driver.findElement(By.xpath("//*[@id=':a4']")).sendKeys("This email is automated. Kindly do not reply to this email.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Regards,\r\n" + 
				"Automation");
		
		driver.findElement(By.xpath("//*[@id=':8p']")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
