package com.ch.ta.desktopTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.BrandDetailsPage;
import com.ch.ta.desktopPages.HomePage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)

public class BrandDetailsTest extends AbstractTestCaseReport implements FileConstants
{

    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    // Test case:1
    // 35,36,37,39,40
    // To verify the display of selected brand logo in the top left side in
    // Brand Details page.
    // To verify the display of YMME section for selected brand in Brand Details
    // page.
    // To verify the display of number of tires available for selected brand in
    // Brand Details page.
    // To verify the display of 'About <Brand Name>' title with details in Brand
    // Details page.
    // To verify the display of static content 'Tires America Process Component
    // ' in Brand Details page.

    @Test
    public void verifyBrandDetailPage() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(2);
                testcase.assertTrue(BrandDetailsPage.isShopTireByBrandText(),
                        "System is display 'shop tire by brand' text in  Brand Listing  Page",
                        "System is not display 'shop tire by brand' text in  Brand Listing  Page");
                BrandDetailsPage.clickOnBrandName();
                testcase.assertTrue(BrandDetailsPage.isDisplayBrandLogo(),
                        "System should navigate to brand detail page and display brand logo",
                        "System should navigate to brand detail page and display brand logo");
                testcase.assertFalse(BrandDetailsPage.isEnableBrandLogo(), "System should disable the brand logo",
                        "System is not displayed the brand logo");
                testcase.assertTrue(BrandDetailsPage.isDisplayYMMESection(),
                        "System should displayed YMME section details", "System is not displayed YMME section details");
                testcase.assertTrue(BrandDetailsPage.isDisplayTiresAvailableDetails(),
                        "System should displayed tires available", "System is not displayed tires available");
                testcase.assertTrue(BrandDetailsPage.isDisplayAboutBrand(), "System should displayed about brand",
                        "System is not displayed about brand");
                testcase.assertTrue(BrandDetailsPage.isDisplayTAProcessComponents(),
                        "System should displayed TA process components",
                        "System is not displayed TA process components");

                testcase.pass("System Should navigate to Brand  Details Page");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not able to navigate to Brand  Details Page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 41-46 is not dev
    // Test case:2
    // 38,51-56
    // To verify the display & functionality of 'View <Brand Name> Lines' button
    // in Brand Details page.
    @Test
    public void verifyViewBrandLinesButton() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnBrandName();
                testcase.assertTrue(BrandDetailsPage.isDisplayViewBrandLineBtn(),
                        "System should displayed view brandline button",
                        "System is not displayed view brandline button");
                BrandDetailsPage.cilckOnViewBrandLineBtn();
                SeleniumUtils.wait(5);
                testcase.assertTrue(BrandDetailsPage.isDisplayBrandLineDetails(),
                        "System should displayed brand details", "System is not displayed brand details");
                BrandDetailsPage.clickOnBrandLineImage(); // assert
                DriverFactory.getDriver().navigate().back();
                BrandDetailsPage.clickOnBrandLineName(); // assert
                DriverFactory.getDriver().navigate().back();
                BrandDetailsPage.clickOnReviews(); // assert
                testcase.pass("System Should displayed brand line section in Brand  Details Page");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displayed brand line section in Brand  Details Page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Testcase:3

