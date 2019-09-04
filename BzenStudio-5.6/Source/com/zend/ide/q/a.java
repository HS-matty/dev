package com.zend.ide.q;

import java.io.File;
import java.io.FileFilter;

class a
  implements FileFilter
{
  public boolean accept(File paramFile)
  {
    return paramFile.getName().startsWith("ZendGuard-");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.q.a
 * JD-Core Version:    0.6.0
 */