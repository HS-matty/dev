package com.zend.ide.p;

import javax.swing.Icon;
import javax.swing.JLabel;

public class z extends JLabel
{
  public z()
  {
  }

  public z(String paramString)
  {
    super(paramString);
  }

  public z(Icon paramIcon)
  {
    super(paramIcon);
  }

  public void setText(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.indexOf("&");
      if (i != -1)
        try
        {
          paramString = paramString.substring(0, i) + paramString.substring(i + 1, paramString.length());
          setDisplayedMnemonic(paramString.charAt(i));
        }
        catch (Exception localException)
        {
        }
    }
    super.setText(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.z
 * JD-Core Version:    0.6.0
 */