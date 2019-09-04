package com.zend.ide.desktop;

import com.zend.ide.util.bh;
import com.zend.ide.util.c.a;
import com.zend.ide.util.cl;
import java.io.File;
import javax.swing.SwingUtilities;

abstract class ob extends a
{
  protected String a;
  protected File b;
  protected int c;
  protected bh d;
  final cj e;

  private ob(cj paramcj)
  {
  }

  public void a(Object paramObject)
  {
    this.a = ((String)paramObject);
    String[] arrayOfString = this.a.split(":::");
    this.b = com.zend.ide.j.h.m.g(arrayOfString[0]);
    if (arrayOfString.length > 1)
      try
      {
        this.c = Integer.parseInt(arrayOfString[1]);
      }
      catch (Exception localException1)
      {
        cl.a(localException1);
      }
    if ((arrayOfString.length > 2) && (arrayOfString[2] != null) && (arrayOfString[2].length() > 0))
      try
      {
        this.d = new bh(arrayOfString[2]);
      }
      catch (Exception localException2)
      {
        cl.a(localException2);
      }
  }

  protected boolean a()
  {
    try
    {
      if ((this.b.getPath().startsWith("/")) || (this.b.getPath().startsWith("\\")))
        this.b = com.zend.ide.j.h.m.g("/" + this.b.getPath());
      this.b = this.b.getCanonicalFile();
      this.e.a(this.b.getPath(), this.d, -1);
      SwingUtilities.invokeLater(new tb(this));
      this.e.Y();
      return true;
    }
    catch (Exception localException)
    {
      this.e.Z();
      com.zend.ide.util.c.h.c().a(new ub(this));
    }
    return false;
  }

  ob(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ob
 * JD-Core Version:    0.6.0
 */