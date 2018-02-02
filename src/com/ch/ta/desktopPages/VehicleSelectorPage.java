package com.ch.ta.desktopPages;

import org.openqa.selenium.Keys;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class VehicleSelectorPage implements FileConstants
{
    public static boolean isDisplayMontatebanner() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Montate banner is displayed");
        return flag;
    }

    public static boolean isDisplayProgressBar() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Progress bar is displayed");

        return flag;

    }

    public static boolean isDisplayGuestUserProgressBar() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Progress bar is displayed for guest user");
        return flag;

    }

    public static boolean isDisplayAspotSection() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("AspotSection should be displayed");
        return flag;

    }

    public static boolean isDisplayAspotSectionYMMEComponent() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("AspotSection YMME component should be displayed");
        return flag;

    }

    public static boolean isDisplayMakeOnProgressbar() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Make should be displayed");
        return flag;

    }

    public static void clickMakeOnProgressbar()
    {

        System.out.println("Make should be clickable");
    }

    public static boolean isDisplayVehicleSelectorLabel() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Vehicle selector label should be displayed");
        return flag;

    }

    public static void clickOnMake() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in make");
    }

    public static void clickOnValueOfMakeDropDown() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in make drop down");
    }

    public static void scrollDownOnValueOfMakeDropDown() throws Exception
    {
        System.out.println("scroll down in make drop down");
    }

    public static boolean displayThreeValuesOfMakeDropDown() throws Exception
    { // use my assertions

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");
        ExcelBean element2 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");
        ExcelBean element3 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("display maximum three values in make drop down");
        return flag;

    }

    public static void clickOnYear() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);

    }

    public static void clickOnValueOfYearDropDown() throws Exception
    {
        try
        {
            SeleniumUtils.wait(4);
            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
            System.out.println("click on any value in Year drop down");
        } catch (Exception e)
        {
            SeleniumUtils.wait(4);
            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
            SeleniumUtils.wait(4);
            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
            System.out.println("click on any value in Year drop down");
        }

    }

    public static boolean displayThreeValuesOfYearDropDown() throws Exception
    { // use my assertions
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");
        ExcelBean element2 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");
        ExcelBean element3 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("display maximum three values in year drop down");
        return flag;

    }

    public static void clickOnModel() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);

        System.out.println("click on breadcrumb in header part");
    }

    public static void clickOnValueOfModelDropDown() throws Exception
    {
        try
        {
            SeleniumUtils.wait(4);
            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        } catch (Exception e)
        {
            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 130);
            SeleniumUtils.wait(4);
            SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        }

        System.out.println("click on any value in Modal drop down");
    }

    public static boolean displayThreeValuesOfModals() throws Exception
    { // use my assertions
        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");
        ExcelBean element2 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");
        ExcelBean element3 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("display maximum three values in models");
        return flag;

    }

    public static void clickOnTrim() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);

        System.out.println("click on Trim in Progress bar part");
    }

    public static void clickOnValueOfTrimdisplayed() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in Trim displayd");
    }

    public static void typeMYMDropDown() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), "Acura" + Keys.ENTER);
        Thread.sleep(5000);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), "2016" + Keys.ENTER);
        Thread.sleep(5000);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), "ILX" + Keys.ENTER);
    }

    public static void inValidMakeMsg() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        SeleniumUtils.sendKeys((ExcelProperty.getElementValue(VEHICLESELECTOR, "")), "ABC21");
        Thread.sleep(5000);
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("Invalid Make Error message should be displayed");
    }

    public static void inValidYearMsg() throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), "ABC12");
        Thread.sleep(5000);
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("Invalid year Error message should be displayed");
    }

    public static void cleartext(String text) throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, text), 200);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(VEHICLESELECTOR, text), "");
        System.out.println("System should clear the text box");
    }

    public static void inValidModelMsg() throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), "ABC12");
        Thread.sleep(5000);
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("Model you entered is invalid please select from below ");

    }

    public static void inValidTrimMsg() throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), "ABC12");
        Thread.sleep(5000);
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("Trim you entered is invalid please select from below ");

    }

    public static boolean displayOfIdontKnowMyTrim() throws Exception
    {

        String element1 = PropertyUtil.getStaticText(null);
        String element2 = PropertyUtil.getStaticText(null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(element1);
            flag = SeleniumUtils.PageSourceContains(element2);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("display do you know your trim static content");
        return flag;

    }

    public static void backToMake() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("clicking on back to make should navigate to make page.");

    }

    public static void backToyear() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("clicking on back to make should navigate to year page.");

    }

    public static void backToModel() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("clicking on back to make should navigate to model page.");

    }

    public static void clickOnTireSize() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);

        System.out.println("click on tire section on progress bar");
    }

    public static void clickOnValueOfTireSizeDisplayed1() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in TireSize displayed");
    }

    public static void clickOnValueOfTireSizeDisplayed2() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on second value in TireSize displayed");
    }

    public static void clickOnMyTireIstListed() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on my tiresize isnt listed ");
    }

    public static boolean isMyTireIstListed() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("My tire size text listed should be displayed ");
        return flag;
    }

    public static boolean isConfirmYourSize() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Confirm you size should be displayed ");
        return flag;
    }

    public static boolean isConfirmYourSizeTagText() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Confirm you size tag text should be displayed ");
        return flag;

    }

    public static void clickOnBackToTrim() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on back to trim link");
    }

    public static void clickOnDifferentTireSize() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on different front and rear tire size link");

    }

    public static void clickOnValueOfWidthfront() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in TireSize width");
    }

    public static void clickOnValueOfDiameterfront() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in TireSize diameter");
    }

    public static void clickOnValueOfRatiofront() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in TireSize ratio");
    }

    public static void clickOnValueOfRatioRear() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in TireSize rear ratio");
    }

    public static void clickOnValueOfWidthRear() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in TireSize rear diameter");
    }

    public static void clickOnValueOfDaimeterRear() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on any value in TireSize rear diameter");
    }

    public static void clickOnSubmitBtn() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on submit button");
    }

    public static void clickOnBackToTrims() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on back to trims link");
    }

    public static boolean isRearTireSize() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Rear tire size text should be displayed ");
        return flag;

    }

    public static boolean isFrontTireSize() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Front tire size text should be displayed ");
        return flag;

    }

    public static void clickOnYourBestOutFit() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on your best out fit on progress bar");
    }

    public static boolean isHowDoYouDriveText() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("How do you drive your vehicle text should be displayed ");
        return flag;

    }

    public static boolean isNoOfResultsFound() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("No of compatable results shold be displayed");
        return flag;

    }

    public static void clickTiresReccomanded() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on tires recomamanded button");
    }

    public static boolean isDrivingPreferencesText() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Driving preferences shold be displayed");
        return flag;

    }

    public static boolean isDisplayOfVehicleAdded() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(VEHICLESELECTOR, "");

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Vehicle added shold be displayed");
        return flag;

    }

    public static void clickDrivePrefChoice1() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on drive preference choice1");
    }

    public static void clickDrivePrefChoice2() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on drive preference choice2");
    }

    public static void clickDrivePrefChoice3() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on drive preference choice3");
    }

    public static void clickDrivePrefChoice4() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on drive preference choice4");
    }

    public static void clickDrivePrefChoice5() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on drive preference choice5");
    }

    public static void clickBackToTireSize() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(VEHICLESELECTOR, ""), 200);
        System.out.println("click on back to tire size");
    }

    public static void isDisplayedMiniGurage()
    {
        // TODO Auto-generated method stub

    }

}