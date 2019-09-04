package com.zend.ide.util;

import com.zend.ide.bd.c;
import com.zend.ide.i.n;
import com.zend.ide.p.bb;
import com.zend.ide.p.e.b;
import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.print.PageFormat;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class pb extends n
  implements cu
{
  private eb c;
  private int d;
  private w e;
  private w f;
  private w g;
  private x h;
  private x i;
  private x j;
  private x b;
  private x k;
  private x l;
  private bb m;
  private bb n;
  private bb o;
  private bb p;
  private x q;
  private z r;
  private JComboBox s;
  private JComboBox t;

  public pb()
  {
    super(c.b().h(), ct.a(61), true);
    e();
  }

  public void a(eb parameb)
  {
    this.d = 0;
    this.c = parameb;
    c();
    SwingUtilities.invokeLater(new lb(this));
    setVisible(true);
  }

  public int a()
  {
    return this.d;
  }

  private void c()
  {
    this.h.setSelected(this.c.a());
    this.i.setSelected(this.c.b());
    this.j.setSelected(this.c.c());
    this.b.setSelected(this.c.f());
    this.k.setSelected(this.c.d());
    this.l.setSelected(this.c.e());
    if (ch.b().a().getOrientation() == 1)
      this.m.setSelected(true);
    else
      this.n.setSelected(true);
    if (this.c.g())
      this.p.setSelected(true);
    else
      this.o.setSelected(true);
    this.q.setEnabled(this.c.i());
    this.q.setSelected(this.c.j());
    if (this.c.s() != null)
      this.r.setText(ct.a(162) + ": " + this.c.s());
    else
      this.r.setText('[' + ct.a(1382) + ']');
    this.k.setEnabled(this.c.h());
    Font localFont = this.c.i();
    if (localFont != null)
    {
      this.s.setSelectedItem(localFont.getFamily());
      this.t.setSelectedItem(new Integer(localFont.getSize()));
    }
  }

  private void d()
  {
    this.c.a(this.h.isSelected());
    this.c.b(this.i.isSelected());
    this.c.c(this.j.isSelected());
    this.c.h(this.b.isSelected());
    this.c.d(this.k.isSelected());
    this.c.e(this.l.isSelected());
    if (this.m.isSelected())
      this.c.a(1);
    else
      this.c.a(0);
    this.c.f(this.p.isSelected());
    this.c.g(this.q.isSelected());
    this.c.a(new Font((String)this.s.getSelectedItem(), 0, ((Integer)this.t.getSelectedItem()).intValue()));
  }

  private void e()
  {
    this.r = new z();
    this.e = new w(new ob(this));
    this.f = new w(new nb(this));
    this.g = new w(new mb(this));
    Dimension localDimension1 = this.e.getPreferredSize();
    Dimension localDimension2 = new Dimension(localDimension1.width, b.d.height);
    this.e.setPreferredSize(localDimension2);
    d.b(new JButton[] { this.f, this.g });
    this.h = new x(ct.a(1362));
    this.i = new x(ct.a(1363));
    this.j = new x(ct.a(1364));
    this.b = new x(ct.a(1423));
    this.k = new x(ct.a(1365));
    this.l = new x(ct.a(1366));
    this.q = new x(ct.a(1368));
    this.m = new bb(ct.a(1369));
    this.n = new bb(ct.a(1370));
    ButtonGroup localButtonGroup1 = new ButtonGroup();
    localButtonGroup1.add(this.m);
    localButtonGroup1.add(this.n);
    localButtonGroup1.setSelected(this.m.getModel(), true);
    this.p = new bb(ct.a(1371));
    this.o = new bb(ct.a(1372));
    ButtonGroup localButtonGroup2 = new ButtonGroup();
    localButtonGroup2.add(this.p);
    localButtonGroup2.add(this.o);
    localButtonGroup2.setSelected(this.p.getModel(), true);
    JPanel localJPanel1 = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints1 = new GridBagConstraints();
    localGridBagConstraints1.anchor = 17;
    localGridBagConstraints1.fill = 1;
    localGridBagConstraints1.gridwidth = 1;
    localGridBagConstraints1.weightx = 1.0D;
    localGridBagConstraints1.insets = new Insets(5, 5, 5, 5);
    JPanel localJPanel2 = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints2 = new GridBagConstraints();
    localGridBagConstraints2.anchor = 17;
    localGridBagConstraints2.fill = 1;
    localGridBagConstraints2.gridwidth = 1;
    localGridBagConstraints2.weightx = 1.0D;
    localJPanel2.setBorder(BorderFactory.createTitledBorder(ct.a(1367)));
    localGridBagConstraints2.insets = new Insets(0, 4, 5, 0);
    localJPanel2.add(this.r, localGridBagConstraints2);
    localGridBagConstraints2.gridy = 1;
    localGridBagConstraints2.insets = new Insets(0, 0, 0, 0);
    localJPanel2.add(this.q, localGridBagConstraints2);
    localGridBagConstraints2.gridy = 2;
    localJPanel2.add(this.k, localGridBagConstraints2);
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    JPanel localJPanel4 = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints3 = new GridBagConstraints();
    localGridBagConstraints1.anchor = 17;
    localGridBagConstraints1.fill = 1;
    localGridBagConstraints1.gridwidth = 1;
    localGridBagConstraints1.weightx = 1.0D;
    localJPanel4.setBorder(BorderFactory.createEmptyBorder(0, 4, 5, 0));
    localJPanel3.setBorder(BorderFactory.createTitledBorder(' ' + ct.a(11) + ' '));
    this.s = b();
    this.t = a();
    localJPanel4.add(new JLabel(ct.a(685)));
    localGridBagConstraints3.insets = new Insets(0, 3, 0, 20);
    localJPanel4.add(this.s, localGridBagConstraints3);
    localGridBagConstraints3.insets = new Insets(0, 0, 0, 0);
    localJPanel4.add(new JLabel(ct.a(1168)));
    localGridBagConstraints3.insets = new Insets(0, 3, 0, 5);
    localJPanel4.add(this.t, localGridBagConstraints3);
    localJPanel3.add(localJPanel4, "West");
    localJPanel1.add(localJPanel2, localGridBagConstraints1);
    localGridBagConstraints1.gridy = 1;
    localJPanel1.add(localJPanel3, localGridBagConstraints1);
    JPanel localJPanel5 = new JPanel(new GridLayout(-1, 1, 4, 4));
    localJPanel5.setBorder(BorderFactory.createTitledBorder(ct.a(1373)));
    localJPanel5.add(this.j);
    localJPanel5.add(this.b);
    localJPanel5.add(this.i);
    localJPanel5.add(this.l);
    localJPanel5.add(this.h);
    JPanel localJPanel6 = new JPanel(new GridLayout(-1, 1, 4, 4));
    localJPanel6.setBorder(BorderFactory.createTitledBorder(ct.a(1374)));
    localJPanel6.add(this.m);
    localJPanel6.add(this.n);
    JPanel localJPanel7 = new JPanel(new GridLayout(-1, 1, 4, 4));
    localJPanel7.setBorder(BorderFactory.createTitledBorder(ct.a(1375)));
    localJPanel7.add(this.o);
    localJPanel7.add(this.p);
    JPanel localJPanel8 = new JPanel(new FlowLayout(2));
    localJPanel8.add(this.e);
    localJPanel8.add(this.f);
    localJPanel8.add(this.g);
    getContentPane().setLayout(new BorderLayout());
    JPanel localJPanel9 = new JPanel(new GridBagLayout());
    localGridBagConstraints1.gridwidth = 1;
    localGridBagConstraints1.weightx = 2.0D;
    localGridBagConstraints1.insets = new Insets(5, 5, 5, 5);
    getContentPane().add(localJPanel1, "North");
    localGridBagConstraints1.gridx = 0;
    localGridBagConstraints1.gridy = 0;
    localJPanel9.add(localJPanel5, localGridBagConstraints1);
    JPanel localJPanel10 = new JPanel(new BorderLayout());
    localJPanel10.add(localJPanel6, "North");
    localJPanel10.add(localJPanel7, "South");
    localGridBagConstraints1.gridx = 1;
    localJPanel9.add(localJPanel10, localGridBagConstraints1);
    getContentPane().add(localJPanel8, "South");
    getContentPane().add(localJPanel9);
    pack();
    Dimension localDimension3 = getPreferredSize();
    setSize((int)(localDimension3.width * 1.2D), (int)(localDimension3.height * 1.05D));
    setLocationRelativeTo(null);
    this.b.addActionListener(new gc(this));
    this.j.addActionListener(new hc(this));
  }

  private static JComboBox a()
  {
    Integer[] arrayOfInteger = new Integer[67];
    for (int i1 = 0; i1 < arrayOfInteger.length; i1++)
      arrayOfInteger[i1] = new Integer(i1 + 6);
    JComboBox localJComboBox = new JComboBox(arrayOfInteger);
    Dimension localDimension = localJComboBox.getPreferredSize();
    localDimension.width += 20;
    localJComboBox.setPreferredSize(localDimension);
    return localJComboBox;
  }

  private static JComboBox b()
  {
    JComboBox localJComboBox = new JComboBox(cv.c());
    return localJComboBox;
  }

  static w a(pb parampb)
  {
    return parampb.f;
  }

  static x b(pb parampb)
  {
    return parampb.b;
  }

  static x c(pb parampb)
  {
    return parampb.j;
  }

  static void d(pb parampb)
  {
    parampb.d();
  }

  static int a(pb parampb, int paramInt)
  {
    return parampb.d = paramInt;
  }

  static bb e(pb parampb)
  {
    return parampb.m;
  }

  static bb f(pb parampb)
  {
    return parampb.n;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.pb
 * JD-Core Version:    0.6.0
 */