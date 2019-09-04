package com.zend.ide.cb;

import com.zend.ide.util.ct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public abstract interface v extends g
{
  public static final String a = ct.a(1461);
  public static final String d = ct.a(1462);

  public abstract f a();

  public abstract p b();

  public abstract ResultSet c()
    throws SQLException;

  public abstract h[] d();

  public abstract i[] e();

  public abstract Set f()
    throws SQLException;

  public abstract String g();
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.v
 * JD-Core Version:    0.6.0
 */