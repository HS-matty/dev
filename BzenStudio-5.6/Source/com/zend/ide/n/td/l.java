package com.zend.ide.n.td;

import com.zend.ide.y.e;
import com.zend.ide.y.f;

public class l
{
  private f a;
  private e b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;

  public l()
  {
    a();
  }

  private void a()
  {
    this.a = new f();
    this.a.a("editing.foldingClasses", new n(this, null));
    this.a.a("editing.foldingDocBlocks", new o(this, null));
    this.a.a("editing.foldingFunctions", new p(this, null));
    this.a.a("editing.foldingNonPHP", new q(this, null));
    this.b = new e(this.a);
    this.b.a("editing.foldingClasses");
    this.b.a("editing.foldingDocBlocks");
    this.b.a("editing.foldingFunctions");
    this.b.a("editing.foldingNonPHP");
  }

  public boolean b()
  {
    return this.e;
  }

  public boolean c()
  {
    return this.f;
  }

  public boolean d()
  {
    return this.d;
  }

  public boolean e()
  {
    return this.c;
  }

  static boolean a(l paraml, boolean paramBoolean)
  {
    return paraml.e = paramBoolean;
  }

  static boolean b(l paraml, boolean paramBoolean)
  {
    return paraml.f = paramBoolean;
  }

  static boolean c(l paraml, boolean paramBoolean)
  {
    return paraml.d = paramBoolean;
  }

  static boolean d(l paraml, boolean paramBoolean)
  {
    return paraml.c = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.l
 * JD-Core Version:    0.6.0
 */