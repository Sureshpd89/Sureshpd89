package org.junit;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Flipcart extends BaseClass{
	
 @Test
 public void test()
 {
	 
	 launchBrowser();
	 loadUrl("https://www.flipkart.com/");
	 maxBrowser();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	/* driver.findElement(By.xpath("//a[text()='Login']")).click();
	*/ 
	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8754575918");
	 
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("revathy@123");
	 
	 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	 
	 WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
	 Actions ac=new Actions(driver);
	 ac.moveToElement(home).perform();
	 
	 
	 
	 
 }
	
	
	

}
