package dockerProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DockerWithStandaloneChrome {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
//		URL url = new URL("http://localhost:4444/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		
		driver.get("https://www.google.com/");
		System.out.println("The title of the page is :" + driver.getTitle());
		driver.quit();
	}
}
