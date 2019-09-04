package com.zend.ide.cb.c;

import java.io.File;
import java.io.FileFilter;

class gb
  implements FileFilter
{
  private gb()
  {
  }

  public boolean accept(File paramFile)
  {
    if (paramFile.isDirectory())
      return true;
    if (paramFile != null)
    {
      String str = paramFile.getName().toLowerCase();
      return (str.endsWith(".jar")) || (str.endsWith(".zip"));
    }
    return false;
  }

  gb(x paramx)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.gb
 * JD-Core Version:    0.6.0
 */