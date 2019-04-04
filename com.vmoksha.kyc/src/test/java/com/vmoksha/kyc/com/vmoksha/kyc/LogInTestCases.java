package com.vmoksha.kyc.com.vmoksha.kyc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LogInTestCases {
	
	@Test
	public void GmailLogin(){
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Compressed\\chromedriver_2.44.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
//		
		WebDriver driver=SelectBrowser.BrowserDriver("chrome", "https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Locators log=new Locators(driver);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
//		WebElement idtxtfield= wait.until(ExpectedConditions.visibilityOfElementLocated(log.userid));
		
		log.typeuid("shibashankar54");
		
		log.pressNext();
		
		WebElement passtxtfield= wait.until(ExpectedConditions.visibilityOfElementLocated(log.password));
		
		log.typepassword("0901230455");
		
		log.pressNext();
		
		
		
	}

}
