package com.zend.ide.w.c.a;

import com.zend.ide.p.cd;
import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class gb extends ab
{
  private x e;
  private x f;
  private x g;
  private JScrollPane h;
  private z i;
  private JTextArea j;
  private JTextField k;
  private z l;
  private JPanel m;
  private JPanel n;
  private JPanel o;
  private JPanel p;
  private JPanel q;
  private JPanel r;
  private w s;
  private w t;

  public gb(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(596));
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
    this.o = new JPanel(new GridLayout(1, 2));
    this.o.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEmptyBorder()));
    this.f = new x(ct.a(1657));
    this.g = new x(ct.a(1658));
    this.k = new JTextField();
    this.l = new z(ct.a(582));
    this.l.setLabelFor(this.k);
    Box localBox1 = new Box(1);
    localBox1.add(this.f);
    localBox1.add(Box.createVerticalStrut(10));
    localBox1.add(this.g);
    localBox1.add(Box.createVerticalStrut(30));
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.add(localBox1, "North");
    Box localBox2 = new Box(1);
    localBox2.add(this.l);
    localBox2.add(Box.createVerticalStrut(10));
    localBox2.add(this.k);
    localBox2.add(Box.createVerticalStrut(30));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localBox2, "North");
    localJPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.gray), BorderFactory.createEmptyBorder(4, 5, 0, 5)));
    this.o.add(localJPanel1);
    this.o.add(localJPanel2);
    this.i = new z(ct.a(617));
    this.i.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 5));
    this.j = new JTextArea();
    this.j.setEditable(false);
    this.j.setFocusable(false);
    this.h = new cd(this.j);
    this.h.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), this.h.getBorder()));
    this.m = new JPanel(new BorderLayout());
    this.m.add(this.i, "North");
    this.m.add(this.h, "Center");
    this.q = new JPanel(new BorderLayout());
    this.q.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.q.add(this.o, "South");
    this.q.add(this.m, "North");
  }

  private void d()
  {
    this.r = new JPanel(new BorderLayout());
    this.n = new JPanel(new FlowLayout(0));
    this.p = new JPanel(new FlowLayout(2));
    this.s = new w(ct.a(116));
    this.t = new w(ct.a(117));
    this.s.addActionListener(new a(this));
    this.t.addActionListener(new b(this));
    d.b(new JButton[] { this.s, this.t });
    this.e = new x(ct.a(5));
    this.e.addItemListener(new c(this));
    this.n.add(this.e);
    this.p.add(this.s);
    this.p.add(this.t);
    this.r.add(this.n, "West");
    this.r.add(this.p, "East");
  }

  public q b()
  {
    f localf = new f(2);
    localf.a(this.f.isSelected());
    localf.c(this.g.isSelected());
    localf.d(this.k.getText());
    return localf;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof f))
      throw new IllegalArgumentException("Command arguments are not SVN arguments!");
    f localf = (f)paramq;
    this.f.setSelected(localf.b());
    this.g.setSelected(localf.d());
    this.k.setText(localf.l());
  }

  public void a(String paramString, int paramInt)
  {
    this.j.setRows(paramInt > 5 ? 5 : paramInt);
    this.j.setText(paramString);
  }

  public void a(boolean paramBoolean)
  {
    this.e.setSelected(paramBoolean);
  }

  static void a(gb paramgb, int paramInt)
  {
    paramgb.a(paramInt);
  }

  static void b(gb paramgb, int paramInt)
  {
    paramgb.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.gb
 * JD-Core Version:    0.6.0
 */