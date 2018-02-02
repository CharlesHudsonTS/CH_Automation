package com.ch.ta.desktopTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.BrandListingAndBrandDetailsPage;
import com.ch.ta.desktopPages.HomePage;
import com.ch.ta.desktopPages.ProductDetailPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class BrandListingAndBrandDetailsTest extends AbstractTestCaseReport implements FileConstants
{

    @BeforeMethod
    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    // 1 : To verify that the user is able to navigate to Brand Listing page.
    @Test
    public void verifyBrandListingPage() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(3);
            // Update assertion
            testcase.assertTrue(ProductDetailPage.isCarBar(), "System Should navigate to Brand Line Details Page",
                    "System Should navigate to Brand Line Details Page");

            testcase.pass("System Should navigate to Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not able to navigate to Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 2 : To verify the display of list of brands in Brand Listing page.
    @Test
    public void verifyAllBrands() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
//            testcase.assertTrue(flag, expected, actual);

            testcase.pass("System Should display selected Brand Title in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error(" System is not displayed selected Brand Title in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 3 : To verify that the user is able to navigate to Brand Listing page
    // without
    // adding/Selecting vehicle.
    @Test
    public void verifyBrandsWithoutAddVehicle() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            // Update assertion
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isReviewsAndRatings(),
                    "System Should display Reviews And Ratings in Brand Line Details Page",
                    "System is not displaying Reviews And Ratings in Brand Line Details Page");

            testcase.pass("System Should display Reviews And Ratings in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying Reviews And Ratings in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 4 : To verify the display of 'No Vehicle Selected' label in Brand Listin
    // page without adding/Selecting vehicle.
    @Test
    public void verifyNoVehicleSelected() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isNoVehicleSelected(),
                    "System Should display Brand Tire Size in Brand Line Details Page",
                    "System is not displaying Brand Tire Size in Brand Line Details Page");

            testcase.pass("System Should display Brand Tire Size in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying Brand Tire Size in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 5 : To verify that the user is able to navigate to brand details page
    // after
    // clicking on any brand in brand listing page.
    @Test
    public void verifyBrandDetailsPageByBrand() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            BrandListingAndBrandDetailsPage.clickOnAnyBrand();
            SeleniumUtils.wait(3);
            // update assertion
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isYMME(),
                    "System Should display YMME in Brand Line Details Page",
                    "System is not displaying YMME in Brand Line Details Page");

            testcase.pass("System Should display YMME in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying YMME in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 6 : To verify that the user is able to navigate to Brand Listing page
    // after
    // Selecting vehicle.
    @Test
    public void verifyBrandsBySelectVehicle() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            // update Assertion
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isWarrantyTab(),
                    "System Should display Warranty Tab in Brand Line Details Page",
                    "System is not displaying Warranty Tab in Brand Line Details Page");

            testcase.pass("System Should display Warranty Tab in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying Warranty Tab in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 7 : To verify that the user is able to navigate to Brand details page
    // after
    // clicking on any brand for a selected vehicle in brand listing page.
    @Test
    public void verifyBrandDetailsPageByAddVehi() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(3);
            // update assertion
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isBrandName(),
                    "System Should display Shop This Line By Size in Brand Line Details Page",
                    "System is not displaying Shop This Line By Size in Brand Line Details Page");

            testcase.pass("System Should display Shop This Line By Size in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying Shop This Line By Size in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 8 : To verify the display of brands that have tires which are compatible
    // with
    // the Selected vehicle.
    @Test
    public void verifyBrandsWithCompatable() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            // Update assertion
            testcase.assertTrue(ProductDetailPage.isCarBar(), "System Should navigate to Brand Line Details Page",
                    "System Should navigate to Brand Line Details Page");

            testcase.pass("System Should navigate to Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not able to navigate to Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 9 : To verify the display of brands that do not have tires which are
    // compatible with the Selected vehicle.
    @Test
    public void verifyBrandsWithoutCompatable() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            // update assretion
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isYMMEStaticText(),
                    "System Should display Static Text in YMME secetion in Brand Line Details Page",
                    "System is not displaying Static Text in YMME secetion in Brand Line Details Page");

            testcase.pass("System Should display Static Text in YMME secetion in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying Static Text in YMME secetion in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 17 : To verify that the user is able to navigate to Brand Details page.
    @Test
    public void verifyBrandDetailsPage() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            BrandListingAndBrandDetailsPage.clickOnAnyBrand();
            SeleniumUtils.wait(3);
            // Update assertion
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isLicensePlateNumberLink(),
                    "System Should display License Plate Number in YMME secetion in Brand Line Details Page",
                    "System is not displaying  License Plate Number in YMME secetion in Brand Line Details Page");
            SeleniumUtils.wait(3);
            BrandListingAndBrandDetailsPage.clickOnLicensePlateNumberLink();

            // Update assertion
            testcase.pass("System Should display Static Text in YMME secetion in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying Static Text in YMME secetion in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 18 : To verify the display of selected brand name in the top left side in
    // Brand Details page.
    @Test
    public void verifySelectedBrandName() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            BrandListingAndBrandDetailsPage.clickOnAnyBrand();
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isBrandName(),
                    "System Should display View secetion in Brand Line Details Page",
                    "System is not displaying View secetion in Brand Line Details Page");

            testcase.pass("System Should display View secetion in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying View secetion in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 19 : To verify the display of YMME section for selected brand in Brand
    // Details page.

    @Test
    public void verifyYMME() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            BrandListingAndBrandDetailsPage.clickOnAnyBrand();
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isYMME(),
                    "System Should display View secetion in Brand Line Details Page",
                    "System is not displaying View secetion in Brand Line Details Page");

            testcase.pass("System Should display View secetion in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying View secetion in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }

    // 20 : To verify the display of shop Brand By Vehicle text in Brand Details
    // page.
    @Test
    public void verifyShopBrandByVehicleText() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByBrand();
            SeleniumUtils.wait(5);
            BrandListingAndBrandDetailsPage.clickOnAnyBrand();
            SeleniumUtils.wait(3);
            testcase.assertTrue(BrandListingAndBrandDetailsPage.isShopBrandByVehicle(),
                    "System Should display View secetion in Brand Line Details Page",
                    "System is not displaying View secetion in Brand Line Details Page");

            testcase.pass("System Should display View secetion in Brand Line Details Page");
        } catch (Exception e)
        {
            testcase.error("System is not displaying View secetion in Brand Line Details Page", e);
            e.printStackTrace();
        }
    }
}
