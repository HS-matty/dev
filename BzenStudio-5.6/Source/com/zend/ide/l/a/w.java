package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.zend.ide.zendPlatformIntegration.a.r;

public class w extends a
{
  public w()
  {
    super("platformServers", r.class);
  }

  public e e()
  {
    e locale = new e();
    r localr = (r)c();
    locale.a("server_key", localr.a());
    locale.a("server_value", localr.b());
    locale.a("server_included", new Boolean(localr.c()).toString());
    return locale;
  }

  public Object a(e parame)
  {
    String str1 = parame.a("server_key");
    String str2 = parame.a("server_value");
    String str3 = parame.a("server_included");
    r localr = new r(str1, str2, new Boolean(str3).booleanValue());
    return localr;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.w
 * JD-Core Version:    0.6.0
 */