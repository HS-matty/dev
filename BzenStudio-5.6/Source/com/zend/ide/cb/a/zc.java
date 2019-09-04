package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import java.io.File;
import javax.swing.filechooser.FileFilter;

class zc extends FileFilter
{
  final jd a;

  private zc(jd paramjd)
  {
  }

  public boolean accept(File paramFile)
  {
    if (paramFile != null)
    {
      if (paramFile.isDirectory())
        return true;
      String str = a(paramFile);
      if ((str != null) && (str.equals("db")))
        return true;
    }
    return false;
  }

  public String getDescription()
  {
    return ct.a(1519);
  }

  public String a(File paramFile)
  {
    if (paramFile != null)
    {
      String str = paramFile.getName();
      int i = str.lastIndexOf('.');
      if ((i > 0) && (i < str.length() - 1))
        return str.substring(i + 1).toLowerCase();
    }
    return null;
  }

  zc(jd paramjd, y paramy)
  {
    this(paramjd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.zc
 * JD-Core Version:    0.6.0
 */