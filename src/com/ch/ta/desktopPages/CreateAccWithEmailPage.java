package com.ch.ta.desktopPages;

import org.openqa.selenium.Keys;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class CreateAccWithEmailPage implements FileConstants
{

    public static boolean isTitleStaticTextCreateAccount() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(CREATE_ACC_TITLE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Title and static text is displayed in Create account with email page");
        return flag;
    }

    public static boolean isDisplayTireAmericaTerms() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_TIRE_AMERICA_TERMS));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Display Tire America Terms is displayed in Create account with email page");
        return flag;
    }

    public static boolean isDisplayKeepInContactTitle() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_KEEPIN_CONTACT))
                    && SeleniumUtils.iSDisplayed(
                            ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_SUBSCRIBE_MAIL_TEXT));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system should display Keep In Contact in Set Up Your Account Page");
        return flag;
    }

    public static boolean isStaticTextKeepInContact() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(KEEP_IN_CONTACT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Title and static text is displayed in Create account with email page");
        return flag;
    }

    public static void clickOnTireAmericaTerms() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICK_TIRE_AMERICA_TERMS));

    }

    public static void clickOnKeepInContactCheckBox() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICK_KEEP_IN_CONTACT_CHECKBOX));
    }

    public static boolean isDisplayTermsAndConditions() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(
                    ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_TERMS_AND_CONDITIONS));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Terms and conditons is displayed in Create account with email page");
        return flag;
    }

    public static void enterEmailAddress(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_EMAIL_ADDRESS),
                data + Keys.ENTER);

    }

    public static void enterConfirmEmailAddress(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_CONFIRM_EMAIL_ADDRESS),
                data + Keys.ENTER);

    }

    public static void clickOnPassword(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_PASSWORD),
                data + Keys.ENTER);

    }

    public static void clickOnConfirmPassword(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_CONFIRM_PASSWORD),
                data + Keys.ENTER);

    }

    public static void clickConfirmPassword() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_CONFIRM_PASSWORD));

    }

    public static boolean isDisplaySetupAccountDetails() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_EMAIL_ADDRESS))
                    && SeleniumUtils.iSDisplayed(
                            ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_CONFIRM_EMAIL_ADDRESS))
                    && SeleniumUtils
                            .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_PASSWORD))
                    && SeleniumUtils.iSDisplayed(
                            ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_CONFIRM_PASSWORD))
                    && SeleniumUtils
                            .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_ZIPCODE))
                    &&

                    SeleniumUtils.iSDisplayed(
                            ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_CREATEAN_ACCOUNT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Setup Your Account Details is displayed in Create account with email page");
        return flag;
    }

    public static boolean isDisplaySetupAccount() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_SETUP_ACCOUNT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Setup Your Account is displayed in Create account with email page");
        return flag;
    }

    public static boolean isEmailAddressBox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_ADDRESS_CREATE_ACC));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Email address textbox is displayed in Create account with email page");
        return flag;
    }

    public static boolean isPasswordBox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Password textbox is displayed in Create account with email page");
        return flag;
    }

    public static boolean isConfirmPasswordBox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(
                    ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Confirm Password textbox is displayed in Create account with email page");
        return flag;
    }

    public static void clickEmailAddressBox() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_ADDRESS_CREATE_ACC));
        System.out.println("Email Address textbox is clicked in Create account with email page");
    }

    public static void sendEmailAddressBox(String Data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_ADDRESS_CREATE_ACC),
                Data);
        System.out.println("Send email address");
    }

    public static void clickPasswordBox() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC));
        System.out.println("Password textbox is clicked in Create account with email page");
    }

    public static void clickConfirmPasswordBox() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC));
        System.out.println("Confirm Password textbox is clicked in Create account with email page");
    }

    public static void clickConfirmEmailAddress() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONF_EMAIL_ADDRESS_CREATE_ACC));
        System.out.println("Confirm Password textbox is clicked in Create account with email page");
    }

    public static void clickCreateAccWithEmailButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CREATE_ACC_WITH_EMAIL));
        System.out.println("Create Account with Email button is clicked in Create account with email page");
    }

    public static boolean isCreateYourAccBtn() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CREATE_YOUR_ACC_BUTTON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Create Account with Email button is displayed in Create account with email page");
        return flag;
    }

    public static boolean isCreatdZipCode() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ZIPCODE_CREATE_ACC));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Create account with zipcode is displayed in crearte account with email page.");
        return flag;
    }

    public static boolean isCreatdConfmEmail() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(
                    ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONF_EMAIL_ADDRESS_CREATE_ACC));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Create Account with Email button is displayed in Create account with email page");
        return flag;
    }

    public static boolean isSetUpUrSectiontext() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(SETUP_UR_SECTION_TITLE));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(EMAIL_ADDRESS_NOTE));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(PASSWORD_REQ));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("SetUp Your Account section is displayed in Create account with email page");
        return flag;
    }

    public static boolean isTellUsAbtSectionStaticText() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(TELL_US_ABT_URSELF_TITLE));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(TELL_US_ABT_URSELF_STATIC_TEXT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Tell Us about yourself section is displayed in Create account with email page");
        return flag;
    }

    public static void clickCreateYourAccBtn() throws Exception
    {
        SeleniumUtils.javaScriptExecutorDown("400");
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CREATE_YOUR_ACC_BUTTON));
        System.out.println("Create your account button is clicked in Create account with email page");
    }

    public static void clickAgreeTermsNConditions() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, AGREE_TERMS_N_COND));
        System.out.println("Tire America terms and conditions checkbox is selected in Create account with email page");
    }

    public static void CreateAccWithEmailPwd(String email, String password) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_ADDRESS_CREATE_ACC),
                email);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC),
                password);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC),
                password);
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CREATE_YOUR_ACC_BUTTON));
    }

    public static void enterEmailCreateAccEmail(String email) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_ADDRESS_CREATE_ACC),
                email);
    }

    public static void enterConfEmailCreateAccEmail(String Confemail) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONF_EMAIL_ADDRESS_CREATE_ACC),
                Confemail);
    }

    public static void enterPwdCreateAccEmail(String pwd) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC), pwd);
    }

    public static void enterConPwdCreateAccEmail(String conpwd) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC),
                conpwd);
    }

    public static void enterZipcodeAccEmail(String Zipcode) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ZIPCODE_CREATE_ACC), Zipcode);
    }

    public static void enterFirstName(String fname) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, FIRST_NAME), fname);
    }

    public static void enterLastName(String lname) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, LAST_NAME), lname);
    }

    public static boolean isTermsNConditionsLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, TERMS_N_COND_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void clickTermsNConditionsLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, TERMS_N_COND_LINK));
    }

    public static void clickShowPwdButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, SHOW_PWD_BUTTON));
    }

    public static void clickShowConfrmPwdButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, SHOW_CONFIRM_PWD_BUTTON));
    }

    public static boolean showLinkInCreateFrPass() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_SHOW_PWD));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean showLinkInCreateFrCofrmPass() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, SHOW_CONFIRM_PWD_BUTTON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void clickOnCheckBox() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, SELECT_CHECKBOX));

    }

    public static boolean displayUnCheckBox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, SELECT_CHECKBOX));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isDisplayPswdOneOrMoreChars() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEST_ONE_LETTER));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isDisplayCharsAndNumsPswd() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEAST_ONE_NUMBER));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isDisplayAtLeastEightChars() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEAST_EIGHT_CHARS));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isDisplayEraseOneChar() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(
                    ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_ATLEAST_EIGHT_CHARS));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isDisplayEraseAllNums() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_ATLEAST_ONE_NUMBER));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isDisplayEraseFullPswd() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_EMPTY_PASSWORD));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void eraseAllNumbers(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CHARS), data);
    }

    public static void eraseFullPswd(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CHARS), data);
    }

    public static void atLeastEightChars(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CHARS), data);
    }

    public static void eraseOneChar(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CHARS), data);
    }

    public static void CombinationOfCharsAndNumsPswd(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CHARS), data);
    }

    public static void OneOrMoreCharsPswd(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CHARS), data);
    }

    public static boolean displayPswdRequrs() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_PSWD_REQ_TITLE));
            flag = SeleniumUtils.iSDisplayed(
                    ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_ATLEAST_EIGHT_CHARS));
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_ATLEST_ONE_LETTER));
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_ATLEAST_ONE_NUMBER));
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_MATCH_CONFIRM));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void clickHidePwdButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, HIDE_PWD_BUTTON));
    }

    public static void clickHideConfrmPwdButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, HIDE_CONFIRM_PWD_BUTTON));
    }

    public static void clickOnPassword() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_SHOW_PWD));
    }

    public static void clickOnConfrmPassword() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_SHOW_CONFIRM_PWD));
    }

    public static boolean hideLinkInCreateFrPass() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_HIDE_PWD));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean hideLinkInCreateFrCofrmPass() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_HIDE_CONFIRM_PWD));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isKeepInContactLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, KEEP_IN_CONTACT_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void clickKeepInContactLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, KEEP_IN_CONTACT_LINK));
    }

    public static void clickOnKeepInContact() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, KEEP_IN_CONTACT_CHECK));
    }

    public static boolean isTellUsAbtSectionFields() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, FIRST_NAME));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, LAST_NAME));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ADDRESS_LINE1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ADDRESS_LINE2));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CITY));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, STATE));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ZIPCODE));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PHONE_NUM));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ALT_PHONE_NUM));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    public static void enterZipcodedata(String data) throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICK_ZIPCODE), data);
    }

    public static boolean passwordReqDisappeared() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_REQ));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
}
