package org.amazon.testcases;

import org.amazon.baseAPI.ProjectSpecificMethods;
import org.amazon.pages.HomePage;
import org.testng.annotations.Test;

public class TC001 extends ProjectSpecificMethods{
    @Test
	public void buyAProduct() throws InterruptedException {
		new HomePage() 
		.enterText()
		.getFirstProductPrize()
		.clickFirstProduct()
		.getDeliveryDate()
		.clickAddToCart()
		.verifyPageresult()
		.clickProceedButton()
		.verifyPageTitle()
		.clickContinue()
		.verifyErrorMessage();
	}
}
