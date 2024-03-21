package basicprogram;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteAccount {
	public static void main(String[] args) throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//1.Enter user name
				driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
				
				//2.Enter password
				driver.findElement(By.id("password")).sendKeys("Qeagle@123");
				
				//3.Click login
				driver.findElement(By.id("Login")).click();
				
				
				driver.findElement(By.className("slds-icon-waffle")).click();
				
				
				driver.findElement(By.xpath("//button[@class='slds-button']")).click();
				driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[2]")).click();
				
				WebElement accounts = driver.findElement(By.xpath("//span[@class='slds-truncate']/parent::a[@title='Accounts']"));
				driver.executeScript("arguments[0].click();",accounts);
				
				
				driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]")).click();
				driver.findElement(By.xpath("//div[text()='Delete']/parent::a")).click();
				driver.findElement(By.xpath("//button[@title='Delete']")).click();
				
				
				
				
				driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
				
				
				
				driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("SowmiyaRaja");
				
				
				
				 driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")).click();
				 String txt = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
				 System.out.println(txt);

}
}
