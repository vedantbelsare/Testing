package SeleniumPack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("rice");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.id("pdagDesktopSparkleDescription1")).click();
		driver.get("https://www.amazon.in/dp/B00Q6P1M9Q?aaxitk=4FIVkEJkNQlmcybAB5DDtQ&pd_rd_i=B00Q6P1M9Q&pf_rd_p=2e3653de-1bdf-402d-9355-0b76590c54fe&hsa_cr_id=4230186000702&sb-ci-n=productDescription&sb-ci-v=SHRILALMAHAL%20Empire%20Basmati%20Rice%20(Most%20Premium)%2C%205%20kg");
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.get("https://www.amazon.in/");
		WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("plate");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.id("pdagDesktopSparkleDescription1")).click();
		driver.get("https://www.amazon.in/dp/B07H7T3SR9?aaxitk=5E3aiU.RySUgYsnOQJTPVw&pd_rd_i=B07H7T3SR9&pf_rd_p=2e3653de-1bdf-402d-9355-0b76590c54fe&hsa_cr_id=5658831200402&sb-ci-n=productDescription&sb-ci-v=Larah%20by%20Borosil%20Fluted%20Verona%20Dinner%20Set%2C%2014-Pieces%2C%20White");
		driver.findElement(By.id("add-to-cart-button")).click();

		driver.get("https://www.amazon.in/");
		WebElement search2=driver.findElement(By.id("twotabsearchtextbox"));
		search2.sendKeys("mobile");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.id("pdagDesktopSparkleDescription1")).click();
		//driver.get("https://www.amazon.in/dp/B07HGH82LT?aaxitk=Q7w1SVa2xkSArr9uGh43yw&pd_rd_i=B07HGH82LT&pf_rd_p=2e3653de-1bdf-402d-9355-0b76590c54fe&hsa_cr_id=7561426100802&sb-ci-n=productDescription&sb-ci-v=Samsung%20Galaxy%20M10s%20(Metallic%20Blue%2C%203GB%20RAM%2C%20Super%20AMOLED%20Display%2C%2032GB%20Storage%2C%204000mAH%20Battery)");
		driver.findElement(By.id("add-to-cart-button")).click();

		driver.get("https://www.amazon.in/");
		WebElement search3=driver.findElement(By.id("twotabsearchtextbox"));
		search3.sendKeys("socks");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.get("https://www.amazon.in/Navy-Sport-Solid-Ankle-Length/dp/B073WX582T/ref=sxin_4_ac_d_rm?ac_md=0-0-c29ja3M%3D-ac_d_rm&cv_ct_cx=socks&keywords=socks&pd_rd_i=B073WX582T&pd_rd_r=251a501d-8a68-4d1d-b51a-833b256a101a&pd_rd_w=QZC53&pd_rd_wg=aSUmY&pf_rd_p=aefb8402-5202-48b1-a69a-2fbb0aa2f3c0&pf_rd_r=FXJ93E7QYM9757KXRV04&psc=1&qid=1579258060");	
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.id("hlb-ptc-btn-native")).click();

		FileInputStream f1=new FileInputStream("C:\\testing\\testing.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet sh=wb.getSheetAt(0);
		Row r=sh.getRow(0);
		int rowCount = 0;
		Row newRow=sh.createRow(rowCount+1);
		for(int j=0;j<r.getLastCellNum();j++)
		{
			Cell cell=newRow.createCell(j);
			cell.setCellValue("11867");
		}
		f1.close();
		FileOutputStream outputStream=new FileOutputStream("C:\\test\\test.xlsx");
		wb.write(outputStream);
		outputStream.close();
}
}
