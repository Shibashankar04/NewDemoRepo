package com.vmoksha.kyc.com.vmoksha.kyc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class Locators {
	
	WebDriver driver;
	
	int x=10;
	
	public By userid=By.xpath("//input[@id='identifierId']");
	public By NextButton=By.xpath("//span[contains(text(),'Next')]");
	public By password=By.name("password");
	
	public Locators(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	public void typeuid(String uid){
		
		driver.findElement(userid).sendKeys(uid);
		
	}
	
	public void typepassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void pressNext(){
		driver.findElement(NextButton).click(); 
	}
}
