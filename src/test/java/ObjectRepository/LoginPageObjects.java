package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class LoginPageObjects extends AbstractComponents
{
WebDriver driver;
public LoginPageObjects(WebDriver driver)
{
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="userEmail")
WebElement UserId;

@FindBy(id="userPassword")
WebElement Pwd;

@FindBy(xpath="//input[@value='Login']")
WebElement Submit;

public String GetUsername(String username)
{
	UserId.sendKeys(username);
	return username;
	}

public String Getpassword(String pwd)
{
	Pwd.sendKeys(pwd);
	return pwd;
}
public void submitbtn()
{
	Submit.click();
}
}
