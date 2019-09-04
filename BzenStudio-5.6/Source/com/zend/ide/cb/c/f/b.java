package com.zend.ide.cb.c.f;

import com.zend.ide.cb.c.h;
import com.zend.ide.cb.c.v;
import com.zend.ide.cb.e;
import com.zend.ide.cb.q;
import java.sql.SQLException;

public class b extends h
{
  public b(e parame, q paramq)
  {
    super(parame, paramq);
    this.m = true;
  }

  protected String e()
  {
    return "SQLite.JDBCDriver";
  }

  protected String a(String paramString, int paramInt)
  {
    String str = n().trim();
    return "jdbc:sqlite:/" + str;
  }

  protected void f()
  {
  }

  public v g()
  {
    if (this.c == null)
      this.c = new a(this);
    return this.c;
  }

  public String c()
  {
    return "'";
  }

  public String d()
  {
    return "'";
  }

  public boolean b()
  {
    return this.m;
  }

  public boolean a()
  {
    return false;
  }

  public void b()
  {
    try
    {
      a("PRAGMA cache_size = 3000", 1003, 1007);
    }
    catch (SQLException localSQLException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.f.b
 * JD-Core Version:    0.6.0
 */