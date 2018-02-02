package com.ch.ta.mobilePages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class MobileLoginPage implements FileConstants
{
    public static boolean verifySignInOrRegistration() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(M_SIGN_IN, M_HEADER_SIGNIN_REGISTRATION);
        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the SignIn/Registration");
        return flag;

    }

    public static boolean isusernameErrorMsg()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_USERNAME_ERROR_MESSAGE));
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
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_PASSWORD_ERROR_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Error message should be displayed");
        return flag;
    }

    public static boolean isKeepMeLoggedInBox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_KEEP_ME_LOGGED_IN));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Keep me logged in check box is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isCreateAccountLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_CREATE_AN_ACCOUNT_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Create account link is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isForgotUsernameLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_FORGOT_USERNAME_LINK));
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
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_FORGOT_PWD_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Forgot Username or Password link is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isCancelBtnInPopup() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_FORGOT_PWD_CLOSE_POPUP));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Forgot Password close popup is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isPasswordTextbox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_PASSWORD_TEXTBOX));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Password textbox is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isEmailTextbox() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_EMAIL_TEXTBOX));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Email textbox is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isSignInButton() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_SIGN_IN_BUTTON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Sign In button is displayed in Sign In flyout");
        return flag;
    }

    public static boolean isInvalidErrorMsg()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_SIGN_IN, M_INVALID_ERROR_MESSAGE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Error message should be displayed");
        return flag;
    }

    public static boolean verifyForgetPaswdTextInPopup()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(M_FORGET_PASSWORD_STATIC_TEXT));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Warning message is displayed in Sign In flyout");
        return flag;
    }

    public static boolean verifyForgetUserTextInPopup()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(M_FORGET_USERNAME_STATIC_TEXT));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Clicking on forget email should navigate to Forget email popup");
        return flag;
    }

    public static boolean isSubmitBtnInPopup()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(M_FORGET_PASSWORD_SUBMIT_BUTTON));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Submit button is displayed in forgot password popup");
        return flag;
    }

    public static boolean isForgetPwdEmailTextInPopup()
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(M_FORGET_PASSWORD_EMAIL_TEXT));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Clicking on forget email should navigate to Forget email popup");
        return flag;
    }

    public static void clickOnHamburgerMenu() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_CLICK_ON_HAMBURGER_MENU));
        System.out.println("System should click on hamburger menu");
    }

    public static void clickSignInOrRegistration() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_HEADER_SIGNIN_REGISTRATION));
        System.out.println("System should navigate to respective page");

    }

    public static void clickCreateAccountLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_CREATE_AN_ACCOUNT_LINK));
        System.out.println("Create account link is clicked in Sign In flyout");
    }

    public static boolean isTitleStaticTextCreateAccount() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(M_CREATE_ACC_TITLE));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(M_CREATE_ACC_STATIC_TEXT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Title and static text is displayed in create account page");
        return flag;
    }

    public static void enterEmailInTextbox(String random) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(M_SIGN_IN, M_EMAIL_TEXTBOX), random);
        System.out.println("Email address is entered in email textbox in Sign In flyout");
    }

    public static void enterDataInEmailTextbox(String data) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(M_SIGN_IN, M_FORGOT_PWD_EMAIL_TEXTBOX), data);
        System.out.println("Data is entered in email textbox in Sign In flyout");
    }

    public static void enterPasswordInTextbox(String pwd) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(M_SIGN_IN, M_PASSWORD_TEXTBOX), pwd);
        System.out.println("password is entered in password textbox in Sign In flyout");
    }

    public static void clickSignInButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_SIGN_IN_BUTTON));
        System.out.println("Sign In button is clicked in Sign In flyout");
    }

    public static void clickKeepMeLoggedIn() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_KEEP_ME_LOGGED_IN));
        System.out.println("keep me logged in check box is selected in Sign In flyout");
    }

    public static void clickForgotPasswordLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_FORGOT_PWD_LINK));
        System.out.println("Forgot Password link is clicked in Sign In flyout");
    }

    public static void clickSignOutLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_SIGN_OUT_LINK));
    }

    public static void signInWithFields(String email, String password) throws Exception
    {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(M_SIGN_IN, M_EMAIL_TEXTBOX), email);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(M_SIGN_IN, M_PASSWORD_TEXTBOX), password);
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_SIGN_IN_BUTTON));
        System.out.println("Email address, Password is entered textboxes, Sign In button is clicked in Sign In flyout");
    }

    public static void clickForgotUsernameLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_FORGOT_USERNAME_LINK));
        System.out.println("Forgot Password link is clicked in Sign In flyout");
    }

    public static void closeForgotPwdPopup() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_FORGOT_PWD_CLOSE_POPUP));
        System.out.println("Forgot Password POPUP is closed in Sign In flyout");
    }

    public static void clickOnMyAccount() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_SHOW_MY_ACCOUNT_LINK));
        System.out.println("Forgot Password link is clicked in Sign In flyout");
    }

    public static void clickOnSubmitBtn() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PASSWORD_SUBMIT_BUTTON));
        System.out.println("System should submit email address entered in Sign In Flyout");
    }

    public static void clickOnCancelBtn() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(M_SIGN_IN, M_SHOW_MY_ACCOUNT_LINK));
        System.out.println("Forgot Password link is clicked in Sign In flyout");
    }

    public static boolean verifyMyAccount() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(M_SIGN_IN, M_SHOW_MY_ACCOUNT_LINK);

        ExcelBean element2 = ExcelProperty.getElementValue(M_SIGN_IN, M_SHOW_MYACCOUNT_ACCOUNT_DETAILS);

        ExcelBean element3 = ExcelProperty.getElementValue(M_SIGN_IN, M_MYACCOUNT_MY_GARAGE);

        ExcelBean element4 = ExcelProperty.getElementValue(M_SIGN_IN, M_SHOW_MYACCOUNT_ORDER_HISTORY);

        ExcelBean element5 = ExcelProperty.getElementValue(M_SIGN_IN, M_SIGN_OUT_LINK);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);
            flag = SeleniumUtils.iSDisplayed(element5);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the my account");
        return flag;

    }

}
