package com.zend.ide.desktop.e.p;

import com.zend.ide.h.bf;
import com.zend.ide.h.e;
import com.zend.ide.util.c.m;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;

class c
  implements com.zend.ide.w.i
{
  private com.zend.ide.w.c.d a;
  private e b;
  private boolean c = false;
  private d d;
  private Action e;
  private Action f;
  private Action g;
  private Action h;
  private Action i;
  private Action j;
  private Action k;
  private Action l;
  private Action m;
  private v n;
  private p o;
  private q p;
  private w q;
  private r r;
  private s s;
  private t t;
  private u u;
  private com.zend.ide.y.i v;

  public c(com.zend.ide.w.c.d paramd, e parame)
  {
    this.a = paramd;
    this.b = parame;
    this.d = new d(this);
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
    this.n = new v(this);
    this.o = new p(this);
    this.p = new q(this);
    this.q = new w(this);
    this.r = new r(this);
    this.s = new s(this);
    this.t = new t(this);
    this.u = new u(this);
    this.e = new com.zend.ide.util.f.i(new m(new qb(this)));
    this.f = new com.zend.ide.util.f.i(new m(new jb(this)));
    this.g = new com.zend.ide.util.f.i(new m(new ib(this)));
    this.h = new com.zend.ide.util.f.i(new m(new lb(this)));
    this.i = new com.zend.ide.util.f.i(new m(new pb(this)));
    this.j = new com.zend.ide.util.f.i(new m(new mb(this)));
    this.k = new com.zend.ide.util.f.i(new m(new kb(this)));
    this.m = new com.zend.ide.util.f.i(new m(new ob(this)));
    this.l = new com.zend.ide.util.f.i(new m(new nb(this)));
    this.n.b(this.i);
    this.q.b(this.e);
    this.p.b(this.f);
    this.o.b(this.g);
    this.r.b(this.h);
    this.s.b(this.j);
    this.s.b(this.k);
    this.t.b(this.l);
    this.u.b(this.m);
  }

  private void b()
  {
    com.zend.ide.util.s locals = (com.zend.ide.util.s)this.b.q();
    locals.a(this.n);
    locals.a(this.o);
    locals.a(this.p);
    locals.a(this.q);
    locals.a(this.r);
    locals.a(this.s);
    locals.a(this.t);
    locals.a(this.u);
    locals.a("keys.svn*keys.update", this.e, "file", true);
    locals.a("keys.svn*keys.update", this.e, "directory", true);
    locals.a("keys.svn*keys.update", this.e, "multipleSelection", true);
    locals.a("keys.svn*keys.update", this.e, "root", true);
    locals.a("keys.svn*keys.commit", this.f, "file", true);
    locals.a("keys.svn*keys.commit", this.f, "directory", true);
    locals.a("keys.svn*keys.commit", this.f, "multipleSelection", true);
    locals.a("keys.svn*keys.commit", this.f, "root", true);
    locals.a("keys.svn*keys.add", this.g, "file", true);
    locals.a("keys.svn*keys.add", this.g, "directory", true);
    locals.a("keys.svn*keys.add", this.g, "multipleSelection", true);
    locals.a("keys.svn*keys.add", this.g, "root", true);
    locals.a("keys.svn*keys.resolve", this.l, "file", true);
    locals.a("keys.svn*keys.resolve", this.l, "directory", true);
    locals.a("keys.svn*keys.resolve", this.l, "multipleSelection", true);
    locals.a("keys.svn*keys.resolve", this.l, "root", true);
    locals.a("keys.svn*keys.revert", this.m, "file", true);
    locals.a("keys.svn*keys.revert", this.m, "directory", true);
    locals.a("keys.svn*keys.revert", this.m, "multipleSelection", true);
    locals.a("keys.svn*keys.revert", this.m, "root", true);
    locals.a("keys.svn*keys.delete", this.k, "file", true);
    locals.a("keys.svn*keys.delete", this.k, "directory", true);
    locals.a("keys.svn*keys.delete", this.k, "multipleSelection", true);
    locals.a("keys.svn*keys.delete", this.k, "root", true);
    locals.a("keys.svn*keys.status", this.i, "file", true);
    locals.a("keys.svn*keys.status", this.i, "directory", true);
    locals.a("keys.svn*keys.status", this.i, "multipleSelection", true);
    locals.a("keys.svn*keys.status", this.i, "root", true);
    locals.a("keys.svn*keys.diff", this.h, "file", true);
    locals.a("keys.svn*keys.diff", this.h, "root", true);
    locals.a("keys.svn*keys.log", this.j, "file", true);
    locals.a("keys.svn*keys.log", this.j, "root", true);
    locals.a("keys.svn*keys.log", this.i, "directory", true);
    ((bf)this.b).addTreeSelectionListener(this.d);
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
    localActionMap.put("svnStatusActionKey", this.i);
    localActionMap.put("svnDiffActionKey", this.h);
    localActionMap.put("svnLogActionKey", this.j);
    localActionMap.put("svnDeleteActionKey", this.k);
    localActionMap.put("svnResolveActionKey", this.l);
    localActionMap.put("svnRevertActionKey", this.m);
    this.v = new com.zend.ide.y.i(this.b.c());
    this.v.a("vcs.update", "svnUpdateActionKey", 0);
    this.v.a("vcs.commit", "svnCommitActionKey", 0);
    this.v.a("vcs.add", "svnAddActionKey", 0);
    this.v.a("vcs.status", "svnStatusActionKey", 0);
    this.v.a("vcs.log", "svnLogActionKey", 0);
    this.v.a("vcs.diff", "svnDiffActionKey", 0);
  }

  private void c()
  {
    ((bf)this.b).removeTreeSelectionListener(this.d);
    com.zend.ide.util.s locals = (com.zend.ide.util.s)this.b.q();
    locals.b(this.n);
    locals.b(this.o);
    locals.b(this.p);
    locals.b(this.q);
    locals.b(this.r);
    locals.b(this.s);
    locals.b(this.t);
    locals.b(this.u);
    locals.a("keys.svn*keys.update", "file", true);
    locals.a("keys.svn*keys.update", "directory", true);
    locals.a("keys.svn*keys.update", "multipleSelection", true);
    locals.a("keys.svn*keys.update", "root", true);
    locals.a("keys.svn*keys.commit", "file", true);
    locals.a("keys.svn*keys.commit", "directory", true);
    locals.a("keys.svn*keys.commit", "multipleSelection", true);
    locals.a("keys.svn*keys.commit", "root", true);
    locals.a("keys.svn*keys.add", "file", true);
    locals.a("keys.svn*keys.add", "directory", true);
    locals.a("keys.svn*keys.add", "multipleSelection", true);
    locals.a("keys.svn*keys.add", "root", true);
    locals.a("keys.svn*keys.delete", "file", true);
    locals.a("keys.svn*keys.delete", "directory", true);
    locals.a("keys.svn*keys.delete", "multipleSelection", true);
    locals.a("keys.svn*keys.delete", "root", true);
    locals.a("keys.svn*keys.resolve", "file", true);
    locals.a("keys.svn*keys.resolve", "directory", true);
    locals.a("keys.svn*keys.resolve", "multipleSelection", true);
    locals.a("keys.svn*keys.resolve", "root", true);
    locals.a("keys.svn*keys.revert", "file", true);
    locals.a("keys.svn*keys.revert", "directory", true);
    locals.a("keys.svn*keys.revert", "multipleSelection", true);
    locals.a("keys.svn*keys.revert", "root", true);
    locals.a("keys.svn*keys.status", "file", true);
    locals.a("keys.svn*keys.status", "directory", true);
    locals.a("keys.svn*keys.status", "multipleSelection", true);
    locals.a("keys.svn*keys.status", "root", true);
    locals.a("keys.svn*keys.diff", "file", true);
    locals.a("keys.svn*keys.diff", "root", true);
    locals.a("keys.svn*keys.log", "file", true);
    locals.a("keys.svn*keys.log", "root", true);
    locals.a("keys.svn*keys.log", "directory", true);
    this.v.a("vcs.update");
    this.v.a("vcs.commit");
    this.v.a("vcs.add");
    this.v.a("vcs.status");
    this.v.a("vcs.log");
    this.v.a("vcs.diff");
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

  static void a(c paramc)
  {
    paramc.d();
  }

  static e b(c paramc)
  {
    return paramc.b;
  }

  static com.zend.ide.w.c.d c(c paramc)
  {
    return paramc.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.p.c
 * JD-Core Version:    0.6.0
 */