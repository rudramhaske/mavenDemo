package baseClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.SumbitFormObjects;
import utility.UtilityClass;

public class BaseClass {
	
	 public  WebDriver driver;
	 public SumbitFormObjects sf;
	 UtilityClass uc;

	public void initiateBrowser() throws IOException 
	{
		 
		 uc=new UtilityClass(driver);
		 
		 String browserName= uc.globaldataReader();
		 System.out.println(browserName);
		 
		 if(browserName.equalsIgnoreCase("chrome")) 
		 {
		     WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		    		 
		 }
		 else if(browserName.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		
		}
	     else if(browserName.equalsIgnoreCase("edge"))
			{
		        WebDriverManager.firefoxdriver().setup();
		        driver=new EdgeDriver();
		     
			}
		 
		    driver.get("https://rahulshettyacademy.com/angularpractice/");
		    driver.manage().window().maximize();
	}
	
	
	 @BeforeMethod
	 public void launchBrowser() throws IOException 
	 {
		 initiateBrowser();
		 sf=new SumbitFormObjects(driver);
	
	 }
	 
	 @AfterMethod
		public void closeBrowser()
		{
			driver.close();
		}
}
