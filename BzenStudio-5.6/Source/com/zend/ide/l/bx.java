package com.zend.ide.l;

import com.zend.ide.bd.c;
import com.zend.ide.i.n;
import com.zend.ide.o.cf;
import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
import com.zend.ide.util.a.f;
import com.zend.ide.util.bh;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class bx extends n
  implements cu
{
  private by c;
  private sb b;
  private boolean j = false;
  private w d;
  private w e;
  private JPanel f;
  private JPanel g;
  private JPanel h;
  private JLabel i;
  private l k;
  private l l;
  private JTabbedPane m;

  public bx(by paramby, sb paramsb)
  {
    super(c.b().h(), ct.a(867));
    this.c = paramby;
    this.b = paramsb;
    c();
  }

  private void c()
  {
    this.m = new z(this, 1);
    this.m.addTab(ct.a(242), this.c);
    this.m.addTab(ct.a(1842), this.b);
    this.f = new JPanel(new BorderLayout());
    this.f.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    this.f.add(this.m, "Center");
    this.c.b(false);
    e();
    f();
    add(this.f, "Center");
    add(this.g, "South");
    add(this.h, "West");
    setModal(true);
    pack();
    setLocationRelativeTo(null);
    setResizable(false);
  }

  private void e()
  {
    this.g = new JPanel(new FlowLayout(2));
    this.e = new w(ct.b(117));
    this.d = new w(ct.b(116));
    this.e.addActionListener(new ba(this));
    this.d.addActionListener(new f(new pb(this)));
    this.g.add(this.d);
    this.g.add(this.e);
    d.b(new JButton[] { this.d, this.e });
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new kb(this));
    this.g.add(localJButton);
  }

  private void f()
  {
    this.i = new JLabel(cv.b("zdeproject.gif"), 0);
    this.h = new JPanel(new BorderLayout());
    this.h.add(this.i, "South");
    this.h.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black)));
  }

  private void a()
  {
    cf localcf;
    if (this.k != null)
      localcf = (cf)this.k.b();
    else
      localcf = new cf();
    localcf.a(this.c.e());
    localcf.a(this.c.f());
    localcf.b(this.c.h());
    localcf.b(this.c.g());
    localcf.a(this.c.i());
    this.k = new e(localcf, "debugger");
    eb localeb;
    if (this.l != null)
      localeb = (eb)this.l.b();
    else
      localeb = new eb();
    localeb.a(this.b.a());
    localeb.a(this.b.b());
    this.l = new e(localeb, "javaBridge");
  }

  public void a(l paraml)
  {
    this.k = paraml;
    cf localcf = (cf)paraml.b();
    this.c.a(localcf.d());
    this.c.a(localcf.e());
    this.c.a(localcf.g());
    this.c.b(localcf.f());
    this.c.c(localcf.c());
  }

  public void b(l paraml)
  {
    this.l = paraml;
    eb localeb = (eb)paraml.b();
    this.b.a(localeb.a());
    this.b.a(localeb.b());
  }

  public void a(bh parambh)
  {
    this.c.a(parambh);
  }

  public l b()
  {
    return this.k;
  }

  public l c()
  {
    return this.l;
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.c.b(false);
      this.m.insertTab(ct.a(242), null, this.c, null, 0);
      this.m.setSelectedIndex(0);
      this.f.add(this.m, "Center");
    }
    super.setVisible(paramBoolean);
  }

  public boolean e()
  {
    return this.j;
  }

  public void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public bh f()
  {
    return this.c.b();
  }

  private void a(Component paramComponent, String paramString)
  {
    if (paramComponent == null)
      paramComponent = c.b().h();
    com.zend.ide.p.ba.a(paramComponent, paramString, ct.a(1545), -1, 1);
  }

  static sb a(bx parambx)
  {
    return parambx.b;
  }

  static void a(bx parambx, Component paramComponent, String paramString)
  {
    parambx.a(paramComponent, paramString);
  }

  static l a(bx parambx, l paraml)
  {
    return parambx.k = paraml;
  }

  static l b(bx parambx, l paraml)
  {
    return parambx.l = paraml;
  }

  static void b(bx parambx)
  {
    parambx.a();
  }

  static boolean a(bx parambx, boolean paramBoolean)
  {
    return parambx.j = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bx
 * JD-Core Version:    0.6.0
 */