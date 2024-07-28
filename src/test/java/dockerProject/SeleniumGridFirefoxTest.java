package dockerProject;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;


public class SeleniumGridFirefoxTest {
	
	@Test
	public void test() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		
		driver.get("https://www.google.com/");
		System.out.println("The title of the page on Firfox is :" + driver.getTitle());
	}
}
