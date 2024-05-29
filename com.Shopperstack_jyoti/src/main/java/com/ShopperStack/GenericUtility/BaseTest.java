package com.ShopperStack.GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Shopperstack_POM.Home_Page;
import com.Shopperstack_POM.Login_Page;
import com.Shopperstack_POM.Welcome_Page;

public class BaseTest {
	
	public WebDriver driver;      //global variable...if it is local then we can not access it in another class 
    static WebDriver ListenerDriver; //dummy variable(empty) to use in listener class..static variable...if we initialize here it will throw null pointer exception bcz browser has not launch yet
    
    public File_Utility file=new File_Utility();//to use method of file_Utility class...which are readDataFromPropertyDate(),readDataExcel()
    public Welcome_Page welcomePage;
    public Login_Page loginPage;
    public Home_Page homePage;
	public Webdriver_Utility webdriverUtility=new Webdriver_Utility();//for select and action 
	 public Java_Utility javaUtil=new Java_Utility();



	@BeforeSuite
	public void beforeSuite(){
		System.out.println("@BeforeSuite...");
	}
	
	@BeforeTest
	public void beforeTest() throws IOException {
		System.out.println("@BeforeTest..");
		
		
	}
	@BeforeClass()      //read      and browser name from external files
	public void beforeClass() throws IOException, InterruptedException {            //used to launch browser
		System.out.println("@beforeClass..");
		
//		String browser=file.readDataFromPropertyFile("browser");//local
//		String url=file.readDataFromPropertyFile("url"); //local
		
		String browser=System.getProperty("chrome");  //to take values from command line
		String url=System.getProperty("url");         //if we use this lnes , it is mandatory to run it from cmd
		
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser");
		}
		ListenerDriver=driver;/////...
		
		welcomePage =new Welcome_Page(driver);
		loginPage=new Login_Page(driver);
		homePage=new Home_Page(driver);
		
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
		Thread.sleep(3000);
		
	}
	@BeforeMethod   //write code for login
	public void beforeMethod() throws IOException {
		System.out.println("@beforeMethod..");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		
		
		welcomePage.getLoginBtn().click();
		loginPage.getEmailTB().sendKeys(file.readDataFromPropertyFile("username"));
		loginPage.getPasswordTB().sendKeys(file.readDataFromPropertyFile("password"));
	    loginPage.getLoginBtn().click();

	}
	
	
	@AfterMethod    //for logOut
	public void afterMethod() {
		System.out.println("@afterMethod...");
		
      homePage.getSettingBtn().click();
      homePage.getLogOutBtn().click();
		
		
	}
	@AfterClass   //to close browser
	public void afterClass() throws InterruptedException {   
		System.out.println("@afterClass..");
		
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("@afterTest..");
		
		//report.flush();
		}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("@afterSuite..");
	}

}
