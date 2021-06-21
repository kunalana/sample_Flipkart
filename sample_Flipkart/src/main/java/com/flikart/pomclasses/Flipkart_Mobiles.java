package com.flikart.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Mobiles {
	WebDriver driver;
	@FindBy (xpath="(//div[@class=\"xtXmba\"])[1]") private WebElement Mobiles_click;
	@FindBy (xpath="//input[@type=\"text\"]") private WebElement Search_box;
	@FindBy (xpath="//button[@class=\"L0Z3Pu\"]") private WebElement Search_Click;
	@FindBy (xpath="(//a[@class=\"_3WcRHs _2VGJMH\"])[1]") private WebElement BestDeals_click;
	@FindBy (xpath="//h1[@class=\"_3vKRL2\"]") private WebElement bank_deals_page;
	@FindBy (xpath="(//a[@href=\"http://www.flipkart.com/pages/bsd-sbi-tnc\"])[1]") private WebElement SBICARD_discount;
	@FindBy (xpath="(//a[@href=\"http://www.flipkart.com/pages/bsd-sbi-tnc\"])[2]") private WebElement Termsand_Conditions;
	@FindBy (xpath="//*[@alt='Fashion']") private WebElement Fashion_click;
	//@FindBy (xpath="(//div[@class=\"_1mkliO\"])[1]") private WebElement Fashion_click;
	@FindBy (xpath="(//input[@type=\"text\"])[1]") private WebElement Search_click_Fashion;
	@FindBy (xpath="//button[@class=\"L0Z3Pu\"]") private WebElement Search_fashion_click;
	//@FindBy (xpath="(//div[@class=\"eFQ30H\"]/a)[2]") private WebElement Wrangler;
	public Flipkart_Mobiles(WebDriver driver) {
		PageFactory.initElements(driver, this);
				
	}
	public void Mobiles(String Search_coontent) {
		Mobiles_click.click();
		Search_box.sendKeys(Search_coontent);
		Search_Click.click();
//		BestDeals_click.click();
//		return bank_deals_page.getText();
		
	}
	public void Fashion(String Parameter) {
		Fashion_click.click();
		Search_click_Fashion.sendKeys(Parameter);
		Search_fashion_click.click();
		//Wrangler.click();
		
	}
	
}
