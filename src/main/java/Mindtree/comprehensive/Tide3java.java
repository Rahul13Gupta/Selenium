package Mindtree.comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tide3java {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us/");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("detergent");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.linkText("Tide Clean Breeze Powder Laundry Detergent")).click();
		}
}