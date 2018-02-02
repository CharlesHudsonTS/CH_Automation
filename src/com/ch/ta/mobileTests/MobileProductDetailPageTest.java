package com.ch.ta.mobileTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.HomePage;
import com.ch.ta.desktopPages.ProductDetailPage;
import com.ch.ta.mobilePages.MobileHeaderFooterPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MobileProductDetailPageTest extends AbstractTestCaseReport implements FileConstants
{

    @BeforeMethod
    public void tyreURL() throws Exception
    {
        CommonUtils.mobileView();
        CommonUtils.TBCURL();
    }

    // 30 : To verify the display of 'Car Bar' in the Product Details Page.
    @Test
    public void verifyDisplayCarBar() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isCarBar(), "Car Bar is displaying", "Car Bar is not displayed");

            testcase.pass("System should display the Car Bar");
        } catch (Exception e)
        {
            testcase.error("System should not display the Car Bar", e);
            e.printStackTrace();
        }
    }

    // 31 : To verify the display of 'Brand Name' in the Product Details Page.
    @Test
    public void verifyBrandName() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isBrandName(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 32 : To verify the display of 'Alternate Images' in the Product Details
    // Page.
    @Test
    public void verifyAlternateImage() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isAlternateImage(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 33 : To verify the display of 'Product Video' in the Product Details
    // Page.
    @Test
    public void verifyProductVideo() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isProductVideo(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 34 : To verify the functionality of 'Product Video' in the Product
    // Details
    // Page.
    @Test
    public void playProductVideo() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnProductVideo();
            // updete assertion
            testcase.assertTrue(ProductDetailPage.isProductVideo(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");

        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 35 : To verify the display of 'Tire Size' in the Product Details Page.
    @Test
    public void verifyTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isTireSize(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 36: To verify the display of 'Savings' Section in the Product Details
    // Page.
    @Test
    public void verifySavingsSection() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isSavingsSection(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 37 : To verify the display of 'Inventory Status' in the Product Details
    // Page.
    @Test
    public void verifyInventoryStatus() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isInventoryStatus(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 38 : To verify the display of 'Star Ratings' in the Product Details Page.
    @Test
    public void verifyStarRatings() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isStarRatings(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 39 : To verify the display of 'Reviews' in the Product Details Page.
    @Test
    public void verifyReviews() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isReviews(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 40 : To verify the functionality of 'Reviews' in the Product Details
    // Page.
    @Test
    public void reviewsDetails() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnReviewsButton();
            // update assceration
            testcase.assertTrue(ProductDetailPage.isReviews(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 41 : To verify the display of 'Shippment' details in the Product Details
    // Page.
    @Test
    public void verifyShippmentDetails() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isShippmentDetails(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 42 : To verify the display of 'Warranty' details below the size in the
    // Product Details Page.
    // Page.
    @Test
    public void verifyWarrantyBelowTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isWarranty(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 43 : To verify the display of 'Speed Up' details in the Product Details
    // Page.

    @Test
    public void verifySpeedUp() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isSpeedUp(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 44 : To verify the display of 'Add To Cart' button in the Product Details
    // Page.

    @Test
    public void verifyAddToCart() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 45 : To verify the functionality of 'Add To Cart' button in the Product
    // Details Page.

    @Test
    public void addToCartButton() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnAddToCart();
            // update
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 46 : To verify the display of 'Quantity Box' in the Product Details Page.

    @Test
    public void verifyQuantityBox() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isQuantityBox(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 47 :To verify the functionality of 'Increment Field' for quantity box in
    // the
    // Product Details Page.
    @Test
    public void increaseQuantity() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnQuntyUpButton();
            // update
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 48 : To verify the functionality of 'Decrement Field' for quantity box in
    // the
    // Product Details Page.
    @Test
    public void decreaseQuantity() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnQuntyDownButton();
            // update
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 49 : To verify the display of 'Similar Products' carousels in the Product
    // Details Page.

    @Test
    public void verifySimilarProducts() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isSimilarProducts(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 50 : To verify the functionality of products in carousels of 'Similar
    // Products' component in the Product Details Page.
    @Test
    public void similarProductsLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnSimilarProducts();
            // update
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 51 : To verify the display of 'Recently Viewed' carousels in the Product
    // Details Page.

    @Test
    public void verifyRecentlyViewed() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isRecentlyViewed(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 52 : To verify the functionality of products in carousels of 'Recently
    // Viewed' component in the Product Details Page.
    @Test
    public void verifyRecentlyViewedProductsLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnRecentlyViewedPod();
            // update
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 53 : To verify the display of 'Back To Top' link in the Product Details
    // Page.
    @Test
    public void verifyBackToTop() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isBackToTop(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 54 : To verify the functionality of 'Back To Top' link in the Product
    // Details
    // Page.
    @Test
    public void backToTopLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnBackToTopButton();
            // update
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 55 : To verify the display of 'Overview' of the product in the Product
    // Details Page.
    @Test
    public void verifyProductOverview() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isProductOverview(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 56 : To verify the display of 'Warranty' details in the Product Details
    // Page.
    @Test
    public void verifyWarrantyDetails() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            testcase.assertTrue(ProductDetailPage.isWarranty(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 57 : To verify the functionality of 'Warranty' details in the Product
    // Details
    // Page.
    @Test
    public void productWarrantyDetails() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnProductWarrantyDetails();
            // update
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

    // 58 : To verify the functionality of 'View Full Sumitomo Warranty' details
    // in
    // the Product Details Page.
    @Test
    public void viewFullSumitomoWarrantyLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(2);
            HomePage.clickOnTires();
            SeleniumUtils.wait(3);
            HomePage.clickOnshopByVehicle();
            SeleniumUtils.wait(5);
            ProductDetailPage.clickOnAnyTires();
            SeleniumUtils.wait(3);
            ProductDetailPage.clickOnViewFullSumitomoWarranty();
            // update
            testcase.assertTrue(ProductDetailPage.isAddToCart(), "System should display the Brand Name",
                    "System should not display the Brand Name");

            testcase.pass("System should display the Brand Name");
        } catch (Exception e)
        {
            testcase.error("System should not display the Brand Name", e);
            e.printStackTrace();
        }
    }

}
