package com.ch.ta.bean;

public class VehicleSelectorBean
{
    String make       = "";
    String year       = "";
    String model      = "";
    String submodel   = "";
    String tiresize   = "";
    String enginesize = "";
    String mileage     = "";


    public VehicleSelectorBean(String[] column)
    {

        make = column[0];
        year = column[1];
        model = column[2];
        submodel = column[3];
        tiresize = column[4];
        enginesize = column[5];
        mileage = column[6];
     
    }
    
    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }
    
    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }
    
    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    
    public String getSubModel()
    {
        return submodel;
    }

    public void setSubModel(String submodel)
    {
        this.submodel = submodel;
    }
    
    public String getTireSize()
    {
        return tiresize;
    }

    public void setTireSize(String tiresize)
    {
        this.tiresize = tiresize;
    }
    
    public String getEngineSize()
    {
        return enginesize;
    }

    public void setEngineSize(String enginesize)
    {
        this.enginesize = enginesize;
    }
    
    public String getMileage()
    {
        return mileage;
    }

    public void setMileage(String mileage)
    {
        this.mileage = mileage;
    }
    


}
