package com.pageObjects.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://www.takealot.com/";
	public String username="mail.amritrai@gmail.com";
	public String password="Dontshop@3665";
	public String bookName="Core Java";
	public static WebDriver driver;



@BeforeClass
public void setup()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
}

@AfterClass
public void tearDown()

{
	driver.quit();
}
}
