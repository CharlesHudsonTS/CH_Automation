package com.ch.ta.utils.constants;

/**
 * @author 10:09:42 PM Prasanna Kumar Reddy Feb 17, 2016
 */
public interface FileConstants extends ObjectConstants, MobileObjectConstants, TabletObjectConstants, ModuleNames
{

    public static final String TEST_HOME                 = System.getProperty("test.home", "./");

    public static final String RESOURCES_HOME            = TEST_HOME + "resources/";

    public static final String CONFIG_HOME               = RESOURCES_HOME + "config/";

    public static final String TESTDATA_HOME             = RESOURCES_HOME + "testdata/";

    public static final String JSON_HOME                 = RESOURCES_HOME + "jsonfiles/";

    public static final String GEO_LOC                   = JSON_HOME + "geoloc.json";

    public static final String AUTOIT_HOME               = RESOURCES_HOME + "AutoIt/";

    public static final String TBC_CONTACTUS_AUTOIT      = AUTOIT_HOME + "TBC_Contactus.exe";

    public static final String INVALID_ABOUT_YOU_FILE    = TESTDATA_HOME + "invalidAboutYou.csv";

    public static final String INVALID_CONTACT_INFO_FILE = TESTDATA_HOME + "invalidContactInfo.csv";

    public static final String LOGIN_DATA_FILE           = TESTDATA_HOME + "LoginTestData.csv";

    public static final String LOAD_DATA_FILE            = TESTDATA_HOME + "loadData.csv";

    public static final String FORGOT_PWD_DATA_FILE      = TESTDATA_HOME + "ForgotPwdTestData.csv";

    public static final String USER_DATA_FILE            = TESTDATA_HOME + "UserData.csv";

    public static final String VEHICLE_DATA_FILE         = TESTDATA_HOME + "vehicleselectordata.csv";

    public static final String IMAGE_DATA_FILE           = TESTDATA_HOME + "ImageText.csv";

    public static final String REPORTS_HOME              = TEST_HOME + "reports/";

    public static final String DRIVERS_HOME              = RESOURCES_HOME + "drivers/";

    public static final String WINDOWS_HOME              = DRIVERS_HOME + "windows/";

    public static final String LINUX_HOME                = DRIVERS_HOME + "linux/";

    public static final String CHROME                    = DRIVERS_HOME + "chromedriver.exe";

    public static final String GECKO                     = DRIVERS_HOME + "geckodriver.exe";

    public static final String PHANTOMJS_WIN             = DRIVERS_HOME + "phantomjs.exe";

    public static final String I_E                       = DRIVERS_HOME + "IEDriverServer.exe";

    public static final String OPERA                     = DRIVERS_HOME + "operadriver.exe";

    public static final String HTML_CONFIG_HOME          = CONFIG_HOME + "htmlConfig/";

    public static final String TEST_PROPERTY_FILE        = CONFIG_HOME + "testconfig.properties";

    public static final String TABELT_OBJ_PROPERTY       = CONFIG_HOME + "tabletObject.properties";

    public static final String STATIC_TEXT_PROPERTY      = CONFIG_HOME + "staticText.properties";

    public static final String SERVER_PROPERTY_FILE      = CONFIG_HOME + "server.properties";

    public static final String OBJECT_PROPERTY_FILE      = CONFIG_HOME + "object.properties";

    public static final String MOBILE_OBJ_PROPERTY_FILE  = CONFIG_HOME + "mobileObject.properties";

    public static final String GECKO_WINDOWS             = WINDOWS_HOME + "geckodriver.exe";

    public static final String CHROME_LINUX              = "CHROME_LINUX";

    public static final String CHROME_WINDOWS            = WINDOWS_HOME + "chromedriver.exe";

    public static final String GECKO_LINUX               = "GECKO_LINUX";

    public static final String PLATFORM_NAME             = "platform.name";

    public static final String PLATFORM_VERSION          = "platform.version";

    public static final String DEVICE_NAME               = "device.name";

    public static final String BROWSE_NAME               = "browser";

    public static final String DEVICE_URL                = "driver.url";

    public static final String MOBILE_PC                 = "MOBILE_PC";

    public static final String PLATFORMEXE               = "platformexe.name";

    public static final String APP_NAME                  = "app.name";

    public static final String BROWSER_NAME              = "BROWSER_NAME";

    public static final String EMAIL_SIGNUP_DATA_FILE    = TESTDATA_HOME + "SignUpData.csv";

    public static final String LOG_PATH                  = "LOG_PATH";

    public static final String EXCEL_FILENAME            = CONFIG_HOME + "ExcelObjectProperties.xls";

    public static final String PROJECT_TITLE             = "Project_Title";

    public static final String EMAILS                    = "EMAILS";

    public static final String INVALID_SIGNIN_USER_FILE  = TESTDATA_HOME + "InvalidSignInData.csv";

}
