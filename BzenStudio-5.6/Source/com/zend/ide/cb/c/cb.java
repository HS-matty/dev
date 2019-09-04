package com.zend.ide.cb.c;

import java.io.File;
import java.io.FileFilter;

class cb
  implements FileFilter
{
  private cb()
  {
  }

  public boolean accept(File paramFile)
  {
    return (paramFile != null) && (paramFile.getName().toLowerCase().endsWith(".xml"));
  }

  cb(x paramx)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.cb
 * JD-Core Version:    0.6.0
 */