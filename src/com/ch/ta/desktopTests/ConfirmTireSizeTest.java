package com.ch.ta.desktopTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.desktopPages.ConfirmTireSizePage;
import com.ch.ta.desktopPages.YMMEPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class ConfirmTireSizeTest extends AbstractTestCaseReport
{

    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

      // Test 2 : To verify the display of 'Confirm Tire Size' page from VIN in
    // Homepage.

    @Test
    public void verifyTireSizeYMMENavigation() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                // HomePage.isYearSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                // HomePage.isModelSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                // HomePage.isSubModeSelectAccordant();
                // SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isconfirmyourtiresize(),
                        "System should display Shop by confirmyourtiresize tab as default.",
                        "System is not displaying Shop by confirmyourtiresize tab as default.");
                testcase.pass("System should display all links.");
                break;

            } catch (Exception e)
            {
                testcase.retry("System is not displaying all links.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test 3,4:To verify the display & functionality of 'back' link in 'Confirm
    // Tire Size' page.
    @Test
    public void verifyBackLinkFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(ConfirmTireSizePage.isConfirmTireSizeDetailsPage(),
                        "system is dispalying confirm tire size details page.",
                        "system is not dispalying confirm tire size details  page.");
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.clickBackLInk();
                SeleniumUtils.wait(10);
                testcase.assertTrue(YMMEPage.isShopByVehicleDefault(),
                        "System should display Shop by vehicle tab as default.",
                        "System is not displaying Shop by vehicle tab as default.");
                testcase.pass("System should navigate the user back to the page where he was before with License Plate Number");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not navigate the user back to the page where he was before with License Plate Number", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }

    // Test 5 : To verify the functionality of tire size link for only one tire
    // size present in 'Confirm Your Tire Size' section of 'Confirm Tire Size'
    // page.
    @Test
    public void verifyOnlyTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(ConfirmTireSizePage.isOneTireSizeLink(),
                        "System should display one tire size link available.",
                        "System is not displaying one tire size link available");
       
                testcase.pass("System should display only one Tire Size link available.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should display only one Tire Size link available", testcase, retry, e);
            e.printStackTrace();
       }
      }
    }

    // Test 6 : To verify the functionality of tire size links for the selected
    // vehicle
    // in 'Confirm Your Tire Size' section of 'Confirm Tire Size' page.
    @Test
    public void verifyAllTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAllTireMakeTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAllTireYearTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAllTireModelTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAllTireSubModelTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(ConfirmTireSizePage.isAllTireSizeLink(),
                        "System should display all tire size links available.",
                        "System is not displaying all tire size links available.");            
                testcase.pass("System should display the list of Tire sizes grouped under respective wheel diameters.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not display the list of Tire sizes grouped under respective wheel diameters", testcase, retry, e);
            e.printStackTrace();
       }
      }
    }

    // Test 7 :To verify the functionality of tire size link in 
    //'Confirm Your Tire Size' section of 'Confirm Tire Size' page.

    @Test
    public void conformYourTireSizeLink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAllTireMakeTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAllTireYearTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAllTireModelTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickAllTireSubModelTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(ConfirmTireSizePage.isAllTireSizeLink(),
                        "System should display all tire size links available.",
                        "System is not displaying all tire size links available.");
                ConfirmTireSizePage.clicTireSizeLink();
                testcase.pass("System should add the vehicle to garage and set as active.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not add the vehicle to garage and set as active", testcase, retry, e);
            e.printStackTrace();
       }  //need to update shop button link
      }
    }
    
    // Test 8,9 :To verify the functionality of tire size link in 
    //'Confirm Your Tire Size' section of 'Confirm Tire Size' page.

    @Test
    public void conformYourTireSizeLinkSideBySide() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSearchBox();
                SeleniumUtils.wait(5);
                YMMEPage.clickOnFord();
                SeleniumUtils.wait(5);
                YMMEPage.EnterYearSearchBox();
                SeleniumUtils.wait(5);
                YMMEPage.clickOnYear();
                SeleniumUtils.wait(5);
                YMMEPage.ClickBmwModelTab();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(ConfirmTireSizePage.isTireLinkSideBySide(),
                        "System should display  tire size links Side by side.",
                        "System is not displaying all tire size Links side by side.");
                ConfirmTireSizePage.clicTireSizeLink();
                testcase.pass("System should display the list of Tire sizes two.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not display the list of Tire sizes two", testcase, retry, e);
            e.printStackTrace();
       }  //need to update shop button link
      }
    }
    
    // Test 10,11,12 :To verify the display of staggered fitment tire size link for the selected vehicle in 'Confirm Your Tire Size'
    //section of 'Confirm Tire Size' page.

    @Test
    public void staggeredfitmenttiresizelink() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.EnterMakeSearchBox1();
                SeleniumUtils.wait(5);
                YMMEPage.clickOnBmw();
                SeleniumUtils.wait(5);
                YMMEPage.EnterYearSearchBox1();
                SeleniumUtils.wait(5);
                YMMEPage.clickOnYear1();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelBmw();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue(ConfirmTireSizePage.isstaggeredfitmenttiresizelink(),
                        "System should display staggered fitment tire size links.",
                        "System is not displaying staggered fitment tire size Links.");
                ConfirmTireSizePage.clickLearnMoreAboutStaggeredLink();
                testcase.assertTrue(ConfirmTireSizePage.isstaggeredfitmentlinkTextBox(),
                        "System should display staggered fitment Text Box.",
                        "System is not displaying staggered fitment Text Box.");
                testcase.pass("System should display the staggered fitment tire size link for the selected vehicle in 'Confirm Tire Size' page.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not display the staggered fitment tire size link for the selected vehicle in 'Confirm Tire Size' page", testcase, retry, e);
            e.printStackTrace();
       }  //need to update shop button link
      }//11 staggered fitment link is not updated
    }

    // Test 14,15 :To verify the display of "My tire Size Isn't Listed" accordion in
    // 'Confirm Tire Size' page.
    @Test
    public void verifyNoTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntDisplayed(),
                        "System should display MyTireSizeIsntListed tab as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed tab as default.");
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed tabs as default.");
                testcase.pass("System should display My tire Size Isn't Listed links .");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not display My tire Size Isn't Listed links", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }


    // Test 16 :To verify the functionality of 'What's this?' link beside 
    //'+Add a different Rear tire size' link in 'Confirm Tire Size' page.
    @Test
    public void NotTireSizeFunctionalityWhat() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed tabs as default.");
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedLinksVerify(),
                        "System should display MyTireSizeIsntListed Links as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed Links as default.");
                ConfirmTireSizePage.isWhatIsThisLink();
                testcase.assertTrue( ConfirmTireSizePage.isWhatIsThisConfirmationMsg(),
                        "System should display ConfirmationMsg as default.",
                        "System is not displaying Shop by ConfirmationMsg  as default.");
                
                testcase.pass("System should display a modal window.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should  not display a modal window", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }

    // Test 17 :To verify the functionality of "Custom Size Results" button on adding custom tire
    //size in 'Confirm Tire Size' page.
    @Test
    public void CustomSizeResultsButtonFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by ConfirmationMsg  as default.");
                SeleniumUtils.javaScriptExecutorDown("200");
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isMytireWidthAccordant();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isMyTireWidthTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isMyTireRatioTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isMyTireDiameterTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isCustomeSizeResultsButton();                       
            testcase.pass("System should add the vehicle to garage and set as active.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not add the vehicle to garage and set as active", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }

    // Test 18 :To verify the functionality of "Add a Different Rear Tire Size"
    // link in 'Confirm Tire Size' page.
    @Test
    public void rearTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
              testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed tabs as default.");
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedLinksVerify(),
                        "System should display MyTireSizeIsntListed Links as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed Links as default.");
                ConfirmTireSizePage.isAddDiffRearTireSizeButton();
                testcase.assertTrue( ConfirmTireSizePage.isRearTireSizeLinksVerify(),
                        "System should display MyTireSizeIsntListed Rear Links Links.",
                        "System is not displaying Shop by MyTireSizeIsntListed Rear Links.");
                testcase.pass("System should display all rear tire size links.");
                
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not display all rear tire size links", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }

    // Test 19 : To verify the display of "Custom size results" button in
    // 'Confirm Tire Size' page.
    @Test
    public void verifyCustomerSizeResults() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by ConfirmationMsg  as default.");
                SeleniumUtils.javaScriptExecutorDown("200");
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isMytireWidthAccordant();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isMyTireWidthTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isMyTireRatioTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isMyTireDiameterTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isAddDiffRearTireSizeButton();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.ClickMyTireRearWidthAccordant();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.ClickMyTireRearWidthTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.ClickMyTireRearRatioTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.ClickMyTireRearDiameterTab();
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isCustomeSizeResultsButton();                       
            testcase.pass("System should add the vehicle to garage and set as active and navigate to Tire Search Results page.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should add the vehicle to garage and set as active and navigate to Tire Search Results page", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }

    // Test 21 :To verify the functionality of "^" accordion of 'My Tire Size Isn't Listed'
    //in 'Confirm Tire Size' page.
    @Test
    public void FunctionalityOfAccordian() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by ConfirmationMsg  as default.");
                ConfirmTireSizePage.ClickMyTireIsntListedAccordantclose();
                testcase.pass("System should collapse the 'My tire Size Isn't Listed' section on Click  ing the \"^\" accordion.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not collapse the 'My tire Size Isn't Listed' section on Click  ing the \"^\" accordion", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }

 /*   // Test 20:To verify the display of "Learn more about Staggered Fitment"
    // link in Confirm Tire Size' page.
    @Test
    public void verifyStaggerdFitment() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            ConfirmTireSizePage.clickVehicleSelector();
            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }*/

    // Test 22,23:To verify the display of "Remove" link of the rear tire size in 'Confirm Tire Size' page.
    @Test
    public void RemoveLinkFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
                testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by ConfirmationMsg  as default.");
                SeleniumUtils.javaScriptExecutorDown("200");
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.isAddDiffRearTireSizeButton();
                SeleniumUtils.wait(5);
                testcase.assertTrue(ConfirmTireSizePage.isDiffRearTireRemoveLink(),
                        "System should display Remove Link.",
                        "System is not displaying RemoveLink");
                SeleniumUtils.wait(5);
                ConfirmTireSizePage.ClickDiffRearTireRemoveLink();
                SeleniumUtils.wait(5);
                
                
                testcase.pass("System should hide the Rear Width, Ratio and Diameter fields in 'Confirm Tire Size' page.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not hide the Rear Width, Ratio and Diameter fields in 'Confirm Tire Size' page.", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }
    // Test 26 : To verify the display of error messages for empty Tires Sizes in 'Confirm Tire Size' page.
    @Test
    public void ToVerifyTheDisplayOfErrorMsg() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
              testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed tabs as default.");
              SeleniumUtils.wait(5);
              testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedLinksVerify(),
                        "System should display MyTireSizeIsntListed Links as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed Links as default.");
              SeleniumUtils.wait(5);
              ConfirmTireSizePage.isCustomeSizeResultsButton();
              SeleniumUtils.wait(5);
              testcase.assertTrue( ConfirmTireSizePage.isErrorMsgDisplayedFrontTire(),
                      "System should display MyTireSizeIsntListed Links as default.",
                      "System is not displaying Shop by MyTireSizeIsntListed Links as default.");
              SeleniumUtils.wait(5);
                testcase.pass("System should display Error message.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not display Error message", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }

    // Test 27:To verify the display of error messages for empty Front Tires & Rear Tires in 'Confirm Tire Size' page.
    @Test
    public void verifyErrorMsgFrontRearTires() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickMakeSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                ConfirmTireSizePage.isMyTireSizeIsntListed();
              testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedTabs(),
                        "System should display MyTireSizeIsntListed tabs as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed tabs as default.");
              SeleniumUtils.wait(5);
              testcase.assertTrue( ConfirmTireSizePage.isMyTireSizeIsntListedLinksVerify(),
                        "System should display MyTireSizeIsntListed Links as default.",
                        "System is not displaying Shop by MyTireSizeIsntListed Links as default.");
              SeleniumUtils.wait(5);
              ConfirmTireSizePage.isAddDiffRearTireSizeButton();
              SeleniumUtils.wait(5);
              ConfirmTireSizePage.isCustomeSizeResultsButton();
              SeleniumUtils.wait(5);
              testcase.assertTrue( ConfirmTireSizePage.isErrorMsgDisplayedFrontTire(),
                      "System should display Please specify the width of your tires Error Msg.",
                      "System is not displaying Please specify the width of your tires Error Msg.");
              SeleniumUtils.wait(5);
              testcase.assertTrue( ConfirmTireSizePage.isErrorMsgDisplayedRearTire(),
                      "System should display Please specify the width of your tires Error Msg.",
                      "System is not displaying Please specify the width of your tires Error Msg.");
              SeleniumUtils.wait(5);
                testcase.pass("System should display Error message.");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not display Error message", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }



   // Test 24,25:To verify the functionality of "Front Tires" in 'Confirm Tire
    // Size' page.
    @Test
    public void ToVerifyTheDisplayOfWarningMsgAndShopButtonFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(0);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(10);
                YMMEPage.ClickMakeSelectAccordant();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelAlfaRomeo();
                SeleniumUtils.wait(5);
                YMMEPage.ClickYearSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickSubModelSelect();
                SeleniumUtils.wait(5);
                YMMEPage.ClickShopButton();
                SeleniumUtils.wait(10);
                testcase.assertTrue( ConfirmTireSizePage.isWarningMsgDisplaying(),
                        "System should display We're sorry Msg.",
                        "System is not displaying We're sorry Msg.");
                SeleniumUtils.wait(3);
                ConfirmTireSizePage.ClickErrorMsgWidthAccordant();
                SeleniumUtils.wait(3);
                ConfirmTireSizePage.ClickErrorMsgWidthTab();
                SeleniumUtils.wait(3);
                ConfirmTireSizePage.ClickErrorMsgRAtioTab();
                SeleniumUtils.wait(3);
                ConfirmTireSizePage.ClickErrorMsgDiameterTAb();
                SeleniumUtils.wait(3);
                ConfirmTireSizePage.ClickErrorMsgShopButton();
                
              
                testcase.pass("System should navigate to tire search results page for the specified size");
                break;

        } catch (Exception e)
        {
            testcase.retry("System should not navigate to tire search results page for the specified size", testcase, retry, e);
            e.printStackTrace();
        }
      }      
    }
}

  /*  // Test 18: To verify the functionality of "Rear Tires" in 'Confirm Tire
    // Size' page.
    @Test
    public void RearTiresFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            ConfirmTireSizePage.clickVehicleSelector();
            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickRearTireSize();
            ConfirmTireSizePage.tireSizeFeatures("", "", "");
            ConfirmTireSizePage.clickCustomerSizeResults();
            ConfirmTireSizePage.clickRearTires();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }
}

  // Test 19 :To verify the display of "-" icon near 'Add A Different Rear
    // Tire Size' in 'Confirm Tire Size' page.
    @Test
    public void verifyIconNearRearTire() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            ConfirmTireSizePage.clickVehicleSelector();
            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.clickRearTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 20: To verify the functionality of "-" icon in Confirm near 'Add A
    // Different Rear Tire Size' in 'Confirm Tire Size' page.
    @Test
    public void iconNearRearTireFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            ConfirmTireSizePage.clickVehicleSelector();
            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.clickRearTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.clickIconNearRearTire();
            testcase.assertFalse(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 21 :To verify the functionality of "^" accordion of 'My Tire Size
    // Isn't Listed' in 'Confirm Tire Size' page.
    @Test
    public void AccordionOfNotTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            ConfirmTireSizePage.clickVehicleSelector();
            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickNotTireSize();
            testcase.assertTrue(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            ConfirmTireSizePage.clickAccordionNotTireSize();
            testcase.assertFalse(ConfirmTireSizePage.isRearTireSizeDropDowns(), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 22 : To verify the display of "Where can I find my Tire Size" link
    // in 'Confirm Tire Size' page.
    @Test
    public void verifyFindMyTireSize() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            ConfirmTireSizePage.clickVehicleSelector();
            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }

    // Test 23 : To verify the functionality of "Where can I find my Tire Size"
    // link in 'Confirm Tire Size' page.
    @Test
    public void findMyTireSizeFunctionality() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            ConfirmTireSizePage.clickVehicleSelector();
            ConfirmTireSizePage.clickVinLink();
            SeleniumUtils.wait(3);
            ConfirmTireSizePage.VinTabData("1HGBH41JXMN109186");
            ConfirmTireSizePage.clickCallToAction();
            ConfirmTireSizePage.clickFindMyTireSize();
            testcase.assertTrue(SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue("", "")), " ", " ");
            testcase.pass("");
        } catch (Exception e)
        {
            testcase.error(" ", e);
            e.printStackTrace();
        }
    }
}*/
