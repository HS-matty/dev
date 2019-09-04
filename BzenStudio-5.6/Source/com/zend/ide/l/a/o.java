package com.zend.ide.l.a;

import com.a.e;

public class o extends com.a.a.a
{
  public o()
  {
    super("NodeMemnto", com.zend.ide.p.fb.a.class);
  }

  public Object a(e parame)
  {
    String str = parame.a("name");
    int i = Integer.parseInt(parame.a("level"));
    return new com.zend.ide.p.fb.a(i, str);
  }

  public e e()
  {
    com.zend.ide.p.fb.a locala = (com.zend.ide.p.fb.a)c();
    e locale = new e();
    locale.a("level", String.valueOf(locala.a()));
    locale.a("name", locala.b());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.o
 * JD-Core Version:    0.6.0
 */