package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAttendance 
{
public WebDriver ldriver;

public MyAttendance(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(ldriver,  this);
}

//This time using different way of Find BY locators
//First caputure  the locators for all the elements
//Then perform the actions methods for all the locators	

By PersonalInfo_linkMenu=By.xpath("//span[contains(@class,'ng-binding')]  [contains(text(),'Personal Information')]");
By Myattendance_link=By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[2]/ul/li[1]/a");
By PuchinDetails_link=By.xpath("//span[contains(text(), 'incorrect punch')]");
By ClosePunchin_Popup=By.xpath("//button[contains(text(), 'Close')]");

//Actions Methods

public String getPageTitle()
{
	return ldriver.getTitle();
}


public void clickPersonalInformationLink()
{
	ldriver.findElement(PersonalInfo_linkMenu).click();
}

public void clickOnMyAttendance()
{
	ldriver.findElement(Myattendance_link).click();
}

public void clickOnPunchinDetails()
{
	ldriver.findElement(PuchinDetails_link).click();
}

public void closePunchin()
{
	ldriver.findElement(ClosePunchin_Popup).click();
}






}
