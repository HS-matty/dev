package com.zend.ide.desktop.e.o;

import com.zend.ide.n.bw;
import com.zend.ide.util.c.m;
import com.zend.ide.w.a.d;
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
  private j k;
  private h l;
  private i m;
  private com.zend.ide.y.i n;

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
    this.k = new j(this);
    this.l = new h(this);
    this.m = new i(this);
    this.e = new com.zend.ide.util.f.i(new m(new s(this)));
    this.f = new com.zend.ide.util.f.i(new m(new o(this)));
    this.g = new com.zend.ide.util.f.i(new m(new n(this)));
    this.i = new com.zend.ide.util.f.i(new m(new p(this)));
    this.j = new com.zend.ide.util.f.i(new m(new r(this)));
    this.h = new com.zend.ide.util.f.i(new m(new q(this)));
    this.k.b(this.e);
    this.k.b(this.f);
    this.l.b(this.g);
    this.m.b(this.i);
    this.m.b(this.h);
    this.k.b(this.j);
  }

  private void b()
  {
    com.zend.ide.util.s locals = (com.zend.ide.util.s)this.b.q();
    locals.a(this.k);
    locals.a(this.l);
    locals.a(this.m);
    locals.a("keys.cvs*keys.update", this.e, "textComponent", true);
    locals.a("keys.cvs*keys.commit", this.f, "textComponent", true);
    locals.a("keys.cvs*keys.add", this.g, "textComponent", true);
    locals.a("keys.cvs*keys.diff", this.i, "textComponent", true);
    locals.a("keys.cvs*keys.status", this.j, "textComponent", true);
    locals.a("keys.cvs*keys.log", this.h, "textComponent", true);
    this.b.a(this.d);
    this.k.c();
    this.l.c();
    this.m.c();
    ActionMap localActionMap = this.b.c().getActionMap();
    localActionMap.put("cvsUpdateActionKey", this.e);
    localActionMap.put("cvsCommitActionKey", this.f);
    localActionMap.put("cvsAddActionKey", this.g);
    localActionMap.put("cvsStatusActionKey", this.j);
    localActionMap.put("cvsDiffActionKey", this.i);
    localActionMap.put("cvsLogActionKey", this.h);
    this.n = new com.zend.ide.y.i(this.b.c());
    this.n.a("vcs.update", "cvsUpdateActionKey", 2);
    this.n.a("vcs.commit", "cvsCommitActionKey", 2);
    this.n.a("vcs.add", "cvsAddActionKey", 2);
    this.n.a("vcs.status", "cvsStatusActionKey", 2);
    this.n.a("vcs.diff", "cvsDiffActionKey", 2);
    this.n.a("vcs.log", "cvsLogActionKey", 2);
  }

  private void c()
  {
    this.b.b(this.d);
    com.zend.ide.util.s locals = (com.zend.ide.util.s)this.b.q();
    locals.b(this.k);
    locals.b(this.l);
    locals.b(this.m);
    locals.a("keys.cvs*keys.update", "textComponent", true);
    locals.a("keys.cvs*keys.commit", "textComponent", true);
    locals.a("keys.cvs*keys.add", "textComponent", true);
    locals.a("keys.cvs*keys.diff", "textComponent", true);
    locals.a("keys.cvs*keys.status", "textComponent", true);
    locals.a("keys.cvs*keys.log", "textComponent", true);
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
 * Qualified Name:     com.zend.ide.desktop.e.o.a
 * JD-Core Version:    0.6.0
 */