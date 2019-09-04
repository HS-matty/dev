package com.zend.ide.cb.c;

import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class r extends i
  implements com.zend.ide.cb.v
{
  private f g;
  private p h;
  private List i;
  private List j;
  private String k;

  public r(String paramString1, String paramString2, h paramh, f paramf, p paramp)
  {
    super(paramString1, paramf.c(), paramh);
    this.g = paramf;
    this.h = paramp;
    this.i = this.b;
    this.j = new ArrayList(6);
    a(paramString2);
    d(a);
    d(d);
  }

  public com.zend.ide.cb.h[] d()
  {
    com.zend.ide.cb.h[] arrayOfh = new com.zend.ide.cb.h[this.i.size()];
    this.i.toArray(arrayOfh);
    return arrayOfh;
  }

  public com.zend.ide.cb.i[] e()
  {
    com.zend.ide.cb.i[] arrayOfi = new com.zend.ide.cb.i[this.j.size()];
    this.j.toArray(arrayOfi);
    return arrayOfi;
  }

  public Set f()
    throws SQLException
  {
    String str = b() != null ? b().a() : null;
    if (this.c == null)
      return Collections.EMPTY_SET;
    return this.c.g().a(a().a(), str, a());
  }

  public String g()
  {
    return this.k;
  }

  public void a(String paramString)
  {
    if (paramString != null)
      this.k = paramString;
  }

  public void d()
    throws SQLException
  {
    Set localSet = f();
    a();
    b();
    com.zend.ide.cb.h[] arrayOfh = this.c.g().b(this);
    Object localObject;
    for (int m = 0; m < arrayOfh.length; m++)
    {
      String str = arrayOfh[m].a();
      localObject = (com.zend.ide.cb.h)f(str);
      if (localObject == null)
      {
        localObject = arrayOfh[m];
        this.i.add(localObject);
      }
      ((com.zend.ide.cb.h)localObject).a(localSet.contains(((com.zend.ide.cb.h)localObject).a().toUpperCase()));
    }
    com.zend.ide.cb.i[] arrayOfi = this.c.g().c(this);
    for (int n = 0; n < arrayOfi.length; n++)
    {
      localObject = arrayOfi[n].a();
      com.zend.ide.cb.i locali = (com.zend.ide.cb.i)a((String)localObject, this.j);
      if (locali != null)
        continue;
      locali = arrayOfi[n];
      this.j.add(locali);
    }
  }

  public ResultSet c()
    throws SQLException
  {
    return this.c.g().a(this);
  }

  private void a()
  {
    this.i.clear();
  }

  private void b()
  {
    this.j.clear();
  }

  public f a()
  {
    return this.g;
  }

  public p b()
  {
    return this.h;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof com.zend.ide.cb.v)))
      return false;
    return a().equals(((com.zend.ide.cb.v)paramObject).a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.r
 * JD-Core Version:    0.6.0
 */