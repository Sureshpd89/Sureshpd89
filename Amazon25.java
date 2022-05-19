package org.junit;

import java.util.List;

import org.base.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon25 extends BaseClass {

	@Test
	public void test()
	{
		launchBrowser();
		loadUrl("https://www.amazon.in/");
		maxBrowser();
		List<WebElement> amazonAdd = driver.findElements(By.xpath("//div[@id='desktop-banner']"));
		for (WebElement x : amazonAdd) {

			System.out.println(x);

		}

	}

}
