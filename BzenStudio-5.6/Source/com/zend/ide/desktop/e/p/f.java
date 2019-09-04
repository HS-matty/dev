package com.zend.ide.desktop.e.p;

import com.zend.ide.d.ob;
import com.zend.ide.desktop.cj;
import com.zend.ide.h.be;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.util.c.m;
import com.zend.ide.w.c.d;
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
  implements com.zend.ide.l.k, p
{
  private com.zend.ide.y.a b;
  private v c;
  private d d;
  private h e;
  private com.zend.ide.w.i f;
  private fb j;
  private kb k;
  private Action g;
  private boolean h;
  private o i;

  public f(cj paramcj, d paramd)
  {
    super(paramcj);
    this.d = paramd;
    paramd.a(this);
    this.k = new kb();
    paramd.a(this.k);
    this.g = new com.zend.ide.util.f.i(new m(com.zend.ide.w.c.e.a(paramd, "Checkout", null)));
    this.c = paramcj.l();
    this.c.a(this);
    paramcj.l().a(new e(this, null));
    this.e = new a(paramd, paramcj.X());
    b();
    b(true);
  }

  private void b()
  {
    ActionMap localActionMap = this.a.X().c().getActionMap();
    localActionMap.put("svnCheckoutActionKey", this.g);
    com.zend.ide.y.i locali = new com.zend.ide.y.i(this.a.X().c());
    locali.a("vcs.checkout", "svnCheckoutActionKey", 2);
  }

  public void a(boolean paramBoolean)
  {
    b.a("svn.enableSubversionIntegration").a(new Boolean(paramBoolean));
    JMenu localJMenu = this.a.a("keys.svn");
    if (localJMenu != null)
      localJMenu.setVisible(paramBoolean);
    if (this.h == paramBoolean)
      return;
    this.h = paramBoolean;
    if (paramBoolean)
    {
      if (this.c.e())
      {
        this.e.a(true);
        this.f.a(true);
        this.j = new fb(this.d, this.c.f(), (be)this.c.h());
        this.j.c();
      }
    }
    else if (this.c.e())
    {
      this.e.a(false);
      this.f.a(false);
      this.j.d();
      this.j = null;
    }
  }

  private void b(boolean paramBoolean)
  {
    if (paramBoolean)
      this.a.a("keys.svn*keys.checkout", this.g, "default", false);
    else
      this.a.a("keys.svn*keys.checkout", "default", false);
    this.g.setEnabled(paramBoolean);
  }

  private boolean c()
  {
    return this.h;
  }

  public com.zend.ide.y.a a()
  {
    if (this.b == null)
      this.b = new ob();
    return this.b;
  }

  public Object m()
  {
    return this.d.c();
  }

  public void a(Object paramObject)
  {
    this.d.a(paramObject);
  }

  public boolean b(Object paramObject)
  {
    return false;
  }

  public Object b()
  {
    return "Subversion";
  }

  public Object d()
  {
    return new com.zend.ide.w.c.k();
  }

  public boolean a(boolean paramBoolean)
  {
    if (this.j != null)
      this.j.b();
    return true;
  }

  public void a()
  {
    d().a();
  }

  private o d()
  {
    if (this.i == null)
      this.i = this.a.a().g();
    return this.i;
  }

  static v a(f paramf)
  {
    return paramf.c;
  }

  static com.zend.ide.w.i a(f paramf, com.zend.ide.w.i parami)
  {
    return paramf.f = parami;
  }

  static d b(f paramf)
  {
    return paramf.d;
  }

  static boolean c(f paramf)
  {
    return paramf.c();
  }

  static h d(f paramf)
  {
    return paramf.e;
  }

  static com.zend.ide.w.i e(f paramf)
  {
    return paramf.f;
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
 * Qualified Name:     com.zend.ide.desktop.e.p.f
 * JD-Core Version:    0.6.0
 */