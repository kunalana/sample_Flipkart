package com.flikart.pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Login {
		WebDriver driver;
		@FindBy (xpath="//a[@ class=\"_1_3w1N\" ]") private WebElement Login;
		@FindBy (xpath="(//input[@type=\"text\"])[2]") private WebElement User_Name;
		@FindBy (xpath="//input[@type=\"password\"]") private WebElement Pwd;
		@FindBy (xpath="(//button[@type=\"submit\"])[2]") private WebElement Login_Test;
		@FindBy (xpath="(//div[@class=\"_1psGvi _3BvnxG\"])[1]") private WebElement Log_Out1;

		//@FindBy (xpath=".//*[@class='no-border']") private WebElement we;
		//@FindBy (xpath="//ul[@class='account-dropdown']//*[contains(@href,'logout')]") private WebElement Next_we;
		public Flipkart_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void Login() {
			
		Login.click();
	}
	public void Login_Test(String User_Id,String PassW) {
		
		User_Name.sendKeys(User_Id);
		Pwd.sendKeys(PassW);
		Login_Test.click();
		
	}
	public void Log_Out(WebDriver driver) throws InterruptedException {
//		Actions a=new Actions(driver);
//		a.moveToElement(Log_Out1).doubleClick().perform();
		Actions action = new Actions(driver);
		action.moveToElement(Log_Out1).doubleClick().perform();
		
		//WebElement we = driver.findElement(By.xpath(".//*[@class='no-border']"));
		//action.moveToElement(we).moveToElement(Next_we).click().build().perform();
		
	
		
//		Log_Out1.click();
//		Log_Out1.click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
