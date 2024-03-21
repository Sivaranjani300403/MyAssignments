package basicprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

     public class CreateAccount {
	 public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Qeagle@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		//driver.findElement(By.className("slds-button")).click();
		//driver.findElement(By.className("slds-truncate")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[2]")).click();
		
		WebElement accounts = driver.findElement(By.xpath("//span[@class='slds-truncate']/parent::a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();",accounts);
		
		
		driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("SowmiyaRaja");
		
		  
		 WebElement element = driver.findElement(By.xpath("//label[text()='SIC Code']"));
		 Actions builder=new Actions(driver);
		 builder.scrollToElement(element).perform();
		 
		 driver.findElement(By.xpath("//label[text()='Ownership']/following::button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Public']")).click();
		
		
		
		 
		  driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")).click();
		  String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		  System.out.println(text);
		
		
	}

}

