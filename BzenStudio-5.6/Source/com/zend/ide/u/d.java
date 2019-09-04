package com.zend.ide.u;

import java.io.File;
import javax.swing.JFrame;

class d extends c
{
  public d(bh parambh, String paramString)
  {
    super(parambh, paramString);
  }

  public File[] listFiles()
  {
    try
    {
      return super.listFiles();
    }
    catch (bu localbu)
    {
      JFrame localJFrame = com.zend.ide.bd.c.b().h();
      bd.a(localJFrame, (bh)c(), false, false, null);
    }
    return super.listFiles();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.d
 * JD-Core Version:    0.6.0
 */