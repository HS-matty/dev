package com.zend.ide.w.a;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.io.File;

class cb
  implements cu
{
  private String a;
  private String b;
  private String f;
  private String c;
  private String g;
  private String d;
  private String e;
  private String h;
  private String i;

  public cb(String paramString)
    throws Exception
  {
    a(paramString);
    if (this.a.equals("local"))
    {
      this.e = (":" + this.a + ":" + this.d);
    }
    else
    {
      StringBuffer localStringBuffer = new StringBuffer(":");
      localStringBuffer.append(this.a);
      if ((this.h != null) && (this.h.length() > 0) && (this.i != null) && (this.i.length() > 0))
      {
        localStringBuffer.append(";proxyName=");
        localStringBuffer.append(this.h);
        localStringBuffer.append(";proxyport=");
        localStringBuffer.append(this.i);
      }
      localStringBuffer.append(":");
      localStringBuffer.append(this.b);
      if ((this.f != null) && (this.f.length() > 0))
      {
        localStringBuffer.append(":");
        localStringBuffer.append(this.f);
      }
      localStringBuffer.append("@");
      localStringBuffer.append(this.c);
      localStringBuffer.append(":");
      if ((this.g != null) && (this.g.length() > 0))
        localStringBuffer.append(this.g);
      localStringBuffer.append(this.d);
      this.e = localStringBuffer.toString();
    }
  }

  public String toString()
  {
    return this.e;
  }

  public String b()
  {
    return this.b;
  }

  public String c()
  {
    return this.d;
  }

  public String d()
  {
    return this.c;
  }

  public static boolean a(String paramString)
  {
    int j = 1;
    try
    {
      new cb(paramString);
    }
    catch (Exception localException)
    {
      j = 0;
    }
    return j;
  }

  private void a(String paramString)
    throws Exception
  {
    if ((paramString == null) || (paramString.trim().length() == 0))
      throw new IllegalArgumentException(ct.a(1298, paramString));
    paramString = paramString.trim();
    if ((paramString.startsWith(":pserver")) || (paramString.startsWith(":kserver")) || (paramString.startsWith(":gserver")))
    {
      this.a = paramString.substring(1, 8);
      paramString = paramString.substring(8);
      if (paramString.charAt(0) == ';')
      {
        paramString = paramString.substring(1);
        j = paramString.indexOf(';');
        this.h = paramString.substring(paramString.indexOf('=') + 1, j);
        paramString = paramString.substring(j + 1);
        this.i = paramString.substring(paramString.indexOf('=') + 1, paramString.indexOf(':'));
      }
      paramString = paramString.substring(paramString.indexOf(':') + 1);
      int j = paramString.indexOf('@');
      if (j != -1)
      {
        m = paramString.indexOf(':');
        if ((m != -1) && (m < j))
        {
          this.b = paramString.substring(0, m);
          this.f = paramString.substring(m + 1, j);
        }
        else
        {
          this.b = paramString.substring(0, j);
        }
        paramString = paramString.substring(j + 1);
      }
      m = paramString.indexOf(':');
      n = paramString.indexOf('/');
      if (m != -1)
      {
        this.c = paramString.substring(0, m);
        if (n - m > 1)
          this.g = paramString.substring(m + 1, n);
      }
      else
      {
        this.c = paramString.substring(0, n);
      }
      this.d = paramString.substring(n);
      return;
    }
    if (paramString.startsWith(":ext"))
    {
      this.a = paramString.substring(1, 4);
      paramString = paramString.substring(5);
    }
    else if (paramString.startsWith(":sspi"))
    {
      this.a = paramString.substring(1, 5);
      paramString = paramString.substring(6);
    }
    else if (paramString.startsWith(":server"))
    {
      this.a = paramString.substring(1, 7);
      paramString = paramString.substring(8);
    }
    else
    {
      try
      {
        a(paramString, paramString);
        this.a = "local";
        this.d = paramString;
        this.b = "";
        this.c = "";
        return;
      }
      catch (Exception localException)
      {
      }
    }
    int k = paramString.indexOf('@');
    if (k != -1)
    {
      this.b = paramString.substring(0, k);
      paramString = paramString.substring(k + 1);
    }
    int m = paramString.indexOf(':');
    int n = paramString.indexOf('/');
    if (m != -1)
      this.c = paramString.substring(0, m);
    else
      this.c = paramString.substring(0, n);
    this.d = paramString.substring(n);
  }

  private static final void a(String paramString1, String paramString2)
    throws Exception
  {
    try
    {
      if (!new File(paramString1).exists())
        throw new IllegalArgumentException(ct.a(1297, paramString2));
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException(ct.a(1297, paramString2));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.cb
 * JD-Core Version:    0.6.0
 */