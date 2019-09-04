package com.zend.ide.o;

import com.zend.ide.bc.a;
import com.zend.ide.p.bc;
import com.zend.ide.p.bw;
import com.zend.ide.p.k;
import com.zend.ide.p.l;
import com.zend.ide.p.v;
import java.beans.PropertyChangeListener;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.SwingUtilities;

public class fn extends bc
  implements com.zend.ide.util.cu, com.zend.ide.k.e
{
  private static final Icon g = com.zend.ide.util.cv.b("go16.gif");
  private static final Icon h = com.zend.ide.util.cv.b("stopdebugger16.gif");
  private static final Icon i = com.zend.ide.util.cv.b("toggledebugmessages16.gif");
  private static l j = new cx();
  private static l k = new cw();
  private static l l = new cy();
  private static l m = new cr();
  private static l f = new cd();
  private PropertyChangeListener n = new cu(this, null);
  private PropertyChangeListener o = new ct(this, null);
  private PropertyChangeListener p = new cv(this, null);
  private PropertyChangeListener q = new cb(this, null);
  private PropertyChangeListener v = new cc(this, null);
  private com.zend.ide.k.f r;
  private com.zend.ide.y.e s;
  private fk t;
  private cl u;

  public fn(fk paramfk)
  {
    this.t = paramfk;
    this.u = new cl(this);
    paramfk.a(this.u);
    p();
    a.a(this, "DEBUG_MESSAGES");
  }

  private void p()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.s = new com.zend.ide.y.e(localf);
    localf.a("debugging.startEndFilter", this.n);
    localf.a("debugging.noticesdFilter", this.o);
    localf.a("debugging.warningFilter", this.p);
    localf.a("debugging.errorFilter", this.q);
    localf.a("debugging.strictFilter", this.v);
    this.s.a("debugging.startEndFilter");
    this.s.a("debugging.noticesdFilter");
    this.s.a("debugging.warningFilter");
    this.s.a("debugging.errorFilter");
    this.s.a("debugging.strictFilter");
  }

  public void b(Object paramObject)
  {
    SwingUtilities.invokeLater(new cq(this, paramObject));
  }

  protected void a(Object paramObject)
  {
    if ((paramObject instanceof bh))
    {
      bh localbh = (bh)paramObject;
      this.t.b(localbh.c(), localbh.d());
    }
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
      b(j);
    else
      a(j);
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
      b(k);
    else
      a(k);
  }

  private void c(boolean paramBoolean)
  {
    if (paramBoolean)
      b(l);
    else
      a(l);
  }

  private void e(boolean paramBoolean)
  {
    if (paramBoolean)
      b(m);
    else
      a(m);
  }

  private void f(boolean paramBoolean)
  {
    if (paramBoolean)
      b(f);
    else
      a(f);
  }

  protected bw a()
  {
    return new fj(this);
  }

  public com.zend.ide.k.f x()
  {
    if (this.r == null)
      this.r = new dh(this);
    return this.r;
  }

  protected v n()
  {
    return new fe(this);
  }

  static void a(fn paramfn, Object paramObject)
  {
    paramfn.b(paramObject);
  }

  static bw a(fn paramfn)
  {
    return paramfn.e;
  }

  static bw b(fn paramfn)
  {
    return paramfn.e;
  }

  static Icon a()
  {
    return g;
  }

  static k d(fn paramfn, Object paramObject, Icon paramIcon)
  {
    return paramfn.a(paramObject, paramIcon);
  }

  static Icon b()
  {
    return h;
  }

  static k a(fn paramfn, Object paramObject, Icon paramIcon)
  {
    return paramfn.a(paramObject, paramIcon);
  }

  static k b(fn paramfn, Object paramObject, Icon paramIcon)
  {
    return paramfn.a(paramObject, paramIcon);
  }

  static k c(fn paramfn, Object paramObject, Icon paramIcon)
  {
    return paramfn.a(paramObject, paramIcon);
  }

  static bw c(fn paramfn)
  {
    return paramfn.e;
  }

  static Icon c()
  {
    return i;
  }

  static bw d(fn paramfn)
  {
    return paramfn.e;
  }

  static bw e(fn paramfn)
  {
    return paramfn.e;
  }

  static bw f(fn paramfn)
  {
    return paramfn.e;
  }

  static bw g(fn paramfn)
  {
    return paramfn.e;
  }

  static bw h(fn paramfn)
  {
    return paramfn.e;
  }

  static bw i(fn paramfn)
  {
    return paramfn.e;
  }

  static bw j(fn paramfn)
  {
    return paramfn.e;
  }

  static bw k(fn paramfn)
  {
    return paramfn.e;
  }

  static bw l(fn paramfn)
  {
    return paramfn.e;
  }

  static bw m(fn paramfn)
  {
    return paramfn.e;
  }

  static bw n(fn paramfn)
  {
    return paramfn.e;
  }

  static bw o(fn paramfn)
  {
    return paramfn.e;
  }

  static DefaultListModel p(fn paramfn)
  {
    return paramfn.e();
  }

  static void d(fn paramfn, boolean paramBoolean)
  {
    paramfn.a(paramBoolean);
  }

  static void e(fn paramfn, boolean paramBoolean)
  {
    paramfn.b(paramBoolean);
  }

  static void a(fn paramfn, boolean paramBoolean)
  {
    paramfn.c(paramBoolean);
  }

  static void b(fn paramfn, boolean paramBoolean)
  {
    paramfn.e(paramBoolean);
  }

  static void c(fn paramfn, boolean paramBoolean)
  {
    paramfn.f(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fn
 * JD-Core Version:    0.6.0
 */