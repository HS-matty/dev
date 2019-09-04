package com.zend.ide.cb.c;

import com.zend.ide.cb.f;
import com.zend.ide.cb.i;
import com.zend.ide.cb.q;
import com.zend.ide.util.ct;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class g
  implements v
{
  protected static final f[] a = new f[0];
  protected static final com.zend.ide.cb.h[] b = new com.zend.ide.cb.h[0];
  protected static final com.zend.ide.cb.j[] c = new com.zend.ide.cb.j[0];
  protected static final i[] d = new i[0];
  protected static final com.zend.ide.cb.m[] e = new com.zend.ide.cb.m[0];
  protected static final com.zend.ide.cb.l[] f = new com.zend.ide.cb.l[0];
  protected static final com.zend.ide.cb.p[] g = new com.zend.ide.cb.p[0];
  protected static final com.zend.ide.cb.v[] h = new com.zend.ide.cb.v[0];
  protected h i;
  protected String j;
  protected String k;
  private Map l = new HashMap(8);
  private String[] m;
  private boolean n;
  private boolean o;
  protected static boolean p = System.getProperty("-sqlDebug") != null;

  protected g(h paramh)
  {
    this.i = paramh;
  }

  private void a(String paramString, PreparedStatement paramPreparedStatement)
  {
    this.l.put(paramString, paramPreparedStatement);
  }

  protected void b(String paramString1, String paramString2)
    throws SQLException
  {
    if (this.i.q() == null)
      return;
    PreparedStatement localPreparedStatement = this.i.q().prepareStatement(paramString2, 1004, 1007);
    a(paramString1, localPreparedStatement);
  }

  protected PreparedStatement a(String paramString)
    throws SQLException
  {
    Object localObject = this.l.get(paramString);
    if (localObject == null)
      throw new SQLException(ct.a(1577));
    return (PreparedStatement)localObject;
  }

  protected boolean b(String paramString)
  {
    return this.l.containsKey(paramString);
  }

  protected void a()
  {
    this.l.clear();
  }

  public f[] a(q paramq)
    throws SQLException
  {
    if (this.i.q() == null)
      return a;
    ArrayList localArrayList = new ArrayList(10);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    ResultSet localResultSet = localDatabaseMetaData.getCatalogs();
    if (localResultSet != null)
    {
      while (localResultSet.next())
      {
        localObject = localResultSet.getString("TABLE_CAT");
        if ((localObject == null) || (((String)localObject).equals("")))
          localObject = this.i.n();
        localArrayList.add(new j((String)localObject, paramq, this.i));
      }
      localResultSet.close();
    }
    if (localArrayList.size() == 0)
      localArrayList.add(new j(this.i.n(), paramq, this.i));
    Object localObject = new f[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (f)localObject;
  }

  public com.zend.ide.cb.p[] b(f paramf)
    throws SQLException
  {
    if (this.i.q() == null)
      return g;
    ArrayList localArrayList = new ArrayList();
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    ResultSet localResultSet = localDatabaseMetaData.getSchemas();
    if (localResultSet != null)
    {
      while (localResultSet.next())
        localArrayList.add(new p(localResultSet.getString("TABLE_SCHEM"), this.i, paramf));
      localResultSet.close();
    }
    com.zend.ide.cb.p[] arrayOfp = new com.zend.ide.cb.p[localArrayList.size()];
    localArrayList.toArray(arrayOfp);
    return arrayOfp;
  }

  public com.zend.ide.cb.v[] a(f paramf, com.zend.ide.cb.p paramp)
    throws SQLException
  {
    if (this.i.q() == null)
      return h;
    ArrayList localArrayList = new ArrayList();
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = paramp != null ? paramp.a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getTables(paramf.a(), str, null, null);
    if (localResultSet != null)
    {
      while (localResultSet.next())
        localArrayList.add(new r(localResultSet.getString("TABLE_NAME"), localResultSet.getString("TABLE_TYPE"), this.i, paramf, paramp));
      localResultSet.close();
    }
    com.zend.ide.cb.v[] arrayOfv = new com.zend.ide.cb.v[localArrayList.size()];
    localArrayList.toArray(arrayOfv);
    return arrayOfv;
  }

  public com.zend.ide.cb.h[] b(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (this.i.q() == null)
      return b;
    ArrayList localArrayList = new ArrayList(10);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = paramv.b() != null ? paramv.b().a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getColumns(paramv.a().a(), str, paramv.a(), null);
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

  public com.zend.ide.cb.j[] a(i parami)
    throws SQLException
  {
    if (this.i.q() == null)
      return c;
    com.zend.ide.cb.v localv = parami.b();
    ArrayList localArrayList = new ArrayList(6);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str1 = localv.b() != null ? localv.b().a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getIndexInfo(localv.a().a(), str1, localv.a(), false, true);
    if (localResultSet != null)
    {
      while (localResultSet.next())
      {
        localObject = localResultSet.getString("COLUMN_NAME");
        String str2 = localResultSet.getString("INDEX_NAME");
        if ((localObject != null) && (str2 != null) && (str2.equals(parami.a())))
        {
          l locall = new l((String)localObject, this.i, parami);
          String str3 = localResultSet.getString("ASC_OR_DESC");
          if (str3 == null)
            locall.a("");
          else if (str3.equals("A"))
            locall.a(com.zend.ide.cb.j.a);
          else
            locall.a(com.zend.ide.cb.j.b);
          localArrayList.add(locall);
        }
      }
      localResultSet.close();
    }
    Object localObject = new com.zend.ide.cb.j[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (com.zend.ide.cb.j)localObject;
  }

  public com.zend.ide.cb.m[] a(com.zend.ide.cb.l paraml)
    throws SQLException
  {
    if (this.i.q() == null)
      return e;
    ArrayList localArrayList = new ArrayList(6);
    com.zend.ide.cb.p localp = paraml.c();
    f localf = paraml.b();
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = localp != null ? localp.a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getProcedureColumns(localf.a(), str, paraml.a(), null);
    if (localResultSet != null)
    {
      while (localResultSet.next())
      {
        localObject = new o(localResultSet.getString("COLUMN_NAME"), this.i, paraml);
        ((com.zend.ide.cb.m)localObject).a(localResultSet.getString("TYPE_NAME"));
        int i1 = localResultSet.getShort("COLUMN_TYPE");
        switch (i1)
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

  public com.zend.ide.cb.l[] b(f paramf, com.zend.ide.cb.p paramp)
    throws SQLException
  {
    if (this.i.q() == null)
      return f;
    ArrayList localArrayList = new ArrayList(10);
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    String str = paramp != null ? paramp.a() : null;
    ResultSet localResultSet = localDatabaseMetaData.getProcedures(paramf.a(), str, null);
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
      localResultSet = localDatabaseMetaData.getIndexInfo(paramv.a().a(), str, paramv.a(), false, true);
      if (localResultSet != null)
        while (localResultSet.next())
        {
          localObject1 = localResultSet.getString("INDEX_NAME");
          if (localObject1 != null)
          {
            localObject2 = new m((String)localObject1, this.i, paramv);
            if (!localArrayList.contains(localObject2))
            {
              int i1 = localResultSet.getShort("TYPE");
              switch (i1)
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

  public String[] j()
    throws SQLException
  {
    if (this.m == null)
    {
      DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
      ResultSet localResultSet = localDatabaseMetaData.getTableTypes();
      ArrayList localArrayList = new ArrayList(5);
      if (localResultSet != null)
      {
        while (localResultSet.next())
          localArrayList.add(localResultSet.getString(1));
        localResultSet.close();
      }
      this.m = new String[localArrayList.size()];
      localArrayList.toArray(this.m);
    }
    return this.m;
  }

  public Set a(String paramString1, String paramString2, String paramString3)
    throws SQLException
  {
    if (!this.i.a(false))
      return Collections.EMPTY_SET;
    DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
    ResultSet localResultSet = localDatabaseMetaData.getPrimaryKeys(paramString1, paramString2, paramString3);
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

  public boolean i()
    throws SQLException
  {
    if (!this.o)
    {
      DatabaseMetaData localDatabaseMetaData = this.i.q().getMetaData();
      this.n = localDatabaseMetaData.supportsStoredProcedures();
      this.o = true;
    }
    return this.n;
  }

  public void h()
  {
    this.l = new HashMap(8);
    this.j = null;
    this.k = null;
  }

  public String d()
  {
    return this.j;
  }

  public String e()
  {
    return this.k;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.g
 * JD-Core Version:    0.6.0
 */