package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.zend.ide.o.fu;

public class c extends a
{
  public c()
  {
    super("connectionInfo", fu.class);
  }

  public Object a(e parame)
  {
    fu localfu = new fu();
    localfu.a(Boolean.valueOf(parame.a("use_defaults")).booleanValue());
    localfu.b(parame.a("tempFilesLocation"));
    localfu.b(parame.a("debug_mode").equals("remote"));
    localfu.a(parame.a("serverHost"));
    localfu.a(Integer.parseInt(parame.a("port")));
    return localfu;
  }

  public e e()
  {
    fu localfu = (fu)c();
    e locale = new e();
    locale.a("use_defaults", "" + localfu.f());
    locale.a("tempFilesLocation", localfu.d());
    locale.a("debug_mode", localfu.e() ? "remote" : "local");
    locale.a("serverHost", localfu.c());
    locale.a("port", "" + localfu.b());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.c
 * JD-Core Version:    0.6.0
 */