package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class OrderHistoryPage implements FileConstants
{
    public static boolean isSearchOrdersBox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, SEARCH_ORDERS_BOX));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Order History page is displayed with Search Orders box.");
        return flag;
    }
    
    public static void enterSearchOrdersBox(String searchdata) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(MY_ACCOUNT, SEARCH_ORDERS_BOX), searchdata);
        System.out.println("Search data is entered in Search Orders box in Order History page.");
    }
    
    public static boolean isFilterbyVehicle() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, FILTER_BY_VEHICLE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Order History page is displayed with Filter By Vehicle.");
        return flag;
    }
    
    public static void clickFilterbyVehicle() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, FILTER_BY_VEHICLE));
        System.out.println("On clicking Filter By Vehicle, drop down should be displayed");
    }
    
    public static boolean isFilterbyDate() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, FILTER_BY_DATE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Order History page is displayed with Filter By Date.");
        return flag;
    }
    
    public static void clickFilterbyDate() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, FILTER_BY_DATE));
        System.out.println("On clicking Filter By Date, drop down should be displayed");
    }
    
    public static boolean isSortBy() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, SORT_BY_ORDER_HIS));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Order History page is displayed with Sort By.");
        return flag;
    }
    
    public static void clickSortBy() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, SORT_BY_ORDER_HIS));
        System.out.println("On clicking Sort By, drop down should be displayed");
    }
    
    public static boolean isSearchFilterSortStaticText() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(SEARCH_ORDERS));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(FILTER_BY_VEHICLE_ST));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(FILTER_BY_DATE_ST));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(SORT_BY_ST));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Order History page is displayed with Search Orders, Filter By Vehicle, Filter By Date, Sort By.");
        return flag;
    }
    
    public static boolean isOrderHisTableStaticText() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(ORDER_DATE));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(ORDER_NUMBER));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(ORDER_TOTAL));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(ORDER_STATUS));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(ITEMS_ORDERED));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Order History Table page is displayed with static text.");
        return flag;
    }
    
    
    public static void clickOrderNameLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, ORDER_NAME_LINK));
        System.out.println("On clicking Order name link, sysytem should navigate to order Details page.");
    }
    
    public static boolean isOrderDetailsStaticText() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(YOUR_ORDER_STATIC_TEXT));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, TRACKING_NUMBER));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Order Details page is displayed with static text and Tracking number.");
        return flag;
    }
    
    public static boolean isOrderDetailsSections() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(ORDER_DETAILS));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(SHIPPING_DETAILS));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PAYMENT_INFO));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(ORDER_ITEMS));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(ORDER_SUMMARY));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Order History Table page is displayed with static text.");
        return flag;
    }
    
    
}
