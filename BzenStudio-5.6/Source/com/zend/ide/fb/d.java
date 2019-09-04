package com.zend.ide.fb;

import com.zend.ide.p.pb;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public abstract class d
  implements k, cu
{
  public static final Object a = "DebugToolbar";
  private pb b;
  private JMenuItem c;
  private JCheckBoxMenuItem d;
  private JCheckBoxMenuItem e;
  private JCheckBoxMenuItem f;
  ButtonGroup g = new ButtonGroup();
  private JPanel h;
  private eb i;
  private JToolBar j;
  protected o k;
  private h l;
  private int m;

  public d()
  {
    a();
  }

  public void a(o paramo)
  {
    this.k = paramo;
  }

  public Component a()
  {
    return this.h;
  }

  public Object b()
  {
    return a;
  }

  private void a()
  {
    this.j = new JToolBar();
    this.h = new JPanel(new BorderLayout());
    this.j.setRollover(true);
    this.j.setFloatable(false);
    b();
    this.h.add(this.j);
    this.h.setPreferredSize(new Dimension(this.h.getPreferredSize().width, 26));
  }

  private void b()
  {
    this.b = new pb(cv.b("debuggerbug16.gif"));
    this.c = new JMenuItem(ct.a(1684));
    this.d = new JCheckBoxMenuItem(ct.a(1685));
    this.e = new JCheckBoxMenuItem(ct.a(1686));
    this.f = new JCheckBoxMenuItem(ct.a(1689));
    this.g = new ButtonGroup();
    this.g.add(this.c);
    this.g.add(this.d);
    this.g.add(this.e);
    this.g.add(this.f);
    this.b.a(this.c);
    this.b.a();
    this.b.a(this.d);
    this.b.a(this.e);
    this.b.a(this.f);
    this.l = new h(this);
    this.c.addActionListener(this.l);
    this.d.addActionListener(this.l);
    this.e.addActionListener(this.l);
    this.f.addActionListener(this.l);
    this.b.a(new e(this));
    this.b.setToolTipText(ct.a(1681));
    this.j.add(this.b);
    JButton localJButton1 = new JButton(cv.b("profile16.gif"));
    localJButton1.addActionListener(new f(this));
    localJButton1.setToolTipText(ct.a(1682));
    this.j.add(localJButton1);
    JButton localJButton2 = new JButton(cv.b("debugwindow16.gif"));
    localJButton2.addActionListener(new g(this));
    localJButton2.setToolTipText(ct.a(1530));
    this.j.add(localJButton2);
  }

  private eb c()
  {
    if (this.i == null)
      this.i = new eb(this);
    return this.i;
  }

  protected abstract void a(int paramInt);

  protected abstract void d();

  protected abstract void e();

  public void b(int paramInt)
  {
    if (paramInt == 1)
    {
      this.g.setSelected(this.d.getModel(), true);
      this.l.a(this.d.getModel());
    }
    else if (paramInt == 2)
    {
      this.g.setSelected(this.f.getModel(), true);
      this.l.a(this.f.getModel());
    }
    else if (paramInt == 3)
    {
      this.g.setSelected(this.e.getModel(), true);
      this.l.a(this.e.getModel());
    }
    else
    {
      this.g.setSelected(this.c.getModel(), true);
      this.l.a(this.c.getModel());
    }
    this.m = paramInt;
    a(this.m);
  }

  public int f()
  {
    return this.m;
  }

  static eb a(d paramd)
  {
    return paramd.c();
  }

  static int a(d paramd, int paramInt)
  {
    return paramd.m = paramInt;
  }

  static JMenuItem b(d paramd)
  {
    return paramd.c;
  }

  static int c(d paramd)
  {
    return paramd.m;
  }

  static JCheckBoxMenuItem d(d paramd)
  {
    return paramd.d;
  }

  static JCheckBoxMenuItem e(d paramd)
  {
    return paramd.e;
  }

  static JCheckBoxMenuItem f(d paramd)
  {
    return paramd.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.d
 * JD-Core Version:    0.6.0
 */