package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_TC_001 extends BaseClass {
@Test
public void verify_TestLogin_validCredential()
{
	// WebElement
	LoginPom login=PageFactory.initElements(driver,LoginPom.class);
	
	// Use Generic method custom_sendKeys To Send value to WebElement
	Library.custom_sendKeys(login.getTxt_emailid(),excel.getStringData("Sheet1", 0, 0),"EmailID");
	Library.custom_sendKeys(login.getTxt_password(),excel.getStringData("Sheet1", 0, 1),"Password");
	
	// Use Generic method custom_click To click on WebElement
	Library.custom_click(login.getBtn_login(),"Login");
	
	}
}
