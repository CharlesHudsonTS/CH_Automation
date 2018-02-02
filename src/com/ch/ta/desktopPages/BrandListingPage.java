package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class BrandListingPage implements FileConstants {

	public static void clickOnAnyBrand() throws Exception {
		SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_CLICK_ON_BRAND_LOGO));

	}

	public static void clickOnFitTireForSelectVehicle() throws Exception {
		SeleniumUtils.click(ExcelProperty.getElementValue(null, null));

	}

	public static boolean isShopTireByBrandText() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_SHOP_TIRE_BY_BRAND_TEXT);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}
	public static boolean isDisplayListofBrandLogos() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_DISPLAY_BRAND_LOGOS);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
	public static boolean isDisplayBrandDetails() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_DISPLAY_BRAND_DETAILS);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
	public static boolean isDisplayBrandDetails1() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_DISPLAY_BRAND_DETAILS1);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
	public static boolean isDisplayBrandDetails2() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_DISPLAY_BRAND_DETAILS2);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
	 public static void hoverOnNittoBrand() throws Exception
	    {
	        SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(BRAND_LISTING_PAGE, NITTO_BRAND_LOGO), 100);
	    }

	public static boolean isReviewsAndRatings() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}

	public static boolean isNoVehicleSelected() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_NO_VEHICLE_SELECTED);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}
	public static boolean isVehicleSelected() throws Exception {
        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_VEHICLE_SELECTED);

        boolean flag = false;
        try {
            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
	   public static boolean isCompatible() throws Exception {
	        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_IS_COMPATIBLE);

	        boolean flag = false;
	        try {
	            flag = SeleniumUtils.iSDisplayed(element1);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return flag;

	    }
	    public static boolean isnotCompatible() throws Exception {
	        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, BLP_IS_NOT_COMPATIBLE);

	        boolean flag = false;
	        try {
	            flag = SeleniumUtils.iSDisplayed(element1);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return flag;

	    }
	    public static void clickOnHankookBrand() throws Exception {
	        SeleniumUtils.click(ExcelProperty.getElementValue(BRAND_LISTING_PAGE, CLICKON_HANKOOK_BRAND));

	    }

	    public static boolean displayHankookLogo() throws Exception
	    {
	        ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, DISPLAY_HANKOOK_LOGO);

	        boolean flag = false;
	        try
	        {
	            flag = SeleniumUtils.iSDisplayed(element1);

	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        System.out.println("system Should Hankook brand logo");
	        return flag;

	    }
	    
	    public static void hoverOnHankookBrand() throws Exception
        {
            SeleniumUtils.javaScriptOnHover(ExcelProperty.getElementValue(BRAND_LISTING_PAGE, HOVER_ON_HANKOOK_BRAND), 150);
        }

	public static boolean isYMME() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}
	  public static boolean displayCompatibleText() throws Exception {
          ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, COMPATIBLE_LABEL);

          boolean flag = false;
          try {
              flag = SeleniumUtils.iSDisplayed(element1);

          } catch (Exception e) {
              e.printStackTrace();
          }
          return flag;

      }

	public static boolean isWarrantyTab() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(BRAND_LISTING_PAGE, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}

	public static boolean isShopBrandByVehicle() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}

	public static void clickOnShopThisLineBySize() throws Exception {
		SeleniumUtils.click(ExcelProperty.getElementValue(null, null));

	}

	public static boolean isYMMEStaticText() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}

	public static boolean isLicensePlateNumberLink() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}

	public static void clickOnLicensePlateNumberLink() throws Exception {
		SeleniumUtils.click(ExcelProperty.getElementValue(null, null));

	}

	public static boolean isViewSection() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}
}
