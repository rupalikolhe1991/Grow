package com.Grow.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Grow.POM.TestBaseClass;

public class TC01VerifyLoginFunctioality extends TestBaseClass
{
@Test
public void verifyLogin()
{
	String expectedTitle="Groww";
	String actualTitle=driver.getTitle();
	
	Assert.assertEquals(expectedTitle,actualTitle);
	}

}
