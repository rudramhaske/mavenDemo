package testScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObjects.SumbitFormObjects;
import utility.UtilityClass;

public class TC_SumitForm extends BaseClass 
{   UtilityClass uc;
	
    @Test
	public void submitForm() throws IOException 
	{    
		 
		 sf.submitRegForm("rudra","r@123","rr@123");
		 sf.selectGender("Female");
		 sf.selectEmployeeStatus();
		 sf.sendBirthDate("10/02/23");
		 sf.clickOnSubmitBtn();
		 String sucesssMassage=sf.getconfirmationText();
		 System.out.println(sucesssMassage);
		 
		// Assert.assertEquals(sucesssMassage,"× Success! The Form has been submitted successfully!.Success! The Form has been submitted successfully!.");
		 	 
	}
	
	
}
