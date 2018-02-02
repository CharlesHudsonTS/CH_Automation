package com.ch.ta.bean;

public class SignUpDataBean
{
    String email   = "";
    String zipcode = "";

    public SignUpDataBean(String[] column)
    {
        email = column[0];
        zipcode = column[1];
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }

}
