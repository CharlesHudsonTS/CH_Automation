package com.ch.ta.mobileTests;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.email.EmailUtility;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.CreateAccWithEmailPage;
import com.ch.ta.desktopPages.CreateAnAccountPage;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.LoginPage;
import com.ch.ta.mobilePages.MobileCreateAnAccPage;
import com.ch.ta.mobilePages.MobileHeaderFooterPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class MobileCreateAnAccTest extends AbstractTestCaseReport implements FileConstants {

	public void tyreURL() throws Exception {
		CommonUtils.TBCURL(); 

}
	// TA_REG_01
		//To verify the display and functionality of 'Create an Account' link in 'Sign In/Register' flyout..
		@Test
		public void createAccountLinkTest() throws Exception {
			String name = new Object() {
			}.getClass().getEnclosingMethod().getName();
			TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
			Retry retry = new Retry(1);
			while (retry.retry()) {
				try {
					tyreURL();
					SeleniumUtils.wait(5);
					MobileHeaderFooterPage.clickOnHumbergerMenu();
					testcase.assertTrue(MobileHeaderFooterPage.verifySignInOrRegistration(),
							"Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
					SeleniumUtils.wait(5);
					MobileHeaderFooterPage.clickSignInOrRegistration();
					SeleniumUtils.wait(5);
					testcase.assertTrue(MobileCreateAnAccPage.isCreateAccountLink(),
							"Create Account link is displayed in Sign In Flyout",
							"Create Account link is not displayed in Sign In Flyout");
					SeleniumUtils.wait(05);
					MobileHeaderFooterPage.clickCreateAccountLink();
					SeleniumUtils.wait(5);
					String currentUrl1 = DriverFactory.getDriver().getCurrentUrl();
					boolean contains1 = currentUrl1.contains("register");
					testcase.assertTrue(contains1, "Correct Navigation", "Incorrect Navigation");
					testcase.pass("Create Account page is displayed on clicking create Account link in SignIn flyout");
					break;
				} catch (Exception e) {
					testcase.retry("Create Account page is displayed on clicking create Account link in SignIn flyout",
							testcase, retry, e);

					e.printStackTrace();
				}
			}
		}
		// TA_REG_02
		// To verify the display of 'Create an Account' title & Benefits to creating an account section in 'Create an Account' page.
		
		@Test
		public void createAccountLogoTextTest() throws Exception {
			String name = new Object() {
			}.getClass().getEnclosingMethod().getName();
			TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
			Retry retry = new Retry(1);
			while (retry.retry()) {
				try {
					tyreURL();
					SeleniumUtils.wait(5);
					MobileHeaderFooterPage.clickSignInOrRegistration();					
					SeleniumUtils.wait(5);
					MobileHeaderFooterPage.clickCreateAccountLink();
					SeleniumUtils.wait(5);
					testcase.assertTrue(MobileCreateAnAccPage.isMobileSiteLogoCreateAccount(), " Mobile Site Logo is displayed",
							"Moile Site Logo is not displayed");
					testcase.assertTrue(MobileCreateAnAccPage. benefitsofMobileCreateAcct(),
							"Title & Static text is displayed in Mobile", "Title & Static text is not displayed in Mobile");
					testcase.pass("Create Account page is displayed with site logo, title and static text in Mobile");
					break;
				} catch (Exception e) {
					testcase.retry("Create Account page is displayed with site logo, title and static text in Mobile", testcase,
							retry, e);

					e.printStackTrace();
				}
			}
		}
		
		// TA_REG_03
		// To verify the display of 'Create an Account with Email' button & social media icons in 'Create an Account' page.
		@Test
		public void createAccountUITest() throws Exception {
			String name = new Object() {
			}.getClass().getEnclosingMethod().getName();
			TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
			Retry retry = new Retry(1);
			while (retry.retry()) {
			try {
				tyreURL();
				SeleniumUtils.wait(5);
				HeaderFooterPage.clickSignInOrRegistration();
				SeleniumUtils.wait(5);
				MobileHeaderFooterPage.clickCreateAccountLink();
				SeleniumUtils.wait(5);
				testcase.assertTrue(MobileCreateAnAccPage.isCreateAccWithEmailButton(),
						"Create Account page is displayed with Create Account with Email button",
						"Create Account page is not displayed with Create Account with Email button");
				MobileCreateAnAccPage.isDisplaySocialIcons();
				testcase.assertTrue(MobileCreateAnAccPage.isFacebookIcon(),
						"Facebook icon is displayed in Create Account page",
						"Facebook icon is not displayed in Create Account page");
				testcase.assertTrue(MobileCreateAnAccPage.isTwitterIcon(), "Twitter icon is displayed in Create Account page",
						"Twitter icon is not displayed in Create Account page");
				testcase.assertTrue(MobileCreateAnAccPage.isInstagramIcon(), "Instagram icon is displayed in Create Account page",
						"Google icon is not displayed in Create Account page");
				testcase.assertTrue(MobileCreateAnAccPage.isWordpressIcon(), "Yahoo icon is displayed in Create Account page",
						"Yahoo icon is not displayed in Create Account page");
				testcase.pass("UI of Create Account page with Create account with email button and social media icons");
				break;
			} catch (Exception e) {
				testcase.error("UI of Create Account page with Create account with email button and social media icons", e);
				e.printStackTrace();
			}
		}
		}
		
		// TA_REG_04
		// To verify that the user is able to create account through social 
		//media link 'Facebook' in 'Create an Account' page.
		@Test
		public void facebookIconTest() throws Exception {
			String name = new Object() {
			}.getClass().getEnclosingMethod().getName();
			TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
			Retry retry = new Retry(1);
			while (retry.retry()) {
			try {
				tyreURL();
				SeleniumUtils.wait(5);
				HeaderFooterPage.clickSignInOrRegistration();
				SeleniumUtils.wait(5);
				MobileHeaderFooterPage.clickCreateAccountLink();
				SeleniumUtils.wait(5);
				MobileCreateAnAccPage.isDisplaySocialIcons();
				MobileCreateAnAccPage.clickFacebookIcon();
				SeleniumUtils.wait(5);
				String parentWindowHandler = DriverFactory.getDriver().getWindowHandle();
				String subWindowHandler = null;

				Set<String> handles = DriverFactory.getDriver().getWindowHandles();
				Iterator<String> iterator = handles.iterator();
				while (iterator.hasNext()) {
					subWindowHandler = iterator.next();
				}
				DriverFactory.getDriver().switchTo().window(subWindowHandler);
				// TBC has not yet implemented the social media login
				Thread.sleep(2000);
				DriverFactory.getDriver().close();

				DriverFactory.getDriver().switchTo().window(parentWindowHandler);
				testcase.pass("User is able to Log In to his account using Facebook icon in Create Account page");
				break;
			} catch (Exception e) {
				testcase.error("User is able to Log In to his account using Facebook icon in Create Account page", e);
				e.printStackTrace();
			}
		}
		}
		// TA_REG_05
		// To verify that the user is able to create account through social 
		//media link 'Twitter' in 'Create an Account' page.
		
		@Test
		public void twitterIconTest() throws Exception {
			String name = new Object() {
			}.getClass().getEnclosingMethod().getName();
			TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
			Retry retry = new Retry(1);
			while (retry.retry()) {
			try {
				tyreURL();
				SeleniumUtils.wait(5);
				HeaderFooterPage.clickSignInOrRegistration();
				SeleniumUtils.wait(5);
				MobileHeaderFooterPage.clickCreateAccountLink();
				SeleniumUtils.wait(5);
				MobileCreateAnAccPage.isDisplaySocialIcons();
				MobileCreateAnAccPage.clickTwitterIcon();
				SeleniumUtils.wait(5);
				String parentWindowHandler = DriverFactory.getDriver().getWindowHandle();
				String subWindowHandler = null;

				Set<String> handles = DriverFactory.getDriver().getWindowHandles();
				Iterator<String> iterator = handles.iterator();
				while (iterator.hasNext()) {
					subWindowHandler = iterator.next();
				}
				DriverFactory.getDriver().switchTo().window(subWindowHandler);
				// TBC has not yet implemented the social media login
				Thread.sleep(2000);
				DriverFactory.getDriver().close();

				DriverFactory.getDriver().switchTo().window(parentWindowHandler);
				testcase.pass("User is able to Log In to his account using Twitter icon in Create Account page");
				break;
			} catch (Exception e) {
				testcase.error("User is able to Log In to his account using Twitter icon in Create Account page", e);
				e.printStackTrace();
			}
		}
		}
		// TA_REG_10
		// To verify the functionality of 'Create Account with Email' button in
		// 'Create an Account' page.
		@Test
		public void createAccountWithEmailTest() throws Exception {
			String name = new Object() {
			}.getClass().getEnclosingMethod().getName();
			TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
			Retry retry = new Retry(1);
			while (retry.retry()) {
			try {
				tyreURL();
				SeleniumUtils.wait(5);
				HeaderFooterPage.clickSignInOrRegistration();
				SeleniumUtils.wait(5);
				MobileHeaderFooterPage.clickCreateAccountLink();
				SeleniumUtils.wait(5);
				testcase.assertTrue(MobileCreateAnAccPage.isCreateAccWithEmailButton(),
						"Create Account With Email button displayed", "Create Account With Email button not displayed");
				MobileCreateAnAccPage.clickCreateAccWithEmailButton();
				SeleniumUtils.wait(5);
				testcase.assertTrue(MobileCreateAnAccPage.isEmailAddressBox(), "Create Account With Email page displayed",
						"Create Account With Email page not displayed");
				testcase.pass("Display & Functionality of create account with Email button in Create Account page");
				break;
			} catch (Exception e) {
				testcase.error("Display & Functionality of create account with Email button in Create Account page", e);
				e.printStackTrace();
			}
		}
	}

}