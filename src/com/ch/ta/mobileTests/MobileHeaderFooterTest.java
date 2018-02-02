package com.ch.ta.mobileTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.mobilePages.MobileHeaderFooterPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MobileHeaderFooterTest extends AbstractTestCaseReport implements FileConstants
{

    @BeforeMethod
    public void tyreURL() throws Exception
    {
        CommonUtils.mobileView();
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
            testcase.assertTrue(HeaderFooterPage.verifyTireAmericaLogo(), "Site Logo is displaying",
                    "Site Logo is not displayed");
            Thread.sleep(4000);
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            HeaderFooterPage.clickKnowledgeCenter();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickTireAmericaLogo();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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

            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyPhoneNumber(), "Phone number is displaying",
                    "Phone number is not dispalyed");
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickPhoneNumber();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyLiveChat(), "Live chat is displaying",
                    "Live chat is not displayed");
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickLiveChat();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyCustomerServices(), "Customer Services is displaying",
                    "Customer Services is not displayed");
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickCustomerServices();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyCustomerServicesMenu(),
                    "Customer Services options is displaying", "Customer Services options is not displayed");
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickCustomerServices();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickCustomerServicesContactUs();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickCustomerServices();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickCustomerServicesOrderStatus();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickCustomerServices();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickCustomerServicesReturnOrRefunds();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickCustomerServices();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickCustomerServicesFAQ();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.VerifyFinancingOptions(), "Financing option is displaying",
                    "Financing option is not dispalyed");
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickCustomerServicesContactUs();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & functionality of Financing option page");
        } catch (Exception e)
        {
            testcase.error("Display & functionality of Financing Option page", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyLanguageOption() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.OnHoverLanguageOption();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyLanguageOption(), "Language option is dispalying",
                    "Langauge option is not diaplyed");
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickSpanish();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickItalain();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & functionality of language options");
        } catch (Exception e)
        {
            testcase.error("Display & functionality of language option pages", e);
            e.printStackTrace();
        }
    }

    @Test
	    public void verifySignInOrRegistration() throws Exception
	    {
	        String name = new Object()
	        {}.getClass().getEnclosingMethod().getName();
	        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
	        try
	        {
	        	MobileHeaderFooterPage.clickHamburgerSearchMenu();
	        	SeleniumUtils.wait(5000);
	        	HeaderFooterPage.verifySignInOrRegistration();
	        	SeleniumUtils.wait(5000);
	        	HeaderFooterPage.clickSignInOrRegistration();
	        	SeleniumUtils.wait(5000);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickTireMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyTireMenu(), "Tire menu is displaying",
                    "Tire menu is not dispalyed");
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickTireMenu();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickTireShopByVehicle();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickTireMenu();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickTireShopByTireSize();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickTireMenu();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickTireShopByBrand();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickTireMenu();
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickTireShopByTireType();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyKnowledgeCenter(), "Knowledge Center is displaying",
                    "Knoweledge Center is not dispalyed");
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickKnowledgeCenter();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyDeals(), "Deals link is displaying", "Deals link is dispalyed");
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickDeals();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyInstallers(), "Installers link is displaying",
                    "Installers link is not displayed");
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickInstallers();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyGlobalSearch(), "Globle search is displaying",
                    "Globle search is not displayed");
            SeleniumUtils.wait(5000);
            HeaderFooterPage.enterGlobalSearch();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            testcase.assertTrue(HeaderFooterPage.verifyCart(), "Cart is dispalying", "Cart is not displayed");
            SeleniumUtils.wait(5000);
            HeaderFooterPage.clickCart();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickHamburgerSearchMenu();
            SeleniumUtils.wait(5000);
            MobileHeaderFooterPage.clickTireMenu();
            SeleniumUtils.wait(5000);
            testcase.assertTrue(HeaderFooterPage.verifyTireOptionDeals(), "Deals add is displaying",
                    "Deals add is not displayed");
            HeaderFooterPage.clickTireOptionDeals();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            testcase.assertTrue(HeaderFooterPage.verifyFooterSignUp(), "Footer sign up is dispalying",
                    "Footer Sign up is not displayed");
            SeleniumUtils.wait(6000);
            HeaderFooterPage.enterFooterSignUpEditBox();
            HeaderFooterPage.clickFooterSignUpButton();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            testcase.assertTrue(HeaderFooterPage.verifyFooterSocialMedia(), "Footer Social media is dispalying",
                    "Footer Social media is not displayed");
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterFacebook();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
//            HeaderFooterPage.clickFooterTiwtter();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterInstagram();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & functionality of Footer social media");
        } catch (Exception e)
        {
            testcase.error("Display & functionality of Footer Social media", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyFooterWhyBuyTireFromUs() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            // testcase.assertTrue(HeaderFooterPage.verifyFooterWhyBuyTires(),
            // "Footer Why buy tire from us is dispalying",
            // "Footer Why buy tire from us is not displayed");
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterTireBuyingProcessLink();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterTirePriceGuarantee();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterRecommedInstallers();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickFooterCustomerServices();
            SeleniumUtils.wait(6000);
            testcase.assertTrue(HeaderFooterPage.verifyFooterCustomersServices(),
                    "Footer Customer services is dispalying", "Footer Customer services is not displayed");
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterCustomerServices();
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterContactUs();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterCustomerServices();
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterOrderStatus();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterCustomerServices();
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterRepalceReturn();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickFooterKnowledgeCenter();
            SeleniumUtils.wait(6000);
            testcase.assertTrue(HeaderFooterPage.verifyFooterKnowledgeCenter(), "Footer Knowledge center is dispalying",
                    "Footer Knowledge center is not displayed");
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterKnowledgeCenter();
            HeaderFooterPage.clickFooterTireSizeChart();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterKnowledgeCenter();
            HeaderFooterPage.clickFooterTireKnowledge();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterKnowledgeCenter();
            HeaderFooterPage.clickFooterRoutineManagment();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterKnowledgeCenter();
            HeaderFooterPage.clickFooterEviromentalTips();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterKnowledgeCenter();
            HeaderFooterPage.clickFooterblog();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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

            MobileHeaderFooterPage.clickFooterFinancingOption();
            SeleniumUtils.wait(3000);
            testcase.assertTrue(HeaderFooterPage.verifyFooterFinancingOption(), "Footer financing option is dispalying",
                    "Footer financing option is not displayed");
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterFinancingOption();
            HeaderFooterPage.clickFooterBenefits();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterFinancingOption();
            HeaderFooterPage.clickFooterPayMyBill();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterFinancingOption();
            HeaderFooterPage.clickFooterApplyNow();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            MobileHeaderFooterPage.clickFooterTireInstallerProgram();
            testcase.assertTrue(HeaderFooterPage.verifyFooterTireInstallerProgram(),
                    "Footer tire installers program is dispalying", "Footer tire installers program is not displayed");
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterTireInstallerProgram();
            HeaderFooterPage.clickFooterAboutInstallerPrograms();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterTireInstallerProgram();
            HeaderFooterPage.clickFooterBecomeInsatllers();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            MobileHeaderFooterPage.clickFooterTireInstallerProgram();
            HeaderFooterPage.clickFooterInstallerlogin();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
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
            testcase.assertTrue(HeaderFooterPage.verifyFooterlogoAndCopyRights(),
                    "Footer logo and copy rights is dispalying", "Footer logo and copy rights is not displayed");
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterTermsAndServices();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterPrivacyPolicy();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(6000);
            HeaderFooterPage.clickFooterSitMap();
            SeleniumUtils.wait(5000);
            // testcase.assertTrue(flag, expected, actual);
            SeleniumUtils.wait(5000);
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
            testcase.assertTrue(HeaderFooterPage.verifyFooterCardsLogo(),
                    "Footer card logo and antivirus logo is dispalying",
                    "Footer card logo and antivirus logo is not displayed");

            testcase.pass("Display & functionality of Footer card logo and antivirus logo");
        } catch (Exception e)
        {
            testcase.error("Display & functionality of Footer card logo and antivirus logo", e);
            e.printStackTrace();
        }
    }

    @Test
    public void verifyFooterInValidSignUpLatestDeals() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            tyreURL();
            testcase.assertTrue(HeaderFooterPage.verifyFooterSignUp(), "Footer sign up is dispalying",
                    "Footer Sign up is not displayed");
            testcase.assertEquals(
                    SeleniumUtils.getAttributes(ExcelProperty.getElementValue(HEADER_FOOTER, FOOTER_SIGNUP_ALERT_BOX),
                            "Email Address"),
                    "placeholder");
            SeleniumUtils.wait(5);
            HeaderFooterPage.enterFooterSignUpEditBox();
            HeaderFooterPage.clickFooterSignUpButton();
            SeleniumUtils.wait(5);
            // testcase.assertTrue(flag, expected, actual);
            testcase.pass("Display & functionality of Footer sign up for alert mail");
        } catch (Exception e)
        {
            testcase.error("Display & functionality of Footer Sign Up", e);
            e.printStackTrace();
        }
    }
}
