package SeleniumPCKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Selenium Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		//Type Canada
		driver.findElement(By.id("ss")).sendKeys("Canada");
		Thread.sleep(3000);
		
		//Click on Toronto
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]/span")).click();
		Thread.sleep(3000);
		
		//Check In
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[6]/span/span")).click();
		Thread.sleep(2000);
		
		//Click Out
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[2]/td[2]/span/span")).click();
		
		//Click on Person
		driver.findElement(By.id("xp__guests__toggle")).click();
		//Click on Adult +
		driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		//Click on Adult -
		driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[1]/span")).click();
		
		//Click on Child +
		driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/button[2]")).click();
		
		//Select From Dropdown
		Select dropdown = new Select (driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[3]/select")));
		
		dropdown.selectByIndex(3);
		Thread.sleep(3000);
		
		//Click on Room
		driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[4]/div/div[2]/button[2]/span")).click();
		Thread.sleep(3000);
		
		//Search
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
	}

}
