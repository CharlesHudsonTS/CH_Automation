package com.ch.ta.bean;

public class InvalidSignInbean
{

    String username = "";

    String password = "";

    String errorMsg = "";

    public InvalidSignInbean(String[] data)
    {
        username = data[0];

        password = data[1];

        errorMsg = data[2];

    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getErrorMsg()
    {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg)
    {
        this.errorMsg = errorMsg;
    }

}
