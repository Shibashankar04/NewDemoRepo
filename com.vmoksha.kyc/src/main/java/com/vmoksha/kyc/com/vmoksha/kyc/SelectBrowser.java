package com.vmoksha.kyc.com.vmoksha.kyc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectBrowser {
	
	public static WebDriver driver;
	
	
	public static WebDriver BrowserDriver(String browser,String url){
		
		if(browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pc\\Downloads\\Compressed\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			}
		else if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Compressed\\chromedriver_2.44.exe");
			
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\pc\\Downloads\\Compressed\\IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
