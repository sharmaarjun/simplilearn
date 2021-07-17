package com.appium;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestContact {
	
	
	AndroidDriver<MobileElement> driver;

	@BeforeTest
	public void setUp() throws Exception {
		URL URL = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage" , " com.android.contacts");
		cap.setCapability("appActivity" , "com.android.contacts.activities.PeopleActivity");

		driver = new AndroidDriver<MobileElement>(URL, cap);
		
	}

	
	
  @Test(dataProvider = "dataContacts")
  public void f(String name, String contact) {
	  System.out.println(name+" - "+contact);
	  
	  
	  driver.hideKeyboard();
	  
	  
	  
	//android.widget.EditText[@text='First name']
  }

  @DataProvider
  public String[][] dataContacts() {
    return new String[][] {
    	new String[] { "AFLKQA", "5560" },
    	 new String[] { "BHOIVA", "5562" },
    	 new String[] { "CJYXWF", "5564" },
    	 new String[] { "DCNKER", "5566" },
    	 new String[] { "EPOUEY", "5568" },
    	 new String[] { "FERAYL", "5570" },
    	 new String[] { "GTJYVU", "5572" },
    	 new String[] { "HNEEZO", "5574" },
    	 new String[] { "IRFXXB", "5576" },
    	 new String[] { "JVEQPN", "5578" },
    	 new String[] { "KILOLR", "5580" },
    	 new String[] { "LVESOG", "5582" },
    	 new String[] { "MXPQML", "5584" },
    	 new String[] { "NSNWRX", "5586" },
    	 new String[] { "OELMGP", "5588" },
    	 new String[] { "PUSOXD", "5590" },
    	 new String[] { "QSRYBX", "5592" },
    	 new String[] { "RIHTXJ", "5594" },
    	 new String[] { "SUNGJZ", "5596" },
    	 new String[] { "TFOEWE", "5598" },
    	 new String[] { "UZVSCF", "5600" },
    	 new String[] { "VEYTQI", "5602" },
    	 new String[] { "WZWBJY", "5604" },
    	 new String[] { "XNYPYA", "5606" },
    	 new String[] { "YGUEOL", "5608" },
    	 new String[] { "ZVPZMA", "5610" }

      
    };
  }
}