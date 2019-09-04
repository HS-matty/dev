package com.zend.ide.u;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JFrame;

public class k extends j
{
  protected c t(String paramString)
  {
    return new d(this, d(paramString));
  }

  protected f b(String paramString, int paramInt)
  {
    e locale = new e(this, paramString, paramInt);
    return locale;
  }

  public void o(File paramFile)
  {
    try
    {
      super.o(paramFile);
    }
    catch (bu localbu)
    {
      JFrame localJFrame = com.zend.ide.bd.c.b().h();
      bd.a(localJFrame, this, false, false, null);
      super.o(paramFile);
    }
  }

  public OutputStream a(String paramString, boolean paramBoolean)
    throws IOException
  {
    try
    {
      return super.a(paramString, paramBoolean);
    }
    catch (bu localbu)
    {
      JFrame localJFrame = com.zend.ide.bd.c.b().h();
      bd.a(localJFrame, this, false, false, null);
    }
    return super.a(paramString, paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.k
 * JD-Core Version:    0.6.0
 */