package com.zend.ide.p.d;

import com.zend.ide.util.cr;
import java.io.File;
import javax.swing.Icon;
import javax.swing.UIManager;
import javax.swing.filechooser.FileView;

public class bm extends FileView
{
  static boolean a = cr.c() == 1;
  protected static String b = UIManager.getString("FileChooser.directoryDescriptionText");
  protected static String c = UIManager.getString("FileChooser.fileDescriptionText");
  private bg d;

  public bm(bg parambg)
  {
    this.d = parambg;
  }

  public bm()
  {
    this(bl.q);
  }

  public String getName(File paramFile)
  {
    String str = null;
    if (paramFile != null)
      str = this.d.getSystemDisplayName(paramFile);
    return str;
  }

  public String getDescription(File paramFile)
  {
    return paramFile.getName();
  }

  public String getTypeDescription(File paramFile)
  {
    String str = this.d.getSystemTypeDescription(paramFile);
    if (str == null)
      if (paramFile.isDirectory())
        str = b;
      else
        str = c;
    return str;
  }

  public Icon getIcon(File paramFile)
  {
    return a(paramFile, false);
  }

  public Icon a(File paramFile, boolean paramBoolean)
  {
    Icon localIcon = null;
    try
    {
      localIcon = this.d.b(paramFile, paramBoolean);
    }
    catch (Exception localException)
    {
    }
    return localIcon;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bm
 * JD-Core Version:    0.6.0
 */