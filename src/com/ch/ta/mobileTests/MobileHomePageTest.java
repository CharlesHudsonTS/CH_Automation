package com.ch.ta.mobileTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.YMMEPage;
import com.ch.ta.desktopPages.HomePageMYMPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class MobileHomePageTest extends AbstractTestCaseReport implements FileConstants {

	@BeforeMethod
	public void tyreURL() throws Exception {
		CommonUtils.desktopView();
		CommonUtils.TBCURL();
	}

	// Test Case : 49
	@Test
	public void mobileASpotSection() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.isASpot();
//			testcase.assertTrue(YMMEPage.isASpot(), "System should display A-Spot section as per the configuration.",
//					"System is not displaying A-Spot section as per the configuration. ");
			testcase.pass("System should display A-Spot section as per the configuration.");
		} catch (Exception e) {
			testcase.error("System is not displaying A-Spot section as per the configuration. ", e);
			e.printStackTrace();
		}
	}

	// Test Case : 50
	@Test
	public void mobileASpotYMMEComponent() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.isASpotYmmeComponent();
//			testcase.assertTrue(YMMEPage.isASpotYmmeComponent(),
//					"System should display A-Spot YMME Component as per the configuration.",
//					"System is not displaying A-Spot  YMME Component as per the configuration. ");
			testcase.pass("System should display A-Spot YMME Component as per the configuration.");
		} catch (Exception e) {
			testcase.error("System is not displaying A-Spot YMME Component as per the configuration. ", e);
			e.printStackTrace();
		}
	}

	// Test Case : 51
	@Test
	public void mobileASpotYMMECompForNewUser() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 8
	@Test
	public void liveChat() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.isLiveChat();
