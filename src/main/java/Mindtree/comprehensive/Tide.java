package Mindtree.comprehensive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tide {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tide.com/en-us/");

	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//a[@href='/en-us/shop']"))).build().perform();
    driver.findElement(By.linkText("Powder")).click();
    driver.findElement(By.linkText("Tide Ultra OXI Powder Laundry Detergent")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    a.moveToElement(driver.findElement(By.xpath("//a[@href='/en-us/our-commitment']"))).build().perform();
    driver.findElement(By.linkText("Our Ambition")).click();
	driver.findElement(By.xpath("//a[@href='/en-us/shop']")).click();
}
}
