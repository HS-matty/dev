package com.zend.ide.cb.c;

import com.zend.ide.cb.f;
import com.zend.ide.cb.l;
import com.zend.ide.cb.m;
import com.zend.ide.cb.p;
import java.sql.SQLException;
import java.util.List;

public class n extends i
  implements l
{
  private f g;
  private p h;
  private String i;

  public n(String paramString, h paramh, f paramf, p paramp)
  {
    super(paramString, paramf.c(), paramh);
    this.g = paramf;
    this.h = paramp;
    d(a);
  }

  public void d()
    throws SQLException
  {
    this.b.clear();
    m[] arrayOfm = this.c.g().a(this);
    for (int j = 0; j < arrayOfm.length; j++)
    {
      String str = arrayOfm[j].a();
      m localm = (m)f(str);
      if ((localm != null) || (arrayOfm[j] == null))
        continue;
      localm = arrayOfm[j];
      this.b.add(localm);
    }
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof l)))
      return false;
    return a().equals(((l)paramObject).a());
  }

  public void a(String paramString)
  {
    this.i = paramString;
  }

  public m[] a()
  {
    m[] arrayOfm = new m[this.b.size()];
    this.b.toArray(arrayOfm);
    return arrayOfm;
  }

  public f b()
  {
    return this.g;
  }

  public p c()
  {
    return this.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.n
 * JD-Core Version:    0.6.0
 */