package com.zend.ide.cb.c.b;

import com.zend.ide.cb.c.g;
import com.zend.ide.cb.c.s;
import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.w;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class a extends g
  implements com.zend.ide.cb.c.v
{
  private String q = "";

  public a(com.zend.ide.cb.c.h paramh)
  {
    super(paramh);
  }

  public ResultSet a()
    throws SQLException
  {
    if ((!b("showStat1")) || (!b("showStat2")))
    {
      b("showStat1", "EXEC sp_monitor");
      b("showStat2", "EXEC sp_helpdb");
    }
    PreparedStatement localPreparedStatement = a("showStat1");
    ResultSet localResultSet;
    try
    {
      localResultSet = localPreparedStatement.executeQuery();
    }
    catch (Throwable localThrowable)
    {
      localPreparedStatement = a("showStat2");
      localResultSet = localPreparedStatement.executeQuery();
    }
    return localResultSet;
  }

  public ResultSet b()
    throws SQLException
  {
    if (!b("showVars"))
      b("showVars", "EXEC sp_server_info");
    PreparedStatement localPreparedStatement = a("showVars");
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet c()
    throws SQLException
  {
    if (!b("showProc"))
      b("showProc", "EXEC sp_who2");
    PreparedStatement localPreparedStatement = a("showProc");
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(f paramf)
    throws SQLException
  {
    if (this.i.q() == null)
      return null;
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    return localDatabaseMetaData.getSchemas();
  }

  public ResultSet a(p paramp)
    throws SQLException
  {
    if (!b("getSchem"))
      b("getSchem", "EXEC sp_tables");
    PreparedStatement localPreparedStatement = a("getSchem");
    return a(paramp.a(), paramp, localPreparedStatement);
  }

  public ResultSet a(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (!b("getTable"))
      b("getTable", "EXEC sp_columns @table_name = ? ");
    PreparedStatement localPreparedStatement = a("getTable");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, paramv.a());
    return a(paramv.a(), paramv.b(), localPreparedStatement);
  }

  public ResultSet a(com.zend.ide.cb.h paramh)
    throws SQLException
  {
    if (!b("getField"))
      b("getField", "EXEC sp_columns @table_name = ? , @column_name = ?");
    PreparedStatement localPreparedStatement = a("getField");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, paramh.a().a());
    localPreparedStatement.setString(2, paramh.a());
    com.zend.ide.cb.v localv = paramh.a();
    return a(localv.a(), localv.b(), localPreparedStatement);
  }

  public w[] b(q paramq)
    throws SQLException
  {
    if ((!b("getUsers1")) || (!b("getUsers2")))
    {
      b("getUsers1", "SELECT name, xstatus FROM master..sysxlogins");
      b("getUsers2", "SELECT user");
    }
    PreparedStatement localPreparedStatement = a("getUsers1");
    if (localPreparedStatement == null)
      return new w[0];
    ResultSet localResultSet;
    try
    {
      localResultSet = localPreparedStatement.executeQuery();
    }
    catch (SQLException localSQLException)
    {
      localPreparedStatement = a("getUsers2");
      localResultSet = localPreparedStatement.executeQuery();
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

  private ResultSet a(f paramf, p paramp, PreparedStatement paramPreparedStatement)
    throws SQLException
  {
    String str1 = paramf != null ? paramf.a() : "";
    String str2 = paramp != null ? paramp.a() : "";
    boolean bool = this.q.equalsIgnoreCase(str1);
    String str3 = "";
    if (!bool)
    {
      str3 = this.q;
      a(str1, str2);
      if (str3.equals(""))
        str3 = str1;
    }
    ResultSet localResultSet = paramPreparedStatement.executeQuery();
    if (!bool)
      a(str3, str2);
    return localResultSet;
  }

  public void a(String paramString1, String paramString2)
    throws SQLException
  {
    if ((paramString1 != null) && (!paramString1.trim().equals("")))
    {
      if (paramString1.equals(this.j))
        return;
      this.q = paramString1;
      a();
      Connection localConnection = this.i.q();
      if (localConnection != null)
        localConnection.setCatalog(paramString1);
      this.j = paramString1;
      this.k = paramString2;
    }
  }

  public boolean f()
  {
    int i = 1;
    if (!this.q.equals(""))
      try
      {
        this.i.a("USE " + this.q);
      }
      catch (Throwable localThrowable1)
      {
        if (p)
        {
          System.out.println("Short check error:");
          localThrowable1.printStackTrace();
        }
        i = 0;
      }
    else
      try
      {
        if (!b("testCon"))
          b("testCon", "EXEC sp_helpdb");
        PreparedStatement localPreparedStatement = a("testCon");
        localPreparedStatement.executeQuery().close();
      }
      catch (Throwable localThrowable2)
      {
        if (p)
        {
          System.out.println("Long check error:");
          localThrowable2.printStackTrace();
        }
        i = 0;
      }
    return i;
  }

  public boolean g()
  {
    return true;
  }

  public boolean k()
  {
    return true;
  }

  public int a(SQLException paramSQLException)
  {
    if (paramSQLException.getErrorCode() == 18456)
      return 1;
    return 0;
  }

  public String l()
  {
    return "SPID";
  }

  public void a(String paramString)
    throws SQLException
  {
    this.i.a("KILL " + paramString, 1004, 1007);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.b.a
 * JD-Core Version:    0.6.0
 */