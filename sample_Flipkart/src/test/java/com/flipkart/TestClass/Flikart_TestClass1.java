package com.flipkart.TestClass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.flikart.pomclasses.Flipkart_Login;
import com.flikart.pomclasses.Flipkart_Mobiles;

import test_Browser.Setup.Pojo;

public class Flikart_TestClass1 {
	
	WebDriver driver;
	int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	@BeforeTest
	@Parameters("browser")
	public void launchbrowser(String browser) {
		reporter=new ExtentHtmlReporter("test-output"+File.separator+"ExtentReport"+File.separator+"extendReport.html");
		ExtentReports extend=new ExtentReports();
		extend.attachReporter(reporter);
		System.out.println("Before Test");
		if(browser.equalsIgnoreCase("chrome")) {
			driver=Pojo.Open_Chrome_browser();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=Pojo.Open_FireFox_browser();
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void launching() {
//		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
//		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@BeforeMethod
	public void login() {
		
	}
	String url;
	@Test
	public void LoginTest() throws InterruptedException {
		Flipkart_Login log=new Flipkart_Login(driver);
		log.Login_Test("kunalbkumar@gmail.com", "7276233053");
		url=driver.getCurrentUrl();
//		if(url.equals("https://www.flipkart.com/account/orders?link=home_orders")) {
//			System.out.println("Test is passed");
//		}
//		else 
//			System.out.println("Test is Failed");
		
		Thread.sleep(3000);
		String A_url="https://www.flipkart.com/";
		Assert.assertEquals(url, A_url);
		//Assert.assertEquals(url, "https://www.flipkart.com/account/orders?link=home_orders");
		
	}
	
	@Test (enabled=false)
	public void LoginTest1() {
		Flipkart_Login log=new Flipkart_Login(driver);
		log.Login_Test("xyz123", "7276233053");
	
		
	}
	@Test 
	public void Mobiles_Test() {
		Flipkart_Mobiles obj=new Flipkart_Mobiles(driver);
		obj.Mobiles("motorola fusion plus");
		String url=driver.getCurrentUrl();
		//String text=obj.Mobiles("motorola fusion plus");
		//Assert.assertEquals(text, "Bank Offer");
	}
	@Test (enabled=false)
	public void Fashion_Test() {
		try {
		Flipkart_Mobiles obj=new Flipkart_Mobiles(driver);
		obj.Fashion("Mens Jeans");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	@AfterClass
	public void Logut() throws InterruptedException {
		Flipkart_Login log=new Flipkart_Login(driver);
		Thread.sleep(3000);
		driver.quit();
		//log.Log_Out(driver);
	}
	

}
