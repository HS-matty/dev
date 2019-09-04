package com.zend.ide.l;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class rb extends FileFilter
{
  final tb a;
  final nb b;

  rb(nb paramnb, tb paramtb)
  {
  }

  public boolean accept(File paramFile)
  {
    String str = paramFile.getName().toLowerCase();
    return (paramFile.isDirectory()) || (str.endsWith(".jar")) || (str.endsWith(".zip"));
  }

  public String getDescription()
  {
    return "*.jar;*.zip";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.rb
 * JD-Core Version:    0.6.0
 */