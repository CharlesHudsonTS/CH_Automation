package com.ch.ta.mobilePages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MobileHeaderFooterPage implements FileConstants {

	public static void clickHamburgerSearchMenu() throws Exception {

		SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER, M_HAMBURGER_SEARCH_MENU));
		System.out.println("System should navigate to respective page");

	}

	public static void clickCustomerServices() throws Exception {

		SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER, M_HEADER_CUSTOMER_SERVICES));
		System.out.println("System should expand the menu");

	}

	public static void clickTireMenu() throws Exception {

		SeleniumUtils.onHover(ExcelProperty.getElementValue(M_HEADER_FOOTER, M_HEADER_MAIN_NAV_TIRES));
		System.out.println("System should expand the option");

	}

	public static void clickFooterCustomerServices() throws Exception {

		SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER, M_FOOTER_CUSTOMER_SERVICES));
		System.out.println("System should expand the menu");

	}

	public static void clickFooterKnowledgeCenter() throws Exception {

		SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER, M_FOOTER_KNOWLEDGE_CENTER));
		System.out.println("System should expand the menu");

	}

	public static void clickFooterFinancingOption() throws Exception {

		SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER, M_FOOTER_FINANCING_OPTION));
		System.out.println("System should expand the menu");

	}
	
	public static void clickFooterTireInstallerProgram() throws Exception{
		
		SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER, M_FOOTER_TIRE_INSTALLER_PROGRAM));
		System.out.println("System should expand the menu");
	}
	
	public static boolean verifySignInOrRegistration() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(M_HEADER_FOOTER, M_HEADER_SIGNIN_REGISTRATION);

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

	public static void clickOnHumbergerMenu() throws Exception{
		
		SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER,M_CLICK_ON_HUMBERGER_MENU));
		System.out.println("System should expand the menu");
	}
public static void clickSignInOrRegistration() throws Exception{
		
		SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER,M_CLICKON_SIGN_IN));
		
	}
public static void clickCreateAccountLink() throws Exception
{
    SeleniumUtils.click(ExcelProperty.getElementValue(M_HEADER_FOOTER, CREATE_AN_ACCOUNT_LINK));
    System.out.println("Create account link is clicked in Sign In flyout");
}


}
