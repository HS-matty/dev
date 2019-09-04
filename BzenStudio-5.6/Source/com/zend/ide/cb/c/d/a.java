package com.zend.ide.cb.c.d;

import com.zend.ide.cb.c.g;
import com.zend.ide.cb.c.k;
import com.zend.ide.cb.c.o;
import com.zend.ide.cb.c.r;
import com.zend.ide.cb.c.s;
import com.zend.ide.cb.f;
import com.zend.ide.cb.l;
import com.zend.ide.cb.m;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.w;
import com.zend.ide.util.cl;
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
  private Properties q;

  public a(com.zend.ide.cb.c.h paramh)
  {
    super(paramh);
    b();
  }

  public ResultSet a()
    throws SQLException
  {
    if (!b("showStat"))
      b("showStat", "SHOW STATUS");
    PreparedStatement localPreparedStatement = a("showStat");
    localPreparedStatement.execute();
    return localPreparedStatement.getResultSet();
  }

  public ResultSet b()
    throws SQLException
  {
    if (!b("showVars"))
      b("showVars", "SHOW VARIABLES");
    PreparedStatement localPreparedStatement = a("showVars");
    localPreparedStatement.execute();
    return localPreparedStatement.getResultSet();
  }

  public ResultSet c()
    throws SQLException
  {
    if (!b("showProc"))
      b("showProc", "SHOW FULL PROCESSLIST");
    PreparedStatement localPreparedStatement = a("showProc");
    localPreparedStatement.execute();
    return localPreparedStatement.getResultSet();
  }

  public ResultSet a(f paramf)
    throws SQLException
  {
    this.i.a("SHOW TABLE STATUS FROM `" + paramf.a() + '`', 1004, 1007);
    return this.i.b();
  }

  public ResultSet a(p paramp)
    throws SQLException
  {
    return null;
  }

  public ResultSet a(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    this.i.a("SHOW FIELDS FROM `" + paramv.a() + "` FROM `" + paramv.a().a() + '`', 1004, 1007);
    return this.i.b();
  }

  public ResultSet a(com.zend.ide.cb.h paramh)
    throws SQLException
  {
    com.zend.ide.cb.v localv = paramh.a();
    f localf = localv.a();
    this.i.a("SHOW FIELDS FROM `" + localv.a() + "` FROM `" + localf.a() + "` LIKE '" + paramh.a() + '\'', 1004, 1007);
    return this.i.b();
  }

  public p[] b(f paramf)
    throws SQLException
  {
    return new p[0];
  }

  public com.zend.ide.cb.v[] a(f paramf, p paramp)
    throws SQLException
  {
    if (this.i.q() == null)
      return h;
    if ((this.i.q().getMetaData().getDatabaseMajorVersion() > 4) && ("information_schema".equalsIgnoreCase(paramf.a())))
    {
      ResultSet localResultSet = this.i.a("SELECT table_name, table_type FROM information_schema.tables WHERE table_schema = 'information_schema'", 1003, 1007);
      ArrayList localArrayList = new ArrayList();
      if (localResultSet != null)
      {
        while (localResultSet.next())
        {
          localObject = localResultSet.getString("TABLE_TYPE");
          localObject = this.q.getProperty((String)localObject, (String)localObject);
          localArrayList.add(new r(localResultSet.getString("TABLE_NAME"), (String)localObject, this.i, paramf, paramp));
        }
        localResultSet.close();
      }
      Object localObject = new com.zend.ide.cb.v[localArrayList.size()];
      localArrayList.toArray(localObject);
      return localObject;
    }
    return (com.zend.ide.cb.v)super.a(paramf, paramp);
  }

  public com.zend.ide.cb.h[] b(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (this.i.q() == null)
      return b;
    if ((this.i.q().getMetaData().getDatabaseMajorVersion() > 4) && ("information_schema".equalsIgnoreCase(paramv.a().a())))
    {
      ArrayList localArrayList = new ArrayList();
      ResultSet localResultSet = a(paramv);
      if (localResultSet != null)
      {
        while (localResultSet.next())
          localArrayList.add(new k(localResultSet.getString(1), this.i, paramv));
        localResultSet.close();
      }
      com.zend.ide.cb.h[] arrayOfh = new com.zend.ide.cb.h[localArrayList.size()];
      localArrayList.toArray(arrayOfh);
      return arrayOfh;
    }
    return super.b(paramv);
  }

  public w[] b(q paramq)
    throws SQLException
  {
    if ((!b("getUsers1")) || (!b("getUsers2")))
    {
      b("getUsers1", "SELECT User, Host FROM mysql.user ORDER BY User");
      b("getUsers2", "SELECT USER()");
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
        try
        {
          if (i != 0)
            localObject = new s(localResultSet.getString("User") + '@' + localResultSet.getString("Host"), paramq, this.i);
          else
            localObject = new s(localResultSet.getString(1), paramq, this.i);
          localArrayList.add(localObject);
        }
        catch (NullPointerException localNullPointerException)
        {
          if (p)
            cl.a(localNullPointerException);
        }
      localResultSet.close();
    }
    Object localObject = new w[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (w)localObject;
  }

  public m[] a(l paraml)
    throws SQLException
  {
    if (this.i.q() == null)
      return e;
    ArrayList localArrayList = new ArrayList(6);
    p localp = paraml.c();
    f localf = paraml.b();
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = localp != null ? localp.a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getProcedureColumns(localf.a(), str, localf.a() + '.' + paraml.a(), null);
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

  public void a(String paramString1, String paramString2)
    throws SQLException
  {
    if ((paramString1 != null) && (!paramString1.trim().equals("")))
    {
      if (paramString1.equals(this.j))
        return;
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
    try
    {
      if (!b("testCon"))
        b("testCon", "SELECT USER()");
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
    return false;
  }

  public boolean k()
  {
    return true;
  }

  public int a(SQLException paramSQLException)
  {
    String str = paramSQLException.getMessage();
    if ((paramSQLException.getErrorCode() == 1045) || ((str != null) && (str.indexOf("Access denied") > -1)))
      return 1;
    return 0;
  }

  public String l()
  {
    return "Id";
  }

  public void a(String paramString)
    throws SQLException
  {
    this.i.a("KILL " + paramString, 1004, 1007);
  }

  private void b()
  {
    this.q = new Properties();
    this.q.setProperty("SYSTEM VIEW", "VIEW");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.d.a
 * JD-Core Version:    0.6.0
 */