package com.zend.ide.p;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class w extends JButton
{
  public w(Action paramAction)
  {
    super(paramAction);
  }

  public w(String paramString)
  {
    super(paramString);
  }

  public w(Icon paramIcon)
  {
    super(paramIcon);
  }

  public w()
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
 * Qualified Name:     com.zend.ide.p.w
 * JD-Core Version:    0.6.0
 */