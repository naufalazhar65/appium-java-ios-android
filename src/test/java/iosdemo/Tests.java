package iosdemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;

public class Tests extends iosTest{
	
//	@Test
//	public void testOne() throws InterruptedException {
//		ExtentTest test = extent.createTest("Test One", "Sample Test");
//		
//        test.log(Status.INFO, "Test One Started");
//        System.out.println("Test 1 Started");
//
//		MobileElement el1 = (MobileElement) driver.findElementById("com.instagram.android:id/tab_avatar");
//		el1.click();
//        test.log(Status.PASS, "Navigated to profile");
//		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Shop");
//		el2.click();
//        test.log(Status.PASS, "Navigated to shop");
//		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Reels");
//		el3.click();
//        test.log(Status.PASS, "Navigated to reels");
//		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Search and explore");
//		el4.click();
//        test.log(Status.PASS, "Navigated to explore");
//		MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Home\"]");
//		el5.click();		
//        test.log(Status.INFO, "Test Completed");
//        Thread.sleep(5000);
//        
//		
//	}

	@Test
	public void testTwo() throws InterruptedException {
		ExtentTest test = extent.createTest("Test two", "Sample Test Two");
		
        test.log(Status.INFO, "Test Two Started");
        System.out.println("Test 2 Started");
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Sauce Labs Bike Light");
        el1.click();
        test.log(Status.PASS, "Navigated to Product page");
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("counter plus button");
        el2.click();
        test.log(Status.PASS, "Click on plus button");
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Add To Cart button");
        el3.click();
        test.log(Status.PASS, "Click on Add to cart");
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("navigation back button");
        el4.click();
        test.log(Status.PASS, "Click on back button and Navigated to homepage");
        Thread.sleep(3000);
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("tab bar option menu");
        el5.click();
        test.log(Status.PASS, "Click on menu button");
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("menu item log in");
        el6.click();
        test.log(Status.PASS, "Click on Login Page And Navigated to login page");
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Username input field");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Username input field");
        el8.sendKeys("naufal");
        test.log(Status.PASS, "User input invalid username");
        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Password input field");
        el5.click();
        el9.sendKeys("naufal123");
        test.log(Status.PASS, "User input invalid password");
        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Select a username and password from the list below, or click on the usernames to automatically populate the username and password.");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Login button");
        el11.click();
        test.log(Status.PASS, "Click on login button");
        test.log(Status.INFO, "And showing massage error");
        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("tab bar option catalog");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("sort button");
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Price - Descending\"]");
        el14.click();


        test.log(Status.INFO, "Test Completed");
        Thread.sleep(5000);
        driver.quit();
	}
	
}
