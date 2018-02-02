package com.ch.ta.desktopTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.YMMEPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class YMMETest extends AbstractTestCaseReport implements FileConstants
{
    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    // Test Case : 029 modify
    @Test
    public void shopByVehicleTabYMMEComp() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                testcase.assertTrue(YMMEPage.isMakeTextBoxDefault(),
                        "System should display Shop by Make text box as default.",
                        "System should not display Make text box as default.");
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;

            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 030 modify
    @Test
    public void shopByTireTabYMMECompTabs() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");

                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                // YMMEPage.isYearSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                // YMMEPage.isModelSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                // YMMEPage.isSubModeSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;

            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 031 modify
    @Test
    public void shopButton() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");

                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                // YMMEPage.isYearSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                // YMMEPage.isModelSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                // YMMEPage.isSubModeSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isconfirmyourtiresize(),
                        "System should display Shop by confirmyourtiresize tab as default.",
                        "System is not displaying Shop by confirmyourtiresize tab as default.");
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;

            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // test case 032
    @Test
    public void shopButtonminreqinfo() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");

                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                // YMMEPage.isYearSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                // YMMEPage.isModelSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                testcase.assertTrue(YMMEPage.isEnterYourvehicleSubmodel(),
                        "System should display Shop by EnterYourvehicleSubmodel message as default.",
                        "System is not displaying Shop by EnterYourvehicleSubmodel message as default.");

                testcase.pass("System should display Shop by vehicle tab as default.");
                break;

            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 033 modify
    @Test
    public void licensePlateDispInShopByVehi() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);

                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(5);
                YMMEPage.ClickLicensePlateNumber();
                SeleniumUtils.wait(5);

                testcase.assertTrue(YMMEPage.isStateTextBoxDisplayed(), "System Should display State Text box.",
                        "System is not displayed State Text box.");
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 034 modify
    @Test
    public void licensePlateWithValidData() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(5);
                YMMEPage.ClickLicensePlateNumber();
                SeleniumUtils.wait(5);
                // testcase.assertTrue(YMMEPage.isStateTextBoxDisplayed(),
                // "System Should display State Text box.",
                // "System is not displayed State Text box.");
                // SeleniumUtils.wait(5);

                // testcase.assertTrue(YMMEPage.isShopButtonLicensePlate(),
                // "System Should display Shop Button For License Plate.",
                // "System is not displayed Shop Button For license Plate.");
                // SeleniumUtils.wait(10);
                YMMEPage.ClickStateAccordant();
                SeleniumUtils.wait(10);
                YMMEPage.ClickStateSelection();
                SeleniumUtils.wait(10);
                YMMEPage.ClickLicensePlateValue();
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopButtonLicense();

                testcase.pass("System should display Shop by vehicle tab as default.");
                break;

            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        } // need to update shop button
    }

    // Test Case : 036 modify
    @Test
    public void BackToYYMEModel() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(10);
                YMMEPage.ClickLicensePlateNumber();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isStateTextBoxDisplayed(), "System Should display State Text box.",
                        "System is not displayed State Text box.");
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopButtonLicensePlate(),
                        "System Should display Shop Button For License Plate.",
                        "System is not displayed Shop Button For license Plate.");
                SeleniumUtils.wait(10);
                YMMEPage.clickOnYYMEBackButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 037 modify
    @Test
    public void licensePlateIvalid() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(10);
                YMMEPage.ClickLicensePlateNumber();
                SeleniumUtils.wait(10);
                /*
                 * testcase.assertTrue(YMMEPage.isStateTextBoxDisplayed(),
                 * "System Should display State Text box.",
                 * "System is not displayed State Text box.");
                 * SeleniumUtils.wait(10);
                 * testcase.assertTrue(YMMEPage.isShopButtonLicensePlate(),
                 * "System Should display Shop Button For License Plate.",
                 * "System is not displayed Shop Button For license Plate.");
                 */ SeleniumUtils.wait(10);
                YMMEPage.ClickStateAccordant();
                SeleniumUtils.wait(10);
                YMMEPage.ClickStateSelection();
                SeleniumUtils.wait(10);
                YMMEPage.ClickLicensePlateValue();
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopButtonLicense();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isLicensePlateMsg(), "System should display ERROR MSG.",
                        "System is not display ERROR MSG.");

                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // test case 039
    @Test
    public void shopTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopByTireSize();
                SeleniumUtils.wait(10);

                testcase.assertTrue(YMMEPage.isShopByTireSizeDisplay(),
                        "System should display Shop by Tire Size as default.",
                        "System is not displaying Shop by Tire Size as default.");

                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 040 modify
    @Test
    public void shopTireSizeValidData() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopByTireSize();
                SeleniumUtils.wait(5);
                YMMEPage.ClickWidthAccordant();
                SeleniumUtils.wait(10);
                YMMEPage.ClickWidthTab();
                SeleniumUtils.wait(10);
                // YMMEPage.isRatioAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickRatioTab();
                SeleniumUtils.wait(5);
                // YMMEPage.isDiamaeterAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickDiameterTab();
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 041 modify
    @Test
    public void shopTireSizeShopButton() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(18);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopByTireSize();
                SeleniumUtils.wait(10);
                YMMEPage.ClickWidthAccordant();
                SeleniumUtils.wait(10);
                YMMEPage.ClickWidthTab();
                SeleniumUtils.wait(10);
                // YMMEPage.isRatioAccordant();
                // SeleniumUtils.wait(10);
                YMMEPage.ClickRatioTab();
                SeleniumUtils.wait(10);
                // YMMEPage.isDiamaeterAccordant();
                // SeleniumUtils.wait(10);
                YMMEPage.ClickDiameterTab();
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopTyreBySizeShopButton();
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 042 modify
    public void shopTireSizeNovalidData() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopByTireSize();
                SeleniumUtils.wait(5);
                testcase.assertTrue(YMMEPage.isShopByTireSizeDisplay(),
                        "System should display Shop by Tire Size tab as default.",
                        "System is not displaying Shop by Tire size as default.");
                SeleniumUtils.wait(5);
                YMMEPage.ClickWidthAccordant();
                SeleniumUtils.wait(10);
                YMMEPage.ClickWidthTab();
                SeleniumUtils.wait(10);
                // YMMEPage.isRatioAccordant();
                // SeleniumUtils.wait(10);
                YMMEPage.ClickRatioTab();
                SeleniumUtils.wait(10);
                // YMMEPage.isDiamaeterAccordant();
                // SeleniumUtils.wait(10);
                // YMMEPage.isDiameterTab();
                // SeleniumUtils.wait(10);
                YMMEPage.ClickShopTyreBySizeShopButton();

                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 043 modify
    @Test
    public void AddDifferentRearTireSizebutton() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopByTireSize();
                SeleniumUtils.wait(5);
                testcase.assertTrue(YMMEPage.isShopByTireSizeDisplay(),
                        "System should display Shop by Tire Size tab as default.",
                        "System is not displaying Shop by Tire size as default.");
                SeleniumUtils.wait(5);
                YMMEPage.ClickAddDifferentRearTireSizebutton();
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test Case : 044 modify
    @Test
    public void addDifferentRearTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                SeleniumUtils.wait(10);
                YMMEPage.ClickShopByTireSize();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAddDifferentRearTireSizebutton();
                SeleniumUtils.wait(5);
                YMMEPage.ClickRearWidthAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickRearWidthTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickRearRatio();
                SeleniumUtils.wait(5);
                YMMEPage.ClickRearDiameter();
                SeleniumUtils.wait(5);
                YMMEPage.ClickRearRemove();
                testcase.pass("System should display Shop by vehicle tab as default.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Shop by vehicle tab as default.", testcase, retry, e);
                e.printStackTrace();
            }
        }

    }
}
