package com.ch.ta.desktopTests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.HomePage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class HomePageTest extends AbstractTestCaseReport implements FileConstants
{
    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    // Test Case :1,2,3
    // To verify the display of Spot for main image in Homepage.
    @Test
    public void spotForMainImage() throws Exception
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
                SeleniumUtils.wait(25);
                testcase.assertTrue(HomePage.isDisplayspotformainimage(), "system should display spot for main image",
                        "system should not display spot for main image");
                SeleniumUtils.wait(1);
                String text = SeleniumUtils.getText(ExcelProperty.getElementValue(HOME_PAGE, SPOT_MESSAGE));
                System.out.println(text);
                testcase.assertEquals("Your tires. Your way.", text);
                SeleniumUtils.wait(1);
                String attributes = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(HOME_PAGE, SPOT_TEXTUAL_INSTRUCTIONS));
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Tell Us What You Drive.");
                String attributes1 = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(HOME_PAGE, SPOT_TEXTUAL_INSTRUCTIONS1));
                System.out.println(attributes1);
                testcase.assertEquals(attributes1, "Find Your New Tires.");
                String attributes2 = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(HOME_PAGE, SPOT_TEXTUAL_INSTRUCTIONS2));
                System.out.println(attributes2);
                testcase.assertEquals(attributes2, "Choose An Installer.");
                testcase.pass("System is displaying spot for main image, message and textual instructions in homepage");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System is not displaying spot for main image, message and textual instructions in homepage ",
                        testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :4
    // To verify the display & functionality of video link in Homepage.
    @Test
    public void videoLink() throws Exception
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
                SeleniumUtils.wait(25);
                testcase.assertTrue(HomePage.isDisplayVideoLink(), "system should display video link",
                        "system should not display video link");
                HomePage.clickOnVideoLink();
                SeleniumUtils.wait(5);
                HomePage.clickOnCloseVideoLink();
                // assertion

                testcase.pass("Video link is clickable ");
                break;
            } catch (Exception e)
            {
                testcase.retry("Video link is clickable ", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :5
    // To verify the display of YMME control in Homepage.
    @Test
    public void yMMEControl() throws Exception
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
                SeleniumUtils.wait(25);
                testcase.assertTrue(HomePage.isDisplayshopbyvehicle(), "system should display shop by vehicle tab",
                        "system should not display shop by vehicle tab");
                testcase.assertTrue(HomePage.isDisplayshopbytiresize(), "system should display shop by tire size tab",
                        "system should not display shop by tiresize tab");
                testcase.assertTrue(HomePage.isDisplayshopbylicenceplatenum(),
                        "system should display licence plate number link",
                        "system should not display licence plate number link");
                testcase.pass("System is displaying YMME control ");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying  YMME control ", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :6
    // To verify the display of Value proposition Component in Homepage.
    @Test
    public void displayValuePropComp() throws Exception
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
                SeleniumUtils.wait(25);
                testcase.assertTrue(HomePage.isDisplayValPropComp(),
                        "system should display value proposition component",
                        "system should not display value proposition component");
                testcase.pass("System is displaying value proposition component");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying value proposition component", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :8
    // To verify the display of Installer Locator Component in Homepage.
    @Test
    public void displayInstallerLocator() throws Exception
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
                testcase.assertTrue(HomePage.isDisplayInstallerLocator(), "system should display installer locator",
                        "system should not display installer locator");
                testcase.pass("System is displaying installer locator");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying installer locator", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :9
    // To verify the functionality of 'CHANGE LOCATION' button in Installer
    // Locator Component in Homepage.
    @Test
    public void changeLocationFunctionality() throws Exception
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
                SeleniumUtils.wait(20);
                SeleniumUtils.javaScriptExecutorDown("350");
                SeleniumUtils.wait(10);
                testcase.assertTrue(HomePage.isDisplayInstallerLocator(), "system should display installer locator",
                        "system should not display installer locator");

                testcase.pass("System is displaying installer locator");
                HomePage.clickOnchangelocation();
                SeleniumUtils.wait(10);
                String url = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("http://stage.tireamerica.com/installers", url);
                testcase.pass("change location button is navigated to installers page");
                break;
            } catch (Exception e)
            {
                testcase.retry("change location button is not navigated to installers page", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :12,13,14
    // To verify the display of Carousel with Promotions in Homepage.
    @Test
    public void displayCarouselWithPromotions() throws Exception
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
                SeleniumUtils.wait(20);
                testcase.assertTrue(HomePage.isDisplayPromotion1(), "system should display the promotion Up to $70 off",
                        "system should not display the promotion Up to $70 off");
                testcase.assertTrue(HomePage.isDisplayPromotion2(),
                        "system should display the promotion Top performance. Unrivaled value",
                        "system should not display the promotion Top performance. Unrivaled value");
                SeleniumUtils.wait(5);
                SeleniumUtils.javaScriptExecutorDown("350");
                SeleniumUtils.wait(2);
                SeleniumUtils.keys(Keys.ARROW_DOWN);
                SeleniumUtils.keys(Keys.ARROW_DOWN);
                SeleniumUtils.keys(Keys.PAGE_DOWN);
                SeleniumUtils.wait(5);

                HomePage.hoverOnPromo1();
                SeleniumUtils.wait(2);
                HomePage.clickOnPromo1();
                String promo1 = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("https://stage.tireamerica.com/promo-1", promo1);
                DriverFactory.getDriver().navigate().back();
                SeleniumUtils.wait(20);
                SeleniumUtils.javaScriptExecutorDown("200");
                SeleniumUtils.wait(10);
                HomePage.hoverOnPromo2();
                SeleniumUtils.wait(2);
                HomePage.clickOnPromo2();
                String promo2 = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("https://stage.tireamerica.com/promo-2", promo2);
                testcase.pass("System is displaying the carousel with promotions ");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying  the carousel with promotions ", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :15,16 // To verify the display of Top Rated Brands component
    // in Homepage.
    @Test
    public void displayTopRatedBrands() throws Exception
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
                testcase.assertTrue(HomePage.isDisplayBrandLogos(), "system should display brand Logos",
                        "system should not display brand Logos");
                testcase.assertTrue(HomePage.isDisplayShopOurBrandsbutton(), "system should display brand Logos",
                        "system should not display brand Logos");
                HomePage.clickOnShopOurBrands();
                testcase.pass(
                        "System is displaying Top rated brands and is navigated to shop by brand landing page when clicked on shop our brands button");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System is not displaying Top rated brandsand is navigated to shop by brand landing page when clicked on shop our brands button",
                        testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :17,18
    // To verify the display of Social Media Reviews/Testimonials component in
    // Homepage.
    @Test
    public void displaySocialMediaComponents() throws Exception
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
                SeleniumUtils.wait(100);
                SeleniumUtils.javaScriptExecutorDown("350");
                SeleniumUtils.wait(10);
                testcase.assertTrue(HomePage.isDisplaySocialMediaComp(),
                        "system should display social media testimonials component",
                        "system should not display social media testimonials component");
                testcase.pass("System is displaying social media testimonials component");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying social media testimonials component ", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :19,20,21,22
    // To verify the display of Knowledge Center Component in Homepage.
    @Test
    public void displayKnowledgeCentre() throws Exception
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
                SeleniumUtils.wait(35);
                SeleniumUtils.javaScriptExecutorDown("350");
                SeleniumUtils.wait(10);
                testcase.assertTrue(HomePage.isDisplayKnowledgeCentre(), "system should display Knowledge centre",
                        "system should not display Knowledge centre");
                testcase.assertTrue(HomePage.isDisplayKnowledgeCentreArticle1(),
                        "system should display Knowledge centre article1",
                        "system should not display Knowledge centre article1");
                testcase.assertTrue(HomePage.isDisplayKnowledgeCentreArticle2(),
                        "system should display Knowledge centre article2",
                        "system should not display Knowledge centre article2");
                testcase.assertTrue(HomePage.isDisplayKnowledgeCentreArticle3(),
                        "system should display Knowledge centre article3",
                        "system should not display Knowledge centre article3");
                HomePage.hoverOnArticle1();
                HomePage.clickOnArticle1();
                String article1 = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("https://stage.tireamerica.com/account", article1);
                DriverFactory.getDriver().navigate().back();
                SeleniumUtils.wait(50);
                HomePage.hoverOnArticle2();
                HomePage.clickOnArticle2();
                String article2 = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("https://stage.tireamerica.com/", article2);
                DriverFactory.getDriver().navigate().back();
                SeleniumUtils.wait(50);
                HomePage.hoverOnArticle3();
                HomePage.clickOnArticle3();
                String article3 = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("https://stage.tireamerica.com/brands", article3);
                testcase.pass("System is displaying Knowledge centre");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying Knowledge centre ", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }

    // Test Case :23,24
    // To verify the display and functionality of cta button of Credit Card
    // Component in Homepage.
    @Test
    public void creditCardComponent() throws Exception
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
                SeleniumUtils.wait(20);
                SeleniumUtils.javaScriptExecutorDown("350");
                SeleniumUtils.wait(10);
                testcase.assertTrue(HomePage.isDisplayCreditCardComponent(),
                        "system should display credit card component",
                        "system should not display credit card component");
                HomePage.clickOnApplyNow();
                String url1 = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("https://stage.tireamerica.com/creditcard", url1);
                testcase.pass("System is displaying credit card component");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is not displaying credit card component", testcase, retry, e);
                e.printStackTrace();
            }

        }
    }
}
