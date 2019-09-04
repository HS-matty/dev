package com.zend.ide.cb.c;

import com.zend.ide.cb.e;
import com.zend.ide.cb.n;
import com.zend.ide.cb.o;
import com.zend.ide.cb.q;
import com.zend.ide.cb.z;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.gb;
import java.io.File;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public abstract class h
  implements o
{
  private e a;
  protected Properties b;
  protected v c;
  private Connection d;
  private n e;
  private n f;
  private int g;
  private boolean h;
  private int i;
  private boolean j;
  private Driver k;
  private boolean l;
  protected boolean m;
  protected q n;

  protected h(e parame, q paramq)
  {
    this.a = parame;
    this.b = new Properties();
    this.n = paramq;
    a(300);
    this.l = (System.getProperty("sqlDebug") != null);
    t();
  }

  public void a()
  {
    try
    {
      g().h();
      if (this.d != null)
        this.d.close();
    }
    catch (Throwable localThrowable)
    {
    }
    this.e = null;
    this.f = null;
    this.d = null;
  }

  public boolean a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws SQLException
  {
    if (this.d == null)
      throw new IllegalStateException(ct.a(1463));
    if ((!p()) || (this.e == null) || (this.e.a() == null) || (this.e.c() != paramInt2) || (this.e.d() != paramInt1))
      this.e = new n(this.d.createStatement(paramInt1, paramInt2));
    Statement localStatement = this.e.a();
    if (c())
      try
      {
        localStatement.setFetchSize(r());
      }
      catch (SQLException localSQLException1)
      {
      }
    this.e.a((b()) && (paramInt4 > -1));
    if (this.e.b())
      this.e.b(a(paramInt3, paramInt4));
    this.e.a(paramString);
    if (this.l)
      System.out.println("Execute: " + this.e.a());
    boolean bool = false;
    try
    {
      bool = localStatement.execute(this.e.a());
    }
    catch (SQLException localSQLException2)
    {
      try
      {
        bool = localStatement.execute(this.e.b());
        if (this.l)
          System.out.println("!!! Failed using the LIMIT. Starting to use non-LIMIT queries.");
        this.e.a(false);
        this.m = false;
      }
      catch (SQLException localSQLException3)
      {
        if ((this.n != null) && (!this.n.a(true, true)))
          throw new SQLException(ct.a(1578));
        throw localSQLException3;
      }
    }
    if (bool)
    {
      ResultSet localResultSet = this.e.a().getResultSet();
      if ((localResultSet == null) || (localResultSet.getMetaData() == null) || (localResultSet.getMetaData().getColumnCount() == 0))
      {
        bool = false;
      }
      else
      {
        this.e.a(this.e.a().getResultSet());
        return bool;
      }
    }
    this.e.a(null);
    if (this.f == null)
      this.f = new n(this.e);
    else
      this.f.a(this.e);
    return bool;
  }

  public boolean a(String paramString, int paramInt1, int paramInt2)
    throws SQLException
  {
    return a(paramString, paramInt1, paramInt2, -1, -1);
  }

  public ResultSet b()
    throws SQLException
  {
    if (this.e == null)
      return null;
    return this.e.e();
  }

  public int a()
    throws SQLException
  {
    if (this.f == null)
      return -1;
    return this.f.f();
  }

  public boolean a(int paramInt)
    throws SQLException
  {
    if ((this.e == null) || (this.e.a() == null))
      return false;
    if (this.e.a().getMoreResults(paramInt))
    {
      this.e.a(this.e.a().getResultSet());
      return true;
    }
    return false;
  }

  public ResultSet a(String paramString, int paramInt1, int paramInt2)
    throws SQLException, IllegalStateException
  {
    if (this.d == null)
      throw new IllegalStateException("Connection already closed.");
    if (this.e != null)
      this.e.a(null);
    if ((!p()) || (this.e == null) || (this.e.a() == null) || (this.e.c() != paramInt2) || (this.e.d() != paramInt1))
      this.e = new n(this.d.createStatement(paramInt1, paramInt2));
    Statement localStatement = this.e.a();
    this.e.a(paramString);
    try
    {
      if (c())
        localStatement.setFetchSize(r());
    }
    catch (SQLException localSQLException)
    {
      if (this.l)
        System.out.println("executeQuery -> statement.setFetchSize: " + localSQLException.getMessage());
    }
    ResultSet localResultSet = localStatement.executeQuery(paramString);
    this.e.a(localResultSet);
    return localResultSet;
  }

  public int a(String paramString)
    throws SQLException, IllegalStateException
  {
    if (this.d == null)
      throw new IllegalStateException(ct.a(1463));
    if ((!p()) || (this.f == null) || (this.f.a() == null))
      this.f = new n(this.d.createStatement());
    Statement localStatement = this.f.a();
    this.f.a(paramString);
    return localStatement.executeUpdate(paramString);
  }

  public final void c()
    throws Exception
  {
    if (s())
    {
      f();
      String str = a(h(), l());
      this.d = this.k.connect(str, this.b);
      if (this.d == null)
        throw new SQLException(ct.a(1464) + " '" + h() + '\'');
      b();
      if (this.l)
      {
        System.out.println("Connected to: " + str);
        try
        {
          DatabaseMetaData localDatabaseMetaData = this.d.getMetaData();
          if (localDatabaseMetaData.supportsResultSetConcurrency(1004, 1008))
            System.out.println("Host: " + h() + ':' + l() + " supports updatable results");
          else
            System.out.println("Host: " + h() + ':' + l() + " does NOT support updatable results");
          System.out.println("Auto Commit is - " + this.d.getAutoCommit());
        }
        catch (Throwable localThrowable)
        {
        }
      }
    }
  }

  protected abstract String e();

  protected abstract String a(String paramString, int paramInt);

  protected abstract void f();

  public abstract v g();

  protected void finalize()
    throws Throwable
  {
    a();
    super.finalize();
  }

  public String h()
  {
    return this.a.c();
  }

  public String i()
  {
    return this.a.b();
  }

  public String j()
  {
    return this.a.a();
  }

  public boolean a(boolean paramBoolean)
  {
    try
    {
      if ((this.d == null) || (this.d.isClosed()))
        return false;
    }
    catch (SQLException localSQLException)
    {
      return false;
    }
    if (paramBoolean)
      return g().f();
    return true;
  }

  public int l()
  {
    return this.a.e();
  }

  public boolean m()
  {
    return this.a.g();
  }

  public String n()
  {
    return this.a.d();
  }

  public void a(int paramInt)
  {
    this.g = paramInt;
  }

  public e o()
  {
    return new e(this.a);
  }

  public void a(e parame)
  {
    this.a = parame;
  }

  public boolean p()
  {
    return this.h;
  }

  public Connection q()
  {
    return this.d;
  }

  public int r()
  {
    return this.i;
  }

  public z a(n paramn, int paramInt1, int paramInt2, boolean paramBoolean)
    throws SQLException
  {
    if (paramn.b())
    {
      a(paramn.b(), paramn.d(), paramn.c(), paramInt1, paramInt2 + 1);
      return new z(this.e.e(), paramInt1);
    }
    if (paramInt1 < 1)
      paramInt1 = 0;
    ResultSet localResultSet = paramn.e();
    if (localResultSet != null)
    {
      int i1 = 0;
      int i2 = 0;
      try
      {
        i2 = localResultSet.getType();
      }
      catch (SQLException localSQLException)
      {
        i1 = 1;
        paramBoolean = true;
      }
      if ((i1 == 0) && (i2 != 1003) && (!paramBoolean))
      {
        if (paramInt1 == 0)
          localResultSet.beforeFirst();
        else if (paramInt1 == 1)
          localResultSet.absolute(paramInt1);
        else
          localResultSet.absolute(paramInt1 - 1);
      }
      else
      {
        int i3 = a(paramn) - paramInt1;
        if ((i3 < 0) || (paramBoolean) || ((i3 > 0) && (i2 == 1003)))
        {
          a(paramn.b(), paramn.d(), paramn.c());
          paramn.a(this.e.e());
          localResultSet = paramn.e();
          i3 = paramInt1;
        }
        if ((i1 == 0) && (localResultSet.getType() != 1003))
        {
          if (paramInt1 == 0)
            localResultSet.beforeFirst();
          else
            localResultSet.absolute(paramInt1 - 1);
        }
        else if (localResultSet != null)
          while (i3 > 0)
          {
            i3--;
            if (localResultSet.next())
              continue;
          }
      }
    }
    return new z(localResultSet, paramInt1);
  }

  public int a(n paramn)
    throws SQLException
  {
    if (paramn.e() != null)
      try
      {
        return paramn.e().getRow();
      }
      catch (SQLException localSQLException)
      {
        return 0;
      }
    return 0;
  }

  public n b()
  {
    if (this.e == null)
      return null;
    return new n(this.e);
  }

  public int a(boolean paramBoolean)
  {
    return 1004;
  }

  public int b(boolean paramBoolean)
  {
    return paramBoolean ? 1008 : 1007;
  }

  public String c()
  {
    return "";
  }

  public String d()
  {
    return "";
  }

  public String a()
    throws SQLException
  {
    if (this.d != null)
      return this.d.getMetaData().getCatalogSeparator();
    return ".";
  }

  public boolean e()
  {
    return g().k();
  }

  public boolean a()
  {
    return true;
  }

  public boolean c()
  {
    return true;
  }

  public boolean s()
  {
    return this.j;
  }

  protected String a(int paramInt1, int paramInt2)
  {
    return " LIMIT " + paramInt2 + " OFFSET " + paramInt1;
  }

  private void t()
  {
    try
    {
      this.k = ((Driver)w.g.b(e()));
    }
    catch (Throwable localThrowable)
    {
      cl.a(localThrowable);
      if (this.l)
      {
        localThrowable.printStackTrace();
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("Failed loading class: " + e());
        localStringBuffer.append("\nWorking dir: " + new File("").getAbsolutePath());
        localStringBuffer.append("\n\n");
        localStringBuffer.append("System Properties: \n------------------------------------------\n");
        Properties localProperties = System.getProperties();
        Iterator localIterator = localProperties.keySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject = localIterator.next();
          localStringBuffer.append(localObject + "\t -> \t" + localProperties.get(localObject) + '\n');
        }
        localStringBuffer.append("------------------------------------------\n");
        localStringBuffer.append("\nLoaded Jars:\n");
        localStringBuffer.append(w.g);
        System.out.println(localStringBuffer.toString());
      }
    }
    this.j = (this.k != null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.h
 * JD-Core Version:    0.6.0
 */