package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb_Class_Testng_Class 
{
	public static WebDriver driver;
	


	 @Test
	 
	 public void FB_TextBox() 

	  {
	  driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("mindqdsnr");
	  driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("systems");
	  driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("1234567890");	
	   }
	  
	@BeforeTest

	  public void Application() 

	  {
		  
 driver=new FirefoxDriver();
 driver.navigate().to("http://www.facebook.com");
 driver.manage().window().maximize();
	  }
	  
	@AfterTest

	  public void FB_dropdown() 

	  {
new Select(driver.findElement(By.id("day"))).selectByIndex(24);
new Select(driver.findElement(By.id("month"))).selectByValue("8");
new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
 }
	  
	 
	 @BeforeClass
	  public void FB_RadioButton()
	 
	 {
	 driver.findElement(By.xpath("//input[@value='1']")).click();
		    }


	}


