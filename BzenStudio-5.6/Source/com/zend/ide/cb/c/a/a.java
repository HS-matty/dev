package com.zend.ide.cb.c.a;

import com.zend.ide.cb.c.g;
import com.zend.ide.cb.c.n;
import com.zend.ide.cb.c.o;
import com.zend.ide.cb.c.s;
import com.zend.ide.cb.f;
import com.zend.ide.cb.l;
import com.zend.ide.cb.m;
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

public class a extends g
  implements com.zend.ide.cb.c.v
{
  public a(com.zend.ide.cb.c.h paramh)
  {
    super(paramh);
  }

  public ResultSet a()
    throws SQLException
  {
    if (!b("getStat"))
      b("getStat", "SELECT name, value FROM V$SYSSTAT ORDER BY name");
    PreparedStatement localPreparedStatement = a("getStat");
    ResultSet localResultSet = null;
    try
    {
      localResultSet = localPreparedStatement.executeQuery();
    }
    catch (SQLException localSQLException)
    {
      if (localSQLException.getErrorCode() != 942)
        throw localSQLException;
    }
    return localResultSet;
  }

  public ResultSet b()
    throws SQLException
  {
    if (!b("getVars"))
      b("getVars", "SELECT Name, Value, Description FROM V$PARAMETER ORDER BY Name");
    PreparedStatement localPreparedStatement = a("getVars");
    ResultSet localResultSet = null;
    try
    {
      localResultSet = localPreparedStatement.executeQuery();
    }
    catch (SQLException localSQLException)
    {
      if (localSQLException.getErrorCode() != 942)
        throw localSQLException;
    }
    return localResultSet;
  }

  public ResultSet c()
    throws SQLException
  {
    if (!b("getProc"))
      b("getProc", "SELECT * FROM V$SESSION");
    PreparedStatement localPreparedStatement = a("getProc");
    ResultSet localResultSet = null;
    try
    {
      localResultSet = localPreparedStatement.executeQuery();
    }
    catch (SQLException localSQLException)
    {
      if (localSQLException.getErrorCode() != 942)
        throw localSQLException;
    }
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
      b("getSchem", "SELECT * FROM all_tables WHERE owner = ?");
    PreparedStatement localPreparedStatement = a("getSchem");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, paramp.a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (!b("getTable"))
      b("getTable", "SELECT all_tab_columns.column_name, data_type, nullable, cons.constraint_type, data_default, comments FROM all_tab_columns,  all_col_comments, (SELECT a.owner, a.table_name, b.column_name, a.constraint_type    FROM all_constraints a, all_cons_columns b    WHERE a.constraint_name = b.constraint_name    AND a.table_name = ?    AND a.owner = ?) cons WHERE (all_tab_columns.owner = all_col_comments.owner     AND all_tab_columns.owner= cons.owner(+)     AND all_tab_columns.table_name = all_col_comments.table_name     AND all_tab_columns.table_name = cons.table_name(+)     AND all_tab_columns.column_name = all_col_comments.column_name     AND all_tab_columns.column_name = cons.column_name(+)  ) AND all_tab_columns.owner = ? AND all_tab_columns.table_Name = ? ORDER BY all_tab_columns.column_name");
    PreparedStatement localPreparedStatement = a("getTable");
    localPreparedStatement.clearParameters();
    String str = paramv.b() != null ? paramv.b().a() : "";
    localPreparedStatement.setString(1, paramv.a());
    localPreparedStatement.setString(2, str);
    localPreparedStatement.setString(3, str);
    localPreparedStatement.setString(4, paramv.a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(com.zend.ide.cb.h paramh)
    throws SQLException
  {
    if (!b("getField"))
      b("getField", "SELECT all_tab_columns.column_name, data_type, nullable, cons.constraint_type, data_default, comments FROM all_tab_columns,  all_col_comments, (SELECT a.owner, a.table_name, b.column_name, a.constraint_type    FROM all_constraints a, all_cons_columns b    WHERE a.constraint_name = b.constraint_name    AND a.table_name = ?    AND a.owner = ? ) cons WHERE (all_tab_columns.owner = all_col_comments.owner     AND all_tab_columns.owner= cons.owner(+)     AND all_tab_columns.table_name = all_col_comments.table_name     AND all_tab_columns.table_name = cons.table_name(+)     AND all_tab_columns.column_name = all_col_comments.column_name     AND all_tab_columns.column_name = cons.column_name(+)  ) AND all_tab_columns.owner = ? AND all_tab_columns.table_Name = ? AND all_tab_columns.column_name = ? ORDER BY all_tab_columns.column_name");
    PreparedStatement localPreparedStatement = a("getField");
    localPreparedStatement.clearParameters();
    p localp = paramh.a().b();
    String str = localp != null ? localp.a() : "";
    localPreparedStatement.setString(1, paramh.a().a());
    localPreparedStatement.setString(2, str);
    localPreparedStatement.setString(3, str);
    localPreparedStatement.setString(4, paramh.a().a());
    localPreparedStatement.setString(5, paramh.a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public w[] b(q paramq)
    throws SQLException
  {
    if ((!b("getUsers1")) || (!b("getUsers2")))
    {
      b("getUsers1", "SELECT username, account_status  FROM dba_users ORDER BY username");
      b("getUsers2", "SELECT username FROM all_users ORDER BY username");
    }
    PreparedStatement localPreparedStatement = a("getUsers1");
    if (localPreparedStatement == null)
      return new w[0];
    int i = 1;
    ResultSet localResultSet;
    try
    {
      localResultSet = localPreparedStatement.executeQuery();
    }
    catch (SQLException localSQLException)
    {
      localPreparedStatement = a("getUsers2");
      localResultSet = localPreparedStatement.executeQuery();
      i = 0;
    }
    ArrayList localArrayList = new ArrayList(10);
    if ((localResultSet != null) && (paramq != null))
    {
      while (localResultSet.next())
      {
        if (i != 0)
          localObject = new s(localResultSet.getString("username") + " (" + localResultSet.getString("account_status") + ')', paramq, this.i);
        else
          localObject = new s(localResultSet.getString("username"), paramq, this.i);
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
      this.i.a("ALTER SESSION SET CURRENT_SCHEMA = " + paramString2);
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
        b("testCon", "SELECT username FROM all_users WHERE username = 'x'");
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
    int i = paramSQLException.getErrorCode();
    if (i == 1017)
      return 1;
    return 0;
  }

  public String l()
  {
    return "SID,SERIAL#";
  }

  public void a(String paramString)
    throws SQLException
  {
    String[] arrayOfString = paramString.split(",");
    if (arrayOfString.length != 2)
      return;
    String str1 = arrayOfString[0];
    String str2 = arrayOfString[1];
    this.i.a("ALTER SYSTEM KILL SESSION '" + str1 + ',' + str2 + '\'', 1004, 1007);
  }

  public m[] a(l paraml)
    throws SQLException
  {
    if (this.i.q() == null)
      return e;
    ArrayList localArrayList = new ArrayList(6);
    p localp = paraml.c();
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = localp.a();
    ResultSet localResultSet = localDatabaseMetaData.getProcedureColumns(null, str, paraml.a(), null);
    if (localResultSet != null)
    {
      while (localResultSet.next())
      {
        localObject = new o(localResultSet.getString("COLUMN_NAME"), this.i, paraml);
        ((m)localObject).a(localResultSet.getString("TYPE_NAME"));
        int i = localResultSet.getShort("COLUMN_TYPE");
        switch (i)
        {
        case 1:
          ((m)localObject).b("IN");
          break;
        case 2:
          ((m)localObject).b("INOUT");
          break;
        case 4:
          ((m)localObject).b("OUT");
          break;
        case 5:
          ((m)localObject).b("RETURN");
        case 3:
        }
        localArrayList.add(localObject);
      }
      localResultSet.close();
    }
    Object localObject = new m[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (m)localObject;
  }

  public l[] b(f paramf, p paramp)
    throws SQLException
  {
    if (this.i.q() == null)
      return f;
    ArrayList localArrayList = new ArrayList(10);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    ResultSet localResultSet = localDatabaseMetaData.getProcedures(null, null, null);
    if (localResultSet == null)
      return f;
    while (localResultSet.next())
    {
      localObject = localResultSet.getString("PROCEDURE_SCHEM");
      if (paramp.a().equalsIgnoreCase((String)localObject))
      {
        n localn = new n(localResultSet.getString("PROCEDURE_NAME"), this.i, paramf, paramp);
        localn.a(localResultSet.getString("REMARKS"));
        localArrayList.add(localn);
      }
    }
    localResultSet.close();
    Object localObject = new l[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (l)localObject;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.a.a
 * JD-Core Version:    0.6.0
 */