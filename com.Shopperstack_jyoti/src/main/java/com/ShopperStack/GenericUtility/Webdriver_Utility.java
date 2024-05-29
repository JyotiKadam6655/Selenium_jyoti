package com.ShopperStack.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Utility {
	
	//1. for dropDown
	public  void selectByValue(WebElement element,String value) {
		Select sel= new Select(element);
		sel.selectByValue(value);
	
	}
	public  void selectByVisibleText(WebElement element,String value) {
		Select sel= new Select(element);
		sel.selectByVisibleText(value);
	
	}
	public  void selectByIndex(WebElement element, int index) {
		Select sel= new Select(element);
		sel.selectByIndex(index);
	
	}
	public  void deselectByValue(WebElement element,String value) {
		Select sel= new Select(element);
		sel.deselectByValue(value);
	
	}
	public  void deselectByVisibleText(WebElement element,String value) {
		Select sel= new Select(element);
		sel.deselectByVisibleText(value);
	
	}
	public  void deselectByIndex(WebElement element, int index) {
		Select sel= new Select(element);
		sel.deselectByIndex(index);
	
	}
	public  void deselectAll(WebElement element) {
		Select sel= new Select(element);
		sel.deselectAll();
	
	}
	//2 for mouse actions
	
	public void actonMoveToElement(WebDriver driver,WebElement element) {
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();;
	}
	//3. To take Screenshot
	public void getWebPageScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		FileHandler.copy(temp, dest);
	}
}
