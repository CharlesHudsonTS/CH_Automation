package com.ch.ta.desktopTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.bean.User;
import com.ch.ta.desktopPages.CreateAccWithEmailPage;
import com.ch.ta.desktopPages.CreateAnAccountPage;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.LoginPage;
import com.ch.ta.desktopPages.MyAccountPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class CreateAccWithEmailTest extends AbstractTestCaseReport implements FileConstants
{
    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();

    }
    // TA_REG_11
    // To verify the display of 'Setup Your Account' title & 'Log In' link in
    // 'Setup Your Account' page.

    // TA_REG_12
    // To verify the display of 'Setup Your Account' title & 'Log In' link in
    // 'Setup Your Account' page.
    @Test
    public void verifyTheCreateText() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAccWithEmailPage.isDisplaySetupAccount(),
                        "Setup Your Account title displayed", "Setup Your Account title not displayed");

                testcase.assertTrue(CreateAccWithEmailPage.isDisplaySetupAccountDetails(),
                        "system should display setup account details",
                        "system should " + "not display setup account details");
                testcase.pass(
                        "To verify the display of 'Setup Your Account' title & 'Log In' link in 'Setup Your Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the display of 'Setup Your Account' title & 'Log In' link in 'Setup Your Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_13
    // To verify the display and functionality of 'Tire America terms' link for
    // the 'I agree to Tire America terms'
    // checkbox in 'Setup Your Account' page.
    @Test
    public void tireAmericaTerms() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAccWithEmailPage.isDisplayTireAmericaTerms(),
                        "system should display Tire America Terms", "system should  not display Tire America Terms");
                SeleniumUtils.javaScriptExecutorDown("400");
                CreateAccWithEmailPage.clickOnTireAmericaTerms();
                testcase.assertTrue(CreateAccWithEmailPage.isDisplayTermsAndConditions(),
                        "system should display terms and conditions",
                        "system should  not display terms and conditions");
                testcase.pass(
                        "To verify the display and functionality of 'Tire America terms' link for the 'I agree to Tire America terms'checkbox in 'Setup Your Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the display and functionality of 'Tire America terms' link for the 'I agree to Tire America terms'checkbox in 'Setup Your Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }

    }

    // TA_REG_15
    // To verify the display of 'Password' & 'Confirm Password' text fields
    // placeholder and the tip in 'Setup Your Account' page.
    // TA_REG_14
    // To verify the display of 'Email Address' & 'Confirm Email Address'
    // text field placeholder in 'Setup Your Account' page.
    @Test
    public void addressPlaceholders() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                testcase.assertEquals("Email Address", SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_TEXTBOX), "placeholder"));
                SeleniumUtils.wait(5);
                testcase.assertEquals("Confirm Email Address", SeleniumUtils.getAttributes(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_EMAIL_TEXTBOX),
                                "placeholder"));
                SeleniumUtils.wait(5);
                testcase.assertEquals("Password", SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC), "placeholder"));
                testcase.assertEquals("Confirm Password",SeleniumUtils.getAttributes(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC),
                                "placeholder"));
                testcase.pass(
                        "To verify the display of 'Email Address' & 'Confirm Email Address','Password','Confirm Password' text field placeholder in 'Setup Your Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the display of 'Email Address' & 'Confirm Email Address','Password','Confirm Password' text field placeholder in 'Setup Your Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_16
    // To verify that the 'Email Address' & 'Confirm Email Address' placeholder
    // disappears
    // when the text field is focused in 'Create an Account' page.
    // TA_REG_17
    // To verify that the 'Password & Confirm Password' placeholder disappears
    // when the text fields is focused in 'Create an Account' page.

    @Test
    public void emailAddressPlaceholderTestAndDisap() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String attributes = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_EMAIL_ADDRESS),
                        "placeholder");
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Email Address");
                SeleniumUtils.wait(1);
                String data = "manu@gmail.com";
                CreateAccWithEmailPage.enterEmailAddress(data);
                String attributes1 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_EMAIL_ADDRESS), "value");
                testcase.assertEquals("Email Address",
                        SeleniumUtils.getAttributes(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_ADDRESS_CREATE_ACC),
                                "placeholder"));
                SeleniumUtils.wait(3);
                String attributes2 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_CONFIRM_EMAIL_ADDRESS),
                        "placeholder");
                System.out.println(attributes2);
                testcase.assertEquals(attributes2, "Confirm Email Address");
                SeleniumUtils.wait(1);
                String data1 = "manu@gmail.com";
                CreateAccWithEmailPage.enterConfirmEmailAddress(data1);
                String attributes3 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_CONFIRM_EMAIL_ADDRESS),
                        "value");
                testcase.assertEquals("Confirm Email Address", SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONF_EMAIL_ADDRESS_CREATE_ACC),
                        "placeholder"));
                SeleniumUtils.wait(3);
                String attributes4 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_PASSWORD), "placeholder");
                System.out.println(attributes4);
                testcase.assertEquals(attributes4, "Password");
                SeleniumUtils.wait(1);
                String data2 = "Test@123";
                CreateAccWithEmailPage.clickOnPassword(data2);
                String attributes5 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_PASSWORD), "value");
                testcase.assertEquals("Password", SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC), "placeholder"));
                SeleniumUtils.wait(3);
                String attributes6 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_CONFIRM_PASSWORD),
                        "placeholder");
                System.out.println(attributes6);
                testcase.assertEquals(attributes6, "Confirm Password");
                SeleniumUtils.wait(1);
                String data3 = "Test@123";
                CreateAccWithEmailPage.clickOnConfirmPassword(data3);
                String attributes7 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICKON_CONFIRM_PASSWORD), "value");
                testcase.assertEquals("Confirm Password",
                        SeleniumUtils.getAttributes(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC),
                                "placeholder"));
                testcase.pass(
                        "To verify that the 'Email Address' & 'Confirm Email Address'&'Password'&'Confirm Password' placeholder disappears "
                                + "when the text field is focused in 'Create an Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify that the 'Email Address' & 'Confirm Email Address'&'Password'&'Confirm Password'  placeholder disappears "
                                + "when the text field is focused in 'Create an Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_18
    // To verify the display of placeholder for 'ZIP Code' text box and
    // disappears when the text fields is focused in 'Create an Account' page.
    @Test
    public void zipCodePlaceholdersTextFields() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String attributes = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICK_ZIPCODE), "placeholder");
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Zip Code");
                SeleniumUtils.wait(1);
                String data = "99023";
                CreateAccWithEmailPage.enterZipcodedata(data);
                SeleniumUtils.wait(3);
                String attributes1 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CLICK_ZIPCODE), "value");
                testcase.assertEquals("Zip Code", SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ZIPCODE_CREATE_ACC), "placeholder"));
                System.out.println("value :: " + attributes1);
                if (data.contains(attributes1))
                {

                    testcase.pass("To verify the display of placeholder for 'ZIP Code' text box and "
                            + "disappears when the text fields is focused in 'Create an Account' page.");
                } else
                {
                    testcase.fail("system not clears the 'Helper Text\\\" when user clicks inside the Zip code bar.",
                            "system not clears the 'Helper Text\\\\\\\" when user clicks inside the Zip code bar.");

                }
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the display of placeholder for 'ZIP Code' text box and "
                                + "disappears when the text fields is focused in 'Create an Account' page.",
                        testcase, retry, e);
            }
        }
    }

    // TA_REG_19
    // To verify the display of titles for 'Email Address', 'Confirm Email
    // Address', Password', 'Confirm Password',
    // 'ZIP Code' text boxes when the text fields are focused in 'Create an
    // Account' page.
    @Test
    public void verifyTitlesOfTextFields() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("T");
                String attribute = SeleniumUtils.getText(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_EMAIL_ADDRESS_TITLE));
                testcase.assertEquals("Email Address", attribute);
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("T");
                String attribute1 = SeleniumUtils.getText(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_CONFIRM_EMAIL_ADDRESS_TITLE));
                testcase.assertEquals("Confirm Email Address", attribute1);
                CreateAccWithEmailPage.enterPwdCreateAccEmail("t");
                String attribute2 = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_PSWD_TITLE));
                testcase.assertEquals("Password", attribute2);
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("t");
                String attribute3 = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_CONFIRMPSWD_TITLE));
                testcase.assertEquals("Confirm Password", attribute3);
                CreateAccWithEmailPage.enterZipcodeAccEmail("99");
                String attribute4 = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DISPLAY_ZIPCODE_TITLE));
                testcase.assertEquals("Zip Code", attribute4);
                testcase.pass(
                        "To verify the display of titles for 'Email Address', 'Confirm Email Address', Password', 'Confirm Password', "
                                + "'ZIP Code' text boxes when the text fields are focused in 'Create an Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the display of titles for 'Email Address', 'Confirm Email Address', Password', 'Confirm Password', "
                                + "'ZIP Code' text boxes when the text fields are focused in 'Create an Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_20
    // To verify that the guest user is able to create account in 'Setup Your
    // Account' page.
    @Test
    public void creatingAccount() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String random = User.random();
                CreateAccWithEmailPage.enterEmailCreateAccEmail(random + "Test89@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail(random + "Test89@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("test@345");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("test@345");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickAgreeTermsNConditions();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickCreateYourAccBtn();
                SeleniumUtils.wait(15);
                testcase.assertTrue(MyAccountPage.isMyAccountLink(), "system should display my account ",
                        "system should not display my account");
                testcase.pass("To verify that the guest user is able to create account  in 'Setup Your Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry("To verify that the guest user is able to create account  in 'Setup Your Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_21
    // To verify that the registered user gets confirmation email after
    // successful registration to the site.
    @Test
    public void confirmationMail() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String random = User.random();
                CreateAccWithEmailPage.enterEmailCreateAccEmail(User.random() + "demo@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail(User.random() + "demo@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("demo@123");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("demo@123");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickAgreeTermsNConditions();
                try
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                } catch (Exception e)
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                }
                SeleniumUtils.wait(5);
                String attribute = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACCOUNT, DISPLAY_MESSAGE));
                System.out.println(attribute);
                testcase.assertEquals("YOU’RE ALL SET.\nLET’S GET STARTED!", attribute);
                SeleniumUtils.wait(5);
                String attribute1 = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACCOUNT, DISPLAY_MESSAGE1));
                System.out.println(attribute1);
                testcase.assertEquals("Enter your vehicle information to browse products specific to you.", attribute1);
                testcase.assertTrue(CreateAnAccountPage.isDisplayShopButton(), "system should display shop button",
                        "system should not display shop button");
                SeleniumUtils.wait(05);
                testcase.pass(
                        "To verify that the registered user gets confirmation email after successful registration to the site.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify that the registered user gets confirmation email after successful registration to the site.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_22
    // To verify the functionality of 'SHOW' button in password field in 'Setup
    // Your Account' page.
    // TA_REG_34
    // To verify the display of characters in password fields in 'Setup Your
    // Account' page.

    @Test
    public void showButtonInPwd() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                SeleniumUtils.wait(5);
                String attribute = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC), "type");
                System.out.println(attribute);
                testcase.assertEquals("password", attribute);
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickShowPwdButton();
                String attribute1 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC), "type");
                System.out.println(attribute1);
                testcase.assertEquals("text", attribute1);
                testcase.pass("Functionality of SHOW button in password field in create account with email page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Functionality of SHOW button in password field in create account with email page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    @Test
    public void showButtonInConfPwd() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@123");
                String attribute2 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC), "type");
                System.out.println(attribute2);
                testcase.assertEquals("password", attribute2);
                SeleniumUtils.wait(2);
                CreateAccWithEmailPage.clickShowConfrmPwdButton();
                SeleniumUtils.wait(2);
                String attribute3 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC), "type");
                System.out.println(attribute3);
                testcase.assertEquals("text", attribute3);
                testcase.pass("Functionality of SHOW button in password field in create account with email page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Functionality of SHOW button in password field in create account with email page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_23
    // To verify the functionality of 'HIDE' button in password field in 'Setup
    // Your Account' page..
    @Test
    public void hideButtonInPwd() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("test@gmail.com");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickShowPwdButton();
                CreateAccWithEmailPage.clickOnPassword();
                String attribute = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC), "type");
                System.out.println(attribute);
                testcase.assertEquals("text", attribute);
                CreateAccWithEmailPage.clickHidePwdButton();
                String attribute1 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC), "type");
                System.out.println(attribute1);
                testcase.assertEquals("password", attribute1);
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@123");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickShowConfrmPwdButton();
                CreateAccWithEmailPage.clickOnConfrmPassword();
                SeleniumUtils.wait(5);
                String attribute2 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC), "type");
                System.out.println(attribute2);
                testcase.assertEquals("text", attribute2);
                CreateAccWithEmailPage.clickHideConfrmPwdButton();
                String attribute3 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC), "type");
                System.out.println(attribute3);
                testcase.assertEquals("password", attribute3);
                testcase.pass("Functionality of HIDE button in password field in create account with email page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Functionality of HIDE button in password field in create account with email page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_24
    // To verify the display of error messages when the mandatory fields are
    // left blank while creating account in 'Setup Your Account' page.
    @Test
    public void vrfyErrMsgForMandatorFrCreatAcc() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickCreateYourAccBtn();
                SeleniumUtils.wait(5);
                String attributes = SeleniumUtils.getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_ADDRESS_CREATE_ACC_ERR_MSG));
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Please enter your email address");
                String attributes1 = SeleniumUtils.getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE,
                        CONF_EMAIL_ADDRESS_CREATE_ACC_ERR_MSG));
                System.out.println(attributes1);
                testcase.assertEquals(attributes1, "Please enter your email address");
                String attributes2 = SeleniumUtils.getText(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PASSWORD_CREATE_ACC_ERR_MSG));
                System.out.println(attributes2);
                testcase.assertEquals(attributes2, "Please confirm your password.");
                SeleniumUtils.wait(5);
                String attributes3 = SeleniumUtils.getText(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, CONFIRM_PASSWORD_CREATE_ACC_ERR_MSG));
                System.out.println(attributes3);
                testcase.assertEquals(attributes3, "Please confirm your password.");
                String attributes4 = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, TERMS_N_COND_LINK_ERR_MSG));
                System.out.println(attributes4);
                testcase.assertEquals(attributes4, "Please accept the Tire America Terms.");
                testcase.pass("Error message for Account creation with blank fields in create account with email page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Error message for Account creation with blank fields in create account with email page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_25
    // To verify the display of error message when already existing
    // email address is entered in 'Setup Your Account' page.e.
    @Test
    public void alreadyRegisteredCreateAccError() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickAgreeTermsNConditions();
                SeleniumUtils.wait(15);
                try
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                } catch (Exception e)
                {
                    SeleniumUtils.wait(04);
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                }
                SeleniumUtils.wait(04);
                String attributes = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EXIST_EMAIL_ERROR_MSG));
                System.out.println(attributes);
                testcase.assertEquals(attributes,
                        "error_existed_email");
                testcase.pass(
                        "Error message for Account creation with already registered email address in create account with email page");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "Error message for Account creation with already registered email address in create account with email page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_26
    // To verify the display of error message when user enters invalid
    // email address in 'Email Address' text field in 'Setup Your Account' page.
    @Test
    public void invalidEmailCreateAccError() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("gdjashkdj");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickAgreeTermsNConditions();
                SeleniumUtils.wait(03);
                try
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                } catch (Exception e)
                {
                    SeleniumUtils.wait(04);
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                }
                SeleniumUtils.wait(04);
                String attributes = SeleniumUtils.getText(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, EMAIL_ADDRESS_CREATE_ACC_ERR_MSG));
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Please enter your email address");
                testcase.pass(
                        "Error message for Account creation with invalid email address in create account with email page");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "Error message for Account creation with invalid email address in create account with email page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_27
    // To verify the display of error message when user does not accept Tire
    // America terms while creating account in 'Setup Your Account' page.
    @Test
    public void unselectTermsCondCreateAccError() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String random = User.random();
                CreateAccWithEmailPage.enterEmailCreateAccEmail(User.random() + "test@gmailcom");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail(User.random() + "test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                try
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                } catch (Exception e)
                {
                    SeleniumUtils.wait(04);
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                }
                SeleniumUtils.wait(04);
                String attributes = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, TERMS_N_COND_LINK_ERR_MSG));
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Please accept the Tire America Terms.");
                testcase.pass(
                        "Error message for Account creation with unselected Terms and conditions check box in create account with email page");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "Error message for Account creation with unselected Terms and conditions check box in create account with email page",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_28
    // To verify the display of error message when user enters two different
    // email addresses in 'Email Address' & 'Confirm Email Address' text box
    // while creating account in 'Setup Your Account' page.
    @Test
    public void vrfyErrMsgFrTwoDiffEmailInCreatAcc() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("tes@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickAgreeTermsNConditions();
                SeleniumUtils.wait(03);
                try
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                } catch (Exception e)
                {
                    SeleniumUtils.wait(04);
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                }
                SeleniumUtils.wait(04);
                String attributes = SeleniumUtils.getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE,
                        CONF_EMAIL_ADDRESS_CREATE_ACC_ERR_MSG));
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Your email addresses do not match.");
                testcase.pass("Vrfy the error message for the two different email ID for create account.");
                break;
            } catch (Exception e)
            {
                testcase.retry("Vrfy the error message for the two different email ID for create account.", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_29
    // To verify the display of error message when user enters two different
    // passwords in 'Password' & 'Confirm Password' text box while creating
    // account in 'Setup Your Account' page.

    @Test
    public void vrfyErrMsgFrTwoDiffPasswrdInCreatAcc() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@12");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickAgreeTermsNConditions();
                SeleniumUtils.wait(03);
                try
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                } catch (Exception e)
                {
                    SeleniumUtils.wait(04);
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                }
                SeleniumUtils.wait(04);
                String attributes = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PSWD_MATCH_CONFIRMATION));
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Match confirmation");
                testcase.pass("Vrfy the error message for the two different Password for create account.");
                break;
            } catch (Exception e)
            {
                testcase.retry("Vrfy the error message for the two different Password for create account.", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_30
    // To verify the display of error message when user enters invalid password
    // in 'Password' text box while creating account in 'Setup Your Account'
    // page.

    @Test
    public void verfyInvalidPwdErrMsg() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail("test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test12");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@12");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickAgreeTermsNConditions();
                SeleniumUtils.wait(03);
                try
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                } catch (Exception e)
                {
                    SeleniumUtils.wait(04);
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                }
                SeleniumUtils.wait(04);
                String attributes = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEAST_NUMBERS));
                System.out.println(attributes);
                testcase.assertEquals(attributes, "Be at least 8 characters");
                String attributes1 = SeleniumUtils
                        .getText(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, PSWD_MATCH_CONFIRMATION));
                System.out.println(attributes1);
                testcase.assertEquals(attributes1, "Match confirmation");
                testcase.pass("Vrfy the error message for the two different Password for create account.");
                break;
            } catch (Exception e)
            {
                testcase.retry("Vrfy the error message for the two different Password for create account.", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_31
    // To verify the display of 'KEEP IN CONTACT' section in 'Setup Your
    // Account' page.
    // TA_REG_32
    // To verify that the user is able to uncheck the 'KEEP IN CONTACT' check
    // box in 'Setup Your Account' page.
    @Test
    public void unCheckKeepInContact() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickOnKeepInContact();
                CreateAccWithEmailPage.isStaticTextKeepInContact();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAccWithEmailPage.isDisplayKeepInContactTitle(),
                        "system should  display keep in contact text",
                        "system should  not display keep in contact text");
                String attribute = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, SELECT_CHECKBOX), "value");
                System.out.println(attribute);
                testcase.assertEquals("true", attribute);
                CreateAccWithEmailPage.clickOnCheckBox();
                String attribute1 = SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, SELECT_CHECKBOX), "value");
                System.out.println(attribute1);
                testcase.assertEquals("", attribute1);
                testcase.pass(
                        "To verify that the user is able to uncheck the 'KEEP IN CONTACT' check box in 'Setup Your Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify that the user is able to uncheck the 'KEEP IN CONTACT' check box in 'Setup Your Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_33
    // To verify that the user is able to create account by
    // subscribing to special offers in 'Setup Your Account' page.
    @Test
    public void createAccount() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String random = User.random();
                CreateAccWithEmailPage.enterEmailCreateAccEmail(User.random() + "test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail(User.random() + "test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickOnKeepInContact();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickAgreeTermsNConditions();
                SeleniumUtils.wait(03);
                try
                {
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                } catch (Exception e)
                {
                    SeleniumUtils.wait(04);
                    CreateAccWithEmailPage.clickCreateYourAccBtn();
                }
                SeleniumUtils.wait(03);
                CreateAnAccountPage.clickOnShopTiresByBrand();
                String currenturl = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("http://stage.tireamerica.com/tires/shop-by-tire-brand", currenturl);
                DriverFactory.getDriver().navigate().back();
                CreateAnAccountPage.clickOnShopTiresByType();
                String currenturl2 = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("http://stage.tireamerica.com/tires/shop-by-tire-type", currenturl2);
                DriverFactory.getDriver().navigate().back();
                CreateAnAccountPage.clickOnShopTiresBySize();
                String currenturl3 = DriverFactory.getDriver().getCurrentUrl();
                testcase.assertEquals("http://stage.tireamerica.com/tires/shop-by-tire-size", currenturl3);
                DriverFactory.getDriver().navigate().back();
                testcase.pass(
                        "To verify that the user is able to create account by subscribing to special offers in 'Setup Your Account' page.");
                break;

            } catch (Exception e)
            {
                testcase.retry(
                        "To verify that the user is able to create account by subscribing to special offers in 'Setup Your Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_35
    // To verify the display of password requirements in 'SETUP YOUR ACCOUNT'
    // section in 'Setup Your Account' page.
    @Test
    public void displayPswdReqForSetYourAcc() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Tester@123");
                // defalut password req
                testcase.assertTrue(CreateAccWithEmailPage.displayPswdRequrs(),
                        "system should display password requirements",
                        "system should  not display password requirements");
                testcase.pass(
                        "To verify the display of password requirements in 'SETUP YOUR ACCOUNT' section in 'Setup Your Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "To verify the display of password requirements in 'SETUP YOUR ACCOUNT' section in 'Setup Your Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // TA_REG_41
    // To verify that the user is able to navigate to 'My Account' page.
    @Test
    public void myAccount() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                LoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                testcase.assertTrue(LoginPage.isDisplayedMyAccount(), "system should display my account",
                        "system should  not display my account");
                testcase.pass("User is able to Log In to his account by entering valid credentials in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("User is able to Log In to his account by entering valid credentials in Sign In flyout",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // default password req
    // TA_REG_36
    // To verify that system dynamically checks whether password strength
    // requirements are met in 'Setup Your Account' page.
    @Test
    public void passwordStrength() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String random = User.random();
                CreateAccWithEmailPage.enterEmailCreateAccEmail(User.random() + "Tester456@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail(User.random() + "Tester456@gmail.com");
                SeleniumUtils.wait(2);
                String[] passwords = { "test", "test1", "test1234" };
                System.out.println(passwords.length);
                for (int i = 0; i < passwords.length; i++)
                {
                    CreateAccWithEmailPage.enterPwdCreateAccEmail(passwords[i]);
                    if (i == 0)
                    {
                        testcase.assertTrue(SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_LETTER_REQ)),
                                "Letter Req is met", "Letter Req is not met");
                        testcase.assertTrue(
                                SeleniumUtils.iSDisplayed(
                                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, DEFALUT_NUMBER)),
                                "number req is defalut", "number not req is defalut");
                        testcase.assertTrue(
                                SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE,
                                        DEFALUT_ATLEAST_CHARS)),
                                "Atleast chars req is defalut", "Atleast req is defalut");
                        testcase.assertTrue(
                                SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE,
                                        DEFALUT_MATCH_CONFIRM)),
                                " Match Confirm req is defalut", "Match Confirm  not req is defalut");

                    } else if (i == 1)
                    {
                        testcase.assertTrue(
                                SeleniumUtils.iSDisplayed(
                                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEST_ONE_LETTER)),
                                "Letter Req is met", "Letter Req is not met");
                        testcase.assertTrue(
                                SeleniumUtils.iSDisplayed(
                                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEAST_ONE_NUMBER)),
                                "Number Req is met", "Number Req is not met");
                    } else if (i == 2)
                    {
                        testcase.assertTrue(
                                SeleniumUtils.iSDisplayed(
                                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEST_ONE_LETTER)),
                                "Letter Req is met", "Letter Req is not met");
                        testcase.assertTrue(
                                SeleniumUtils.iSDisplayed(
                                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEAST_ONE_NUMBER)),
                                "Number Req is met", "Number Req is not met");
                        testcase.assertTrue(
                                SeleniumUtils.iSDisplayed(
                                        ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, ATLEAST_EIGHT_CHARS)),
                                "Minimum length Req is met", "Minimum length Req is not met");

                    }

                }
                testcase.pass(
                        "System dynamically checks whether password strength requirements are met in 'Create an Account' form page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System dynamically checks whether password strength requirements are met in 'Create an Account' form page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
    }

    // TA_REG_38
    // To verify that system dynamically checks the password strength
    // requirements even on removing cursor from password field in 'Setup Your
    // Account' page.
    @Test
    public void removingCursorFromPswd() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String random = User.random();
                CreateAccWithEmailPage.enterEmailCreateAccEmail(User.random() + "Tester456@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail(User.random() + "Tester456@gmail.com");
                SeleniumUtils.wait(2);
                String[] passwords = { "test1234", "test123", "test", "" };
                CreateAccWithEmailPage.enterPwdCreateAccEmail(passwords[0]);
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_LETTER_REQ)),
                        "Letter Req is met", "Letter Req is not met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_NUMBER_REQ)),
                        "Number Req is met", "Number Req is not met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_MIN_LENGTH_REQ)),
                        "Minimum length Req is met", "Minimum length Req is not met");
                SeleniumUtils.wait(2);
                CreateAccWithEmailPage.clickConfirmPassword();
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_LETTER_REQ)),
                        "Letter Req is met", "Letter Req is not met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_NUMBER_REQ)),
                        "Number Req is met", "Number Req is not met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_MIN_LENGTH_REQ)),
                        "Minimum length Req is met", "Minimum length Req is not met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, RED_STATE_MATCH_CONF)),
                        "Password Matching not Confirmed", "Password Matching Confirmation");
                SeleniumUtils.wait(2);
                CreateAccWithEmailPage.enterPwdCreateAccEmail(passwords[1]);
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_LETTER_REQ)),
                        "Letter Req is met", "Letter Req is not met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_NUMBER_REQ)),
                        "Number Req is met", "Number Req is not met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, RED_STATE_MIN_LENGTH_REQ)),
                        "Minimum length Req is not met", "Minimum length Req is met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, RED_STATE_MATCH_CONF)),
                        "Password Matching not Confirmed", "Password Matching Confirmation");
                SeleniumUtils.wait(2);
                CreateAccWithEmailPage.enterPwdCreateAccEmail(passwords[2]);
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_LETTER_REQ)),
                        "Letter Req is met", "Letter Req is not met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, RED_STATE_NUMBER_REQ)),
                        "Number Req is not met", "Number Req is met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, RED_STATE_MIN_LENGTH_REQ)),
                        "Minimum length Req is not met", "Minimum length Req is met");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, RED_STATE_MATCH_CONF)),
                        "Password Matching not Confirmed", "Password Matching Confirmation");
                SeleniumUtils.wait(2);
                CreateAccWithEmailPage.enterPwdCreateAccEmail(passwords[3]);
                testcase.assertFalse(CreateAccWithEmailPage.passwordReqDisappeared(),
                        "Password Requirements disappears", "Password Requirements does not disappear");
                testcase.pass(
                        " system dynamically checks the password strength requirements even on removing cursor from password field in 'Setup Your Account' page.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "system dynamically checks the password strength requirements even on removing cursor from password field in 'Setup Your Account' page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
    }

    // TA_REG_39 and 40
    // To verify that system dynamically checks for password matching
    // requirement for 'Confirm Password' is met in 'Create an Account' form
    // page.
    // To verify that system dynamically checks for password mismatch for
    // 'Confirm Password' in 'Create an Account' form page.
    @Test
    public void passwordMatchReqConfirmation() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(1);
        while (retry.retry())
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String random = User.random();
                CreateAccWithEmailPage.enterEmailCreateAccEmail(User.random() + "Tester456@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail(User.random() + "Tester456@gmail.com");
                SeleniumUtils.wait(2);
                CreateAccWithEmailPage.enterPwdCreateAccEmail("test1234");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("test1234");
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, GREEN_TICK_MATCH_CONF)),
                        "Password Matching Confirmation", "Password Matching not Confirmed");
                SeleniumUtils.wait(2);
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("test12345");
                SeleniumUtils.wait(2);
                testcase.assertTrue(
                        SeleniumUtils.iSDisplayed(
                                ExcelProperty.getElementValue(CREATE_ACC_WITH_EMAIL_PAGE, RED_STATE_MATCH_CONF)),
                        "Password Matching not Confirmed", "Password Matching Confirmation");
                testcase.pass(
                        "System dynamically checks the password matching requirements in 'Create an Account' form page.");
                break;
            } catch (Exception e)
            {
                testcase.error(
                        "System dynamically checks the password matching requirements in 'Create an Account' form page.",
                        e);
                e.printStackTrace();
            }
    }

    /*
     * @Test public void invalidDataCreateAccount() throws Exception { String
     * name = new Object() {}.getClass().getEnclosingMethod().getName();
     * TestCaseDetail testcase =
     * TestCaseFactory.createTestCaseDetail(this.getClass(), name); try {
     * tyreURL(); SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * LoginPage.clickCreateAccountLink(); SeleniumUtils.wait(5);
     * testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
     * "Create Account With Email button displayed",
     * "Create Account With Email button not displayed");
     * CreateAnAccountPage.clickCreateAccWithEmailButton();
     * SeleniumUtils.wait(5); ArrayList<InvalidCreateAccount> data =
     * FileUtility.readAllInvalidCreateAccData(); for
     * (Iterator<InvalidCreateAccount> iterator = data.iterator();
     * iterator.hasNext();) { InvalidCreateAccount databean =
     * (InvalidCreateAccount) iterator.next();
     * CreateAccWithEmailPage.enterEmailCreateAccEmail(databean.getEmail());
     * CreateAccWithEmailPage.enterConfEmailCreateAccEmail(databean.
     * getConfirmEmail());
     * CreateAccWithEmailPage.enterPwdCreateAccEmail(databean.getPassword());
     * CreateAccWithEmailPage.enterConPwdCreateAccEmail(databean.
     * getConfirmPassword()); SeleniumUtils.wait(5);
     * CreateAccWithEmailPage.clickAgreeTermsNConditions();
     * CreateAccWithEmailPage.clickCreateYourAccBtn(); String actualerror = "";
     * String emailerror = databean.getErrormessage(); actualerror =
     * SeleniumUtils.getText(Type.XPATH, databean.getErrorid());
     * System.out.println(emailerror); testcase.assertEquals(emailerror.trim(),
     * actualerror.trim()); } testcase.pass(
     * "System should display error messages for invalid data in 'Create an Account' form page."
     * ); } catch (Exception e) { testcase.error(
     * "System should display error messages for invalid data in 'Create an Account' form page."
     * , e); e.printStackTrace(); } }
     */

}
