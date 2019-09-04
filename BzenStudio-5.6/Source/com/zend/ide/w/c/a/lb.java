package com.zend.ide.w.c.a;

import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.c.f;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class lb extends ab
{
  private x e;
  private x f;
  private x g;
  private JTextField h;
  private JTextField i;
  private JLabel j;
  private JLabel k;
  private JPanel l;
  private JPanel m;
  private JPanel n;
  private JPanel o;
  private JPanel p;
  private JPanel q;
  private w r;
  private w s;

  public lb(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(1023));
    a();
  }

  private void a()
  {
    c();
    f();
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(this.o, "Center");
    getContentPane().add(this.p, "South");
    setModal(true);
    setResizable(false);
    pack();
  }

  private void c()
  {
    this.e = new x(ct.a(1667));
    this.f = new x(ct.a(1658));
    Box localBox = new Box(1);
    localBox.add(this.e);
    localBox.add(this.f);
    localBox.add(Box.createVerticalStrut(30));
    this.l = new JPanel(new BorderLayout());
    this.l.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
    this.l.add(localBox, "Center");
    d();
    this.o = new JPanel(new GridLayout());
    this.o.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.o.add(this.l);
    this.o.add(this.m);
  }

  private void d()
  {
    this.h = new JTextField();
    this.i = new JTextField();
    this.j = new JLabel(ct.a(580));
    this.j.setLabelFor(this.h);
    this.k = new JLabel(ct.a(582));
    this.k.setLabelFor(this.i);
    this.m = new JPanel(new GridLayout(4, 1));
    this.m.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.gray), BorderFactory.createEmptyBorder(4, 5, 5, 5)));
    this.m.add(this.j);
    this.m.add(this.h);
    this.m.add(this.k);
    this.m.add(this.i);
  }

  private void f()
  {
    this.p = new JPanel(new BorderLayout());
    this.n = new JPanel(new FlowLayout(2));
    this.q = new JPanel(new FlowLayout(0));
    this.g = new x(ct.a(5));
    this.g.addItemListener(new r(this));
    this.r = new w(ct.a(116));
    this.r.addActionListener(new s(this));
    this.s = new w(ct.a(117));
    this.s.addActionListener(new t(this));
    this.n.add(this.r);
    this.n.add(this.s);
    d.b(new JButton[] { this.r, this.s });
    this.q.add(this.g);
    this.p.add(this.n, "Center");
    this.p.add(this.q, "West");
  }

  public q b()
  {
    f localf = new f(0);
    localf.b(this.e.isSelected());
    localf.c(this.f.isSelected());
    localf.c(this.h.getText());
    localf.d(this.i.getText());
    return localf;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof f))
      throw new IllegalArgumentException("Command arguments are not SVN arguments!");
    f localf = (f)paramq;
    this.e.setSelected(localf.c());
    this.f.setSelected(localf.d());
  }

  public void a(boolean paramBoolean)
  {
    this.g.setSelected(paramBoolean);
  }

  static void a(lb paramlb, int paramInt)
  {
    paramlb.a(paramInt);
  }

  static void b(lb paramlb, int paramInt)
  {
    paramlb.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.lb
 * JD-Core Version:    0.6.0
 */