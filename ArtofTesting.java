package SeleniumPCKG;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArtofTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Selenium Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        //Will control on tab as according to index:
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.google.com/"); 
        driver.switchTo().window(tabs.get(0));

		driver.findElement(By.id("fname")).sendKeys("Drashti Patel");
		Thread.sleep(3000);
		driver.findElement(By.id("fname")).clear();
		
		
		driver.findElement(By.id("idOfButton")).click();
		//For RadioButton
		driver.findElement(By.id("female")).click();
		//For Check box
		driver.findElement(By.xpath("//*[@id=\"post-1089\"]/div/div/form[2]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"post-1089\"]/div/div/form[2]/input[2]")).click();
		//For DropDown
		Select dropdown = new Select (driver.findElement(By.id("testingDropdown")));
		dropdown.selectByIndex(3);
	}

}
