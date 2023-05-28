package Testcases;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.DashboardObjects;
import ObjectRepository.LoginPageObjects;


public class LoginTc_001 extends BaseClass
{
	@Test
	
public void LoginTest()
{
	
	String productName = "ZARA COAT 3";
			rdriver.get(URL);
		rdriver.manage().window().maximize();
	LoginPageObjects obj = new LoginPageObjects(rdriver);
	obj.GetUsername(UserName);
	obj.Getpassword(Password);
	obj.submitbtn();
 DashboardObjects DObj = new DashboardObjects(rdriver);
		List<WebElement>ProList = DObj.getProductList();
	DObj.addProductToCart(productName);
	
}

}
