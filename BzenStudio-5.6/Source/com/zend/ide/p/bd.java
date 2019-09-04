package com.zend.ide.p;

import javax.swing.JTextField;

public class bd extends JTextField
{
  public bd()
  {
  }

  public bd(int paramInt)
  {
    super(paramInt);
  }

  public void replaceSelection(String paramString)
  {
    int i = paramString.indexOf("\n");
    if (i == 0)
    {
      if (paramString.length() > 1)
        replaceSelection(paramString.substring(1));
      return;
    }
    if (i > 0)
      paramString = paramString.substring(0, i);
    super.replaceSelection(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bd
 * JD-Core Version:    0.6.0
 */