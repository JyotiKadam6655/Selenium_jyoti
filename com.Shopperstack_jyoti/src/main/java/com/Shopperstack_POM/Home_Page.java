package com.Shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public Home_Page(WebDriver driver) {
		  PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//div[text()='j']")
	private WebElement settingBtn;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logOutBtn;

	public WebElement getSettingBtn() {
		return settingBtn;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
	
	
	


}


