package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
// Rahul Ramkrushna Patil
public static void main(String arg[])
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SeleniumTesting\\chromedriver_win32 (3)chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	}
}
