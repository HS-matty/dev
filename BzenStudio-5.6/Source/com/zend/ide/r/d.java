package com.zend.ide.r;

import java.util.Vector;
import javax.swing.Icon;

public class d extends b
{
  private Vector f = new Vector();
  private String g;
  private String l;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean m;
  private Icon k;
  private int n;

  public d(String paramString1, String paramString2)
  {
    b(paramString1);
    c(paramString2);
  }

  public f[] h()
  {
    f[] arrayOff = new f[this.f.size()];
    return (f[])(f[])this.f.toArray(arrayOff);
  }

  public boolean a(String paramString)
  {
    if (paramString == null)
      return false;
    paramString = paramString.startsWith(".") ? paramString.substring(1) : paramString;
    for (int i1 = 0; i1 < this.f.size(); i1++)
    {
      f localf = (f)this.f.get(i1);
      if (localf.b().equals(paramString))
        return true;
    }
    return false;
  }

  public String c()
  {
    String str = super.c();
    if (str == null)
      str = this.f.size() > 0 ? ((f)this.f.get(0)).b() : "";
    return str;
  }

  public Icon e()
  {
    return this.k;
  }

  public void a(Icon paramIcon)
  {
    this.k = paramIcon;
  }

  public boolean f()
  {
    return this.i;
  }

  public void b(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }

  public String g()
  {
    return this.g;
  }

  public void e(String paramString)
  {
    this.g = paramString;
  }

  public boolean i()
  {
    return this.h;
  }

  void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public void d(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public String a()
  {
    return this.l;
  }

  public void a(String paramString)
  {
    this.l = paramString;
  }

  public int b()
  {
    return this.n;
  }

  public void a(int paramInt)
  {
    this.n = paramInt;
  }

  public boolean c()
  {
    return this.m;
  }

  public void e(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }

  void a(f paramf)
  {
    if (this.f.contains(paramf))
      return;
    this.f.add(paramf);
  }

  void b(f paramf)
  {
    this.f.remove(paramf);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.d
 * JD-Core Version:    0.6.0
 */