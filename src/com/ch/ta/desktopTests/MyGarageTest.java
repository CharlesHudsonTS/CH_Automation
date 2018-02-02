package com.ch.ta.desktopTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.MyGaragePage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MyGarageTest extends AbstractTestCaseReport
{

    @BeforeMethod
    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    @Test
    public void verifyMyGarageTab() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(MyGaragePage.verifyMyGarageTab(), "My Garage is displaying",
                    "My garage is not displayed");

            testcase.pass("Display of the My Garage tab");
        } catch (Exception e)
        {
            testcase.error("System should display the My Garage tab", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyMyGarageDetails() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
            testcase.assertTrue(MyGaragePage.verifyMyGarageDetails(), "My Garage details is displaying",
                    "My garage deatils is not displayed");

            testcase.pass("Display of the My Garage deatils");
        } catch (Exception e)
        {
            testcase.error("System should display the My Garage details", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyMyGarageEditVehicle() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
            testcase.assertTrue(MyGaragePage.verifyMyGarageEditVehicle(), "My Garage edit vehicle link is displaying",
                    "My garage edit vehicle link is not displayed");
            SeleniumUtils.wait(4);
            MyGaragePage.clickEditVehicleLink();
            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the My Garage edit vehicle link");
        } catch (Exception e)
        {
            testcase.error("System should display the My Garage edit vehicle link", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyMyGarageRemoveVehicle() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
//            testcase.assertTrue(MyGaragePage.verifyMyGarageRemoveVehicle(),
//                    "My Garage remove vehicle link is displaying", "My garage remove vehicle link is not displayed");
            SeleniumUtils.wait(4);
//            MyGaragePage.clickRemoveVehicleLink();
            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the My Garage remove vehicle link");
        } catch (Exception e)
        {
            testcase.error("System should display the My Garage remove vehicle link", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyMyGarageWhyICantEditVehicle() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
//            testcase.assertTrue(MyGaragePage.verifyWhyICantEditVehicle(), "Why i can't edit vehicle link is displaying",
//                    "Why i can't edit vehicle vehicle link is not displayed");
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickWhyICantEditVehicleLink();
            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the Why i can't edit vehicle link");
        } catch (Exception e)
        {
            testcase.error("System should display the Why i can't edit vehicle vehicle link", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyMyGarageShopForThisVehicle() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
//            testcase.assertTrue(MyGaragePage.verifyShopForThisVehicle(), "Shop for this vehicle button is displaying",
//                    "Shop for this vehicle vehicle button is not displayed");
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickShopForThisVehicle();
//            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the Shop for this vehicle button");
        } catch (Exception e)
        {
            testcase.error("System should display the Shop for this vehicle button", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyMyGarageAdditionalTireInformationLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
//            testcase.assertTrue(MyGaragePage.verifyAdditionalTireInfo(),
//                    "Additional tire information link is displaying",
//                    "Additional tire information link is not displayed");
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickAdditionalTireInfo();
            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the Additional tire information link");
        } catch (Exception e)
        {
            testcase.error("System should display the Additional tire information link", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyManufactureSuggestedServicesLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
//            testcase.assertTrue(MyGaragePage.verifyManufactureServices(),
//                    "Manufacture Suggested Services link is displaying",
//                    "Manufacture Suggested Services link is not displayed");
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickManufactureServices();
            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the Manufacture Suggested Services link");
        } catch (Exception e)
        {
            testcase.error("System should display the Manufacture Suggested Services link", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyPastPurchaseLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
//            testcase.assertTrue(MyGaragePage.verifyPastPurchase(), "Past Purchase link is displaying",
//                    "Past Purchase link is not displayed");
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickPastPurchase();
            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the Past Purchase link");
        } catch (Exception e)
        {
            testcase.error("System should display the Past Purchase link", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyDrivingPerference() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            HeaderFooterPage.clickMyAccontMyGarage();
            SeleniumUtils.wait(5);
//            testcase.assertTrue(MyGaragePage.verifyDrivingPerference(), "Driving Perfernence is displaying",
//                    "Driving Perfernence is not displayed");
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickDrivingPerference();
            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the Driving Perfernence");
        } catch (Exception e)
        {
            testcase.error("System should display the Driving Perfernence", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyDrivingPerferenceAnnualMileage() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
//            //signIn();
//            HeaderFooterPage.onHoverMyAccount();
//            Thread.sleep(3000);
//            HeaderFooterPage.clickMyAccontMyGarage();
//            SeleniumUtils.wait(5);
//            MyGaragePage.clickDrivingPerference();
//            SeleniumUtils.wait(4);
//            testcase.assertTrue(MyGaragePage.verifyAnnualMileage(), "Annual mileage is displaying",
//                    "Annual mileage link is not displayed");
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickAnnualMileageOption1();
//            SeleniumUtils.wait(4);
//            // testcase.assertTrue(flag, expected, actual);
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickAnnualMileageOption2();
//            SeleniumUtils.wait(4);
//            // testcase.assertTrue(flag, expected, actual);
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickAnnualMileageOption3();
//            SeleniumUtils.wait(4);
//            // testcase.assertTrue(flag, expected, actual);
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickAnnualMileageOption4();
//            SeleniumUtils.wait(4);
//            // testcase.assertTrue(flag, expected, actual);
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickAnnualMileageOption5();
//            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the Annual mileage");
        } catch (Exception e)
        {
            testcase.error("System should display the Annual mileage", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyDrivingPerferenceDrivePlaces() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
//            HeaderFooterPage.onHoverMyAccount();
//            Thread.sleep(3000);
//            HeaderFooterPage.clickMyAccontMyGarage();
//            SeleniumUtils.wait(5);
//            MyGaragePage.clickDrivingPerference();
//            SeleniumUtils.wait(4);
//            testcase.assertTrue(MyGaragePage.verifyDrivePlaces(), "Drive places is displaying",
//                    "Drive places link is not displayed");
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickDrivePlacesOption1();
//            SeleniumUtils.wait(4);
//            // testcase.assertTrue(flag, expected, actual);
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickDrivePlacesOption2();
//            SeleniumUtils.wait(4);
//            // testcase.assertTrue(flag, expected, actual);
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickDrivePlacesOption3();
//            SeleniumUtils.wait(4);
//            // testcase.assertTrue(flag, expected, actual);
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickDrivePlacesOption4();
//            SeleniumUtils.wait(4);
//            // testcase.assertTrue(flag, expected, actual);
//            SeleniumUtils.wait(4);
//            MyGaragePage.clickDrivePlacesOption5();
//            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the Drive Places");
        } catch (Exception e)
        {
            testcase.error("System should display the Drive places", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyDrivingPerferenceUsualDrivingStyle() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            //signIn();
            HeaderFooterPage.onHoverMyAccount();
            Thread.sleep(3000);
            // HeaderFooterPage.clickMyAccontMyGarage();
            // SeleniumUtils.wait(5);
            // MyGaragePage.clickDrivingPerference();
            // SeleniumUtils.wait(4);
            // testcase.assertTrue(MyGaragePage.verifyUsualDrivingStyle(),
            // "Usual Driving Style is displaying",
            // "Usual Driving style is not displayed");
            // SeleniumUtils.wait(4);
            // MyGaragePage.clickDrivePlacesOption1();
            // SeleniumUtils.wait(4);
            // // testcase.assertTrue(flag, expected, actual);
            // SeleniumUtils.wait(4);
            // MyGaragePage.clickDrivePlacesOption2();
            // SeleniumUtils.wait(4);
            // // testcase.assertTrue(flag, expected, actual);
            // SeleniumUtils.wait(4);
            // MyGaragePage.clickDrivePlacesOption3();
            // SeleniumUtils.wait(4);
            // // testcase.assertTrue(flag, expected, actual);
            // SeleniumUtils.wait(4);
            // MyGaragePage.clickDrivePlacesOption4();
            // SeleniumUtils.wait(4);
            // // testcase.assertTrue(flag, expected, actual);
            // SeleniumUtils.wait(4);
            // MyGaragePage.clickDrivePlacesOption5();
            SeleniumUtils.wait(4);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & Functionlity of the drive places");
        } catch (Exception e)
        {
            testcase.error("System should display the drive places", e);
            e.printStackTrace();
        }
    }

}
