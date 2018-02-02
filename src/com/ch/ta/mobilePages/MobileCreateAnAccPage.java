package com.ch.ta.mobilePages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MobileCreateAnAccPage implements FileConstants{
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
	public static boolean isMobileSiteLogoCreateAccount() throws Exception {
		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT , M_SITE_LOGO_CREATE_ACCOUNT));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Site logo is displayed in create account page");
		return flag;
	}
	public static boolean benefitsofMobileCreateAcct() throws Exception {
		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT,M_ENJOY_BENEFITS));
			flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT,M_LISTOF_BENEFITS));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Title and static text is displayed in create account page");
		return flag;
	}
	public static boolean isCreateAccWithEmailButton() throws Exception {
		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT,M_DISPLAY_CREATE_ACCOUNT));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Title and static text is displayed in create account page");
		return flag;
}
	 public static void isDisplaySocialIcons()throws Exception{
	    	SeleniumUtils.javaScriptExecutorDown("400");
	    }
	 public static boolean isFacebookIcon() throws Exception {
			boolean flag = false;
			try {
				flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT, M_FACEBOOK_ICON));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Facebook icon is displayed in create account page");
			return flag;
		}
	 public static boolean isTwitterIcon() throws Exception {
			boolean flag = false;
			try {
				flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT, M_TWITTER_ICON));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Twitter icon is displayed in create account page");
			return flag;
		}
	 public static boolean isInstagramIcon() throws Exception {
			boolean flag = false;
			try {
				flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT, M_INSTAGRAM_ICON));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Instagram icon is displayed in create account page");
			return flag;
		}

		public static boolean isWordpressIcon() throws Exception {
			boolean flag = false;
			try {
				flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT, M_WORDPRESS_ICON));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Wordpress icon is displayed in create account page");
			return flag;
		}
		public static void clickFacebookIcon()throws Exception{
			SeleniumUtils.click(ExcelProperty.getElementValue(M_CREATE_ACCOUNT, M_CLICKON_FACEBOOK_LINK));
		}
		public static void clickTwitterIcon()throws Exception{
			SeleniumUtils.click(ExcelProperty.getElementValue(M_CREATE_ACCOUNT, M_CLICKON_TWITTER_LINK));
		}
		public static void clickCreateAccWithEmailButton()throws Exception{
			SeleniumUtils.click(ExcelProperty.getElementValue(M_CREATE_ACCOUNT, M_CLICKON_CREATE_ACC_WITH_EMAIL));
		}
		public static boolean isEmailAddressBox()throws Exception {
			boolean flag = false;
			try {
				flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(M_CREATE_ACCOUNT, M_DISPLAY_EMAIL_ADDRESS));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Email Address box is displayed in create account page");
        return flag;
    }
}