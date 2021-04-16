package com.pageObjects.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	WebDriver ldriver;
	
	public PageObjects(WebDriver ldriver)
	{
		
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"shopfront-app\"]/header/div/div/div[2]/form/div/div[1]/input")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"shopfront-app\"]/header/div/div/div[2]/form/div/div[3]/button")
	WebElement searchButton;
	
	@FindBy (id="47910222")
	WebElement addToCart;
	
	@FindBy(xpath="//*[@id=\"shopfront-app\"]/div[3]/div[1]/div[2]/aside/div[1]/div[2]/div/div/div[2]/a")
	WebElement viewCart;
	
	@FindBy(xpath=("//*[@id=\"body\"]/div[5]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[3]/button"))
	WebElement checkOut;
	
	
	public void typesearchBox(String bookName)
	{
		searchBox.sendKeys(bookName);
	
	}
	
	public void clickButton()
	{
		searchButton.click();
		}
	
	public void addTocartButton() {
		addToCart.click();
		
	}
	
	public void cart() {
		viewCart.click();
		
			
	}
	
	public void proceedTocheckout() {
		checkOut.click();
		
		
	}
	
	
	

}
