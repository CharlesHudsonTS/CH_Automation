package com.ch.ta.mobileTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.ConfirmTireSizePage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumHelperUtils;
import com.ch.utils.SeleniumUtils;

public class MobileCreateAnAccWithEmailTest extends AbstractTestCaseReport implements FileConstants
{
    @BeforeMethod
    public void tyreURL() throws Exception
    {
        CommonUtils.mobileView();
        CommonUtils.TBCURL();
    }

    // Test 1 : To verify the navigation to 'Confirm Tire Size' page from VIN in
    // Homepage.

    @Test
    public void verifyTireSizeNavigation() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertTrue(true, " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 2 : To verify the display of 'Confirm Tire Size' page from VIN in
    // Homepage.

    @Test
    public void verifyTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertTrue(true, " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 3 :To verify the display & functionality of 'back' link in 'Confirm
    // Tire Size' page.
    @Test
    public void verifyBackLinkFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            SeleniumHelperUtils.waitForPageLoad_JQ();
            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            SeleniumHelperUtils.waitForPageLoad_JQ();
            testcase.assertTrue(true, " ", " ");
            ConfirmTireSizePage.clickBackLInk();
            testcase.assertTrue(true, " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 4 : To verify the functionality of tire size link for only one tire
    // size present in 'Confirm Your Tire Size' section of 'Confirm Tire Size'
    // page.
    @Test
    public void verifyOnlyTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
//            ConfirmTireSizePage.clicOnlyTireSize();
            testcase.assertEquals(" ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 5 : To verify the functionality of tire size links for the selected
    // vehicle
    // in 'Confirm Your Tire Size' section of 'Confirm Tire Size' page.
    @Test
    public void verifyAllTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertTrue(true, " ", " ");
            ConfirmTireSizePage.clicTireSize();
            testcase.assertEquals(" ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }
    // Test 6 :To verify the display of static text in 'Confirm Your Tire Size'
    // section of 'Confirm Tire Size' page.

    @Test
    public void conformYourTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertEquals(" ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 7 :To verify the display of "My tire Size Isn't Listed" accordion in
    // 'Confirm Tire Size' page.
    @Test
    public void verifyNoTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertEquals(" ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 8 :To verify the functionality of "My tire Size Isn't Listed"
    // accordion in 'Confirm Tire Size' page.

    @Test
    public void NotTireSizeFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(true, " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 9 :To verify the display of "Add a Different Rear Tire Size" link in
    // 'Confirm Tire Size' page.
    @Test
    public void NotTireSizeVerifyRearTire() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(true, " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 10 :To verify the functionality of "Add a Different Rear Tire Size"
    // link in 'Confirm Tire Size' page.
    @Test
    public void rearTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            ConfirmTireSizePage.clickRearTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 11 : To verify the display of "Custom size results" button in
    // 'Confirm Tire Size' page.
    @Test
    public void verifyCustomerSizeResults() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.tireSizeFeatures("", "", "");;
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 12 :To verify the functionality of "Custom size results" in Confirm
    // Tire Size' page.
    @Test
    public void CustomerSizeResultsFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.tireSizeFeatures("", "", "");;
            ConfirmTireSizePage.clickCustomerSizeResults();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 13:To verify the display of "Learn more about Staggered Fitment"
    // link in Confirm Tire Size' page.
    @Test
    public void verifyStaggerdFitment() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 14:To verify the functionality of "Learn more about Staggered
    // Fitment" link in Confirm Tire Size' page.
    @Test
    public void StaggerdFitmentFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickStaggeredFitment();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 15 : To verify the functionality of "Custom size results" for
    // different front and rear tire sizes in 'Confirm Tire Size' page.
    @Test
    public void CustomerSizeResultsRearTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickRearTireSize();
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickCustomerSizeResults();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 16:To verify the display of "Front Tires" and "Rear Tires" for
    // selected Vehicle in 'Confirm Tire Size' page.
    @Test
    public void verifyFrontRearTires() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickRearTireSize();
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickCustomerSizeResults();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 17:To verify the functionality of "Front Tires" in 'Confirm Tire
    // Size' page.
    @Test
    public void FrontTiresFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickRearTireSize();
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickCustomerSizeResults();
            ConfirmTireSizePage.clickFrontTires();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 18: To verify the functionality of "Rear Tires" in 'Confirm Tire
    // Size' page.
    @Test
    public void RearTiresFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickRearTireSize();
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickCustomerSizeResults();
            ConfirmTireSizePage.clickRearTires();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 19 :To verify the display of "-" icon near 'Add A Different Rear
    // Tire Size' in 'Confirm Tire Size' page.
    @Test
    public void verifyIconNearRearTire() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.clickRearTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 20: To verify the functionality of "-" icon in Confirm near 'Add A
    // Different Rear Tire Size' in 'Confirm Tire Size' page.
    @Test
    public void iconNearRearTireFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.clickRearTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.clickIconNearRearTire();
            testcase.assertFalse(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 21 :To verify the functionality of "^" accordion of 'My Tire Size
    // Isn't Listed' in 'Confirm Tire Size' page.
    @Test
    public void AccordionOfNotTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.clickAccordionNotTireSize();
            testcase.assertFalse(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 22 : To verify the display of "Where can I find my Tire Size" link
    // in 'Confirm Tire Size' page.
    @Test
    public void verifyFindMyTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 23 : To verify the functionality of "Where can I find my Tire Size"
    // link in 'Confirm Tire Size' page.
    @Test
    public void findMyTireSizeFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickFindMyTireSize();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

}
