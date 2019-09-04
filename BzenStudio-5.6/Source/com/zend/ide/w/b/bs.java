package com.zend.ide.w.b;

import com.zend.ide.n.bw;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Point;
import java.beans.PropertyChangeListener;
import java.io.Reader;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class bs extends JPanel
  implements m, cu
{
  private static Random d = new Random();
  private bf a;
  private bf b;
  private br c;
  private l e;
  private z f;
  private bu g;
  private bv h;
  private JPanel i;
  private boolean j;
  private JFrame k;
  private int l;
  private e m;
  private PropertyChangeListener n = new u(this, null);
  private List o;
  private h p;
  private w q;

  public bs()
  {
    this(null, false);
  }

  public bs(JFrame paramJFrame, boolean paramBoolean)
  {
    this.k = paramJFrame;
    this.p = new h();
    this.b = new bf("REPOSITORY", ComponentOrientation.RIGHT_TO_LEFT, false, paramBoolean);
    this.a = new bf("LOCAL", ComponentOrientation.LEFT_TO_RIGHT, false, paramBoolean);
    this.b.a(ct.a(1248));
    this.a.a(ct.a(1247));
    this.e = new l(this.a, this.b, this.p);
    this.e.a(this);
    this.c = new br(this.e, this.b.g(), this.a.g(), this.p);
    this.f = new z(this.e, this.a, this.b);
    f();
    g();
  }

  public JPanel b()
  {
    return this.i;
  }

  public bw c()
  {
    if (this.a == null)
      return null;
    return this.a.f();
  }

  public bw d()
  {
    if (this.b == null)
      return null;
    return this.b.f();
  }

  public h e()
  {
    return this.p;
  }

  public void repaint()
  {
    super.repaint();
    bw localbw = d();
    if (localbw != null)
      localbw.repaint();
    localbw = c();
    if (localbw != null)
      localbw.repaint();
    if (this.c != null)
      this.c.repaint();
  }

  private void f()
  {
    this.g = new bu(this);
    this.h = new bv(this);
    setLayout(new BorderLayout());
    this.i = new JPanel(new n());
    this.i.add(this.b.c(), "left");
    this.i.add(this.c, "divider");
    this.i.add(this.a.c(), "right");
    add(this.g, "South");
    add(this.i);
    add(this.h, "North");
    addComponentListener(new a(this, null));
  }

  private void g()
  {
    f localf = new f();
    this.m = new e(localf);
    localf.a("cvsDiff.diffAppend", this.n);
    localf.a("cvsDiff.diffChange", this.n);
    localf.a("cvsDiff.diffDelete", this.n);
    this.m.a("cvsDiff.diffAppend");
    this.m.a("cvsDiff.diffChange");
    this.m.a("cvsDiff.diffDelete");
  }

  private void h()
  {
    this.p.a((Color)b.a("cvsDiff.diffAppend").c());
    this.p.c((Color)b.a("cvsDiff.diffChange").c());
    this.p.b((Color)b.a("cvsDiff.diffDelete").c());
    if (this.g != null)
      this.g.b();
  }

  private void i()
  {
    if (this.c != null)
      this.c.repaint();
    if (this.a != null)
      this.a.f().repaint();
    if (this.b != null)
      this.b.f().repaint();
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.a(this.c.b());
      this.a.a(this.c.c());
    }
    else
    {
      this.b.b(this.c.b());
      this.a.b(this.c.c());
    }
  }

  public void j()
  {
    if (this.a != null)
      this.a.i();
    if (this.b != null)
      this.b.i();
  }

  public void a(w paramw, Reader paramReader, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.q = paramw;
    int i1 = (paramString1 == null) || (paramString1.trim().equals("")) ? 1 : 0;
    if (i1 == 0)
    {
      this.o = this.q.a(paramString1, paramBoolean);
      this.l = this.o.size();
    }
    if ((i1 != 0) || (this.l == 0))
    {
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(1241), ct.a(1242), 1);
      if (this.k != null)
        this.k.dispose();
      return;
    }
    this.j = true;
    a(paramReader);
    a(false);
    if (this.k != null)
      this.k.setVisible(true);
    this.g.a(this.l);
    this.b.b(this.q.e());
    this.f.d(this.a.h() / 2);
    this.e.a(this.o, this.q.a());
    this.b.a(new Point(0, 0));
    this.a.a(new Point(0, 0));
    this.c.a(this.a.h() / 2);
    if (paramString2 != null)
    {
      this.a.f().b(d.nextInt() + paramString2);
      this.b.f().b(d.nextInt() + paramString2);
    }
    a(true);
    SwingUtilities.invokeLater(new s(this));
    SwingUtilities.invokeLater(new t(this));
  }

  private void a(Reader paramReader)
  {
    if (paramReader == null)
      return;
    a(false);
    boolean bool = this.j;
    b(false);
    this.a.e();
    this.a.c(new be(paramReader).b());
    this.a.a(new Point(0, 2));
    b(bool);
  }

  private void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
    this.f.a(paramBoolean);
  }

  public void a(bl parambl)
  {
    if ((parambl.b() == 1) && (this.k != null) && (this.q != null))
      this.k.setTitle(this.q.d());
  }

  private void k()
  {
    this.f.b();
  }

  private void l()
  {
    this.f.c();
  }

  public j a(int paramInt)
  {
    j localj = this.e.a(paramInt, 0);
    return localj;
  }

  public j b(int paramInt)
  {
    j localj = this.e.a(paramInt, 1);
    return localj;
  }

  static void a(bs parambs)
  {
    parambs.h();
  }

  static void b(bs parambs)
  {
    parambs.i();
  }

  static JFrame c(bs parambs)
  {
    return parambs.k;
  }

  static bf d(bs parambs)
  {
    return parambs.a;
  }

  static br e(bs parambs)
  {
    return parambs.c;
  }

  static boolean f(bs parambs)
  {
    return parambs.j;
  }

  static void a(bs parambs, boolean paramBoolean)
  {
    parambs.b(paramBoolean);
  }

  static h g(bs parambs)
  {
    return parambs.p;
  }

  static bf h(bs parambs)
  {
    return parambs.b;
  }

  static z i(bs parambs)
  {
    return parambs.f;
  }

  static void j(bs parambs)
  {
    parambs.k();
  }

  static void k(bs parambs)
  {
    parambs.l();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bs
 * JD-Core Version:    0.6.0
 */