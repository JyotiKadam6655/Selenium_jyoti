package com.Shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page {
	public AddressForm_Page(WebDriver driver) {   //constructor
		  PageFactory.initElements(driver, this);
}
	@FindBy(id="Office")
	private WebElement officeRB;
	
	@FindBy(id="Name")
	private WebElement nameTF;

	@FindBy(id="House/Office Info")
	private WebElement houseTF;

	@FindBy(id="Street Info")
	private WebElement streetInfoTF;

	@FindBy(id="Landmark")
	private WebElement landMarkTF;

	@FindBy(id="Country")
	private WebElement countryDD;
	
	@FindBy(id="State")
	private WebElement stateDD;
	
	@FindBy(id="City")
	private WebElement cityDD;
	
	@FindBy(id="Pincode")
	private WebElement pincodeTB;

	@FindBy(id="Phone Number")
	private WebElement phoneNumberTF;

	@FindBy(id="addAddress")
	private WebElement addAddessBtn;
	
	
	public WebElement getOfficeRB() {
		return officeRB;
	}

	public WebElement getNameTF() {
		return nameTF;
	}
	
	public WebElement getHouseTF() {
		return houseTF;
	}

	public WebElement getStreetInfoTF() {
		return streetInfoTF;
	}

	public WebElement getLandMarkTF() {
		return landMarkTF;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNumberTF() {
		return phoneNumberTF;
	}

	public WebElement getAddAddessBtn() {
		return addAddessBtn;
	}
	
	
	





}
