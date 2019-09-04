package com.zend.ide.w.a;

import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class bv extends ab
{
  private com.zend.ide.p.x f;
  private com.zend.ide.p.x g;
  private com.zend.ide.p.x h;
  private JPanel i;
  private JPanel j;
  private JPanel k;
  private JPanel l;
  private com.zend.ide.p.w m;
  private com.zend.ide.p.w n;

  public bv(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(599));
    g();
  }

  private void g()
  {
    h();
    i();
    getContentPane().add(this.k, "Center");
    getContentPane().add(this.l, "South");
    setModal(true);
    pack();
  }

  private void h()
  {
    this.f = new com.zend.ide.p.x(ct.a(600));
    this.g = new com.zend.ide.p.x(ct.a(601));
    Box localBox = new Box(1);
    localBox.add(Box.createVerticalStrut(5));
    localBox.add(Box.createHorizontalStrut(5));
    localBox.add(this.f);
    localBox.add(Box.createVerticalStrut(5));
    localBox.add(this.g);
    this.k = new JPanel(new BorderLayout());
    this.k.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.k.add(localBox, "Center");
  }

  private void i()
  {
    this.l = new JPanel(new BorderLayout());
    this.i = new JPanel(new FlowLayout(0));
    this.j = new JPanel(new FlowLayout(2));
    this.m = new com.zend.ide.p.w(ct.a(116));
    this.n = new com.zend.ide.p.w(ct.a(117));
    this.m.addActionListener(new w(this));
    this.n.addActionListener(new x(this));
    this.h = new com.zend.ide.p.x(ct.a(5));
    this.h.addItemListener(new y(this));
    this.i.add(this.h);
    this.j.add(this.m);
    this.j.add(this.n);
    this.l.add(this.i, "West");
    this.l.add(this.j, "East");
  }

  public q b()
  {
    l locall = new l(3);
    locall.a(this.f.isSelected());
    locall.b(this.g.isSelected());
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
    this.g.setSelected(locall.c());
  }

  public void a(boolean paramBoolean)
  {
    this.h.setSelected(paramBoolean);
  }

  static void a(bv parambv, int paramInt)
  {
    parambv.a(paramInt);
  }

  static void b(bv parambv, int paramInt)
  {
    parambv.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bv
 * JD-Core Version:    0.6.0
 */