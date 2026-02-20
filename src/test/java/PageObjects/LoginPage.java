package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Element
	@FindBy(xpath="//input[@id='UserName']")
	WebElement textemail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement textpwd;
	
	@FindBy(xpath="//button[text()='Log In']")
	WebElement butLogin;
	
	//Action methods
	public void inputemail(String email)
	{
		textemail.sendKeys(email);
	}
	
	public void inputpwd(String pwd)
	{
		textpwd.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		butLogin.click();
	}

}
