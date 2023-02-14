package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static WebDriver driver = null;
	public static Properties properties = null;


	public Properties loadPropertyFile() throws IOException {
		//property file load. return

		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);		
		return properties;


	}

	@BeforeSuite
	public void launchBrowser() throws IOException {

		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");


		if(browser.equalsIgnoreCase("chrome") ) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();			
		}else if(browser.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
