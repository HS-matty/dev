package com.zend.ide.w.a;

import com.zend.ide.w.q;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class l
  implements Serializable, q
{
  private static final String[] a = { "update", "commit", "add", "status", "checkout", "diff", "log", "remove" };
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private String j = a[paramInt];
  private String r;
  private String k;
  private String l;
  private String m;
  private String n = "";
  private String o;
  private String p;
  private File q;

  public static l a(String paramString)
  {
    for (int i1 = 0; i1 < a.length; i1++)
      if (a[i1].equals(paramString))
        return new l(i1);
    return null;
  }

  public l(int paramInt)
  {
  }

  public String q()
  {
    return this.j;
  }

  public void i(String paramString)
  {
    this.r = paramString;
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
    this.d = paramBoolean;
  }

  public boolean d()
  {
    return this.d;
  }

  public void d(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public boolean e()
  {
    return this.e;
  }

  public void e(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public boolean f()
  {
    return this.f;
  }

  public void f(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public boolean g()
  {
    return this.g;
  }

  public void g(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public boolean h()
  {
    return this.h;
  }

  public void h(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }

  public boolean i()
  {
    return this.i;
  }

  public void b(String paramString)
  {
    this.k = paramString;
  }

  public String j()
  {
    return this.k;
  }

  public void c(String paramString)
  {
    this.l = paramString;
  }

  public String k()
  {
    return this.l;
  }

  public void d(String paramString)
  {
    this.m = paramString;
  }

  public String l()
  {
    return this.m;
  }

  public void e(String paramString)
  {
    this.n = paramString;
  }

  public void f(String paramString)
  {
    this.o = paramString;
  }

  public void g(String paramString)
  {
    this.p = paramString;
  }

  public void a(File paramFile)
  {
    this.q = paramFile;
  }

  public String m()
  {
    return this.o;
  }

  public String n()
  {
    return this.p;
  }

  public File o()
  {
    return this.q;
  }

  private static String h(String paramString)
  {
    paramString = " '" + paramString + "' ";
    return paramString;
  }

  public String[] p()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.r != null)
      localArrayList.add(this.r);
    if (this.g)
      localArrayList.add("-q");
    if (this.j.equals("checkout"))
    {
      localArrayList.add("-d");
      localArrayList.add(this.o);
    }
    localArrayList.add(this.j);
    if (this.b)
      localArrayList.add("-l");
    if (this.c)
      localArrayList.add("-v");
    if (this.d)
      localArrayList.add("-P");
    if (this.e)
      localArrayList.add("-d");
    if (this.f)
      localArrayList.add("-A");
    if (this.h)
      localArrayList.add("-kb");
    if (this.i)
      localArrayList.add("-w");
    if ((this.j.equals("commit")) && (this.n != null))
    {
      localArrayList.add("-m");
      localArrayList.add(this.n.equals("") ? "\"\"" : this.n);
    }
    if ((this.k != null) && (!this.k.equals("")))
    {
      localArrayList.add("-r");
      localArrayList.add(this.k);
    }
    if ((this.l != null) && (!this.l.equals("")))
    {
      localArrayList.add("-D");
      localArrayList.add(this.l);
    }
    if ((this.m != null) && (!this.m.equals("")))
    {
      arrayOfString = this.m.split(" ");
      for (int i1 = 0; i1 < arrayOfString.length; i1++)
        localArrayList.add(arrayOfString[i1]);
    }
    if (this.j.equals("checkout"))
      localArrayList.add(this.p);
    String[] arrayOfString = new String[localArrayList.size()];
    localArrayList.toArray(arrayOfString);
    return arrayOfString;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.r != null)
      localStringBuffer.append(" " + this.r);
    if (this.g)
      localStringBuffer.append(" -q");
    if (this.j.equals("checkout"))
    {
      localStringBuffer.append(" -d ");
      localStringBuffer.append(this.o);
    }
    localStringBuffer.append(" " + this.j);
    if (this.b)
      localStringBuffer.append(" -l");
    if (this.c)
      localStringBuffer.append(" -v");
    if (this.d)
      localStringBuffer.append(" -P");
    if (this.e)
      localStringBuffer.append(" -d");
    if (this.f)
      localStringBuffer.append(" -A");
    if (this.h)
      localStringBuffer.append(" -kb");
    if (this.i)
      localStringBuffer.append(" -w");
    if (this.n != null)
      localStringBuffer.append(" -m " + h(this.n));
    if ((this.k != null) && (!this.k.equals("")))
      localStringBuffer.append(" -r " + this.k);
    if ((this.l != null) && (!this.l.equals("")))
      localStringBuffer.append(" -D " + this.l);
    if ((this.m != null) && (!this.m.equals("")))
      localStringBuffer.append(" " + this.m);
    if (this.j.equals("checkout"))
      localStringBuffer.append(" " + this.p);
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.l
 * JD-Core Version:    0.6.0
 */