package com.Grow.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass {
	private WebDriver driver;
	@FindBy(xpath="//*[@id=\\\"root\\\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div/img")
	private WebElement watchlist;
	public void clickwatchlist()
	{
		watchlist.click();
	}
@FindBy(xpath="//div[@class='settingItem valign-wrapper'][5]")
private WebElement logoutButton;
public void clicklogout()
{
	logoutButton.click();
}
public HomePOMClass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
