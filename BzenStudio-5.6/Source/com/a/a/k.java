package com.a.a;

import com.a.e;
import com.zend.ide.util.bv;

public class k extends a
{
  public k()
  {
    super("url", bv.class);
  }

  public Object a(e parame)
  {
    String str = parame.a("spec");
    boolean bool = Boolean.valueOf(parame.a("local")).booleanValue();
    return new bv(str, bool);
  }

  public e e()
  {
    bv localbv = (bv)c();
    e locale = new e();
    locale.a("spec", localbv.toString());
    locale.a("local", " " + localbv.b());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.a.k
 * JD-Core Version:    0.6.0
 */