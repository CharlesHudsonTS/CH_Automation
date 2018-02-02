package com.ch.ta.mobileTests;

import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.TireSearchResultPage;
import com.ch.ta.mobilePages.MobileHeaderFooterPage;
import com.ch.ta.mobilePages.MobileTireSearchResultPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;

public class MobileTireSearchResultTest extends AbstractTestCaseReport implements FileConstants
{

    public void tyreURL() throws Exception
    {
        CommonUtils.mobileView();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                testcase.assertTrue(TireSearchResultPage.verifyAllResultOption(), "All result option is displaying",
                        "All result option is not dispalyed");
                Thread.sleep(5000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyShowOriginalEquiOption(),
                        "Show original equiement is displaying", "Show original equiement is not dispalyed");
                TireSearchResultPage.clickShowOriginalEquiOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                MobileTireSearchResultPage.clickAllResultOption();
                testcase.assertTrue(TireSearchResultPage.verifyShowPromotionOption(),
                        "Show promotion only is displaying", "Show promotion only is not dispalyed");
                TireSearchResultPage.clickShowPromotionOption();
                Thread.sleep(5000);
                // testcase.assertTrue("", "", "");
                Thread.sleep(5000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
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
                MobileTireSearchResultPage.clickAllResultOption();
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
    public void clickonBackToTop() throws Exception
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                testcase.assertTrue(MobileTireSearchResultPage.verifyBackToTop(), "Back to top link is displaying",
                        "Back to top link is not dispalyed");
                MobileTireSearchResultPage.clickBackToTop();
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the from first product ");

                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the from first product", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyClearFilterButton() throws Exception
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
                Thread.sleep(5000);
                TireSearchResultPage.clickTreadLifeInAllResultOption();
                Thread.sleep(3000);
                TireSearchResultPage.clickAnyOneTreadLifeOption();
                Thread.sleep(5000);
                MobileTireSearchResultPage.clickAllResultOption();
                Thread.sleep(5000);
                testcase.assertTrue(MobileTireSearchResultPage.verifyClearFilterbutton(),
                        "Clear filter button is displaying", "Clear filter button is not dispalyed");
                MobileTireSearchResultPage.clickClearFilterbutton();
                // testcase.assertTrue("", "", "");
                testcase.pass("System should display the product with cleaar filter");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the product with cleaar filter", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void verifyFilterCloseButton() throws Exception
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
                MobileHeaderFooterPage.clickHamburgerSearchMenu();
                Thread.sleep(4000);
                MobileTireSearchResultPage.clickAllResultOption();
                Thread.sleep(5000);
                testcase.assertTrue(MobileTireSearchResultPage.verifyFilterClose(), "filter close button is displaying",
                        "filter close button is not dispalyed");
                MobileTireSearchResultPage.clickFilterCloseButton();
                // testcase.assertTrue("", "", "");
                testcase.pass("System should close the filter option");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should close the filter option", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

}
