package com.ch.ta.mobilePages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MobileHomePage implements FileConstants
{

    public static boolean isPromotionalContent() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(M_HOMEPAGE, M_HOMEPAGE_MYOFFER);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;

    }

    public static boolean isLearnmore() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(M_HOMEPAGE, M_HOMEPAGE_LEARNMORE);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;

    }

    public static boolean isSystemAlert() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(M_HOMEPAGE, M_HOMEPAGE_SYSTEM_ALERT);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;

    }

    public static void clickOnLearnMore() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_HOMEPAGE, M_HOMEPAGE_LEARNMORE));

    }

    public static void clickOnSystemAlertClose() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_HOMEPAGE, M_HOMEPAGE_SYSTEMALERT_CLOSE));

    }

    public static void clickOnMobileHamburgerMenu() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_HOMEPAGE, M_HAMBURGERMENU));

    }

    public static void clickOnClosePromoOffer() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_HOMEPAGE, M_HOMEPAGE_MYOFFER_CLOSE));

    }

}
