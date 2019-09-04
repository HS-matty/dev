package com.zend.ide.w.a;

import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class bz extends ab
{
  private x g;
  private x h;
  private x i;
  private z j;
  private JTextField k;
  private JPanel l;
  private JPanel m;
  private JPanel n;
  private JPanel o;
  private JPanel p;
  private w q;
  private w r;

  public bz(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(1023));
    g();
  }

  private void g()
  {
    h();
    i();
    getContentPane().add(this.n, "Center");
    getContentPane().add(this.p, "South");
    setModal(true);
    pack();
  }

  private void h()
  {
    this.g = new x(ct.a(571));
    this.h = new x(ct.a(579));
    this.j = new z(ct.a(572));
    this.k = new JTextField();
    this.j.setLabelFor(this.k);
    this.o = new JPanel(new GridLayout(4, 1));
    this.o.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    this.o.add(this.g);
    this.o.add(this.h);
    this.o.add(this.j);
    this.o.add(this.k);
    this.n = new JPanel(new BorderLayout());
    this.n.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.n.add(this.o, "Center");
  }

  private void i()
  {
    this.p = new JPanel(new BorderLayout());
    this.l = new JPanel(new FlowLayout(0));
    this.m = new JPanel(new FlowLayout(2));
    this.q = new w(ct.a(116));
    this.r = new w(ct.a(117));
    this.q.addActionListener(new bl(this));
    this.r.addActionListener(new bu(this));
    this.i = new x(ct.a(5));
    this.i.addItemListener(new by(this));
    this.l.add(this.i);
    this.m.add(this.q);
    this.m.add(this.r);
    this.p.add(this.l, "West");
    this.p.add(this.m, "East");
  }

  public q b()
  {
    l locall = new l(6);
    String str = this.k.getText();
    if ((str != null) && (!str.equals("")))
      locall.d(str);
    locall.a(this.g.isSelected());
    locall.f(this.h.isSelected());
    return locall;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof l))
      throw new IllegalArgumentException("Command arguments are not CVS arguments!");
    l locall = (l)paramq;
    if (paramq == null)
      return;
    this.g.setSelected(locall.b());
    this.h.setSelected(locall.g());
  }

  public void a(boolean paramBoolean)
  {
    this.i.setSelected(paramBoolean);
  }

  static void a(bz parambz, int paramInt)
  {
    parambz.a(paramInt);
  }

  static void b(bz parambz, int paramInt)
  {
    parambz.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bz
 * JD-Core Version:    0.6.0
 */