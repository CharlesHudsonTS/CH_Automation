/**
 * user
 */
package com.ch.ta.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author user 1:24:35 am
 */
public class LoadBean
{
    String email = "";

    public LoadBean(String user)
    {
        email = user;
    }
    
    public static String random()
    {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dmMM");
        String str = df.format(date);
        return str;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

}
