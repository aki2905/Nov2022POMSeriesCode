package com.qa.rockers.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.rockers.factory.DriverFactory;
import com.qa.rockers.pages.AccountsPage;
import com.qa.rockers.pages.LoginPage;
import com.qa.rockers.pages.ProductInfoPage;
import com.qa.rockers.pages.RegisterPage;
import com.qa.rockers.pages.SearchPage;
import com.qa.rockers.pages.ViewCartPopUpPage;

public class BaseTest {

	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected LoginPage loginPage;
	protected AccountsPage accPage;
	protected SearchPage searchPage;
	protected ProductInfoPage productInfoPage;
	protected ViewCartPopUpPage viewCartPopUpPage;
	protected RegisterPage registerPage;

	
protected SoftAssert softAssert;
	
	
@Parameters({"browser", "browserversion", "testcasename"})
@BeforeTest
public void setup(String browserName, String browserVersion, String testCaseName) {
	df = new DriverFactory();
	prop = df.initProp();
	
		if(browserName!=null) {
			prop.setProperty("browser", browserName);
			prop.setProperty("browserversion", browserVersion);
			prop.setProperty("testcasename", testCaseName);

		}
	
	
	driver = df.initDriver(prop);
	loginPage = new LoginPage(driver);
	softAssert = new SoftAssert();
} 

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}