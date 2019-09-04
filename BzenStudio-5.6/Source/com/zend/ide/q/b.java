package com.zend.ide.q;

import java.io.File;
import java.io.FileFilter;

class b
  implements FileFilter
{
  public boolean accept(File paramFile)
  {
    return paramFile.getName().startsWith("ZendSafeGuard-");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.q.b
 * JD-Core Version:    0.6.0
 */