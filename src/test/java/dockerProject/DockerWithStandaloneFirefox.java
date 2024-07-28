package dockerProject;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithStandaloneFirefox {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"),dc);
		driver.get("https://www.google.com/");
		System.out.println("The title of the page is :"+ driver.getTitle());
		driver.quit();
	}
}
