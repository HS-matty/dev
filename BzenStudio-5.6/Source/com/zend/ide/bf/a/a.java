package com.zend.ide.bf.a;

import com.a.e;
import com.zend.ide.bf.c;
import com.zend.ide.bf.d;

public class a extends com.a.a.a
{
  public a()
  {
    super("template", c.class);
  }

  public Object a(e parame)
  {
    String str1 = parame.a("abbreviation");
    String str2 = parame.a("context");
    String str3 = parame.a("description");
    String str4 = parame.a("code");
    String str5 = parame.a("isUserTemplate");
    boolean bool = false;
    if ((str5 != null) && (!str5.equals("")))
      bool = Boolean.getBoolean(str5);
    c localc = new c(str1, str2, str3, str4, bool);
    return localc;
  }

  public e e()
  {
    d locald = (d)c();
    e locale = new e();
    locale.a("abbreviation", locald.a());
    locale.a("description", locald.b());
    locale.a("context", locald.d().toString());
    locale.a("code", locald.c());
    String str = locald.a() ? "true" : "false";
    locale.a("isUserTemplate", str);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.a.a
 * JD-Core Version:    0.6.0
 */