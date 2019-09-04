package com.zend.ide.cb.c.d;

import com.zend.ide.cb.c.h;
import com.zend.ide.cb.c.v;
import com.zend.ide.cb.e;
import com.zend.ide.cb.q;
import java.util.Properties;

public class c extends h
{
  public c(e parame, q paramq)
  {
    super(parame, paramq);
    this.m = true;
  }

  protected String e()
  {
    return "com.mysql.jdbc.Driver";
  }

  protected void f()
  {
    this.b.clear();
    this.b.put("user", j());
    this.b.put("password", i());
    this.b.put("autoReconnect", "true");
    this.b.put("initialTimeout", "1");
    this.b.put("maxReconnects", "1");
    this.b.put("useOnlyServerErrorMessages", "true");
    this.b.put("zeroDateTimeBehavior", "convertToNull");
    this.b.put("useServerPrepStmts", "false");
  }

  public v g()
  {
    if (this.c == null)
      this.c = new a(this);
    return this.c;
  }

  protected String a(String paramString, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer("jdbc:mysql:");
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
    String str = n();
    if (!paramString.endsWith("/"))
      localStringBuffer.append('/');
    if (str != null)
    {
      str = str.trim();
      if (str.length() > 0)
        localStringBuffer.append(str.trim());
    }
    return localStringBuffer.toString();
  }

  public String c()
  {
    return "`";
  }

  public String d()
  {
    return "`";
  }

  public boolean b()
  {
    return this.m;
  }

  public void b()
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.d.c
 * JD-Core Version:    0.6.0
 */