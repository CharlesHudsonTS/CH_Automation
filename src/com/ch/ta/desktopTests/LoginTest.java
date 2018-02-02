package com.ch.ta.desktopTests;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.bean.InvalidSignInbean;
import com.ch.ta.bean.User;
import com.ch.ta.desktopPages.CreateAnAccountPage;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.LoginPage;
import com.ch.ta.desktopPages.MyAccountPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.FileUtility;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class LoginTest extends AbstractTestCaseReport implements FileConstants
{
    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    // Test case :1,2,3,4-->(1)
    // To verify the display of 'Login' details in top right corner of the
    // Homepage
    // To verify the display of the 'Social media icons' and 'Or Log In
    // with'static text in the login page.
    @Test
    public void signInUITest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                testcase.assertTrue(LoginPage.isCreateAccountLink(),
                        "Create Account link is displayed in Sign In Flyout",
                        "Create Account link is not displayed in Sign In Flyout");
                testcase.assertTrue(LoginPage.isSignInButton(), "Sign In button is displayed in Sign In Flyout",
                        "Sign In button is not displayed in Sign In Flyout");
                testcase.assertTrue(LoginPage.isEmailTextbox(), "Email text box is displayed in Sign In Flyout",
                        "Email text box is not displayed in Sign In Flyout");
                testcase.assertTrue(LoginPage.isPasswordTextbox(), "Password text box is displayed in Sign In Flyout",
                        "Password text box is not displayed in Sign In Flyout");
                testcase.assertTrue(LoginPage.isKeepMeLoggedInBox(),
                        "Keep Me logged in checkbox is displayed in Sign In Flyout",
                        "Keep Me logged in checkbox is not displayed in Sign In Flyout");
                testcase.assertTrue(LoginPage.isForgotPasswordLink(), "Forgot password link is displayed",
                        "Forgot password link is not displayed");
                testcase.assertTrue(LoginPage.isForgotUsernameLink(), "Forgot username link is displayed",
                        "Forgot username link is not displayed");
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                // testcase.assertTrue(LoginPage.isFacebookIcon(), "Facebook
                // icon is displayed in Sign In Flyout",
                // "Facebook icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(LoginPage.isTwitterIcon(), "Twitter icon
                // is displayed in Sign In Flyout",
                // "Twitter icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(LoginPage.isGoogleIcon(), "Google icon is
                // displayed in Sign In Flyout",
                // "Google icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(LoginPage.isAOLIcon(), "AOL icon is
                // displayed in Sign In Flyout",
                // "AOL icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(LoginPage.isLinkedInIcon(), "Linked In
                // icon is displayed in Sign In Flyout",
                // "Linked In icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(LoginPage.isYahooIcon(), "Yahoo icon is
                // displayed in Sign In Flyout",
                // "Yahoo icon is not displayed in Sign In Flyout");
                testcase.pass("Verifying UI of Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Verifying UI of Sign In flyout", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // *Test case :5--->(2)
    // To verify the display of the 'Create Account ' link in the Login page.
    // To verify the functionality of the 'Create Account' link in the Login
    // Page.
    @Test
    public void createAccountLinkTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isCreateAccountLink(),
                        "Create Account link is displayed in Sign In Flyout",
                        "Create Account link is not displayed in Sign In Flyout");
                LoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(CreateAnAccountPage.isTitleStaticTextCreateAccount(),
                        "Create Account page is displayed with Create Account with Email button",
                        "Create Account page is not displayed with Create Account with Email button");
                testcase.pass("Create Account page is displayed on clicking create Account link in SignIn flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Create Account page is displayed on clicking create Account link in SignIn flyout",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :6,7,10,11--->(3)
    // To verify the display of the 'Username' and 'Password' placeholder in the
    // Login Page. placeholder disappears when textbox is focused in the Login
    // page.
    // We cannot automate disappear placeholder
    @Test
    public void usernamePlaceholderTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertEquals("Username", SeleniumUtils
                        .getAttributes(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX), "placeholder"));
                SeleniumUtils.wait(5);
                String random = "set";
                LoginPage.enterEmailInTextbox(random);
                SeleniumUtils.wait(5);
                testcase.assertEquals(random,
                        SeleniumUtils.getAttributes(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX), "value"));
                SeleniumUtils.wait(5);
                testcase.assertEquals("Password", SeleniumUtils
                        .getAttributes(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_TEXTBOX), "placeholder"));
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox(random);
                SeleniumUtils.wait(5);
                testcase.assertEquals(random,
                        SeleniumUtils.getAttributes(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_TEXTBOX), "value"));

                testcase.pass(
                        "Display of placeholder before and after clicking on the Email and Password Address textbox");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "Display of placeholder before and after clicking on the Email and password Address textbox",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :8-->(4)

    // To verify the functionality of the 'Keep me logged in' checkbox in the
    // Login Page.
    // To verify that the site is populated with credentials of user with
    // 'Keepme logged In' functionality the next time user opens the site.
    // @Test
    public void selectKeepMeLoggedInTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                LoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                HeaderFooterPage.onHoverMyAccount();
                SeleniumUtils.wait(20);
                MyAccountPage.clickSignOutLink();
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertEquals("", LoginPage.keepMeLoggedInCheckbox());
                testcase.pass("Functionality of Keep me Logged In Check box selected in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Functionality of Keep me Logged In Check box selected in Sign In flyout", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case:9--->(5)
    // * To verify the functionality of the 'Login In' button in the login page.

    @Test
    public void validLoginTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                HeaderFooterPage.onHoverMyAccount();
                testcase.assertTrue(HeaderFooterPage.verifyMyAccount(), "User has successfully logged In",
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

    // *Test case :10,11,(24-29)--->(6)
    // To verify the error message when 'Username' and 'Password' fields are
    // left blank in login page.
    // To verify the error message when 'Password' field is left blank in the
    // login page.
    // To verify the error message when 'Username' field is left blank in the
    // login page
    // To verify the error message when user enters 'Username' in Invalid format
    // in the login page
    // To verify the error message when user enters 'Password' in Invalid format
    // in the login page
    // To verify the error message when user enters 'Username' and 'Password' in
    // Invalid format in the login page
    // To verify the error message when user enters unregistered 'Username' in
    // the login page
    // To verify the display of error message in the sign in a flyout on the
    // homepage.

    @Test
    public void verifyErrorMsg() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.enterEmailInTextbox("@#$%");
                LoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                testcase.assertEquals(INVALID_ERROR_MESSAGE, "Please verify your email address and password");
                testcase.pass("System is displaying error messages in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is displaying error messages in Sign In flyout", testcase, retry, e);
                e.printStackTrace();
            }
        }

    }

    // Test case :12,13,14,34,35,36,37,38,39--->(7)
    // *To verify the display of the 'Forgot Password' label in the Forgot
    // Password popup.
    @Test
    public void forgotPasswordLabelTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                LoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isForgetPwdDetailsInPopup(),
                        "Forgot Password popup is displayed in Sign In flyout",
                        "Forgot Password popup is not displayed in Sign In flyout");
                testcase.assertEquals("Email Address", SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(SIGN_IN, FORGOT_PWD_EMAIL_TEXTBOX), "placeholder"));
                String random = "test";
                LoginPage.enterDataInEmailTextbox(random);
                testcase.assertEquals(random, SeleniumUtils
                        .getAttributes(ExcelProperty.getElementValue(SIGN_IN, FORGOT_PWD_EMAIL_TEXTBOX), "value"));
                LoginPage.clickOnTelephoneNo();
                // Dilog window is not automate
                /*
                 * String parentWindowHandler =
                 * DriverFactory.getDriver().getWindowHandle(); String
                 * subWindowHandler = null; Set<String> handles =
                 * DriverFactory.getDriver().getWindowHandles();
                 * Iterator<String> iterator = handles.iterator(); while
                 * (iterator.hasNext()) { subWindowHandler = iterator.next(); }
                 * DriverFactory.getDriver().switchTo().window(subWindowHandler)
                 * ; // TBC has not yet implemented the social media login
                 * Thread.sleep(2000); DriverFactory.getDriver().close();
                 * DriverFactory.getDriver().switchTo().window(
                 * parentWindowHandler);
                 * testcase.assertTrue(LoginPage.verifyDilogWindowInPopup(),
                 * "Dilog window popup is displaed",
                 * "Dilog window popup is not displaed");
                 */

                LoginPage.closeForgotPwdPopup();
                testcase.assertTrue(LoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In Flyout",
                        "Forgot Password link is not displayed in Sign In Flyout");
                testcase.pass("Verifying UI & functionality of forgot Password link in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Verifying UI & functionality of forgot Password link in Sign In flyout", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case:14--->(8)
    // To verify the functionality of the 'Close' button in 'Forgot Email'modal.
    @Test
    public void forgotUsenamefnOfCloseBtnTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isForgotUsernameLink(),
                        "Forgot Username  link is displayed in Sign In flyout",
                        "Forgot Username  link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                LoginPage.clickForgotUsernameLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.verifyForgetUserDetailsInPopup(),
                        "Forgot Username  popup details is displayed in Sign In flyout",
                        "Forgot Username  popup details is not displayed in Sign In flyout");
                LoginPage.clickOnForgotUsernameCloseBtn();
                testcase.assertTrue(LoginPage.isForgotUsernameLink(),
                        "Forgot Username  link is displayed in Sign In flyout",
                        "Forgot Username  link is not displayed in Sign In flyout");
                testcase.pass("Verifying  functionality of Forgot Username  link in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Verifying functionality of Forgot Username  link in Sign In flyout", testcase, retry,
                        e);
                e.printStackTrace();
            }
        }
    }

    // 16-22 is social media icons

    // Test case :23---->(9)
    // To verify the error message when 'Username' and 'Password' fields are
    // left blank in sign in a flyout on the homepage.

    @Test
    public void verifyErrorMsgwithEmptyUsernamePassword() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                testcase.assertEquals(USERNAME_ERROR_MESSAGE, "Please enter your email address");
                testcase.assertEquals(PASSWORD_ERROR_MESSAGE, "Password should not be empty");
                testcase.pass(
                        "System is displaying error messages when user left blank in username and passowrd feilds");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System is displaying error messages when user left blank in username and passowrd feilds",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :30---->(10)

    // * To verify the warning message when user enters wrong email for maximum
    // number of times in the login page.

    @Test
    public void accountLockMaxinvalidLoginTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                for (int i = 0; i <= 5; i++)
                {
                    LoginPage.enterEmailInTextbox(User.random() + "@gmail.com");
                    LoginPage.enterPasswordInTextbox(User.random());
                    LoginPage.clickSignInButton();
                    SeleniumUtils.wait(5);
                    testcase.assertTrue(LoginPage.isInvalidErrorMsg(), "Warning message on 5 unsuccessful login",
                            "Warning message on 5 unsuccessful login not displayed");
                }

                testcase.pass("Error Messages for sign In with invalid data in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Error Messages for sign In with invalid data in Sign In flyout", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :31---->(11)
    // coocked user

    // To verify that the site is populated with credentials of user with 'Keep
    // me Signed In' functionality the next time user opens the site.
    @Test
    public void keepMeSignInFunctTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                LoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                Keys.chord(Keys.CONTROL, "t");
                // String sele2 = Keys.chord(Keys.SHIFT, Keys.RETURN);
                // Try with both sele and sele2
                tyreURL();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isMyAccount(), "My account link is displayed",
                        " My account link is not displayed");
                testcase.pass("System should display the homepage with Signed In user.");

                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the homepage with Signed In user.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :32---->(12)
    // not automate
    // To verify that the site is not populated with credentials of user with
    // 'Keep me Signed In' functionality, when the user manually clearing the
    // cookies.
    @Test
    public void keepmeSignInFunctClearCookiesTest() throws Exception
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
    // Test case :33---->(13)

    // To verify that the site is populated with credentials of user with 'Keep
    // me Signed In' functionality, when the user Signed out from the site.
    @Test
    public void keepmeSignInFunctTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                LoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                MyAccountPage.hoverOnMyAccount();
                LoginPage.clickSignOutLink();
                SeleniumUtils.wait(10);
                Keys.chord(Keys.CONTROL, "t");
                SeleniumUtils.wait(10);
                tyreURL();
                SeleniumUtils.wait(10);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.pass("Functionality of Keep me Logged In Check box selected in Sign In flyout");

                break;
            } catch (Exception e)
            {
                testcase.retry("Functionality of Keep me Logged In Check box selected in Sign In flyout", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :40,41---->(14)
    // *To verify the display and functionality of "Cancel Button" in the Forgot
    // Password popup.

    @Test
    public void forgotPwdCancelBtnFnTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                LoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isCancelBtnInPopup(),
                        "Forgot Password popup is displayed cancel button in Sign In flyout",
                        "Forgot Password popup is not displayed cancel button in Sign In flyout");
                LoginPage.enterDataInEmailTextbox("set@gmail.com");
                LoginPage.clickOnCancelBtn();
                testcase.assertTrue(LoginPage.isForgotPasswordLink(),
                        "System should display forgot password link in Sign In Flyout",
                        "System is not display forgot password link in Sign In Flyout");
                testcase.pass("System should display and functionality of Cancel Button in the Forgot Password popup");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display and functionality of Cancel Button in the Forgot Password popup",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    // Test case :42,43,44,---->(15)
    // *To verify the display and functionality of "Submit Button" in the Forgot
    // Password popup.

    @Test
    public void forgotPwdSubmitBtnFnTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                LoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isSubmitBtnInPopup(),
                        "Forgot Password popup is displayed submit button in Sign In flyout",
                        "Forgot Password popup is not displayed submit button in Sign In flyout");
                LoginPage.enterDataInEmailTextbox("set@gmail.com");
                LoginPage.clickOnSubmitBtn();
                testcase.assertEquals(
                        "A password reset message was sent to your email address. Please click the link in that email to reset your password. If you do not receive a password reset message within a few moments, please check your spam folder or other inbox filtering tools.",
                        FORGOT_PASSWORD_NOTIFICATION_MESSAGE);
                testcase.pass("System should display and functionality of submit Button in the Forgot Password popup");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display and functionality of submit Button in the Forgot Password popup",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :45---->(16)
    // *To verify the Instructional message for Forgot Password in the Forgot
    // Password popup.
    @Test
    public void forgotPwdMsgInPopup() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                LoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertEquals(
                        "Enter the email address associated with your Tire America account and click Submit.",
                        FORGOT_PASSWORD_INSTRUMENTAL_MESSAGE);
                testcase.pass("Forgot Password popup is displayed instructional message in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Forgot Password popup is displayed instructional message in Sign In flyout", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // Testcase:46---->(17)

    // *To verify the error message when user clicks on "Submit Button" without
    // entering Email address in the text field in the Forgot Password popup.
    @Test
    public void forgotPwdWOemail() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                LoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                LoginPage.enterDataInEmailTextbox("");
                LoginPage.clickOnSubmitBtn();
                testcase.assertEquals("Please enter your email address", FORGOT_PASSWORD_ERROR_MESSAGE);
                testcase.assertTrue(LoginPage.isErrorMsg(), "System should display error message in Sign In Flyout",
                        "System is not display error message in Sign In Flyout");
                testcase.pass(
                        "System should display error message when user click on  submit Button without enter email in the Forgot Password popup");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display error message when user click on  submit Button without enter email in the Forgot Password popup",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :46,47---->(18)
    // *To verify the display of error message when user enters invalid Email
    // Address in text field in Forgot Password popup.
    @Test
    public void forgotPwdInvalidemail() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                LoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                LoginPage.enterDataInEmailTextbox("set@@123");
                LoginPage.clickOnSubmitBtn();
                testcase.assertTrue(LoginPage.isErrorMsg(), "System should display error message in Sign In Flyout",
                        "System is not display error message in Sign In Flyout");
                testcase.pass(
                        "System should display error message when user click on  submit Button with invalid email in the Forgot Password popup");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should display error message when user click on  submit Button with invalid email in the Forgot Password popup",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    // 48-60 reset password it is not automate
    // Test case :61---->(19)
    // *To verify that the signed in user is able to Logout from the registered
    // account.

    @Test
    public void signOut() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                LoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                HeaderFooterPage.onHoverMyAccount();
                SeleniumUtils.wait(20);
                MyAccountPage.clickSignOutLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                testcase.pass(
                        "System should Sign out from the registered account  flyout and navigate back to the previous page as guest user.");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System should Sign out from the registered account  flyout and navigate back to the previous page as guest user.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case:10----->(20)
    /*
     * //Test case :10 pending // To verify the display of the 'Social media
     * icons' and 'Or Sign In with' // static text in the Sign In flyout on the
     * homepage.
     * @Test public void socialmediaIconsandSignInText() throws Exception {
     * String name = new Object() {}.getClass().getEnclosingMethod().getName();
     * TestCaseDetail testcase =
     * TestCaseFactory.createTestCaseDetail(this.getClass(), name); Retry retry
     * = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * testcase.assertTrue(LoginPage.isdisplayedSocialMediaicons(),
     * "Social media icons are displayed", "Social media icons are displayed");
     * testcase.
     * pass("Verifying UI of social media icons and sigin in text link in Sign In flyout"
     * ); break; } catch (Exception e) { testcase.
     * retry("Verifying UI of social media icons and sigin in text link in Sign In flyout"
     * , testcase, retry, e); e.printStackTrace(); } } } //Test case :11 pending
     * // To verify the functionality of the 'Facebook' login in the Login Page
     * @Test public void facebookIconTest() throws Exception { String name = new
     * Object() {}.getClass().getEnclosingMethod().getName(); TestCaseDetail
     * testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
     * Retry retry = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * LoginPage.clickFacebookIcon(); SeleniumUtils.wait(5); String
     * parentWindowHandler =DriverFactory.getDriver().getWindowHandle(); String
     * subWindowHandler = null; Set<String> handles =
     * DriverFactory.getDriver().getWindowHandles(); Iterator<String> iterator =
     * handles.iterator(); while (iterator.hasNext()) { subWindowHandler =
     * iterator.next(); }
     * DriverFactory.getDriver().switchTo().window(subWindowHandler); // TBC has
     * not yet implemented the social media login Thread.sleep(2000);
     * DriverFactory.getDriver().close();
     * DriverFactory.getDriver().switchTo().window(parentWindowHandler);
     * testcase.
     * pass("User is able to Log In to his account using Facebook icon in Sign In flyout"
     * ); break; } catch (Exception e) { testcase.
     * retry("User is able to Log In to his account using Facebook icon in Sign In flyout"
     * , testcase, retry, e); e.printStackTrace(); } } } //Test case:12 pending
     * // To verify the functionality of the 'Twitter' login in the Login Page
     * @Test public void twitterIconTest() throws Exception { String name = new
     * Object() {}.getClass().getEnclosingMethod().getName(); TestCaseDetail
     * testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
     * Retry retry = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * LoginPage.clickTwitterIcon(); SeleniumUtils.wait(5); String
     * parentWindowHandler = DriverFactory.getDriver().getWindowHandle(); String
     * subWindowHandler = null; Set<String> handles =
     * DriverFactory.getDriver().getWindowHandles(); Iterator<String> iterator =
     * handles.iterator(); while (iterator.hasNext()) { subWindowHandler =
     * iterator.next(); }
     * DriverFactory.getDriver().switchTo().window(subWindowHandler); // TBC has
     * not yet implemented the social media login Thread.sleep(2000);
     * DriverFactory.getDriver().close();
     * DriverFactory.getDriver().switchTo().window(parentWindowHandler);
     * testcase.
     * pass("User is able to Log In to his account using Twitter icon in Sign In flyout"
     * ); break; } catch (Exception e) { testcase.
     * retry("User is able to Log In to his account using Twitter icon in Sign In flyout"
     * , testcase, retry, e); e.printStackTrace(); } } } // Test case 13:pending
     * // To verify the functionality of the 'Google' login in the Login Page
     * @Test public void googleIconTest() throws Exception { String name = new
     * Object() {}.getClass().getEnclosingMethod().getName(); TestCaseDetail
     * testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
     * Retry retry = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * LoginPage.clickGoogleIcon(); SeleniumUtils.wait(5); String
     * parentWindowHandler = DriverFactory.getDriver().getWindowHandle(); String
     * subWindowHandler = null; Set<String> handles =
     * DriverFactory.getDriver().getWindowHandles(); Iterator<String> iterator =
     * handles.iterator(); while (iterator.hasNext()) { subWindowHandler =
     * iterator.next(); }
     * DriverFactory.getDriver().switchTo().window(subWindowHandler); // TBC has
     * not yet implemented the social media login Thread.sleep(2000);
     * DriverFactory.getDriver().close();
     * DriverFactory.getDriver().switchTo().window(parentWindowHandler);
     * testcase.
     * pass("User is able to Log In to his account using Google icon in Sign In flyout"
     * ); break; } catch (Exception e) { testcase.
     * retry("User is able to Log In to his account using Google icon in Sign In flyout"
     * , testcase, retry, e); e.printStackTrace(); } } } // Test case 14:pending
     * // To verify the functionality of the 'Yahoo' login in the Login Page
     * @Test public void yahooIconTest() throws Exception { String name = new
     * Object() {}.getClass().getEnclosingMethod().getName(); TestCaseDetail
     * testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
     * Retry retry = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * LoginPage.clickYahooIcon(); SeleniumUtils.wait(5); String
     * parentWindowHandler = DriverFactory.getDriver().getWindowHandle(); String
     * subWindowHandler = null; Set<String> handles =
     * DriverFactory.getDriver().getWindowHandles(); Iterator<String> iterator =
     * handles.iterator(); while (iterator.hasNext()) { subWindowHandler =
     * iterator.next(); }
     * DriverFactory.getDriver().switchTo().window(subWindowHandler); // TBC has
     * not yet implemented the social media login Thread.sleep(2000);
     * DriverFactory.getDriver().close();
     * DriverFactory.getDriver().switchTo().window(parentWindowHandler);
     * testcase.
     * pass("User is able to Log In to his account using Yahoo icon in Sign In flyout"
     * ); break; } catch (Exception e) { testcase.
     * retry("User is able to Log In to his account using Yahoo icon in Sign In flyout"
     * , testcase, retry, e); e.printStackTrace(); } } } // Test case 15:pending
     * // To verify the functionality of the 'LinkedIn' login in the Login Page
     * @Test public void linkedInIconTest() throws Exception { String name = new
     * Object() {}.getClass().getEnclosingMethod().getName(); TestCaseDetail
     * testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
     * Retry retry = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * LoginPage.clickLinkedInIcon(); SeleniumUtils.wait(5); String
     * parentWindowHandler = DriverFactory.getDriver().getWindowHandle(); String
     * subWindowHandler = null; Set<String> handles =
     * DriverFactory.getDriver().getWindowHandles(); Iterator<String> iterator =
     * handles.iterator(); while (iterator.hasNext()) { subWindowHandler =
     * iterator.next(); }
     * DriverFactory.getDriver().switchTo().window(subWindowHandler); // TBC has
     * not yet implemented the social media login Thread.sleep(2000);
     * DriverFactory.getDriver().close();
     * DriverFactory.getDriver().switchTo().window(parentWindowHandler);
     * testcase.
     * pass("User is able to Log In to his account using LinkedIn icon in Sign In flyout"
     * ); break; } catch (Exception e) { testcase.
     * retry("User is able to Log In to his account using LinkedIn icon in Sign In flyout"
     * , testcase, retry, e); e.printStackTrace(); } } } // Test case 16:pending
     * // To verify the functionality of the 'AOL' login in the Login Page
     * @Test public void aOLIconTest() throws Exception { String name = new
     * Object() {}.getClass().getEnclosingMethod().getName(); TestCaseDetail
     * testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
     * Retry retry = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * LoginPage.clickAOLIcon(); SeleniumUtils.wait(5); String
     * parentWindowHandler = DriverFactory.getDriver().getWindowHandle(); String
     * subWindowHandler = null; Set<String> handles =
     * DriverFactory.getDriver().getWindowHandles(); Iterator<String> iterator =
     * handles.iterator(); while (iterator.hasNext()) { subWindowHandler =
     * iterator.next(); }
     * DriverFactory.getDriver().switchTo().window(subWindowHandler); // TBC has
     * not yet implemented the social media login Thread.sleep(2000);
     * DriverFactory.getDriver().close();
     * DriverFactory.getDriver().switchTo().window(parentWindowHandler);
     * testcase.
     * pass("User is able to Log In to his account using AOL icon in Sign In flyout"
     * ); break; } catch (Exception e) { testcase.
     * retry("User is able to Log In to his account using AOL icon in Sign In flyout"
     * , testcase, retry, e); e.printStackTrace(); } } }
     */
    // Test case :22
    // To verify that the site is not populated with credentials of user with
    // 'Keep me logged In' functionality after user manually clearing the
    // cookies.
    @Test
    public void unselectKeepMeLoggedInTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.signInWithFields("set@gmail.com", "test@123");
                SeleniumUtils.wait(5);
                MyAccountPage.hoverOnMyAccount();
                SeleniumUtils.wait(5);
                MyAccountPage.clickSignOutLink();
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertEquals("", LoginPage.keepMeLoggedInCheckbox());
                testcase.pass("Functionality of Keep me Logged In Check box unselected in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Functionality of Keep me Logged In Check box unselected in Sign In flyout", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :33
    // pending
    // To verify that the site is populated with credentials of user with 'Keep
    // me Signed In' functionality, when the user Signed out from the site.
    // @Test
    @Test
    public void keepmeSignInFunctnTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                LoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                HeaderFooterPage.onHoverMyAccount();
                SeleniumUtils.wait(10);
                testcase.assertTrue(HeaderFooterPage.verifyMyAccount(), "User has successfully logged In",
                        "User has has not logged In");
                MyAccountPage.clickSignOutLink();
                SeleniumUtils.wait(5);
                DriverFactory.getDriver().close();
                SeleniumUtils.wait(5);
                tyreURL();
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertEquals("", LoginPage.keepMeLoggedInCheckbox());
                testcase.pass("Functionality of Keep me Logged In Check box selected in Sign In flyout");

                break;
            } catch (Exception e)
            {
                testcase.retry("Functionality of Keep me Logged In Check box selected in Sign In flyout", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }
    
    @Test
    public void invalidLoginTest() throws Exception
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
                testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                LoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                LoginPage.enterPasswordInTextbox("test@1236");
                SeleniumUtils.wait(5);
                LoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
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


}
