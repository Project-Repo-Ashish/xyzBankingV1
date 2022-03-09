package com.xyzbanking.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	@CacheLookup
	private WebElement userIdTF;

	@FindBy(name = "password")
	@CacheLookup
	private WebElement userPassTF;

	@FindBy(name = "btnLogin")
	@CacheLookup
	private WebElement userLogin;
	
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement userLogOut;

	public void giveUserName(String uId) {
		userIdTF.sendKeys(uId);
	}

	public void giveUserpassword(String uPass) {
		userPassTF.sendKeys(uPass);
	}

	public void clickLoginBTN() {
		userLogin.click();
	}
	public void userLogOutBTN() {
		userLogOut.click();
	}
	// getters

	public WebElement getUserIdTF() {
		return userIdTF;
	}

	public void setUserIdTF(WebElement userIdTF) {
		this.userIdTF = userIdTF;
	}

	public void setUserPassTF(WebElement userPassTF) {
		this.userPassTF = userPassTF;
	}

	public WebElement getUserPassTF() {
		return userPassTF;
	}

	public WebElement getUserLogin() {
		return userLogin;
	}

}
