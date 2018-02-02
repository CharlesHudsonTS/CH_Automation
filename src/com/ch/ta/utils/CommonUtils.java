/**
 * prasa
 */
package com.ch.ta.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Dimension;

import com.ch.ta.utils.constants.FileConstants;
import com.ch.ta.utils.constants.ObjectConstants;
import com.ch.utils.DriverFactory;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;

public class CommonUtils implements ObjectConstants, FileConstants
{
    public static void TBCURL()
    {
        SeleniumUtils.getURL(PropertyUtil.getPropertyValue("url", SERVER_PROPERTY_FILE));
    }

    public static void mobileView()
    {
        DriverFactory.getDriver().manage().window().setSize(new Dimension(360, 640));
    }

    public static void desktopView()
    {
        DriverFactory.getDriver().manage().window().maximize();
    }

    public static void clickHomeBreadcrumb() throws Exception
    {

    }

    public static void tabletView()
    {
        DriverFactory.getDriver().manage().window().setSize(new Dimension(900, 668));
    }

    public static String getCurrentDate()
    {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("ddMMYYhhmmss");
        String str = df.format(date);
        return str;
    }
}
