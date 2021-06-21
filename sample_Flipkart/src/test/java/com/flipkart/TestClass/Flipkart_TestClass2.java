package com.flipkart.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flikart.pomclasses.Flipkart_Electronics;
import com.flikart.pomclasses.Flipkart_Login;

public class Flipkart_TestClass2 {
	WebDriver driver;
	@BeforeClass
	public void launching() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
//		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
			
	}
	@BeforeMethod
	public void Login_flipkart() throws InterruptedException {
		Flipkart_Login obj=new Flipkart_Login(driver);
		String user="kunalbkumar@gmail.com";
		String pwd="7276233053";
		obj.Login_Test(user, pwd);
		Thread.sleep(3000);
	}
	@Test
	public void Electronics_Test() {
		try {
			Flipkart_Electronics obj=new Flipkart_Electronics(driver);
			obj.Electronics();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
