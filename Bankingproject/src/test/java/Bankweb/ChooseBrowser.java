package Bankweb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChooseBrowser {

public static WebDriver driver;

public static Properties properties;

	public Properties Lanching() throws IOException {

		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;

	}

	@BeforeSuite
	public void OpenBrowser() throws IOException {
		Lanching();
		String browser = properties.getProperty("Browser");
		String url = properties.getProperty("Url");
		String Driver = properties.getProperty("DriverLocation");

		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void teardown() {
		//driver.close();
	}
}
