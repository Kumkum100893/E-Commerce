package ObjectRepository;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class DashboardObjects extends AbstractComponents
{
WebDriver driver;
public DashboardObjects(WebDriver driver)
{
	super(driver);
	driver=this.driver;
	PageFactory.initElements(driver,this);
}
@FindBy(css=".mb-3")
List<WebElement> products;

By productsBy = By.cssSelector(".mb-3");
By addToCart = By.cssSelector(".card-body button:last-of-type");



public List<WebElement> getProductList()
{
	waitForElementToAppear(productsBy);
	return products;
}
public WebElement getProductByName(String productName)
{
	WebElement prod = getProductList().stream().filter(product->
	product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	return prod ;
}
public void addProductToCart(String productName)
{
	WebElement prod = getProductByName(productName);
	prod.findElement(addToCart).click();
	waitForElementToAppear(addToCart);
	
}
public WebElement getProductByNagme(String productName)
{
	WebElement prod = getProductList().stream().filter(product->
	product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	return prod ;
}
public WebElement getProductByName1(String productName)
{
	WebElement prod = getProductList().stream().filter(product->
	product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	return prod ;
}
public WebElement getProductByName2(String productName)
{
	WebElement prod = getProductList().stream().filter(product->
	product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	return prod ;
}public WebElement getProductByName23(String productName)
{
	WebElement prod = getProductList().stream().filter(product->
	product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	return prod ;
}public WebElement getProductByName34(String productName)
{
	WebElement prod = getProductList().stream().filter(product->
	product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	return prod ;
}


}




