package com.zend.ide.y.a;

import com.a.a.a;
import com.a.e;
import com.zend.ide.util.cm;

public class f extends a
{
  public f()
  {
    super("manual_url", cm.class);
  }

  public Object a(e parame)
  {
    String str = parame.a("spec");
    boolean bool = Boolean.valueOf(parame.a("local")).booleanValue();
    return new cm(str, bool);
  }

  public e e()
  {
    cm localcm = (cm)c();
    e locale = new e();
    locale.a("spec", localcm.toString());
    locale.a("local", "" + localcm.b());
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.y.a.f
 * JD-Core Version:    0.6.0
 */