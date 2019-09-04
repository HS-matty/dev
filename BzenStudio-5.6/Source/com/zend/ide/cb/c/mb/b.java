package com.zend.ide.cb.c.mb;

import com.zend.ide.cb.c.g;
import com.zend.ide.cb.c.s;
import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.w;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class b extends g
  implements com.zend.ide.cb.c.v
{
  public b(com.zend.ide.cb.c.h paramh)
  {
    super(paramh);
  }

  public ResultSet a()
    throws SQLException
  {
    try
    {
      if (!b("status"))
        b("status", "SELECT * FROM TABLE(SNAPSHOT_DATABASE('', -1)) AS  DBSNAP");
      PreparedStatement localPreparedStatement = a("status");
      ResultSet localResultSet = localPreparedStatement.executeQuery();
      return localResultSet;
    }
    catch (SQLException localSQLException)
    {
    }
    return null;
  }

  public ResultSet b()
    throws SQLException
  {
    try
    {
      if (!b("variables"))
        b("variables", "SELECT  * FROM TABLE(SYSFUN.GET_DBM_CONFIG()) AS  DBMCFG");
      PreparedStatement localPreparedStatement = a("variables");
      ResultSet localResultSet = localPreparedStatement.executeQuery();
      return localResultSet;
    }
    catch (SQLException localSQLException)
    {
    }
    return null;
  }

  public ResultSet c()
    throws SQLException
  {
    try
    {
      if (!b("process"))
        b("process", "SELECT * FROM TABLE(SNAPSHOT_APPL_INFO('', -1)) AS  APPL");
      PreparedStatement localPreparedStatement = a("process");
      ResultSet localResultSet = localPreparedStatement.executeQuery();
      return localResultSet;
    }
    catch (SQLException localSQLException)
    {
    }
    return null;
  }

  public ResultSet a(f paramf)
    throws SQLException
  {
    DatabaseMetaData localDatabaseMetaData;
    try
    {
      return this.i.a("SELECT * FROM QSYS2.SCHEMATA", 1003, 1007);
    }
    catch (SQLException localSQLException)
    {
      if (this.i.q() == null)
        return null;
      localDatabaseMetaData = this.i.q().getMetaData();
    }
    return localDatabaseMetaData.getSchemas();
  }

  public ResultSet a(p paramp)
    throws SQLException
  {
    if ((this.i.q() == null) || (paramp == null))
      return null;
    return this.i.a("SELECT * FROM QSYS2.TABLES WHERE TABLE_SCHEMA = '" + paramp.a() + '\'', 1003, 1007);
  }

  public ResultSet a(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    return this.i.a("SELECT * FROM QSYS2.COLUMNS WHERE TABLE_SCHEMA = '" + paramv.b().a() + "' AND TABLE_NAME = '" + paramv + "' ORDER BY ORDINAL_POSITION", 1003, 1007);
  }

  public ResultSet a(com.zend.ide.cb.h paramh)
    throws SQLException
  {
    com.zend.ide.cb.v localv = paramh.a();
    return this.i.a("SELECT * FROM QSYS2.COLUMNS WHERE TABLE_SCHEMA = '" + localv.b().a() + "' AND TABLE_NAME = '" + localv + "' AND COLUMN_NAME = '" + paramh + '\'', 1003, 1007);
  }

  public w[] b(q paramq)
    throws SQLException
  {
    if (!b("getUsers"))
      b("getUsers", "SELECT DISTINCT user FROM QSYS2.SCHEMATA");
    PreparedStatement localPreparedStatement = a("getUsers");
    if (localPreparedStatement == null)
      return new w[0];
    ResultSet localResultSet = null;
    try
    {
      localResultSet = localPreparedStatement.executeQuery();
    }
    catch (Throwable localThrowable)
    {
      return new w[0];
    }
    ArrayList localArrayList = new ArrayList(10);
    if ((localResultSet != null) && (paramq != null))
    {
      while (localResultSet.next())
      {
        localObject = new s(localResultSet.getString(1), paramq, this.i);
        localArrayList.add(localObject);
      }
      localResultSet.close();
    }
    Object localObject = new w[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (w)localObject;
  }

  public void a(String paramString1, String paramString2)
    throws SQLException
  {
    if ((paramString2 != null) && (!paramString2.trim().equals("")))
    {
      if (paramString2.equals(this.k))
        return;
      a();
      this.i.a("SET SCHEMA \"" + paramString2 + '"');
      this.j = paramString1;
      this.k = paramString2;
    }
  }

  public boolean f()
  {
    int i = 1;
    try
    {
      if (!b("testCon"))
        b("testCon", "SELECT * FROM QSYS2.CATALOG_NAME");
      PreparedStatement localPreparedStatement1 = a("testCon");
      localPreparedStatement1.executeQuery().close();
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        PreparedStatement localPreparedStatement2 = a("testCon2");
        localPreparedStatement2.executeQuery().close();
      }
      catch (Throwable localThrowable2)
      {
        i = 0;
      }
    }
    return i;
  }

  public boolean g()
  {
    return true;
  }

  public boolean k()
  {
    return false;
  }

  public int a(SQLException paramSQLException)
  {
    String str1 = paramSQLException.getSQLState();
    String str2 = paramSQLException.getMessage();
    if ((str1 != null) && (str1.equals("08004")) && (str2 != null) && (str2.indexOf("rejected the connection") > -1))
      return 1;
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
 * Qualified Name:     com.zend.ide.cb.c.mb.b
 * JD-Core Version:    0.6.0
 */