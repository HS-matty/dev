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
import javax.swing.border.EtchedBorder;

public class bq extends ab
{
  private x f;
  private x g;
  private JTextArea h;
  private JScrollPane i;
  private JScrollPane j;
  private z k;
  private JTextArea l;
  private z m;
  private JPanel n;
  private JPanel o;
  private JPanel p;
  private JPanel q;
  private JPanel r;
  private JPanel s;
  private w t;
  private w u;

  public bq(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(596));
    g();
  }

  private void g()
  {
    h();
    i();
    getContentPane().add(this.r, "Center");
    getContentPane().add(this.s, "South");
    setModal(true);
    pack();
  }

  private void h()
  {
    this.h = new JTextArea();
    this.i = new cd(this.h);
    this.i.setPreferredSize(new Dimension(200, 150));
    this.m = new z(ct.a(570));
    this.m.setLabelFor(this.h);
    this.f = new x(ct.a(597));
    this.p = new JPanel(new BorderLayout());
    this.p.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEmptyBorder()));
    this.p.add(this.m, "North");
    this.p.add(this.i, "Center");
    this.p.add(this.f, "South");
    this.k = new z(ct.a(617));
    this.k.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 5));
    this.l = new JTextArea();
    this.l.setEditable(false);
    this.l.setFocusable(false);
    this.j = new cd(this.l);
    this.j.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), this.j.getBorder()));
    this.n = new JPanel(new BorderLayout());
    this.n.add(this.k, "North");
    this.n.add(this.j, "Center");
    this.r = new JPanel(new BorderLayout());
    this.r.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.r.add(this.p, "Center");
    this.r.add(this.n, "North");
  }

  private void i()
  {
    this.s = new JPanel(new BorderLayout());
    this.o = new JPanel(new FlowLayout(0));
    this.q = new JPanel(new FlowLayout(2));
    this.t = new w(ct.a(116));
    this.u = new w(ct.a(117));
    this.t.addActionListener(new f(this));
    this.u.addActionListener(new g(this));
    this.g = new x(ct.a(5));
    this.g.addItemListener(new h(this));
    this.o.add(this.g);
    this.q.add(this.t);
    this.q.add(this.u);
    this.s.add(this.o, "West");
    this.s.add(this.q, "East");
  }

  private String j()
  {
    return this.h.getText();
  }

  public q b()
  {
    l locall = new l(2);
    locall.g(this.f.isSelected());
    locall.e(j());
    return locall;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof l))
      throw new IllegalArgumentException("Command arguments are not CVS arguments!");
    if (paramq == null)
      return;
    this.f.setSelected(((l)paramq).h());
  }

  public void a(String paramString, int paramInt)
  {
    this.l.setRows(paramInt > 5 ? 5 : paramInt);
    this.l.setText(paramString);
  }

  public void a(boolean paramBoolean)
  {
    this.g.setSelected(paramBoolean);
  }

  static void a(bq parambq, int paramInt)
  {
    parambq.a(paramInt);
  }

  static void b(bq parambq, int paramInt)
  {
    parambq.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bq
 * JD-Core Version:    0.6.0
 */