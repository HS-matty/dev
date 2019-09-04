package com.zend.ide.cb;

import com.zend.ide.util.cl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n
{
  private Statement a;
  private String b;
  private int c;
  private int d;
  private ResultSet e;
  private boolean f;
  private String g;
  private static Pattern h = Pattern.compile("INSERT|UPDATE|DELETE", 2);

  public n(Statement paramStatement)
  {
    this.a = paramStatement;
    try
    {
      this.d = paramStatement.getResultSetType();
      this.c = paramStatement.getResultSetConcurrency();
    }
    catch (SQLException localSQLException)
    {
    }
  }

  public n()
  {
  }

  public n(n paramn)
  {
    a(paramn);
  }

  public Statement a()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    if (paramString != null)
      paramString = paramString.trim();
    this.b = paramString;
  }

  public String b()
  {
    return this.b;
  }

  public String a()
  {
    String str1 = this.b;
    if (b())
    {
      String str2 = str1.toUpperCase();
      str2 = str2.trim();
      int i = str2.indexOf("SELECT");
      int j = i + 6;
      if ((str2.length() <= j) || (!Character.isWhitespace(str2.charAt(j))))
        return str1;
      if ((i < 0) || (i > 5))
        return str1;
      if (str2.indexOf(" LIMIT ") < 0)
        if (str1.endsWith(";"))
          str1 = str1.substring(0, str1.length() - 1) + ' ' + this.g + ';';
        else
          str1 = str1 + ' ' + this.g;
    }
    return str1;
  }

  public int c()
  {
    return this.c;
  }

  public int d()
  {
    return this.d;
  }

  public ResultSet e()
  {
    return this.e;
  }

  public void a(ResultSet paramResultSet)
  {
    this.e = paramResultSet;
  }

  public int f()
  {
    int i = -1;
    try
    {
      if (this.a != null)
        i = this.a.getUpdateCount();
    }
    catch (SQLException localSQLException)
    {
      cl.a(localSQLException);
    }
    return i;
  }

  public void a(n paramn)
  {
    this.a = paramn.a;
    this.b = paramn.b;
    this.c = paramn.c;
    this.d = paramn.d;
    this.e = paramn.e;
    this.g = paramn.g;
    this.f = paramn.f;
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public boolean b()
  {
    return this.f;
  }

  public void b(String paramString)
  {
    this.g = paramString;
  }

  public boolean a()
  {
    if (this.b == null)
      return false;
    return h.matcher(this.b).find();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.n
 * JD-Core Version:    0.6.0
 */