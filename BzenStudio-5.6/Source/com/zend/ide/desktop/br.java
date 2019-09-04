package com.zend.ide.desktop;

import com.zend.ide.be.k;
import com.zend.ide.n.bw;
import com.zend.ide.n.f;
import com.zend.ide.o.n.o;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.y.b;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class br
  implements cu
{
  private dv a = new dv(this, null);
  private bw b;
  private com.zend.ide.c.d c;
  private JLabel d;
  private JLabel e;
  private JLabel h;
  private JLabel f;
  private boolean i = false;
  private ImageIcon j = cv.b("tunnelConnected.gif");
  private ImageIcon k = cv.b("tunnelDisconnect.gif");
  private Timer g = new Timer(100, new cp(this));

  public br(bw parambw, boolean paramBoolean)
  {
    this.b = parambw;
    parambw.addCaretListener(new bt(this));
    parambw.a(new en(this));
    d();
    b();
    f();
    a();
    k localk = com.zend.ide.bd.c.b().c().g();
    localk.a(this.d);
    localk.a(this.e);
    localk.a(this.h);
    localk.a(this.c);
    if (paramBoolean)
    {
      e();
      localk.a(this.f);
    }
  }

  private static void a(JComponent paramJComponent)
  {
    Dimension localDimension = new Dimension(90, paramJComponent.getPreferredSize().height + 6);
    paramJComponent.setPreferredSize(localDimension);
    paramJComponent.setMinimumSize(localDimension);
    paramJComponent.setMaximumSize(localDimension);
  }

  private void b()
  {
    this.d = new JLabel(" 1 : 1");
    this.d.setBorder(null);
    this.d.setName("statusBar");
    a(this.d);
    this.d.setHorizontalAlignment(0);
    this.d.addMouseListener(new g(this));
  }

  private void c()
  {
    if (!this.g.isRunning())
      this.g.restart();
  }

  private void d()
  {
    this.c = new com.zend.ide.c.d();
    a(this.c);
    com.zend.ide.c.c.b().a("debug", this.c);
  }

  private void e()
  {
    this.f = new JLabel(" 0M  of  0M");
    a(this.f);
    Timer localTimer = new Timer(1000, new de(this));
    this.f.addMouseListener(new h(this));
    localTimer.start();
  }

  private void f()
  {
    this.e = new JLabel();
    a(this.e);
    this.e.addMouseListener(new ds(this));
    f.a("insertionMode", this.a);
    g();
  }

  private void a()
  {
    this.h = new JLabel("");
    this.h.setName("tunnelingLabel");
    this.h.setPreferredSize(new Dimension(50, this.h.getPreferredSize().height + 6));
    o.a().a(new ba(this));
    String str = (String)b.a("debugging.tunnelHost");
    if ((str != null) && (!str.equals("")))
    {
      h();
      a(false);
    }
  }

  private void g()
  {
    boolean bool = f.d();
    if (bool)
      this.e.setText(ct.a(1073));
    else
      this.e.setText(ct.a(1074));
  }

  private void h()
  {
    this.i = true;
    this.h.addMouseListener(new c(this));
  }

  private void a(boolean paramBoolean)
  {
    if (!this.i)
      h();
    if (paramBoolean)
    {
      this.h.setIcon(this.j);
      this.h.setToolTipText(ct.a(1564));
    }
    else
    {
      this.h.setIcon(this.k);
      this.h.setToolTipText(ct.a(1565));
    }
  }

  static void a(br parambr)
  {
    parambr.c();
  }

  static bw b(br parambr)
  {
    return parambr.b;
  }

  static Timer c(br parambr)
  {
    return parambr.g;
  }

  static JLabel d(br parambr)
  {
    return parambr.d;
  }

  static JLabel e(br parambr)
  {
    return parambr.f;
  }

  static void a(br parambr, boolean paramBoolean)
  {
    parambr.a(paramBoolean);
  }

  static void b(br parambr)
  {
    parambr.g();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.br
 * JD-Core Version:    0.6.0
 */