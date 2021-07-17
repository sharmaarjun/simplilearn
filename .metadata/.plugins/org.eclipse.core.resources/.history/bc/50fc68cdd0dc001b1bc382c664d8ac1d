package dockerTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class docTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		capabilities.setCapability(options.CAPABILITY, options);
//		options.setBinary(new File("C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 91\\chromedriver.exe"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 91\\chromedriver.exe");
//		capabilities.setCapability("browserName", "chrome");
//		capabilities.setCapability("platform", "WINDOWS");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		Thread.sleep(3000);
		System.out.println("Driver started");
		driver.navigate().to("https://www.google.com/");
        System.out.println("test :" + driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
//        System.out.println("test :" + driver.getTitle());
        Thread.sleep(5000);
//        driver.quit();
		
	}

}
