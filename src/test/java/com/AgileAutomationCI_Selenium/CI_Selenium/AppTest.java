package com.AgileAutomationCI_Selenium.CI_Selenium;


import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
	
public class AppTest {				
		//public static void main(String[] args) {
	@Test
	public void TC01_LoginValidation() {
                     // Creating a new instance of the HTML unit driver
                      
                     WebDriver driver = new FirefoxDriver();
                      
           		     // Navigate to Google		
                     driver.get("http://www.google.com");					
          
					 // Locate the searchbox using its name		
                     WebElement element = driver.findElement(By.name("q"));	
                     
                    // Enter a search query		
                    element.sendKeys("CGI");	
                   
		            // Submit the query. Webdriver searches for the form using the text input element automatically		
                    // No need to locate/find the submit button		
                    element.submit();			
                    
            		// This code will print the page title		
                    System.out.println("Page title is: " + driver.getTitle());		
                    
                    driver.quit();			
         }		
}