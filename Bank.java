package SeleniumPCKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Krish Compusoft Services Pvt Ltd\\Desktop\\Selenium Webdriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]")).click();//Customer Login
		Thread.sleep(2000);
		
		Select dropdown = new Select (driver.findElement(By.id("userSelect")));//Select User
		dropdown.selectByIndex(3);
		//driver.findElement(By.id("")).click();//click on user
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();//Click on Login
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();//Deposit
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("3000");//Enter Amount
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();//send	deposit
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")).click();//Transactions
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();//back
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click(); //withdraw
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("1000");//Enter Amount
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();//Click on Withdraw
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")).click();//Transactions
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")).click(); Thread.sleep(2000); //reset
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();//back
		
		//Bank Manager Login
		driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();//Home
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]")).click(); //Bank Manager Login
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();//Add cust
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Drashti");	Thread.sleep(2000); //Enter FirstName 
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Patel"); //Enter LastName
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("390019"); //Enter Pincode
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click(); //Click on add cust
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")).click();
		Thread.sleep(2000);
		
		Select dropdown1 = new Select (driver.findElement(By.id("userSelect")));//Select User
		dropdown1.selectByIndex(6);
		Thread.sleep(2000);
		
		Select dropdown2 = new Select(driver.findElement(By.id("currency")));//Select Currency
		dropdown2.selectByIndex(3);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();//Click on customer
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[5]/td[5]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();//Home
		
	}

}
