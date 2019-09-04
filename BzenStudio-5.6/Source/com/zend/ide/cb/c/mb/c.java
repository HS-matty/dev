package com.zend.ide.cb.c.mb;

import com.zend.ide.cb.c.h;
import com.zend.ide.cb.c.v;
import com.zend.ide.cb.e;
import com.zend.ide.cb.q;
import com.zend.ide.util.cl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class c extends h
{
  public c(e parame, q paramq)
  {
    super(parame, paramq);
  }

  protected String e()
  {
    return "com.ibm.as400.access.AS400JDBCDriver";
  }

  protected String a(String paramString, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer("jdbc:as400:");
    int i = paramString.indexOf("://");
    if (i > 0)
    {
      localStringBuffer.append(paramString.substring(0, i + 3));
      paramString = paramString.substring(i + 3);
    }
    else
    {
      localStringBuffer.append("//");
    }
    i = paramString.indexOf('/');
    if (i < 0)
    {
      localStringBuffer.append(paramString);
      localStringBuffer.append(':');
      localStringBuffer.append(paramInt);
    }
    else
    {
      localStringBuffer.append(paramString.substring(0, i));
      localStringBuffer.append(':');
      localStringBuffer.append(paramInt);
      localStringBuffer.append(paramString.substring(i));
    }
    if (!paramString.endsWith("/"))
      localStringBuffer.append('/');
    String str = n();
    if (str != null)
    {
      str = str.trim();
      if (str.length() > 0)
        localStringBuffer.append(str.trim());
    }
    return localStringBuffer.toString();
  }

  protected void f()
  {
    this.b.clear();
    this.b.put("user", j());
    this.b.put("password", i());
    this.b.put("naming", "sql");
    this.b.put("errors", "full");
    this.b.put("extended metadata", "true");
    this.b.put("prompt", "false");
  }

  public v g()
  {
    if (this.c == null)
      this.c = new b(this);
    return this.c;
  }

  public String c()
  {
    return "\"";
  }

  public String d()
  {
    return "\"";
  }

  public boolean b()
  {
    return this.m;
  }

  public int a(boolean paramBoolean)
  {
    return 1003;
  }

  public int b(boolean paramBoolean)
  {
    return 1007;
  }

  public void b()
  {
    Connection localConnection = q();
    if (localConnection != null)
      try
      {
        localConnection.setAutoCommit(true);
      }
      catch (SQLException localSQLException)
      {
        cl.a(localSQLException);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.mb.c
 * JD-Core Version:    0.6.0
 */