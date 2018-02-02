package com.ch.ta.bean;

/**
 * @author 11:59:11 AM Rachana Desai April 5, 2016
 */
public class ForgotPwdDatabean
{
    String username = "";

    String errormessageforgot = "";
    
    
    public ForgotPwdDatabean(String user, String error)
    {
        username = user;
        errormessageforgot = error;
    }
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getErrormessageforgot()
    {
        return errormessageforgot;
    }

    public void setErrormessageforgot(String errormessageforgot)
    {
        this.errormessageforgot = errormessageforgot;
    }
    
}