    // 57.To verify the Tires search results on adding a vehicle in YMME section
    // for selected brand in Brand Details page.
    @Test
    public void verifyYMMESection() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnBrandName();
                testcase.assertTrue(BrandDetailsPage.isDisplayYMMESection(),
                        "System should displayed YMME section details", "System is not displayed YMME section details");
                BrandDetailsPage.clickOnMake();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnYear();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnModel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnSubmodel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnShopBtn();
                SeleniumUtils.wait(2);
                testcase.assertTrue(BrandDetailsPage.isDisplayConformTireSize(), "Conform tire size page",
                        "Conform tire size page");
                // testcase.assertEquals(actualmake, expectedmake);
                // compare actual and expected
                BrandDetailsPage.clickOnSelectedTiresize();
                // assert navigate only Tires size present in 'Confirm Tires
                // Size' page.
                testcase.pass("System Should verify and functionality of YMME section in Brand  Details Page");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not verify and functionality of YMME section in Brand  Details Page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Testcase:4
    // 58. To verify the Tires search results on adding a vehicle with staggered
    // fitment in YMME section for selected brand in Brand Details page.
    @Test
    public void verifyConformTiresizeFrontAndRareTires() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                BrandDetailsPage.clickOnBrandName();
                testcase.assertTrue(BrandDetailsPage.isDisplayYMMESection(),
                        "System should displayed YMME section details", "System is not displayed YMME section details");
                BrandDetailsPage.clickOnBMWMake();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnYear1();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnBMWModel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnBMWSubmodel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnShopBtn();
                SeleniumUtils.wait(2);
                testcase.assertTrue(BrandDetailsPage.isDisplayConformTireSize(), "Conform tire size page",
                        "Conform tire size page");
                testcase.assertTrue(BrandDetailsPage.isFrontTyre(), "Syetem should displayed front tyre",
                        "Syetem is not displayed front tyre");
                testcase.assertTrue(BrandDetailsPage.isRearTyre(), "Syetem should displayed rear tyre",
                        "Syetem is not displayed rear tyre");
                BrandDetailsPage.clickOnFrontTyre();
                // assert
                BrandDetailsPage.clickOnRearTyre();
                // assert
                testcase.pass(
                        "System Should displayed and funtionality of  front and rare tyre in conform tiresize details");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System is not displayed and funtionality of  front and rare tyre in conform tiresize details",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
    // Test case:5
    // 59
    // To verify the Tires search results on adding a vehicle with custom size
    // in YMME section for selected brand in Brand Details page.

