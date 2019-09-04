package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.cb.a.ke;
import com.zend.ide.i.n;
import com.zend.ide.p.cd;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.xc;
import com.zend.ide.y.b;
import com.zend.ide.zendPlatformIntegration.b.a.p;
import com.zend.ide.zendPlatformIntegration.b.a.q;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ib extends n
  implements cu
{
  private static final long serialVersionUID = 1L;
  private boolean b;
  private JButton c;
  private JButton d;
  private JButton e;
  private JButton f;
  private JButton g;
  private JButton h;
  private JTable i;
  private final JCheckBox j = new JCheckBox(ct.a(1856));
  private final xc k = new xc();
  private final JCheckBox l = new JCheckBox(ct.a(1851));
  private final JSpinner m = new ke(1, 1, 99, 1, 2);
  private JCheckBox n = new JCheckBox(ct.a(1900));
  private final JComboBox o = new JComboBox();
  private JComboBox p = new JComboBox();
  private JComboBox q = new JComboBox();
  private JComboBox r = new JComboBox();
  private JComboBox s = new JComboBox();
  private JComboBox t = new JComboBox();
  private com.zend.ide.zendPlatformIntegration.b.b.f u;

  public ib(JComponent paramJComponent, com.zend.ide.zendPlatformIntegration.b.b.f paramf)
  {
    super(com.zend.ide.bd.c.b().h(), ct.a(1858), true);
    this.u = paramf;
    this.b = false;
    setSize(545, 570);
    B();
    setLayout(new BorderLayout());
    a();
    setResizable(true);
    setVisible(true);
  }

  private void a()
  {
    JPanel localJPanel = new JPanel(new GridBagLayout());
    localJPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.gridwidth = 0;
    localJPanel.add(l(), localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(10, 0, 0, 0);
    localJPanel.add(k(), localGridBagConstraints);
    localJPanel.add(d(), localGridBagConstraints);
    localJPanel.add(b(), localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 0, 0);
    h();
    add(localJPanel, "Center");
    add(f(), "South");
  }

  private Component b()
  {
    JPanel localJPanel1 = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints1 = new GridBagConstraints();
    localGridBagConstraints1.weightx = 1.0D;
    localGridBagConstraints1.fill = 1;
    localGridBagConstraints1.insets = new Insets(0, 0, 0, 0);
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    JLabel localJLabel1 = new JLabel(ct.a(1893));
    JLabel localJLabel2 = new JLabel(ct.a(1928));
    JLabel localJLabel3 = new JLabel(ct.a(1894));
    localJLabel1.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    localJLabel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    JLabel localJLabel4 = new JLabel(ct.a(1895));
    f localf = f.a();
    this.p.addActionListener(new t(this));
    ArrayList localArrayList = localf.b;
    String[] arrayOfString = new String[0];
    int i1 = ((Integer)b.a("platform.eventsFromFilterKey")).intValue();
    if (i1 != 0)
      arrayOfString = ((g)localArrayList.get(i1)).b();
    Object localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext())
      this.p.addItem(((g)((Iterator)localObject).next()).a());
    localObject = null;
    if (arrayOfString.length > 0)
    {
      this.q.addItem("All");
      for (int i2 = 0; i2 < arrayOfString.length; i2++)
        this.q.addItem(localf.c.get(arrayOfString[i2]));
    }
    else
    {
      localCollection1 = localf.c.values();
      localObject = new String[localCollection1.size()];
      localCollection1.toArray(localObject);
      Arrays.sort(localObject);
      for (i3 = 0; i3 < localObject.length; i3++)
        this.q.addItem(localObject[i3]);
    }
    Collection localCollection1 = localf.e.values();
    localObject = new String[localCollection1.size()];
    localCollection1.toArray(localObject);
    Arrays.sort(localObject);
    for (int i3 = 0; i3 < localObject.length; i3++)
      this.t.addItem(localObject[i3]);
    GridLayout localGridLayout1 = new GridLayout(3, 1, 5, 5);
    JPanel localJPanel3 = new JPanel(localGridLayout1);
    JPanel localJPanel4 = new JPanel(localGridLayout1);
    localJPanel3.add(localJLabel2);
    localJPanel4.add(this.p);
    localJPanel3.add(localJLabel4);
    localJPanel4.add(this.t);
    localJPanel3.add(localJLabel3);
    localJPanel4.add(this.r);
    localJPanel2.add(localJPanel3, "Center");
    localJPanel2.add(localJPanel4, "After");
    localJPanel1.setBorder(BorderFactory.createTitledBorder(' ' + ct.a(1901) + ' '));
    localGridBagConstraints1.weightx = 1.0D;
    localGridBagConstraints1.gridwidth = -1;
    localJPanel1.add(localJPanel2, localGridBagConstraints1);
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    JLabel localJLabel5 = new JLabel(ct.a(1897));
    localJLabel5.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    Collection localCollection2 = localf.g.values();
    localObject = new String[localCollection2.size()];
    localCollection2.toArray(localObject);
    Arrays.sort(localObject);
    for (int i4 = 0; i4 < localObject.length; i4++)
      this.r.addItem(localObject[i4]);
    Set localSet = localf.i.keySet();
    localObject = new String[localSet.size()];
    localSet.toArray(localObject);
    Arrays.sort(localObject);
    for (int i5 = 0; i5 < localObject.length; i5++)
      this.s.addItem(localf.i.get(localObject[i5]));
    GridLayout localGridLayout2 = new GridLayout(3, 1, 5, 5);
    JPanel localJPanel6 = new JPanel(localGridLayout2);
    JPanel localJPanel7 = new JPanel(localGridLayout2);
    localJPanel6.add(localJLabel1);
    localJPanel7.add(this.q);
    localJPanel6.add(localJLabel5);
    localJPanel7.add(this.s);
    localJPanel5.add(localJPanel6, "Center");
    localJPanel5.add(localJPanel7, "After");
    localGridBagConstraints1.weightx = 1.0D;
    localGridBagConstraints1.gridwidth = 0;
    localJPanel1.add(localJPanel5, localGridBagConstraints1);
    JPanel localJPanel8 = new JPanel();
    GridBagLayout localGridBagLayout1 = new GridBagLayout();
    localJPanel8.setLayout(localGridBagLayout1);
    GridBagConstraints localGridBagConstraints2 = new GridBagConstraints();
    c();
    localJPanel8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(10, 65, 0, 0), ct.a(1917)));
    cd localcd = new cd(this.i);
    localcd.getViewport().setBackground(Color.WHITE);
    localcd.setPreferredSize(new Dimension(220, 100));
    localGridBagConstraints2.weightx = 1.0D;
    localGridBagConstraints2.fill = 1;
    localGridBagConstraints2.gridwidth = -1;
    localJPanel8.add(localcd, localGridBagConstraints2);
    JPanel localJPanel9 = new JPanel();
    GridBagLayout localGridBagLayout2 = new GridBagLayout();
    localJPanel9.setLayout(localGridBagLayout2);
    GridBagConstraints localGridBagConstraints3 = new GridBagConstraints();
    localGridBagConstraints3.insets = new Insets(10, 0, 0, 0);
    localGridBagConstraints3.weightx = 0.0D;
    localGridBagConstraints3.fill = 1;
    localGridBagConstraints3.gridwidth = 0;
    this.f = new JButton(ct.a(1915));
    this.f.addActionListener(new v(this));
    this.g = new JButton(ct.a(1913));
    this.g.addActionListener(new x(this));
    this.h = new JButton(ct.a(1914));
    this.h.addActionListener(new y(this));
    localJPanel9.add(this.f, localGridBagConstraints3);
    localJPanel9.add(this.g, localGridBagConstraints3);
    localJPanel9.add(this.h, localGridBagConstraints3);
    localGridBagConstraints2.weightx = 1.0D;
    localGridBagConstraints2.fill = 1;
    localGridBagConstraints2.gridwidth = -1;
    localJPanel8.add(localJPanel9, localGridBagConstraints2);
    localGridBagConstraints1.weightx = 1.0D;
    localGridBagConstraints1.gridwidth = 0;
    localJPanel1.add(localJPanel8, localGridBagConstraints1);
    localJPanel1.validate();
    return (Component)localJPanel1;
  }

  private JTable c()
  {
    this.i = new JTable();
    this.i.getTableHeader().setReorderingAllowed(false);
    this.i.getTableHeader().setResizingAllowed(false);
    lb locallb = new lb(this);
    this.i.setModel(locallb);
    this.i.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(20);
    this.i.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(20);
    this.i.getTableHeader().getColumnModel().getColumn(1).setMinWidth(200);
    this.i.repaint();
    return this.i;
  }

  private JPanel d()
  {
    JPanel localJPanel1 = new JPanel();
    GridBagLayout localGridBagLayout = new GridBagLayout();
    localJPanel1.setLayout(localGridBagLayout);
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.gridwidth = -1;
    localJPanel1.setBorder(BorderFactory.createTitledBorder(' ' + ct.a(1902) + ' '));
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    localJPanel2.setLayout(new FlowLayout(0));
    com.zend.ide.p.z localz = new com.zend.ide.p.z(ct.a(1903) + ": ");
    localJPanel2.add(localz);
    q[] arrayOfq = p.a;
    for (int i1 = 0; i1 < arrayOfq.length; i1++)
      this.o.addItem(arrayOfq[i1]);
    localJPanel2.add(this.o);
    localJPanel2.add(this.n);
    localJPanel1.add(localJPanel2, localGridBagConstraints);
    return localJPanel1;
  }

  public boolean e()
  {
    return this.b;
  }

  private JPanel f()
  {
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(0, 7, 0, 7));
    localJPanel1.setLayout(new BorderLayout());
    JPanel localJPanel2 = new JPanel();
    JPanel localJPanel3 = new JPanel();
    this.c = new JButton(ct.a(116));
    this.c.addActionListener(new z(this));
    this.d = new JButton(ct.a(117));
    this.d.addActionListener(new ab(this));
    this.e = new JButton(ct.a(664));
    this.e.addActionListener(new bb(this));
    JButton[] arrayOfJButton = { this.c, this.d, this.h, this.f, this.g };
    com.zend.ide.p.e.d.b(arrayOfJButton);
    Dimension localDimension = new Dimension(this.e.getPreferredSize().width, this.c.getPreferredSize().height);
    this.e.setPreferredSize(localDimension);
    localJPanel2.add(this.c);
    localJPanel2.add(this.d);
    localJPanel3.add(this.e);
    localJPanel1.add(localJPanel2, "East");
    localJPanel1.add(localJPanel3, "West");
    return localJPanel1;
  }

  private void g()
  {
    s locals = s.a();
    locals.a = this.l.isSelected();
    locals.b = ((Integer)this.m.getValue()).intValue();
    locals.e = this.j.isSelected();
    try
    {
      locals.f = new Integer(this.k.getText()).intValue();
      if (locals.f == 0)
        locals.f = 1;
    }
    catch (Exception localException)
    {
      cl.a(localException);
      locals.f = 100;
    }
    locals.c = this.o.getSelectedIndex();
    locals.d = this.n.isSelected();
    f localf = f.a();
    locals.g = this.p.getSelectedIndex();
    locals.h = ((String)localf.d.get(this.q.getSelectedItem()));
    locals.i = ((String)localf.h.get(this.r.getSelectedItem()));
    locals.j = ((String)localf.f.get(this.t.getSelectedItem()));
    locals.k = ((String)localf.j.get(this.s.getSelectedItem()));
    r[] arrayOfr = locals.l;
    if ((arrayOfr != null) && (arrayOfr.length > 0))
    {
      lb locallb = (lb)this.i.getModel();
      for (int i1 = 0; i1 < arrayOfr.length; i1++)
        arrayOfr[i1].a(((Boolean)locallb.getValueAt(i1, 0)).booleanValue());
    }
  }

  private void h()
  {
    s locals = s.a();
    locals.b();
    this.l.setSelected(locals.a);
    this.m.setEnabled(this.l.isSelected());
    this.m.setValue(Integer.valueOf(locals.b));
    this.j.setSelected(locals.e);
    this.k.setEnabled(this.j.isSelected());
    this.k.setText("" + locals.f);
    int i1 = locals.c;
    this.o.setSelectedIndex(i1);
    this.n.setSelected(locals.d);
    f localf = f.a();
    int i2 = ((Integer)b.a("platform.eventsFromFilterKey")).intValue();
    this.p.setSelectedIndex(i2);
    this.q.setSelectedItem(localf.c.get(locals.h));
    this.r.setSelectedItem(localf.g.get(locals.i));
    this.t.setSelectedItem(localf.e.get(locals.j));
    this.s.setSelectedItem(localf.i.get(locals.k));
    r[] arrayOfr = locals.l;
    Object localObject;
    if ((arrayOfr != null) && (arrayOfr.length == 0))
    {
      localObject = new cb(this);
      new Thread((Runnable)localObject).start();
    }
    else if ((arrayOfr != null) && (arrayOfr.length > 0))
    {
      localObject = (lb)this.i.getModel();
      for (int i3 = 0; i3 < arrayOfr.length; i3++)
        ((lb)localObject).a(new Object[] { Boolean.valueOf(arrayOfr[i3].c()), arrayOfr[i3].b() });
      ((lb)localObject).fireTableDataChanged();
    }
  }

  private void i()
  {
    String str = this.u.d();
    com.zend.ide.zendPlatformIntegration.b.b.d locald = new com.zend.ide.zendPlatformIntegration.b.b.d(str, "servers");
    com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[] arrayOfc = (com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[])(com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.c[])this.u.a(locald);
    if (arrayOfc == null)
      return;
    r[] arrayOfr = new r[arrayOfc.length];
    for (int i1 = 0; i1 < arrayOfr.length; i1++)
      arrayOfr[i1] = new r(arrayOfc[i1], true);
    if ((arrayOfr != null) && (arrayOfr.length > 0))
    {
      lb locallb = (lb)this.i.getModel();
      locallb.a();
      for (int i2 = 0; i2 < arrayOfr.length; i2++)
        locallb.a(new Object[] { Boolean.valueOf(true), arrayOfr[i2].b() });
      locallb.fireTableDataChanged();
    }
    s.a().l = arrayOfr;
  }

  private void j()
  {
    s locals = s.a();
    locals.c();
    this.l.setSelected(locals.a);
    this.m.setEnabled(this.l.isSelected());
    this.m.setValue(Integer.valueOf(locals.b));
    this.j.setSelected(locals.e);
    this.k.setEnabled(this.j.isSelected());
    this.k.setText("" + locals.f);
    this.o.setSelectedIndex(locals.c);
    this.n.setSelected(locals.d);
    f localf = f.a();
    this.p.setSelectedIndex(0);
    this.q.setSelectedItem(localf.c.get(locals.h));
    this.r.setSelectedItem(localf.g.get(locals.i));
    this.t.setSelectedItem(localf.e.get(locals.j));
    this.s.setSelectedItem(localf.i.get(locals.k));
    a(true);
  }

  private void a(boolean paramBoolean)
  {
    lb locallb = (lb)this.i.getModel();
    int i1 = locallb.getRowCount();
    for (int i2 = 0; i2 < i1; i2++)
      locallb.setValueAt(new Boolean(paramBoolean), i2, 0);
    locallb.fireTableDataChanged();
  }

  private JPanel k()
  {
    JPanel localJPanel1 = new JPanel();
    GridBagLayout localGridBagLayout = new GridBagLayout();
    localJPanel1.setLayout(localGridBagLayout);
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.gridwidth = 0;
    localJPanel1.setBorder(BorderFactory.createTitledBorder(' ' + ct.a(1855) + ' '));
    this.j.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    localJPanel1.add(this.j, localGridBagConstraints);
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    localJPanel2.setLayout(new FlowLayout(0));
    com.zend.ide.p.z localz = new com.zend.ide.p.z(ct.a(1857));
    localz.setBorder(BorderFactory.createEmptyBorder(0, 13, 0, 0));
    localJPanel2.add(localz);
    this.j.addActionListener(new db(this));
    this.k.setColumns(3);
    localJPanel2.add(this.k);
    localJPanel1.add(localJPanel2, localGridBagConstraints);
    return localJPanel1;
  }

  private JPanel l()
  {
    JPanel localJPanel1 = new JPanel();
    GridBagLayout localGridBagLayout = new GridBagLayout();
    localJPanel1.setLayout(localGridBagLayout);
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.gridwidth = 0;
    localJPanel1.setBorder(BorderFactory.createTitledBorder(' ' + ct.a(1854) + ' '));
    this.l.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    localJPanel1.add(this.l, localGridBagConstraints);
    JPanel localJPanel2 = new JPanel();
    FlowLayout localFlowLayout = new FlowLayout(0);
    localJPanel2.setLayout(localFlowLayout);
    com.zend.ide.p.z localz1 = new com.zend.ide.p.z(ct.a(1852));
    localz1.setBorder(BorderFactory.createEmptyBorder(0, 13, 0, 0));
    localJPanel2.add(localz1);
    this.l.addActionListener(new u(this));
    Dimension localDimension = this.m.getPreferredSize();
    this.m.setPreferredSize(new Dimension(localDimension.width, 19));
    this.m.setFont(new Font("Ariel", 0, 12));
    localJPanel2.add(this.m);
    com.zend.ide.p.z localz2 = new com.zend.ide.p.z(ct.a(1853));
    localJPanel2.add(localz2);
    localJPanel1.add(localJPanel2, localGridBagConstraints);
    return localJPanel1;
  }

  static JComboBox a(ib paramib)
  {
    return paramib.q;
  }

  static void b(ib paramib)
  {
    paramib.i();
  }

  static void a(ib paramib, boolean paramBoolean)
  {
    paramib.a(paramBoolean);
  }

  static void c(ib paramib)
  {
    paramib.g();
  }

  static boolean b(ib paramib, boolean paramBoolean)
  {
    return paramib.b = paramBoolean;
  }

  static void d(ib paramib)
  {
    paramib.j();
  }

  static JCheckBox e(ib paramib)
  {
    return paramib.j;
  }

  static xc f(ib paramib)
  {
    return paramib.k;
  }

  static JCheckBox g(ib paramib)
  {
    return paramib.l;
  }

  static JSpinner h(ib paramib)
  {
    return paramib.m;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.ib
 * JD-Core Version:    0.6.0
 */