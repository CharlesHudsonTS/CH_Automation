package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class LoginPage implements FileConstants
{
    public static boolean isEmailTextbox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Email textbox is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isMyAccount() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MY_ACCOUNT_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("My account link is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isPasswordTextbox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_TEXTBOX));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Password textbox is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isSignInButton() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, SIGN_IN_BUTTON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Sign In button is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isKeepMeLoggedInBox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, KEEP_ME_LOGGED_IN));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Keep me logged in check box is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isForgotUsernameLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_USERNAME_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Forgot Username or Password link is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isForgotPasswordLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PWD_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Forgot Username or Password link is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isCreateAccountLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, CREATE_AN_ACCOUNT_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Create account link is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isFacebookIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FACEBOOK_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Facebook icon is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isTwitterIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, TWITTER_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Twitter icon is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isGoogleIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, GOOGLE_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Google icon is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isYahooIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, YAHOO_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Yahoo icon is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isAOLIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, AOL_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("AOL icon is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isLinkedInIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, LINKED_IN_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("LinkedIn icon is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isCancelBtnInPopup() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_CANCLE_BUTTON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System should display cancle button");
        return flag;
    }

    public static boolean isSubmitBtnInPopup() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_SUBMIT_BUTTON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System should display submit button");
        return flag;
    }

    public static boolean isNotificationMsg() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_NOTIFICATION_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System should display notification message");
        return flag;
    }

    public static boolean isMsgInPopup() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_INSTRUMENTAL_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System should display notification message");
        return flag;
    }

    public static boolean isErrorMsg() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_ERROR_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System should display error message");
        return flag;
    }

    public static void clickCreateAccountLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, CREATE_AN_ACCOUNT_LINK));
        System.out.println("Create account link is clicked in Sign In flyout");
    }

    public static void clickKeepMeLoggedIn() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, KEEP_ME_LOGGED_IN));
        System.out.println("keep me logged in check box is selected in Sign In flyout");
    }

    public static void clickSignOutLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(MY_ACCOUNT, SIGN_OUT_LINK));

    }

    public static void hoverOnSignOutLink() throws Exception
    {
        SeleniumUtils.onHover(ExcelProperty.getElementValue(SIGN_IN, SIGN_OUT_LINK));

    }

    public static void clickEmailTextbox() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX));
        System.out.println("Email address text box is clicked in Sign In flyout");
    }

    public static void clickPasswordTextbox() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_TEXTBOX));
        System.out.println("Password text box is clicked in Sign In flyout");
    }

    public static void clickSignInButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, SIGN_IN_BUTTON));
        System.out.println("Sign In button is clicked in Sign In flyout");
    }

    public static void clickForgotUsernameLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FORGOT_USERNAME_LINK));
        System.out.println("Forgot Password link is clicked in Sign In flyout");
    }

    public static void clickForgotPasswordLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PWD_LINK));
        System.out.println("Forgot Password link is clicked in Sign In flyout");
    }

    public static void clickOnTelephoneNo() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FORGET_USERNAME_TELEPHONE_NO_STATIC_TEXT));
        System.out.println("Telephone no link is clicked");
    }

    public static void closeForgotPwdPopup() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PWD_POPUP_CLOSE));
        System.out.println("Forgot Password popup  is closed in Sign In flyout");
    }

    public static void clickOnForgotUsernameCloseBtn() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FORGOT_USERNAME_CLOSE_BUTTON));
        System.out.println("Forgot username popup  is closed in Sign In flyout");
    }

    public static void clickFacebookIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FACEBOOK_ICON));
        System.out.println("Facebook icon is clicked in Sign In flyout");
    }

    public static void clickTwitterIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, TWITTER_ICON));
        System.out.println("Twitter icon is clicked in Sign In flyout");
    }

    public static void clickGoogleIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, GOOGLE_ICON));
        System.out.println("Google icon is clicked in Sign In flyout");
    }

    public static void clickYahooIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, YAHOO_ICON));
        System.out.println("Yahoo icon is clicked in Sign In flyout");
    }

    public static void clickAOLIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, AOL_ICON));
        System.out.println("AOL icon is clicked in Sign In flyout");
    }

    public static void clickLinkedInIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, LINKED_IN_ICON));
        System.out.println("LinkedIn icon is clicked in Sign In flyout");
    }

    public static void clickOnCancelBtn() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_CANCLE_BUTTON));
        System.out.println("System should cancel email address entered and close popup in Sign In Flyout");
    }

    public static void clickOnSubmitBtn() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_SUBMIT_BUTTON));
        System.out.println("System should submit email address entered in Sign In Flyout");
    }

    public static void enterEmailInTextbox(String random) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX), random);
        System.out.println("Email address is entered in email textbox in Sign In flyout");
    }

    public static void enterDataInEmailTextbox(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PWD_EMAIL_TEXTBOX), data);
        System.out.println("Data is entered in email textbox in Sign In flyout");
    }

    public static void enterPasswordInTextbox(String pwd) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_TEXTBOX), pwd);
        System.out.println("password is entered in password textbox in Sign In flyout");
    }

    public static void signInWithFields(String email, String password) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX), email);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_TEXTBOX), password);
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, SIGN_IN_BUTTON));
        System.out.println("Email address, Password is entered textboxes, Sign In button is clicked in Sign In flyout");
    }

    public static String keepMeLoggedInCheckbox() throws Exception
    {
        System.out.println("value in email textbox is returned in Sign In flyout");
        return SeleniumUtils.getAttributes(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX), "value");
    }

    public static boolean isWarningMessage() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, WARNING_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Warning message for 5 unsuccessful logins is displayed in Sign In flyout");
        return flag;
    }

    public static void clickRestoreYourAccountLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, RESTORE_YOUR_ACC_LINK));
        System.out.println("Restore Your Account link is clicked in Sign In flyout");
    }

    public static boolean isForgetPwdDetailsInPopup()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(FORGET_PASSWORD_STATIC_TEXT));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PWD_EMAIL_TEXTBOX));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_SUBMIT_BUTTON));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_CANCLE_BUTTON));
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_INSTRUMENTAL_MESSAGE));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Warning message for 5 unsuccessful logins is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isusernameErrorMsg()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, USERNAME_ERROR_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Error message should be displayed");
        return flag;
    }

    public static boolean isPasswordErrorMsg()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_ERROR_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Error message should be displayed");
        return flag;
    }

    public static boolean isInvalidErrorMsg()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, INVALID_ERROR_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Error message should be displayed");
        return flag;
    }

    public static boolean isdisplayedSocialMediaicons()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FACEBOOK_ICON));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, TWITTER_ICON));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, AOL_ICON));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, LINKED_IN_ICON));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, GOOGLE_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Social media icons should be displayed");
        return flag;
    }

    public static boolean verifyForgotUserTextInPopup()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(FORGET_USERNAME_STATIC_TEXT));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Clicking on forget email should navigate to Forget email popup");
        return flag;
    }

    public static boolean verifyForgetUserDetailsInPopup()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(FORGET_USERNAME_STATIC_TEXT));
            flag = SeleniumUtils
                    .PageSourceContains(PropertyUtil.getStaticText(FORGET_USERNAME_INSTRUCTION_STATIC_TEXT));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(FORGET_USERNAME_CONTACT_US_STATIC_TEXT));
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGET_USERNAME_TELEPHONE_NO_STATIC_TEXT));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, FORGOT_USERNAME_CLOSE_BUTTON));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Clicking on forget email should navigate to Forget email popup");
        return flag;
    }

    public static boolean verifyDilogWindowInPopup()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(FORGOT_PASSWORD_CONTACTNO_DILOG_WINDOW));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Dilog window popup is displayed");
        return flag;
    }

    public static boolean isDisplayedMyAccount() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(SIGN_IN, DISPLAY_MYACCOUNT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("My account is displayed in Sign In flyout");
        return flag;
    }

}
