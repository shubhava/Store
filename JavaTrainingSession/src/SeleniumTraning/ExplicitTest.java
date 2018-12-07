package SeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhava\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String etitle="Facebook";
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement actualtitle=driver.findElement(By.xpath("//*[@title='Go to Facebook home']"));
		String atitle=actualtitle.getText(); //here we fetched the text of the address in actual title
		
		
		//Compare the actual value and expected value
		if (atitle.equals(etitle)) {  //please note content equals only comes for comparing two strings
			
			System.out.println("Test Passed");
			
		}
		
		else{
			System.out.println("Test Failed");
		}
		
		System.out.println(etitle);
		System.out.println(atitle);
			WebDriverWait wait=new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(actualtitle));//here it will
			//keep on checking till 6 second that object is clickable or not
			actualtitle.click();
			driver.close();
				
			
			

	}

}
