package SeleniumPCKG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Selenium Webdriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		WebElement element =driver.findElement(By.name("user-name"));
		element.sendKeys("standard_user");
		Thread.sleep(3000);
		WebElement element1 =driver.findElement(By.name("password"));
		element1.sendKeys("secret_sauce");
		Thread.sleep(3000);

		driver.findElement(By.name("login-button")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();

		
	}

}
