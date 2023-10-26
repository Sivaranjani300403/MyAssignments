package week6.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')] ")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
		Set<String> childwindow = driver.getWindowHandles();
		List<String> openwindow=new ArrayList<String>(childwindow);
		driver.switchTo().window(openwindow.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.switchTo().window(openwindow.get(0));
		driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
		Set<String> childwindow1=driver.getWindowHandles();
		List<String>openwindow1=new ArrayList<String>(childwindow1);
		driver.switchTo().window(openwindow1.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')]/following::a[11]")).click();
		driver.switchTo().window(openwindow.get(0));
		driver.findElement(By.linkText("Merge")).click();
		driver.switchTo().alert().accept();
	}

}
