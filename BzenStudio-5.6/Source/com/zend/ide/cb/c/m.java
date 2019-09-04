package com.zend.ide.cb.c;

import com.zend.ide.cb.j;
import com.zend.ide.util.ct;
import java.sql.SQLException;
import java.util.List;

public class m extends i
  implements com.zend.ide.cb.i
{
  private static final String f = ct.a(1465);
  private com.zend.ide.cb.v g;
  private String h;

  public m(String paramString, h paramh, com.zend.ide.cb.v paramv)
  {
    super(paramString, paramv.c(), paramh);
    this.g = paramv;
    this.h = com.zend.ide.cb.i.e;
    d(f);
  }

  public String b()
  {
    return this.h;
  }

  public void a(String paramString)
  {
    this.h = paramString;
  }

  public j[] a()
  {
    j[] arrayOfj = new j[this.b.size()];
    this.b.toArray(arrayOfj);
    return arrayOfj;
  }

  public com.zend.ide.cb.v b()
  {
    return this.g;
  }

  public void d()
    throws SQLException
  {
    this.b.clear();
    j[] arrayOfj = this.c.g().a(this);
    for (int i = 0; i < arrayOfj.length; i++)
    {
      String str = arrayOfj[i].a();
      j localj = (j)f(str);
      if ((localj != null) || (arrayOfj[i] == null))
        continue;
      localj = arrayOfj[i];
      this.b.add(localj);
    }
  }

  public String toString()
  {
    return a() + ' ' + b();
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof com.zend.ide.cb.i)))
      return false;
    return a().equals(((com.zend.ide.cb.i)paramObject).a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.m
 * JD-Core Version:    0.6.0
 */