package com.zend.ide.w.c;

import com.zend.ide.w.q;
import java.io.File;
import java.io.Serializable;

public class f
  implements Serializable, q
{
  private static final String[] a = { "update", "commit", "add", "status", "checkout", "diff", "log", "delete", "resolve", "revert", "login" };
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private String g = a[paramInt];
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private File n;
  private String o;
  private String p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  private String u;

  public static f a(String paramString)
  {
    for (int i1 = 0; i1 < a.length; i1++)
      if (a[i1].equals(paramString))
        return new f(i1);
    return null;
  }

  public f(int paramInt)
  {
  }

  public String a()
  {
    return this.g;
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public boolean b()
  {
    return this.b;
  }

  public void b(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public boolean c()
  {
    return this.c;
  }

  public void c(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public boolean d()
  {
    return this.e;
  }

  public boolean e()
  {
    return this.q;
  }

  public void d(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }

  public String f()
  {
    return this.u;
  }

  public void b(String paramString)
  {
    this.u = paramString;
  }

  public boolean g()
  {
    return this.f;
  }

  public void e(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public void f(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }

  public boolean h()
  {
    return this.r;
  }

  public boolean i()
  {
    return this.s;
  }

  public void g(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }

  public boolean j()
  {
    return this.t;
  }

  public void h(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }

  public void c(String paramString)
  {
    this.i = paramString;
  }

  public String k()
  {
    return this.i;
  }

  public void d(String paramString)
  {
    this.j = paramString;
  }

  public String l()
  {
    return this.j;
  }

  public void e(String paramString)
  {
    this.k = paramString;
  }

  public String m()
  {
    return this.k;
  }

  public void f(String paramString)
  {
    this.m = paramString;
  }

  public void a(File paramFile)
  {
    this.n = paramFile;
  }

  public String n()
  {
    return this.m;
  }

  public File o()
  {
    return this.n;
  }

  public String p()
  {
    return this.o;
  }

  public void g(String paramString)
  {
    this.o = paramString;
  }

  public String q()
  {
    return this.p;
  }

  public void h(String paramString)
  {
    this.p = paramString;
  }

  private static String i(String paramString)
  {
    paramString = " '" + paramString + "' ";
    return paramString;
  }

  public boolean r()
  {
    return this.d;
  }

  public void i(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.h != null)
      localStringBuffer.append(' ' + this.h);
    if (this.e)
      localStringBuffer.append(" -q");
    if (this.g.equals("checkout"))
    {
      localStringBuffer.append(" -d ");
      localStringBuffer.append(this.l);
    }
    localStringBuffer.append(' ' + this.g);
    if (this.b)
      localStringBuffer.append(" -N");
    if (this.f)
      localStringBuffer.append(" --force");
    if (this.c)
      localStringBuffer.append(" -v");
    if (this.d)
      localStringBuffer.append(" -u");
    if (this.k != null)
      localStringBuffer.append(" -m " + i(this.k));
    if ((this.i != null) && (!this.i.equals("")))
      localStringBuffer.append(" -r " + this.i);
    if ((this.j != null) && (!this.j.equals("")))
      localStringBuffer.append(' ' + this.j);
    if (this.g.equals("checkout"))
      localStringBuffer.append(' ' + this.m);
    if ((this.g.equals("diff")) && (e()))
    {
      if (this.r)
        localStringBuffer.append(" -w");
      if (this.s)
        localStringBuffer.append(" -B");
      if (this.t)
        localStringBuffer.append(" -i");
      localStringBuffer.append(' ' + i(this.u));
    }
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.f
 * JD-Core Version:    0.6.0
 */