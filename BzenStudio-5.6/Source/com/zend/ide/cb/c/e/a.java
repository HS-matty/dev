package com.zend.ide.cb.c.e;

import com.zend.ide.cb.c.g;
import com.zend.ide.cb.c.s;
import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.w;
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
    return null;
  }

  public ResultSet b()
    throws SQLException
  {
    return null;
  }

  public ResultSet c()
    throws SQLException
  {
    return null;
  }

  public ResultSet a(f paramf)
    throws SQLException
  {
    if (!b("dbProp"))
      b("dbProp", "SELECT SCHEMANAME AS Schema_Name, AUTHORIZATIONID AS Authorization_ID FROM SYS.SYSSCHEMAS");
    PreparedStatement localPreparedStatement = a("dbProp");
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(p paramp)
    throws SQLException
  {
    if (!b("getSchem"))
      b("getSchem", "SELECT TABLENAME AS Table_Name, TABLETYPE AS Table_Type, LOCKGRANULARITY AS Lock_Granularity FROM SYS.SYSTABLES WHERE SCHEMAID = (SELECT SCHEMAID FROM SYS.SYSSCHEMAS WHERE SCHEMANAME = ?)");
    PreparedStatement localPreparedStatement = a("getSchem");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, paramp.a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(com.zend.ide.cb.v paramv)
    throws SQLException
  {
    if (!b("tableProperties"))
      b("tableProperties", "SELECT COLUMNNAME AS Column_Name, COLUMNNUMBER AS Column_Number, COLUMNDATATYPE AS Column_Data_Type, COLUMNDEFAULT AS Column_Default, COLUMNDEFAULTID AS Column_Default_ID, AUTOINCREMENTVALUE AS Auto_Increment_Value, AUTOINCREMENTSTART AS Auto_Increment_Start, AUTOINCREMENTINC AS Auto_Increment_Inc FROM SYS.SYSCOLUMNS WHERE REFERENCEID = (SELECT TABLEID FROM SYS.SYSTABLES WHERE TABLENAME = ? AND SCHEMAID = (SELECT SCHEMAID FROM SYS.SYSSCHEMAS WHERE SCHEMANAME = ?)) ORDER BY COLUMNNUMBER");
    PreparedStatement localPreparedStatement = a("tableProperties");
    localPreparedStatement.clearParameters();
    localPreparedStatement.setString(1, paramv.a());
    localPreparedStatement.setString(2, paramv.b().a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public ResultSet a(com.zend.ide.cb.h paramh)
    throws SQLException
  {
    if (!b("fieldProperties"))
      b("fieldProperties", "SELECT COLUMNNAME AS Column_Name, COLUMNNUMBER AS Column_Number, COLUMNDATATYPE AS Column_Data_Type, COLUMNDEFAULT AS Column_Default, COLUMNDEFAULTID AS Column_Default_ID, AUTOINCREMENTVALUE AS Auto_Increment_Value, AUTOINCREMENTSTART AS Auto_Increment_Start, AUTOINCREMENTINC AS Auto_Increment_Inc FROM SYS.SYSCOLUMNS WHERE COLUMNNAME = ? AND REFERENCEID = (SELECT TABLEID FROM SYS.SYSTABLES WHERE TABLENAME = ? AND SCHEMAID = (SELECT SCHEMAID FROM SYS.SYSSCHEMAS WHERE SCHEMANAME = ?))");
    PreparedStatement localPreparedStatement = a("fieldProperties");
    localPreparedStatement.clearParameters();
    com.zend.ide.cb.v localv = paramh.a();
    localPreparedStatement.setString(1, paramh.a());
    localPreparedStatement.setString(2, localv.a());
    localPreparedStatement.setString(3, localv.b().a());
    ResultSet localResultSet = localPreparedStatement.executeQuery();
    return localResultSet;
  }

  public w[] b(q paramq)
    throws SQLException
  {
    if (!b("getUsers"))
      b("getUsers", "VALUES USER");
    PreparedStatement localPreparedStatement = a("getUsers");
    if (localPreparedStatement == null)
      return new w[0];
    ResultSet localResultSet = localPreparedStatement.executeQuery();
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
        b("testCon", "VALUES USER");
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
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.e.a
 * JD-Core Version:    0.6.0
 */