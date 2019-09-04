package com.zend.ide.cb.c.c;

import com.zend.ide.cb.c.g;
import com.zend.ide.cb.c.r;
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
import java.util.Properties;

public class a extends g
  implements com.zend.ide.cb.c.v
{
  private Properties p;

  public a(com.zend.ide.cb.c.h paramh)
  {
    super(paramh);
    b();
  }

  public ResultSet a()
    throws SQLException
  {
    if (!b("showAll"))
      b("showAll", "SHOW ALL");
    PreparedStatement localPreparedStatement = a("showAll");
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet b()
    throws SQLException
  {
    if (!b("getVars"))
      b("getVars", "SELECT * FROM pg_settings");
    PreparedStatement localPreparedStatement = a("getVars");
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet c()
    throws SQLException
  {
    if (!b("getProc"))
      b("getProc", "SELECT * FROM pg_stat_activity");
    PreparedStatement localPreparedStatement = a("getProc");
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
      b("getSchem", "SELECT * FROM information_schema.tables WHERE table_catalog = ? AND table_schema = ?");
    PreparedStatement localPreparedStatement = a("getSchem");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, paramp.a().a());
    localPreparedStatement.setString(2, paramp.a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (!b("tableProperties"))
      b("tableProperties", "SELECT scc.column_name as\"Field\", udt_name as \"UDT\", data_type as \"Type\", is_nullable as \"Is Nullable\", \nkeys.key as \"Key\", column_default as \"Default\" \nFROM INFORMATION_SCHEMA.COLUMNS scc LEFT JOIN \n   (SELECT table_schema, table_name, column_name, (CASE WHEN (c.contype = 'c') THEN 'CHECK' \n       WHEN (c.contype = 'f') THEN 'FOREIGN KEY' \n       WHEN (c.contype = 'p') THEN 'PRIMARY KEY' \n       WHEN (c.contype = 'u') THEN 'UNIQUE' \n       ELSE NULL END)  as key \n   FROM information_schema.constraint_column_usage col, pg_constraint c \n   WHERE table_catalog = ? AND table_name = ? \n       AND c.conname = col.constraint_name) as keys  ON scc.column_name = keys.column_name \nWHERE scc.table_name = ? AND scc.table_schema = ?");
    PreparedStatement localPreparedStatement = a("tableProperties");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, paramv.a().a());
    localPreparedStatement.setString(2, paramv.a());
    localPreparedStatement.setString(3, paramv.a());
    localPreparedStatement.setString(4, paramv.b().a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(com.zend.ide.cb.h paramh)
    throws SQLException
  {
    com.zend.ide.cb.v localv = paramh.a();
    if (!b("fieldProperties"))
      b("fieldProperties", "SELECT scc.column_name as\"Field\", udt_name as \"UDT\", data_type as \"Type\", is_nullable as \"Is Nullable\", \nkeys.key as \"Key\", column_default as \"Default\" \nFROM INFORMATION_SCHEMA.COLUMNS scc LEFT JOIN \n   (SELECT table_schema, table_name, column_name, (CASE WHEN (c.contype = 'c') THEN 'CHECK' \n       WHEN (c.contype = 'f') THEN 'FOREIGN KEY' \n       WHEN (c.contype = 'p') THEN 'PRIMARY KEY' \n       WHEN (c.contype = 'u') THEN 'UNIQUE' \n       ELSE NULL END)  as key \n   FROM information_schema.constraint_column_usage col, pg_constraint c \n   WHERE table_catalog = ? AND table_schema = ? AND table_name = ? \n       AND c.conname = col.constraint_name) as keys  ON scc.column_name = keys.column_name \nWHERE scc.table_name = ? AND scc.column_name = ?");
    PreparedStatement localPreparedStatement = a("fieldProperties");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, localv.a().a());
    localPreparedStatement.setString(2, localv.b().a());
    localPreparedStatement.setString(3, localv.a());
    localPreparedStatement.setString(4, localv.a());
    localPreparedStatement.setString(5, paramh.a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public com.zend.ide.cb.v[] a(f paramf, p paramp)
    throws SQLException
  {
    ArrayList localArrayList = new ArrayList();
    ResultSet localResultSet = a(paramp);
    if (localResultSet != null)
    {
      while (localResultSet.next())
      {
        localObject = localResultSet.getString("table_type");
        localObject = this.p.getProperty((String)localObject, (String)localObject);
        r localr = new r(localResultSet.getString("table_name"), (String)localObject, this.i, paramf, paramp);
        localArrayList.add(localr);
      }
      localResultSet.close();
    }
    Object localObject = new com.zend.ide.cb.v[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (com.zend.ide.cb.v)localObject;
  }

  public w[] b(q paramq)
    throws SQLException
  {
    if (!b("getUsers"))
      b("getUsers", "SELECT * FROM pg_catalog.pg_user");
    PreparedStatement localPreparedStatement = a("getUsers");
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    ArrayList localArrayList = new ArrayList(10);
    if ((localResultSet != null) && (paramq != null))
    {
      while (localResultSet.next())
      {
        localObject = new s(localResultSet.getString("usename"), paramq, this.i);
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
    this.j = paramString1;
    this.k = paramString2;
  }

  public boolean f()
  {
    int i = 1;
    try
    {
      if (!b("testCon"))
        b("testCon", "SELECT * FROM pg_stat_activity");
      PreparedStatement localPreparedStatement = a("testCon");
      localPreparedStatement.executeQuery().close();
    }
    catch (Throwable localThrowable)
    {
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
    String str = paramSQLException.getSQLState();
    if ((str != null) && (str.equals("08001")) && (paramSQLException.getMessage().indexOf("UnknownHostException") < 0) && (paramSQLException.getMessage().indexOf("NoRouteToHostException") < 0) && (paramSQLException.getMessage().indexOf("FATAL: database \"") < 0))
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

  private void b()
  {
    this.p = new Properties();
    this.p.setProperty("BASE TABLE", "TABLE");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.c.a
 * JD-Core Version:    0.6.0
 */