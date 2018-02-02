package com.ch.ta.desktopTests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.BrandListingPage;
import com.ch.ta.desktopPages.ConfirmTireSizePage;
import com.ch.ta.desktopPages.HomePage;
import com.ch.ta.desktopPages.ProductDetailPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class BrandListingTest extends AbstractTestCaseReport implements FileConstants {

	public void tyreURL() throws Exception {
		CommonUtils.desktopView();
		CommonUtils.TBCURL();
	}
     //Test case:1,2
	// 1 : To verify that the user is able to navigate to Brand Listing page.
	@Test
	public void verifyBrandListingPage() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		Retry retry = new Retry(2);
        while (retry.retry())
        {
		try {
                tyreURL();
                SeleniumUtils.wait(5);
			    HomePage.hoverOnTires();
			    SeleniumUtils.wait(2);
			    HomePage.clickOnshopByBrand();
			    SeleniumUtils.wait(2);
			    testcase.assertTrue(BrandListingPage.isShopTireByBrandText(), "System is display 'shop tire by brand' text in  Brand Listing  Page",
					"System is not display 'shop tire by brand' text in  Brand Listing  Page");
			    testcase.assertTrue(BrandListingPage.isDisplayListofBrandLogos(), "System is display List of Brand logos in  Brand Listing  Page",
	                    "System is not display List of Brand logos in  Brand Listing  Page");
			    testcase.assertTrue(BrandListingPage.isNoVehicleSelected(),
	                    "System Should display No vehicle selected in Brand Listing page",
	                    "System is not displaying No vehicle selected in Brand Listing page");
			testcase.pass("System Should navigate to Brand Listing Page");
			break;
		} catch (Exception e) {
			testcase.retry("System is not navigating to Brand Listing Page", testcase, retry, e);
			e.printStackTrace();
		}
	}
	}
	
	// 3 : To verify that the user is able to navigate to brand details page after
	@Test
    public void verifyBrandDetailPageByBrand() throws Exception {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
        try {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(2);
                testcase.assertTrue(BrandListingPage.isShopTireByBrandText(), "System is display 'shop tire by brand' text in  Brand Listing  Page",
                    "System is not display 'shop tire by brand' text in  Brand Listing  Page");
                testcase.assertTrue(BrandListingPage.isNoVehicleSelected(),
                        "System Should display Brand Tire Size in Brand Line Details Page",
                        "System is not displaying Brand Tire Size in Brand Line Details Page");
                BrandListingPage.clickOnAnyBrand();
                SeleniumUtils.wait(4);
                testcase.assertTrue(BrandListingPage.isDisplayBrandDetails(),
                        "System Should display Brand Logo and Details in Brand Details Page",
                        "System is not displaying Brand Logo and Details in Brand Details Page");
            testcase.pass("System Should navigate to Brand Detail Page and display Brand Logo and Details in Brand Details Page");
            break;
        } catch (Exception e) {
            testcase.retry("System Should not navigate to Brand Detail Page and display Brand Logo and Details in Brand Details Page", testcase, retry, e);
            e.printStackTrace();
        }
    }}
	  //Test case:4
    // To verify that the brand logo is associated with alt text in brand listing page.
    @Test
    public void verifyBrandLogoText() throws Exception {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
        try {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(5);
                BrandListingPage.hoverOnNittoBrand();
                testcase.assertEquals("Nitto tires", SeleniumUtils.getAttributes(ExcelProperty.getElementValue(BRAND_LISTING_PAGE, NITTO_BRAND_LOGO),"title"));
            testcase.pass("System Should navigate to Brand Detail Page and display Brand Logo and Details in Brand Details Page");
            break;
        } catch (Exception e) {
            testcase.retry("System Should not navigate to Brand Detail Page and display Brand Logo and Details in Brand Details Page", testcase, retry, e);
            e.printStackTrace();
        }
    }
        }

                
               
	// 5 : To verify that the user is able to navigate to Brand Listing page after
	// Selecting vehicle.
	@Test
	public void verifyBrandlistPageByAddVehi() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		  Retry retry = new Retry(2);
	        while (retry.retry())
	        {
		try 
		{
		    tyreURL();
            SeleniumUtils.wait(15);
            testcase.assertTrue(HomePage.isShopByVehicleDefault(),
                    "System should display Shop by vehicle tab as default.",
                    "System is not displaying Shop by vehicle tab as default.");
           
            SeleniumUtils.wait(5);   
            HomePage.clickMakeSelectAccordant();
            SeleniumUtils.wait(5);
            HomePage.clickMakeSelect();
            SeleniumUtils.wait(5);
            HomePage.clickYearSelect();
            SeleniumUtils.wait(5);
            HomePage.clickModelSelect();
            SeleniumUtils.wait(5);
            HomePage.clickSubModelSelect();
            SeleniumUtils.wait(5);
            HomePage.clickOnShopButton();
            SeleniumUtils.wait(10);
            ConfirmTireSizePage.clicTireSizeLink();
            SeleniumUtils.wait(1);
            tyreURL();
            SeleniumUtils.wait(10);
            HomePage.hoverOnTires();
            SeleniumUtils.wait(2);
			HomePage.clickOnshopByBrand();
			SeleniumUtils.wait(5);
			 testcase.assertTrue(BrandListingPage.isCompatible(),
                     "System Should display No vehicle selected in Brand Listing page",
                     "System is not displaying No vehicle selected in Brand Listing page");
		     testcase.assertTrue(BrandListingPage.isnotCompatible(),
                     "System Should display No vehicle selected in Brand Listing page",
                     "System is not displaying No vehicle selected in Brand Listing page");
			testcase.pass("System Should Navigate to brand listing Page after selecting vehicle");
		    break;
		  } catch (Exception e) {
		      testcase.retry("System is not Navigating to brand listing Page after selecting vehicle", testcase, retry, e);
	            e.printStackTrace();
		}
	}
	       
	}
	   // 7 : To verify the display of brands that have tires which are compatible with the Selected vehicle.
    @Test
    public void verifyBrandCompatible() throws Exception {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
          Retry retry = new Retry(2);
            while (retry.retry())
            {
        try 
        {
            tyreURL();
            SeleniumUtils.wait(15);
            testcase.assertTrue(HomePage.isShopByVehicleDefault(),
                    "System should display Shop by vehicle tab as default.",
                    "System is not displaying Shop by vehicle tab as default.");
           
            SeleniumUtils.wait(5);   
            HomePage.clickMakeSelectAccordant();
            SeleniumUtils.wait(5);
            HomePage.clickMakeSelect();
            SeleniumUtils.wait(5);
            HomePage.clickYearSelect();
            SeleniumUtils.wait(5);
            HomePage.clickModelSelect();
            SeleniumUtils.wait(5);
            HomePage.clickSubModelSelect();
            SeleniumUtils.wait(5);
            HomePage.clickOnShopButton();
            SeleniumUtils.wait(10);
            ConfirmTireSizePage.clicTireSizeLink();
            SeleniumUtils.wait(1);
            tyreURL();
            SeleniumUtils.wait(10);
            HomePage.hoverOnTires();
            SeleniumUtils.wait(2);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
             testcase.assertTrue(BrandListingPage.isCompatible(),
                     "System Should display No vehicle selected in Brand Listing page",
                     "System is not displaying No vehicle selected in Brand Listing page");
            testcase.pass("System Should display Compatible list of brands in Brand Listing Page");
            break;
          } catch (Exception e) {
              testcase.retry("System is not display Compatible list of brands in Brand Listing Page", testcase, retry, e);
              e.printStackTrace();
        }
    }
           
    }
    // 13 : To verify that the user is able to navigate to Brand details page after Click  ing on any incompatible brand logo for a selected vehicle in brand listing page.
    @Test
    public void verifyBrandInCompatible() throws Exception {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
          Retry retry = new Retry(2);
            while (retry.retry())
            {
        try 
        {
            tyreURL();
            SeleniumUtils.wait(15);
            testcase.assertTrue(HomePage.isShopByVehicleDefault(),
                    "System should display Shop by vehicle tab as default.",
                    "System is not displaying Shop by vehicle tab as default.");
           
            SeleniumUtils.wait(5);   
            HomePage.clickMakeSelectAccordant();
            SeleniumUtils.wait(5);
            HomePage.clickMakeSelect();
            SeleniumUtils.wait(5);
            HomePage.clickYearSelect();
            SeleniumUtils.wait(5);
            HomePage.clickModelSelect();
            SeleniumUtils.wait(5);
            HomePage.clickSubModelSelect();
            SeleniumUtils.wait(5);
            HomePage.clickOnShopButton();
            SeleniumUtils.wait(10);
            ConfirmTireSizePage.clicTireSizeLink();
            SeleniumUtils.wait(1);
            tyreURL();
            SeleniumUtils.wait(10);
            HomePage.hoverOnTires();
            SeleniumUtils.wait(2);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            BrandListingPage.clickOnHankookBrand();
            testcase.assertTrue(BrandListingPage.displayHankookLogo(),
                    "System Should display hankook logo in brand details page",
                    "System is not displaying hankook logo in brand details page");
            testcase.pass("System Should navigate to any incompatible brand details Page");
            break;
          } catch (Exception e) {
              testcase.retry("System is not navigating to any incompatible brand details Page", testcase, retry, e);
              e.printStackTrace();
        }
    }
           
    }

	//Test case:14
	        // To verify that the brand logo is associated with alt text in brand listing page after selecting vehicle.
	        @Test
	        public void verifyBrandLogoTextwithVehicle() throws Exception {
	            String name = new Object() {
	            }.getClass().getEnclosingMethod().getName();
	            TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	            Retry retry = new Retry(2);
	            while (retry.retry())
	            {
	            try {
	                    tyreURL();
	                    SeleniumUtils.wait(15);
	                    testcase.assertTrue(HomePage.isShopByVehicleDefault(),
	                            "System should display Shop by vehicle tab as default.",
	                            "System is not displaying Shop by vehicle tab as default.");
	                   
	                    SeleniumUtils.wait(5);   
	                    HomePage.clickMakeSelectAccordant();
	                    SeleniumUtils.wait(5);
	                    HomePage.clickMakeSelect();
	                    SeleniumUtils.wait(5);
	                    HomePage.clickYearSelect();
	                    SeleniumUtils.wait(5);
	                    HomePage.clickModelSelect();
	                    SeleniumUtils.wait(5);
	                    HomePage.clickSubModelSelect();
	                    SeleniumUtils.wait(5);
	                    HomePage.clickOnShopButton();
	                    SeleniumUtils.wait(10); 
	                    ConfirmTireSizePage.clicTireSizeLink();
	                    SeleniumUtils.wait(1);
	                    tyreURL();
	                    SeleniumUtils.wait(10);
	                    HomePage.hoverOnTires();
	                    SeleniumUtils.wait(2);
	                    HomePage.clickOnshopByBrand();
	                    SeleniumUtils.wait(5);
	                    BrandListingPage.hoverOnHankookBrand();
	                    testcase.assertEquals("Hankook tires", SeleniumUtils.getAttributes(ExcelProperty.getElementValue(BRAND_LISTING_PAGE, HOVER_ON_HANKOOK_BRAND),"title"));
	                testcase.pass("System Should navigate to Brand Detail Page and display Brand Logo and Details in Brand Details Page");
	                break;
	            } catch (Exception e) {
	                testcase.retry("System Should not navigate to Brand Detail Page and display Brand Logo and Details in Brand Details Page", testcase, retry, e);
	                e.printStackTrace();
	            }
	        }
	            }


	        // 15 : To verify that the user is able to navigate to Brand Listing page after
	        // Selecting vehicle.
	        @Test
	        public void verifyBrandsBySelectVehicle() throws Exception {
	            String name = new Object() {
	            }.getClass().getEnclosingMethod().getName();
	            TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	              Retry retry = new Retry(2);
	                while (retry.retry())
	                {
	            try 
	            {
	                tyreURL();
	                SeleniumUtils.wait(15);
	                testcase.assertTrue(HomePage.isShopByVehicleDefault(),
	                        "System should display Shop by vehicle tab as default.",
	                        "System is not displaying Shop by vehicle tab as default.");
	               
	                SeleniumUtils.wait(5);   
	                HomePage.clickMakeSelectAccordant();
	                SeleniumUtils.wait(5);
	                HomePage.clickMakeSelect();
                    SeleniumUtils.wait(5);
                    HomePage.clickYearSelect();
                    SeleniumUtils.wait(5);
                    HomePage.clickModelSelect();
                    SeleniumUtils.wait(5);
                    HomePage.clickSubModelSelect();
                    SeleniumUtils.wait(5);
	                HomePage.clickOnShopButton();
	                SeleniumUtils.wait(10);
	                HomePage.hoverOnTires();
	                SeleniumUtils.wait(2);
	                HomePage.clickOnshopByBrand();
	                SeleniumUtils.wait(5);
	                testcase.assertTrue(BrandListingPage.isShopTireByBrandText(), "System is display 'shop tire by brand' text in  Brand Listing  Page",
	                        "System is not display 'shop tire by brand' text in  Brand Listing  Page");
	                testcase.assertTrue(BrandListingPage.isDisplayListofBrandLogos(), "System is display List of Brand logos in  Brand Listing  Page",
	                        "System is not display List of Brand logos in  Brand Listing  Page");
	                testcase.pass("System Should navigate to brand listing Page with no tire size");
	                break;
	              } catch (Exception e) {
	                  testcase.retry("System is not navigating to brand listing Page with no tire size", testcase, retry, e);
	                  e.printStackTrace();
	            }
	        }
	               
	        }
            
    // 15 : To verify that the user is able to navigate to Brand Listing page after
    // Selecting vehicle.
    @Test
    public void verifyBrandlistPageWithNoCompatibleTires() throws Exception {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
          Retry retry = new Retry(2);
            while (retry.retry())
            {
        try 
        {
            tyreURL();
            SeleniumUtils.wait(15);
            testcase.assertTrue(HomePage.isShopByVehicleDefault(),
                    "System should display Shop by vehicle tab as default.",
                    "System is not displaying Shop by vehicle tab as default.");
           
            SeleniumUtils.wait(5);   
            HomePage.clickMakeSelectAccordant();
            SeleniumUtils.wait(5);
            HomePage.clickMakeSelect();
            SeleniumUtils.wait(5);
            HomePage.clickYearSelect();
            SeleniumUtils.wait(5);
            HomePage.clickModelSelect();
            SeleniumUtils.wait(5);
            HomePage.clickSubModelSelect();
            SeleniumUtils.wait(5);
            HomePage.clickOnShopButton();
            SeleniumUtils.wait(10);
            ConfirmTireSizePage.clicTireSizeLink();
            SeleniumUtils.wait(1);
            tyreURL();
            SeleniumUtils.wait(10);
            HomePage.hoverOnTires();
            SeleniumUtils.wait(2);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            testcase.assertTrue(BrandListingPage.isShopTireByBrandText(), "System is display 'shop tire by brand' text in  Brand Listing  Page",
                    "System is not display 'shop tire by brand' text in  Brand Listing  Page");
             testcase.assertTrue(BrandListingPage.isCompatible(),
                     "System Should display No vehicle selected in Brand Listing page",
                     "System is not displaying No vehicle selected in Brand Listing page");
          } catch (Exception e) {
              testcase.retry("System is not able to navigate to Brand Listing Page", testcase, retry, e);
              e.printStackTrace();
        }
    }
           
    }
