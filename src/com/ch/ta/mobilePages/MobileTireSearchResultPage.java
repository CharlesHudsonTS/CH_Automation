package com.ch.ta.mobilePages;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class MobileTireSearchResultPage implements FileConstants {

	public static boolean verifyFilterClose() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("", "");

		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Filter close button(x)");
		return flag;

	}

	public static void clickFilterCloseButton() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("", ""), 230);

	}

	public static boolean verifyClearFilterbutton() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
		

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the Clear filter button");
		return flag;

	}

	public static void clickClearFilterbutton() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static boolean verifyBackToTop() throws Exception {

		ExcelBean element1 = ExcelProperty.getElementValue("","" );
		
		boolean flag = false;
		try {

			flag = SeleniumUtils.iSDisplayed(element1);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" System should display the back to top link");
		return flag;

	}
	
	public static void clickBackToTop() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	public static void clickAllResultOption() throws Exception {

		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);
		Thread.sleep(4000);
		SeleniumUtils.javaScriptClick(ExcelProperty.getElementValue("","" ), 230);

	}
	
	
	
	

}
