package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class ConfirmTireSizePage implements FileConstants
{
    public static void clickVinLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void VinTabData(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), data);
    }

    public static void clickCallToAction() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickBackLInk() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE, BACK_TO_HOME));

    }

    public static void clicTireSizeLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_LIST ));

    }

    public static void clicTireSize() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickNotTireSize() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickRearTireSize() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static boolean isRearTireSizeDropDowns() throws Exception
    {
        String element = PropertyUtil.getStaticText("");
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", ""));
            flag = SeleniumUtils.PageSourceContains(element);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;

    }

    public static void tireSizeFeatures(String data, String data1, String data2) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), data);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), data);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue("", ""), data);
        System.out.println("All aspects of tire size are entered");
    }

    public static void clickCustomerSizeResults() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));

    }

    public static void clickStaggeredFitment() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickFrontTires() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickRearTires() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickIconNearRearTire() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickAccordionNotTireSize() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickFindMyTireSize() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }

    public static void clickVehicleSelector() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
    }
    public static boolean isConfirmTireSizeDetailsPage() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,BACK_TO_HOME));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,CONFIRMATION_MSG));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,VEHICLE_INFO));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,STATIC_TEXT));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_LIST));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_ISNT_LISTED));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_HELP_IMAGE));
            

          
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying confirm size tire page");
        return flag;

    }
    public static boolean isMyTireSizeIsntDisplayed() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_ISNT_LISTED));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying MyTireSizeIsntListed tab");
        return flag;

    }
    
    public static void isMyTireSizeIsntListed() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_ISNT_LISTED ));
    }
    
    public static void isMytireWidthAccordant() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_WIDTH_ACCORDANT ));
    }
    public static void isMyTireWidthTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_WIDTH_TAB ));
    }
    public static void isMyTireRatioTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_RATIO_TAB ));
    }
    public static void isMyTireDiameterTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_DIAMETER_TAB));
    }
    public static void isWhatIsThisLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,WHAT_IS_THIS_LINK ));
    }
    public static void isCustomeSizeResultsButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,CUSTOM_SIZE_RESULTS ));
    }
    public static void isAddDiffRearTireSizeButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,ADD_DIFF_REAR_TIRE_SIZE ));
    }
    public static void ClickMyTireRearWidthAccordant() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_WIDTH_ACCORDANT ));
    }
    public static void ClickMyTireRearWidthTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_WIDTH_TAB ));
    }
    public static void ClickMyTireRearRatioTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_RATIO_TAB ));
    }
    public static void ClickMyTireRearDiameterTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_DIAMETER_TAB));
    }
    public static void ClickMyTireIsntListedAccordantclose() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_ACCORDANT_CLOSE));
    }
    public static void ClickDiffRearTireRemoveLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_REMOVE));
    }
    
    public static void ClickErrorMsgWidthAccordant() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,ERROR_MSG_WIDTH_ACCORDAIN ));
    }
    public static void ClickErrorMsgWidthTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,ERROR_MSG_WIDTH_TAB));
    }
    public static void ClickErrorMsgRAtioTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,ERROR_MSG_RATIO_TAB));
    }
    public static void ClickErrorMsgDiameterTAb() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,ERROR_MSG_DIAMETER_TAB));
    }
    public static void ClickErrorMsgShopButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,ERROR_MSG_SHOP_BUTTON));
    }
    
    

    public static boolean isMyTireSizeIsntListedTabs() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_WIDTH));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_RATIO));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_DIAMETER));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying MyTireSizeIsntListed tab links");
        return flag;

    }
    
    public static boolean isMyTireSizeIsntListedLinksVerify() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,ADD_DIFF_REAR_TIRE_SIZE));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,WHAT_IS_THIS_LINK));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,CUSTOM_SIZE_RESULTS));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying MyTireSizeIsntListed LINKS");
        return flag;

    }
    public static boolean isRearTireSizeLinksVerify() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,FRONT_LINK_NAME));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,REAR_LINK_NAME));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_WIDTH));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_RATIO));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_DIAMETER));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_REMOVE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying MyTireRearLinksTab LINKS");
        return flag;

    }
    public static boolean isWhatIsThisConfirmationMsg() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,CONFIRMATION_MSG_BOX));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying Confirmation Msg LINKS");
        return flag;

    }
    public static boolean isOneTireSizeLink() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_LIST));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying One tire size link");
        return flag;

    }
    
    public static boolean isAllTireSizeLink() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_LIST));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_LIST1));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying all tire size links");
        return flag;

    }
    
    
    public static boolean isTireLinkSideBySide() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_SIDE1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,TIRE_SIZE_SIDE2));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying tire size links side by side");
        return flag;

    }
    public static boolean isstaggeredfitmenttiresizelink() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,STAGGERED_FITMENT_LINK));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,LEARN_MORE_STAGGERED_LINK));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying staggeredfitment tire size links ");
        return flag;

    }
    public static void clickLearnMoreAboutStaggeredLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,LEARN_MORE_STAGGERED_LINK));
    }
    public static boolean isstaggeredfitmentlinkTextBox() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,STAGGERED_FITMENT_TEXTBOX));
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying staggeredfitment Text box ");
        return flag;

    }
    public static boolean isDiffRearTireRemoveLink() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,MY_TIRE_REAR_REMOVE));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying Remove Link");
        return flag;

    }
    public static boolean isErrorMsgDisplayedFrontTire() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,FRONT_TIRE_ERROR_MSG));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying Error Message");
        return flag;

    }
    public static boolean isErrorMsgDisplayedRearTire() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,REAR_TIRE_ERROR_MSG));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying Error Message");
        return flag;

    }
    public static boolean isWarningMsgDisplaying() throws Exception
    {

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CONFIRM_TIRE_SIZE,WARNING_MSG));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system is dispalying Warning Message");
        return flag;
    }
}

