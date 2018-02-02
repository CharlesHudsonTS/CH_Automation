package com.ch.ta.desktopTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.TireSearchResultPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;

public class TireSearchResultTest extends AbstractTestCaseReport implements FileConstants
{

    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();

    }

    @Test
    public void verifyBrandName() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyBrandName(), "Brand Name is displaying",
                        "Brand name is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickBrandName();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the brand name and navigate to respective page");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the brand name and navigate to respective page", testcase, retry,
                        e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyProductReview() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyProductReview(), "Product Review is displaying",
                        "Product Review is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickProductReview();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the Start rating and Product review link and navigate to respective page/popup");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the Start rating and Product review link and navigate to respective page/popup",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifySpeedRatingMessage() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifySpeedRatingMessage(), "Speed rating is displaying",
                        "Speed Rating is not dispalyed");
                testcase.pass("System should display the speed rating message");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the speed rating message", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyProductImage() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyproductImage(), "Product Image is displaying",
                        "Product Image is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickProductImage();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the product image and navigate to respective page ");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the product image and navigate to respective page", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyproductTireSize() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyproductTireSizeLink(),
                        "Product tiresize link is displaying", "Product tiresize link is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickProductTireSizeLink();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the product tire size link and navigate to respective page ");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the product tire size link and navigate to respective page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyproductMessageDetails() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(6000);
                testcase.assertTrue(TireSearchResultPage.verifyproductWarrentyAndSpeedUp(),
                        "Warrenty and speed up is displaying", "Warrenty and speed up is not dispalyed");
                testcase.assertTrue(TireSearchResultPage.verifyproductPrice(), "Price is displaying",
                        "Price is not dispalyed");
                testcase.assertTrue(TireSearchResultPage.verifyproductInStock(), "InStock is displaying",
                        "InStock is not dispalyed");
                testcase.pass("System should display the product Warrenty,speed up,price and InStock message");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the product Warrenty,speed up ,price and InStock message",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyproductShowTireSpec() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyproductShowTireSpecLink(),
                        "Show tire spec link is displaying", "Show Tire spec link is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickProductShowTireSpecLink();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the product show tire spec link and expand the option ");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the product show tire spec link and expand the option ", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyproductSavingLinkAndText() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyproductSavingLinkAndText(), "Saving is displaying",
                        "Saving is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickProductSavingLink();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the product saving link and saving text");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the product saving link and saving text ", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyproductAddToCartButton() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyproductAddToCartButton(), "Add to cart is displaying",
                        "Add to Cart is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickProductAddToCartButton();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the product add to cart button and navigate to respective page ");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the product add to cart button and navigate to respective page ",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyproductQuanity() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyproductQuanity(), "Product Quanity is displaying",
                        "Product Quanity is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickProductQuanityIncrease();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickProductQuanityDcrease();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the product quantiy and functionality of the Increase and decerase");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the product quantiy and functionality of the Increase and decerase",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyCompareButton() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyCompareButton(), "Comapre button is displaying",
                        "Comapre button is not dispalyed");
                Thread.sleep(4000);
                TireSearchResultPage.clickOnCompareButton();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the Compare button and navigate to respective page/popup ");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the Comapre button and navigate to respective page/popup ",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifySortBy() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickOnSortBy();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifySortBy(), "Sort by is displaying",
                        "Sortby is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickOnSortByHightoLow();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickOnSortByLowtoHigh();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the sort by option and should display respective price range");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the sort by option and should display respective price range ",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyRecommededOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyRecommededOption(), "Recommended is displaying",
                        "Recommended is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickOnRecommededOption();
                testcase.assertTrue(TireSearchResultPage.verifyAnnualMileageRecommededOption(),
                        "Annual Mileage Recommended is displaying", "Annual Mileage Recommended is not dispalyed");
                TireSearchResultPage.clickAnnualMileageRecommededOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickOnRecommededOption();
                testcase.assertTrue(TireSearchResultPage.verifyDrivingLocRecommededOption(),
                        "Drving Location Recommended is displaying", "Drving Location Recommended is not dispalyed");
                TireSearchResultPage.clickDrivingLocRecommededOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickOnRecommededOption();
                testcase.assertTrue(TireSearchResultPage.verifyDrivingStyleRecommededOption(),
                        "Drving Style Recommended is displaying", "Drving Style Recommended is not dispalyed");
                TireSearchResultPage.clickDrivingStyleRecommededOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickOnRecommededOption();
                testcase.assertTrue(TireSearchResultPage.verifyVehicleUsesRecommededOption(),
                        "Vehicle Uses Recommended is displaying", "Vehicle Uses Recommended is not dispalyed");
                TireSearchResultPage.clickVehicleUsesRecommededOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the Recommended option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the Recommended option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyAllResult() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyAllResultOption(), "All result option is displaying",
                        "All result option is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickAllResultOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the All result option and should expand the all result option");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the All result option and should expand the all result option",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    public void verifyAllResultRecommendedOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyShowOriginalEquiOption(),
                        "Show original equiement is displaying", "Show original equiement is not dispalyed");
                TireSearchResultPage.clickShowOriginalEquiOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyShowPromotionOption(),
                        "Show promotion only is displaying", "Show promotion only is not dispalyed");
                TireSearchResultPage.clickShowPromotionOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyShowBestSellerOption(),
                        "Show best selleres is displaying", "Show best sellers is not dispalyed");
                TireSearchResultPage.clickShowBestSellerOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the All result Recommended option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the All result Recommended option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyBrandInAllResultOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyBrandInAllResultOption(),
                        "Brand All result option is displaying", "Brand All result option is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickBrandInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickAnyOneBrandOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the Brand All result option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the Brand All result option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifySavingInAllResultOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifySavingInAllResultOption(),
                        "Saving All result option is displaying", "Saving All result option is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickSavingInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickAnyOneSavingOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the Saving All result option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the Saving All result option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyTireTypeInAllResultOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyTireTypeInAllResultOption(),
                        "Tire Type All result option is displaying", "Tire Type All result option is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickTireTypeInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickAnyOneTireTypeOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the Tire Type All result option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the Tire Type All result option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifySpeedRateInAllResultOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifySpeedRateInAllResultOption(),
                        "Speed rate All result option is displaying", "Speed rate All result option is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickSpeedRateInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickSpeedRateAlertOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickAnyOneSpeedRateOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the Speed rate All result option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the Speed rate All result option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyLoadIndexInAllResultOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyLoadIndexInAllResultOption(),
                        "Load Index All result option is displaying", "Load Index All result option is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickLoadIndexInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickLoadIndexAlertOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickAnyOneLoadIndexOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the Load index All result option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the Load index All result option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyTreadLifeInAllResultOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyTreadLifeInAllResultOption(),
                        "Tread Life All result option is displaying", "Tread Life All result option is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickTreadLifeInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickAnyOneTreadLifeOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the Tread life All result option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the Tread life All result option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyWinterTiresInAllResultOption() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                TireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyWinterTiresInAllResultOption(),
                        "Winter Tire All result option is displaying",
                        "Winter Tire All result option is not dispalyed");
                Thread.sleep(5000);
                TireSearchResultPage.clickWinterTiresInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickWinterTireYesOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                TireSearchResultPage.clickAllResultOption();
                Thread.sleep(5000);
                TireSearchResultPage.clickWinterTiresInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickWinterTireNoOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                testcase.pass(
                        "System should display the Winter tires All result option and should display respective result");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the Winter tires All result option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void clickonLoadNext() throws Exception
    {

        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                HeaderFooterPage.enterGlobalSearch();
                Thread.sleep(4000);
                String pageSource = DriverFactory.getDriver().getPageSource();
                String fil = RESOURCES_HOME + "test.txt";

                FileWriter write = new FileWriter(fil);

                write.write(pageSource);
                System.out.println("writed");
                write.close();
                File file = new File(fil);
                BufferedReader reader = new BufferedReader(new FileReader(fil));
                String line;
                int count = 0;
                while ((line = reader.readLine()) != null)
                {
                    int indexValue = line.indexOf("productResult-searchrow");
                    if (indexValue >= 0 && Character.isDigit(line.charAt(indexValue + 23)))
                    {
                        count++;
                    }
                }
                System.out.println(count);
                reader.close();
                file.delete();
                System.out.println("Deleted");
                TireSearchResultPage.clickLoadNext();
                Thread.sleep(5000);
                String pageSource1 = DriverFactory.getDriver().getPageSource();
                String fil1 = RESOURCES_HOME + "test.txt";

                FileWriter write1 = new FileWriter(fil);

                write1.write(pageSource1);
                System.out.println("writed");
                write1.close();
                File file1 = new File(fil1);
                BufferedReader reader1 = new BufferedReader(new FileReader(fil1));
                String line1;
                int count1 = 0;
                while ((line1 = reader1.readLine()) != null)
                {
                    int indexValue = line1.indexOf("productResult-searchrow");
                    if (indexValue >= 0 && Character.isDigit(line1.charAt(indexValue + 23)))
                    {
                        count++;
                    }
                }
                System.out.println(count1);
                reader1.close();
                file1.delete();
                System.out.println("Deleted");
                testcase.pass(
                        "System should display the Tread life All result option and should display respective result"
                                + count1);

                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display the Tread life All result option and should display respective result",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

}
