package com.zend.ide.w.a;

import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class bt extends ab
{
  private x f;
  private x g;
  private x h;
  private z i;
  private z r;
  private JTextField j;
  private JTextField s;
  private JPanel k;
  private JPanel l;
  private JPanel m;
  private JPanel n;
  private JPanel o;
  private w p;
  private w q;

  public bt(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(613));
    g();
  }

  private void g()
  {
    h();
    i();
    getContentPane().add(this.m, "Center");
    getContentPane().add(this.o, "South");
    setModal(true);
    pack();
  }

  private void h()
  {
    this.f = new x(ct.a(614));
    this.g = new x(ct.a(616));
    this.i = new z(ct.a(615));
    this.r = new z(ct.a(582));
    this.j = new JTextField("HEAD");
    this.i.setLabelFor(this.j);
    this.s = new JTextField();
    this.r.setLabelFor(this.s);
    this.n = new JPanel(new GridLayout(6, 1));
    this.n.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
    this.n.add(this.i);
    this.n.add(this.j);
    this.n.add(this.g);
    this.n.add(this.f);
    this.n.add(this.r);
    this.n.add(this.s);
    this.m = new JPanel(new BorderLayout());
    this.m.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), new EtchedBorder()));
    this.m.add(this.n, "Center");
  }

  private void i()
  {
    this.o = new JPanel(new BorderLayout());
    this.k = new JPanel(new FlowLayout(0));
    this.l = new JPanel(new FlowLayout(2));
    this.p = new w(ct.a(116));
    this.q = new w(ct.a(117));
    this.p.addActionListener(new q(this));
    this.q.addActionListener(new r(this));
    this.h = new x(ct.a(5));
    this.h.addItemListener(new s(this));
    this.k.add(this.h);
    this.l.add(this.p);
    this.l.add(this.q);
    this.o.add(this.k, "West");
    this.o.add(this.l, "East");
  }

  public com.zend.ide.w.q b()
  {
    l locall = new l(5);
    String str = this.j.getText();
    if ((str != null) && (!str.equals("")))
      if (this.g.isSelected())
        locall.c(str);
      else
        locall.b(str);
    locall.h(this.f.isSelected());
    locall.d(this.s.getText());
    return locall;
  }

  public void a(com.zend.ide.w.q paramq)
  {
    if (!(paramq instanceof l))
      throw new IllegalArgumentException("Command arguments are not CVS arguments!");
    l locall = (l)paramq;
    if (paramq == null)
      return;
    String str = locall.k();
    if ((str != null) && (!str.equals("")))
    {
      this.g.setSelected(true);
      this.j.setText(str);
    }
    else
    {
      str = locall.j();
      if ((str != null) && (!str.equals("")))
      {
        this.g.setSelected(false);
        this.j.setText(str);
      }
    }
    this.f.setSelected(locall.i());
  }

  public void b(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.s.setText("");
    this.s.setEditable(paramBoolean);
  }

  public void a(boolean paramBoolean)
  {
    this.h.setSelected(paramBoolean);
  }

  static void a(bt parambt, int paramInt)
  {
    parambt.a(paramInt);
  }

  static void b(bt parambt, int paramInt)
  {
    parambt.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bt
 * JD-Core Version:    0.6.0
 */