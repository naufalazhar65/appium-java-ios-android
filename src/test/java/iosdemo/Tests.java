package iosdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileElement;

public class Tests extends iosTest{
	

	@Test
	public void testA() throws InterruptedException {
		ExtentTest test = extent.createTest("Test 1", "Login Test");


		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("tab bar option menu");
		el1.click();
		test.log(Status.PASS, "Click on menu button");
		
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("menu item log in");
		el2.click();
		test.log(Status.PASS, "Click on Login Page And Navigated to login page");
		
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Username input field");
		el3.sendKeys("bob@example.com");
		test.log(Status.PASS, "User input valid username");
		
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Return");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Password input field");
		el5.sendKeys("10203040");
		test.log(Status.PASS, "User input valid password");
		
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Return");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Login button");
		el7.click();
		test.log(Status.PASS, "Click on login button");
		
		test.log(Status.INFO, "Navigated to homepage after successful login");
		Thread.sleep(2000);

	}
	
	@Test
	public void testB() throws InterruptedException {
	    ExtentTest test = extent.createTest("Test 2", "Sort By Test");

	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("sort button");
	    Assert.assertTrue(el1.isDisplayed());
	    el1.click();
	    test.log(Status.PASS, "Clicked sort button");

	    MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Price - Descending\"]");
	    Assert.assertTrue(el2.isDisplayed());
	    el2.click();
	    test.log(Status.PASS, "Clicked 'Price - Descending' option");
//	    assert el2.isDisplayed() : "'Price - Descending' option is not displayed";

	    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("sort button");
	    Assert.assertTrue(el3.isDisplayed());
	    el3.click();
	    test.log(Status.PASS, "Clicked sort button again");
	    
	    MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Price - Ascending\"]");
	    Assert.assertTrue(el4.isDisplayed());
	    el4.click();
	    test.log(Status.PASS, "Clicked 'Price - Ascending' option");

	    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("sort button");
	    Assert.assertTrue(el5.isDisplayed());
	    el5.click();
	    test.log(Status.PASS, "Clicked sort button again");
	    
	    MobileElement el6 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Name - Descending\"]");
	    Assert.assertTrue(el6.isDisplayed());
	    el6.click();
	    test.log(Status.PASS, "Clicked 'Name - Descending' option");

	    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("sort button");
	    Assert.assertTrue(el7.isDisplayed());
	    el7.click();
	    test.log(Status.PASS, "Clicked sort button again");
	    
	    MobileElement el8 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Name - Ascending\"]");
	    Assert.assertTrue(el8.isDisplayed());
	    el8.click();
	    test.log(Status.PASS, "Clicked 'Name - Ascending' option");
	    
	    Thread.sleep(2000);
	}
	
	@Test
	public void testC() throws InterruptedException {
		ExtentTest test = extent.createTest("Test 3", "Add Item To Cart Test");


		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Sauce Labs Backpack");
		el1.click();
		test.log(Status.PASS, "Clicked on Sauce Labs Backpack");

		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Add To Cart button");
		el2.click();
		test.log(Status.PASS, "Clicked on Add To Cart button");

		Thread.sleep(2000);
		
	}
	
	@Test
	public void testD() throws InterruptedException {
	    ExtentTest test = extent.createTest("Test 4", "Checkout Test");

	    // Step 1: Click on Cart Tab
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("tab bar option cart");
	    el1.click();
	    test.log(Status.PASS, "Clicked on Cart Tab");

	    // Step 2: Proceed to Checkout
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Proceed To Checkout button");
	    el2.click();
	    test.log(Status.PASS, "Clicked on Proceed to Checkout button");

	    // Step 3: Fill in Shipping Address Details
	    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Full Name* input field");
	    el3.sendKeys("Naufal Azhar");
	    test.log(Status.PASS, "Entered Full Name in Shipping Address Details");
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Address Line 1* input field");
	    el4.sendKeys("Jakarta");
	    test.log(Status.PASS, "Entered Address Line 1 in Shipping Address Details");
	    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Address Line 2 input field");
	    el5.sendKeys("Indonesia");
	    test.log(Status.PASS, "Entered Address Line 2 in Shipping Address Details");
	    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("City* input field");
	    el6.sendKeys("Pamulang");
	    test.log(Status.PASS, "Entered City in Shipping Address Details");
	    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("State/Region input field");
	    el7.sendKeys("Indonesia");
	    test.log(Status.PASS, "Entered State/Region in Shipping Address Details");
	    MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Return");
	    el8.click();
	    MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Zip Code* input field");
	    el9.sendKeys("1234");
	    test.log(Status.PASS, "Entered Zip Code in Shipping Address Details");
	    MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Return");
	    el10.click();
	    MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Country* input field");
	    el11.sendKeys("Indonesia");
	    test.log(Status.PASS, "Entered Country in Shipping Address Details");
	    MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Return");
	    el12.click();

	    // Step 4: Proceed to Payment
	    MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("To Payment button");
	    el13.click();
	    test.log(Status.PASS, "Clicked on To Payment button");


	 // Step 5: Fill in Payment Details
	    MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Full Name* input field");
	    test.log(Status.PASS, "Found Full Name input field");
	    el15.sendKeys("Naufal");
	    test.log(Status.PASS, "Entered Full Name");
	    
	    MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("Card Number* input field");
	    test.log(Status.PASS, "Found Card Number input field");
	    el16.sendKeys("222222222222222");
	    test.log(Status.PASS, "Entered Card Number");
	    
	    MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("Expiration Date* input field");
	    test.log(Status.PASS, "Found Expiration Date input field");
	    el17.sendKeys("11/2");
	    test.log(Status.PASS, "Entered Expiration Date");

	    MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("Return");
	    test.log(Status.PASS, "Found Return button");
	    el18.click();
	    
	    MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("Security Code* input field");
	    test.log(Status.PASS, "Found Security Code input field");
	    el19.sendKeys("222");
	    test.log(Status.PASS, "Entered Security Code");
	    
	    MobileElement el20 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"My billing address is the same as my shipping address.\"]");
	    el20.click();
	    test.log(Status.PASS, "Found billing address checkbox");

	    MobileElement el21 = (MobileElement) driver.findElementByAccessibilityId("Review Order button");
	    el21.click();
	    el21.click();
	    test.log(Status.PASS, "Clicked Review Order button");


	    MobileElement el22 = (MobileElement) driver.findElementByAccessibilityId("Place Order button");
	    test.log(Status.PASS, "Found Place Order button");
	    el22.click();
	    test.log(Status.INFO, "Clicked Place Order button");
		Thread.sleep(5000);


		
	}

	
