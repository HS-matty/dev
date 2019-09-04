package com.zend.ide.desktop.e;

import com.zend.ide.db.o;
import com.zend.ide.db.z;
import com.zend.ide.desktop.cj;
import com.zend.ide.h.e;
import com.zend.ide.l.v;
import com.zend.ide.util.f.i;
import com.zend.ide.util.s;
import javax.swing.Action;

public class h
{
  private cj a;
  private Action b;
  private Action c;
  private com.zend.ide.db.l d;
  private k e;
  private j f = new j(this, null);
  private e g;
  private boolean h = false;

  public h(cj paramcj)
  {
    this.a = paramcj;
    this.g = paramcj.l().h();
    b();
    paramcj.l().a(new l(this, null));
    o.a().a(this.f);
    this.e = new k(this);
  }

  private void a(boolean paramBoolean)
  {
    if (this.h == paramBoolean)
      return;
    this.h = paramBoolean;
    if (paramBoolean)
      c();
    else
      d();
  }

  private com.zend.ide.db.l a()
  {
    if (this.d == null)
      this.d = new com.zend.ide.db.l();
    return this.d;
  }

  private void b()
  {
    this.b = new i(new com.zend.ide.util.c.m(new n(this)));
    this.c = new i(new com.zend.ide.util.c.m(new m(this)));
    this.a.a("keys.phpDoc", this.c, "default", false);
  }

  private void c()
  {
    this.g = this.a.l().h();
    s locals = (s)this.g.q();
    locals.a("keys.phpDoc", this.b, "file", true);
    locals.a("keys.phpDoc", this.b, "directory", true);
    locals.a("keys.phpDoc", this.b, "multipleSelection", true);
    locals.a("keys.phpDoc", this.b, "root", true);
  }

  private void d()
  {
    s locals = (s)this.g.q();
    locals.a("keys.cvs*keys.update", "file", true);
    locals.a("keys.cvs*keys.update", "directory", true);
    locals.a("keys.cvs*keys.update", "multipleSelection", true);
    locals.a("keys.cvs*keys.update", "root", true);
  }

  private z e()
  {
    return o.a().c();
  }

  static e a(h paramh)
  {
    return paramh.g;
  }

  static com.zend.ide.db.l b(h paramh)
  {
    return paramh.a();
  }

  static void a(h paramh, boolean paramBoolean)
  {
    paramh.a(paramBoolean);
  }

  static z c(h paramh)
  {
    return paramh.e();
  }

  static cj d(h paramh)
  {
    return paramh.a;
  }

  static k e(h paramh)
  {
    return paramh.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.h
 * JD-Core Version:    0.6.0
 */