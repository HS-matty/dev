package com.zend.ide.w.a;

import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class bw extends ab
{
  private x f;
  private x g;
  private x h;
  private x i;
  private x j;
  private x k;
  private JTextField l;
  private JTextField m;
  private JTextField n;
  private JLabel o;
  private JLabel p;
  private JLabel q;
  private JPanel r;
  private JPanel s;
  private JPanel t;
  private JPanel u;
  private JPanel v;
  private JPanel w;
  private w x;
  private w y;

  public bw(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(573));
    g();
  }

  private void g()
  {
    h();
    j();
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(this.u, "Center");
    getContentPane().add(this.v, "South");
    setModal(true);
    setResizable(false);
    pack();
  }

  private void h()
  {
    this.f = new x(ct.a(574));
    this.g = new x(ct.a(575));
    this.h = new x(ct.a(576));
    this.i = new x(ct.a(577));
    this.j = new x(ct.a(579));
    Box localBox = new Box(1);
    localBox.add(this.f);
    localBox.add(this.g);
    localBox.add(this.h);
    localBox.add(this.i);
    localBox.add(this.j);
    this.r = new JPanel(new BorderLayout());
    this.r.add(localBox, "Center");
    i();
    this.u = new JPanel();
    this.u.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.u.add(this.r);
    this.u.add(this.s);
  }

  private void i()
  {
    this.l = new JTextField();
    this.m = new JTextField();
    this.n = new JTextField();
    this.o = new JLabel(ct.a(580));
    this.o.setLabelFor(this.l);
    this.p = new JLabel(ct.a(581));
    this.p.setLabelFor(this.m);
    this.q = new JLabel(ct.a(582));
    this.q.setLabelFor(this.n);
    this.s = new JPanel(new GridLayout(6, 1));
    this.s.add(this.o);
    this.s.add(this.l);
    this.s.add(this.p);
    this.s.add(this.m);
    this.s.add(this.q);
    this.s.add(this.n);
  }

  private void j()
  {
    this.v = new JPanel(new BorderLayout());
    this.t = new JPanel(new FlowLayout(2));
    this.w = new JPanel(new FlowLayout(0));
    this.k = new x(ct.a(5));
    this.k.addItemListener(new bd(this));
    this.x = new w(ct.a(116));
    this.x.addActionListener(new be(this));
    this.y = new w(ct.a(117));
    this.y.addActionListener(new bf(this));
    this.t.add(this.x);
    this.t.add(this.y);
    this.w.add(this.k);
    this.v.add(this.t, "Center");
    this.v.add(this.w, "West");
  }

  public q b()
  {
    l locall = new l(0);
    locall.c(this.f.isSelected());
    locall.d(this.g.isSelected());
    locall.e(this.i.isSelected());
    locall.a(this.h.isSelected());
    locall.f(this.j.isSelected());
    locall.b(this.l.getText());
    locall.c(this.m.getText());
    locall.d(this.n.getText());
    return locall;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof l))
      throw new IllegalArgumentException("Command arguments are not CVS arguments!");
    l locall = (l)paramq;
    if (paramq == null)
      return;
    this.f.setSelected(locall.d());
    this.g.setSelected(locall.e());
    this.i.setSelected(locall.f());
    this.h.setSelected(locall.b());
    this.j.setSelected(locall.g());
  }

  public void a(boolean paramBoolean)
  {
    this.k.setSelected(paramBoolean);
  }

  static void a(bw parambw, int paramInt)
  {
    parambw.a(paramInt);
  }

  static void b(bw parambw, int paramInt)
  {
    parambw.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bw
 * JD-Core Version:    0.6.0
 */