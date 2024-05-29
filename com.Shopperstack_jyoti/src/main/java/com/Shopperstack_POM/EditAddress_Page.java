package com.Shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAddress_Page {
	
	public EditAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="Home")
	private WebElement ehomeRB;
	
	@FindBy(id="Name")
	private WebElement enameTF;

	@FindBy(id="House/Office Info")
	private WebElement ehouseTF;

	@FindBy(id="Street Info")
	private WebElement estreetInfoTF;
	
	@FindBy(id="Landmark")
	private WebElement landMarkTF;

	@FindBy(id="Country")
	private WebElement ecountryDD;
	
	@FindBy(id="State")
	private WebElement estateDD;
	
	@FindBy(id="City")
	private WebElement ecityDD;
	
	@FindBy(id="Pincode")
	private WebElement epincodeTB;

	@FindBy(id="Phone Number")
	private WebElement ephoneNumberTF;

	@FindBy(id="Update Address")
	private WebElement eUpdateAddress;
	
	

	public WebElement getHomeRB() {
		return ehomeRB;
	}

	public WebElement getNameTF() {
		return enameTF;
	}

	public WebElement getHouseTF() {
		return ehouseTF;
	}

	public WebElement getStreetInfoTF() {
		return estreetInfoTF;
	}

	public WebElement getLandMarkTF() {
		return landMarkTF;
	}

	public WebElement getCountryDD() {
		return ecountryDD;
	}

	public WebElement getStateDD() {
		return estateDD;
	}

	public WebElement getCityDD() {
		return ecityDD;
	}

	public WebElement getPincodeTB() {
		return epincodeTB;
	}

	public WebElement getPhoneNumberTF() {
		return ephoneNumberTF;
	}

	public WebElement getUpdateAddress() {
		return eUpdateAddress;
	}

		

	


}
