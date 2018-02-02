package com.ch.ta.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 11:59:11 AM Prasanna Kumar Reddy Mar 6, 2016
 */
public class User
{

    String firstName        = "";

    String lastName         = "";

    String address          = "";

    String continuedAddress = "";

    String city             = "";

    String state            = "";

    String zipCode          = "";

    String primaryPhone     = "";

    String alternatePhone   = "";

    String email            = "";

    String confirmEmail     = "";

    String password         = "";

    String confirmPassword  = "";
    
    String businessname     = "";

    public User(String[] data)
    {
        email = random() + data[0];
        confirmEmail = random() + data[1];
        firstName = data[2];
        lastName = data[3];
        address = data[4];
        continuedAddress = data[5];
        city = data[6];
        state = data[7];
        zipCode = data[8];
        businessname = data[9];
        primaryPhone = data[10];
        alternatePhone = data[11];
        password = data[12];
        confirmPassword = data[13];
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getAddress()
    {
        return address;
    }
    
    public String getBusinessname()
    {
        return businessname;
    }

    public void setBusinessname(String businessname)
    {
        this.businessname = businessname;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getContinuedAddress()
    {
        return continuedAddress;
    }

    public void setContinuedAddress(String continuedAddress)
    {
        this.continuedAddress = continuedAddress;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getPrimaryPhone()
    {
        return primaryPhone;
    }

    public String getFirstPhone()
    {
        return (String) primaryPhone.subSequence(0, 3);
    }

    public String getMiddlePhone()
    {
        if (primaryPhone.length() <= 3)
        {
            return "";
        }
        return (String) primaryPhone.subSequence(3, 6);
    }

    public static String random()
    {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dmMMmmSssS");
        String str = df.format(date);
        return str;
    }

    public static void remail()
    {
        System.out.println();
    }

    public String getLastPhone()
    {
        if (primaryPhone.length() <= 6)
        {
            return "";
        }
        return (String) primaryPhone.subSequence(6, primaryPhone.length());
    }

    public void setPrimaryPhone(String primaryPhone)
    {
        this.primaryPhone = primaryPhone;
    }

    public String getAlternatePhone()
    {
        return alternatePhone;
    }

    public void setAlternatePhone(String alternatePhone)
    {
        this.alternatePhone = alternatePhone;
    }

    public String getFirstMobilePhone()
    {
        if (alternatePhone.length() <= 1)
        {
            return "";
        }
        return (String) alternatePhone.subSequence(0, 3);
    }

    public String getMiddleMobilePhone()
    {
        if (alternatePhone.length() <= 3)
        {
            return "";
        }
        return (String) alternatePhone.subSequence(3, 6);
    }

    public String getLastMobilePhone()
    {
        if (alternatePhone.length() <= 6)
        {
            return "";
        }
        return (String) alternatePhone.subSequence(6, alternatePhone.length());
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getConfirmEmail()
    {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail)
    {
        this.confirmEmail = confirmEmail;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getConfirmPassword()
    {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword)
    {
        this.confirmPassword = confirmPassword;
    }

}
