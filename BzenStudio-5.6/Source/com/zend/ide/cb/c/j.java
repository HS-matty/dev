package com.zend.ide.cb.c;

import com.zend.ide.cb.f;
import com.zend.ide.cb.l;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.util.cl;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class j extends i
  implements f
{
  private static final l[] g = new l[0];
  private static final boolean h = System.getProperty("sqlDebug") != null;
  private List i;
  private String j;
  private String k;

  public j(String paramString, q paramq, h paramh)
  {
    super(paramString, paramq, paramh);
    this.d = paramq;
    if (paramh.g().g())
    {
      try
      {
        this.j = paramh.q().getMetaData().getSchemaTerm();
        if ((this.j != null) && (!this.j.trim().equals("")))
        {
          d(this.j);
        }
        else
        {
          this.j = a;
          d(this.j);
        }
      }
      catch (SQLException localSQLException1)
      {
        this.j = a;
        d(this.j);
      }
    }
    else
    {
      this.i = new ArrayList(5);
      try
      {
        String[] arrayOfString = paramh.g().j();
        for (int m = 0; m < arrayOfString.length; m++)
          d(arrayOfString[m]);
        if (paramh.g().i())
          d(e);
      }
      catch (SQLException localSQLException2)
      {
        cl.a(localSQLException2);
        if (h)
          localSQLException2.printStackTrace();
      }
    }
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof f)))
      return false;
    return a().equals(((f)paramObject).a());
  }

  private void a()
  {
    if (this.d.k())
      throw new IllegalAccessError("Tables should be removed from the schema");
    this.b.clear();
  }

  private void b()
  {
    if (!this.d.k())
      throw new IllegalAccessError("This database does not support schemas");
    this.b.clear();
  }

  public com.zend.ide.cb.v[] a(String paramString)
  {
    if (this.d.k())
      throw new IllegalAccessError("Tables information should be asked from the schema");
    ArrayList localArrayList = new ArrayList(this.b.size());
    for (int m = 0; m < this.b.size(); m++)
    {
      com.zend.ide.cb.v localv = (com.zend.ide.cb.v)this.b.get(m);
      if (!localv.g().equalsIgnoreCase(paramString))
        continue;
      localArrayList.add(localv);
    }
    com.zend.ide.cb.v[] arrayOfv = new com.zend.ide.cb.v[localArrayList.size()];
    localArrayList.toArray(arrayOfv);
    return arrayOfv;
  }

  public ResultSet a()
    throws SQLException
  {
    return this.c.g().a(this);
  }

  public p b(String paramString)
  {
    if (!this.d.k())
      throw new IllegalAccessError("This database does not support schemas");
    Object localObject = f(paramString);
    return localObject == null ? null : (p)localObject;
  }

  public p[] b()
  {
    if (!this.d.k())
      throw new IllegalAccessError("This database does not support schemas");
    if (this.b.size() == 0)
      try
      {
        d();
      }
      catch (SQLException localSQLException)
      {
      }
    p[] arrayOfp = new p[this.b.size()];
    this.b.toArray(arrayOfp);
    return arrayOfp;
  }

  public l[] c()
  {
    if (this.i == null)
      return g;
    l[] arrayOfl = new l[this.i.size()];
    this.i.toArray(arrayOfl);
    return arrayOfl;
  }

  public String d()
  {
    if (this.k == null)
      this.k = a();
    return this.k;
  }

  public void c(String paramString)
  {
    this.k = paramString;
  }

  public void d()
    throws SQLException
  {
    if (this.d.k())
    {
      c();
    }
    else
    {
      e();
      f();
    }
  }

  private void c()
    throws SQLException
  {
    b();
    p[] arrayOfp = this.c.g().b(this);
    for (int m = 0; m < arrayOfp.length; m++)
    {
      String str = arrayOfp[m].a();
      p localp = (p)f(str);
      if ((localp != null) || (arrayOfp[m] == null))
        continue;
      localp = arrayOfp[m];
      this.b.add(localp);
    }
  }

  private void e()
    throws SQLException
  {
    a();
    com.zend.ide.cb.v[] arrayOfv = this.c.g().a(this, null);
    for (int m = 0; m < arrayOfv.length; m++)
    {
      String str = arrayOfv[m].a();
      com.zend.ide.cb.v localv = (com.zend.ide.cb.v)f(str);
      if ((localv != null) || (arrayOfv[m] == null))
        continue;
      localv = arrayOfv[m];
      this.b.add(localv);
    }
  }

  private void f()
    throws SQLException
  {
    this.i.clear();
    l[] arrayOfl = this.c.g().b(this, null);
    for (int m = 0; m < arrayOfl.length; m++)
    {
      String str = arrayOfl[m].a();
      l locall = (l)a(str, this.i);
      if ((locall != null) || (arrayOfl[m] == null))
        continue;
      locall = arrayOfl[m];
      this.i.add(locall);
    }
  }

  public String toString()
  {
    return d();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.j
 * JD-Core Version:    0.6.0
 */