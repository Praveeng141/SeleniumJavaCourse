package com.Task06;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class PracticeSwitchWindow {
	 
	 public static WebDriver driver;
	 
	 public static void main(String[] args) 
	 {
	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows");
	 
	    driver.findElement(By.id("alert")).click();
	 
	    Alert myAlert = driver.switchTo().alert();
	 
	 
	    myAlert.accept();
	 
	         
	 
	    driver.close();
	 
	 }
	 
}
