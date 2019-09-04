package com.zend.ide.cb.a.b;

import com.zend.ide.cb.c.w;
import com.zend.ide.cb.f;
import com.zend.ide.cb.h;
import com.zend.ide.cb.o;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.v;
import com.zend.ide.util.c.d;
import java.sql.SQLException;

class hb
  implements d
{
  private v a;
  private boolean b;
  final db c;

  public hb(db paramdb, v paramv, boolean paramBoolean)
  {
    this.a = paramv;
    this.b = paramBoolean;
  }

  public Object k()
  {
    q localq = this.a.c();
    String str1 = localq.g();
    String str2 = localq.h();
    String str3 = localq.k() ? this.a.b().a() : null;
    String str4 = this.a.a().a();
    String str5 = localq.m().c();
    String str6 = localq.m().d();
    String str7 = "*";
    try
    {
      str7 = a();
    }
    catch (SQLException localSQLException)
    {
      return null;
    }
    try
    {
      if ((!str4.equals(str1)) || ((str3 != null) && (!str3.equals(str2))))
        localq.a(str4, str3);
      db.b(this.c).a("SELECT " + str7 + " FROM " + str5 + this.a.a() + str6, localq, this.a, db.b(this.c).k(), this.b, false, true);
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        String str8 = localq.m().a();
        String str9;
        if (localq.k())
          str9 = this.a.b().a();
        else
          str9 = this.a.a().a();
        String str10 = "SELECT " + str7 + " FROM " + str5 + str9 + str6 + str8 + str5 + this.a.a() + str6;
        db.b(this.c).a(str10, localq, this.a, db.b(this.c).k(), this.b, false, true);
      }
      catch (Throwable localThrowable2)
      {
        db.b(this.c).a(localq, localThrowable1, true);
      }
    }
    return null;
  }

  private String a()
    throws SQLException
  {
    o localo = this.a.c().m();
    if ((!this.b) || (!localo.e()))
      return "*";
    String str1 = localo.c();
    String str2 = localo.d();
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      this.a.d();
    }
    catch (SQLException localSQLException)
    {
      if (!this.a.c().a(true))
        throw localSQLException;
    }
    h[] arrayOfh = this.a.d();
    if (arrayOfh.length == 0)
      return "*";
    for (int i = 0; i < arrayOfh.length; i++)
    {
      localStringBuffer.append(str1);
      localStringBuffer.append(arrayOfh[i].a());
      localStringBuffer.append(str2);
      localStringBuffer.append(", ");
    }
    if (localStringBuffer.length() > 2)
      localStringBuffer.delete(localStringBuffer.length() - 2, localStringBuffer.length());
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.hb
 * JD-Core Version:    0.6.0
 */