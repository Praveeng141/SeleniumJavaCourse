import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TypeInTextBox
{
	public static void main(String args[])
	{
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\neelima\\Desktop\\Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String password=driver.findElement(By.id("u_0_p")).getAttribute("firstname");
		System.out.println(password);
		driver.close();
	}
}