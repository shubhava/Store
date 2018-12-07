package UFEtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public void loginUfe() throws InvalidFormatException, IOException {
		
		System.out.println("Launch UFE");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhava\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://iebsx2vr:10443/ufe/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement remove=driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		System.out.println("Opened");
		remove.click();
		WebElement user=driver.findElementByName("username");
		if(user.isDisplayed())
		{
		System.out.println("loginpage exists");
		}else {
		System.out.println("login page exists");
		}
		String username=user.getText();
		System.out.println(username);
		
		File sv=new File("C:\\Users\\shubhava\\Desktop\\Automation Sanity\\Selenium\\Sheet 1.xlsx");
		FileInputStream File=new FileInputStream(sv);
		XSSFWorkbook wb= new XSSFWorkbook(File);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		
	}
	
}
