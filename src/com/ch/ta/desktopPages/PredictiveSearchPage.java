package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class PredictiveSearchPage implements FileConstants
{
    public static void clickSearchIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static boolean verifySearchTextBox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the search box");
        return flag;
    }

    public static boolean verifySearchComponents() throws Exception
    {
        boolean flag = false;
        try
        {
            // search text box
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
            // Recent searches
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
            // Popular Searches
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
            // Knowledge
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the search compenents with image");
        return flag;
    }

    public static void clickXSearchIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static void enterSearchData(String keyword) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO), keyword);
    }

    public static void clickSearchButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static boolean isShopByVehicle() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the shop by vehicle icon in No search results page");
        return flag;
    }

    public static boolean isShopByBrand() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the shop by brand icon in No search results page");
        return flag;
    }

    public static boolean isShopByTireType() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the shop by tire type icon in No search results page");
        return flag;
    }

    public static boolean isShopByDeals() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the shop by Deals icon in No search results page");
        return flag;
    }

    public static void clickShopByVehicleIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static void clickShopByBrandIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static void clickShopByTireTypeIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static void clickShopByDealsIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static void clickFirstSuggestedProduct() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static void clickViewAllProducts() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static void clickFirstSuggestedArticle() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }

    public static void clickViewAllArticles() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }
    
    public static void clickFirstSuggestedProductBrand() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));
    }
}
