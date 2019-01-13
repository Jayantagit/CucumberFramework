package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps
{
	public static WebDriver driver = null;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\LatestChromeDriver\\chromedriver.exe");
	   	    driver=new ChromeDriver();

	       //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	       //Launch the Online Store Website

	       driver.get("http://www.store.demoqa.com");
	       driver.manage().window().maximize();
		   throw new PendingException();
		
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	    throw new PendingException();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.id("log")).sendKeys("testuser_1"); 
			 
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 
	        driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	        // Now submit the form. WebDriver will find the form for us from the element 
	 
	        driver.findElement(By.id("login")).click();
		    throw new PendingException();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Login Successfully");
		 throw new PendingException();
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	    throw new PendingException();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("LogOut Successfully");
	    throw new PendingException();
	}


}
