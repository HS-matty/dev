package com.zend.ide.desktop.e.o;

import com.zend.ide.d.nb;
import com.zend.ide.desktop.cj;
import com.zend.ide.h.be;
import com.zend.ide.l.k;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.util.c.m;
import com.zend.ide.w.a.bc;
import com.zend.ide.w.a.d;
import com.zend.ide.w.fb;
import com.zend.ide.w.h;
import com.zend.ide.w.kb;
import com.zend.ide.w.l;
import com.zend.ide.w.o;
import com.zend.ide.w.p;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.JMenu;

public class f extends com.zend.ide.w.f
  implements k, p
{
  private o b;
  private d c;
  private boolean d = false;
  private v e;
  private h f;
  private com.zend.ide.w.i g;
  private fb j;
  private kb k;
  private Action h = new com.zend.ide.util.f.i(new m(new t(this)));
  private com.zend.ide.y.a i;

  public f(cj paramcj, d paramd)
  {
    super(paramcj);
    this.c = paramd;
    paramd.a(this);
    this.k = new kb();
    paramd.a(this.k);
    this.e = paramcj.l();
    this.e.a(this);
    paramcj.l().a(new e(this, null));
    this.f = new a(paramd, paramcj.X());
    b();
    b(true);
  }

  private void b()
  {
    ActionMap localActionMap = this.a.X().c().getActionMap();
    localActionMap.put("cvsCheckoutActionKey", this.h);
    com.zend.ide.y.i locali = new com.zend.ide.y.i(this.a.X().c());
    locali.a("vcs.checkout", "cvsCheckoutActionKey", 2);
  }

  public void a(boolean paramBoolean)
  {
    b.a("cvs.enableCvsIntegration").a(new Boolean(paramBoolean));
    JMenu localJMenu = this.a.a("keys.cvs");
    if (localJMenu != null)
      localJMenu.setVisible(paramBoolean);
    if (this.d == paramBoolean)
      return;
    this.d = paramBoolean;
    if (paramBoolean)
    {
      if (this.e.e())
      {
        this.f.a(true);
        this.g.a(true);
        this.j = new fb(this.c, this.e.f(), (be)this.e.h());
        this.j.c();
        this.k.a(this.j);
      }
    }
    else if (this.e.e())
    {
      this.f.a(false);
      this.g.a(false);
      this.j.d();
      this.j = null;
    }
  }

  public com.zend.ide.y.a a()
  {
    if (this.i == null)
      this.i = new nb();
    return this.i;
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
      this.a.a("keys.cvs*keys.checkout", this.h, "default", false);
    else
      this.a.a("keys.cvs*keys.checkout", "default", false);
    this.h.setEnabled(paramBoolean);
  }

  private boolean c()
  {
    return this.d;
  }

  private o d()
  {
    if (this.b == null)
      this.b = this.a.a().g();
    return this.b;
  }

  public void a()
  {
    d().a();
  }

  public Object m()
  {
    return this.c.g();
  }

  public void a(Object paramObject)
  {
    this.c.a(paramObject);
  }

  public boolean b(Object paramObject)
  {
    return false;
  }

  public Object b()
  {
    return "CVS";
  }

  public Object d()
  {
    return new bc();
  }

  public boolean a(boolean paramBoolean)
  {
    if (this.j != null)
      this.j.b();
    return true;
  }

  static v a(f paramf)
  {
    return paramf.e;
  }

  static com.zend.ide.w.i a(f paramf, com.zend.ide.w.i parami)
  {
    return paramf.g = parami;
  }

  static d b(f paramf)
  {
    return paramf.c;
  }

  static boolean c(f paramf)
  {
    return paramf.c();
  }

  static h d(f paramf)
  {
    return paramf.f;
  }

  static com.zend.ide.w.i e(f paramf)
  {
    return paramf.g;
  }

  static fb a(f paramf, fb paramfb)
  {
    return paramf.j = paramfb;
  }

  static fb a(f paramf)
  {
    return paramf.j;
  }

  static kb b(f paramf)
  {
    return paramf.k;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.f
 * JD-Core Version:    0.6.0
 */