    @Test
    public void verifyConformTiresizeDimentions() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                BrandDetailsPage.clickOnBrandName();
                testcase.assertTrue(BrandDetailsPage.isDisplayYMMESection(),
                        "System should displayed YMME section details", "System is not displayed YMME section details");
                BrandDetailsPage.clickOnMake();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnYear();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnModel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnSubmodel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnShopBtn();
                SeleniumUtils.wait(2);
                testcase.assertTrue(BrandDetailsPage.isDisplayConformTireSize(), "Conform tire size page",
                        "Conform tire size page");
                BrandDetailsPage.clickOnTireSizeIsntListed();
                BrandDetailsPage.isWidth();
                BrandDetailsPage.isRatio();
                BrandDetailsPage.isDiameter();
                BrandDetailsPage.clickOnCustomTireSizeResult();
                // assert
                testcase.pass("System Should displayed custom tyresize in conform tiresize details");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displayed custom tyresize in conform tiresize details", testcase, retry,
                        e);
                e.printStackTrace();
            }
        }
    }
    // Testcase:6
    // 60.To verify the Tires search results on adding a vehicle with 'License
    // plate number' in Brand Details page.

    @Test
    public void verifyLicensePlateNo() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                BrandDetailsPage.clickOnBrandName();
                BrandDetailsPage.clickOnLicensePlateNo();
                testcase.assertTrue(BrandDetailsPage.isDisplayStateAndLicenseFields(),
                        "System should displayed state and license fields",
                        "System is not displayed state and license fields");
                BrandDetailsPage.enterValidState();
                BrandDetailsPage.enterValidLicensePlateNo("1234");
                BrandDetailsPage.clickOnLicensePlateShopBtn();
                // assert
                testcase.pass("System Should displayed and functionality of license plate field");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displayed and functionality of license plate field", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    // Test case:7
    // 61.To verify the user is able to add the vehicle by size in brand detail
    // page.

    @Test
    public void verifyAddVehicleBySize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.clickOnshopTyresBySize();
                HomePage.clickOnWidth();
                HomePage.clickOnRatio();
                HomePage.clickOnDiameter();
                HomePage.clickOnShopBtn();
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                BrandDetailsPage.clickOnBrandName();
                BrandDetailsPage.clickOnShopTyreBySize();
                // testcase.assertTrue(BrandDetailsPage.isDisplayPreFilledData(),
                // "System should displayed pre filled tyres data", "System is
                // not displayed pre filled tyres data");
                BrandDetailsPage.clickOnShopBtn();
                // assert
                testcase.pass("System Should displayed and functionality of add vehicle by size ");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displayed and functionality of add vehicle by size", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Vehicle add garage
    // Testcase:8
    // 62-65,68,69.To verify the display of selected brand logotype in the top
    // left side
    // with vehicle selected in Brand Details page.
    @Test
    public void verifyAddVehBrand() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.clickMakeSelectAccordant();
                HomePage.clickMakeSelect();
                HomePage.clickYearSelect();
                HomePage.clickModelSelect();
                HomePage.clickSubModelSelect();
                HomePage.clickOnShopButton();
                BrandDetailsPage.clicTireSizeLink();
                SeleniumUtils.wait(1);
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(5);
                /*
                 * BrandDetailsPage.clickOnBrandName();
                 * testcase.assertTrue(BrandDetailsPage.isDisplayBrandLogo(),
                 * "System should navigate to brand detail page and display brand logo"
                 * ,
                 * "System should navigate to brand detail page and display brand logo"
                 * );
                 * testcase.assertTrue(BrandDetailsPage.isDisplayYMMESection(),
                 * "System should displayed YMME section details",
                 * "System is not displayed YMME section details");
                 * testcase.assertTrue(BrandDetailsPage.
                 * isDisplayTiresAvailableDetails(),
                 * "System should displayed tires available",
                 * "System is not displayed tires available");
                 * testcase.assertTrue(BrandDetailsPage.isDisplayAboutBrand(),
                 * "System should displayed about brand",
                 * "System is not displayed about brand");
                 * testcase.assertTrue(BrandDetailsPage.
                 * isDisplayTAProcessComponents(),
                 * "System should displayed TA process components",
                 * "System is not displayed TA process components");
                 */

                testcase.pass("System Should navigate to Brand  Details Page");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not able to navigate to Brand  Details Page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Testcase:9
    // 66.To verify the display of warning message when there are no tires of
    // selected brand compatible with selected vehicle in Brand Details page.
    @Test
    public void verifyAddVehCompatable() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.clickMakeSelectAccordant();
                HomePage.clickMakeSelect();
                HomePage.clickYearSelect();
                HomePage.clickModelSelect();
                HomePage.clickSubModelSelect();
                HomePage.clickOnShopButton();
                BrandDetailsPage.clicTireSizeLink();
                SeleniumUtils.wait(1);
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(5);
                // BrandDetailsPage.clickOnBrandName();
                testcase.assertTrue(BrandDetailsPage.isDisplayWarningMsg(),
                        "System should navigate to brand detail page and display warning message",
                        "System should navigate to brand detail page and display warning message");

                testcase.pass("System should navigate to brand detail page and display warning message");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not navigate to brand detail page and display warning message", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // Testcase:10
    // 67
    @Test
    public void verifyAddVehBrandLineSection() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.clickMakeSelectAccordant();
                HomePage.clickMakeSelect();
                HomePage.clickYearSelect();
                HomePage.clickModelSelect();
                HomePage.clickSubModelSelect();
                HomePage.clickOnShopButton();
                BrandDetailsPage.clicTireSizeLink();
                SeleniumUtils.wait(1);
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(5);
                /*
                 * BrandDetailsPage.clickOnBrandName();
                 * testcase.assertTrue(BrandDetailsPage.
                 * isDisplayTiresAvailableDetails(),
                 * "System should displayed view brandline button",
                 * "System is not displayed view brandline button");
                 */
                testcase.pass("System Should displayed brand line section in Brand  Details Page");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displayed brand line section in Brand  Details Page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 71-79 need data

    // 80,82-87
    // To verify the display of '<Brand Name> Tires Lines' title for selected
    // vehicle in Brand Details page.
    @Test
    public void verifyAddVehBrandLineDetails() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.clickMakeSelectAccordant();
                HomePage.clickMakeSelect();
                HomePage.clickYearSelect();
                HomePage.clickModelSelect();
                HomePage.clickSubModelSelect();
                HomePage.clickOnShopButton();
                BrandDetailsPage.clicTireSizeLink();
                SeleniumUtils.wait(1);
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(5);
                BrandDetailsPage.clickOnBrandName();
                BrandDetailsPage.cilckOnViewBrandLineBtn();
                SeleniumUtils.wait(5);
                testcase.assertTrue(BrandDetailsPage.isDisplayBrandLineDetails(),
                        "System should displayed brand details", "System is not displayed brand details");
                /*
                 * BrandDetailsPage.clickOnBrandLineImage(); // assert
                 * BrandDetailsPage.clickOnBrandLineName(); // assert
                 * BrandDetailsPage.clickOnReviews(); // assert
                 */
                testcase.pass("System Should displayed brand line section in Brand  Details Page");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displayed brand line section in Brand  Details Page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Testcase:
    // 88.To verify the Tires search results on adding a vehicle in YMME section
    // for selected vehicle in Brand Details page.
    @Test
    public void verifyAddVehYMMEFn() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.clickMakeSelectAccordant();
                HomePage.clickMakeSelect();
                HomePage.clickYearSelect();
                HomePage.clickModelSelect();
                HomePage.clickSubModelSelect();
                HomePage.clickOnShopButton();
                BrandDetailsPage.clicTireSizeLink();
                SeleniumUtils.wait(1);
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                SeleniumUtils.wait(5);
                BrandDetailsPage.clickOnBrandName();
                testcase.assertTrue(BrandDetailsPage.isDisplayYMMESection(),
                        "System should displayed YMME section details", "System is not displayed YMME section details");
                BrandDetailsPage.clickOnMake();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnYear();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnModel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnSubmodel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnShopBtn();
                SeleniumUtils.wait(2);
                testcase.assertTrue(BrandDetailsPage.isDisplayConformTireSize(), "Conform tire size page",
                        "Conform tire size page");
                BrandDetailsPage.clickOnSelectedTiresize();
                // assert
                testcase.pass("System Should verify and functionality of YMME section in Brand  Details Page");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not verify and functionality of YMME section in Brand  Details Page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 89.To verify the Tires search results on adding a vehicle with staggered
    // fitment in YMME section for selected vehicle in Brand Details page.
    @Test
    public void verifyAddVehInSelectVeh() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.clickMakeSelectAccordant();
                HomePage.clickMakeSelect();
                HomePage.clickYearSelect();
                HomePage.clickModelSelect();
                HomePage.clickSubModelSelect();
                HomePage.clickOnShopButton();
                BrandDetailsPage.clicTireSizeLink();
                SeleniumUtils.wait(1);
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                BrandDetailsPage.clickOnBrandName();
                testcase.assertTrue(BrandDetailsPage.isDisplayYMMESection(),
                        "System should displayed YMME section details", "System is not displayed YMME section details");
                BrandDetailsPage.clickOnMake();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnYear();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnModel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnSubmodel();
                SeleniumUtils.wait(2);
                BrandDetailsPage.clickOnShopBtn();
                SeleniumUtils.wait(2);
                testcase.assertTrue(BrandDetailsPage.isDisplayConformTireSize(), "Conform tire size page",
                        "Conform tire size page");
                testcase.assertTrue(BrandDetailsPage.isConformTiresize(), "Conform tiresize", "Conform tiresize");
                // assert
                testcase.pass("System Should displayed  front and rare tyre in conform tiresize details");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displayed front and rare tyre in conform tiresize details", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // testcase
    // 90.To verify the Tires search results on adding a vehicle with custom
    // size in YMME section for selected vehicle in Brand Details page.
    @Test
    public void verifyAddVehTireSearchResult() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                HomePage.clickMakeSelectAccordant();
                HomePage.clickMakeSelect();
                HomePage.clickYearSelect();
                HomePage.clickModelSelect();
                HomePage.clickSubModelSelect();
                HomePage.clickOnShopButton();
                BrandDetailsPage.clicTireSizeLink();
                SeleniumUtils.wait(1);
                tyreURL();
                SeleniumUtils.wait(5);
                HomePage.hoverOnTires();
                SeleniumUtils.wait(2);
                HomePage.clickOnshopByBrand();
                /*
                 * BrandDetailsPage.clickOnBrandName();
                 * BrandDetailsPage.clickOnTireSizeIsntListed();
                 * BrandDetailsPage.isWidth(); BrandDetailsPage.isRatio();
                 * BrandDetailsPage.isDiameter();
                 * BrandDetailsPage.clickOnCustomTireSizeResult();
                 */
                // assert
                testcase.pass("System Should displayed conform tiresize details");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displayed conform tiresize details", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

}
