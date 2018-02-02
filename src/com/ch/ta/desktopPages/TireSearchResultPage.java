package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class TireSearchResultPage implements FileConstants {

	public static boolean verifyBrandName() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("", "");

		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the brand name");
		return flag;

	}

	public static void clickBrandName() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 230);

	}

	public static boolean verifyProductReview() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//link
		ExcelBean element2 = ExcelProperty.getElementValue("", "");//star rating
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Start rating and Product review link");
		return flag;

	}

	public static void clickProductReview() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifySpeedRatingMessage() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the speed rating message");
		return flag;

	}
	
	public static boolean verifyproductImage() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product image");
		return flag;

	}

	public static void clickProductImage() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyproductTireSizeLink() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product tire size link");
		return flag;

	}

	public static void clickProductTireSizeLink() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyproductWarrentyAndSpeedUp() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		ExcelBean element2 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product Warrenty and speed up message");
		return flag;

	}
	
	public static boolean verifyproductPrice() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product price");
		return flag;

	}
	
	public static boolean verifyproductInStock() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product Instock Message");
		return flag;

	}
	
	public static boolean verifyproductShowTireSpecLink() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product show tire spec link");
		return flag;

	}

	public static void clickProductShowTireSpecLink() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyproductSavingLinkAndText() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		String element2= PropertyUtil.getStaticText("");
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.PageSourceContains(element2);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product saving link and saving text");
		return flag;

	}

	public static void clickProductSavingLink() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyproductAddToCartButton() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product add to cart button");
		return flag;

	}

	public static void clickProductAddToCartButton() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}


	public static boolean verifyproductQuanity() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the product quanity");
		return flag;

	}

	public static void clickProductQuanityIncrease() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickProductQuanityDcrease() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}

	public static boolean verifyCompareButton() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Compare Button");
		return flag;

	}

	public static void clickOnCompareButton() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifySortBy() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		ExcelBean element2 = ExcelProperty.getElementValue("","" );
		ExcelBean element3 = ExcelProperty.getElementValue("","" );
		String element4= PropertyUtil.getStaticText("");
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
			flag = SeleniumUtils.iSDisplayed(element3);
			flag = SeleniumUtils.PageSourceContains(element4);
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Sort by option and Text");
		return flag;

	}
	
	public static void clickOnSortBy() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}

	public static void clickOnSortByHightoLow() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickOnSortByLowtoHigh() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyRecommededOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Recommended option");
		return flag;

	}

	public static void clickOnRecommededOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyAnnualMileageRecommededOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Auunal Mileage Recommended option");
		return flag;

	}

	public static void clickAnnualMileageRecommededOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyDrivingLocRecommededOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Driving Location Recommended option");
		return flag;

	}

	public static void clickDrivingLocRecommededOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyDrivingStyleRecommededOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Driving Style Recommended option");
		return flag;

	}

	public static void clickDrivingStyleRecommededOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	
	public static boolean verifyVehicleUsesRecommededOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Vehicle Uses Recommended option");
		return flag;

	}

	public static void clickVehicleUsesRecommededOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the All result option");
		return flag;

	}

	public static void clickAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyShowOriginalEquiOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the show original equipment only in All result option");
		return flag;

	}

	public static void clickShowOriginalEquiOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyShowPromotionOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the show Promotion only in All result option");
		return flag;

	}

	public static void clickShowPromotionOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyShowBestSellerOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the show best sellers only in All result option");
		return flag;

	}

	public static void clickShowBestSellerOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyBrandInAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Brand option in All result");
		return flag;

	}

	public static void clickBrandInAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickAnyOneBrandOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyPriceInAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Price option in All result");
		return flag;

	}

	public static void clickPriceInAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickAnyOnePriceOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifySavingInAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Saving option in All result");
		return flag;

	}

	public static void clickSavingInAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickAnyOneSavingOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyTireTypeInAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the tire type option in All result");
		return flag;

	}

	public static void clickTireTypeInAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickAnyOneTireTypeOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	
	public static boolean verifySpeedRateInAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		ExcelBean element3 = ExcelProperty.getElementValue("","" );//Alert icon
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
			flag = SeleniumUtils.iSDisplayed(element3);

						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Speed rating option in All result");
		return flag;

	}

	public static void clickSpeedRateInAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickAnyOneSpeedRateOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickSpeedRateAlertOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyLoadIndexInAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		ExcelBean element3 = ExcelProperty.getElementValue("","" );//Alert icon
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
			flag = SeleniumUtils.iSDisplayed(element3);			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Load Index option in All result");
		return flag;

	}

	public static void clickLoadIndexInAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickAnyOneLoadIndexOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickLoadIndexAlertOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyTreadLifeInAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Load Index option in All result");
		return flag;

	}

	public static void clickTreadLifeInAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickAnyOneTreadLifeOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyWinterTiresInAllResultOption() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );//Name
		ExcelBean element2 = ExcelProperty.getElementValue("","" );//Accordion
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Load Index option in All result");
		return flag;

	}

	public static void clickWinterTiresInAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickWinterTireYesOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickWinterTireNoOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickLoadNext() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	
	
	

}
