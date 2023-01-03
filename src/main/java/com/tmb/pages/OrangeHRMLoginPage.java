package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;
import com.tmb.utils.DecodeUtils;

public final class OrangeHRMLoginPage extends BasePage {

	private final By textboxUsername = By.name("username");
	private final By textboxPassword = By.name("password");
	private final By buttonLogin = By
			.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");

	public OrangeHRMLoginPage enterUserName(String username) {

		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE, "Username");
		return this;
	}

	public OrangeHRMLoginPage enterPassWord(String password) {
		sendKeys(textboxPassword, DecodeUtils.getDecodedString(password), WaitStrategy.PRESENCE, "Password");
		return this;
	}

	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin, WaitStrategy.PRESENCE, "Login Button");
		return new OrangeHRMHomePage();
	}

	public String getTitle() {
		return getPageTitle();
	}

}
