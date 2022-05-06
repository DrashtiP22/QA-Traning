package SeleniumPCKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class evalution0605 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Selenium Webdriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Drashti");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Patel");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("drashtitest22@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("age")).sendKeys("22");
		Thread.sleep(2000);
		driver.findElement(By.id("salary")).sendKeys("40000");
		Thread.sleep(2000);
		driver.findElement(By.id("department")).sendKeys("QA");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		//driver.findElement(By.xpath("//*[@id=\"edit-record-4\"]/svg")).click();
		

	}

}
