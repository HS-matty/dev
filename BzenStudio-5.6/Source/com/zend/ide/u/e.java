package com.zend.ide.u;

import com.zend.ide.util.dj;
import java.io.File;

public class e extends f
{
  public e(bh parambh, String paramString, int paramInt)
  {
    super(parambh, paramString, paramInt);
  }

  public File[] listFiles()
  {
    try
    {
      File[] arrayOfFile = super.listFiles();
      return arrayOfFile;
    }
    catch (bu localbu)
    {
      return null;
    }
    catch (dj localdj)
    {
      if (localdj.getMessage().indexOf("Connection refused") == -1)
        throw localdj;
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.e
 * JD-Core Version:    0.6.0
 */