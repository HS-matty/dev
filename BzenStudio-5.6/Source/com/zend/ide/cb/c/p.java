package com.zend.ide.cb.c;

import com.zend.ide.cb.f;
import com.zend.ide.cb.l;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class p extends i
  implements com.zend.ide.cb.p
{
  private static final l[] g = new l[0];
  private f h;
  private List i;

  public p(String paramString, h paramh, f paramf)
  {
    super(paramString, paramf.c(), paramh);
    this.h = paramf;
    try
    {
      String[] arrayOfString = paramh.g().j();
      for (int j = 0; j < arrayOfString.length; j++)
        d(arrayOfString[j]);
      if (paramh.g().i())
        d(a);
    }
    catch (SQLException localSQLException)
    {
    }
    this.i = new ArrayList(10);
  }

  private void a()
  {
    this.b.clear();
  }

  public void d()
    throws SQLException
  {
    c();
    b();
  }

  private void b()
    throws SQLException
  {
    this.i.clear();
    l[] arrayOfl = this.c.g().b(a(), this);
    for (int j = 0; j < arrayOfl.length; j++)
    {
      String str = arrayOfl[j].a();
      l locall = (l)a(str, this.i);
      if (locall != null)
        continue;
      locall = arrayOfl[j];
      this.i.add(locall);
    }
  }

  private void c()
    throws SQLException
  {
    a();
    com.zend.ide.cb.v[] arrayOfv = this.c.g().a(a(), this);
    for (int j = 0; j < arrayOfv.length; j++)
    {
      String str = arrayOfv[j].a();
      com.zend.ide.cb.v localv = (com.zend.ide.cb.v)f(str);
      if ((localv != null) || (arrayOfv[j] == null))
        continue;
      localv = arrayOfv[j];
      this.b.add(localv);
    }
  }

  public f a()
  {
    return this.h;
  }

  public com.zend.ide.cb.v[] a(String paramString)
  {
    ArrayList localArrayList = new ArrayList(this.b.size());
    for (int j = 0; j < this.b.size(); j++)
    {
      com.zend.ide.cb.v localv = (com.zend.ide.cb.v)this.b.get(j);
      if (!localv.g().equalsIgnoreCase(paramString))
        continue;
      localArrayList.add(localv);
    }
    com.zend.ide.cb.v[] arrayOfv = new com.zend.ide.cb.v[localArrayList.size()];
    localArrayList.toArray(arrayOfv);
    return arrayOfv;
  }

  public ResultSet b()
    throws SQLException
  {
    return this.c.g().a(this);
  }

  public l[] c()
  {
    if (this.i == null)
      return g;
    l[] arrayOfl = new l[this.i.size()];
    this.i.toArray(arrayOfl);
    return arrayOfl;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof com.zend.ide.cb.p)))
      return false;
    return a().equals(((com.zend.ide.cb.p)paramObject).a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.p
 * JD-Core Version:    0.6.0
 */