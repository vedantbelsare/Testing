package SeleniumPack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.trivago.in/");
		WebElement search=driver.findElement(By.id("querytext"));
		search.sendKeys("Pune");
		
		driver.findElement(By.className("svg-color--primary")).click();

}
}
