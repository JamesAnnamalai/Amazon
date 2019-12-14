package org.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.amazon.baseAPI.ProjectSpecificMethods;

public class ProductPage extends ProjectSpecificMethods {

	public ProductPage getDeliveryDate() throws InterruptedException {
		Set<String> allwindowlist = driver.getWindowHandles();
		List<String> windowlist = new ArrayList<String>();
		windowlist.addAll(allwindowlist);
	    driver.switchTo().window(windowlist.get(1));
	    Thread.sleep(5000);
	    String deliverydate = driver.findElementByXPath("//div[@id='ddmDeliveryMessage']/span").getText();
	    System.out.println(deliverydate);
	    return new ProductPage();
	}
	
	public ConfirmationPage clickAddToCart() {
		driver.findElementById("add-to-cart-button").click();
		return new ConfirmationPage(); 
	}
	
	
}
