package com.AgileAutomationCI_Selenium.CI_Selenium;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.htmlunit.HtmlUnitDriver;
	import org.testng.annotations.Test;

	public class TC02_VerifyLoginSucess {
		@Test
		public void LoginSucess() throws InterruptedException {
			
				//For chrome we need to install the chromedriver.exe and give the path as mentioned below
				//System.setProperty("webdriver.chrome.driver",	System.getProperty("user.dir")+"\\src\\chromedriver.exe");
				
				// Initialize browser
				WebDriver driver = new HtmlUnitDriver();

				// Launch the Application
				driver.get("http://newtours.demoaut.com/");
				// Wait for 5 Sec
				Thread.sleep(5);
				// Maximize the Browser Window
				driver.manage().window().maximize();
				driver.findElement(By.name("userName")).sendKeys("mercury");
				driver.findElement(By.name("password")).sendKeys("mercury");
				driver.findElement(By.name("login")).click();
				Thread.sleep(10);
				if (driver.getPageSource().contains("Flight Finder") == true) {
					System.out.println("Login Sucess with valid Credentials");
				} else {
					System.out.println("Login UnSuccess with valid Credentials");
				}
				
				// Close the Driver
				driver.quit();
			}


		}
	



