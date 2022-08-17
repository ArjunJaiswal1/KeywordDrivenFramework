package com.qa.fb.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;




public class TestBase {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName)  {
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\HP 14-dh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		   if(prop.getProperty("headless").equals("yes")) {
			   FirefoxOptions options = new FirefoxOptions();
			   options.addArguments("--headless");
			   driver= new FirefoxDriver(options);
		   }else {
			   driver = new FirefoxDriver();
		   }
		}
		return driver;
		
	}
	
	
	
	public Properties init_Properties(){
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\HP 14-dh\\eclipse-workspace\\KeyWord_Driven_Framework\\src\\main\\java\\com\\qa\\fb\\keyword\\config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}	
	
}