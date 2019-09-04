package com.zend.ide.cb.c.bb;

import com.zend.ide.cb.c.g;
import com.zend.ide.cb.c.k;
import com.zend.ide.cb.c.n;
import com.zend.ide.cb.c.o;
import com.zend.ide.cb.c.r;
import com.zend.ide.cb.c.s;
import com.zend.ide.cb.f;
import com.zend.ide.cb.i;
import com.zend.ide.cb.j;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.w;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    Object localObject;
    try
    {
      if (!b("dbProp"))
        b("dbProp", "SELECT * FROM SYSCAT.SCHEMATA");
      PreparedStatement localPreparedStatement = a("dbProp");
      localObject = localPreparedStatement.executeQuery();
      return localObject;
    }
    catch (SQLException localSQLException)
    {
      if (this.i.q() == null)
        return null;
      localObject = this.i.q().getMetaData();
    }
    return (ResultSet)((DatabaseMetaData)localObject).getSchemas();
  }

  public ResultSet a(p paramp)
    throws SQLException
  {
    if ((this.i.q() == null) || (paramp == null))
      return null;
    return this.i.a("SELECT * FROM SYSCAT.TABLES WHERE TABSCHEMA = '" + paramp.a() + '\'', 1003, 1007);
  }

  public ResultSet a(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    return this.i.a("SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA = '" + paramv.b().a() + "' AND TABNAME = '" + paramv + "' ORDER BY COLNO", 1003, 1007);
  }

  public ResultSet a(com.zend.ide.cb.h paramh)
    throws SQLException
  {
    com.zend.ide.cb.v localv = paramh.a();
    return this.i.a("SELECT * FROM SYSCAT.COLUMNS WHERE TABSCHEMA = '" + localv.b().a() + "' AND TABNAME = '" + localv + "' AND COLNAME = '" + paramh + '\'', 1003, 1007);
  }

  public w[] b(q paramq)
    throws SQLException
  {
    if (!b("getUsers"))
    {
      b("getUsers", "VALUES CURRENT USER");
      b("getUsers2", "VALUES USER");
    }
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
      {
        b("testCon", "VALUES CURRENT USER");
        b("testCon2", "VALUES USER");
      }
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
    return true;
  }

  public int a(SQLException paramSQLException)
  {
    String str1 = paramSQLException.getSQLState();
    String str2 = paramSQLException.getMessage();
    if (str1 != null)
    {
      if ((str1.equals("04501")) || ((str2 != null) && (str2.indexOf("password invalid") > -1)))
        return 1;
      if (str1.equals("08004"))
      {
        if ((str2 != null) && (str2.indexOf("not found") != -1))
          return 0;
        return 1;
      }
    }
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

  public com.zend.ide.cb.v[] a(f paramf, p paramp)
    throws SQLException
  {
    if (this.i.q() == null)
      return h;
    ArrayList localArrayList = new ArrayList();
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str1 = paramp != null ? paramp.a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getTables(null, null, null, null);
    if (localResultSet != null)
    {
      while (localResultSet.next())
      {
        localObject = localResultSet.getString("TABLE_CAT");
        String str2 = localResultSet.getString("TABLE_SCHEM");
        if (((str2 != null) && (!str2.equalsIgnoreCase(str1))) || ((localObject != null) && (!((String)localObject).equalsIgnoreCase(paramf.a()))))
          continue;
        localArrayList.add(new r(localResultSet.getString("TABLE_NAME"), localResultSet.getString("TABLE_TYPE"), this.i, paramf, paramp));
      }
      localResultSet.close();
    }
    Object localObject = new com.zend.ide.cb.v[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (com.zend.ide.cb.v)localObject;
  }

  public com.zend.ide.cb.h[] b(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (this.i.q() == null)
      return b;
    ArrayList localArrayList = new ArrayList(10);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = paramv.b() != null ? paramv.b().a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getColumns(null, str, paramv.a(), null);
    if (localResultSet != null)
    {
      while (localResultSet.next())
        localArrayList.add(new k(localResultSet.getString("COLUMN_NAME"), this.i, paramv));
      localResultSet.close();
    }
    com.zend.ide.cb.h[] arrayOfh = new com.zend.ide.cb.h[localArrayList.size()];
    localArrayList.toArray(arrayOfh);
    return arrayOfh;
  }

  public j[] a(i parami)
    throws SQLException
  {
    if (this.i.q() == null)
      return c;
    com.zend.ide.cb.v localv = parami.b();
    ArrayList localArrayList = new ArrayList(6);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str1 = localv.b() != null ? localv.b().a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getIndexInfo(null, str1, localv.a(), false, true);
    if (localResultSet != null)
    {
      while (localResultSet.next())
      {
        localObject = localResultSet.getString("COLUMN_NAME");
        String str2 = localResultSet.getString("INDEX_NAME");
        if ((localObject != null) && (str2 != null) && (str2.equals(parami.a())))
        {
          com.zend.ide.cb.c.l locall = new com.zend.ide.cb.c.l((String)localObject, this.i, parami);
          String str3 = localResultSet.getString("ASC_OR_DESC");
          if (str3 == null)
            locall.a("");
          else if (str3.equals("A"))
            locall.a(j.a);
          else
            locall.a(j.b);
          localArrayList.add(locall);
        }
      }
      localResultSet.close();
    }
    Object localObject = new j[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (j)localObject;
  }

  public com.zend.ide.cb.m[] a(com.zend.ide.cb.l paraml)
    throws SQLException
  {
    if (this.i.q() == null)
      return e;
    ArrayList localArrayList = new ArrayList(6);
    p localp = paraml.c();
    f localf = paraml.b();
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = localp != null ? localp.a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getProcedureColumns(null, str, paraml.a(), null);
    if (localResultSet != null)
    {
      while (localResultSet.next())
      {
        localObject = new o(localResultSet.getString("COLUMN_NAME"), this.i, paraml);
        ((com.zend.ide.cb.m)localObject).a(localResultSet.getString("TYPE_NAME"));
        int i = localResultSet.getShort("COLUMN_TYPE");
        switch (i)
        {
        case 1:
          ((com.zend.ide.cb.m)localObject).b("IN");
          break;
        case 2:
          ((com.zend.ide.cb.m)localObject).b("INOUT");
          break;
        case 4:
          ((com.zend.ide.cb.m)localObject).b("OUT");
          break;
        case 5:
          ((com.zend.ide.cb.m)localObject).b("RETURN");
        case 3:
        }
        localArrayList.add(localObject);
      }
      localResultSet.close();
    }
    Object localObject = new com.zend.ide.cb.m[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (com.zend.ide.cb.m)localObject;
  }

  public com.zend.ide.cb.l[] b(f paramf, p paramp)
    throws SQLException
  {
    if (this.i.q() == null)
      return f;
    ArrayList localArrayList = new ArrayList(10);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = paramp != null ? paramp.a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getProcedures(null, str, null);
    if (localResultSet == null)
      return f;
    while (localResultSet.next())
    {
      localObject = new n(localResultSet.getString("PROCEDURE_NAME"), this.i, paramf, paramp);
      ((com.zend.ide.cb.l)localObject).a(localResultSet.getString("REMARKS"));
      localArrayList.add(localObject);
    }
    localResultSet.close();
    Object localObject = new com.zend.ide.cb.l[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (com.zend.ide.cb.l)localObject;
  }

  public i[] c(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (this.i.q() == null)
      return d;
    ArrayList localArrayList = new ArrayList(5);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = paramv.b() != null ? paramv.b().a() : null;
    ResultSet localResultSet = null;
    try
    {
      localResultSet = localDatabaseMetaData.getIndexInfo(null, str, paramv.a(), false, true);
      if (localResultSet != null)
        while (localResultSet.next())
        {
          localObject1 = localResultSet.getString("INDEX_NAME");
          if (localObject1 != null)
          {
            localObject2 = new com.zend.ide.cb.c.m((String)localObject1, this.i, paramv);
            if (!localArrayList.contains(localObject2))
            {
              int i = localResultSet.getShort("TYPE");
              switch (i)
              {
              case 1:
                ((i)localObject2).a(i.a);
                break;
              case 2:
                ((i)localObject2).a(i.d);
                break;
              case 3:
                ((i)localObject2).a(i.e);
              }
              localArrayList.add(localObject2);
            }
          }
        }
      Object localObject1 = d;
      return localObject1;
    }
    catch (SQLException localSQLException)
    {
      Object localObject2 = d;
      return localObject2;
    }
    finally
    {
      if (localResultSet != null)
        localResultSet.close();
    }
    i[] arrayOfi = new i[localArrayList.size()];
    localArrayList.toArray(arrayOfi);
    return (i)(i)arrayOfi;
  }

  public Set a(String paramString1, String paramString2, String paramString3)
    throws SQLException
  {
    if (!this.i.a(false))
      return Collections.EMPTY_SET;
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    ResultSet localResultSet = localDatabaseMetaData.getPrimaryKeys(null, paramString2, paramString3);
    try
    {
      HashSet localHashSet = new HashSet(5);
      while (localResultSet.next())
      {
        localObject1 = localResultSet.getString("COLUMN_NAME");
        if (localObject1 != null)
        {
          localObject1 = ((String)localObject1).toUpperCase();
          localHashSet.add(localObject1);
        }
      }
      Object localObject1 = localHashSet;
      return localObject1;
    }
    finally
    {
      if (localResultSet != null)
        localResultSet.close();
    }
    throw localObject2;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.bb.b
 * JD-Core Version:    0.6.0
 */