package com.zend.ide.p.d;

import com.zend.ide.r.o;
import com.zend.ide.r.s;
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class bc extends FileFilter
  implements o
{
  private String a = "";
  private bd c = null;
  private s b;

  public bc(String paramString)
  {
    this.a = paramString;
    this.c = new bd(paramString);
  }

  public boolean accept(File paramFile)
  {
    return this.c.accept(paramFile);
  }

  public String b()
  {
    return getDescription();
  }

  public String getDescription()
  {
    return this.a;
  }

  public String c()
  {
    return null;
  }

  public boolean d()
  {
    return false;
  }

  public boolean a(String paramString)
  {
    return false;
  }

  public boolean a(File paramFile)
  {
    return accept(paramFile);
  }

  public boolean b(String paramString)
  {
    return a(new File(paramString));
  }

  public s j()
  {
    if (this.b == null)
      this.b = new fb(this);
    return this.b;
  }

  public String toString()
  {
    return this.a;
  }

  static String a(bc parambc)
  {
    return parambc.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bc
 * JD-Core Version:    0.6.0
 */