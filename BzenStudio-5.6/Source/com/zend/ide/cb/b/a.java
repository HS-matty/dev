package com.zend.ide.cb.b;

import com.zend.ide.util.ac;
import com.zend.ide.util.qb;
import com.zend.ide.util.x;

public class a extends com.a.a.a
{
  public a()
  {
    super("sqlServer", com.zend.ide.cb.e.class);
  }

  public Object a(com.a.e parame)
  {
    com.zend.ide.cb.e locale = new com.zend.ide.cb.e();
    locale.d(parame.a("dbName"));
    locale.c(parame.a("hostName"));
    locale.a(parame.a("userName"));
    String str1 = parame.a("password");
    if (!str1.equals(""))
    {
      String str2 = "";
      try
      {
        str2 = ac.b(str1);
      }
      catch (qb localqb)
      {
        str2 = x.b(str1, "f");
      }
      locale.b(str2);
    }
    locale.a(Integer.valueOf(parame.a("port")).intValue());
    locale.e(parame.a("serverType"));
    locale.a(Boolean.valueOf(parame.a("compressed")).booleanValue());
    locale.b(Boolean.valueOf(parame.a("secure")).booleanValue());
    locale.d(Boolean.valueOf(parame.a("keepAlive")).booleanValue());
    locale.c(Boolean.valueOf(parame.a("autoConnectOnStartup")).booleanValue());
    locale.e(Boolean.valueOf(parame.a("savePassword")).booleanValue());
    locale.f(Boolean.valueOf(parame.a("checkConnection")).booleanValue());
    locale.b(Integer.valueOf(parame.a("checkEvry")).intValue());
    locale.f(parame.a("serverName"));
    return locale;
  }

  public com.a.e e()
  {
    com.zend.ide.cb.e locale = (com.zend.ide.cb.e)c();
    com.a.e locale1 = new com.a.e();
    locale1.a("serverType", locale.j());
    locale1.a("serverName", locale.k());
    locale1.a("hostName", locale.c());
    locale1.a("dbName", locale.d());
    locale1.a("port", "" + locale.e());
    locale1.a("userName", locale.a());
    locale1.a("savePassword", "" + locale.l());
    if (locale.l())
      locale1.a("password", ac.a(locale.b()));
    else
      locale1.a("password", "");
    locale1.a("checkConnection", "" + locale.n());
    locale1.a("checkEvry", "" + locale.m());
    locale1.a("compressed", "" + locale.f());
    locale1.a("secure", "" + locale.g());
    locale1.a("keepAlive", "" + locale.i());
    locale1.a("autoConnectOnStartup", "" + locale.h());
    return locale1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.b.a
 * JD-Core Version:    0.6.0
 */