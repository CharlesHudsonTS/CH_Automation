package com.ch.ta.desktopTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.CarbarPage;
import com.ch.ta.desktopPages.HomePage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class CarbarTest extends AbstractTestCaseReport implements FileConstants {

	public void tyreURL() throws Exception {
		CommonUtils.desktopView();
		CommonUtils.TBCURL();
	}
	
	/* ****************************************************
	  * Method Name   : verifyDisplayOfCarBar() 
	  * Purpose        : To verify the display of empty vehicle selector control in any interior shopping page.
	  * Author         : CH_001
	  * Date Created   : 12/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
    
	@Test
	public void verifyDisplayOfCarBar() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		Retry retry = new Retry(1);
        while (retry.retry())
        {
		try {
                tyreURL();
                SeleniumUtils.wait(5);
			    SeleniumUtils.onHover(ExcelProperty.getElementValue(D_CarBar, TIRES));
			    CarbarPage.shopByTireBrand();
			    CarbarPage.alertAndPromotionClose();
			    testcase.assertTrue(CarbarPage.isTitleShoppingFor(), "Title 'ShoppingFor' should be displayed in carbar page", "Title 'ShoppingFor' should be displayed in carbar page");
			    testcase.assertTrue(CarbarPage.VerifyUnselectedVehicleImage(), "unselected vehicle image should be displayed in carbar page", "unselected vehicle image should be displayed in carbar page");
			    testcase.assertTrue(CarbarPage.TextNoVehicleSelected(), "Text 'No Vehicle Selected' should be displayed in carbar page", "Text 'No Vehicle Selected' should be displayed in carbar page");
			    testcase.assertTrue(CarbarPage.msgToAddVehicle(), "Text msg for Add vehicle should be displyed", "Text msg for Add vehicle should be displyed");
			    testcase.assertTrue(CarbarPage.linkAddVehicle(), "Link 'Add Vehicle' should be displyed in carbar page", "Link 'Add Vehicle' should be displyed in carbar page");
			    testcase.assertTrue(CarbarPage.collapseExpandControl(), "Symbol of 'Collapse/Expand' should be displyed in carbar page", "Symbol of 'Collapse/Expand' should be displyed in carbar page");
			    testcase.pass("Display of car bar is verified successfully");
			    break;
		} catch (Exception e) {
			testcase.retry("System is not verifying the display of carbar", testcase, retry, e);
			e.printStackTrace();
		}
	}
	}
	
	/* ****************************************************
	  * Method Name   : verifyOnAddVehicleLink() 
	  * Purpose        : To verify the functionality onclick 'Add vehicle' link in empty vehicle selector control in any interior shopping page.
	  * Author         : CH_001
	  * Date Created   : 12/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
   
	@Test
	public void verifyOnAddVehicleLink() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		Retry retry = new Retry(1);
       while (retry.retry())
       {
		try {
			tyreURL();
            SeleniumUtils.wait(5);
		    SeleniumUtils.onHover(ExcelProperty.getElementValue(D_CarBar, TIRES));
		    CarbarPage.shopByTireBrand();
		    CarbarPage.alertAndPromotionClose();
		    testcase.assertTrue(CarbarPage.isTitleShoppingFor(), "Title 'ShoppingFor' should be displayed in carbar page", "Title 'ShoppingFor' should be displayed in carbar page");
		    testcase.assertTrue(CarbarPage.VerifyUnselectedVehicleImage(), "unselected vehicle image should be displayed in carbar page", "unselected vehicle image should be displayed in carbar page");
		    testcase.assertTrue(CarbarPage.TextNoVehicleSelected(), "Text 'No Vehicle Selected' should be displayed in carbar page", "Text 'No Vehicle Selected' should be displayed in carbar page");
		    testcase.assertTrue(CarbarPage.msgToAddVehicle(), "Text msg for Add vehicle should be displyed", "Text msg for Add vehicle should be displyed");
		    testcase.assertTrue(CarbarPage.linkAddVehicle(), "Link 'Add Vehicle' should be displyed in carbar page", "Link 'Add Vehicle' should be displyed in carbar page");
		    testcase.assertTrue(CarbarPage.collapseExpandControl(), "Symbol of 'Collapse/Expand' should be displyed in carbar page", "Symbol of 'Collapse/Expand' should be displyed in carbar page");
		    testcase.pass("Display of car bar is verified successfully");
		    CarbarPage.clickOnLinkAddVehicle();
		    testcase.assertTrue(CarbarPage.verifyListOfBenefitsForDriver(), "Benefits for the driver should be displayed onclick of Add vehicle link in carbar", "Benefits for the driver should be displayed onclick of Add vehicle link");
		    testcase.assertTrue(CarbarPage.verifyButtonAddNewVehicle(), "Button 'Add new vehicle' should be displayed on click of Add vehicle in carbar", "Button 'Add new vehicle' should be displayed on click of Add vehicle in carbar");
		    testcase.pass("Display of Benefits and Button onclick of Add vehicle link in carbar is successfull");
			break;
		} catch (Exception e) {
			testcase.retry("System is not verifying the Add vehicle link", testcase, retry, e);
			e.printStackTrace();
		}
	}
	}
	
	/* ****************************************************
	  * Method Name   : verifyExpandIcon() 
	  * Purpose        : To verify the functionality ExpandIcon in empty vehicle selector control in any interior shopping page.
	  * Author         : CH_001
	  * Date Created   : 17/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
  
	@Test
	public void verifyExpandIcon() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		Retry retry = new Retry(1);
      while (retry.retry())
      {
		try {
			tyreURL();
           SeleniumUtils.wait(5);
		    SeleniumUtils.onHover(ExcelProperty.getElementValue(D_CarBar, TIRES));
		    CarbarPage.shopByTireBrand();
		    CarbarPage.alertAndPromotionClose();
		    testcase.assertTrue(CarbarPage.isTitleShoppingFor(), "Title 'ShoppingFor' should be displayed in carbar page", "Title 'ShoppingFor' should be displayed in carbar page");
		    testcase.assertTrue(CarbarPage.VerifyUnselectedVehicleImage(), "unselected vehicle image should be displayed in carbar page", "unselected vehicle image should be displayed in carbar page");
		    testcase.assertTrue(CarbarPage.TextNoVehicleSelected(), "Text 'No Vehicle Selected' should be displayed in carbar page", "Text 'No Vehicle Selected' should be displayed in carbar page");
		    testcase.assertTrue(CarbarPage.msgToAddVehicle(), "Text msg for Add vehicle should be displyed", "Text msg for Add vehicle should be displyed");
		    testcase.assertTrue(CarbarPage.linkAddVehicle(), "Link 'Add Vehicle' should be displyed in carbar page", "Link 'Add Vehicle' should be displyed in carbar page");
		    testcase.assertTrue(CarbarPage.collapseExpandControl(), "Symbol of 'Collapse/Expand' should be displyed in carbar page", "Symbol of 'Collapse/Expand' should be displyed in carbar page");
		    testcase.pass("Display of car bar is verified successfully");
		    CarbarPage.clickOnExpandIcon();
		    testcase.assertTrue(CarbarPage.verifyListOfBenefitsForDriver(), "Benefits for the driver should be displayed onclick of Add vehicle link in carbar", "Benefits for the driver should be displayed onclick of Add vehicle link");
		    testcase.assertTrue(CarbarPage.verifyButtonAddNewVehicle(), "Button 'Add new vehicle' should be displayed on click of Add vehicle in carbar", "Button 'Add new vehicle' should be displayed on click of Add vehicle in carbar");
		    testcase.pass("Display of Benefits and Button onclick of Add new vehicle link in carbar is successfull");
			break;
		} catch (Exception e) {
			testcase.retry("System is not verifying the Benefits and Add new vehicle Button", testcase, retry, e);
			e.printStackTrace();
		}
	}
	}
	
	/* ****************************************************
	  * Method Name   : verifyExpandIcon() 
	  * Purpose        : To verify the functionality ExpandIcon in empty vehicle selector control in any interior shopping page.
	  * Author         : CH_001
	  * Date Created   : 17/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
 
	@Test
	public void verifyWithSelectedVehicle() throws Exception {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
		Retry retry = new Retry(1);
     while (retry.retry())
     {
		try {
			tyreURL();
            SeleniumUtils.wait(5);
            String a= "Acura";
		    CarbarPage.selectVehicle(a);
		    
			break;
		} catch (Exception e) {
			testcase.retry("System is not verifying the Add vehicle link", testcase, retry, e);
			e.printStackTrace();
		}
	}
	}
}