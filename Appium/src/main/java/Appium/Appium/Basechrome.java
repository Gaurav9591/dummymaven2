package Appium.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class Basechrome 
{
   
	
	public   AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		
	AndroidDriver<AndroidElement>  driver;

	// TODO Auto-generated method stub
	/* File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");*/
	
	
	
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	    
	    // capabilities.setCapability("chromedriverExcecutble" ,"‪/Appium/exefiles/chromedriver.exe");
	     
	    // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	     
	     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	   
	    
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel");
	     
	     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	     
	     capabilities.setCapability(MobileCapabilityType.UDID, "");
	    
	  //   capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     
	     
	    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   
	   return driver;
	}
	
	
	
	
	
}