package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



@RunWith(Cucumber.class)
public class stepDefination {
	
	static FirefoxDriver driver;

    @Given("^User is landing on the free CRM Application$")
    public static void user_is_landing_on_the_free_crm_application() throws Throwable {
    	System.setProperty("webdriver.gecko.driver","E:\\AutomationTesting\\Cucumber\\Softwares\\geckodriver.exe");
       
    
    	driver =new FirefoxDriver();
    	driver.get("https://freecrm.com/");
    	driver.manage().window().maximize();
    	String appTitle=driver.getTitle();
    	System.out.println("Title of the page ==> " + appTitle);
    	String expTitle="Free CRM #1 cloud software for any business large or small";
    	if (appTitle.equals (expTitle))
    	{
    	System.out.println("Verification Successfull");
    	}
    	else
    	{
    	System.out.println("Verification Failed");
    	}
    }
    
    	 @Then("^User is clicking on login button$")
    	    public void user_is_clicking_on_login_button() throws Throwable {
           driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
    	    }

    	    @Then("^User is entering valid email and password and click on signin button$")
    	    public void user_is_entering_valid_email_and_password() throws Throwable {
    	    	
    	    	driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("praveen.lms.testing@gmail.com");
    	    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Zaqw@1234");
    	    	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
    	    }
         
    	   
}