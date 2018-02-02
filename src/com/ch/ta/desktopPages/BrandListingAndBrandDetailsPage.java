package com.ch.ta.desktopPages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.utils.SeleniumUtils;

public class BrandListingAndBrandDetailsPage {

	public static void clickOnAnyBrand() throws Exception {
		SeleniumUtils.click(ExcelProperty.getElementValue(null, null));

	}

	public static void clickOnFitTireForSelectVehicle() throws Exception {
		SeleniumUtils.click(ExcelProperty.getElementValue(null, null));

	}

	public static boolean isBrandName() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

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
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

		boolean flag = false;
		try {
			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

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

	public static boolean isWarrantyTab() throws Exception {
		ExcelBean element1 = ExcelProperty.getElementValue(null, null);

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
