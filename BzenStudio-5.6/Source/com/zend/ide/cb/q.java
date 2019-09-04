package com.zend.ide.cb;

import com.zend.ide.util.ct;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract interface q extends g
{
  public static final String d = ct.a(1459);
  public static final String e = ct.a(1460);

  public abstract void a()
    throws d;

  public abstract void b();

  public abstract boolean a(boolean paramBoolean);

  public abstract boolean a(boolean paramBoolean1, boolean paramBoolean2);

  public abstract ResultSet d()
    throws SQLException;

  public abstract ResultSet e()
    throws SQLException;

  public abstract ResultSet f()
    throws SQLException;

  public abstract void a(String paramString);

  public abstract void a(String paramString1, String paramString2)
    throws SQLException;

  public abstract String g();

  public abstract String h();

  public abstract f b(String paramString);

  public abstract f[] i();

  public abstract w[] j();

  public abstract void a(s params);

  public abstract void b(s params);

  public abstract boolean k();

  public abstract boolean a(SQLException paramSQLException);

  public abstract void a(boolean paramBoolean);

  public abstract void a(e parame);

  public abstract e l();

  public abstract o m();

  public abstract String n();

  public abstract void c(String paramString)
    throws SQLException;

  public abstract boolean a();

  public abstract boolean b();
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.q
 * JD-Core Version:    0.6.0
 */