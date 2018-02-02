package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class HeaderFooterPage implements FileConstants
{
	
	 public static boolean verifyHeader() throws Exception
	    {
	        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER);

	        boolean flag = false;
	        try
	        {

	            flag = SeleniumUtils.iSDisplayed(element1);

	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        System.out.println(" System should display the Header section");
	        return flag;
	    }

    public static boolean verifyTireAmericaLogo() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TA_LOGO);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Tire America logo");
        return flag;
    }
    

    public static void clickTireAmericaLogo() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TA_LOGO));
        System.out.println("System should navigate to respective page");

    }

    public static boolean verifyPhoneNumber() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_PHONE_NUMBER);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Phone Number");
        return flag;

    }
    
    public static boolean verifyPhoneNumberToolTip() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_PHONE_NUMBER_TOOLTIP);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Phone Number");
        return flag;

    }

    public static void clickPhoneNumber() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_PHONE_NUMBER));

        System.out.println("System should navigate to respective page");

    }

    public static boolean verifyLiveChat() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LIVE_CHAT);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Live Chat");
        return flag;

    }

    public static void clickLiveChat() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LIVE_CHAT));
        System.out.println("System should navigate to respective page");

    }

    public static boolean verifyCustomerServices() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Customer Services");
        return flag;

    }

    public static void OnHoverCustomerServices() throws Exception
    {

        SeleniumUtils.onHover(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES));
        System.out.println("System should expand the menu");

    }

    public static boolean verifyCustomerServicesMenu() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES_CONTACT_US);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES_ORDER_STATUS);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES_RETURE_REPLACE);
        ExcelBean element4 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES_FAQ);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Customer Services menu");
        return flag;

    }

    public static void clickCustomerServicesContactUs() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES_CONTACT_US));
        System.out.println("System should navigate to respective page");

    }

    public static void clickCustomerServicesOrderStatus() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES_ORDER_STATUS));
        System.out.println("System should navigate to respective page");

    }

    public static void clickCustomerServicesReturnOrRefunds() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES_RETURE_REPLACE));
        System.out.println("System should navigate to respective page");
    }

    public static void clickCustomerServicesFAQ() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CUSTOMER_SERVICES_FAQ));
        System.out.println("System should navigate to respective page");
    }

    public static boolean VerifyFinancingOptions() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_FINANCING_OPTION);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Customer Services");
        return flag;

    }

    public static void clickFinancingOptions() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_FINANCING_OPTION));
        System.out.println("System should navigate to respective page");

    }

    public static boolean verifyLanguageOption() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LANGAUGE_LINK);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LANGAUGE_OPTION1);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LANGAUGE_OPTION2);
        ExcelBean element4 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LANGAUGE_OPTION3);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Language menu");
        return flag;

    }

    public static void OnHoverLanguageOption() throws Exception
    {

        SeleniumUtils.onHover(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LANGAUGE_LINK));
        System.out.println("System should navigate to respective page");

    }

    public static void clickSpanish() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LANGAUGE_OPTION1), 120);
        System.out.println("System should navigate to respective page");

    }

    public static void clickItalain() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_LANGAUGE_OPTION2), 120);
        System.out.println("System should navigate to respective page");

    }

    public static boolean verifySignInOrRegistration() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_SIGNIN_REGISTRATION);

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

    public static void clickSignInOrRegistration() throws Exception
    {

        SeleniumUtils.onHover(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_SIGNIN_REGISTRATION));
        System.out.println("System should navigate to respective page");

    }

    public static boolean verifyMyAccount() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MY_ACCOUNT_LINK);

        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MYACCOUNT_ACCOUNT_DETAILS);

        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MYACCOUNT_MY_GARAGE);

        ExcelBean element4 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MYACCOUNT_ORDER_HISTORY);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the my account");
        return flag;

    }

    public static void onHoverMyAccount() throws Exception
    {

        SeleniumUtils.onHover(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MY_ACCOUNT_LINK));
        System.out.println("System should expand the option");

    }

    public static void clickMyAccountAccountDetails() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MYACCOUNT_ACCOUNT_DETAILS),
                120);
        System.out.println("System should naviagte to respective page");

    }

    public static void clickMyAccontMyGarage() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MYACCOUNT_MY_GARAGE), 120);
        System.out.println("System should naviagte to respective page");

    }

    public static void clickMyAccountOrderHistory() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MYACCOUNT_ORDER_HISTORY),
                120);
        System.out.println("System should naviagte to respective page");

    }

    public static boolean verifyTireMenu() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MAIN_NAV_TIRES);

        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_SHOP_BY_VEHICLE);

        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_SHOP_BY_TIRE_SIZE);

        ExcelBean element4 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_SHOP_BY_BRAND);
        ExcelBean element5 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_SHOP_BY_TIRE_TYPE);

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
        System.out.println(" System should display the Tire options");
        return flag;

    }

    public static void onHoverTireMenu() throws Exception
    {

        SeleniumUtils.onHover(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MAIN_NAV_TIRES));
        System.out.println("System should expand the option");

    }

    public static void clickTireShopByVehicle() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_SHOP_BY_VEHICLE), 120);
        System.out.println("System should navigate to shop by vehicle page");

    }

    public static void clickTireShopByTireSize() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_SHOP_BY_TIRE_SIZE));
        System.out.println("System should navigate to shop by tire size");

    }

    public static void clickTireShopByBrand() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_SHOP_BY_BRAND));
        System.out.println("System should navigate to shop by brand");

    }

    public static void clickTireShopByTireType() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_SHOP_BY_TIRE_TYPE));
        System.out.println("System should navigate to shop by Tire Type");

    }

    public static boolean verifyTireOptionDeals() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_DEALS_ADD);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the deals add in tire menu option");
        return flag;

    }

    public static void clickTireOptionDeals() throws Exception
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_TIRE_DEALS_ADD));
        System.out.println("System should navigate to shop by brand");

    }

    public static boolean verifyKnowledgeCenter() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_KNOWLEDGE_CENTER);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the knowledge center");
        return flag;

    }

    public static void clickKnowledgeCenter() throws Exception
    {

        SeleniumUtils.javaScriptOnHover((ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_KNOWLEDGE_CENTER)), 200);
        System.out.println("System should navigate knowledge center");

    }

    public static boolean verifyDeals() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MAIN_NAV_DEALS);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Deals");
        return flag;

    }

    public static void clickDeals() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_MAIN_NAV_DEALS), 120);
        System.out.println("System should navigate Deals page");

    }

    public static boolean verifyInstallers() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_INSTALLERS);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the installers link");
        return flag;

    }

    public static void clickInstallers() throws Exception
    {

        SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_INSTALLERS), 200);
        System.out.println("System should navigate installers page");

    }

    public static boolean verifyGlobalSearch() throws Exception
    {
        // ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER,
        // HEADER_SEARCHBOX);

        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_SEARCHBOX_ICON);

        boolean flag = false;
        try
        {

            // flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the search box with image");
        return flag;

    }

    public static void enterGlobalSearch() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_SEARCHBOX_ICON), 200);
        // SeleniumUtils.sendKeys(ExcelProperty.getElementValue(HEADER_FOOTER,
        // HEADER_SEARCHBOX), "TIRES"+Keys.ENTER);
        System.out.println("System should navigate respective page");

    }

    public static boolean verifyCart() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CART);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the Cart image");
        return flag;

    }

    public static void clickCart() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_CART), 120);
        System.out.println("System should navigate to cart page");

    }

    public static boolean verifyFooterSignUp() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SIGNUP_ALERT_BOX);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SIGNUP_ALERT_BUTTON);
        String element3 = PropertyUtil.getStaticText(FOOTER_SIGNUP_ALERT_TEXT);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.PageSourceContains(element3);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the footer sign up");
        return flag;

    }

    public static void clickFooterSignUpButton() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SIGNUP_ALERT_BUTTON), 120);
        System.out.println("System should display message ");

    }

    public static void enterFooterSignUpEditBox() throws Exception
    {

        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SIGNUP_ALERT_BOX),
                "ta123@gmail.com");
        System.out.println("System should allow to enter text");

    }

    public static boolean verifyFooterSocialMedia() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SOCIAL_MEDIA_FACEBOOK);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SOCIAL_MEDIA_TIWTTER);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SOCIAL_MEDIA_INSTAGRAM);
        ExcelBean element4 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SOCIAL_MEDIA_WORDPRESS);
        // String element4 =
        // PropertyUtil.getStaticText(FOOTER_SOCIAL_MEDIA_TEXT);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);
            // flag = SeleniumUtils.PageSourceContains(element4);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the social media");
        return flag;

    }

    public static void clickFooterFacebook() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SOCIAL_MEDIA_FACEBOOK), 120);
        System.out.println("System should open pop up");

    }

    public static void clickFooterTwitter() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SOCIAL_MEDIA_TIWTTER), 120);
        System.out.println("System should open pop up");

    }

    public static void clickFooterInstagram() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SOCIAL_MEDIA_INSTAGRAM), 120);
        System.out.println("System should open pop up");

    }

    public static void clickFooterWordPress() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SOCIAL_MEDIA_WORDPRESS), 120);
        System.out.println("System should open pop up");

    }

    public static boolean verifyFooterTireAmericaAdvan() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_WHY_BUYTIRES_BUYING_PROCESS);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_WHY_BUYTIRES_PRICE_GUARANTEE);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_WHY_BUYTIRES_RECOMMED_INSTALLER);
        ExcelBean element4 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_WHY_BUYTIRES_WHY_FROMUS);
        ExcelBean element5 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TA_ADVANTAGE_ABOUT_TA);
        String element6 = PropertyUtil.getStaticText(FOOTER_WHY_BUYTIRES_TEXT);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);
            flag = SeleniumUtils.iSDisplayed(element5);
            flag = SeleniumUtils.PageSourceContains(element6);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display why buy tires");
        return flag;

    }

    public static void clickFooterTireBuyingProcessLink() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_WHY_BUYTIRES_BUYING_PROCESS),
                120);
        System.out.println("System should navigate Footer TireBuyingProcess Link");

    }

    public static void clickFooterTirePriceGuarantee() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_WHY_BUYTIRES_PRICE_GUARANTEE),
                120);
        System.out.println("System should navigate TirePriceGuarantee");

    }

    public static void clickFooterRecommedInstallers() throws Exception
    {

        SeleniumUtils.javaScriptClick(
                ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_WHY_BUYTIRES_RECOMMED_INSTALLER), 120);
        System.out.println("System should navigate Recommendation Installers page ");
    }

    public static boolean verifyFooterCustomersServices() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CUSTOMER_SERVICES_CONTACTUS);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CUSTOMER_SERVICES_ORDER_STATUS);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CUSTOMER_SERVICES_RETURNREPLACE);
        ExcelBean element4 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CUSTOMER_SERVICES_WARRANTY);
        ExcelBean element5 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CUSTOMER_SERVICES_FAQ);
        String element6 = PropertyUtil.getStaticText(FOOTER_CUSTOMER_SERVICES_TEXT);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);
            flag = SeleniumUtils.iSDisplayed(element5);
            flag = SeleniumUtils.PageSourceContains(element6);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the customer services");
        return flag;

    }

    public static void clickFooterContactUs() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CUSTOMER_SERVICES_CONTACTUS),
                120);
        System.out.println("System should navigate contactus ");

    }

    public static void clickFooterOrderStatus() throws Exception
    {

        SeleniumUtils.javaScriptClick(
                ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CUSTOMER_SERVICES_ORDER_STATUS), 120);
        System.out.println("System should navigate Order status");

    }

    public static void clickFooterRepalceReturn() throws Exception
    {

        SeleniumUtils.javaScriptClick(
                ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CUSTOMER_SERVICES_RETURNREPLACE), 120);
        System.out.println("System should navigate Replace/return page ");
    }

    public static boolean verifyFooterKnowledgeCenter() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_TIRE_SIZECHART);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_TIRE_KNOWLEDGE);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_ROUTINE);
        String element4 = PropertyUtil.getStaticText(FOOTER_KNOWLEDGE_CENTER_TEXT);
        ExcelBean element5 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_ENVIRONMENTAL);
        ExcelBean element6 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_BLOG);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.PageSourceContains(element4);
            flag = SeleniumUtils.iSDisplayed(element5);
            flag = SeleniumUtils.iSDisplayed(element6);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the social media");
        return flag;

    }

    public static void clickFooterTireSizeChart() throws Exception
    {

        SeleniumUtils.javaScriptClick(
                ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_TIRE_SIZECHART), 120);
        System.out.println("System should navigate tire size chart ");

    }

    public static void clickFooterTireKnowledge() throws Exception
    {

        SeleniumUtils.javaScriptClick(
                ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_TIRE_KNOWLEDGE), 120);
        System.out.println("System should navigate tire knowledge");

    }

    public static void clickFooterRoutineManagment() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_ROUTINE),
                120);
        System.out.println("System should navigate Routine Management ");
    }

    public static void clickFooterEviromentalTips() throws Exception
    {

        SeleniumUtils.javaScriptClick(
                ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_ENVIRONMENTAL), 120);
        System.out.println("System should navigate evniromenetal tips ");
    }

    public static void clickFooterblog() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_KNOWLEDGE_CENTER_BLOG), 120);
        System.out.println("System should navigate blogs ");
    }

    public static boolean verifyFooterFinancingOption() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_FINANCING_OPTION_BENEFITS);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_FINANCING_OPTION_PAY_BILL);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_FINANCING_OPTION_APPLY_NOW);
        String element4 = PropertyUtil.getStaticText(FOOTER_FINANCING_OPTION_TEXT);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.PageSourceContains(element4);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the financing options");
        return flag;

    }

    public static void clickFooterBenefits() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_FINANCING_OPTION_BENEFITS),
                120);
        System.out.println("System should navigate Benefits page ");

    }

    public static void clickFooterPayMyBill() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_FINANCING_OPTION_PAY_BILL),
                120);
        System.out.println("System should navigate pay my bill");

    }

    public static void clickFooterApplyNow() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_FINANCING_OPTION_APPLY_NOW),
                120);
        System.out.println("System should navigate apply now page ");
    }

    public static boolean verifyFooterTireInstallerProgram() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TIRE_INSTALLER_PROG_ABOUT);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TIRE_INSTALLER_PROG_BECOME);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TIRE_INSTALLER_PROG_LOGIN);
        String element4 = PropertyUtil.getStaticText(FOOTER_TIRE_INSTALLER_PROG_TEXT);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.PageSourceContains(element4);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the tire insatller programs");
        return flag;

    }

    public static void clickFooterAboutInstallerPrograms() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TIRE_INSTALLER_PROG_ABOUT),
                120);
        System.out.println("System should navigate About our installer program ");

    }

    public static void clickFooterBecomeInsatllers() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TIRE_INSTALLER_PROG_BECOME),
                120);
        System.out.println("System should navigate beacome an installers page");

    }

    public static void clickFooterInstallerlogin() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TIRE_INSTALLER_PROG_LOGIN),
                120);
        System.out.println("System should navigate installers login page ");
    }

    public static boolean verifyFooterlogoAndCopyRights() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SITE_LOGO);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TERMS_OF_SERVICES);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_PRIVACY_POLICY);
        String element4 = PropertyUtil.getStaticText(FOOTER_COPY_RIGHT_TEXT);
        ExcelBean element5 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SITE_MAP);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.PageSourceContains(element4);
            flag = SeleniumUtils.iSDisplayed(element5);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the site logo and copy rights");
        return flag;

    }

    public static void clickFooterTermsAndServices() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_TERMS_OF_SERVICES), 120);
        System.out.println("System should navigate terms and services program ");

    }

    public static void clickFooterPrivacyPolicy() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_PRIVACY_POLICY), 120);
        System.out.println("System should navigate privacy policy page");

    }

    public static void clickFooterSitMap() throws Exception
    {

        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SITE_MAP), 120);
        System.out.println("System should navigate site page page ");
    }

    public static boolean verifyFooterCardsLogo() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CARD_LOGO1);
        ExcelBean element2 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CARD_LOGO2);
        ExcelBean element3 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CARD_LOGO3);
        ExcelBean element4 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CARD_LOGO4);
        ExcelBean element5 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CARD_LOGO5);
        ExcelBean element6 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CARD_LOGO6);
        ExcelBean element7 = ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_CARD_LOGO7);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);
            flag = SeleniumUtils.iSDisplayed(element5);
            flag = SeleniumUtils.iSDisplayed(element6);
            flag = SeleniumUtils.iSDisplayed(element7);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the payment logos");
        return flag;

    }
    
    public static boolean verifyBackToTop() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_BACK_TO_TOP_LINK);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(" System should display the back to top link ");
        return flag;

    }

    public static void clickBackToTop() throws Exception
    {

        SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(HEADER_FOOTER, HEADER_BACK_TO_TOP_LINK), 200);
        System.out.println("System should scroll to top of the page");

    }
    

}
