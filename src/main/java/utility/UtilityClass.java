package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class UtilityClass {
	
	
	public static WebDriver driver;
	
	public UtilityClass (WebDriver driver)
	{
		this.driver=driver;
	}
	
	static Properties prop;
	public String globaldataReader () throws IOException 
       {
             	Properties prop=new Properties ();
		        FileInputStream fis;
		try
		{
			fis = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		    prop.load(fis);
	    } catch (FileNotFoundException e)
		{	
		     e.printStackTrace();
		     
		}catch (Exception e) 
		{		
			e.printStackTrace();
		}
		
		String browsername=prop.getProperty("browser1");	
		return browsername;
				
        }
    
   

	



	

	
    
	
    
}
