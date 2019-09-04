package com.zend.ide.w.c.a;

import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.c.f;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ib extends ab
{
  private x e;
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

  public ib(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(569));
    a();
  }

  private void a()
  {
    c();
    d();
    getContentPane().add(this.q, "Center");
    getContentPane().add(this.r, "South");
    setModal(true);
    pack();
  }

  private void c()
  {
    this.i = new JTextArea();
    this.j = new cd(this.i);
    this.j.setPreferredSize(new Dimension(200, 150));
    this.l = new z(ct.a(570));
    this.l.setLabelFor(this.i);
    this.e = new x(ct.a(1657));
    this.f = new x(ct.a(579));
    this.o = new JPanel(new BorderLayout());
    this.o.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEmptyBorder()));
    this.o.add(this.l, "North");
    this.o.add(this.j, "Center");
    JPanel localJPanel = new JPanel(new GridLayout(2, 1));
    localJPanel.add(this.e);
    localJPanel.add(this.f);
    this.o.add(localJPanel, "South");
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

  private void d()
  {
    this.r = new JPanel(new BorderLayout());
    this.n = new JPanel(new FlowLayout(0));
    this.p = new JPanel(new FlowLayout(2));
    this.s = new w(ct.a(116));
    this.t = new w(ct.a(117));
    this.s.addActionListener(new h(this));
    this.t.addActionListener(new i(this));
    this.g = new x(ct.a(5));
    this.g.addItemListener(new j(this));
    this.n.add(this.g);
    this.p.add(this.s);
    this.p.add(this.t);
    this.r.add(this.n, "West");
    this.r.add(this.p, "East");
  }

  private String e()
  {
    return this.i.getText();
  }

  public q b()
  {
    f localf = new f(1);
    localf.a(this.e.isSelected());
    localf.c(this.f.isSelected());
    localf.e(e().replaceAll("\"", "\\\\\""));
    localf.d(this.h.getText());
    return localf;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof f))
      throw new IllegalArgumentException("Command arguments are not SVN arguments!");
    f localf = (f)paramq;
    this.e.setSelected(localf.b());
    this.f.setSelected(localf.d());
    this.h.setText(localf.l());
  }

  public void a(boolean paramBoolean)
  {
    this.g.setSelected(paramBoolean);
  }

  static void a(ib paramib, int paramInt)
  {
    paramib.a(paramInt);
  }

  static void b(ib paramib, int paramInt)
  {
    paramib.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.ib
 * JD-Core Version:    0.6.0
 */