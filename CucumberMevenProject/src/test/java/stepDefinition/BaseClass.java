package stepDefinition;



import java.util.Properties;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.MyAttendance;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public MyAttendance ma;
	public Properties configProp; 	
	
}
