package com.zend.ide.cb.c;

import com.zend.ide.cb.d;
import com.zend.ide.cb.e;
import com.zend.ide.cb.o;
import com.zend.ide.cb.s;
import com.zend.ide.cb.w;
import com.zend.ide.cb.y;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class q extends i
  implements com.zend.ide.cb.q
{
  private boolean g;
  private List h;
  private boolean i;
  private com.zend.ide.util.c.f j;
  private w[] f;
  private boolean l;
  private boolean m;
  private Object k = new Object();

  public q(String paramString)
  {
    super(paramString);
    if ((paramString == null) || (paramString.trim().equals("")))
      throw new IllegalArgumentException("Invalid server name");
    this.h = new ArrayList(5);
    this.g = (System.getProperty("sqlDebug") != null);
    d(d);
    d(e);
  }

  private void c()
  {
    this.b.clear();
  }

  public com.zend.ide.cb.f b(String paramString)
  {
    Object localObject = f(paramString);
    return localObject == null ? null : (com.zend.ide.cb.f)localObject;
  }

  public void a(String paramString)
  {
    if (!a().equals(paramString))
    {
      y localy = new y(this, a(), 2);
      this.a = paramString;
      this.c.o().f(paramString);
      a(localy);
    }
  }

  public com.zend.ide.cb.q c()
  {
    return this;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof com.zend.ide.cb.q)))
      return false;
    return a().equals(((com.zend.ide.cb.q)paramObject).a());
  }

  public com.zend.ide.cb.f[] i()
  {
    if (this.b.size() == 0)
      try
      {
        b(false);
      }
      catch (SQLException localSQLException)
      {
      }
      catch (Throwable localThrowable)
      {
        cl.a(localThrowable);
      }
    com.zend.ide.cb.f[] arrayOff = new com.zend.ide.cb.f[this.b.size()];
    this.b.toArray(arrayOff);
    return arrayOff;
  }

  public w[] j()
  {
    if (this.f == null)
      try
      {
        e();
      }
      catch (SQLException localSQLException)
      {
      }
      catch (Throwable localThrowable)
      {
        cl.a(localThrowable);
      }
    return this.f;
  }

  public void a(s params)
  {
    if (!this.h.contains(params))
      this.h.add(params);
  }

  public void b(s params)
  {
    this.h.remove(params);
  }

  public boolean k()
  {
    return this.c.g().g();
  }

  public boolean a(SQLException paramSQLException)
  {
    return a().g().a(paramSQLException) == 1;
  }

  public void a(boolean paramBoolean)
  {
    if (this.j == null)
      this.j = com.zend.ide.util.c.h.c().b(new u(this, this));
    if (!l().n())
      paramBoolean = false;
    if (paramBoolean != this.i)
    {
      if (paramBoolean)
      {
        int n = l().m() * 1000;
        this.j.a(n, n);
      }
      else
      {
        this.j.a();
        this.j.d();
      }
      this.i = paramBoolean;
    }
  }

  public void a(e parame)
  {
    this.c.a(parame);
  }

  public e l()
  {
    return this.c.o();
  }

  public o m()
  {
    return this.c;
  }

  public String n()
  {
    return a().g().l();
  }

  public void c(String paramString)
    throws SQLException
  {
    if (this.g)
      System.out.println("Trying to kill process " + paramString);
    a().g().a(paramString);
  }

  public void a()
    throws d
  {
    if ((this.c == null) || (!this.c.s()))
      throw new d(ct.a(1672));
    try
    {
      if ((this.m) || (!a(true)))
      {
        this.c.c();
        a(new y(this, 0));
        if (!this.m)
          a(true);
        if (this.g)
          System.out.println("Server Connected: " + a());
      }
    }
    catch (Exception localException)
    {
      a(new y(this, 1));
      if (this.g)
        System.out.println("Server Disconnected: " + a());
      throw new d(localException);
    }
  }

  public void b()
  {
    a(false);
    this.l = false;
    if (this.c != null)
    {
      this.c.a();
      if (this.g)
        System.out.println("Server Disconnected: " + a());
    }
    a(new y(this, 1));
  }

  public boolean a(boolean paramBoolean, long paramLong, int paramInt)
  {
    a(false);
    this.l = false;
    if (this.c != null)
      this.c.a();
    if (paramBoolean)
    {
      this.m = true;
      while (paramInt > 0)
      {
        paramInt--;
        try
        {
          try
          {
            Thread.sleep(paramLong);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
          a();
          this.m = false;
          a(true);
          return true;
        }
        catch (d locald)
        {
          if (this.g)
            System.out.println("Could not connect to " + a());
        }
      }
    }
    this.m = false;
    a(new y(this, 1));
    return false;
  }

  public boolean a(boolean paramBoolean)
  {
    return a(paramBoolean, false);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.m)
      return false;
    boolean bool = (this.c != null) && (this.c.a(paramBoolean1));
    if (this.l != bool)
    {
      this.l = bool;
      if (bool)
        a(new y(this, 0));
      else
        new Thread(new t(this)).start();
      if (!this.l)
        a(new y(this, 1, paramBoolean2));
    }
    return this.l;
  }

  public void d()
    throws SQLException
  {
    b(true);
  }

  private void b(boolean paramBoolean)
    throws SQLException
  {
    c();
    com.zend.ide.cb.f[] arrayOff = this.c.g().a(this);
    for (int n = 0; n < arrayOff.length; n++)
    {
      String str = arrayOff[n].a();
      com.zend.ide.cb.f localf = (com.zend.ide.cb.f)f(str);
      if ((localf != null) || (arrayOff[n] == null))
        continue;
      localf = arrayOff[n];
      this.b.add(localf);
    }
    if (paramBoolean)
      e();
  }

  private void e()
    throws SQLException
  {
    synchronized (this.k)
    {
      this.f = this.c.g().b(this);
    }
  }

  public ResultSet d()
    throws SQLException
  {
    return this.c.g().a();
  }

  public ResultSet e()
    throws SQLException
  {
    return this.c.g().b();
  }

  public ResultSet f()
    throws SQLException
  {
    return this.c.g().c();
  }

  public void a(String paramString1, String paramString2)
    throws SQLException
  {
    this.c.g().a(paramString1, paramString2);
  }

  public String g()
  {
    return this.c.g().d();
  }

  public String h()
  {
    return this.c.g().e();
  }

  public boolean a()
  {
    return true;
  }

  public boolean b()
  {
    return true;
  }

  private void a(y paramy)
  {
    s[] arrayOfs = new s[this.h.size()];
    synchronized (this.h)
    {
      this.h.toArray(arrayOfs);
    }
    for (int n = 0; n < arrayOfs.length; n++)
      switch (paramy.a())
      {
      case 0:
        arrayOfs[n].a(paramy);
        break;
      case 1:
        arrayOfs[n].b(paramy);
        break;
      case 2:
        arrayOfs[n].c(paramy);
      }
  }

  static boolean a(q paramq, boolean paramBoolean)
  {
    return paramq.l = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.q
 * JD-Core Version:    0.6.0
 */