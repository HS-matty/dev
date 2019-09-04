package com.zend.ide.desktop.e.o;

import com.zend.ide.h.bf;
import com.zend.ide.h.e;
import com.zend.ide.util.s;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;

class c
  implements com.zend.ide.w.i
{
  private com.zend.ide.w.a.d a;
  private e b;
  private boolean c = false;
  private d d;
  private Action e;
  private Action f;
  private Action g;
  private Action h;
  private Action i;
  private Action j;
  private m k;
  private k l;
  private l m;
  private com.zend.ide.y.i n;

  public c(com.zend.ide.w.a.d paramd, e parame)
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
    this.k = new m(this);
    this.l = new k(this);
    this.m = new l(this);
    this.e = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new z(this)));
    this.f = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new v(this)));
    this.g = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new u(this)));
    this.h = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new w(this)));
    this.i = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new y(this)));
    this.j = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new x(this)));
    this.k.b(this.e);
    this.k.b(this.f);
    this.l.b(this.g);
    this.m.b(this.h);
    this.k.b(this.j);
    this.k.b(this.i);
  }

  private void b()
  {
    s locals = (s)this.b.q();
    locals.a(this.k);
    locals.a(this.l);
    locals.a(this.m);
    locals.a("keys.cvs*keys.update", this.e, "file", true);
    locals.a("keys.cvs*keys.update", this.e, "directory", true);
    locals.a("keys.cvs*keys.update", this.e, "multipleSelection", true);
    locals.a("keys.cvs*keys.update", this.e, "root", true);
    locals.a("keys.cvs*keys.commit", this.f, "file", true);
    locals.a("keys.cvs*keys.commit", this.f, "directory", true);
    locals.a("keys.cvs*keys.commit", this.f, "multipleSelection", true);
    locals.a("keys.cvs*keys.commit", this.f, "root", true);
    locals.a("keys.cvs*keys.add", this.g, "file", true);
    locals.a("keys.cvs*keys.add", this.g, "directory", true);
    locals.a("keys.cvs*keys.add", this.g, "multipleSelection", true);
    locals.a("keys.cvs*keys.add", this.g, "root", true);
    locals.a("keys.cvs*keys.status", this.i, "file", true);
    locals.a("keys.cvs*keys.status", this.i, "directory", true);
    locals.a("keys.cvs*keys.status", this.i, "multipleSelection", true);
    locals.a("keys.cvs*keys.status", this.i, "root", true);
    locals.a("keys.cvs*keys.diff", this.h, "file", true);
    locals.a("keys.cvs*keys.diff", this.h, "root", true);
    locals.a("keys.cvs*keys.log", this.j, "file", true);
    locals.a("keys.cvs*keys.log", this.j, "root", true);
    locals.a("keys.cvs*keys.log", this.j, "directory", true);
    ((bf)this.b).addTreeSelectionListener(this.d);
    this.k.c();
    this.l.c();
    this.m.c();
    ActionMap localActionMap = this.b.c().getActionMap();
    localActionMap.put("cvsUpdateActionKey", this.e);
    localActionMap.put("cvsCommitActionKey", this.f);
    localActionMap.put("cvsAddActionKey", this.g);
    localActionMap.put("cvsStatusActionKey", this.i);
    localActionMap.put("cvsDiffActionKey", this.h);
    localActionMap.put("cvsLogActionKey", this.j);
    this.n = new com.zend.ide.y.i(this.b.c());
    this.n.a("vcs.update", "cvsUpdateActionKey", 0);
    this.n.a("vcs.commit", "cvsCommitActionKey", 0);
    this.n.a("vcs.add", "cvsAddActionKey", 0);
    this.n.a("vcs.status", "cvsStatusActionKey", 0);
    this.n.a("vcs.diff", "cvsDiffActionKey", 0);
    this.n.a("vcs.log", "cvsLogActionKey", 0);
  }

  private void c()
  {
    ((bf)this.b).removeTreeSelectionListener(this.d);
    s locals = (s)this.b.q();
    locals.b(this.k);
    locals.b(this.l);
    locals.b(this.m);
    locals.a("keys.cvs*keys.update", "file", true);
    locals.a("keys.cvs*keys.update", "directory", true);
    locals.a("keys.cvs*keys.update", "multipleSelection", true);
    locals.a("keys.cvs*keys.update", "root", true);
    locals.a("keys.cvs*keys.commit", "file", true);
    locals.a("keys.cvs*keys.commit", "directory", true);
    locals.a("keys.cvs*keys.commit", "multipleSelection", true);
    locals.a("keys.cvs*keys.commit", "root", true);
    locals.a("keys.cvs*keys.add", "file", true);
    locals.a("keys.cvs*keys.add", "directory", true);
    locals.a("keys.cvs*keys.add", "multipleSelection", true);
    locals.a("keys.cvs*keys.add", "root", true);
    locals.a("keys.cvs*keys.status", "file", true);
    locals.a("keys.cvs*keys.status", "directory", true);
    locals.a("keys.cvs*keys.status", "multipleSelection", true);
    locals.a("keys.cvs*keys.status", "root", true);
    locals.a("keys.cvs*keys.diff", "file", true);
    locals.a("keys.cvs*keys.diff", "root", true);
    locals.a("keys.cvs*keys.log", "file", true);
    locals.a("keys.cvs*keys.log", "root", true);
    locals.a("keys.cvs*keys.log", "directory", true);
    this.n.a("vcs.update");
    this.n.a("vcs.commit");
    this.n.a("vcs.add");
    this.n.a("vcs.status");
    this.n.a("vcs.diff");
    this.n.a("vcs.log");
  }

  private void d()
  {
    this.k.c();
    this.l.c();
    this.m.c();
  }

  static void a(c paramc)
  {
    paramc.d();
  }

  static e b(c paramc)
  {
    return paramc.b;
  }

  static com.zend.ide.w.a.d c(c paramc)
  {
    return paramc.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.o.c
 * JD-Core Version:    0.6.0
 */