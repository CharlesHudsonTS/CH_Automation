package com.ch.ta.desktopPages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;
import com.ch.utils.Type;

public class CreateAnAccountPage implements FileConstants
{
    public static boolean isSiteLogoCreateAccount() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, SITE_LOGO_CREATE_ACCOUNT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Site logo is displayed in create account page");
        return flag;
    }

    public static boolean benefitsofCreateAccount() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, ENJOY_BENEFITS));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, LISTOF_BENEFITS));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Title and static text is displayed in create account page");
        return flag;
    }

    public static boolean isSignInLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, SIGN_IN_CREATE_ACC));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Sign In link is displayed in create account page");
        return flag;
    }

    public static void clickOnShopTiresByBrand() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(CREATE_ACCOUNT, CLICK_SHOPTIRES_BYBRAND), 200);

    }

    public static void clickOnShopTiresByType() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(CREATE_ACCOUNT, CLICK_SHOPTIRES_BYTYPE), 200);

    }

    public static void clickOnShopTiresBySize() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(CREATE_ACCOUNT, CLICK_SHOPTIRES_BYSIZE), 200);

    }

    public static void clickSignInLinkCreateAcc() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, SIGN_IN_LINK_CREATE_ACC_PAGE));
        System.out.println("Sign In link is clicked in create account page");
    }

    public static void clickCreateAccWithEmailButton() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, CREATE_ACC_WITH_EMAIL));
        System.out.println("Sign In link is clicked in create account page");
    }

    public static boolean isCreateAccWithEmailButton() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, CREATE_ACC_WITH_EMAIL));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Create Account with email button is displayed in create account page");
        return flag;
    }

    public static boolean isDisplayShopButton() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, DISPLAY_SHOP_BUTTON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Shop button is displayed in create account page");
        return flag;
    }

    public static boolean isFacebookIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, FACEBOOK_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Facebook icon is displayed in create account page");
        return flag;
    }

    public static boolean isTwitterIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, TWITTER_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Twitter icon is displayed in create account page");
        return flag;
    }

    public static void isDisplaySocialIcons() throws Exception
    {
        SeleniumUtils.javaScriptExecutorDown("400");
    }

    public static boolean isInstagramIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, INSTAGRAM_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Instagram icon is displayed in create account page");
        return flag;
    }

    public static boolean isWordpressIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, WORDPRESS_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Wordpress icon is displayed in create account page");
        return flag;
    }

    public static boolean isAOLIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, AOL_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("AOL icon is displayed in create account page");
        return flag;
    }

    public static boolean isLinkedInIcon() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, LINKED_IN_ICON));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("LinkedIn icon is displayed in create account page");
        return flag;
    }

    public static void clickFacebookIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, FACEBOOK_ICON));
        System.out.println("Facebook icon is clicked in create account page");
    }

    public static void clickTwitterIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, TWITTER_ICON));
        System.out.println("Twitter icon is clicked in create account page");
    }

    public static void clickGoogleIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, GOOGLE_ICON));
        System.out.println("Google icon is clicked in create account page");
    }

    public static void clickYahooIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, YAHOO_ICON));
        System.out.println("yahoo icon is clicked in create account page");
    }

    public static void clickAOLIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, AOL_ICON));
        System.out.println("AOL icon is clicked in create account page");
    }

    public static void clickLinkedInIcon() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, LINKED_IN_ICON));
        System.out.println("LinkedIn icon is clicked in create account page");
    }

    public static boolean isBackToTopLink() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACCOUNT, BACK_TO_TOP_LINK));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Back to top link is displayed in create account page");
        return flag;
    }

    public static void clickBackToTopLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, BACK_TO_TOP_LINK));
        System.out.println("Back to top link is clicked in create account page");
    }

    public static void clickOnCreateAccountLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(CREATE_ACCOUNT, CREATE_AN_ACCOUNT_LINK));
    }

    public static void onHoverSiteLogo() throws Exception
    {
        SeleniumUtils.onHover(ExcelProperty.getElementValue(CREATE_ACCOUNT, TIREAMERICA_LOGO));

    }

    public static boolean isTitleStaticTextCreateAccount() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(CREATE_ACC_TITLE));
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(CREATE_ACC_STATIC_TEXT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Title and static text is displayed in create account page");
        return flag;
    }
}
