package week7.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	    driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
	    Set<String> childwindow = driver.getWindowHandles();
		List<String> op=new ArrayList<String>(childwindow);
		driver.switchTo().window(op.get(1));
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Arief']")).click();
	    driver.switchTo().window(op.get(0));
	    driver.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();
	    Set<String> childwindow1=driver.getWindowHandles();
		List<String>op1=new ArrayList<String>(childwindow1);
		driver.switchTo().window(op1.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Aathi']")).click();
		driver.switchTo().window(op.get(0));
		driver.findElement(By.linkText("Merge")).click();
		driver.switchTo().alert().accept();
	    
	    
	}

}
