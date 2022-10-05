package com;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Saksham@123");
		driver.findElement(By.id("pass")).sendKeys("hello@123");
		driver.findElement(By.name("login")).click();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	// set path of Chromedriver executable
      System.setProperty("webdriver.chrome.driver",
              "E:\\chrome connector/chromedriver.exe");

      // initialize new WebDriver session
      driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	// close and quit the browser
	  String actualUrl = "https://live.browserstack.com/dashboard";
		String expectedUrl = driver.getCurrentUrl();
	System.out.println("there was some error Either user name or password Wrong");
		Assert.assertEquals(expectedUrl, actualUrl);
		
      
  }
}