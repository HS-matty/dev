package com.zend.ide.p;

import javax.swing.JToggleButton;

public class cc extends JToggleButton
{
  public cc(String paramString)
  {
    super(paramString);
  }

  public cc()
  {
  }

  public void setText(String paramString)
  {
    int i = paramString.indexOf("&");
    if (i != -1)
      try
      {
        paramString = paramString.substring(0, i) + paramString.substring(i + 1, paramString.length());
        setMnemonic(paramString.charAt(i));
      }
      catch (Exception localException)
      {
      }
    super.setText(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.cc
 * JD-Core Version:    0.6.0
 */