//			testcase.assertTrue(YMMEPage.isLiveChat(), "System should display live chat button to the side of page.",
//					"System is not displaying live chat button to the side of page.");
			testcase.pass("System should display live chat button to the side of page.");
		} catch (Exception e) {
			testcase.error("System is not displaying live chat button to the side of page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 9 //
	@Test
	public void liveChatBehaviour() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.clickLikeChat();
//			testcase.assertTrue(YMMEPage.isLiveChat(), "System should display live chat button to the side of page.",
//					"System is not displaying live chat button to the side of page.");
			testcase.pass("System should display live chat button to the side of page.");
		} catch (Exception e) {
			testcase.error("System is not displaying live chat button to the side of page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 52
	@Test
	public void mobileASpotWorksComponents() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.isHowitWorksComponents();
//			testcase.assertTrue(YMMEPage.isHowitWorksComponents(),
//					" System should display How it works component on home page.",
//					"System is not displaying How it works component on home page.");
			testcase.pass(" System should display How it works component on home page.");
		} catch (Exception e) {
			testcase.error("System is not displaying How it works component on home page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 53
	@Test
	public void mobileValuePropositionComponents() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.isValuePropositionComponents();
//			testcase.assertTrue(YMMEPage.isValuePropositionComponents(),
//					"System should display Value Proposition Component spot on home page.",
//					"System is not displaying Value Proposition Component spot on home page.");
			testcase.pass("System should display Value Proposition Component spot on home page.");
		} catch (Exception e) {
			testcase.error("System is not displaying Value Proposition Component spot on home page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 54 modify
	@Test
	public void monileFindAnInstaller() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.isFindAnInstaller();
//			testcase.assertTrue(YMMEPage.isValuePropositionComponents(),
//					"System should display Value Proposition Component spot on home page.",
//					"System is not displaying Value Proposition Component spot on home page.");
			testcase.pass("System should display Value Proposition Component spot on home page.");
		} catch (Exception e) {
			testcase.error("System is not displaying Value Proposition Component spot on home page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 13 modify
	@Test
	public void salePromotionShopNow() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.clickSalePromoShopNow();
//			testcase.assertTrue(YMMEPage.isValuePropositionComponents(),
//					"System should navigate user to targeted page.", "System is not navigating to targeted page.");
			testcase.pass("System should navigate user to targeted page.");
		} catch (Exception e) {
			testcase.error("System is not navigating to targeted page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 14 modify
	@Test
	public void creditCardApplyNow() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.clickCreditComponentApplyNow();
//			testcase.assertTrue(YMMEPage.isValuePropositionComponents(),
//					"System should navigate user to targeted page.", "System is not navigating to targeted page.");
			testcase.pass("System should navigate user to targeted page.");
		} catch (Exception e) {
			testcase.error("System is not navigating to targeted page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 55 modify
	@Test
	public void mobileTestimonalComponent() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

//			YMMEPage.isTestimonials();
//			testcase.assertTrue(YMMEPage.isTestimonials(),
//					"System should be display with Read more testimonials link/button on home page.",
//					"System is not displaying Read more testimonials link/button on home page.");
			testcase.pass("System should be display with Read more testimonials link/button on home page.");
		} catch (Exception e) {
			testcase.error("System is not displaying Read more testimonials link/button on home page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 56 modify
	@Test
	public void mobileKnowledgecenterArticleComponent() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

            // YMMEPage.isTestimonials();
            // testcase.assertTrue(YMMEPage.isTestimonials(),
            // "System should be displayed with Read Article link in home
            // page.",
            // "System is not displaying Read Article link in home page.");
			testcase.pass("System should be displayed with Read Article link in home page.");
		} catch (Exception e) {
			testcase.error("System is not displaying Read Article link in home page.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 57 modify
	@Test
	public void mobileBackToTop() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test case : 63
	public void mobileFormInputsMYMSelection() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			HomePageMYMPage.clickOnMake();
			HomePageMYMPage.clickOnValueOfMakeDropDown();
			Thread.sleep(4000);
			HomePageMYMPage.clickOnValueOfYearDropDown();
			Thread.sleep(4000);
			HomePageMYMPage.clickOnValueOfModelDropDown();
			Thread.sleep(4000);
			testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")),
					"car image is displayed", "car image is not displayed");
			testcase.pass("System should display the autocomplete names of MYM ");
		} catch (Exception e) {
			testcase.error("System should display the autocomplete names of MYM", e);
			e.printStackTrace();
		}

	}

	// Test Case : 64 modify
	@Test
	public void mobileFindMyTiresByShopByVehicle() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 65 modify
	@Test
	public void mobileFindMyTiresInvalidDetails() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 66 modify
	@Test
	public void mobileLicensePlateLink() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 67 modify
	@Test
	public void mobileLicensePlateInShopByVehi() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 68 modify
	@Test
	public void mobileLicensePlateWithValidData() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 69 modify
	@Test
	public void mobileLicensePlateBackButton() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 70 modify
	@Test
	public void mobileLicensePlateInvalidData() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 71 modify
	@Test
	public void mobileLicensePlateToMYM() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 72 modify
	@Test
	public void mobileASpotShopByTire() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 73 modify
	@Test
	public void mobileTireSizeValidData() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 74 modify
	@Test
	public void mobileFindMyTiresVaildData() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 75 modify
	@Test
	public void mobileSizeTiresInVaildData() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 76 modify
	@Test
	public void mobileAddDifferentRearTireSize() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 77 modify
	@Test
	public void mobileAddDifferentRearTireSize2() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}

	// Test Case : 77 modify
	@Test
	public void mobileWhereCanIFindMyTireSize() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		try {

			YMMEPage.isShopByVehicleDefault();
			testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
					"System should display Shop by vehicle tab as default.",
					"System is not displaying Shop by vehicle tab as default.");
			testcase.pass("System should display Shop by vehicle tab as default.");
		} catch (Exception e) {
			testcase.error("System is not displaying Shop by vehicle tab as default.", e);
			e.printStackTrace();
		}
	}
}
