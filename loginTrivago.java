package SeleniumPack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTrivago {
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe" );
				//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
				//capabilities.setCapability("marionette",true);
		WebDriver driver=new ChromeDriver();
		
	
		driver.get("https://access.trivago.com/oauth/en-IN/login");
		WebElement email=driver.findElement(By.id("check_email"));
		email.sendKeys("vijaysriv_2805@yahoo.com");
		driver.findElement(By.id("login_email_submit")).click();
		driver.get("https://access.trivago.com/oauth/en-IN/login?step=login");
		WebElement password=driver.findElement(By.id("login_password"));
		password.sendKeys("qwerty1234");
		driver.findElement(By.id("login_submit")).click();
		//driver.get("https://github.com/settings/profile");
	}
}
