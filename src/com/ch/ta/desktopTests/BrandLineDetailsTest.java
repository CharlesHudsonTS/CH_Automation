package com.ch.ta.desktopTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.BrandLineDetailsPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.utils.SeleniumUtils;

public class BrandLineDetailsTest
{
    @BeforeMethod
    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    // Test 1 : To verify that the user is able to navigate to Brand Line
    // Details Page.
    @Test
    public void verifyBrandLineDetialsNavigation() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 2: To verify the display of title of the brand in Brand Line Details
    // page.
    @Test
    public void verifyBrand() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isBrandTitle(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 3: To verify the display of Ratings and Reviews section in Brand
    // Line Details page.
    @Test
    public void verifyRatingsReviews() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isRatingsReviews(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 4: To verify the display of Tire Sizes available for the brand in
    // Brand Line Details page.
    @Test
    public void verifyTireSizes() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isTireSizes(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 5:To verify the display of YMME in Brand Line Details page.
    @Test
    public void verifyYMME() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isYMME(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 6: To verify the display of Warranty Tab in Brand Line Details page.
    @Test
    public void verifyWarranty() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 7: To verify the display of 'Shop This Line By Size' in Brand Line
    // Details page.
    @Test
    public void verifyShopThisLineBySize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 8: To Verify the functionality of 'Shop this Line By Size' tab in
    // Brand Line Details page.
    @Test
    public void verifyShopThisLineFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            BrandLineDetailsPage.clickShopThisLine();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 9: To verify the display of static Text in YMME Section in Brand
    // Line Details page.

    @Test
    public void verifyStaticYMME() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            BrandLineDetailsPage.clickShopThisLine();
            testcase.assertTrue(BrandLineDetailsPage.isYMMEText(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 10: To verify the display and Functionality of "License Plate
    // Number" link in YMME Section of Brand Line Details page.
    @Test
    public void verifyLicensePlateNumber() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            BrandLineDetailsPage.clickLicensePlateNumber();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 11: To verify the display of 'View' section in Brand Line Details
    // page.
    @Test
    public void verifyViewSection() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 12: To verify the Functionality of 'All Sizes' link in Brand Line
    // Details page.
    @Test
    public void allSizesFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            BrandLineDetailsPage.clickAllSizes();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 13: To verify the Functionality for Particular Tire Size in Brand
    // Line Details page.
    @Test
    public void verifyParticularTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            BrandLineDetailsPage.clickParticularTireSize();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 14: To verify the Functionality of Tire Size Link in Brand Line
    // Details page.
    @Test
    public void verifyTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            BrandLineDetailsPage.clickTireSize();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 15: To verify the display and Functionality of 'Back to top' link in
    // Bottom of the Page in Brand Line Details page
    @Test
    public void verifyBackToTopLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            BrandLineDetailsPage.clickBackToTopLink();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 16:To verify the display of static text about the description of
    // tire below YMME section in Brand Line Details page

    @Test
    public void verifyYMMEBelowText() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isYMMEBelowText(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 17: To verify the display of Carousels in Brand Line Details page .

    @Test
    public void verifyCarousels() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(" ", " ")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 18: To verify the display of Footer Section in Brand Line Details
    // page

    @Test
    public void verifyFooterSection() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isFooterSection(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 19: To verify the display and functionality of Ratings and Reviews
    // tab in Brand Line Details page.

    @Test
    public void functionalityOfRatingsAndReviews() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isRatingsReviews(), " ", " ");
            BrandLineDetailsPage.clickRatingsAndReviews();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 20: To verify the display of title of brand in Brand Line Details
    // page.

    @Test
    public void verifyBrandTitle() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isBrandTitle(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 21: To Verify the display of Tires that do no fit for Selected
    // Vehicle
    @Test
    public void verifyNotFitTires() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isNotFitTires(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 22:To Verify the display of Tires that Will fit for Selected Vehicle

    @Test
    public void verifyFitTires() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isFitTires(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 23:To Verify the display of warning message in Brand Section for no
    // vehicle Selected in Brand Line detail Page.
    @Test
    public void verifyNoVehicleWarningMessage() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isNoVehicleWarningMessage(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 24: To Verify the Warning Message in Tire Section in Brand Line
    // detail Page

    @Test
    public void verifyWarningMessage() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            BrandLineDetailsPage.clickTiresDropDown("Shop By brand");
            SeleniumUtils.wait(3);
            BrandLineDetailsPage.clickBrand(" ");
            BrandLineDetailsPage.clickSuitableTire(" ");
            testcase.assertTrue(BrandLineDetailsPage.isWarningMessage(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }
}
