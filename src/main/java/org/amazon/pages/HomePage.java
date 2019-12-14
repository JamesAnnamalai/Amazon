package org.amazon.pages;

import java.util.List;

import org.amazon.baseAPI.ProjectSpecificMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends ProjectSpecificMethods {

	public HomePage enterText() {
		driver.findElementByName("field-keywords").sendKeys("Samsung Galaxy M30",Keys.ENTER);
		return this;
	}
	
	public HomePage getFirstProductPrize() {
		List<WebElement> totalprice = driver.findElementsByXPath("//span[@class='a-price-whole']");
		System.out.println(totalprice.get(0).getText());
		return new HomePage();
	}
	
	public ProductPage clickFirstProduct() {
		driver.findElementByXPath("(//img[@src='https://m.media-amazon.com/images/I/81Xpn-TDy-L._AC_UY218_ML3_.jpg'])[1]").click();
	    return new ProductPage();
	}
	
}
