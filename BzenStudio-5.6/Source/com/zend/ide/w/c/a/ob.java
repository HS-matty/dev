package com.zend.ide.w.c.a;

import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
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

public class ob extends com.zend.ide.w.ab
{
  private x e;
  private x f;
  private x g;
  private x h;
  private x i;
  private JTextField j;
  private JLabel k;
  private JPanel l;
  private JPanel m;
  private JPanel n;
  private JPanel o;
  private JPanel p;
  private JPanel q;
  private w r;
  private w s;

  public ob(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(599));
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
    this.e = new x(ct.a(1657));
    this.f = new x(ct.a(1658));
    this.g = new x(ct.a(1667));
    this.h = new x(ct.a(1671));
    Box localBox = new Box(1);
    localBox.add(this.h);
    localBox.add(this.g);
    localBox.add(this.e);
    localBox.add(this.f);
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
    this.j = new JTextField();
    this.k = new JLabel(ct.a(582));
    this.k.setLabelFor(this.j);
    this.m = new JPanel(new BorderLayout());
    this.m.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.gray), BorderFactory.createEmptyBorder(4, 5, 5, 5)));
    JPanel localJPanel = new JPanel(new GridLayout(2, 1));
    localJPanel.add(this.k);
    localJPanel.add(this.j);
    this.m.add(localJPanel, "North");
  }

  private void f()
  {
    this.p = new JPanel(new BorderLayout());
    this.n = new JPanel(new FlowLayout(2));
    this.q = new JPanel(new FlowLayout(0));
    this.i = new x(ct.a(5));
    this.i.addItemListener(new ab(this));
    this.r = new w(ct.a(116));
    this.r.addActionListener(new bb(this));
    this.s = new w(ct.a(117));
    this.s.addActionListener(new cb(this));
    this.n.add(this.r);
    this.n.add(this.s);
    d.b(new JButton[] { this.r, this.s });
    this.q.add(this.i);
    this.p.add(this.n, "Center");
    this.p.add(this.q, "West");
  }

  public q b()
  {
    f localf = new f(0);
    localf.i(this.h.isSelected());
    localf.b(this.g.isSelected());
    localf.a(this.e.isSelected());
    localf.c(this.f.isSelected());
    localf.d(this.j.getText());
    return localf;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof f))
      throw new IllegalArgumentException("Command arguments are not SVN arguments!");
    f localf = (f)paramq;
    this.h.setSelected(localf.r());
    this.g.setSelected(localf.c());
    this.e.setSelected(localf.b());
    this.f.setSelected(localf.d());
  }

  public void a(boolean paramBoolean)
  {
    this.i.setSelected(paramBoolean);
  }

  static void a(ob paramob, int paramInt)
  {
    paramob.a(paramInt);
  }

  static void b(ob paramob, int paramInt)
  {
    paramob.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.ob
 * JD-Core Version:    0.6.0
 */