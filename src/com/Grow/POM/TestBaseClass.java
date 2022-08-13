package com.Grow.POM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
 
import com.Grow.UtilityPackage.Screenshot;

public class TestBaseClass 
{
protected WebDriver driver;
@BeforeMethod
public void setup() throws IOException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\seleniumfolder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	driver.manage().window().maximize();
	System.out.println("Browser is maximised");
	driver.get("https://groww.in/");
	System.out.println("URL is Opened");
	Screenshot.takeScreenshot(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(1000);
	LoginPOMClass lp=new LoginPOMClass(driver);
	lp.clickLogin();
	System.out.println("Click on login");
	lp.sendUsername();
	System.out.println("enter username");
	lp.clickcontinue();
	System.out.println("click on continue");
	lp.sendpassword();
	System.out.println("password entered");
lp.clicksubmit();
System.out.println("submit button clicked");
lp.sendpin();
System.out.println("pin entered");
Screenshot.takeScreenshot(driver);

}
@AfterMethod
public void tearDown()
{
	driver.quit();
	System.out.println("browser is closed");
}

	}

	




