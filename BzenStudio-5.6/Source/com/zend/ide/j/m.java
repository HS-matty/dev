package com.zend.ide.j;

import com.zend.ide.p.d.bl;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import sun.awt.shell.ShellFolder;

public class m extends k
{
  public static String l = "fileChooserComboBoxFolders";
  public static String m = "roots";
  private static boolean n = true;
  protected PropertyChangeListener o;

  public m(String paramString1, String paramString2, u paramu)
  {
    super(paramString1, paramu, (File[])(File[])ShellFolder.get(paramString2));
  }

  public m(u paramu)
  {
    super(paramu.c(), paramu);
  }

  public File[] b()
  {
    File[] arrayOfFile = new File[this.i.size()];
    return (File[])this.i.toArray(arrayOfFile);
  }

  public void a(File[] paramArrayOfFile)
  {
    this.i.addAll(Arrays.asList(paramArrayOfFile));
    e(paramArrayOfFile);
  }

  public void u()
  {
    super.u();
    this.o = new x(this, null);
    this.e.a("desktop.showHiddenFiles", this.o);
    this.d.a("desktop.showHiddenFiles");
  }

  public File[] n(File paramFile)
  {
    File[] arrayOfFile = null;
    try
    {
      arrayOfFile = bl.q.getFiles(paramFile, n);
    }
    catch (Exception localException)
    {
    }
    if (arrayOfFile == null)
      arrayOfFile = super.n(paramFile);
    return arrayOfFile;
  }

  static boolean a(boolean paramBoolean)
  {
    return m.n = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.m
 * JD-Core Version:    0.6.0
 */