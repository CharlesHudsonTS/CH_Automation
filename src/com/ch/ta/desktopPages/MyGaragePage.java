package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MyGaragePage implements FileConstants {

	public static boolean verifyMyGarageTab() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_TAB);

		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the my garage tab");
		return flag;

	}

	public static boolean verifyMyGarageDetails() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CAR_IMAGE);
		ExcelBean element2 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_TIRE_SIZE);
//		ExcelBean element3 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_SHOP_THIS_VEHICLE);
//		ExcelBean element4 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_TIRE_INFORMATION);
//		ExcelBean element5 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_MANUFACTURE_SERVICES);
//		ExcelBean element6 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVING_PREFERENCE);
//		ExcelBean element7 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CAR_NAME);

		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			flag = SeleniumUtils.iSDisplayed(element2);
//			flag = SeleniumUtils.iSDisplayed(element3);
//			flag = SeleniumUtils.iSDisplayed(element4);
//			flag = SeleniumUtils.iSDisplayed(element5);
//			flag = SeleniumUtils.iSDisplayed(element6);
//			flag = SeleniumUtils.iSDisplayed(element7);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the my garage elements");
		return flag;

	}

	public static boolean verifyMyGarageEditVehicle() throws Exception {

//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_EDIT_VEHICLE);

		boolean flag = false;
		try {

//			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the my garage edit vehicle link");
		return flag;

	}

	public static void clickEditVehicleLink() throws Exception {

//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_EDIT_VEHICLE));
	}

//	public static boolean verifyMyGarageRemoveVehicle() throws Exception {
//
////		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_REMOVE_VEHICLE);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage remove vehicle link");
//		return flag;
//
//	}
//
//	public static void clickRemoveVehicleLink() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_REMOVE_VEHICLE));
//	}
//
//	public static boolean verifyWhyICantEditVehicle() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_WHY_I_CANT_EDIT);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage why i cant edit vehicle");
//		return flag;
//
//	}
//
//	public static void clickWhyICantEditVehicleLink() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_WHY_I_CANT_EDIT));
//	}
//
//	public static boolean verifyShopForThisVehicle() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_SHOP_THIS_VEHICLE);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage shop for this vehicle");
//		return flag;
//
//	}
//
//	public static void clickShopForThisVehicle() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_SHOP_THIS_VEHICLE));
//		System.out.println("System should navigate to respective page");
//	}
//
//	public static boolean verifyAdditionalTireInfo() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_TIRE_INFORMATION);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage tire information");
//		return flag;
//
//	}
//
//	public static void clickAdditionalTireInfo() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_TIRE_INFORMATION));
//		System.out.println("System should navigate to respective page");
//	}
//
//	public static boolean verifyManufactureServices() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_MANUFACTURE_SERVICES);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage manufacture services");
//		return flag;
//
//	}
//
//	public static void clickManufactureServices() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_MANUFACTURE_SERVICES));
//		System.out.println("System should navigate to respective page");
//	}
//
//	public static boolean verifyPastPurchase() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_PAST_PURCHASE);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage past purchase");
//		return flag;
//
//	}
//
//	public static void clickPastPurchase() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_PAST_PURCHASE));
//		System.out.println("System should navigate to respective page");
//	}
//
//	public static boolean verifyDrivingPerference() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVING_PREFERENCE);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage driving perference");
//		return flag;
//
//	}
//
//	public static void clickDrivingPerference() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVING_PREFERENCE));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	public static boolean verifyAnnualMileage() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_STATIC_TEXT);
//		ExcelBean element2 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_STATIC_TEXT_TIP);
//		ExcelBean element3 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION1);
//		ExcelBean element4 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION2);
//		ExcelBean element5 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION3);
//		ExcelBean element6 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION4);
//		ExcelBean element7 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION5);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//			flag = SeleniumUtils.iSDisplayed(element2);
//			flag = SeleniumUtils.iSDisplayed(element3);
//			flag = SeleniumUtils.iSDisplayed(element4);
//			flag = SeleniumUtils.iSDisplayed(element5);
//			flag = SeleniumUtils.iSDisplayed(element6);
//			flag = SeleniumUtils.iSDisplayed(element7);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage driving perference annual mileage");
//		return flag;
//
//	}
//
//	public static void clickAnnualMileageOption1() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION1));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	public static void clickAnnualMileageOption2() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION2));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	public static void clickAnnualMileageOption3() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION3));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	
//	public static void clickAnnualMileageOption4() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION4));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	public static void clickAnnualMileageOption5() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_ANNUAL_MILEAGE_OPTION5));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	public static boolean verifyDrivePlaces() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_STATIC_TEXT);
//		ExcelBean element2 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_STATIC_TEXT_TIP);
//		ExcelBean element3 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION1);
//		ExcelBean element4 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION2);
//		ExcelBean element5 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION3);
//		ExcelBean element6 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION4);
//		ExcelBean element7 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION5);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//			flag = SeleniumUtils.iSDisplayed(element2);
//			flag = SeleniumUtils.iSDisplayed(element3);
//			flag = SeleniumUtils.iSDisplayed(element4);
//			flag = SeleniumUtils.iSDisplayed(element5);
//			flag = SeleniumUtils.iSDisplayed(element6);
//			flag = SeleniumUtils.iSDisplayed(element7);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage driving perference drive places");
//		return flag;
//
//	}
//
//	public static void clickDrivePlacesOption1() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION1));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	public static void clickDrivePlacesOption2() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION2));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	public static void clickDrivePlacesOption3() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION3));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	
//	public static void clickDrivePlacesOption4() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION4));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	public static void clickDrivePlacesOption5() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_DRIVE_PLACES_OPTION5));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	public static boolean verifyUsualDrivingStyle() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_STATIC_TEXT);
//		ExcelBean element2 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_STATIC_TEXT_TIP);
//		ExcelBean element3 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION1);
//		ExcelBean element4 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION2);
//		ExcelBean element5 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION3);
//		ExcelBean element6 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION4);
//		ExcelBean element7 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION5);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//			flag = SeleniumUtils.iSDisplayed(element2);
//			flag = SeleniumUtils.iSDisplayed(element3);
//			flag = SeleniumUtils.iSDisplayed(element4);
//			flag = SeleniumUtils.iSDisplayed(element5);
//			flag = SeleniumUtils.iSDisplayed(element6);
//			flag = SeleniumUtils.iSDisplayed(element7);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage driving perference usual driving style");
//		return flag;
//
//	}
//
//	public static void clickUsualDrivingStyleOption1() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION1));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	public static void clickUsualDrivingStyleOption2() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION2));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	public static void clickUsualDrivingStyleOption3() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION3));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	
//	public static void clickUsualDrivingStyleOption4() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION4));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	public static void clickUsualDrivingStyleOption5() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_USUALDRIVING_STYLE_OPTION5));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	public static boolean verifyCareMostAbout() throws Exception {
//
//		ExcelBean element1 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_STATIC_TEXT);
//		ExcelBean element2 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_STATIC_TEXT_TIP);
//		ExcelBean element3 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION1);
//		ExcelBean element4 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION2);
//		ExcelBean element5 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION3);
//		ExcelBean element6 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION4);
//		ExcelBean element7 = ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION5);
//
//		boolean flag = false;
//		try {
//
//			flag = SeleniumUtils.iSDisplayed(element1);
//			flag = SeleniumUtils.iSDisplayed(element2);
//			flag = SeleniumUtils.iSDisplayed(element3);
//			flag = SeleniumUtils.iSDisplayed(element4);
//			flag = SeleniumUtils.iSDisplayed(element5);
//			flag = SeleniumUtils.iSDisplayed(element6);
//			flag = SeleniumUtils.iSDisplayed(element7);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(" System should display the my garage driving perference care most about ");
//		return flag;
//
//	}
//
//	public static void clickCareMostAboutOption1() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION1));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	public static void clickCareMostAboutOption2() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION2));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	public static void clickCareMostAboutOption3() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION3));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	
//	public static void clickCareMostAboutOption4() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION4));
//		System.out.println("System should navigate to respective page");
//	}
//	
//	
//	public static void clickCareMostAboutOption5() throws Exception {
//
//		SeleniumUtils.click(ExcelProperty.getElementValue(MYGARAGE, MY_GARAGE_CARE_MOSTABOUT_OPTION5));
//		System.out.println("System should navigate to respective page");
//	}
	

}
