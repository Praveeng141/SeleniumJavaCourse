package com.Task06;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows");
		
		String handel=driver.getWindowHandle();
		System.out.println(handel);
	    
		driver.findElement(By.id("button1")).click();
		
		Set<String> handels=driver.getWindowHandles();
		
		System.out.println(handels);
		
		for(String handel1:driver.getWindowHandles())
		{
			System.out.println(handel1);
			
			driver.switchTo().window(handel1).manage().window().maximize();
		}
		
		driver.close();
		driver.quit();

	}

}
