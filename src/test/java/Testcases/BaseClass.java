package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
public String URL= "https://rahulshettyacademy.com/client/";
public String UserName = "kumkumjain1498@gmail.com";
public String Password = "Kumkum@123";
public static WebDriver rdriver;

@BeforeClass
public void setup()
{
	WebDriverManager.chromedriver().setup();
	WebDriverManager.edgedriver().setup();
	rdriver= new EdgeDriver();
}




}
