package SeleniumPCKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Selenium Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select dropdown = new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")));
		dropdown.selectByIndex(3);
		
		driver.get("http://output.jsbin.com/osebed/2");
		Select dropdown1 = new Select (driver.findElement(By.id("fruits")));
		dropdown1.selectByIndex(0);
		dropdown1.selectByIndex(1);
		dropdown1.selectByIndex(2);
		dropdown1.selectByIndex(3);
		dropdown1.deselectByIndex(2);
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
