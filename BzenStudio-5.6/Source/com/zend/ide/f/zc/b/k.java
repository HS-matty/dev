package com.zend.ide.f.zc.b;

import java.io.File;
import java.io.FilenameFilter;

class k
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    paramString = paramString.toLowerCase();
    return (paramString.endsWith(".jar")) || (paramString.endsWith(".zip"));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.k
 * JD-Core Version:    0.6.0
 */