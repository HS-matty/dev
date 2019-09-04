package com.zend.ide.n.td.a;

import com.zend.ide.y.e;
import com.zend.ide.y.f;

public class k
{
  private f a;
  private e b;
  private boolean c;
  private int d;

  public k()
  {
    c();
  }

  public int a()
  {
    return this.d;
  }

  public boolean b()
  {
    return this.c;
  }

  private void c()
  {
    this.a = new f();
    this.a.a("editing.showPrintMargin", new n(this, null));
    this.a.a("editing.printMarginColumn", new m(this, null));
    this.b = new e(this.a);
    this.b.a("editing.showPrintMargin");
    this.b.a("editing.printMarginColumn");
  }

  static int a(k paramk, int paramInt)
  {
    return paramk.d = paramInt;
  }

  static boolean a(k paramk, boolean paramBoolean)
  {
    return paramk.c = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.k
 * JD-Core Version:    0.6.0
 */