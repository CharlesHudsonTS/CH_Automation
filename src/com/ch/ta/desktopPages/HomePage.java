package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class HomePage implements FileConstants
{

    public static void hoverOnTires() throws Exception
    {
        SeleniumUtils.onHover(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_TIRES));
        System.out.println("Hover on tires in menu in homepage");
    }

    public static void clickOnshopByBrand() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_TIRES_SHOP_BY_BRAND));
        System.out.println("system should navigate to shop by brand page ");
    }

    public static void clickOnTires() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_TIRES));
    }

    public static void clickMakeSelectAccordant() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_MAKE_ACCORDANT1), 200);
    }

    public static void clickMakeSelect() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_MAKE1), 200);
    }

    public static void clickYearSelect() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_YEAR1), 200);

    }

    public static void clickModelSelect() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_MODEL1));
    }

    public static void clickSubModelSelect() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_SUBMODEL1));
    }

    public static void clickOnShopButton() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BUTTON1), 200);
    }

    public static void clickMakeSelect1() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_MAKE), 200);
    }

    public static void clickYearSelect1() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_YEAR), 200);

    }

    public static void clickModelSelect1() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_MODEL));
    }

    public static void clickSubModelSelect1() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, SHOP_BY_TIRE_SUBMODEL));
    }

    public static boolean isMonetateBanner() throws Exception
    {
        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Monetate Banner");
        return flag;

    }

    public static boolean isProgressBar() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);
        ExcelBean element2 = ExcelProperty.getElementValue(null, null);
        ExcelBean element3 = ExcelProperty.getElementValue(null, null);
        ExcelBean element4 = ExcelProperty.getElementValue(null, null);

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
        System.out.println("system should display the Progress Bar");
        return flag;

    }

    public static boolean isProgBarYourVehicle() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Your Vehicle");
        return flag;

    }

    public static boolean isProgBarChooseYourTires() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Choose Your Tires");
        return flag;

    }

    public static boolean isASpot() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display A-Spot Section");
        return flag;

    }

    public static boolean isDisplayVideoLink() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_VIDEO_LINK));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Your Vehicle");
        return flag;

    }

    public static void clickOnVideoLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, CLICKON_VIDEO_LINK));
    }

    public static void clickOnCloseVideoLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, CLICKON_CLOSE_VIDEO_LINK));
    }

    public static boolean isDisplayshopbyvehicle() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_SHOPBY_VEHICLE));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display shop by vehicle tab");
        return flag;

    }

    public static boolean isDisplayshopbytiresize() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_SHOPBY_TIRESIZE));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display shop by tiresize tab");
        return flag;

    }

    public static boolean isDisplayValPropComp() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_VALUE_PROPOSITION_COMPONENT));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display value proposition component");
        return flag;

    }

    public static boolean isDisplayInstallerLocator() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(DISPLAY_INSTALLER_LOCATOR));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display installer locator");
        return flag;

    }

    public static void clickOnchangelocation() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, CLICKON_CHANGE_LOCATION));
    }

    public static boolean isDisplayspotformainimage() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_SPOT_MAINIMAGE));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display spot for main image in homepage");
        return flag;

    }

    public static boolean isDisplayPromotion1() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_PROMOTION1));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system should display the promotion Up to $70 off");
        return flag;

    }

    public static boolean isDisplayPromotion2() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_PROMOTION2));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system should display the promotion Top performance. Unrivaled value");
        return flag;

    }

    public static void hoverOnPromo1() throws Exception
    {
        SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_PROMOTION1), 240);
    }

    public static void hoverOnPromo2() throws Exception
    {
        SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_PROMOTION2), 300);
    }

    public static void clickOnPromo1() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(HOME_PAGE, SHOP_PROMOTION1), 200);
    }

    public static void clickOnPromo2() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, SHOP_PROMOTION2));
    }

    public static boolean isDisplayBrandLogos() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_BRAND_LOGOS));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system should display the brand logos");
        return flag;

    }

    public static boolean isDisplayShopOurBrandsbutton() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_SHOP_OUR_BRANDS_BUTTON));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system should display Shop our brands button");
        return flag;

    }

    public static void clickOnShopOurBrands() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, CLICKON_SHOP_OUR_BRANDS));
    }

    public static boolean isDisplaySocialMediaComp() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.PageSourceContains(PropertyUtil.getStaticText(DISPLAY_SOCIALMEDIA_COMP));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display social media testimonials components");
        return flag;

    }

    public static boolean isDisplayKnowledgeCentre() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_KNOWLEDGE_CENTRE));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display knowledge centre");
        return flag;

    }

    public static boolean isDisplayKnowledgeCentreArticle1() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_KNOWLEDGE_CENTRE_ARTICLE1));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display knowledge centre 1st article");
        return flag;

    }

    public static boolean isDisplayKnowledgeCentreArticle2() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_KNOWLEDGE_CENTRE_ARTICLE2));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display knowledge centre 2nd article");
        return flag;

    }

    public static boolean isDisplayKnowledgeCentreArticle3() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils
                    .iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_KNOWLEDGE_CENTRE_ARTICLE3));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display knowledge centre 3rd article");
        return flag;

    }

    public static void hoverOnArticle1() throws Exception
    {
        SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_KNOWLEDGE_CENTRE_ARTICLE1),
                500);
    }

    public static void clickOnArticle1() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, CLICK_ON_ARTICLE1));
    }

    public static void hoverOnArticle2() throws Exception
    {
        SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_KNOWLEDGE_CENTRE_ARTICLE2),
                500);
    }

    public static void clickOnArticle2() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, CLICK_ON_ARTICLE2));
    }

    public static void hoverOnArticle3() throws Exception
    {
        SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_KNOWLEDGE_CENTRE_ARTICLE3),
                500);
    }

    public static void clickOnArticle3() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, CLICK_ON_ARTICLE3));
    }

    public static boolean isDisplayCreditCardComponent() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_CREDIT_CARD_COMPONENT));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display credit card component");
        return flag;

    }

    public static void clickOnApplyNow() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, CLICK_ON_APPLY_NOW));
    }

    public static boolean isDisplayshopbylicenceplatenum() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_LICENCEPLATENUM));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display shop by licence plate number link");
        return flag;

    }

    public static boolean isASpotYmmeComponent() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);
        ExcelBean element2 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Your Vehicle");
        return flag;

    }

    public static boolean isShopByVehicleDefault() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(HOME_PAGE, DISPLAY_SHOPBY_VEHICLE);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Shop by vehicle");
        return flag;

    }

    public static boolean isLiveChat() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Live Chat");
        return flag;

    }

    public static boolean isHowitWorksComponents() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display How it works Componetnts");
        return flag;

    }

    public static boolean isValuePropositionComponents() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Value Propotition Components");
        return flag;

    }

    public static boolean isFindAnInstaller() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Find an Installer");
        return flag;

    }

    public static boolean isSalePromotionCreditComponents() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should Sale/Promotion and Credit card Components");
        return flag;

    }

    public static void clickLikeChat() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static void clickFindAnInstaller() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static void clickSalePromoShopNow() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static void clickCreditComponentApplyNow() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static boolean isTestimonials() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Testimonials");
        return flag;

    }

    public static void clickReadMoreTestimonials() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static boolean isKnowledgeCenterArticle() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Knowledge Center Article");
        return flag;

    }

    public static void clickTireKnowledgeReadArticle() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static void clickRoutineTireMaintenanceReadArticle() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static boolean isBackToTop() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Back to Top");
        return flag;

    }

    public static void clickBackToTop() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static boolean isProgBarSelectedVehicle() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Selected Vehicle with Green Mark");
        return flag;

    }

    public static boolean isCameWithYourCar() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Selected Came With Your car");
        return flag;

    }

    public static boolean isBestValue() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Selected Best Value");
        return flag;

    }

    public static boolean isBestSeller() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Selected Best Seller");
        return flag;

    }

    public static boolean isGreatInRain() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Selected Great In Rain");
        return flag;

    }

    public static boolean isOnSale() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display On Sale");
        return flag;

    }

    public static boolean isSeeAllMatchesForSelected() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display See all Matches For Sale");
        return flag;

    }

    public static boolean isSeasonalProducts() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Seasonal Products");
        return flag;

    }

    public static boolean isShopYourFavoriteBrands() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Shop Your Favorite Brands");
        return flag;

    }

    public static boolean isSeeMoreBrands() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display See More Brands");
        return flag;

    }

    public static void clickSeeMoreBrands() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static boolean isShopAllWinterTires() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Shop All Winter tires For Selected");
        return flag;

    }

    public static void clickShopAllWinterTires() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static boolean isTireReview() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Tire Review");
        return flag;

    }

    public static boolean isCreditCardComponent() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Credit Card Apply Details");
        return flag;

    }

    public static boolean isDeals() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Deals");
        return flag;

    }

    public static void clickOnDeals() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(null, null), 200);

    }

    public static boolean isKnowledgeCenter() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(null, null);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("System Should display Knowledge Center");
        return flag;

    }

    public static void clickOnKnowledgeCenter() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue("", ""));
        System.out.println("Click on knowledge center in menu");
    }

    public static void isDisplayedMiniGurage()
    {
        // TODO Auto-generated method stub

    }

    public static void clickOnshopTyresBySize() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_SHOP_TIRES_BY_SIZE));
    }

    public static void clickOnWidth() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_SHOP_TIRES_BY_SIZE_WIDTH));
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_SHOP_TIRES_BY_SIZE_WIDTH_SELECT));

    }

    public static void clickOnRatio() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_SHOP_TIRES_BY_SIZE_RATIO));
    }

    public static void clickOnDiameter() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_SHOP_TIRES_BY_SIZE_DIAMETER));
    }

    public static void clickOnShopBtn() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_SHOP_TIRES_BY_SIZE_SHOP_BUTTON));
    }

    public static void clickOnshopByVehicle() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, ""));
    }

    public static boolean isPromotionalContent() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_MYOFFER);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;

    }

    public static void clickOnLearnMore() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_LEARNMORE));

    }

    public static void clickOnSystemAlertClose() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_SYSTEMALERT_CLOSE));

    }

    public static void clickOnClosePromoOffer() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_MYOFFER_CLOSE));

    }

    public static boolean isSystemAlert() throws Exception
    {

        ExcelBean element1 = ExcelProperty.getElementValue(HOME_PAGE, HOMEPAGE_SYSTEM_ALERT);

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display Promotional Content");
        return flag;

    }
}
