package org.amazon.baseAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethods  {
	public String excelFileName;
	public static ChromeDriver driver;
    @BeforeMethod
	public void Login() {
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   @AfterMethod
   public void closeBrowser() {
		driver.quit();
	}

   
   }
