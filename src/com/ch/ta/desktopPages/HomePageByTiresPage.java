package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class HomePageByTiresPage implements FileConstants
{

    public static void isShopByTiresSizeText()
    {
        // testcase.assertTrue(SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText("")));
        // testcase.assertTrue(SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText("")));
        // testcase.assertTrue(SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText("")));
        // testcase.assertTrue(SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText("")));
        System.out.println("check for Tires by size");
    }

    public static void clickWidth() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void selectWidth() throws Exception
    {

        try
        {
            // SeleniumUtils.javascriptexecutorDOwn150();
            // SeleniumUtils.click(ExcelProperty.getElementValue("",
            // TIRES_BY_SIZE_WIDTH));
            // SeleniumUtils.sendKeys(ExcelProperty.getElementValue("",
            // TIRES_BY_SIZE_WIDTH), "225");

            // SeleniumUtils.sendKeysById("ratiodropdwnbtn", "125");
        } catch (Exception e)
        {
            // SeleniumUtils.wait(2000);
            // SeleniumUtils.pageup();
            SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
            SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        }
    }

    public static void clickRatio() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void selectRatio() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));

    }

    public static void clickDiameter() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void selectDiameter() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void EnterDiameter() throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "17");
    }

    public static void EnterRatio() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "80");

    }

    public static void Enterwidth() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "145");

    }

    public static void enterInvalidDiameter() throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "62224");
    }

    public static void enterInvalidWidth() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "622");
    }

    public static void enterInvalidRatio() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "62");
    }

    public static void isFindMyTiresButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static boolean isASpot() throws Exception
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
        System.out.println("system Should display Find My Tires");
        return flag;

    }

    public static boolean isAddRearTireSizeLink() throws Exception
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
        System.out.println("system Should display Add Diffirent rear size");
        return flag;

    }

    public static void clickAddRearTiresLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickAndEnterRearWidth() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        try
        {
            // SeleniumUtils.javascriptexecutorDOwn150();
            SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            SeleniumUtils.wait(2000);
            SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        }

    }

    public static void selectRearWidth() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        try
        {

            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);
        } catch (Exception e)
        {
            // SeleniumUtils.pageup();
            SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        }

    }

    public static void selectRearRatio() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 200);

    }

    public static void selectRearDiameter() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));

    }

    public static void enterRearWidth() throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "115");
    }

    public static void enterRearRatio() throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "70");
    }

    public static void enterRearDiameter() throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "12");
    }

    public static void enterRearInvalidWidth() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "125");
    }

    public static void enterRearInvalidRatio() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "880");
    }

    public static void enterRearInvalidDiameter() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), "300");
    }

    public static void clickHideRearsizeText() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void checkTireImage() throws Exception
    {
        // testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("",
        // "")));
    }

    public static void checkSaticTextShopTiresByVehicleInBySize()
    {
        // testcase.assertTrue(SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText("")));
    }

    public static void shopTiresByVehicalButton() throws Exception
    {
        try
        {
            // SeleniumUtils.javascriptexecutorDOwn250();
            SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        } catch (Exception e)
        {
            SeleniumUtils.wait(5000);
            // SeleniumUtils.pageup();
            SeleniumUtils.click(ExcelProperty.getElementValue("", ""));

        }
    }

}
