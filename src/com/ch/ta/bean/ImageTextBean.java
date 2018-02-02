/**
 * 
 */
package com.ch.ta.bean;

import java.util.HashMap;

/**
 * @author 12:51:01 PM Prasanna Kumar Reddy Mar 6, 2016
 */
public class ImageTextBean
{

    String                  suite        = "";
    String                  name         = "";
    String                  key          = "";
    String                  eleidentity  = "";
    String                  height       = "";
    String                  width        = "";
    String                  top          = "";
    String                  left         = "";
    String                  right        = "";
    String                  marginright  = "";
    String                  marginleft   = "";
    String                  margintop    = "";
    String                  marginbottom = "";
    String                  bottom       = "";
    String                  fontSize     = "";
    String                  color        = "";

    String                  errorMsg     = "";

    HashMap<String, String> cssEntities  = new HashMap<String, String>();
    HashMap<String, String> results      = new HashMap<String, String>();

    public ImageTextBean(String line)
    {
        String[] columns = line.split(",");
        suite = columns[0];
        name = columns[1];
        key = columns[2];
        eleidentity = columns[3];
        height = columns[4];
        width = columns[5];
        top = columns[6];
        left = columns[7];
        right = columns[8];
        marginright = columns[9];
        marginleft = columns[10];
        margintop = columns[11];
        marginbottom = columns[12];
        bottom = columns[13];
        fontSize = columns[14];
        color = columns[15];

        cssEntities.put("height", height);
        cssEntities.put("width", width);
        cssEntities.put("top", top);
        cssEntities.put("left", left);
        cssEntities.put("right", right);
        cssEntities.put("margin-right", marginright);
        cssEntities.put("margin-left", marginleft);
        cssEntities.put("margin-top", margintop);
        cssEntities.put("margin-bottom", marginbottom);
        cssEntities.put("bottom", bottom);
        cssEntities.put("fontSize", fontSize);
        cssEntities.put("color", color);
    }

    public HashMap<String, String> getCSSEntities()
    {
        return cssEntities;
    }

    public HashMap<String, String> getCSSResults()
    {
        return results;
    }

    String finalResult = "<font color=red>NOT_RUN";

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the errorMsg
     */
    public String getErrorMsg()
    {
        return errorMsg;
    }

    /**
     * @param errorMsg
     *            the errorMsg to set
     */
    public void setErrorMsg(String errorMsg)
    {
        this.errorMsg = errorMsg;
    }

    /**
     * @return the cssEntities
     */
    public HashMap<String, String> getCssEntities()
    {
        return cssEntities;
    }

    /**
     * @param cssEntities
     *            the cssEntities to set
     */
    public void setCssEntities(HashMap<String, String> cssEntities)
    {
        this.cssEntities = cssEntities;
    }

    /**
     * @return the results
     */
    public HashMap<String, String> getResults()
    {
        return results;

    }

    /**
     * @param results
     *            the results to set
     */
    public void setResults(HashMap<String, String> results)
    {
        this.results = results;
    }

    /**
     * @return the finalResult
     */
    public String getFinalResult()
    {
        return finalResult;
    }

    /**
     * @param finalResult
     *            the finalResult to set
     */
    public void setFinalResult(String finalResult)
    {
        this.finalResult = finalResult;
    }

    public void setResult(String key, String value)
    {
        results.put(key, value);
    }

    public String getImagename()
    {
        return name;
    }

    public void setImagename(String imagename)
    {
        this.name = imagename;
    }

    public String getSuite()
    {
        return suite;
    }

    public void setSuite(String suite)
    {
        this.suite = suite;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getEleidentity()
    {
        return eleidentity;
    }

    public void setEleidentity(String eleidentity)
    {
        this.eleidentity = eleidentity;
    }

    public String getHeight()
    {
        return height;
    }

    public void setHeight(String height)
    {
        this.height = height;
    }

    public String getWidth()
    {
        return width;
    }

    public void setWidth(String width)
    {
        this.width = width;
    }

    public String getTop()
    {
        return top;
    }

    public void setTop(String top)
    {
        this.top = top;
    }

    public String getLeft()
    {
        return left;
    }

    public void setLeft(String left)
    {
        this.left = left;
    }

    public String getRight()
    {
        return right;
    }

    public void setRight(String right)
    {
        this.right = right;
    }

    public String getBottom()
    {
        return bottom;
    }

    public void setBottom(String bottom)
    {
        this.bottom = bottom;
    }

    public String getFontSize()
    {
        return fontSize;
    }

    public void setFontSize(String fontSize)
    {
        this.fontSize = fontSize;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getMarginright()
    {
        return marginright;
    }

    public void setMarginright(String marginright)
    {
        this.marginright = marginright;
    }

    public String getMarginleft()
    {
        return marginleft;
    }

    public void setMarginleft(String marginleft)
    {
        this.marginleft = marginleft;
    }

    public String getMargintop()
    {
        return margintop;
    }

    public void setMargintop(String margintop)
    {
        this.margintop = margintop;
    }

    public String getMarginbottom()
    {
        return marginbottom;
    }

    public void setMarginbottom(String marginbottom)
    {
        this.marginbottom = marginbottom;
    }
}

/**
 * @author 12:51:01 PM Prasanna Kumar Reddy Mar 6, 2016
 */
