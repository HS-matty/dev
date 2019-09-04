package com.zend.ide.cb;

import com.zend.ide.util.ct;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract interface f extends g
{
  public static final String a = ct.a(1457);
  public static final String e = ct.a(1458);

  public abstract v[] a(String paramString);

  public abstract ResultSet a()
    throws SQLException;

  public abstract p b(String paramString);

  public abstract p[] b();

  public abstract l[] c();

  public abstract String d();

  public abstract void c(String paramString);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.f
 * JD-Core Version:    0.6.0
 */