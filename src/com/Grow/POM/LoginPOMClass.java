package com.Grow.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPOMClass {
		private WebDriver driver;		
	@FindBy(xpath="//span[text()='Login/Register']")	
	private WebElement Login;
	public void clickLogin()
	{
		Login.click();
	}
	@FindBy(xpath="//input[@id='login_email1']")
	private WebElement email;
	public void sendUsername()
	{
	email.sendKeys("rupalinarkhede923@gmail.com");	
	}
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continue1;
	public void clickcontinue()
	{
		continue1.click();
	}
	@FindBy(xpath="//input[@id='login_password1']")
	private WebElement password;
	public void sendpassword()
	{
		password.sendKeys("abcd1234");
	}
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement submit;
	public void clicksubmit()
	{
		submit.click();
	}
	@FindBy(xpath="//*[@id=\\\"otpinput88parent\\\"]/div[1]/input")
	private WebElement pin;
	public void sendpin()
	{
	pin.sendKeys("8 6 9 1");	
	}
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
