package com.ch.ta.desktopTests;

import java.util.ArrayList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.bean.InvalidSignInbean;
import com.ch.ta.bean.User;
import com.ch.ta.desktopPages.CreateAccWithEmailPage;
import com.ch.ta.desktopPages.CreateAnAccountPage;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.LoginPage;
import com.ch.ta.desktopPages.MyAccountPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.FileUtility;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class CreateAccTest extends AbstractTestCaseReport implements FileConstants
{

    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    // 1. Registration Create an Account'
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
                SeleniumUtils.wait(2);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isCreateAccWithEmailButton(),
                        "Create Account With Email button displayed", "Create Account With Email button not displayed");
                CreateAnAccountPage.clickCreateAccWithEmailButton();
                SeleniumUtils.wait(5);
                String random = User.random();
                CreateAccWithEmailPage.enterEmailCreateAccEmail(random + "test@gmail.com");
                CreateAccWithEmailPage.enterConfEmailCreateAccEmail(random + "test@gmail.com");
                CreateAccWithEmailPage.enterPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterConPwdCreateAccEmail("Test@123");
                CreateAccWithEmailPage.enterZipcodeAccEmail("99501");
                SeleniumUtils.wait(5);
                CreateAccWithEmailPage.clickOnKeepInContact();
                SeleniumUtils.wait(2);
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
                SeleniumUtils.wait(8);
                testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                        "User has has not logged In");
                testcase.pass(
                        "User is able to create an account by entering valid credentials and navigate to the registration confiramtion page.");
                break;

            } catch (Exception e)
            {
                testcase.retry(
                        "User is able to create an account by entering valid credentials and navigate to the registration confiramtion page.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Login

    @Test
    public void loginTest() throws Exception
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
                SeleniumUtils.wait(2);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(2);
                LoginPage.enterEmailInTextbox("testing1234@gmail.com");
                SeleniumUtils.wait(2);
                LoginPage.enterPasswordInTextbox("test1234");
                SeleniumUtils.wait(3);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(6);
                testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                        "User has has not logged In");
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

    // 3. Invalid password Login

    @Test
    public void inValidloginTest() throws Exception
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
                SeleniumUtils.wait(2);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(2);
                LoginPage.enterEmailInTextbox("set123@gmail.com");
                SeleniumUtils.wait(2);
                LoginPage.enterPasswordInTextbox("test@1234");
                SeleniumUtils.wait(2);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(2);
                HeaderFooterPage.clickSignInOrRegistration();
                testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                        "User has has not logged In");
                testcase.pass(
                        "User is able to Log In to his account by entering Invalid credentials in Sign In flyout");

                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "User is able to Log In to his account by entering Invalid credentials in Sign In flyout",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // 4. Error log

    @Test
    public void forgotPwdWOemail() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            tyreURL();
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(3);
            LoginPage.clickForgotPasswordLink();
            testcase.pass("System should display forgot email modal window");
        } catch (Exception e)
        {
            testcase.error("System should display forgot email modal window", e);
            e.printStackTrace();
        }
    }
    
    @Test
    public void invalidSignIn() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        Retry retry = new Retry(2);
        while (retry.retry())
        {
            try
            {
                tyreURL();
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                ArrayList<InvalidSignInbean> data = FileUtility.readAllInvalidSignInData();
                int i = 0;
                for (InvalidSignInbean data1 : data)
                {
                    i++;
                    System.out.println(i);
                    SeleniumUtils.wait(2);
                    LoginPage.enterEmailInTextbox(data1.getUsername());
                    SeleniumUtils.wait(2);
                    LoginPage.enterPasswordInTextbox(data1.getPassword());
                    SeleniumUtils.wait(2);
                    LoginPage.clickSignInButton();
                    SeleniumUtils.wait(3);
                    String ErrorMsgE = data1.getErrorMsg();
                    String text = SeleniumUtils.getText(ExcelProperty.getElementValue(SIGN_IN, INVALID_ERROR_MESSAGE));
                   
                    System.out.println(text);
                    // Gettext
                    testcase.assertEquals(text, ErrorMsgE);

                }
                testcase.pass("Error message is displayed");

                break;
            } catch (Exception e)
            {
                testcase.retry("Error message is displayed", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

}
