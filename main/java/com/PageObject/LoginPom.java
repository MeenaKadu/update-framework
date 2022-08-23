package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom 
{
	// WebElement ----> Login Webpage
@FindBy(how=How.XPATH,using="//input[@name='email']")
private WebElement txt_emailid;

@FindBy(how=How.XPATH,using="//input[@name='pass']")
private WebElement txt_password;

@FindBy(how=How.XPATH,using="//button[@name='login']")
private WebElement btn_login;

// Generate Getter and Setter Method (Encapsulation ---> Java Concept )
public WebElement getTxt_emailid() 
{
	return txt_emailid;
}

public WebElement getTxt_password() 
{
	return txt_password;
}

public WebElement getBtn_login() 
{
	return btn_login;
}
}
