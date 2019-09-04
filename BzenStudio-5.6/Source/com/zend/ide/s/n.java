package com.zend.ide.s;

import com.zend.ide.b.d;
import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import java.awt.Rectangle;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.text.JTextComponent;

public class n
  implements ib
{
  private JLayeredPane a = null;
  private cw b = new cw(new p(this, null));
  private q h = new q(this);
  private JPanel j;
  private JTextPane c;
  private d d;
  private Timer e;
  private d f;
  private bj g = new bj();
  private cb k = new cb(this);
  final h i;

  private n(h paramh)
  {
    this.g.a(this);
    this.j = this.g.a();
    this.c = this.g.b();
    this.g.a(new c(this, paramh));
    this.c.addHyperlinkListener(new ab(this, paramh));
    this.b.d().addListSelectionListener(new xb(this, paramh));
  }

  private cw d()
  {
    return this.b;
  }

  private bj a()
  {
    return this.g;
  }

  private void c()
  {
    JLayeredPane localJLayeredPane = ((RootPaneContainer)this.i.n().e().getTopLevelAncestor()).getLayeredPane();
    if (localJLayeredPane == this.a)
      return;
    if (this.a != null)
    {
      this.a.remove(this.b);
      this.a.remove(this.j);
    }
    this.a = localJLayeredPane;
    this.a.add(this.b, new Integer(2));
    this.a.add(this.j, new Integer(2));
    this.g.a(false);
  }

  private void a(z paramz, boolean paramBoolean)
  {
    c();
    try
    {
      Rectangle localRectangle1 = this.i.n().e().modelToView(paramz.b());
      localRectangle1 = SwingUtilities.convertRectangle(this.i.n().e(), localRectangle1, this.a);
      Rectangle localRectangle2 = this.a.getBounds();
      this.b.a(paramz, localRectangle1, localRectangle2);
      this.b.setVisible(true);
      a(null, false);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void b()
  {
    if (this.b.isShowing())
    {
      this.b.setVisible(false);
      this.g.a(false);
      this.k.a();
      this.i.n().e().repaint();
    }
  }

  public void a(d paramd, boolean paramBoolean)
  {
    if (!this.i.d().d())
      return;
    if (paramd == null)
      paramd = this.b.A();
    if (!paramBoolean)
      this.g.a(false);
    if (this.e == null)
    {
      int m = paramBoolean ? 0 : this.i.d().e();
      this.f = paramd;
      this.e = new Timer(m, this.h);
      this.e.start();
    }
    else if (paramd != this.f)
    {
      this.e.stop();
      this.e = null;
      a(paramd, paramBoolean);
    }
  }

  public void a()
  {
    this.k.c();
  }

  public void d()
  {
    this.k.e();
  }

  public void e()
  {
    b();
    h.a(this.i).c(this.d);
    this.d = null;
  }

  public void f()
  {
    b();
    h.a(this.i).a(this.d);
    this.d = null;
  }

  public void g()
  {
    b();
    h.a(this.i).b(this.d);
    this.d = null;
  }

  n(h paramh, a parama)
  {
    this(paramh);
  }

  static cw a(n paramn)
  {
    return paramn.d();
  }

  static bj b(n paramn)
  {
    return paramn.a();
  }

  static void a(n paramn, z paramz, boolean paramBoolean)
  {
    paramn.a(paramz, paramBoolean);
  }

  static bj a(n paramn)
  {
    return paramn.g;
  }

  static d c(n paramn)
  {
    return paramn.d;
  }

  static cb d(n paramn)
  {
    return paramn.k;
  }

  static d a(n paramn, d paramd)
  {
    return paramn.d = paramd;
  }

  static cw e(n paramn)
  {
    return paramn.b;
  }

  static d f(n paramn)
  {
    return paramn.f;
  }

  static JLayeredPane g(n paramn)
  {
    return paramn.a;
  }

  static Timer h(n paramn)
  {
    return paramn.e;
  }

  static Timer a(n paramn, Timer paramTimer)
  {
    return paramn.e = paramTimer;
  }

  static d b(n paramn, d paramd)
  {
    return paramn.f = paramd;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.n
 * JD-Core Version:    0.6.0
 */