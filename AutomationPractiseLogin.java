package SeleniumPCKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractiseLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Selenium Webdriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click(); //Click on Sign in
		
		WebElement element =driver.findElement(By.id("email"));// Get Email Link 
		element.sendKeys("drashtitest22+a1234@gmail.com");//Enter Email
		Thread.sleep(3000);
		
		WebElement element1 =driver.findElement(By.id("passwd")); // Get Password Link
		element1.sendKeys("test12345"); //Enter Password
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click(); //Click on Submit
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click(); // Click on Sign Out


	}

}
