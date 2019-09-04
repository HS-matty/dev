package com.zend.ide.cb.a.b;

import com.zend.ide.cb.c.w;
import com.zend.ide.cb.u;
import com.zend.ide.util.f.i;
import javax.swing.Action;
import javax.swing.KeyStroke;

public class bb
{
  private db a;
  private wb b;
  private w c;
  private u d;

  public bb(db paramdb)
  {
    this.a = paramdb;
    this.b = paramdb.b();
    this.c = paramdb.d();
    this.d = paramdb.c();
  }

  public Action a()
  {
    return new bc(new sb(this));
  }

  public Action a(KeyStroke paramKeyStroke)
  {
    return new bc(new ac(this, paramKeyStroke));
  }

  public Action c()
  {
    return new bc(new tb(this));
  }

  public Action d()
  {
    return new bc(new pb(this));
  }

  public Action e()
  {
    return new nb(this);
  }

  public Action b(KeyStroke paramKeyStroke)
  {
    return new bc(new qb(this, paramKeyStroke));
  }

  public Action g()
  {
    return new i(new bc(new mb(this)));
  }

  public Action h()
  {
    return new bc(new ob(this));
  }

  public Action c(KeyStroke paramKeyStroke)
  {
    return new bc(new ub(this, paramKeyStroke));
  }

  public Action b()
  {
    return new bc(new zb(this));
  }

  static db a(bb parambb)
  {
    return parambb.a;
  }

  static w b(bb parambb)
  {
    return parambb.c;
  }

  static wb c(bb parambb)
  {
    return parambb.b;
  }

  static u d(bb parambb)
  {
    return parambb.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.bb
 * JD-Core Version:    0.6.0
 */