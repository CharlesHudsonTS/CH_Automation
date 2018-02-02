package com.ch.ta.desktopPages;

import org.testng.Assert;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class YMMEPage implements FileConstants
{

    public static boolean isShopByVehicleDefault() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_SHOP_BY_VECHICLE1));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Shop by vehicle");
        return flag;

    }

    public static boolean isMakeTextBoxDefault() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, MAKE_TEXT_BOX1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, YEAR_TEXT_BOX1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, MODEL_TEXT_BOX1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, SUBMODEL_TEXT_BOX1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BUTTON1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, LICENCE_PLATE_NUMBER1));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Make text box");
        return flag;

    }

    public static void ClickMakeSelectAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, MAKE_ACCORDANT1), 200);
    }

    public static void ClickMakeSelect() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_MAKE1), 200);
    }

    public static void ClickYearSelectAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, YEAR_ACCORDANT), 200);

    }

    public static void ClickYearSelect() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_YEAR1), 200);

    }

    public static void ClickModelSelectAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, MODEL_ACCORDANT), 200);
    }

    public static void ClickModelSelect() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_MODEL1));
    }

    public static void ClickSubModeSelectAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SUBMODEL_ACCORDANT), 200);
    }

    public static void ClickSubModelSelect() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_SUBMODEL1));
    }

    public static void ClickShopButton() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BUTTON1), 200);
    }

    public static boolean isconfirmyourtiresize() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, CONFIRM_YOUR_TIRE_SIZE));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Confirm Tire Size tab");
        return flag;

    }

    public static boolean isEnterYourvehicleSubmodel() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, ENTER_YOUR_VEHICLE_SUBMODEL1));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Error Msg");
        return flag;

    }

    public static void ClickLicensePlateNumber() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, LICENCE_PLATE_NUMBER1), 200);
    }

    public static void ClickStateAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, LICENSE_PLATE_ACCORDANT1), 200);
    }

    public static void ClickStateSelection() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, STATE_TAB1), 200);
    }

    public static void ClickLicensePlateValue() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(HOME_PAGE, LICENSE_PLATE_BOX1), "12345SS");
    }

    public static void ClickShopButtonLicense() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BUTTON_LICENSE1), 100);
    }

    public static boolean isShopByTireSizeDisplay() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, SIZE_WIDTH1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, SIZE_RATIO1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, SIZE_DIAMETER1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, SIZE_REARLINK1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, SIZE_SHOPBUTTON1));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Shop by tire size tabs");
        return flag;

    }

    public static void ClickShopByTireSize() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TYRE_TAB1), 200);
    }

    public static void ClickWidthAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, WIDTH_ACCORDANT1), 200);
    }

    public static void ClickWidthTab() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, WIDTH_TAB1), 200);
    }

    public static void ClickRatioAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, RATIO_ACCORDANT), 200);
    }

    public static void ClickRatioTab() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, RATIO_TAB1), 200);
    }

    public static void ClickDiamaeterAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, DIAMETER_ACCORDANT), 200);
    }

    public static void ClickDiameterTab() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, DIAMETER_TAB1), 70);
    }

    public static void ClickShopTyreBySizeShopButton() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BUTTON_SIZE), 200);
    }

    public static void ClickAddDifferentRearTireSizebutton() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, REAR_LINK1), 200);
    }

    public static void ClickRearWidthAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, REAR_WIDTH_ACCORDANT1), 200);
    }

    public static void ClickRearWidthTab() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, REAR_WIDTH1), 200);
    }

    public static void ClickRearRatio() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, REAR_RATIO1), 200);
    }

    public static void ClickRearDiameter() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, REAR_DIAMETER1), 200);
    }

    public static void ClickRearRemove() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, REAR_REMOVE1), 200);
    }

    public static boolean isStateTextBoxDisplayed() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLY_STATE_TESTBOX1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLY_LICENCE_PLATE1));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display state text box");
        return flag;

    }

    public static boolean isShopButtonLicensePlate() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BUTTON_LICENSE1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, MMYE_LINK1));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Shop Button");
        return flag;

    }

    public static void clickOnYYMEBackButton() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, MMYE_LINK1), 200);
    }

    public static void ClickMakeSearchBox() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(HOME_PAGE, MAKE_SEARCH), "FORD");
    }

    public static void clickOnFord() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, FORD_PATH), 200);
    }

    public static void EnterYearSearchBox() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(HOME_PAGE, YEAR_SEARCH), "1999");
    }

    public static void clickOnYear() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, YEAR_PATH), 200);
    }

    public static void EnterMakeSearchBox1() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(HOME_PAGE, MAKE_SEARCH), "BMW");
    }

    public static void clickOnBmw() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, BMW_PATH), 200);
    }

    public static void EnterYearSearchBox1() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(HOME_PAGE, YEAR_SEARCH), "2013");
    }

    public static void clickOnYear1() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, YEAR_PATH1), 200);
    }

    public static void ClickModelBmw() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, MODEL_BMW), 200);
    }

    public static void ClickModelAlfaRomeo() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, MODEL_ALFA_ROMEO), 200);
    }

    public static boolean isLicensePlateMsg() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, LICENSE_PLATE_MSG1));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Error Msg");
        return flag;

    }

    public static void ClickAllTireMakeTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, ALL_TIRE_MAKE_TAB));
    }

    public static void ClickAllTireYearTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, ALL_TIRE_YEAR_TAB));
    }

    public static void ClickAllTireModelTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, ALL_TIRE_MODEL_TAB));
    }

    public static void ClickAllTireSubModelTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, ALL_TIRE_SUBMODEL_TAB));
    }

    public static void ClickBmwModelTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, BMW_MODEL_TAB));
    }

    public static void clickOnKnowledgeCenter() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        System.out.println("Click on knowledge center in menu");
    }

    public static void isDisplayedMiniGurage()
    {
        // TODO Auto-generated method stub

    }
}
