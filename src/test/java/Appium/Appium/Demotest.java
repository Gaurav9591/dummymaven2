package Appium.Appium;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demotest extends Basechrome {

	
	@Test
	
	public void test() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.get("https://www.elite.com/prolaw/mobile/");
	
		
		
		
		
		
	}
	
	
	
	
	
	
}
