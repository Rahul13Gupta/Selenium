package Mindtree.comprehensive;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tide2java {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tide.com/en-us/");
	driver.findElement(By.xpath("//a[@href='/en-us/sign-in']")).click();
	driver.findElement(By.xpath("//a[@href='https://www.pggoodeveryday.com/signup/tide-coupons/']")).click();
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String pid=it.next();
	String cid=it.next();
	driver.switchTo().window(cid);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rahul Gupta");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rahulgupta4@mindtree.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rahul@234");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='recaptcha-verify-button']")).click();
}
}

