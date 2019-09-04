package com.zend.ide.desktop.e.p;

import com.zend.ide.n.bw;
import com.zend.ide.util.s;
import com.zend.ide.w.c.d;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;

class a
  implements com.zend.ide.w.h
{
  private d a;
  private bw b;
  private boolean c = false;
  private g d;
  private Action e;
  private Action f;
  private Action g;
  private Action h;
  private Action i;
  private Action j;
  private Action k;
  private Action l;
  private Action m;
  private n n;
  private h o;
  private i p;
  private o q;
  private j r;
  private k s;
  private l t;
  private m u;
  private com.zend.ide.y.i v;

  public a(d paramd, bw parambw)
  {
    this.a = paramd;
    this.b = parambw;
    this.d = new g(this);
    a();
  }

  public void a(boolean paramBoolean)
  {
    if (this.c == paramBoolean)
      return;
    this.c = paramBoolean;
    if (paramBoolean)
      b();
    else
      c();
  }

  private void a()
  {
    this.n = new n(this);
    this.o = new h(this);
    this.p = new i(this);
    this.q = new o(this);
    this.r = new j(this);
    this.s = new k(this);
    this.t = new l(this);
    this.u = new m(this);
    this.e = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new gb(this)));
    this.f = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new z(this)));
    this.g = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new y(this)));
    this.i = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new bb(this)));
    this.j = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new fb(this)));
    this.h = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new cb(this)));
    this.k = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new ab(this)));
    this.m = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new eb(this)));
    this.l = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new db(this)));
    this.n.b(this.j);
    this.q.b(this.e);
    this.p.b(this.f);
    this.o.b(this.g);
    this.r.b(this.i);
    this.s.b(this.h);
    this.s.b(this.k);
    this.t.b(this.l);
    this.u.b(this.m);
  }

  private void b()
  {
    s locals = (s)this.b.q();
    locals.a(this.n);
    locals.a(this.o);
    locals.a(this.p);
    locals.a(this.q);
    locals.a(this.r);
    locals.a(this.s);
    locals.a(this.t);
    locals.a(this.u);
    locals.a("keys.svn*keys.update", this.e, "textComponent", true);
    locals.a("keys.svn*keys.commit", this.f, "textComponent", true);
    locals.a("keys.svn*keys.add", this.g, "textComponent", true);
    locals.a("keys.svn*keys.diff", this.i, "textComponent", true);
    locals.a("keys.svn*keys.status", this.j, "textComponent", true);
    locals.a("keys.svn*keys.log", this.h, "textComponent", true);
    locals.a("keys.svn*keys.resolve", this.l, "textComponent", true);
    locals.a("keys.svn*keys.revert", this.m, "textComponent", true);
    locals.a("keys.svn*keys.delete", this.k, "textComponent", true);
    this.b.a(this.d);
    this.n.c();
    this.o.c();
    this.p.c();
    this.q.c();
    this.r.c();
    this.s.c();
    this.t.c();
    this.u.c();
    ActionMap localActionMap = this.b.c().getActionMap();
    localActionMap.put("svnUpdateActionKey", this.e);
    localActionMap.put("svnCommitActionKey", this.f);
    localActionMap.put("svnAddActionKey", this.g);
    localActionMap.put("svnStatusActionKey", this.j);
    localActionMap.put("svnDiffActionKey", this.i);
    localActionMap.put("svnLogActionKey", this.h);
    localActionMap.put("svnDeleteActionKey", this.k);
    localActionMap.put("svnResolveActionKey", this.l);
    localActionMap.put("svnRevertActionKey", this.m);
    this.v = new com.zend.ide.y.i(this.b.c());
    this.v.a("vcs.update", "svnUpdateActionKey", 2);
    this.v.a("vcs.commit", "svnCommitActionKey", 2);
    this.v.a("vcs.add", "svnAddActionKey", 2);
    this.v.a("vcs.status", "svnStatusActionKey", 2);
    this.v.a("vcs.diff", "svnDiffActionKey", 2);
    this.v.a("vcs.log", "svnLogActionKey", 2);
  }

  private void c()
  {
    this.b.b(this.d);
    s locals = (s)this.b.q();
    locals.b(this.n);
    locals.b(this.o);
    locals.b(this.p);
    locals.b(this.q);
    locals.b(this.r);
    locals.b(this.s);
    locals.b(this.t);
    locals.b(this.u);
    locals.a("keys.svn*keys.update", "textComponent", true);
    locals.a("keys.svn*keys.commit", "textComponent", true);
    locals.a("keys.svn*keys.add", "textComponent", true);
    locals.a("keys.svn*keys.diff", "textComponent", true);
    locals.a("keys.svn*keys.status", "textComponent", true);
    locals.a("keys.svn*keys.log", "textComponent", true);
    locals.a("keys.svn*keys.delete", "textComponent", true);
    locals.a("keys.svn*keys.resolve", "textComponent", true);
    locals.a("keys.svn*keys.revert", "textComponent", true);
    this.v.a("vcs.update");
    this.v.a("vcs.commit");
    this.v.a("vcs.add");
    this.v.a("vcs.status");
    this.v.a("vcs.diff");
    this.v.a("vcs.log");
  }

  private void d()
  {
    this.n.c();
    this.o.c();
    this.p.c();
    this.q.c();
    this.r.c();
    this.s.c();
    this.t.c();
    this.u.c();
  }

  static void a(a parama)
  {
    parama.d();
  }

  static bw b(a parama)
  {
    return parama.b;
  }

  static d c(a parama)
  {
    return parama.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.a
 * JD-Core Version:    0.6.0
 */