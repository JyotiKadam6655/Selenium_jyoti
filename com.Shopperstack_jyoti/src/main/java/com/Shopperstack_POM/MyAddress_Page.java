package com.Shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page {
	public MyAddress_Page(WebDriver driver) {
		  PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressBtn;
	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	//to delete address
		@FindBy(xpath="(//span[contains(@class,'MuiButton-startIcon ')])[2]")
		private WebElement deleteBtn;
		
		
	    //to delete address
		public WebElement getDeleteBtn() {
			return deleteBtn;
		}
		//element to click element
		
		@FindBy(xpath="//button[text()='Yes']")
		private WebElement yesBT;
		
		public WebElement getYesBT() {
			return yesBT;
		}
		@FindBy(xpath="(//span[contains(@class,'MuiButton-startIcon ')])[1]")
		private WebElement editBtn;

		public WebElement getEditBtn() {
			return editBtn;
		}

		
		
	

	
}

