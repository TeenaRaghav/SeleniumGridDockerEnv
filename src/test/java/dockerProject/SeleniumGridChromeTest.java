package dockerProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridChromeTest {
	@Test
	public void test() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		
		driver.get("https://www.google.com/");
		
		System.out.println("The title of the page on chrome is :" + driver.getTitle());
		
		driver.quit();
	}
	
}
 