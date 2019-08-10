import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverWait wait=new WebDriverWait(driver, 40);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("custom_gender_container")));
	  String textBefore=driver.findElement(By.className("_83kf")).getText();
	  
	  driver.findElement(By.id("u_0_a")).click();
	  
	  String textAfter=driver.findElement(By.className("_83kf")).getText();
	  
	  Assert.assertEquals(textBefore, textAfter);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https:\\www.facebook.com");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