// 17 : To verify that the user is able to navigate to Brand Listing page after
// Selecting vehicle.
@Test
public void verifyBrandlistPageBySelectVehi() throws Exception {
    String name = new Object() {
    }.getClass().getEnclosingMethod().getName();
    TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
      Retry retry = new Retry(2);
        while (retry.retry())
        {
    try 
    {
        tyreURL();
        SeleniumUtils.wait(15);
        testcase.assertTrue(HomePage.isShopByVehicleDefault(),
                "System should display Shop by vehicle tab as default.",
                "System is not displaying Shop by vehicle tab as default.");
       
        SeleniumUtils.wait(5);   
        HomePage.clickMakeSelectAccordant();
        SeleniumUtils.wait(5);
        HomePage.clickMakeSelect();
        SeleniumUtils.wait(5);
        HomePage.clickYearSelect();
        SeleniumUtils.wait(5);
        HomePage.clickModelSelect();
        SeleniumUtils.wait(5);
        HomePage.clickSubModelSelect();
        SeleniumUtils.wait(5);
        HomePage.clickOnShopButton();
        SeleniumUtils.wait(10);
        ConfirmTireSizePage.clicTireSizeLink();
        SeleniumUtils.wait(1);
        tyreURL();
        SeleniumUtils.wait(10);
        HomePage.hoverOnTires();
        SeleniumUtils.wait(2);
        HomePage.clickOnshopByBrand();
        SeleniumUtils.wait(5);
        testcase.assertTrue(BrandListingPage.isShopTireByBrandText(), "System is display 'shop tire by brand' text in  Brand Listing  Page",
                "System is not display 'shop tire by brand' text in  Brand Listing  Page");
        testcase.assertTrue(BrandListingPage.displayCompatibleText(), "System is display 'shop tire by brand' text in  Brand Listing  Page",
                "System is not display 'shop tire by brand' text in  Brand Listing  Page");    
        
         testcase.assertTrue(BrandListingPage.isCompatible(),
                 "System Should display No vehicle selected in Brand Listing page",
                 "System is not displaying No vehicle selected in Brand Listing page");
         testcase.assertTrue(BrandListingPage.isnotCompatible(),
                 "System Should display No vehicle selected in Brand Listing page",
                 "System is not displaying No vehicle selected in Brand Listing page");
        testcase.pass("System Should verify brand listing Page after selecting vehicle");
        break;
      } catch (Exception e) {
          testcase.retry("System should not verify brand listing Page after selecting vehicle", testcase, retry, e);
          e.printStackTrace();
    }
}      
}
}