//	@Test
//	public void iosTest() throws InterruptedException {
//		ExtentTest test = extent.createTest("Test one", "Sample ios Test");
//		
//        test.log(Status.INFO, "Test Two Started");
//        System.out.println("Test 2 Started");
//        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Sauce Labs Bike Light");
//        el1.click();
//        test.log(Status.PASS, "Navigated to Product page");
//        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("counter plus button");
//        el2.click();
//        test.log(Status.PASS, "Click on plus button");
//        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Add To Cart button");
//        el3.click();
//        test.log(Status.PASS, "Click on Add to cart");
//        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("navigation back button");
//        el4.click();
//        test.log(Status.PASS, "Click on back button and Navigated to homepage");
//        Thread.sleep(3000);
//        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("tab bar option menu");
//        el5.click();
//        test.log(Status.PASS, "Click on menu button");
//        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("menu item log in");
//        el6.click();
//        test.log(Status.PASS, "Click on Login Page And Navigated to login page");
//        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Username input field");
//        el7.click();
//        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Username input field");
//        el8.sendKeys("naufal");
//        test.log(Status.PASS, "User input invalid username");
//        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Password input field");
//        el5.click();
//        el9.sendKeys("naufal123");
//        test.log(Status.PASS, "User input invalid password");
//        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Select a username and password from the list below, or click on the usernames to automatically populate the username and password.");
//        el10.click();
//        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Login button");
//        el11.click();
//        test.log(Status.PASS, "Click on login button");
//        test.log(Status.INFO, "And showing massage error");
//       
//        test.log(Status.INFO, "Test Completed");
//        Thread.sleep(5000);
//	}
//
//	@Test
//	public void iosTest2() throws InterruptedException {
//		ExtentTest test = extent.createTest("Test one", "Sample ios Test");
//		
//	    MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("tab bar option catalog");
//	    el12.click();
//	    MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("sort button");
//	    el13.click();
//	    MobileElement el14 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Price - Descending\"]");
//	    el14.click();
//	    test.log(Status.PASS, "Sort products by price in descending order");
//
//	    
//	    test.log(Status.INFO, "Test Completed");
//	    Thread.sleep(5000);
//	}
	
}
	



