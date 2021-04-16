package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.pageObjects.practice.BaseClass;
import com.pageObjects.practice.PageObjects;

import io.cucumber.java.en.*;

public class StepDef extends BaseClass {
	
	public WebDriver driver;
	public PageObjects po;
	
	@Given("^User Opens the URL$")
    public void user_opens_the_url()   {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		po=new PageObjects(driver);
		driver.get(baseURL);
		driver.manage().window().maximize();
       
    }
	
	@And("^Types the search (.+) in the search box$")
    public void types_the_search_in_the_search_box(String item)  {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		po.typesearchBox(bookName);
		
       
    }
	
	

    @Then("^clicks on the Search button$")
    public void clicks_on_the_search_button()  {
    	
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	po.clickButton();
    	po.addTocartButton();
    	po.cart();
    	po.proceedTocheckout();
    	
    	
        
    }

    

}
