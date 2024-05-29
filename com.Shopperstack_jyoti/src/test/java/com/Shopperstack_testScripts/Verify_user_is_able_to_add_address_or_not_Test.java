package com.Shopperstack_testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack.GenericUtility.BaseTest;
import com.Shopperstack_POM.AddressForm_Page;
import com.Shopperstack_POM.MyAddress_Page;
import com.Shopperstack_POM.MyProfile_Page;

public class Verify_user_is_able_to_add_address_or_not_Test extends BaseTest {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException  {
		
		homePage.getSettingBtn().click();
		homePage.getMyProfile().click();
		
		MyProfile_Page myProfilePage=new MyProfile_Page(driver);
		myProfilePage.getMyAddressBtn().click();
		
		MyAddress_Page myaddressPage=new MyAddress_Page(driver);
		myaddressPage.getAddAddressBtn().click();
		
		AddressForm_Page addAddressFormPage=new AddressForm_Page(driver);
		addAddressFormPage.getOfficeRB().click();
		addAddressFormPage.getNameTF().sendKeys(file.readFromExcelFile("Sheet1", 1, 0));
	addAddressFormPage.getHouseTF().sendKeys(file.readFromExcelFile("Sheet1", 1, 1));
		addAddressFormPage.getStreetInfoTF().sendKeys(file.readFromExcelFile("Sheet1", 1, 2));
		addAddressFormPage.getLandMarkTF().sendKeys(file.readFromExcelFile("Sheet1", 1, 3));
		
		webdriverUtility.selectByValue(addAddressFormPage.getCountryDD(), file.readDataFromPropertyFile("country"));
		webdriverUtility.selectByValue(addAddressFormPage.getStateDD(), file.readDataFromPropertyFile("state"));
		webdriverUtility.selectByValue(addAddressFormPage.getCityDD(), file.readDataFromPropertyFile("city"));
		
		addAddressFormPage.getPincodeTB().sendKeys(file.readFromExcelFile("Sheet1", 1, 4));
		addAddressFormPage.getPhoneNumberTF().sendKeys(file.readFromExcelFile("Sheet1", 1, 5));
		addAddressFormPage.getAddAddessBtn().click();	
		//getOfficeInfoTF
	}	
}
