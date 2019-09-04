package com.zend.ide.cb.c.b;

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
  }

  protected String e()
  {
    return "net.sourceforge.jtds.jdbc.Driver";
  }

  protected void f()
  {
    this.b.clear();
    this.b.put("User", j());
    this.b.put("Password", i());
    this.b.put("appName", "Zend Studio");
  }

  public v g()
  {
    if (this.c == null)
      this.c = new a(this);
    return this.c;
  }

  protected String a(String paramString, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer("jdbc:jtds:sqlserver:");
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
    if (!n().trim().equals(""))
      localStringBuffer.append('/' + n().trim());
    return localStringBuffer.toString();
  }

  public String c()
  {
    return "[";
  }

  public String d()
  {
    return "]";
  }

  public boolean b()
  {
    return this.m;
  }

  public int a(boolean paramBoolean)
  {
    return 1005;
  }

  public void b()
  {
  }

  public boolean c()
  {
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.b.c
 * JD-Core Version:    0.6.0
 */