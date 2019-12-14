package org.amazon.pages;

import org.amazon.baseAPI.ProjectSpecificMethods;

public class ConfirmationPage extends ProjectSpecificMethods{

	public ConfirmationPage verifyPageresult() {
		String cartresult = driver.findElementByXPath("//div[@id='huc-v2-order-row-confirm-text']/h1").getText();
	    if(cartresult.equalsIgnoreCase("Added to Cart"))
	    {
	    	System.out.println("Verified");
	    }
	    else
	    {
	    	System.out.println("Failed");
	    }
	    return this;
	}
	
	public SignInPage clickProceedButton() {
		driver.findElementById("hlb-ptc-btn-native").click();
		return new SignInPage();
	}
}
