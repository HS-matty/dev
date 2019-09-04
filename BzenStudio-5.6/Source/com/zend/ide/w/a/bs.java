package com.zend.ide.w.a;

import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class bs extends ab
{
  private x f;
  private x g;
  private JTextField h;
  private JTextArea i;
  private JScrollPane j;
  private z k;
  private z l;
  private JPanel m;
  private JPanel n;
  private JPanel o;
  private JPanel p;
  private JPanel q;
  private JPanel r;
  private w s;
  private w t;

  public bs(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(569));
    g();
  }

  private void g()
  {
    h();
    i();
    getContentPane().add(this.q, "Center");
    getContentPane().add(this.r, "South");
    setModal(true);
    pack();
  }

  private void h()
  {
    this.i = new JTextArea();
    this.j = new cd(this.i);
    this.j.setPreferredSize(new Dimension(200, 150));
    this.l = new z(ct.a(570));
    this.l.setLabelFor(this.i);
    this.f = new x(ct.a(571));
    this.o = new JPanel(new BorderLayout());
    this.o.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEmptyBorder()));
    this.o.add(this.l, "North");
    this.o.add(this.j, "Center");
    this.o.add(this.f, "South");
    this.h = new JTextField();
    this.k = new z(ct.a(572));
    this.k.setLabelFor(this.h);
    this.m = new JPanel(new BorderLayout());
    this.m.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5), BorderFactory.createEmptyBorder()));
    this.m.add(this.k, "West");
    this.m.add(this.h, "Center");
    this.q = new JPanel(new BorderLayout());
    this.q.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.q.add(this.o, "Center");
    this.q.add(this.m, "South");
  }

  private void i()
  {
    this.r = new JPanel(new BorderLayout());
    this.n = new JPanel(new FlowLayout(0));
    this.p = new JPanel(new FlowLayout(2));
    this.s = new w(ct.a(116));
    this.t = new w(ct.a(117));
    this.s.addActionListener(new m(this));
    this.t.addActionListener(new n(this));
    this.g = new x(ct.a(5));
    this.g.addItemListener(new o(this));
    this.n.add(this.g);
    this.p.add(this.s);
    this.p.add(this.t);
    this.r.add(this.n, "West");
    this.r.add(this.p, "East");
  }

  private String j()
  {
    return this.i.getText();
  }

  public q b()
  {
    l locall = new l(1);
    locall.a(this.f.isSelected());
    locall.e(j().replaceAll("\"", "\\\\\""));
    locall.d(this.h.getText());
    return locall;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof l))
      throw new IllegalArgumentException("Command arguments are not CVS arguments!");
    l locall = (l)paramq;
    if (paramq == null)
      return;
    this.f.setSelected(locall.b());
    this.h.setText(locall.l());
  }

  public void a(boolean paramBoolean)
  {
    this.g.setSelected(paramBoolean);
  }

  static void a(bs parambs, int paramInt)
  {
    parambs.a(paramInt);
  }

  static void b(bs parambs, int paramInt)
  {
    parambs.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bs
 * JD-Core Version:    0.6.0
 */