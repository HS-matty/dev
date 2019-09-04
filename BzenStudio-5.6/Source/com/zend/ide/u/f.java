package com.zend.ide.u;

import com.zend.ide.j.a;
import com.zend.ide.j.bd;
import com.zend.ide.j.s;
import com.zend.ide.util.cl;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class f extends a
  implements bd
{
  String i;
  protected int j = -1;
  private long k = -1L;
  private long l = -1L;
  private String p = null;
  private transient Vector m;
  private transient Object n = new q(this);
  private String o = null;

  public f(bh parambh, String paramString, int paramInt)
  {
    super(parambh, paramString, paramInt);
  }

  public f(bh parambh, String paramString)
  {
    super(parambh, paramString);
  }

  String d()
  {
    return this.o;
  }

  void a(String paramString)
  {
    this.o = paramString;
  }

  boolean e()
  {
    return this.o != null;
  }

  public long f()
  {
    return this.k;
  }

  f g()
  {
    if (!e())
      return null;
    i locali = (i)c();
    return (f)locali.a(getParentFile(), d());
  }

  void a(o paramo)
  {
    a(null);
    this.p = null;
    if (paramo == null)
      return;
    int i1 = 0;
    if ((paramo.c != null) && (!paramo.c.equals("")))
    {
      a(paramo.c);
      i1 = 1;
    }
    if ((paramo.d != -1) && (this.j != paramo.d))
    {
      a(paramo.d);
      i1 = 1;
    }
    if ((paramo.f != -1L) && (this.l != paramo.f))
    {
      b(paramo.f);
      i1 = 1;
    }
    if ((paramo.e != -1L) && (this.k != paramo.e))
    {
      a(paramo.e);
      i1 = 1;
    }
    if (i1 != 0)
    {
      i locali = (i)c();
      locali.y(this);
    }
  }

  void a(int paramInt)
  {
    this.j = paramInt;
  }

  synchronized int h()
  {
    return this.j;
  }

  void a(long paramLong)
  {
    this.k = paramLong;
  }

  public long length()
  {
    if (this.k == -1L)
      return super.length();
    return this.k;
  }

  public long lastModified()
  {
    if (this.l == -1L)
      return super.lastModified();
    return this.l;
  }

  public void b(long paramLong)
  {
    this.l = paramLong;
  }

  public boolean i()
  {
    return h() != -1;
  }

  public boolean b()
  {
    return i();
  }

  public boolean j()
  {
    return (i()) && ((isFile()) || (this.m != null));
  }

  public File[] listFiles()
  {
    if (e())
      return new File[] { g() };
    if (!i())
      ((i)c()).a(this, false);
    if (!j())
      ((i)c()).a(this, false);
    if (!isDirectory())
      return null;
    File[] arrayOfFile;
    synchronized (this.n)
    {
      if (this.m != null)
      {
        arrayOfFile = new File[this.m.size()];
        this.m.toArray(arrayOfFile);
      }
      else
      {
        arrayOfFile = new File[0];
      }
    }
    return arrayOfFile;
  }

  public s c()
  {
    bh localbh = i.w(this.i);
    return localbh;
  }

  public synchronized void a(s params)
  {
    this.i = params.c();
  }

  boolean a(File paramFile)
  {
    if (!equals(paramFile.getParentFile()))
      a(paramFile.getParentFile(), 1);
    if (!j())
      return false;
    synchronized (this.n)
    {
      return this.m.remove(paramFile);
    }
  }

  boolean b(File paramFile)
  {
    if (!equals(paramFile.getParentFile()))
    {
      a(paramFile.getParentFile(), 2);
      return false;
    }
    synchronized (this.n)
    {
      if (!j())
        this.m = new Vector();
      if ((this.m != null) && (!this.m.contains(paramFile)))
      {
        this.m.add(paramFile);
        return true;
      }
      return false;
    }
  }

  void a(o[] paramArrayOfo)
  {
    synchronized (this.m)
    {
      if (!j())
        this.m = new Vector();
      for (int i1 = 0; i1 < paramArrayOfo.length; i1++)
      {
        f localf = (f)c().a(this, paramArrayOfo[i1].b);
        if (!equals(localf.getParentFile()))
        {
          a(localf.getParentFile(), 3);
        }
        else
        {
          if (this.m.contains(localf))
            continue;
          this.m.add(localf);
          localf.a(paramArrayOfo[i1]);
        }
      }
    }
  }

  private void a(File paramFile, int paramInt)
  {
    cl.a("File have a different parent(" + paramInt + "): parent - " + paramFile.getAbsolutePath() + ",  this - " + getAbsolutePath());
  }

  void k()
  {
    synchronized (this.n)
    {
      if (this.m != null)
      {
        int i1 = 0;
        int i2 = this.m.size();
        while (i1 < i2)
        {
          f localf = (f)this.m.get(i1);
          localf.k();
          i1++;
        }
        this.m.clear();
      }
    }
  }

  void b(int paramInt)
  {
    synchronized (this.n)
    {
      k();
      if (this.m == null)
        this.m = new Vector(paramInt);
    }
  }

  public synchronized String toString()
  {
    String str = getName();
    if (e())
      str = str + " -> " + d();
    return str;
  }

  public String getCanonicalPath()
    throws IOException
  {
    if (this.p == null)
      this.p = super.getCanonicalPath();
    return this.p;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f))
      return false;
    f localf = (f)paramObject;
    try
    {
      String str1 = getCanonicalPath();
      String str2 = localf.getCanonicalPath();
      return str1.equals(str2);
    }
    catch (Exception localException)
    {
    }
    throw new RuntimeException("Unexpected Error");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.f
 * JD-Core Version:    0.6.0
 */