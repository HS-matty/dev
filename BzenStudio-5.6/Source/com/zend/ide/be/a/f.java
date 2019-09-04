package com.zend.ide.be.a;

import com.zend.ide.be.d;
import com.zend.ide.be.h;
import com.zend.ide.be.i;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.Border;

class f
{
  private static final Border k = BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1), BorderFactory.createLineBorder(Color.white));
  private JPanel a;
  private JPanel b;
  private g c;
  private bp d;
  private bp e;
  private bp f;
  private bp g;
  private bx o;
  private bx p;
  private bx q;
  private bx r;
  private be h = new be(this, null);
  private bf i = new bf(this);
  private d j;
  private static final bw s = new bw(false);
  private static final bw t = new bw(true);
  private Point l;
  private Point m;
  private w n;

  public f(d paramd)
  {
    this.j = paramd;
    this.a = new JPanel();
    this.a.setLayout(new t(this, null));
    this.a.setBackground(new Color(148, 146, 144));
    this.b = new JPanel();
    this.c = new g(this.b);
    this.b.setLayout(this.c);
    this.a.add(this.b);
    this.d = new bp(this, false);
    this.e = new bp(this, true);
    this.f = new bp(this, false);
    this.g = new bp(this, true);
    this.a.add(this.d);
    this.a.add(this.e);
    this.a.add(this.f);
    this.a.add(this.g);
    this.o = new bx(this, 1);
    this.p = new bx(this, 2);
    this.q = new bx(this, 3);
    this.r = new bx(this, 4);
    this.a.add(this.o);
    this.a.add(this.p);
    this.a.add(this.q);
    this.a.add(this.r);
  }

  public JComponent b()
  {
    return this.a;
  }

  public bd c()
  {
    return this.c.b();
  }

  public void a(bd parambd)
  {
    this.c.a(parambd);
  }

  public void a(w paramw, i parami)
  {
    b(paramw);
    parami = (i)parami.clone();
    JComponent localJComponent = paramw.b();
    paramw.b().putClientProperty("desktopWindowKwy", paramw);
    if (parami.c == 4)
    {
      localJComponent.putClientProperty("centerKey", parami);
      this.b.add(localJComponent, parami);
      return;
    }
    bp localbp = a(parami);
    localJComponent.putClientProperty("toolBarPanelKey", localbp);
    localbp.a(paramw, parami);
    this.a.validate();
    this.a.repaint();
  }

  public void a(w paramw)
  {
    c(paramw);
    JComponent localJComponent = paramw.b();
    i locali = (i)localJComponent.getClientProperty("centerKey");
    if (locali != null)
    {
      localJComponent.putClientProperty("centerKey", null);
      this.b.remove(localJComponent);
      return;
    }
    bp localbp = (bp)localJComponent.getClientProperty("toolBarPanelKey");
    localbp.a(paramw);
    localbp.putClientProperty("toolBarPanelKey", null);
    localJComponent.putClientProperty("floatingWindowKwy", null);
    paramw.b().putClientProperty("desktopWindowKwy", null);
    this.a.validate();
    this.a.repaint();
  }

  public void g(w paramw)
  {
    JComponent localJComponent = paramw.b();
    i locali = (i)localJComponent.getClientProperty("centerKey");
    if (locali != null)
      return;
    bp localbp = (bp)localJComponent.getClientProperty("toolBarPanelKey");
    localbp.c(paramw);
  }

  private void b(w paramw)
  {
    ba localba = new ba(this.j, paramw.e());
    paramw.d().a("hideAction", localba);
    if (paramw.d().e())
    {
      x localx = new x(this.j, paramw.e());
      paramw.d().a("closeAction", localx);
    }
  }

  private void c(w paramw)
  {
    paramw.d().a("closeAction");
    paramw.d().a("hideAction");
  }

  public void b(w paramw, i parami)
  {
    parami = (i)parami.clone();
    if (parami.c == 4)
      return;
    JComponent localJComponent = paramw.b();
    bp localbp1 = (bp)localJComponent.getClientProperty("toolBarPanelKey");
    bp localbp2 = a(parami);
    if (localbp1 != localbp2)
    {
      localbp1.a(paramw);
      localbp2.a(paramw, parami);
      localJComponent.putClientProperty("toolBarPanelKey", localbp2);
    }
    else
    {
      localbp2.b(paramw, parami);
    }
    this.a.validate();
    this.a.repaint();
  }

  public static i d(w paramw)
  {
    i locali = e(paramw);
    if (locali == null)
      return null;
    return (i)locali.clone();
  }

  private static i e(w paramw)
  {
    JComponent localJComponent = paramw.b();
    i locali = (i)localJComponent.getClientProperty("centerKey");
    if (locali != null)
      return (i)locali.clone();
    bp localbp = (bp)localJComponent.getClientProperty("toolBarPanelKey");
    return localbp.b(paramw);
  }

  private bp a(i parami)
  {
    switch (parami.c)
    {
    case 0:
      return this.d;
    case 3:
      return this.e;
    case 1:
      return this.f;
    case 2:
      return this.g;
    }
    return null;
  }

  private JWindow f(w paramw)
  {
    JComponent localJComponent = paramw.b();
    Object localObject = (JWindow)localJComponent.getClientProperty("floatingWindowKwy");
    if (localObject == null)
    {
      localObject = new bt(this.j.b());
      ((JWindow)localObject).getContentPane().setLayout(new BorderLayout());
      localJComponent.putClientProperty("floatingWindowKwy", localObject);
    }
    return (JWindow)localObject;
  }

  private static final w a(JComponent paramJComponent)
  {
    w localw = (w)paramJComponent.getClientProperty("desktopWindowKwy");
    if (localw == null)
      localw = a((JComponent)paramJComponent.getParent());
    return localw;
  }

  static Border d()
  {
    return k;
  }

  static bw e()
  {
    return t;
  }

  static bw f()
  {
    return s;
  }

  static JWindow a(f paramf, w paramw)
  {
    return paramf.f(paramw);
  }

  static JPanel d(f paramf)
  {
    return paramf.b;
  }

  static be a(f paramf)
  {
    return paramf.h;
  }

  static bf f(f paramf)
  {
    return paramf.i;
  }

  static g b(f paramf)
  {
    return paramf.c;
  }

  static JPanel e(f paramf)
  {
    return paramf.a;
  }

  static w b(f paramf, w paramw)
  {
    return paramf.n = paramw;
  }

  static w b(JComponent paramJComponent)
  {
    return a(paramJComponent);
  }

  static Point a(f paramf, Point paramPoint)
  {
    return paramf.m = paramPoint;
  }

  static Point b(f paramf, Point paramPoint)
  {
    return paramf.l = paramPoint;
  }

  static Point c(f paramf)
  {
    return paramf.m;
  }

  static w g(f paramf)
  {
    return paramf.n;
  }

  static d a(f paramf)
  {
    return paramf.j;
  }

  static Point h(f paramf)
  {
    return paramf.l;
  }

  static bp i(f paramf)
  {
    return paramf.d;
  }

  static bp j(f paramf)
  {
    return paramf.e;
  }

  static bp k(f paramf)
  {
    return paramf.f;
  }

  static bp l(f paramf)
  {
    return paramf.g;
  }

  static bx m(f paramf)
  {
    return paramf.o;
  }

  static bx n(f paramf)
  {
    return paramf.p;
  }

  static bx o(f paramf)
  {
    return paramf.q;
  }

  static bx p(f paramf)
  {
    return paramf.r;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.f
 * JD-Core Version:    0.6.0
 */