package com.zend.ide.desktop;

import com.zend.ide.bd.c;
import com.zend.ide.n.ob;
import com.zend.ide.util.ct;
import com.zend.ide.util.g;
import com.zend.ide.y.b;

class tc
  implements ob
{
  private int a;
  private int b;
  private String c;
  private String d;
  final sc e;

  tc(sc paramsc, int paramInt1, int paramInt2, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
    this.d = this.d;
  }

  public int a()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public String c()
  {
    return ct.a(159) + ' ' + this.c;
  }

  public void d()
  {
    boolean bool = (Boolean)b.a("desktop.internalBrowser") != null;
    bool = (bool) && ((Boolean)b.a("desktop.internalBrowser") != null);
    c.b().e().a(this.c, bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.tc
 * JD-Core Version:    0.6.0
 */