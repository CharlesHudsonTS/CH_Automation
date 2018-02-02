package com.ch.ta.desktopTests;


import java.util.ArrayList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class HeaderFooterTest extends AbstractTestCaseReport implements FileConstants {
	
	
	    public void tyreURL() throws Exception
	    {
	        CommonUtils.desktopView();
	        CommonUtils.TBCURL();
	    }
	 
	    @Test
	    public void verifyTireAmericaLogo() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyTireAmericaLogo(),"Site Logo is displaying","Site Logo is not displayed");
	        	Thread.sleep(3000);
//	        	HeaderFooterPage.clickKnowledgeCenter();
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickTireAmericaLogo();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(HeaderFooterPage.verifyTireAmericaLogo(),"Site Logo is displaying","Site Logo is not displayed");
	        	testcase.pass("Display & functionality of Tire America logo");
	        } catch (Exception e)
	        {
	            testcase.error("System should display the Home Page", e);
	            e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyPhoneNumber() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyPhoneNumber(),"Phone number is displaying","Phone number is not dispalyed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickPhoneNumber();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of phone number");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Phone number", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyLiveChat() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyLiveChat(),"Live chat is displaying","Live chat is not displayed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickLiveChat();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Live chat");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Live Chat", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyCustomerServices() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyCustomerServices(),"Customer Services is displaying","Customer Services is not displayed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.OnHoverCustomerServices();
	        	SeleniumUtils.wait(5);
	        	testcase.assertTrue(HeaderFooterPage.verifyCustomerServicesMenu(),"Customer Services options is displaying","Customer Services options is not displayed");
	        	testcase.pass("Display & functionality of Customer services ");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Custmoer Services", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyCustomerServicesContactUs() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.OnHoverCustomerServices();
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickCustomerServicesContactUs();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Customer services contact us");
	        } catch (Exception e)
	        {
	        	 testcase.error("Display & functionality of Custmoer Services Contact us page", e);
	        	 e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyCustomerServicesOrderStatus() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.OnHoverCustomerServices();
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickCustomerServicesOrderStatus();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Customer services order status");
	        } catch (Exception e)
	        {
	        	 testcase.error("Display & functionality of Custmoer Services Order status page", e);
	        	 e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyCustomerServicesReturnOrReplace() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.OnHoverCustomerServices();
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickCustomerServicesReturnOrRefunds();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Customer services return/replace");
	        } catch (Exception e)
	        {
	        	 testcase.error("Display & functionality of Custmoer Services Return/Replace page", e);
	        	 e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyCustomerServicesFAQ() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.OnHoverCustomerServices();
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickCustomerServicesFAQ();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Customer services FAQ");
	        } catch (Exception e)
	        {
	        	 testcase.error("Display & functionality of Custmoer Services FAQ page", e);
	        	 e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyFinancingOption() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.VerifyFinancingOptions(),"Financing option is displaying","Financing option is not dispalyed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickFinancingOptions();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Financing option page");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Financing Option page", e);
	            e.printStackTrace();
	        }
	    }
	    
