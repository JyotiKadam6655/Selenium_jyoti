package com.ShopperStack.GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
	
	 
    public int generateRandomNumber() {
    	
    	Random r=new Random();
    	int value=r.nextInt(1000); //it will generate random number between 1 to 1000
    	return value;              //so that file name should be unique every time 
    }
    
    public String localDate() {
    	return LocalDate.now().toString().replace("-","");//to remove - between date
    }
    
    public String localDateTime() {
    	return LocalDateTime.now().toString().replace("-", "").replace(".", "").replace(":", "");//to remove - and , in between 
    }
}
