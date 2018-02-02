package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class BrandLineDetailsPage implements FileConstants
{
    public static void clickTiresDropDown(String data) throws Exception
    {
        SeleniumUtils.dropDownByVisibleText(ExcelProperty.getElementValue("", ""), data);
    }

    public static void clickBrand(String data) throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", data));
    }

    public static void clickSuitableTire(String data) throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", data));
    }

    public static boolean isBrandTitle() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isRatingsReviews() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;

    }

    public static boolean isTireSizes() throws Exception
    {
        boolean flag = false;

        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isYMME() throws Exception
    {
        boolean flag = false;

        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void clickShopThisLine() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static boolean isYMMEText() throws Exception
    {
        String element = PropertyUtil.getStaticText(" ");
        boolean flag = false;

        try
        {
            flag = SeleniumUtils.PageSourceContains(element);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void clickLicensePlateNumber() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickAllSizes() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickParticularTireSize() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickTireSize() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickBackToTopLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static boolean isYMMEBelowText() throws Exception
    {
        String element = PropertyUtil.getStaticText(" ");
        String element1 = PropertyUtil.getStaticText(" ");
        String element2 = PropertyUtil.getStaticText(" ");
        boolean flag = false;

        try
        {
            flag = SeleniumUtils.PageSourceContains(element);
            flag = SeleniumUtils.PageSourceContains(element1);
            flag = SeleniumUtils.PageSourceContains(element2);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isFooterSection() throws Exception
    {
        boolean flag = false;

        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void clickRatingsAndReviews() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static boolean isNotFitTires() throws Exception
    {
        boolean flag = false;

        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isFitTires() throws Exception
    {
        boolean flag = false;

        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isNoVehicleWarningMessage() throws Exception
    {
        return SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
    }

    public static boolean isWarningMessage() throws Exception
    {
        return SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
    }

}
