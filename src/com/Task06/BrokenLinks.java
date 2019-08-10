package com.Task06;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
    @Test
	public void main() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https:\\www.uvdesk.com");
        
        Thread.sleep(5000);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        
        System.out.println("Total number of links are:"+links.size());
        
        for(int i=0;i<links.size();i++)
        {
        	WebElement element=links.get(i);
        	
        	String url=element.getAttribute("href");
        	verifyLink(url);
        }
        
	}

	public void verifyLink(String urlLink) 
	{
		try
		{
			URL link=new URL(urlLink);
			HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
			httpConn.setConnectTimeout(2000);
			httpConn.connect();
			
			if(httpConn.getResponseCode()==200)
			{
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
				
			}
			if(httpConn.getResponseCode()== 404) 
			{
                System.out.println(urlLink+" - "+httpConn.getResponseMessage());
            }
            if(httpConn.getResponseCode()== 400) 
            { 
                System.out.println(urlLink+" - "+httpConn.getResponseMessage()); 
            }
        
            if(httpConn.getResponseCode()== 500) 
            {
                System.out.println(urlLink+" - "+httpConn.getResponseMessage()); 
            }
		}catch(Exception e)
		{
			
	    }
		
		
	}

}
