package com.zend.ide.gb.c;

import com.a.a.a;
import com.a.e;
import com.zend.ide.gb.b.d;

public class c extends a
{
  public c()
  {
    super("UnknowenClassSchemaTag", d.class);
  }

  public Object a(e parame)
  {
    String str1 = parame.a("className");
    String str2 = parame.a("schema");
    return new d(str1, str2);
  }

  public e e()
  {
    d locald = (d)c();
    e locale = new e();
    locale.a("className", locald.a());
    locale.a("schema", locald.b());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.c.c
 * JD-Core Version:    0.6.0
 */