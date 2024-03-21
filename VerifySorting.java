package basicprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifySorting {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		
		driver.findElement(By.id("password")).sendKeys("Qeagle@123");
		
	
		driver.findElement(By.id("Login")).click();
		
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[2]")).click();
		
		WebElement accounts = driver.findElement(By.xpath("//span[@class='slds-truncate']/parent::a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();",accounts);
		
		
		driver.findElement(By.xpath("(//a[@class='toggle slds-th__action slds-text-link--reset '])[1]")).click();
	}

}


