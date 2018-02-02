package com.ch.ta.mobilePages;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MobilePredictiveSearchPage implements FileConstants
{
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

    public static void clickSearchTextBox() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(PREDICTIVE_SEARCH, HEADER_LOGO));

    }

}
