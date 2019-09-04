package com.zend.ide.cb.c.f;

import com.zend.ide.cb.c.g;
import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.w;
import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class a extends g
  implements com.zend.ide.cb.c.v
{
  private static final w[] p = new w[0];
  private static File q;

  public a(com.zend.ide.cb.c.h paramh)
  {
    super(paramh);
  }

  public f[] a(q paramq)
    throws SQLException
  {
    f[] arrayOff = super.a(paramq);
    for (int i = 0; i < arrayOff.length; i++)
    {
      String str = arrayOff[i].a();
      int j = str.lastIndexOf('/');
      if (j < 0)
        j = str.lastIndexOf('\\');
      if (j <= -1)
        continue;
      arrayOff[i].c(str.substring(j + 1));
    }
    return arrayOff;
  }

  public ResultSet a()
    throws SQLException
  {
    if (!b("status"))
      b("status", "PRAGMA integrity_check");
    PreparedStatement localPreparedStatement = a("status");
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet b()
    throws SQLException
  {
    if (this.i.q() == null)
      return null;
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    ResultSet localResultSet = localDatabaseMetaData.getTypeInfo();
    return localResultSet;
  }

  public ResultSet c()
    throws SQLException
  {
    return null;
  }

  public ResultSet a(f paramf)
    throws SQLException
  {
    if (this.i.q() == null)
      return null;
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    return localDatabaseMetaData.getTables(paramf.a(), null, null, null);
  }

  public ResultSet a(p paramp)
    throws SQLException
  {
    return null;
  }

  public ResultSet a(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (!b("tblProperties"))
      b("tblProperties", "PRAGMA table_info( ? )");
    PreparedStatement localPreparedStatement = a("tblProperties");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, paramv.a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(com.zend.ide.cb.h paramh)
    throws SQLException
  {
    return null;
  }

  public p[] b(f paramf)
    throws SQLException
  {
    return new p[0];
  }

  public w[] b(q paramq)
    throws SQLException
  {
    return p;
  }

  public void a(String paramString1, String paramString2)
    throws SQLException
  {
    this.j = paramString1;
    this.k = paramString2;
  }

  public boolean f()
  {
    String str = this.i.n();
    if ((q == null) || (!q.getAbsolutePath().equals(str)))
      q = new File(str);
    return q.exists();
  }

  public boolean g()
  {
    return false;
  }

  public boolean k()
  {
    return false;
  }

  public int a(SQLException paramSQLException)
  {
    return 0;
  }

  public String l()
  {
    return null;
  }

  public void a(String paramString)
    throws SQLException
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.f.a
 * JD-Core Version:    0.6.0
 */