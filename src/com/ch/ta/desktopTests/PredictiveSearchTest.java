package com.ch.ta.desktopTests;

import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.PredictiveSearchPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

public class PredictiveSearchTest extends AbstractTestCaseReport implements FileConstants
{
    // To verify the display of 'Search' icon in top right of the Homepage.
    // To verify the functionality of 'Search' icon in top right of the
    // Homepage.
    @Test
    public void verifySearchIconTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifyGlobalSearch(), "Global search icon is displayed",
                        "Global search icon is not displayed");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                testcase.assertTrue(PredictiveSearchPage.verifySearchTextBox(),
                        "Search text box is displayed in Search component",
                        "Search text box is not displayed in Search component");
                testcase.pass("Display & functionality of Search icon in Global header");
                break;
            } catch (Exception e)
            {
                testcase.retry("Display & functionality of Search icon in Global header", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // To verify the display of 'Search' component on clicking search icon in top right of the Homepage.
    @Test
    public void verifySearchCompTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                testcase.assertTrue(PredictiveSearchPage.verifySearchComponents(),
                        "Search components should be displayed",
                        "Search components should not be displayed");
                testcase.assertEquals("RECENT SEARCHES", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.assertEquals("POPULAR SEARCHES", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.assertEquals("KNOWLEDGE", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.pass("Display of search component");
                break;
            } catch (Exception e)
            {
                testcase.retry("Display of search component", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the display and functionality of close icon 'X' in 'Search' component.
    @Test
    public void closeXIconSearchComponent() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                // navigate to some page 
                String title1 = DriverFactory.getDriver().getTitle();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickXSearchIcon();
                SeleniumUtils.wait(5);
                // assertion for returning back to same page
                String title2 = DriverFactory.getDriver().getTitle();
                testcase.assertEquals(title1, title2);
                testcase.pass("Display & functionality of close X icon Search component");
                break;
            } catch (Exception e)
            {
                testcase.retry("Display & functionality of close X icon Search component", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the 'Search' component on entering invalid search data in the 'Search' text box.
    @Test
    public void invalidSearchData() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("woogity woogity");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchButton();
                SeleniumUtils.wait(5);
                testcase.assertEquals("No results found, but here are some other ways to search:", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.assertTrue(PredictiveSearchPage.verifySearchComponents(),
                        "Search components should be displayed",
                        "Search components should not be displayed");
                testcase.assertEquals("RECENT SEARCHES", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.assertEquals("POPULAR SEARCHES", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.assertEquals("KNOWLEDGE", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.assertTrue(PredictiveSearchPage.isShopByVehicle(), "Shop By Vehicle icon is displayed", "Shop By Vehicle icon is displayed");
                testcase.assertTrue(PredictiveSearchPage.isShopByBrand(), "Shop By Brand icon is displayed", "Shop By Brand icon is displayed");
                testcase.assertTrue(PredictiveSearchPage.isShopByTireType(), "Shop By Tire Type icon is displayed", "Shop By Tire Type icon is displayed");
                testcase.assertTrue(PredictiveSearchPage.isShopByDeals(), "Shop By Deals icon is displayed", "Shop By Deals icon is displayed");
                testcase.pass("Display of No Search results page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Display of No Search results page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of 'Shop By Vehicle' icon in 'No Results found' page of 'Search' component.
    @Test
    public void shopByVehicleIcon() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("woogity woogity");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchButton();
                SeleniumUtils.wait(5);
                testcase.assertEquals("No results found, but here are some other ways to search:", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                PredictiveSearchPage.clickShopByVehicleIcon();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Navigated to Shop By Vehicle page", "Not navigated to Shop By Vehicle page");
                testcase.pass("Navigation to Shop By Vehicle landing page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Navigation to Shop By Vehicle landing page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of 'Shop By Brand' icon in 'No Results found' page of 'Search' component.
    @Test
    public void shopByBrandIcon() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("woogity woogity");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchButton();
                SeleniumUtils.wait(5);
                testcase.assertEquals("No results found, but here are some other ways to search:", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                PredictiveSearchPage.clickShopByBrandIcon();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Navigated to Shop By Brand page", "Not navigated to Shop By Brand page");
                testcase.pass("Navigation to Shop By Brand landing page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Navigation to Shop By Brand landing page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of 'Shop By Tire Type' icon in 'No Results found' page of 'Search' component.
    @Test
    public void shopByTireTypeIcon() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("woogity woogity");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchButton();
                SeleniumUtils.wait(5);
                testcase.assertEquals("No results found, but here are some other ways to search:", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                PredictiveSearchPage.clickShopByTireTypeIcon();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Navigated to Shop By Vehicle page", "Not navigated to Shop By Vehicle page");
                testcase.pass("Navigation to Shop By Tire Type landing page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Navigation to Shop By Tire Type landing page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of 'Shop By Deals' icon in 'No Results found' page of 'Search' component.
    @Test
    public void shopByDealsIcon() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("woogity woogity");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchButton();
                SeleniumUtils.wait(5);
                testcase.assertEquals("No results found, but here are some other ways to search:", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                PredictiveSearchPage.clickShopByDealsIcon();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Navigated to Shop By Vehicle page", "Not navigated to Shop By Vehicle page");
                testcase.pass("Navigation to Shop By Deals landing page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Navigation to Shop By Deals landing page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the predictive search on entering a query in search text box of 'Search' component .
    @Test
    public void predictiveSearchTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("services");
                SeleniumUtils.wait(5);
                String suggestion1 = SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
//                String suggestion2 = SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
                if (suggestion1.contains("services"))
                {
                    testcase.pass("Predictive search on entering a search query");
                }
                break;
            } catch (Exception e)
            {
                testcase.retry("Predictive search on entering a search query", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the display of  'Search' component on entering a query in search text box of 'Search' component .
    @Test
    public void searchComponentSearchResults() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("services");
                SeleniumUtils.wait(5);
                testcase.assertEquals("PRODUCTS", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.assertEquals("KNOWLEDGE", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                    testcase.pass("Search component for Predictive search results");
                break;
            } catch (Exception e)
            {
                testcase.retry("Search component for Predictive search results", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of  products in carousels of 'Search' component on searching for a query.
    @Test
    public void clickAnyProductSearchResults() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("services");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickFirstSuggestedProduct();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Navigated to PDP", "Not navigated to PDP");
                testcase.pass("functionality of  products in carousels of 'Search' component on searching for a query");
                break;
            } catch (Exception e)
            {
                testcase.retry("functionality of  products in carousels of 'Search' component on searching for a query", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of 'View all ## results' link in products in carousels of 'Search' component on searching for a query.
    @Test
    public void clickViewAllProducts() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("services");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickViewAllProducts();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Other relted products are displayed", "Other relted products are not displayed");
                testcase.pass("functionality of 'View all ## results' link in products in carousels of 'Search' component on searching for a query");
                break;
            } catch (Exception e)
            {
                testcase.retry("functionality of 'View all ## results' link in products in carousels of 'Search' component on searching for a query", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of articles listed in 'Knowledge' section of 'Search' component on searching for a query.
    @Test
    public void clickAnyKnowledgeArticles() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("services");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickFirstSuggestedArticle();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Navigated to article page", "Not navigated to article page");
                testcase.pass("functionality of articles listed in 'Knowledge' section of 'Search' component on searching for a query.");
                break;
            } catch (Exception e)
            {
                testcase.retry("functionality of articles listed in 'Knowledge' section of 'Search' component on searching for a query.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of 'View all ## results' link in 'Knowledge' section of 'Search' component on searching for a query.
    @Test
    public void clickViewAllKnowledgeArticles() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("services");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickViewAllArticles();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Other related articles are displayed", "Other related articles are not displayed");
                testcase.pass("functionality of 'View all ## results' link in 'Knowledge' section of 'Search' component on searching for a query.");
                break;
            } catch (Exception e)
            {
                testcase.retry("functionality of 'View all ## results' link in 'Knowledge' section of 'Search' component on searching for a query.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the predictive search on entering a brand name in search text box of 'Search' component .
    @Test
    public void predictiveSearchBrandTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("Brand");
                SeleniumUtils.wait(5);
                String suggestion1 = SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
//                String suggestion2 = SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
                if (suggestion1.contains("Brand"))
                {
                    testcase.pass("Predictive search on entering a Brand name");
                }
                break;
            } catch (Exception e)
            {
                testcase.retry("Predictive search on entering a Brand name", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
    // To verify the display of  'Search' component on entering a brand name in search text box of 'Search' component .
    @Test
    public void searchComponentForBrands() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("brand");
                SeleniumUtils.wait(5);
                testcase.assertEquals("PRODUCTS", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                testcase.assertEquals("BRANDS", SeleniumUtils.getText(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)));
                    testcase.pass("Search component for Predictive search results for brands");
                break;
            } catch (Exception e)
            {
                testcase.retry("Search component for Predictive search results for brands", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of  products in carousels of 'Search' component on searching for brands.
    @Test
    public void productCarouselsForBrands() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("sumitomo");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickFirstSuggestedProductBrand();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Navigated to PDP", "Not navigated to PDP");
                testcase.pass("functionality of  products in carousels of 'Search' component on searching for brands.");
                break;
            } catch (Exception e)
            {
                testcase.retry("functionality of  products in carousels of 'Search' component on searching for brands.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
    // To verify the functionality of 'View all ## results' link in products in carousels of 'Search' component on searching 'Brands'.
    @Test
    public void clickViewAllProductsforBrands() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("sumitomo");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickViewAllProducts();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Other relted products are displayed", "Other relted products are not displayed");
                testcase.pass("functionality of 'View all ## results' link in products in carousels of 'Search' component on searching 'Brands'.");
                break;
            } catch (Exception e)
            {
                testcase.retry("functionality of 'View all ## results' link in products in carousels of 'Search' component on searching 'Brands'.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    
 // To verify the functionality of  brands in carousels of 'Search' component on searching for brands.
    @Test
    public void clickAnyBrand() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                CommonUtils.TBCURL();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickSearchIcon();
                SeleniumUtils.wait(5);
                PredictiveSearchPage.enterSearchData("sumitomo");
                SeleniumUtils.wait(5);
                PredictiveSearchPage.clickFirstSuggestedArticle();
                SeleniumUtils.wait(5);
                testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO)), "Navigated to Brand Details page", "Not navigated to Brand Details page");
                testcase.pass("functionality of  brands in carousels of 'Search' component on searching for brands.");
                break;
            } catch (Exception e)
            {
                testcase.retry("functionality of  brands in carousels of 'Search' component on searching for brands.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
}
