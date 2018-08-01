package com.cg.LoginTest;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Login {

	 WebDriver driver = null; 
	   @Given("^I am on Sample login page$") 
		
	   public void goToFacebook() { 
	      driver = new ChromeDriver(); 
	      driver.navigate().to("D:\\Users\\vumanika\\Desktop\\login.html");
	   }
		
	   @When("^I enter username as (.*)$") 
	   public void enterUsername(String arg1) {   
	      driver.findElement(By.name("username")).sendKeys(arg1); 
	   }
		
	   @When ("^I enter password as (.*)$") 
	   public void enterPassword(String arg1) {
	      driver.findElement(By.name("password")).sendKeys(arg1);
	    
	   } 
		
	   @Then("^Alert successful$") 
	   public void checkpass() { 
		   driver.findElement(By.name("submit")).submit();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
		   assertEquals(alert.getText(), "Successful");
	   }
		
	   @Then("^Alert failed$") 
	   public void checkfail1() { 
		   driver.findElement(By.name("submit")).submit();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
		   assertEquals(alert.getText(), "Password Incorrect");
	   }
	   @Then("^Alert failed completely$") 
	   public void checkfail12() { 
		   driver.findElement(By.name("submit")).submit();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
		   assertEquals(alert.getText(), "Username&Password Incorrect");
	   }
	   
		
	
	} 