//	    @Test
//	    public void verifyLanguageOption() throws Exception
//	    {
//	        String name = new Object()
//	        {}.getClass().getEnclosingMethod().getName();
//	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
//	        try
//	        {
//	        	
//	          	HeaderFooterPage.OnHoverLanguageOption();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(HeaderFooterPage.verifyLanguageOption(),"Language option is dispalying","Langauge option is not diaplyed");
//	        	Thread.sleep(3000);
//	        	HeaderFooterPage.clickSpanish();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickItalain();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	testcase.pass("Display & functionality of language options");
//	        } catch (Exception e)
//	        {
//	            testcase.error("Display & functionality of language option pages", e);
//	            e.printStackTrace();
//	        }
//	    }
	    
	    @Test
	    public void verifySignInOrRegistration() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),"SignIn/Registration link is dispalying","SignIn/Registration link is not diaplyed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickSignInOrRegistration();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of sign In Or Registration");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of SignIn/Regitration overlay ", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyHeaderTiresMenu() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.onHoverTireMenu();
	        	Thread.sleep(3000);
	        	testcase.assertTrue(HeaderFooterPage.verifyTireMenu(),"Tire menu is displaying","Tire menu is not dispalyed");
	        	testcase.pass("Display & functionality of main menu tires");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Tire menu in header", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyTiresShopByVehicle() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.onHoverTireMenu();
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickTireShopByVehicle();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of shop by vehicle");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Tire menu in shop by vehicle", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyTiresByTireSize() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.onHoverTireMenu();
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickTireShopByTireSize();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of shop by tire size");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Tire menu in shop by tire size", e);
	            e.printStackTrace();
	        }
	        
	        
	    }
	    
	    
	    @Test
	    public void verifyTiresShopByBrand() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.onHoverTireMenu();
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickTireShopByBrand();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of tires shop by brand");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Tire menu in Shop by brand", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyTiresShopByTireType() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.onHoverTireMenu();
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickTireShopByTireType();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Tire shop by Tire Type");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Tire menu in shop by tire type", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyKnowledgeCenter() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyKnowledgeCenter(),"Knowledge Center is displaying","Knoweledge Center is not dispalyed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickKnowledgeCenter();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of knowledge center page");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Knowledge center page", e);
	            e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyDeals() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyDeals(),"Deals link is displaying","Deals link is dispalyed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickDeals();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of main menu deals");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of deals page", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyInstallers() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyInstallers(),"Installers link is displaying","Installers link is not displayed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickInstallers();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of installers page");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of installers page", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyGlobleSearch() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyGlobalSearch(),"Globle search is displaying","Globle search is not displayed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.enterGlobalSearch();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of globle search page");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of globle search page", e);
	            e.printStackTrace();
	        }
	    }

	    @Test
	    public void verifyCart() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyCart(),"Cart is dispalying","Cart is not displayed");
	        	Thread.sleep(3000);
	        	HeaderFooterPage.clickCart();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of cart page");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of cart page", e);
	            e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyTireMenuOptionDealsAdd() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	HeaderFooterPage.onHoverTireMenu();
	        	Thread.sleep(3000);
	        	testcase.assertTrue(HeaderFooterPage.verifyTireOptionDeals(),"Deals add is displaying","Deals add is not displayed");
	        	HeaderFooterPage.clickTireOptionDeals();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of deals add in tire menu");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of deal add in tire menu", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyFooterSignUpLatestDeals() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterSignUp(),"Footer sign up is dispalying","Footer Sign up is not displayed");
	        	testcase.assertEquals("Email Address",SeleniumUtils.getAttributes(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SIGNUP_ALERT_BOX) , "placeholder"));
	        	SeleniumUtils.wait(5);
	        	HeaderFooterPage.enterFooterSignUpEditBox();
	        	SeleniumUtils.wait(2);
	        	HeaderFooterPage.clickFooterSignUpButton();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Footer sign up for alert mail");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Footer Sign Up", e);
	            e.printStackTrace();
	        }
	    }
	    
	    //@Test
	    public void verifyFooterInValidSignUpLatestDeals() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterSignUp(),"Footer sign up is dispalying","Footer Sign up is not displayed");
	        	testcase.assertEquals(SeleniumUtils.getAttributes(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SIGNUP_ALERT_BOX), "Email Address"), "placeholder");
	        	SeleniumUtils.wait(5);
	        	HeaderFooterPage.enterFooterSignUpEditBox();
	        	HeaderFooterPage.clickFooterSignUpButton();
	        	SeleniumUtils.wait(5);
	        	//testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Footer sign up for alert mail");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Footer Sign Up", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyFooterSocialMedia() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	
	        	tyreURL();
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterSocialMedia(),"Footer Social media is dispalying","Footer Social media is not displayed");
	        	SeleniumUtils.wait(5);
	        	HeaderFooterPage.clickFooterFacebook();
	        	SeleniumUtils.wait(8);
	        	String windowHandle = DriverFactory.getDriver().getWindowHandle();
	        	ArrayList<String> newTab = new ArrayList<String>(DriverFactory.getDriver().getWindowHandles());
	        	DriverFactory.getDriver().switchTo().window(newTab.get(1));
	        	String currentUrl1 = DriverFactory.getDriver().getCurrentUrl();
				boolean contains1 = currentUrl1.contains("facebook");
				testcase.assertTrue(contains1, "Correct Navigation", "InCorrect Navigation");
	        	DriverFactory.getDriver().switchTo().window(windowHandle);
	        	SeleniumUtils.wait(5);
	        	HeaderFooterPage.clickFooterTwitter();
	        	SeleniumUtils.wait(5);
	        	ArrayList<String> newTab1 = new ArrayList<String>(DriverFactory.getDriver().getWindowHandles());
	        	DriverFactory.getDriver().switchTo().window(newTab1.get(2));
	        	String currentUrl2 = DriverFactory.getDriver().getCurrentUrl();
				boolean contains2 = currentUrl2.contains("twitter");
				testcase.assertTrue(contains2, "Correct Navigation", "InCorrect Navigation");
	        	DriverFactory.getDriver().switchTo().window(windowHandle);
	        	SeleniumUtils.wait(5);
	        	HeaderFooterPage.clickFooterInstagram();
	        	SeleniumUtils.wait(5);
	        	ArrayList<String> newTab2 = new ArrayList<String>(DriverFactory.getDriver().getWindowHandles());
	        	DriverFactory.getDriver().switchTo().window(newTab2.get(3));
	        	String currentUrl3 = DriverFactory.getDriver().getCurrentUrl();
				boolean contains3 = currentUrl3.contains("instagram");
				testcase.assertTrue(contains3, "Correct Navigation", "InCorrect Navigation");
	        	DriverFactory.getDriver().switchTo().window(windowHandle);
	        	SeleniumUtils.wait(5);
	        	HeaderFooterPage.clickFooterWordPress();
	        	SeleniumUtils.wait(5);
	        	ArrayList<String> newTab3 = new ArrayList<String>(DriverFactory.getDriver().getWindowHandles());
	        	DriverFactory.getDriver().switchTo().window(newTab3.get(4));
	        	String currentUrl4 = DriverFactory.getDriver().getCurrentUrl();
	        	boolean contains4 = currentUrl4.contains("wordpress");
				testcase.assertTrue(contains4, "Correct Navigation", "InCorrect Navigation");
	        	DriverFactory.getDriver().switchTo().window(windowHandle);
	        	testcase.pass("Display & functionality of Footer social media:\n"+currentUrl1+"\n"+currentUrl2+"\n"+currentUrl3+"\n"+currentUrl4);
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Footer Social media", e);
	            e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyFooterTireAmericaAdvantage() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	SeleniumUtils.wait(9);
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterTireAmericaAdvan(),"Footer tire america advantage from us is dispalying","Footer tire america advantage is not displayed");
	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterTireBuyingProcessLink();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterTirePriceGuarantee();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterRecommedInstallers();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Footer why buy tire from us");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of footer why buy tire from us", e);
	            e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyFooterCustomersServices() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	SeleniumUtils.wait(9);
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterCustomersServices(),"Footer Customer services is dispalying","Footer Customer services is not displayed");
	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterContactUs();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterOrderStatus();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterRepalceReturn();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Footer Customer services");
	        } catch (Exception e)
	        {
	          testcase.error("Display & functionality of Footer Customer services", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyFooterKnowledgeCenter() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	SeleniumUtils.wait(9);
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterKnowledgeCenter(),"Footer Knowledge center is dispalying","Footer Knowledge center is not displayed");
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterTireSizeChart();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterTireKnowledge();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterRoutineManagment();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterEviromentalTips();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterblog();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Footer Knowledge center options");
	        } catch (Exception e)
	        {
	          testcase.error("Display & functionality of Knowledge center options", e);
	            e.printStackTrace();
	        }
	    }
	    
	    @Test
	    public void verifyFooterFinancingOption() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	SeleniumUtils.wait(9);
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterFinancingOption(),"Footer financing option is dispalying","Footer financing option is not displayed");
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterBenefits();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterPayMyBill();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterApplyNow();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Footer financing options");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of footer financing option", e);
	            e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyFooterTireInstallerPrograms() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	SeleniumUtils.wait(9);
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterTireInstallerProgram(),"Footer tire installers program is dispalying","Footer tire installers program is not displayed");
	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterAboutInstallerPrograms();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterBecomeInsatllers();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterInstallerlogin();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
	        	testcase.pass("Display & functionality of Footer tire installers program");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of  footer tire installers program", e);
	            e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyFooterLogoAndCopyRights() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	SeleniumUtils.wait(9);
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterlogoAndCopyRights(),"Footer logo and copy rights is dispalying","Footer logo and copy rights is not displayed");
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterTermsAndServices();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterPrivacyPolicy();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
//	        	HeaderFooterPage.clickFooterSitMap();
//	        	SeleniumUtils.wait(5);
//	        	testcase.assertTrue(flag, expected, actual);
//	        	SeleniumUtils.wait(5);
	        	testcase.pass("Display & functionality of Footer site logo and copy rights");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of  footer logo and copy rights", e);
	            e.printStackTrace();
	        }
	    }
	    
	    
	    @Test
	    public void verifyFooterCardsLogo() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	tyreURL();
	        	SeleniumUtils.wait(9);
	        	testcase.assertTrue(HeaderFooterPage.verifyFooterCardsLogo(),"Footer card logo and antivirus logo is dispalying","Footer card logo and antivirus logo is not displayed");
	        	
	        	testcase.pass("Display & functionality of Footer card logo and antivirus logo");
	        } catch (Exception e)
	        {
	            testcase.error("Display & functionality of Footer card logo and antivirus logo", e);
	            e.printStackTrace();
	        }
	    }
}
