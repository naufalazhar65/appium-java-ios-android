package iosdemo;

import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class iosTest extends ExtentReport{
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
//		CHOOSE PLATFORM FOR TEST android or ios
		String platform = "ios";
		
//		CAPS FOR ANDROID
		if(platform.equalsIgnoreCase("android")) {
		caps.setCapability("deviceName", "Gphone");
		caps.setCapability("udid", "B796F99B-2EA0-4C79-94D8-7718AB79AA90");
		caps.setCapability("noReset", "True");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVerison", "12");	
		caps.setCapability("appPackage", "com.instagram.android");
		caps.setCapability("appActivity", "com.instagram.mainactivity.MainActivity");
		}
		
//		CAPS FOR IOS
		else if(platform.equalsIgnoreCase("ios")) {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"16.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 14 pro");
		caps.setCapability(MobileCapabilityType.UDID,"5D083F20-766C-45E3-9FBF-C65BBCC779E7");
		caps.setCapability(MobileCapabilityType.NO_RESET,true);
		caps.setCapability(MobileCapabilityType.APP,"/Users/naufalazhar/Documents/Demo App/MyRNDemoApp.app");
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Safari");
		}


		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, caps);
		driver = new IOSDriver<MobileElement>(url, caps);
		
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("message is : "+exp.getMessage());
			exp.printStackTrace();
		}

	}
	
	@AfterTest
	public void teardown() {
		
	}

}