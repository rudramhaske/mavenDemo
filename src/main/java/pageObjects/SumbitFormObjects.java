package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SumbitFormObjects {
	
	public SumbitFormObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//input[@name='name'])[1]")
	 private WebElement name;
	
	
	@FindBy(css="input[name='email']")
	 private WebElement email;
	
	
	
	@FindBy(xpath="//input[@id='exampleInputPassword1']")
	 private WebElement password;
	
	
	@FindBy(css="#exampleCheck1")
	 private WebElement checkBox;
	
	
	@FindBy(xpath="//select[@id='exampleFormControlSelect1']")
	 private WebElement genderTextBox;
	
	@FindBy(xpath="(//input[@class='form-check-input'])[1]")
	 private WebElement employeeStatus;
	
	@FindBy(xpath="//input[@name='bday']")
	private WebElement selectBirthDate;
	
	@FindBy(xpath="//input[@class='btn btn-success']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement comfirmationText;
	
	
	public void submitRegForm(String Name, String Email, String pass) 
	{	
		name.sendKeys(Name);
				
		email.sendKeys(Email);
		
		password.sendKeys(pass);
		
		checkBox.click();
	}
	
	public void selectGender(String gender) 
	{
		 Select s=new Select(genderTextBox);
		 s.selectByVisibleText(gender);
	}
	
	public void selectEmployeeStatus() 
	{
		employeeStatus.click();
	}
	
	public void sendBirthDate(String BirthDate) 
	{
		selectBirthDate.sendKeys(BirthDate);
	}
	
	public void clickOnSubmitBtn()
	{
		submitBtn.click();
	}
	public String getconfirmationText()
	{
	   String text=	comfirmationText.getText();
		return  text;
	}

	
}
