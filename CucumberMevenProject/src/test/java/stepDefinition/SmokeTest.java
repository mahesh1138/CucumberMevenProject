package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MyAttendance;



public class SmokeTest extends BaseClass
{
	public static Logger logger;
	
	@Before
	public void setup() throws IOException
	{
		logger=Logger.getLogger("HRMS");
		PropertyConfigurator.configure("Log4j.properties");
		
		//reading properties
		configProp=new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		String br=configProp.getProperty("browser");
																											//Run on desired browser "chrome or firfox"
		if(br.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		}
		
	}

	@Given("^User launch chrome browser$")
	public void user_launch_chrome_browser() throws Throwable 
	{
		
		 lp=new LoginPage(driver);
		 
	}

	@When("^User opens URL \"(.*?)\"$")
	public void user_opens_URL(String url) throws Throwable
	{
		logger.info("Url Opened successfully");
		driver.get(url);
		 Thread.sleep(2000);

	}

	@Then("^User enters username as \"(.*?)\" and password as \"(.*?)\"$")
	public void user_enters_username_as_and_password_as(String username, String password) throws Throwable 
	{
		logger.info("Entered Username and password successfully");
		lp.setUserName(username);
		lp.setpassword(password);
	}

	@Then("^Click on Login$")
	public void click_on_Login() throws Throwable 
	{

		lp.clickSubmit();
		logger.info("Login successfully");
		Thread.sleep(2000);
		ma=new MyAttendance(driver);
		Assert.assertEquals("Dashboard",ma.getPageTitle());
	}
	
	@Then("^user click on Personal information tab$")
	public void user_click_on_Personal_information_tab() throws Throwable 
	{

	    ma.clickPersonalInformationLink();
	    Thread.sleep(1000);
	}

	@Then("^click on MyAttendance link$")
	public void click_on_MyAttendance_link() throws Throwable 
	{
	    ma.clickOnMyAttendance();
	    Thread.sleep(2000);
	}

	@Then("^Select employee from date and to date and click on submit button$")
	public void select_employee_from_date_and_to_date_and_click_on_submit_button() throws Throwable 
	{
		WebElement select=driver.findElement(By.xpath("//select[@name='empid']"));
		Select EmpId=new Select(select);
		EmpId.selectByVisibleText("Self");
	    Thread.sleep(1000);
	    
		//Select from and To date and click on submit button.
	    driver.findElement(By.xpath("//input[@name='fromDateComp']")).clear();
		driver.findElement(By.xpath("//input[@name='fromDateComp']")).sendKeys("06-Feb-2020");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='toDateComp']")).clear();
		driver.findElement(By.xpath("//input[@name='toDateComp']")).sendKeys("06-Feb-2020");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
		 Thread.sleep(3000);
	}

	@Then("^click on Punchin details and verify break details$")
	public void click_on_Punchin_details_and_verify_break_details() throws Throwable 
	{
	    ma.clickOnPunchinDetails();
		 Thread.sleep(3000);
	}

	@Then("^close the pop up window$")
	public void close_the_pop_up_window() throws Throwable 
	{
	    ma.closePunchin();
	    Thread.sleep(2000);
	}


	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable 
	{
		driver.quit();
		logger.info("closed browser successfully");

	}


}
