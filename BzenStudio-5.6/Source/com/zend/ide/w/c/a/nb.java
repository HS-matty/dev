package com.zend.ide.w.c.a;

import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
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

public class nb extends ab
{
  private com.zend.ide.p.x e;
  private com.zend.ide.p.x f;
  private com.zend.ide.p.x g;
  private JTextField h;
  private JLabel i;
  private JPanel j;
  private JPanel k;
  private JPanel l;
  private JPanel m;
  private JPanel n;
  private JPanel o;
  private w p;
  private w q;

  public nb(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(1670));
    a();
  }

  private void a()
  {
    c();
    f();
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(this.m, "Center");
    getContentPane().add(this.n, "South");
    setModal(true);
    setResizable(false);
    pack();
  }

  private void c()
  {
    this.e = new com.zend.ide.p.x(ct.a(1669));
    this.f = new com.zend.ide.p.x(ct.a(1658));
    Box localBox = new Box(1);
    localBox.add(this.e);
    localBox.add(this.f);
    this.j = new JPanel(new BorderLayout());
    this.j.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
    this.j.add(localBox, "Center");
    d();
    this.m = new JPanel(new GridLayout());
    this.m.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.m.add(this.j);
    this.m.add(this.k);
  }

  private void d()
  {
    this.h = new JTextField();
    this.i = new JLabel(ct.a(582));
    this.i.setLabelFor(this.h);
    this.k = new JPanel(new GridLayout(2, 1));
    this.k.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.gray), BorderFactory.createEmptyBorder(4, 5, 5, 5)));
    this.k.add(this.i);
    this.k.add(this.h);
  }

  private void f()
  {
    this.n = new JPanel(new BorderLayout());
    this.l = new JPanel(new FlowLayout(2));
    this.o = new JPanel(new FlowLayout(0));
    this.g = new com.zend.ide.p.x(ct.a(5));
    this.g.addItemListener(new x(this));
    this.p = new w(ct.a(116));
    this.p.addActionListener(new y(this));
    this.q = new w(ct.a(117));
    this.q.addActionListener(new z(this));
    this.l.add(this.p);
    this.l.add(this.q);
    d.b(new JButton[] { this.p, this.q });
    this.o.add(this.g);
    this.n.add(this.l, "Center");
    this.n.add(this.o, "West");
  }

  public q b()
  {
    f localf = new f(0);
    localf.a(!this.e.isSelected());
    localf.c(this.f.isSelected());
    localf.d(this.h.getText());
    return localf;
  }

  public void a(q paramq)
  {
    if (!(paramq instanceof f))
      throw new IllegalArgumentException("Command arguments are not SVN arguments!");
    f localf = (f)paramq;
    this.e.setSelected(!localf.b());
    this.f.setSelected(localf.d());
  }

  public void a(boolean paramBoolean)
  {
    this.g.setSelected(paramBoolean);
  }

  static void a(nb paramnb, int paramInt)
  {
    paramnb.a(paramInt);
  }

  static void b(nb paramnb, int paramInt)
  {
    paramnb.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.nb
 * JD-Core Version:    0.6.0
 */