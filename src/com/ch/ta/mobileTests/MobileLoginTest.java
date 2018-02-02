package com.ch.ta.mobileTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.retry.Retry;
import com.ch.ta.bean.User;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.LoginPage;
import com.ch.ta.desktopPages.MyAccountPage;
import com.ch.ta.mobilePages.MobileLoginPage;
import com.ch.ta.utils.CommonUtils;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.SeleniumUtils;

@Listeners(com.ch.utils.ParallelFactory.class)
public class MobileLoginTest extends AbstractTestCaseReport implements FileConstants
{
    public void tyreURL() throws Exception
    {
        CommonUtils.desktopView();
        CommonUtils.TBCURL();
    }

    // *Test case :1
    // To verify the display of 'Login' link in top right corner of the Homepage
    // To verify the functionality of the 'Login' link in the Home page
    @Test
    public void signInHomeTest() throws Exception
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
                SeleniumUtils.wait(50);
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                testcase.assertTrue(MobileLoginPage.isKeepMeLoggedInBox(),
                        "Keep Me logged in checkbox is displayed in Sign In Flyout",
                        "Keep Me logged in checkbox is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isCreateAccountLink(),
                        "Create Account link is displayed in Sign In Flyout",
                        "Create Account link is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isSignInButton(), "Sign In button is displayed in Sign In Flyout",
                        "Sign In button is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isEmailTextbox(), "Email text box is displayed in Sign In Flyout",
                        "Email text box is not displayed in Sign In Flyout");
                MobileLoginPage.isPasswordTextbox();
                MobileLoginPage.isForgotPasswordLink();
                testcase.assertTrue(MobileLoginPage.isForgotUsernameLink(),
                        "Forgot username link is displayed in Home page",
                        "Forgot username link is not displayed in Home page");
                testcase.pass("Display & functionality of Sign In link in Home page");
                break;
            } catch (Exception e)
            {
                testcase.retry("Display & functionality of Sign In link in Home page", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // *Test case :2
    // To verify the UI of 'Login' page.
    // To verify the display of the 'Username' textbox in the Login Page.
    // To verify the display of the 'Password' textbox in the Login Page.
    // To verify the display of the 'Keep me Logged In ' in the Login page
    // To verify the display of the 'Log In' button in the Login page
    // To verify the display of the 'Social media icons' and 'Or Log In with'
    // static text in the login page.
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isEmailTextbox(), "Email text box is displayed in Sign In Flyout",
                        "Email text box is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isPasswordTextbox(),
                        "Password text box is displayed in Sign In Flyout",
                        "Password text box is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isSignInButton(), "Sign In button is displayed in Sign In Flyout",
                        "Sign In button is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isKeepMeLoggedInBox(),
                        "Keep Me logged in checkbox is displayed in Sign In Flyout",
                        "Keep Me logged in checkbox is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isForgotUsernameLink(),
                        "Forgot Username link is displayed in Sign In Flyout",
                        "Forgot Username link is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In Flyout",
                        "Forgot Password link is not displayed in Sign In Flyout");
                testcase.assertTrue(MobileLoginPage.isCreateAccountLink(),
                        "Create Account link is displayed in Sign In Flyout",
                        "Create Account link is not displayed in Sign In Flyout");
                // testcase.assertTrue(MobileLoginPage.isFacebookIcon(),
                // "Facebook
                // icon is displayed in Sign In Flyout",
                // "Facebook icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(MobileLoginPage.isTwitterIcon(), "Twitter
                // icon
                // is displayed in Sign In Flyout",
                // "Twitter icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(MobileLoginPage.isGoogleIcon(), "Google
                // icon is
                // displayed in Sign In Flyout",
                // "Google icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(MobileLoginPage.isAOLIcon(), "AOL icon is
                // displayed in Sign In Flyout",
                // "AOL icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(MobileLoginPage.isLinkedInIcon(), "Linked
                // In
                // icon is displayed in Sign In Flyout",
                // "Linked In icon is not displayed in Sign In Flyout");
                // testcase.assertTrue(MobileLoginPage.isYahooIcon(), "Yahoo
                // icon is
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

    // *Test case :3
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isCreateAccountLink(),
                        "Create Account link is displayed in Sign In Flyout",
                        "Create Account link is not displayed in Sign In Flyout");
                MobileLoginPage.clickCreateAccountLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isTitleStaticTextCreateAccount(),
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
    /*
     * //Test case :4 pending // To verify the display of the 'Username'
     * placeholder in the Login Page. // To verify that the 'Username'
     * placeholder disappears when textbox is // focused in the Login page.
     * @Test public void usernamePlaceholderTest() throws Exception { String
     * name = new Object() {}.getClass().getEnclosingMethod().getName();
     * TestCaseDetail testcase =
     * TestCaseFactory.createTestCaseDetail(this.getClass(), name); Retry retry
     * = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * testcase.assertEquals("Username", SeleniumUtils
     * .getAttributes(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX),
     * "placeholder")); SeleniumUtils.wait(5);
     * LoginPage.enterEmailInTextbox("set@gmail.com"); SeleniumUtils.wait(5);
     * testcase.assertEquals("", SeleniumUtils
     * .getAttributes(ExcelProperty.getElementValue(SIGN_IN, EMAIL_TEXTBOX),
     * "placeholder")); testcase.
     * pass("Display of placeholder before and after clicking on the Email Address textbox"
     * ); break; } catch (Exception e) { testcase.
     * retry("Display of placeholder before and after clicking on the Email Address textbox"
     * , testcase, retry, e); e.printStackTrace(); } } } //Test case :5 pending
     * // To verify the display of the 'Password' placeholder in the Login Page.
     * // To verify that the 'Password' placeholder disappears when textbox is
     * // focused in the Login page.
     * @Test public void passwordPlaceholderTest() throws Exception { String
     * name = new Object() {}.getClass().getEnclosingMethod().getName();
     * TestCaseDetail testcase =
     * TestCaseFactory.createTestCaseDetail(this.getClass(), name); Retry retry
     * = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * testcase.assertEquals("Password", SeleniumUtils
     * .getAttributes(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_TEXTBOX),
     * "placeholder")); SeleniumUtils.wait(5);
     * LoginPage.enterPasswordInTextbox("pwd"); SeleniumUtils.wait(5);
     * testcase.assertEquals("", SeleniumUtils
     * .getAttributes(ExcelProperty.getElementValue(SIGN_IN, PASSWORD_TEXTBOX),
     * "placeholder")); testcase.
     * pass("Display of placeholder before and after clicking on the Password textbox"
     * ); break; } catch (Exception e) { testcase.
     * retry("Display of placeholder before and after clicking on the Password textbox"
     * , testcase, retry, e); e.printStackTrace(); } } }
     */
    // Test case:6
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickOnMyAccount();
                testcase.assertTrue(MobileLoginPage.verifyMyAccount(), "User has successfully logged In",
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

    // *Test case :7
    // To verify the error message when 'Username' and 'Password' fields are
    // left blank in login page.
    // To verify the error message when 'Password' field is left blank in the
    // login page.
    // To verify the error message when 'Username' left blank in the login page
    // To verify the error message when user enters 'Username' in Invalid format
    // in the login page
    // To verify the error message when user enters 'Password' in Invalid format
    // in the login page
    // To verify the error message when user enters 'Username' and 'Password' in
    // Invalid format in the login page
    // To verify the error message when user enters unregistered 'Username' in
    // the login page
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                for (int i = 0; i <= 5; i++)
                {
                    MobileLoginPage.enterEmailInTextbox(User.random() + "@gmail.com");
                    MobileLoginPage.enterPasswordInTextbox(User.random());
                    MobileLoginPage.clickSignInButton();
                }
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                testcase.assertTrue(MobileLoginPage.isInvalidErrorMsg(), "Warning message on 5 unsuccessful login",
                        "Warning message on 5 unsuccessful login not displayed");

                testcase.pass("Error Messages for sign In with invalid data in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Error Messages for sign In with invalid data in Sign In flyout", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    // *Test case :8
    // To Verify the display of the 'Forgot password? ' link in the Login page.

    @Test
    public void forgotPasswordTest() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifyForgetPaswdTextInPopup(),
                        "Forgot Password popup is displayed in Sign In flyout",
                        "Forgot Password popup is not displayed in Sign In flyout");
                testcase.pass("Verifying UI & functionality of Password link in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Verifying UI & functionality of Password link in Sign In flyout", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    // *Test case :9
    // To Verify the functionality of the 'Forgot Username? ' link in the Login
    // page.

    @Test
    public void forgotUsenameTest() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isForgotUsernameLink(),
                        "Forgot Username  link is displayed in Sign In flyout",
                        "Forgot Username  link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotUsernameLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifyForgetUserTextInPopup(),
                        "Forgot Username  popup is displayed in Sign In flyout",
                        "Forgot Username  popup is not displayed in Sign In flyout");
                testcase.pass("Verifying UI & functionality of Forgot Username link in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Verifying UI & functionality of Forgot Username link in Sign In flyout", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // * Test case:10
    // To verify the functionality of the 'Keep me logged in' checkbox in the
    // Login Page.
    // To verify that the site is populated with credentials of user with 'Keep
    // me logged In' functionality the next time user opens the site.
    @Test
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickOnMyAccount();
                testcase.assertTrue(MobileLoginPage.verifyMyAccount(), "User has successfully logged In",
                        "User has has not logged In");
                MobileLoginPage.clickSignOutLink();
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

    // * Test case 11
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.signInWithFields("set@gmail.com", "test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickOnMyAccount();
                testcase.assertTrue(MobileLoginPage.verifyMyAccount(), "User has successfully logged In",
                        "User has has not logged In");
                MyAccountPage.clickSignOutLink();
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

    // Test case: 12
    // * To verify the warning message when user enters wrong email for maximum
    // number of times in the login page.
    @Test
    public void accountLockMaxEmailLoginTest() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                for (int i = 0; i <= 5; i++)
                {
                    MobileLoginPage.enterEmailInTextbox(User.random() + "@gmail.com");
                    MobileLoginPage.enterPasswordInTextbox("test@123");
                    MobileLoginPage.clickSignInButton();
                }
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isInvalidErrorMsg(), "Warning message on 5 unsuccessful login",
                        "Warning message on 5 unsuccessful login not displayed");
                testcase.pass("Warning message on 5 unsuccessful login is displayed");
                break;
            } catch (Exception e)
            {
                testcase.retry("Warning message on 5 unsuccessful login is displayed", testcase, retry, e);
                e.printStackTrace();
            }
        }

    }
    // *Test case: 13
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                testcase.assertTrue(MobileLoginPage.isusernameErrorMsg(),
                        "Error message is displayed when user has left username as blank",
                        "Error message is displayed when user has left username as blank");
                testcase.assertTrue(MobileLoginPage.isPasswordErrorMsg(),
                        "Error message is displayed when user has left password as blank",
                        "Error message is displayed when user has left password as blank");

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

    // Test case :14
    // To verify the display of error message when 'username' field is left
    // blank in the sign in a flyout on the homepage.

    @Test
    public void verifyErrorMsgwithEmptyUsername() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                testcase.assertTrue(MobileLoginPage.isusernameErrorMsg(),
                        "Error message is displayed when user has left username as blank",
                        "Error message is not displayed when user has left username as blank");

                testcase.pass("System is displaying error messages when user left blank in username feilds");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is displaying error messages when user left blank in username feilds", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }
    // Test case :25
    // To verify the display of error message when 'Password' field is left
    // blank in the sign in a flyout on the homepage.

    @Test
    public void verifyErrorwithEmptyPassword() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                testcase.assertTrue(MobileLoginPage.isPasswordErrorMsg(),
                        "Error message is displayed when user has left password as blank",
                        "Error message is not displayed when user has left password as blank");

                testcase.pass("System is displaying error messages when user left blank in password feilds");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is displaying error messages when user left blank in password feilds", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }
    // Test case :26
    // To verify the error message when the user entered Invalid 'Username' in
    // the sign in flyout on the homepage.

    @Test
    public void verifyErrorMsgwithInvalidUsername() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("%&&%$@24");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                testcase.assertTrue(MobileLoginPage.isInvalidErrorMsg(),
                        "Error message is displayed when user has entered invalid username",
                        "Error message is not displayed when user has entered invalid username");

                testcase.pass("System is displaying error message when user has entered invalid username");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is displaying error message when user has entered invalid username", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }
    // Test case :27
    // To verify the display of error message when user entered invalid
    // 'Username' and 'Password' in the sign in flyout on the homepage.

    @Test
    public void verifyErrorMsgwithInvalidDetails() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("13231323");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("13231323");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isInvalidErrorMsg(),
                        "Error message is displayed when user has entered invalid username and invalid password",
                        "Error message is not displayed when user has entered invalid username and invalid password");

                testcase.pass("System is displaying error messages when user has enter invalid username and passowrd");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is displaying error messages when user has enter invalid username and passowrd",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :28
    // To verify the display of error message when user entered invalid
    // 'Password' in the sign in flyout
    @Test
    public void verifyErrorwithInvalidPassword() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("*(^%hxdsu8");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                testcase.assertTrue(MobileLoginPage.isInvalidErrorMsg(),
                        "Error message is displayed when user has enterd invalid password",
                        "Error message is displayed when user has enterd invalid password");

                testcase.pass("System is displaying error messages when user has enterd invalid password");
                break;
            } catch (Exception e)
            {
                testcase.retry("System is displaying error messages when user has enterd invalid password", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :29
    // To verify the display of error message when the user entered unregistered
    // 'Username' in 'Username' field in the sign in flyout on the homepage.
    @Test
    public void verifyErrorwithUnregisterUsername() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("testdemo@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("demo@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                testcase.assertTrue(MobileLoginPage.isInvalidErrorMsg(),
                        "Error message is displayed when user has enterd invalid details",
                        "Error message is displayed when user has enterd invalid details");

                testcase.pass(
                        "System is displaying error messages when user has enterd Unregistered username and  password");
                break;
            } catch (Exception e)
            {
                testcase.retry(
                        "System is displaying error messages when user has enterd Unregistered username and  password",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :30
    // To verify the warning message when user enters wrong password for maximum
    // number of times in the login page.
    @Test
    public void accountLockMaxLoginTest() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                for (int i = 0; i <= 5; i++)
                {
                    MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                    MobileLoginPage.enterPasswordInTextbox(User.random());
                    MobileLoginPage.clickSignInButton();
                }
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isInvalidErrorMsg(), "Warning message on 5 unsuccessful login",
                        "Warning message on 5 unsuccessful login not displayed");
                testcase.pass("Warning message on 5 unsuccessful login is displayed");
                break;
            } catch (Exception e)
            {
                testcase.retry("Warning message on 5 unsuccessful login is displayed", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :31
    // coocked user
    // pending
    // To verify that the site is populated with credentials of user with 'Keep
    // me Signed In' functionality the next time user opens the site.
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                HeaderFooterPage.onHoverMyAccount();
                SeleniumUtils.wait(10);
                MyAccountPage.clickSignOutLink();
                SeleniumUtils.wait(5);
                DriverFactory.getDriver().close();
                SeleniumUtils.wait(5);
                tyreURL();
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.pass("System should display the homepage with Signed In user.");

                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the homepage with Signed In user.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :32
    // pending
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
                SeleniumUtils.wait(10);
                HeaderFooterPage.onHoverMyAccount();
                SeleniumUtils.wait(10);
                MyAccountPage.clickSignOutLink();
                SeleniumUtils.wait(5);
                DriverFactory.getDriver().close();
                SeleniumUtils.wait(5);
                tyreURL();
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                // testcase.assertEquals("",
                // MobileLoginPage.keepMeLoggedInCheckbox());
                testcase.pass("Functionality of Keep me Logged In Check box selected in Sign In flyout");
                testcase.pass("System should display the homepage with signin/Register.");

                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the homepage with signin/Register.", testcase, retry, e);
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
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
                // testcase.assertEquals("",
                // MobileLoginPage.keepMeLoggedInCheckbox());
                testcase.pass("Functionality of Keep me Logged In Check box selected in Sign In flyout");
                testcase.pass("System should display the homepage with Signed In user.");

                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the homepage with Signed In user.", testcase, retry, e);
                e.printStackTrace();
            }
        }
    }

    // Test case :34
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifyForgetPaswdTextInPopup(),
                        "Forgot Password popup is displayed in Sign In flyout",
                        "Forgot Password popup is not displayed in Sign In flyout");
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

    // Test case :35
    // *To verify the display of "Close icon" in the Forgot Password popup.
    // To verify the functionality of "Close icon" in the Forgot Password popup.
    @Test
    public void forgotPwdPopupTest() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifyForgetPaswdTextInPopup(),
                        "Forgot Password popup is displayed in Sign In flyout",
                        "Forgot Password popup is not displayed in Sign In flyout");
                MobileLoginPage.closeForgotPwdPopup();
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In Flyout",
                        "Forgot Password link is not displayed in Sign In Flyout");
                testcase.pass("Verifying UI & functionality of forgot Password popup in Sign In flyout");
                break;
            } catch (Exception e)
            {
                testcase.retry("Verifying UI & functionality of forgot  Password popup in Sign In flyout", testcase,
                        retry, e);
                e.printStackTrace();
            }
        }
    }
    // Test case :36
    // *To verify the display of "Email Address Text Field" in the Forgot
    // Password popup.

    @Test
    public void forgotPwdPopupEmailTest() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isForgetPwdEmailTextInPopup(),
                        "Forgot Password popup is displayed email text box in Sign In flyout",
                        "Forgot Password popup is not displayed email text box in Sign In flyout");
                MobileLoginPage.closeForgotPwdPopup();
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In Flyout",
                        "Forgot Password link is not displayed in Sign In Flyout");
                testcase.pass("System should display the  Email Address Text Field   in the Forgot Password popup.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the  Email Address Text Field   in the Forgot Password popup.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    // Test case :37
    // *To verify the display of Email Address Place holder in the text field in
    // Forgot Password popup.

    @Test
    public void forgotPwdPopupEmailPlaceholderTest() throws Exception
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
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                SeleniumUtils.wait(5);
                HeaderFooterPage.clickSignInOrRegistration();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isForgetPwdEmailTextInPopup(),
                        "Forgot Password popup is displayed email text box in Sign In flyout",
                        "Forgot Password popup is not displayed email text box in Sign In flyout");
                testcase.assertEquals("Email Address", SeleniumUtils.getAttributes(
                        ExcelProperty.getElementValue(SIGN_IN, FORGOT_PWD_EMAIL_TEXTBOX), "placeholder"));
                MobileLoginPage.closeForgotPwdPopup();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickOnHamburgerMenu();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.verifySignInOrRegistration(),
                        "Sign In link is displayed in Home page", "Sign In link is not displayed in Home page");
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In Flyout",
                        "Forgot Password link is not displayed in Sign In Flyout");
                testcase.pass("System should display the  Email Address placeholder in the Forgot Password popup.");
                break;
            } catch (Exception e)
            {
                testcase.retry("System should display the  Email Address placeholder in the Forgot Password popup.",
                        testcase, retry, e);
                e.printStackTrace();
            }
        }
    }
    /*
     * // Test case :38 //To verify the functionality of Email Address Place
     * holder in text field in the Forgot Password popup. //pending
     * @Test public void forgotPwdPopupfnTest() throws Exception { String name =
     * new Object() {}.getClass().getEnclosingMethod().getName(); TestCaseDetail
     * testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
     * Retry retry = new Retry(2); while (retry.retry()) { try { tyreURL();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(HeaderFooterPage.verifySignInOrRegistration(),
     * "Sign In link is displayed in Home page",
     * "Sign In link is not displayed in Home page"); SeleniumUtils.wait(5);
     * HeaderFooterPage.clickSignInOrRegistration(); SeleniumUtils.wait(5);
     * testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
     * "Forgot Password link is displayed in Sign In flyout",
     * "Forgot Password link is not displayed in Sign In flyout");
     * SeleniumUtils.wait(5); MobileLoginPage.clickForgotPasswordLink();
     * SeleniumUtils.wait(5);
     * testcase.assertTrue(MobileLoginPage.isForgetPwdEmailTextInPopup(),
     * "Forgot Password popup is displayed email text box in Sign In flyout",
     * "Forgot Password popup is not displayed email text box in Sign In flyout"
     * ); testcase.assertEquals("Email Address",
     * SeleniumUtils.getAttributes(ExcelProperty.getElementValue(SIGN_IN,
     * FORGOT_PWD_EMAIL_TEXTBOX), "placeholder"));
     * MobileLoginPage.enterDataInEmailTextbox("test");
     * testcase.assertEquals("",
     * SeleniumUtils.getAttributes(ExcelProperty.getElementValue(SIGN_IN,
     * FORGOT_PWD_EMAIL_TEXTBOX), "placeholder"));
     * MobileLoginPage.closeForgotPwdPopup();
     * testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
     * "Forgot Password link is displayed in Sign In Flyout",
     * "Forgot Password link is not displayed in Sign In Flyout"); testcase.
     * pass("System should display the  Email Address placeholder in the Forgot Password popup."
     * ); break; } catch (Exception e) { testcase.
     * retry("System should display the  Email Address placeholder in the Forgot Password popup."
     * , testcase, retry, e); e.printStackTrace(); } } }
     */
    // Test case :39
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
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isCancelBtnInPopup(),
                        "Forgot Password popup is displayed cancel button in Sign In flyout",
                        "Forgot Password popup is not displayed cancel button in Sign In flyout");
                MobileLoginPage.enterDataInEmailTextbox("set@gmail.com");
                MobileLoginPage.clickOnCancelBtn();
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
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
    // Test case :40
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
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(MobileLoginPage.isSubmitBtnInPopup(),
                        "Forgot Password popup is displayed submit button in Sign In flyout",
                        "Forgot Password popup is not displayed submit button in Sign In flyout");
                MobileLoginPage.enterDataInEmailTextbox("set@gmail.com");
                MobileLoginPage.clickOnSubmitBtn();
                testcase.assertTrue(LoginPage.isNotificationMsg(),
                        "System should display notification message in Sign In Flyout",
                        "System is not display notification message in Sign In Flyout");
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

    // Test case :41
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
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                testcase.assertTrue(LoginPage.isMsgInPopup(),
                        "Forgot Password popup is displayed instructional message in Sign In flyout",
                        "Forgot Password popup is not displayed instructional message in Sign In flyout");

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

    // Test case :42
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
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickOnSubmitBtn();
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

    // Test case :43
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
                testcase.assertTrue(MobileLoginPage.isForgotPasswordLink(),
                        "Forgot Password link is displayed in Sign In flyout",
                        "Forgot Password link is not displayed in Sign In flyout");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickForgotPasswordLink();
                SeleniumUtils.wait(5);
                MobileLoginPage.enterDataInEmailTextbox("set@@123");
                MobileLoginPage.clickOnSubmitBtn();
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
    // Test case :44
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
                MobileLoginPage.enterEmailInTextbox("set@gmail.com");
                SeleniumUtils.wait(5);
                MobileLoginPage.enterPasswordInTextbox("test@123");
                SeleniumUtils.wait(5);
                MobileLoginPage.clickKeepMeLoggedIn();
                SeleniumUtils.wait(5);
                MobileLoginPage.clickSignInButton();
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

}