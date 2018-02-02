package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class MyAccountPage implements FileConstants
{
    public static void hoverOnMyAccount() throws Exception
    {
        SeleniumUtils.onHover(ExcelProperty.getElementValue(MY_ACCOUNT, MY_ACCOUNT_LINK));
    }
    
    public static boolean isMyAccountLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, MY_ACCOUNT_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isSignOutLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, SIGN_OUT_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static void clickSignOutLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, SIGN_OUT_LINK));
    }
    
    public static void clickAccountDetailsLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, ACCOUNT_DETAILS_LINK_HOME));
    }
    
    public static void clickOrderHistoryLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, ORDER_HISTORY_LINK_HOME));
    }
    
    public static void clickAccountDetailsTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, ACCOUNT_DETAILS_TAB));
    }
    
    public static boolean isOrderHistoryTab() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, ORDER_HISTORY_TAB));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static void clickOrderHistoryTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, ORDER_HISTORY_TAB));
    }
    
    public static boolean isMyGarageTab() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, MY_GARAGE_TAB));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static void clickMyGarageTab() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, MY_GARAGE_TAB));
    }
    
    public static void clickOrderHstoryLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, ORDER_HISTORY_LINK_HOME));
    }
    
    public static void clickEditPersonalInfo() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, EDIT_PERSONAL_INFO));
    }
    
    public static void clickEditPasswordSecurity() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, EDIT_PASSWORD_SECURITY));
    }
    
    public static void clickEditCommunicationPreference() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, EDIT_COMMUNICATION_PREFERENCE));
    }

    public static void editPasswordFields(String currentpwd, String newpassword) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(MY_ACCOUNT, CURRENT_PWD_BOX), currentpwd);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(MY_ACCOUNT, NEW_PWD_BOX), newpassword);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(MY_ACCOUNT, CONFIRM_NEW_PWD_BOX), newpassword);
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, SAVE_NEW_PWD_BUTTON));
    }
    
    public static void cancelEditPwd() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, CANCEL_EDIT_PWD_BUTTON));
    }
    
    public static void clickMinimizePersonalInfo() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, MINIMIZE_PERSONAL_INFO));
    }
    
    public static void clickMinimizePasswordSecurity() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, MINIMIZE_PASSWORD_SECURITY));
    }
    
    public static void clickMinimizeCommunPref() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, MINIMIZE_COMMUNICATION_PREFERENCE));
    }
    
    public static void clickMinimizeMyInstallers() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, MINIMIZE_MY_INSTALLERS));
    }
    
    public static boolean isPersonalInfoSectionTitle() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PERSONAL_INFO_LABEL));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isPersonalInfoSectionLabels() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PERSONAL_INFO_NAME));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PERSONAL_INFO_ADDRESS));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PERSONAL_INFO_MOB_PHONE));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PERSONAL_INFO_ALT_PHONE));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PERSONAL_INFO_BDAY_MONTH));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isPersonalInfoNoData() throws Exception
    {
        boolean flag = false;
        try
        {
            // Need to be added depending on type of watermark
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isPasswordSecuritySectionTitle() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PASSWORD_SECURITY_LABEL));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isPasswordSecuritySectionLabels() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PASSWORD_SECURITY_USERNAME));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PASSWORD_SECURITY_PASSWORD));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isCommnPreferenceSectionTitle() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(COMMN_PREFERENCE_LABEL));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isCommnPreferenceSectionLabels() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(COMMN_PREFERENCE_REMINDERS));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(COMMN_PREFERENCE_PROMOTIONS));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isMyPrefereedInstallersSectionTitle() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(MY_PREFERED_INSTALLERS_LABEL));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isMyPrefereedInstallersList() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, MY_PREFERED_INSTALLERS_MAPS));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, MY_PREFERED_INSTALLERS_LIST1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, MY_PREFERED_INSTALLERS_LIST2));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static void clickAccordionInstaller1() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, ACCORDION_INSTALLER1));
    }
    
    public static boolean isRemoveInstallerButton() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(MY_ACCOUNT, INSTALLER_REMOVE_BUTTON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static void clickRemoveInstaller1() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, REMOVE_INSTALLER));
    }
}
