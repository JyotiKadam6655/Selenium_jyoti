package com.Shopperstack_testScripts;

import org.testng.annotations.Test;

import com.ShopperStack.GenericUtility.BaseTest;
import com.Shopperstack_POM.MyAddress_Page;
import com.Shopperstack_POM.MyProfile_Page;

public class Verify_user_is_able_to_delete_address_or_not extends BaseTest {
	
	@Test
	public void delete() throws InterruptedException {
		
		homePage.getSettingBtn().click();
		homePage.getMyProfile().click();
		
		MyProfile_Page myprofilepage=new MyProfile_Page(driver);
		myprofilepage.getMyAddressBtn().click();
		
		Thread.sleep(1000);
		MyAddress_Page myaddresspage=new MyAddress_Page(driver);
		myaddresspage.getDeleteBtn().click();
		myaddresspage.getYesBT().click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();		
	}
	

}
