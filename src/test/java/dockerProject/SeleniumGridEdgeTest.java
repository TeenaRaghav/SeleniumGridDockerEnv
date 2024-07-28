package dockerProject;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridEdgeTest {
	@Test
	public void Test() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.edge();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		
		driver.get("https://www.google.com/");
		System.out.println("The title of the page on Edge is :" + driver.getTitle());
		driver.quit();
	}
}
