package webUtils;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WebClass {

	@Test
	public static void disp() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
	     RemoteWebDriver	driver = new ChromeDriver(options);
		driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();

	}

}
