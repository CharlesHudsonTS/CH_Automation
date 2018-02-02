package com.ch.ta.desktopPages;

import org.openqa.selenium.Keys;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;

import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class HomePageMYMPage implements FileConstants
{

    public static boolean displayOfMakeYearAndModal() throws Exception
    {
        //
        // String element1 = PropertyUtil.getStaticText(MAKE_LABEL);
        // String element2 = PropertyUtil.getStaticText(YEAR_LABEL);
        // String element3 = PropertyUtil.getStaticText(MODEL_LABEL);
        String element4 = PropertyUtil.getStaticText("");
        ExcelBean element5 = ExcelProperty.getElementValue("", "");
        ExcelBean element6 = ExcelProperty.getElementValue("", "");
        ExcelBean element7 = ExcelProperty.getElementValue("", "");
        ExcelBean element8 = ExcelProperty.getElementValue("", "");
        // ExcelBean element9 = ExcelProperty.getElementValue("",
        // MYM_NEXT_BUTTON);
        // ExcelBean element10 = ExcelProperty.getElementValue("",
        // MYM_CANCEL_BUTTON);

        boolean flag = false;
        try
        {
            // flag = SeleniumUtils.PageSourceContains(element1);
            // flag = SeleniumUtils.PageSourceContains(element2);
            // flag = SeleniumUtils.PageSourceContains(element3);
            flag = SeleniumUtils.PageSourceContains(element4);
            flag = SeleniumUtils.iSDisplayed(element5);
            flag = SeleniumUtils.iSDisplayed(element6);
            flag = SeleniumUtils.iSDisplayed(element7);
            flag = SeleniumUtils.iSDisplayed(element8);
            // flag = SeleniumUtils.iSDisplayed(element9);
            // flag = SeleniumUtils.iSDisplayed(element10);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("display of make yeaar and modal and underlined in red line");
        return flag;
    }

    public static void clickOnMake() throws Exception
    {
        try
        {

            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        } catch (Exception e)
        {

            // SeleniumUtils.pageup();
            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        }
        System.out.println("click on breadcrumb in header part");
    }

    public static void clickOnValueOfMakeDropDown() throws Exception
    {

        // SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("",
        // MAKE_VALID_DATA1), 200);
        System.out.println("click on any value in make drop down");
    }

    public static void scrollDownOnValueOfMakeDropDown() throws Exception
    {
        System.out.println("scroll down in make drop down");
    }

    public static boolean displayThreeValuesOfMakeDropDown() throws Exception
    { // use
      // my
      // assertions

        // ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR,
        // MAKE_VALID_DATA1);
        // ExcelBean element2 = ExcelProperty.getElementValue(VEHICLESELECTOR,
        // MAKE_VALID_DATA2);
        // ExcelBean element3 = ExcelProperty.getElementValue(VEHICLESELECTOR,
        // MAKE_VALID_DATA3);

        boolean flag = false;
        try
        {
            // flag = SeleniumUtils.iSDisplayed(element1);
            // flag = SeleniumUtils.iSDisplayed(element2);
            // flag = SeleniumUtils.iSDisplayed(element3);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("display maximum three values in make drop down");
        return flag;

    }

    public static void clickOnYear() throws Exception
    {
        // SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR,
        // YEAR_DROP_DOWN_XPATH), 200);
        // SeleniumUtils.clickByCSSSelector(ExcelProperty.getElementValue(VEHICLESELECTOR,YEAR_DROP_DOWN));

    }

    public static void clickOnValueOfYearDropDown() throws Exception
    {
        // SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("",
        // YEAR_VALID_DATA1), 200);
        System.out.println("click on any value in Year drop down");
    }

    public static boolean displayThreeValuesOfYearDropDown() throws Exception
    {
        // ExcelBean element1 = ExcelProperty.getElementValue("",
        // YEAR_VALID_DATA1);
        // ExcelBean element2 = ExcelProperty.getElementValue("",
        // YEAR_VALID_DATA2);
        // ExcelBean element3 = ExcelProperty.getElementValue("",
        // YEAR_VALID_DATA3);

        boolean flag = false;
        try
        {
            // flag = SeleniumUtils.iSDisplayed(element1);
            // flag = SeleniumUtils.iSDisplayed(element2);
            // flag = SeleniumUtils.iSDisplayed(element3);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("display maximum three values in year drop down");
        return flag;

    }

    public static void clickOnModel() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        System.out.println("click on breadcrumb in header part");
    }

    public static void clickOnValueOfModelDropDown() throws Exception
    {
        // SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("",
        // MODEL_VALID_DATA1), 200);
        System.out.println("click on any value in Modal drop down");
    }

    public static boolean displayThreeValuesOfModalDropDown() throws Exception
    {
        // ExcelBean element1 = ExcelProperty.getElementValue("",
        // MODEL_VALID_DATA1);
        // ExcelBean element2 = ExcelProperty.getElementValue("",
        // MODEL_VALID_DATA2);
        // ExcelBean element3 = ExcelProperty.getElementValue("",
        // MODEL_VALID_DATA3);

        boolean flag = false;
        try
        {
            // flag = SeleniumUtils.iSDisplayed(element1);
            // flag = SeleniumUtils.iSDisplayed(element2);
            // flag = SeleniumUtils.iSDisplayed(element3);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("display maximum three values in model drop down");
        return flag;

    }

    public static void clickOnSubModal() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        System.out.println("click on breadcrumb in header part");
    }

    public static void clickOnValueOfSubModalDropDown() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        System.out.println("click on any value in SubModal drop down");
    }

    public static void typeMYMDropDown() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "Acura" + Keys.ENTER);

        Thread.sleep(5000);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "2016" + Keys.ENTER);

        Thread.sleep(5000);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "ILX" + Keys.ENTER);

    }

    public static boolean isLicensePlateNumber() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Licence Plate Numeber Text field");
        return flag;

    }

    public static void clickOnLicenceStateDropDown() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        System.out.println("click on any value in State drop down");
    }

    public static void clickOnFindMyTires() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        System.out.println("click on any value in State drop down");
    }

}
