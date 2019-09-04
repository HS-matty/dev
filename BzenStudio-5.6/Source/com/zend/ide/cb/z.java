package com.zend.ide.cb;

import java.sql.ResultSet;
import java.sql.SQLException;

public class z
{
  private ResultSet a;
  private int b;

  public z(ResultSet paramResultSet, int paramInt)
  {
    if (paramResultSet == null)
      throw new NullPointerException("ResultSet is null!");
    this.a = paramResultSet;
    this.b = paramInt;
  }

  public z(ResultSet paramResultSet)
    throws SQLException
  {
    if (paramResultSet == null)
      throw new NullPointerException("ResultSet is null!");
    this.a = paramResultSet;
    this.b = paramResultSet.getRow();
  }

  public ResultSet a()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public int c()
    throws SQLException
  {
    try
    {
      return this.a.getRow();
    }
    catch (SQLException localSQLException)
    {
    }
    return 0;
  }

  public boolean d()
    throws SQLException
  {
    try
    {
      if (this.a.getType() != 1003)
        return this.a.isAfterLast();
    }
    catch (SQLException localSQLException)
    {
      localSQLException.printStackTrace();
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.z
 * JD-Core Version:    0.6.0
 */