package com.zend.ide.desktop;

import com.zend.ide.bd.c;
import com.zend.ide.be.d;
import com.zend.ide.be.i;
import com.zend.ide.be.l;
import com.zend.ide.h.e;
import com.zend.ide.l.g;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.p.b.a;
import com.zend.ide.util.bp;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.dr;
import com.zend.ide.util.r;
import com.zend.ide.util.s;
import java.awt.Rectangle;
import javax.swing.Action;
import javax.swing.ImageIcon;

public class bx
  implements r, cu
{
  private v a;
  private cj b;
  private a c = new a("Loading...", false, false, 0.0F, "");
  private a g = new a("Saving...", false, false, 0.0F, "");
  private l d;
  private ib e = new ib(this, null);
  private hb f;

  public bx(cj paramcj)
  {
    this.b = paramcj;
    this.a = b();
    c();
    d();
    e();
    this.f = new hb(this, null);
    paramcj.X().a(this.f);
    paramcj.v().a(paramcj);
    this.a.a(paramcj);
    g();
  }

  public v f()
  {
    return this.a;
  }

  private v b()
  {
    g localg = new g();
    bp.a(localg);
    localg.a(new ce(this, null));
    return localg;
  }

  private void c()
  {
    s locals = (s)f().q();
    Action localAction = locals.a("keys.newProject");
    this.b.a("keys.newProject", localAction, "default", false);
    localAction = locals.a("keys.openProject");
    this.b.a("keys.openProject", localAction, "default", false);
    localAction = locals.a("keys.saveProject");
    this.b.a("keys.saveProject", localAction, "default", false);
    localAction = locals.a("keys.closeProject");
    this.b.a("keys.closeProject", localAction, "default", false);
    localAction = locals.a("keys.checkIncludes");
    this.b.a("keys.checkIncludes", localAction, "default", false);
    localAction = locals.a("keys.rename");
    this.b.a("keys.renameProject", localAction, "default", false);
    localAction = locals.a("keys.addExistingToProject");
    this.b.a("keys.addExistingToProject", localAction, "default", false);
    localAction = locals.a("keys.encodeProject");
    this.b.a("keys.encodeProject", localAction, "default", false);
    localAction = locals.a("keys.showProjectProperties");
    this.b.a("keys.showProjectProperties", localAction, "default", false);
  }

  private void d()
  {
    s locals1 = (s)this.b.v().q();
    Object localObject = new dq(this);
    cl localcl = new cl(this);
    locals1.a(localcl);
    cj tmp47_44 = this.b;
    tmp47_44.getClass();
    localObject = new dr(tmp47_44, (Action)localObject, localcl);
    locals1.a("keys.addToProject", (Action)localObject, "root", true);
    locals1.a("keys.addToProject", (Action)localObject, "directory", true);
    locals1.a("keys.addToProject", (Action)localObject, "file", true);
    locals1.a("keys.addToProject", (Action)localObject, "multipleSelection", true);
    s locals2 = (s)f().q();
    localObject = locals2.a("keys.openProject");
    locals1.a("keys.openProject", (Action)localObject, "filesystem", true);
    localObject = locals2.a("keys.newProject");
    locals1.a("keys.newProject", (Action)localObject, "filesystem", true);
  }

  private void e()
  {
    s locals = (s)this.b.X().q();
    jb localjb = new jb(this);
    this.e.b(localjb);
    locals.a("keys.addToProject", localjb, "editor", true);
    locals.a("keys.addToProject", localjb, "textComponent", true);
    this.b.a("keys.addToProject", localjb, "default", false);
  }

  private void g()
  {
    d locald = c.b().c();
    i locali = new i(true, false, 3, 1.0D, 0, new Rectangle(50, 50, 200, 300));
    ImageIcon localImageIcon = cv.b("explorer/explorer16.gif");
    this.d = locald.a(ct.a(1252), localImageIcon, null, false, locali);
    locald.a("FileManagerWindowID", this.d);
    this.d.a(ct.a(1253), localImageIcon, this.b.v().c(), null, "FILE_SYSTEM");
    localImageIcon = cv.b("project16.gif");
    this.d.a(ct.a(208), localImageIcon, this.a.c(), null, "PROJECT");
    if ((this.a instanceof g))
      this.d.a(ct.a(208), "projectName", ((g)this.a).a());
  }

  static cj b(bx parambx)
  {
    return parambx.b;
  }

  static v d(bx parambx)
  {
    return parambx.a;
  }

  static l c(bx parambx)
  {
    return parambx.d;
  }

  static a a(bx parambx)
  {
    return parambx.c;
  }

  static ib b(bx parambx)
  {
    return parambx.e;
  }

  static a b(bx parambx)
  {
    return parambx.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bx
 * JD-Core Version:    0.6.0
 */