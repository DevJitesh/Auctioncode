package org.kale.auction.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage
{
	WebDriver driver;
	
	public LoginPage(WebDriver dr)
	{
		driver=dr;
	}
	
	/**
	 * This method is used to login to CODEX-Auction
	 *
	 * @param username user name of cfs user
	 * @param password password of cfs user
	 */
	
	public void login(String username, String password)
	{
		driver.findElement(By.id("txtUsrName")).sendKeys(username);
		
		driver.findElement(By.id("txtPswd")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	} 
}
