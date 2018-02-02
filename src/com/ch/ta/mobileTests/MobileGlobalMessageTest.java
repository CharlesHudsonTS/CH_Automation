package com.ch.ta.mobileTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.HomePage;
import com.ch.ta.mobilePages.MobileHomePage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class MobileGlobalMessageTest extends AbstractTestCaseReport implements FileConstants
{

    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }
    // 1
    // To verify the display of global message at the bottom of the header.

    @Test
    public void verifyPromotionalContent() throws Exception
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
                testcase.assertTrue(MobileHomePage.isPromotionalContent(), "Promotion Content Should display",
                        "Promotion Content Should display");
                testcase.pass(
                        "System should display the global message with promotional content at the bottom of the header.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the global message with promotional content at the bottom of the header.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 2
    // To verify the functionality of 'Learn More' link in global message at the
    // bottom of the header.
    @Test
    public void verifyFunctionalityLearnMore() throws Exception
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
                testcase.assertTrue(HomePage.isPromotionalContent(), "Promotion Content Should display",
                        "Promotion Content Should display");
                HomePage.clickOnLearnMore();
                // assertion need to Update
                testcase.fail("System should navigate to see more details",
                        "System should not navigating to see more details");
                testcase.pass(
                        "To verify the functionality of 'Learn More' link in global message at the bottom of the header.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the functionality of 'Learn More' link in global message at the bottom of the header.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 3
    // To verify the functionality of 'Close' button in global message at the
    // bottom of the header.
    @Test
    public void verifyCloseButtonFunctionality() throws Exception
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
                testcase.assertTrue(MobileHomePage.isPromotionalContent(), "Promotion Content Should display",
                        "Promotion Content Should display");
                MobileHomePage.clickOnClosePromoOffer();
                SeleniumUtils.wait(2);
                testcase.assertFalse(MobileHomePage.isPromotionalContent(),
                        "System should not display Promotional Content", "System should display Promotional Content");
                testcase.pass(
                        "To verify the functionality of 'Close' button in global message at the bottom of the header.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the functionality of 'Close' button in global message at the bottom of the header.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 4
    // To verify the display of system alert at the top of the header.
    @Test
    public void displayOfSystemAlert() throws Exception
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
                testcase.assertTrue(MobileHomePage.isSystemAlert(), "System should display System Alert",
                        "System is not displaying System Alert");
                testcase.pass("To verify the display of system alert at the top of the header.");
                break;
            } catch (Exception e)
            {
                testcase.retry("To verify the display of system alert at the top of the header.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 5
    // To verify the functionality of 'Close' button in system alert at the top
    // of the header.
    @Test
    public void verifySystemAlertCloseButton() throws Exception
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
                testcase.assertTrue(MobileHomePage.isSystemAlert(), "System should display System Alert",
                        "System is not displaying System Alert");
                MobileHomePage.clickOnSystemAlertClose();
                testcase.assertFalse(MobileHomePage.isSystemAlert(), "System should not display System alert",
                        "System is displaying System Alert after clicking on close button");
                testcase.pass(
                        "To verify the functionality of 'Close' button in system alert at the top of the header.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the functionality of 'Close' button in system alert at the top of the header.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 6
    // To verify the display of global message when the user scrolls down the
    // page.
    @Test
    public void displayofPromoMsg() throws Exception
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
                testcase.assertTrue(MobileHomePage.isPromotionalContent(), "System should display Promotional Content",
                        "System is not displaying Promotional Content");
                SeleniumUtils.javaScriptExecutorDown("250");
                SeleniumUtils.wait(3);
                testcase.assertFalse(MobileHomePage.isPromotionalContent(),
                        "System should not display Promotional Content after user scrolls down the page.",
                        "System is displaying Promtional Content after user scrolls down the page.");
                testcase.pass("To verify the display of global message when the user scrolls down the page.");
                break;
            } catch (Exception e)
            {
                testcase.retry("To verify the display of global message when the user scrolls down the page.", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // 7
    // To verify the display of system alert when the user scrolls down the
    // page.
    @Test
    public void displayOfSytemAlert() throws Exception
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
                testcase.assertTrue(MobileHomePage.isSystemAlert(), "System should display Promotional Content",
                        "System is not displaying Promotional Content");
                SeleniumUtils.javaScriptExecutorDown("200");
                SeleniumUtils.wait(3);
                testcase.assertTrue(MobileHomePage.isSystemAlert(), "System should display Promotional Content",
                        "System is not displaying Promtional Content");
                testcase.pass("To verify the display of system alert when the user scrolls down the page.");
                break;
            } catch (Exception e)
            {
                testcase.retry("To verify the display of system alert when the user scrolls down the page.", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // 8
    // To verify the display of system alert and global message in the hamburger
    // menu.

    @Test
    public void displayOfAlertsHamburgerMenu() throws Exception
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
                testcase.assertTrue(MobileHomePage.isSystemAlert(), "System should display Promotional Content",
                        "System is not displaying Promotional Content");
                testcase.assertTrue(MobileHomePage.isPromotionalContent(), "System should display Promotional Content",
                        "System is not displaying Promtional Content");
                MobileHomePage.clickOnMobileHamburgerMenu();
                testcase.assertTrue(MobileHomePage.isSystemAlert(), "System should display Promotional Content",
                        "System is not displaying Promotional Content");
                testcase.assertTrue(MobileHomePage.isPromotionalContent(), "System should display Promotional Content",
                        "System is not displaying Promtional Content");
                testcase.pass("To verify the display of system alert and global message in the hamburger menu.");
                break;
            } catch (Exception e)
            {
                testcase.retry("To verify the display of system alert and global message in the hamburger menu.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 9
    // To verify that the user is able to see both global message and system
    // alert at the same time.

    @Test
    public void displayOfAlerts() throws Exception
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
                testcase.assertTrue(MobileHomePage.isSystemAlert(), "System should display Promotional Content",
                        "System is not displaying Promotional Content");
                testcase.assertTrue(MobileHomePage.isPromotionalContent(), "System should display Promotional Content",
                        "System is not displaying Promtional Content");
                MobileHomePage.clickOnMobileHamburgerMenu();
                testcase.assertTrue(MobileHomePage.isSystemAlert(), "System should display Promotional Content",
                        "System is not displaying Promotional Content");
                testcase.assertTrue(MobileHomePage.isPromotionalContent(), "System should display Promotional Content",
                        "System is not displaying Promtional Content");
                testcase.pass(
                        "To verify that the user is able to see both global message and system alert at the same time.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify that the user is able to see both global message and system alert at the same time.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
}
