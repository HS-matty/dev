package com.zend.ide.w.c;

import com.zend.ide.desktop.cj;
import com.zend.ide.util.bi;
import com.zend.ide.util.cr;
import com.zend.ide.util.cu;
import com.zend.ide.w.kb;
import com.zend.ide.y.a;
import java.beans.PropertyChangeListener;
import java.io.File;

public class d extends com.zend.ide.w.e
  implements cu
{
  private com.zend.ide.w.k c = new com.zend.ide.desktop.e.p.f(paramcj, this);
  private g d = new g();
  private static String e = ".";
  private j f = new j();
  private PropertyChangeListener g = new m(this, null);
  private String h;
  private com.zend.ide.y.e i;
  private kb j;

  public d(cj paramcj)
  {
    e();
  }

  public String a()
  {
    return "Subversion";
  }

  public void a(boolean paramBoolean)
  {
    this.c.a(paramBoolean);
  }

  public a b()
  {
    return this.c.a();
  }

  public int a(String paramString, Object paramObject)
  {
    return this.f.a(paramString);
  }

  public String toString()
  {
    return a();
  }

  public void a(File[] paramArrayOfFile)
  {
    this.c.a(paramArrayOfFile);
  }

  public void b(File[] paramArrayOfFile)
  {
    this.c.b(paramArrayOfFile);
  }

  public static boolean a(File paramFile)
  {
    return j.a(paramFile);
  }

  public boolean b(File paramFile)
  {
    return this.f.b(paramFile);
  }

  public boolean c(File paramFile)
  {
    return this.f.d(paramFile);
  }

  public boolean d(File paramFile)
  {
    return this.f.c(paramFile);
  }

  public boolean e(File paramFile)
  {
    return this.f.e(paramFile);
  }

  public boolean f(File paramFile)
  {
    return this.f.f(paramFile);
  }

  public boolean g(File paramFile)
  {
    return this.f.g(paramFile);
  }

  public boolean h(File paramFile)
  {
    return this.f.h(paramFile);
  }

  public String c()
  {
    return this.h;
  }

  public void a(String paramString)
  {
    this.h = paramString;
  }

  public static String b()
  {
    String str = bi.a("SVN_LOCATION", "./SourceControl/svn/svn");
    if (cr.c() == 1)
      str = str + ".exe";
    return str;
  }

  public Object c()
  {
    k localk = new k();
    localk.a(d().D());
    return localk;
  }

  public void a(Object paramObject)
  {
    k localk = (k)paramObject;
    d().a(localk.a());
  }

  public g d()
  {
    return this.d;
  }

  public void d()
  {
    this.c.c();
  }

  void e()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.i = new com.zend.ide.y.e(localf);
    localf.a("svn.svnCommandLine", this.g);
    this.i.a("svn.svnCommandLine");
  }

  public void a(kb paramkb)
  {
    this.j = paramkb;
  }

  public void c(File[] paramArrayOfFile)
  {
    if (this.j != null)
      this.j.a(paramArrayOfFile);
  }

  public String e()
  {
    return ".svn";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.d
 * JD-Core Version:    0.6.0
 */