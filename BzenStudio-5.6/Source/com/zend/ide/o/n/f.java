package com.zend.ide.o.n;

import java.beans.PropertyChangeListener;

public class f
  implements d
{
  private d a = new e();
  private com.zend.ide.y.e b;
  private PropertyChangeListener c = new h(this, null);
  private com.zend.ide.util.c.f d;
  private static f e = new f();

  private f()
  {
    c();
  }

  public static f a()
  {
    return e;
  }

  private void c()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.b = new com.zend.ide.y.e(localf);
    localf.a("debugging.httpServerPort", this.c);
    this.b.a("debugging.httpServerPort");
  }

  public void a()
  {
    g localg = new g(this);
    if (this.d != null)
      this.d.a();
    this.d = com.zend.ide.util.c.h.c().a(localg, false);
    this.d.h();
  }

  public void b()
  {
    this.a.b();
  }

  public boolean c()
  {
    return this.a.c();
  }

  static d a(f paramf)
  {
    return paramf.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.f
 * JD-Core Version:    0.6.0
 */