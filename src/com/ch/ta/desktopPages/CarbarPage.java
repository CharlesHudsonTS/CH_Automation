package com.ch.ta.desktopPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ch.ExcelUtils.ExcelBean;
import com.ch.ExcelUtils.ExcelProperty;
import com.ch.ta.utils.constants.FileConstants;
import com.ch.utils.SeleniumUtils;

public class CarbarPage implements FileConstants
{
	/* ****************************************************
	  * Method Name   : alertAndPromotionClose()
	  * Purpose        : To close the alert and promotion bars in the site
	  * Author         : CH_001
	  * Date Created   : 12/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static void alertAndPromotionClose() throws Exception
    {
		try
		{
		SeleniumUtils.click(ExcelProperty.getElementValue(D_CarBar, CLOSE_ALERT_SYMBOL1));
	    SeleniumUtils.wait(2);
	    SeleniumUtils.onHover(ExcelProperty.getElementValue(D_CarBar, SAVINGS));
	    SeleniumUtils.wait(2);
	    SeleniumUtils.click(ExcelProperty.getElementValue(D_CarBar, CLOSE_ALERT_SYMBOL2));
	    SeleniumUtils.wait(2);
        System.out.println("Closes the alert message and promotion massages");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
    }
	
	/* ****************************************************
	  * Method Name   : shopByTireBrand()
	  * Purpose        : To Select the shopByTireBrand category in the Tires module
	  * Author         : CH_001
	  * Date Created   : 12/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static void shopByTireBrand() throws Exception
    {
		try
		{
		SeleniumUtils.click(ExcelProperty.getElementValue(D_CarBar, TIREBRAND));
	    SeleniumUtils.wait(5);
        System.out.println("Selected the TIREBRAND in the Tires module");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
    }
		
	/* ****************************************************
	  * Method Name   : shopByTireSize()
	  * Purpose        : To Select the shopByTireSize category in the Tires module
	  * Author         : CH_001
	  * Date Created   : 15/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static void shopByTireSize() throws Exception
   {
		try
		{
		SeleniumUtils.click(ExcelProperty.getElementValue(D_CarBar, TIRESIZE));
	    SeleniumUtils.wait(5);
       System.out.println("Selected the TIRESIZE in the Tires module");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
   }
	
	/* ****************************************************
	  * Method Name   : shopByTireType()
	  * Purpose        : To Select the shopByTireType category in the Tires module
	  * Author         : CH_001
	  * Date Created   : 15/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static void shopByTireType() throws Exception
  {
		try
		{
		SeleniumUtils.click(ExcelProperty.getElementValue(D_CarBar, TIRETYPE));
	    SeleniumUtils.wait(5);
      System.out.println("Selected the TIRETYPE in the Tires module");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
  }
	
	/* ****************************************************
	  * Method Name   : shopByVehicle()
	  * Purpose        : To Select the shopByVehicle category in the Tires module
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static void shopByVehicle() throws Exception
 {
		try
		{
		SeleniumUtils.click(ExcelProperty.getElementValue(D_CarBar, VEHICLE));
	    SeleniumUtils.wait(5);
     System.out.println("Selected the VEHICLE in the Tires module");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
 }
	
	/* ****************************************************
	  * Method Name   : isTitleShoppingFor()
	  * Purpose        : To Verify the Title 'shoppingFor' in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static boolean isTitleShoppingFor() throws Exception
    {
        boolean flag = false;
        try
        {
            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, TITLESHOPPINGFOR));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
	
	/* ****************************************************
	  * Method Name   : VerifyUnselectedVehicleImage()
	  * Purpose        : To Verify the unselected Vehicle image in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static boolean VerifyUnselectedVehicleImage() throws Exception
   {
       boolean flag = false;
       try
       {
           flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, UNSELECTEDVEHICLEIMAGE));
       } catch (Exception e)
       {
           e.printStackTrace();
       }
       return flag;
   }
	
	/* ****************************************************
	  * Method Name   : VerifyUnselectedVehicleImage()
	  * Purpose        : To Verify the Text 'No vehicle selected' in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static boolean TextNoVehicleSelected() throws Exception
  {
      boolean flag = false;
      try
      {
          flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, TEXTNOVEHICLESELECTED));
      } catch (Exception e)
      {
          e.printStackTrace();
      }
      return flag;
  }
	
	/* ****************************************************
	  * Method Name   : msgToAddVehicle()
	  * Purpose        : To Verify the Text msg To AddVehicle in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static boolean msgToAddVehicle() throws Exception
 {
     boolean flag = false;
     try
     {
         flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, MSGTOADDVEHICLE));
     } catch (Exception e)
     {
         e.printStackTrace();
     }
     return flag;
 }
	
	/* ****************************************************
	  * Method Name   : linkAddVehicle()
	  * Purpose        : To Verify the link 'AddVehicle' in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static boolean linkAddVehicle() throws Exception
{
    boolean flag = false;
    try
    {
        flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, LINKADDVEHICLE));
    } catch (Exception e)
    {
        e.printStackTrace();
    }
    return flag;
}
	
	/* ****************************************************
	  * Method Name   : collapseExpandControl()
	  * Purpose        : To Verify the Symbol 'collapse/ExpandControl' in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static boolean collapseExpandControl() throws Exception
{
   boolean flag = false;
   try
   {
       flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, COLLAPSEEXPANDCONTROL));
   } catch (Exception e)
   {
       e.printStackTrace();
   }
   return flag;
}
	
	/* ****************************************************
	  * Method Name   : clickOnLinkAddVehicle()
	  * Purpose        : To Verify the OnClick for AddVehicle link in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static void clickOnLinkAddVehicle() throws Exception
{
   try
   {
       SeleniumUtils.click(ExcelProperty.getElementValue(D_CarBar, LINKADDVEHICLE));
       SeleniumUtils.wait(5);
   } catch (Exception e)
   {
       e.printStackTrace();
   }
}
	
	/* ****************************************************
	  * Method Name   : verifyListOfBenefitsForDriver()
	  * Purpose        : To Verify the List Of Benefits For Driver On click of Add vehicle link in carbar
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static boolean verifyListOfBenefitsForDriver() throws Exception
{
  boolean flag = false;
  try
  {
      flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, LISTOFBENEFITSFORDRIVER1)) 
    		  && SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, LISTOFBENEFITSFORDRIVER2)) 
    		  && SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, LISTOFBENEFITSFORDRIVER3)) 
    		  && SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, LISTOFBENEFITSFORDRIVER4));
  } catch (Exception e)
  {
      e.printStackTrace();
  }
  return flag;
}
	
	/* ****************************************************
	  * Method Name   : verifyButtonAddNewVehicle()
	  * Purpose        : To Verify the Button 'Add new Vehicle' On click of Add vehicle link in carbar
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static boolean verifyButtonAddNewVehicle() throws Exception
{
 boolean flag = false;
 try
 {
     flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(D_CarBar, BUTTONADDNEWVEHICLE));
 } catch (Exception e)
 {
     e.printStackTrace();
 }
 return flag;
}
	
	/* ****************************************************
	  * Method Name   : clickOnLinkAddVehicle()
	  * Purpose        : To Verify the OnClick for AddVehicle link in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static void clickOnExpandIcon() throws Exception
{
  try
  {
      SeleniumUtils.click(ExcelProperty.getElementValue(D_CarBar, COLLAPSEEXPANDCONTROL));
      SeleniumUtils.wait(2);
  } catch (Exception e)
  {
      e.printStackTrace();
  }
}
	/* ****************************************************
	  * Method Name   : clickOnLinkAddVehicle()
	  * Purpose        : To Verify the OnClick for AddVehicle link in the carbar section
	  * Author         : CH_001
	  * Date Created   : 16/01/18
	  * Date Modified  :
	  * Reviewed By    : CH_002
	  * ******************************************************
	  */
	public static void selectVehicle(String a) throws Exception
	{
	  try
	  {
	      SeleniumUtils.dropDownByVisibleText(ExcelProperty.getElementValue(D_CarBar, CAR_MAKE), a);
	      	
	  } catch (Exception e)
	  {
	      e.printStackTrace();
	  }
	}
}
