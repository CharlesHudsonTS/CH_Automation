package com.ch.ta.desktopTests;

import org.testng.annotations.Test;

import com.ch.report.utils.AbstractTestCaseReport;
import com.ch.reports.TestCaseDetail;
import com.ch.reports.TestCaseFactory;
import com.ch.ta.desktopPages.HeaderFooterPage;
import com.ch.ta.desktopPages.LoginPage;
import com.ch.ta.desktopPages.MyAccountPage;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class MyAccountTest extends AbstractTestCaseReport implements FileConstants
{
    // TA_REG_032
    // To verify the display of 'PERSONAL INFORMATION' section for signed In
    // user in 'My Account' page.
    @Test
    public void personalInfoTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            testcase.assertTrue(MyAccountPage.isPersonalInfoSectionTitle(), "Personal Info section Title is displayed",
                    "Personal Info section Title is not displayed");
            testcase.assertTrue(MyAccountPage.isPersonalInfoSectionLabels(),
                    "Personal Info section labels is displayed", "Personal Info section labels is not displayed");
            testcase.pass("Personal Information section is displayed with labels in My Account page");
        } catch (Exception e)
        {
            testcase.error("Personal Information section is displayed with labels in My Account page", e);
            e.printStackTrace();
        }
    }

    // TA_REG_033
    // To verify the display of 'PERSONAL INFORMATION' section with minimum data
    // for signed In user in 'My Account' page.
    @Test
    public void personalInfoNoDataTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            // Pending
            testcase.assertTrue(MyAccountPage.isPersonalInfoNoData(), "Personal Info section with no data is displayed",
                    "Personal Info section with no data is not displayed");
            testcase.pass("Personal Information section is displayed with no data in My Account page");
        } catch (Exception e)
        {
            testcase.error("Personal Information section is displayed with no data in My Account page", e);
            e.printStackTrace();
        }
    }

    // TA_REG_034
    // To verify the display of 'PERSONAL INFORMATION' section with data for signed In user in 'My Account' page.
    @Test
    public void personalInfoDataTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            // Pending
            testcase.assertTrue(MyAccountPage.isPersonalInfoNoData(), "Personal Info section with data is displayed",
                    "Personal Info section with data is not displayed");
            testcase.pass("Personal Information section is displayed with data in My Account page");
        } catch (Exception e)
        {
            testcase.error("Personal Information section is displayed with data in My Account page", e);
            e.printStackTrace();
        }
    }
    
    
    
    // 
    // To verify the functionality of 'Edit' button of 'PERSONAL INFORMATION'
    // section in 'My Account' page.
    @Test
    public void editPersonalDataTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickEditPersonalInfo();
            SeleniumUtils.wait(5);
            // Assertion to be added
            testcase.pass("Personal Information section is allowed to edit in My Account page");
        } catch (Exception e)
        {
            testcase.error("Personal Information section is allowed to edit in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the functionality of '-' icon of 'PERSONAL INFORMATION' section
    // in 'My Account' page.
    @Test
    public void minimizePersonalTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickMinimizePersonalInfo();
            SeleniumUtils.wait(5);
            testcase.assertFalse(MyAccountPage.isPersonalInfoSectionLabels(), "Minimises Personal Information",
                    "Does not minimise Personal Information");
            testcase.pass("Personal Information section is allowed to minimize in My Account page");
        } catch (Exception e)
        {
            testcase.error("Personal Information section is allowed to minimize in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the display of 'PASSWORD & SECURITY' section for signed In user
    // in 'My Account' page.
    @Test
    public void passwordNSecurityTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            testcase.assertTrue(MyAccountPage.isPasswordSecuritySectionTitle(),
                    "Password Security section Title is displayed", "Password Security section Title is not displayed");
            testcase.assertTrue(MyAccountPage.isPasswordSecuritySectionLabels(),
                    "Password Security section labels is displayed",
                    "Password Security section labels is not displayed");
            testcase.pass("Password Security section is displayed with labels in My Account page");
        } catch (Exception e)
        {
            testcase.error("Password Security section is displayed with labels in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the display of 'PASSWORD & SECURITY' section with data for
    // signed In user in 'My Account' page.
    @Test
    public void passwordSecurityDataTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            // Add
            testcase.pass("Password Security section is displayed with the data given in My Account page");
        } catch (Exception e)
        {
            testcase.error("Password Security section is displayed with the data given in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the functionality of 'Edit' button of 'PASSWORD & SECURITY'
    // section in 'My Account' page.
    @Test
    public void editPwdNSecurityDataTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickEditPasswordSecurity();
            SeleniumUtils.wait(5);
            // Assertion to be added
            testcase.pass("Password and Security section is allowed to edit in My Account page");
        } catch (Exception e)
        {
            testcase.error("Password and Security section is allowed to edit in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the functionality of '-' icon of 'PASSWORD & SECURITY' section
    // in 'My Account' page.
    @Test
    public void minimizePwdNSecurityTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickMinimizePasswordSecurity();
            SeleniumUtils.wait(5);
            testcase.assertFalse(MyAccountPage.isPasswordSecuritySectionLabels(), "Minimises Password and Security",
                    "Does not minimise Password and Security");
            testcase.pass("Password and Security section is allowed to edit in My Account page");
        } catch (Exception e)
        {
            testcase.error("Password and Security section is allowed to edit in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the display of 'COMMUNICATION PREFERENCES' section for signed
    // In user in 'My Account' page.
    @Test
    public void communPreferenceTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            testcase.assertTrue(MyAccountPage.isCommnPreferenceSectionTitle(),
                    "Communication Preferences section Title is displayed",
                    "Communication Preferences section Title is not displayed");
            testcase.assertTrue(MyAccountPage.isCommnPreferenceSectionLabels(),
                    "Communication Preferences section labels is displayed",
                    "Communication Preferences section labels is not displayed");
            testcase.pass("Communication Preferences section is displayed with labels in My Account page");
        } catch (Exception e)
        {
            testcase.error("Communication Preferences section is displayed with labels in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the display of 'COMMUNICATION PREFERENCES' section with data
    // for signed In user in 'My Account' page.
    @Test
    public void commnPreferenceDataTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            // Add
            testcase.pass("Communication Preference section is displayed with given data in My Account page");
        } catch (Exception e)
        {
            testcase.error("Communication Preference section is displayed with given data in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the functionality of 'Edit' button of 'COMMUNICATION
    // PREFERENCES' section in 'My Account' page.
    @Test
    public void editCommnPreferenceDataTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickEditCommunicationPreference();
            SeleniumUtils.wait(5);
            // Assertion to be added
            testcase.pass("Communication Preferences section is allowed to edit in My Account page");
        } catch (Exception e)
        {
            testcase.error("Communication Preferences section is allowed to edit in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the functionality of '-' icon of 'COMMUNICATION PREFERENCES'
    // section in 'My Account' page.
    @Test
    public void minimizeCommnPreferenceTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickMinimizeCommunPref();
            SeleniumUtils.wait(5);
            testcase.assertFalse(MyAccountPage.isCommnPreferenceSectionLabels(), "Minimises Communication Preferences",
                    "Does not minimise Communication Preferences");
            testcase.pass("Communication Preferences section is allowed to minimize in My Account page");
        } catch (Exception e)
        {
            testcase.error("Communication Preferences section is allowed to minimize in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the display of 'MY PREFERRED INSTALLERS' section for signed In
    // user in 'My Account' page.
    @Test
    public void myPrefInstallersTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            testcase.assertTrue(MyAccountPage.isMyPrefereedInstallersSectionTitle(),
                    "My Preferred Installers section Title is displayed",
                    "My Preferred Installers section Title is not displayed");
            testcase.assertTrue(MyAccountPage.isMyPrefereedInstallersList(),
                    "My Preferred Installers section list is displayed",
                    "My Preferred Installers section list is not displayed");
            testcase.pass("My Preferred Installers section is displayed with title and list in My Account page");
        } catch (Exception e)
        {
            testcase.error("My Preferred Installers section is displayed with title and list in My Account page", e);
            e.printStackTrace();
        }
    }

    // To verify the display of 'MY PREFERRED INSTALLERS' section with data for
    // signed In user in 'My Account' page.
    @Test
    public void myPrefInstallersLocationListTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            // Add
            testcase.pass(
                    "My Preferred Installers section is displayed with list of installers with locations in maps in My Account page");
        } catch (Exception e)
        {
            testcase.error(
                    "My Preferred Installers section is displayed with list of installers with locations in maps in My Account page",
                    e);
            e.printStackTrace();
        }
    }

    // To verify the functionality of accordion in the list of installers in 'MY
    // PREFERRED INSTALLERS' section in 'My Account' page.
    @Test
    public void myPrefInstallersAccordionTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccordionInstaller1();
            SeleniumUtils.wait(5);
            testcase.assertTrue(MyAccountPage.isRemoveInstallerButton(), "Installer Details displayed by expanding",
                    "Installer Details not displayed by expanding");
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccordionInstaller1();
            SeleniumUtils.wait(5);
            testcase.assertFalse(MyAccountPage.isRemoveInstallerButton(), "Installer Details is collapsed",
                    "Installer Details is not collapsed");
            testcase.pass(
                    "My Preferred Installers section is displayed with details expanded or collapsed by clicking accordion in My Account page");
        } catch (Exception e)
        {
            testcase.error(
                    "My Preferred Installers section is displayed with details expanded or collapsed by clicking accordion in My Account page",
                    e);
            e.printStackTrace();
        }
    }

    // To verify the functionality of accordion in the list of installers in 'MY
    // PREFERRED INSTALLERS' section in 'My Account' page.
    @Test
    public void myPrefInstallersRemoveBtnTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccordionInstaller1();
            SeleniumUtils.wait(5);
            testcase.assertTrue(MyAccountPage.isRemoveInstallerButton(), "Installer Details displayed by expanding",
                    "Installer Details not displayed by expanding");
            SeleniumUtils.wait(5);
            MyAccountPage.clickRemoveInstaller1();
            SeleniumUtils.wait(5);
            testcase.assertFalse(MyAccountPage.isRemoveInstallerButton(), "Installer removed", "Installer not removed");
            testcase.pass(
                    "Functionality of remove button for installer in My Preferred Installers section of My Account page");
        } catch (Exception e)
        {
            testcase.error(
                    "Functionality of remove button for installer in My Preferred Installers section of My Account page",
                    e);
            e.printStackTrace();
        }
    }

    // To verify the functionality of '-' icon of 'MY PREFERRED INSTALLERS'
    // section in 'My Account' page.
    @Test
    public void myPrefInstallersMinimizeTest() throws Exception
    {
        String name = new Object()
        {}.getClass().getEnclosingMethod().getName();
        TestCaseDetail testcase = TestCaseFactory.createTestCaseDetail(this.getClass(), name);
        try
        {
            SeleniumUtils.wait(5);
            HeaderFooterPage.clickSignInOrRegistration();
            SeleniumUtils.wait(5);
            LoginPage.enterEmailInTextbox("test@gmail.com");
            SeleniumUtils.wait(5);
            LoginPage.enterPasswordInTextbox("test@123");
            SeleniumUtils.wait(5);
            LoginPage.clickSignInButton();
            testcase.assertTrue(MyAccountPage.isMyAccountLink(), "User has successfully logged In",
                    "User has has not logged In");
            SeleniumUtils.wait(5);
            MyAccountPage.hoverOnMyAccount();
            SeleniumUtils.wait(5);
            MyAccountPage.clickAccountDetailsLink();
            SeleniumUtils.wait(5);
            MyAccountPage.clickMinimizeMyInstallers();
            SeleniumUtils.wait(5);
            testcase.assertFalse(MyAccountPage.isMyPrefereedInstallersList(), "Installer section minimised",
                    "Installer section not minimised");
            testcase.pass(
                    "Functionality of minimize button for installer in My Preferred Installers section of My Account page");
        } catch (Exception e)
        {
            testcase.error(
                    "Functionality of minimize button for installer in My Preferred Installers section of My Account page",
                    e);
            e.printStackTrace();
        }
    }
}
