package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import com.zend.ide.i.n;
import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

class nb extends n
  implements cu
{
  private JTextField b;
  private JLabel c;
  private JTextField d;
  private JLabel e;
  private JRadioButton f;
  private JRadioButton g;
  private JRadioButton m;
  private JRadioButton n;
  private JCheckBox h;
  private JPanel i;
  private w j;
  private w k;
  final pb l;

  public nb(pb parampb)
  {
    super(ob.b, ct.a(1350));
    a();
    d();
    pack();
    doLayout();
  }

  private void a()
  {
    this.b = new JTextField();
    this.c = new JLabel(ct.a(1617));
    this.c.setLabelFor(this.b);
    this.d = new JTextField();
    this.e = new JLabel(ct.a(1618));
    this.e.setLabelFor(this.d);
    this.h = new JCheckBox(ct.a(1619));
    this.h.addActionListener(new q(this));
    this.f = new JRadioButton(ct.a(1620));
    this.g = new JRadioButton(ct.a(1621));
    this.g.addActionListener(new r(this));
    this.f.addActionListener(new s(this));
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.f);
    localButtonGroup.add(this.g);
    this.m = new JRadioButton(ct.a(1813));
    this.n = new JRadioButton(ct.a(1814));
    localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.m);
    localButtonGroup.add(this.n);
    c();
  }

  private void c()
  {
    this.i = new JPanel(new FlowLayout(2));
    this.j = new w(ct.b(117));
    this.k = new w(ct.b(116));
    this.j.addActionListener(new t(this));
    this.k.addActionListener(new u(this));
    this.i.add(this.k);
    this.i.add(this.j);
  }

  private void d()
  {
    setModal(true);
    setResizable(false);
    Point localPoint = ob.b.getLocation();
    setLocation(localPoint.x + 100, localPoint.y + 100);
    getContentPane().setLayout(new BorderLayout());
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 0));
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 5), BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.a(1622)), BorderFactory.createEmptyBorder(0, 5, 5, 5))));
    localJPanel1.add(this.c, "West");
    localJPanel1.add(this.b, "Center");
    getContentPane().add(localJPanel1, "North");
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 10, 0, 5), BorderFactory.createTitledBorder(ct.a(1623))));
    JPanel localJPanel3 = new JPanel();
    localJPanel3.setLayout(new BoxLayout(localJPanel3, 0));
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 20));
    localJPanel3.add(new JLabel(ct.a(1815)));
    localJPanel3.add(this.m);
    localJPanel3.add(this.n);
    localJPanel2.add(localJPanel3, "North");
    JPanel localJPanel4 = new JPanel();
    localJPanel4.setLayout(new BoxLayout(localJPanel4, 1));
    localJPanel4.add(new JSeparator());
    localJPanel4.add(this.f);
    localJPanel4.add(this.g);
    localJPanel2.add(localJPanel4, "Center");
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    localJPanel5.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 0));
    JPanel localJPanel6 = new JPanel(new FlowLayout(0));
    localJPanel6.add(this.h);
    JPanel localJPanel7 = new JPanel(new BorderLayout(5, 0));
    localJPanel7.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 5));
    localJPanel7.add(this.e, "West");
    localJPanel7.add(this.d, "Center");
    JPanel localJPanel8 = new JPanel(new BorderLayout());
    localJPanel8.add(localJPanel7, "North");
    localJPanel5.add(localJPanel6, "North");
    localJPanel5.add(localJPanel8, "Center");
    localJPanel2.add(localJPanel5, "South");
    getContentPane().add(localJPanel2, "Center");
    getContentPane().add(this.i, "South");
  }

  private void e()
  {
    if (this.g.isSelected())
    {
      this.h.setEnabled(true);
      this.d.setEnabled(!this.h.isSelected());
    }
    else
    {
      this.h.setEnabled(false);
      this.d.setEnabled(false);
    }
  }

  public void f()
  {
    g();
    super.setVisible(true);
  }

  private void g()
  {
    String str1 = this.l.a.g();
    String str2 = ct.a(686);
    if (str1.equals(str2))
      str1 = pb.c(this.l).getText();
    this.b.setText(str1);
    if (this.l.a.a())
      this.m.setSelected(true);
    else
      this.n.setSelected(true);
    if (this.l.a.e())
      this.g.setSelected(true);
    else
      this.f.setSelected(true);
    String str3 = this.l.a.f();
    boolean bool = str3.equals("http://schemas.xmlsoap.org/soap/encoding/");
    this.h.setSelected(bool);
    this.d.setEnabled(!bool);
    this.d.setText(str3);
  }

  static void a(nb paramnb)
  {
    paramnb.g();
  }

  static JCheckBox b(nb paramnb)
  {
    return paramnb.h;
  }

  static JTextField e(nb paramnb)
  {
    return paramnb.d;
  }

  static void c(nb paramnb)
  {
    paramnb.e();
  }

  static JTextField d(nb paramnb)
  {
    return paramnb.b;
  }

  static JRadioButton e(nb paramnb)
  {
    return paramnb.m;
  }

  static JRadioButton f(nb paramnb)
  {
    return paramnb.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.nb
 * JD-Core Version:    0.6.0
 */