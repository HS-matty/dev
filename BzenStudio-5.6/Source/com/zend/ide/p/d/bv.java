package com.zend.ide.p.d;

import com.zend.ide.j.t;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicDirectoryModel;

class bv extends BasicDirectoryModel
{
  File a = null;
  File b = null;
  final bw c;

  public bv(bw parambw, JFileChooser paramJFileChooser)
  {
    super(paramJFileChooser);
  }

  public boolean renameFile(File paramFile1, File paramFile2)
  {
    if ((this.a != null) && (this.a.equals(paramFile1)) && (this.b != null) && (this.b.equals(paramFile2)))
      return false;
    this.a = paramFile1;
    this.b = paramFile2;
    getDirectories();
    if (t.a(paramFile1, paramFile2, this.c.getFileChooser()))
    {
      validateFileCache();
      return true;
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bv
 * JD-Core Version:    0.6.0
 */