package com.Grow.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		 
		Date d = new Date(); 
		 DateFormat d1 = new SimpleDateFormat("DD-MM-yyyy & HH-mm-ss");
		 String date = d1.format(d);
				
				//screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\eclipse\\Screenshotsel\\Growapp" + date + ".jpg");
				FileHandler.copy(sourceFile, destFile);
				System.out.println("login screenshot is taken");

}
}

