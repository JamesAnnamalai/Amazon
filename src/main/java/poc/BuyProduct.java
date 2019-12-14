package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BuyProduct {
	@Test
	public void product() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://amazon.in");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementByName("field-keywords").sendKeys("Samsung Galaxy M30",Keys.ENTER);
	List<WebElement> totalprice = driver.findElementsByXPath("//span[@class='a-price-whole']");
	System.out.println(totalprice.get(0).getText());
	driver.findElementByXPath("(//img[@src='https://m.media-amazon.com/images/I/81Xpn-TDy-L._AC_UY218_ML3_.jpg'])[1]").click();
	Set<String> allwindowlist = driver.getWindowHandles();
	List<String> windowlist = new ArrayList<String>();
	windowlist.addAll(allwindowlist);
    driver.switchTo().window(windowlist.get(1));
    Thread.sleep(5000);
    String deliverydate = driver.findElementByXPath("//div[@id='ddmDeliveryMessage']/span").getText();
    System.out.println(deliverydate);
    driver.findElementById("add-to-cart-button").click();
    String cartresult = driver.findElementByXPath("//div[@id='huc-v2-order-row-confirm-text']/h1").getText();
    if(cartresult.equalsIgnoreCase("Added to Cart"))
    {
    	System.out.println("Verified");
    }
    else
    {
    	System.out.println("Failed");
    }
    driver.findElementById("hlb-ptc-btn-native").click();
    String title = driver.getTitle();
    if(title.contentEquals("Sign in"))
    {
    	System.out.println("Page Verified");
    }
    else
    {
    	System.out.println("Page Failed");
    }
    driver.findElementById("continue").click();
    String alert = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
    if(alert.equalsIgnoreCase("Enter your email or mobile phone number"))
    {
    	System.out.println("Alert Verified");
    }
    else
    {
    	System.out.println("Alert Failed");
    }
    driver.quit();
	}
	

}
