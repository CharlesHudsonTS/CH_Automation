package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class BrandDetailsPage implements FileConstants
{
    public static boolean isShopTireByBrandText() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_SHOP_TIRE_BY_BRAND_TEXT);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean isDisplayBrandLogo() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BLP_GOOD_YEAR_BRAND_LOGO);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
    public static boolean isEnableBrandLogo() throws Exception {
        try
        {
        SeleniumUtils.isEnabled(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BLP_GOOD_YEAR_BRAND_LOGO));
       
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean isDisplayConformTireSize() throws Exception {
        try
        {
        SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CONFORM_TIRESIZE));
        
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean isConformTiresize() throws Exception {
        try
        {
        SeleniumUtils.isEnabled(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CONFORM_TIRESIZE_DETAILS));
        
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isDisplayYMMESection() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_SHOP_TYRES_BY_VEHICLE));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_SHOP_TYRES_BY_SIZE));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_MAKE));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_YEAR));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_MODEL));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_SUBMODEL));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_SHOP_BUTTON));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display YMME section");
        return flag;

    }
    public static boolean isDisplayTiresAvailableDetails() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_NO_TIRES_AVAILABLE));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_TIRES_AVAILABLE_TEXT));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_VIEW_BUTTON));
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display tires available details");
        return flag;

    }
    public static boolean isDisplayStateAndLicenseFields() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_LICENSE_PLATE_STATE_FIELD));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_LICENSE_PLATE_NO_FIELD));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_LICENSE_PLATE_SHOP_BUTTON));
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display tires available details");
        return flag;

    }
    public static boolean isFrontTyre() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CONFORM_YOUR_TYRESIZE_FRONTTYRE1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CONFORM_YOUR_TYRESIZE_FRONTTYRE2));           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;

    }
    public static boolean isRearTyre() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CONFORM_YOUR_TYRESIZE_REARTYRE1));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CONFORM_YOUR_TYRESIZE_REARTYRE2));           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;

    }

    
    public static boolean isDisplayViewBrandLineBtn() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_VIEW_BUTTON);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
   
    public static boolean isDisplayWarningMsg() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_NO_VEHICLE_WARNING_MESSAGE);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
    public static boolean isDisplayAboutBrand() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_ABOUT_BRAND_TEXT);
        ExcelBean element2 = ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_ABOUT_BRAND_DETAILS);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
    public static boolean isDisplayTAProcessComponents() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_EFFERTLESS_TEXT));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_FIRST_TRUST));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_SECOND_TRUST));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_THIRD_TRUST));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display tires available details");
        return flag;

    }
    
    public static boolean isDisplayBrandLineDetails() throws Exception
    {

        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_LINES_TEXT));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_IMAGE));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_NAME));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_SUBNAME));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_RATINGS));
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_REVIEWS));
         //   flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_PRICE));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("system Should display brand line details ");
        return flag;

    }
    public static void clickOnBrandName() throws Exception {
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BLP_GOOD_YEAR_BRAND_NAME));
        System.out.println("System should navigate good year brand detail page");
    }
    public static void clickOnMake() throws Exception {
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_MAKE));
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_MAKE_SEARCH));
    }
    public static void clickOnBMWMake() throws Exception {
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_MAKE));
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_BMW_MAKE_SEARCH));

        
    }
    public static void clickOnYear() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_YEAR_SEARCH),200);
        
    }
    public static void clickOnYear1() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_YEAR1_SEARCH),200);
        
    }
    public static void clickOnModel() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_MODEL_SEARCH),200);
        
    }
    public static void clickOnBMWModel() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_BMW_MODEL_SEARCH),200);
        
    }
    public static void clickOnSubmodel() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_SUBMODEL_SEARCH),200);
        
    }
    public static void clickOnBMWSubmodel() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_BMW_SUBMODEL_SEARCH),200);
        
    }
    public static void clickOnShopBtn() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_SHOP_BUTTON),200);
    }
    public static void clickOnSelectedTiresize() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_SELECTED_TIRESIZE),200);
    }
    public static void isWidth() throws Exception {
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_WIDTH));
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_WIDTH_SEARCH),200);
        
    }
    public static void isRatio() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_RATIO),200);
        
    }
    public static void isDiameter() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_DIAMETER),200);
        
    }
    public static void clickOnCustomTireSizeResult() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CUSTOME_TIRESIZE),200);
    }
    public static void clickOnTireSizeIsntListed() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_TIRESIZE_ISNT_LISTED),200);
    }
    
    public static void cilckOnViewBrandLineBtn() throws Exception {
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_VIEW_BUTTON));
        System.out.println("System should displayed the brandline section");
    }
    
    public static void clickOnLicensePlateNo() throws Exception {
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BLP_LICENSE_PLATE_NO));
        System.out.println("System should click on license plate no brand detail page");
    }
    
    
    public static void enterValidState() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_LICENSE_PLATE_STATE_FIELD), 200);
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_STATE_FIELD),200);
        System.out.println("System should enter state in statefield");
    }
    
    public static void enterValidLicensePlateNo(String num) throws  Exception {
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_LICENSE_PLATE_NO_FIELD), num);
    }
    
    public static void clickOnLicensePlateShopBtn() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_LICENSE_PLATE_SHOP_BUTTON), 200);
    }
    public static void clickOnShopTyreBySize() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_YMME_SHOP_TYRES_BY_SIZE), 200);
    }
    public static void clicTireSizeLink() throws Exception
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_TIRE_SIZE ));

    }
    public static void clickOnBrandLineImage() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_IMAGE), 200);
    }
    public static void clickOnBrandLineName() throws Exception {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_NAME), 200);
    }
    public static void clickOnReviews() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_BRAND_TIRES_REVIEWS),200);

    }
    public static void clickOnFrontTyre() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CONFORM_YOUR_TYRESIZE_FRONTTYRE1),200);

    }
    public static void clickOnRearTyre() throws Exception
    {
        SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue(BRAND_DETAILS_PAGE, BDP_CONFORM_YOUR_TYRESIZE_REARTYRE1),200);

    }
    
    
}
