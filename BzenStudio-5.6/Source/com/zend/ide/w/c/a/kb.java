package com.zend.ide.w.c.a;

import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.c.f;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class kb extends ab
{
  private x e;
  private x f;
  private JTextField g;
  private JTextField h;
  private JLabel i;
  private JLabel j;
  private JPanel k;
  private JPanel l;
  private JPanel m;
  private JPanel n;
  private JPanel o;
  private JPanel p;
  private x q;
  private x r;
  private x s;
  private x t;
  private JLabel u;
  private JTextField v;
  private w w;
  private w x;

  public kb(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(613));
    a();
  }

  private void a()
  {
    c();
    g();
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(this.n, "Center");
    getContentPane().add(this.o, "South");
    setModal(true);
    setResizable(false);
    pack();
  }

  private void c()
  {
    f();
    d();
    this.n = new JPanel(new BorderLayout());
    this.n.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.n.add(this.k, "North");
    this.n.add(this.l, "Center");
    b(false);
  }

  public void b(boolean paramBoolean)
  {
    this.q.setSelected(paramBoolean);
    c(this.q.isSelected());
  }

  private void c(boolean paramBoolean)
  {
    this.r.setEnabled(paramBoolean);
    this.t.setEnabled(paramBoolean);
    this.s.setEnabled(paramBoolean);
    this.u.setEnabled(paramBoolean);
    this.v.setEnabled(paramBoolean);
  }

  private void d()
  {
    this.l = new JPanel(new BorderLayout());
    this.l.setBorder(BorderFactory.createTitledBorder(ct.a(1662)));
    this.q = new x(ct.a(1663));
    this.l.add(this.q, "North");
    JPanel localJPanel1 = new JPanel(new GridLayout(2, 2));
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(4, 15, 4, 4));
    this.r = new x(ct.a(1664));
    this.s = new x(ct.a(1665));
    this.t = new x(ct.a(1666));
    localJPanel1.add(this.r);
    localJPanel1.add(this.s);
    localJPanel1.add(this.t);
    this.l.add(localJPanel1, "Center");
    JPanel localJPanel2 = new JPanel(new GridLayout(2, 1));
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(4, 19, 4, 4));
    this.u = new z(ct.a(572));
    this.v = new JTextField();
    this.u.setLabelFor(this.v);
    localJPanel2.add(this.u);
    localJPanel2.add(this.v);
    this.l.add(localJPanel2, "South");
    this.q.addActionListener(new n(this));
  }

  private void f()
  {
    this.e = new x(ct.a(1657));
    this.g = new JTextField();
    this.h = new JTextField();
    this.i = new JLabel(ct.a(580));
    this.i.setLabelFor(this.g);
    this.j = new JLabel(ct.a(582));
    this.j.setLabelFor(this.h);
    this.k = new JPanel(new GridLayout(5, 1));
    this.k.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 2, 0, 2), BorderFactory.createCompoundBorder(new EtchedBorder(), BorderFactory.createEmptyBorder(4, 5, 4, 5))));
    this.k.add(this.i);
    this.k.add(this.g);
    this.k.add(this.j);
    this.k.add(this.h);
    Insets localInsets = this.e.getInsets();
    this.e.setBorder(BorderFactory.createEmptyBorder(localInsets.top, 0, localInsets.bottom, localInsets.right));
    this.k.add(this.e);
  }

  private void g()
  {
    this.o = new JPanel(new BorderLayout());
    this.m = new JPanel(new FlowLayout(2));
    this.p = new JPanel(new FlowLayout(0));
    this.f = new x(ct.a(5));
    this.f.addItemListener(new o(this));
    this.w = new w(ct.a(116));
    this.w.addActionListener(new p(this));
    this.x = new w(ct.a(117));
    this.x.addActionListener(new q(this));
    this.m.add(this.w);
    this.m.add(this.x);
    d.b(new JButton[] { this.w, this.x });
    this.p.add(this.f);
    this.o.add(this.m, "Center");
    this.o.add(this.p, "West");
  }

  public com.zend.ide.w.q b()
  {
    f localf = new f(0);
    localf.a(this.e.isSelected());
    localf.c(this.g.getText());
    localf.d(this.h.getText());
    localf.d(this.q.isSelected());
    localf.f(this.r.isSelected());
    localf.g(this.s.isSelected());
    localf.h(this.t.isSelected());
    localf.b(this.v.getText());
    return localf;
  }

  public void a(com.zend.ide.w.q paramq)
  {
    if (!(paramq instanceof f))
      throw new IllegalArgumentException("Command arguments are not SVN arguments!");
    f localf = (f)paramq;
    this.e.setSelected(localf.b());
    this.r.setSelected(localf.h());
    this.t.setSelected(localf.j());
    this.s.setSelected(localf.i());
    this.v.setText(localf.f());
    b(localf.e());
  }

  public void a(boolean paramBoolean)
  {
    this.f.setSelected(paramBoolean);
  }

  static x a(kb paramkb)
  {
    return paramkb.q;
  }

  static void a(kb paramkb, boolean paramBoolean)
  {
    paramkb.c(paramBoolean);
  }

  static void a(kb paramkb, int paramInt)
  {
    paramkb.a(paramInt);
  }

  static void b(kb paramkb, int paramInt)
  {
    paramkb.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.kb
 * JD-Core Version:    0.6.0
 */