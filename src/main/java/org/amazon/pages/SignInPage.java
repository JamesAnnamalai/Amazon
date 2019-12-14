package org.amazon.pages;

import org.amazon.baseAPI.ProjectSpecificMethods;

public class SignInPage extends ProjectSpecificMethods {

	public SignInPage verifyPageTitle() {
		String title = driver.getTitle();
	    if(title.contentEquals("Sign in"))
	    {
	    	System.out.println("Page Verified");
	    }
	    else
	    {
	    	System.out.println("Page Failed");
	    }
	    return this;
	}
	
	public SignInPage clickContinue() {
		driver.findElementById("continue").click();
		return this;
	}
	
	public SignInPage verifyErrorMessage() {
		String alert = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
	    if(alert.equalsIgnoreCase("Enter your email or mobile phone number"))
	    {
	    	System.out.println("Alert Verified");
	    }
	    else
	    {
	    	System.out.println("Alert Failed");
	    }
	    return this;
	}
}
