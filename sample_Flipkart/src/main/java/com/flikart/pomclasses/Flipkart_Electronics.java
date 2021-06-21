package com.flikart.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Electronics {
	WebDriver driver;
	
	@FindBy (xpath="//*[@alt=\"Electronics\"]") private WebElement Electronics_Click;

	public Flipkart_Electronics(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void Electronics() {
		Electronics_Click.click();
	}

}
