package com.zend.ide.d;

import com.zend.ide.p.a.d;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.bh;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.mc;
import com.zend.ide.y.a;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ca extends JPanel
  implements a, cu, bn
{
  private static final Dimension a = new Dimension(0, 5);
  private x b;
  private x c;
  private x d;
  private x r;
  private x e;
  private x f;
  private x g;
  private x h;
  private x I;
  private x u;
  private x i;
  private x j;
  private x k;
  private x l;
  private JTextField m;
  private JTextField n;
  private JTextField F;
  private JTextField o;
  private JTextField p;
  private JTextField q;
  private JTextField v;
  private z J;
  private z s;
  private z M;
  private z L;
  private JComboBox t;
  private JComboBox N;
  private com.zend.ide.p.bb O;
  private com.zend.ide.p.bb P;
  private com.zend.ide.p.bb w;
  private com.zend.ide.p.bb x;
  private bp y = null;
  private com.zend.ide.util.bb z;
  private String A = "propertyEditor";
  private bt B;
  private bw C;
  private String D = "http://";
  private String E = "https://";

  public ca()
  {
    m();
    this.z = new bx(this, null);
    bx.a((bx)this.z);
    this.B = new bt(this);
    k();
  }

  private void m()
  {
    this.C = new bw(this, null);
    bh[] arrayOfbh = bh.d();
    this.N = new JComboBox(arrayOfbh);
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    add(b(), "Center");
  }

  private JPanel b()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(5, 5));
    localJPanel.add(g(), "North");
    localJPanel.add(h(), "Center");
    localJPanel.add(i(), "South");
    return localJPanel;
  }

  private JPanel g()
  {
    JPanel localJPanel1 = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.insets = new Insets(3, 3, 3, 3);
    localGridBagConstraints.weightx = 1.0D;
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1535)));
    z localz1 = new z(ct.a(696));
    this.w = new com.zend.ide.p.bb(ct.a(1229));
    this.x = new com.zend.ide.p.bb(ct.a(1228));
    this.w.addActionListener(new gb(this, null));
    this.x.addActionListener(this.C);
    ButtonGroup localButtonGroup1 = new ButtonGroup();
    localButtonGroup1.add(this.w);
    localButtonGroup1.add(this.x);
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localz1, "West");
    localJPanel2.add(this.w, "Center");
    localJPanel2.add(this.x, "East");
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localJPanel1.add(localJPanel2, localGridBagConstraints);
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localJPanel1.add(localJPanel2, localGridBagConstraints);
    this.s = new z(ct.a(693));
    this.t = new JComboBox();
    DefaultComboBoxModel localDefaultComboBoxModel = new DefaultComboBoxModel();
    localDefaultComboBoxModel.insertElementAt(this.E, 0);
    localDefaultComboBoxModel.insertElementAt(this.D, 0);
    this.t.setModel(localDefaultComboBoxModel);
    this.t.setSelectedIndex(0);
    this.m = new cb(30);
    JPanel localJPanel3 = new JPanel(new BorderLayout(4, 0));
    localJPanel3.add(this.t, "West");
    localJPanel3.add(this.m, "Center");
    this.m.setMinimumSize(new Dimension(150, (int)this.m.getPreferredSize().getHeight()));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    localJPanel1.add(this.s, localGridBagConstraints);
    localGridBagConstraints.ipadx = 100;
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 2;
    localJPanel1.add(localJPanel3, localGridBagConstraints);
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    this.M = new z(ct.a(1137));
    localJPanel4.setAlignmentX(0.0F);
    ButtonGroup localButtonGroup2 = new ButtonGroup();
    this.O = new com.zend.ide.p.bb(ct.a(37));
    this.P = new com.zend.ide.p.bb(ct.a(1134));
    localButtonGroup2.add(this.O);
    localButtonGroup2.add(this.P);
    this.P.addActionListener(new cc(this, null));
    this.O.addActionListener(this.C);
    localJPanel4.add(this.M, "West");
    localJPanel4.add(this.O, "Center");
    localJPanel4.add(this.P, "East");
    this.v = new cb(10);
    this.v.setMinimumSize(new Dimension(70, (int)this.v.getPreferredSize().getHeight()));
    localGridBagConstraints.ipadx = 0;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 3;
    localJPanel1.add(localJPanel4, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 3;
    localJPanel1.add(this.v, localGridBagConstraints);
    this.L = new z(ct.a(45) + ":");
    this.o = new cb(10);
    this.o.setMinimumSize(new Dimension(70, (int)this.o.getPreferredSize().getHeight()));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 4;
    localJPanel1.add(this.L, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 4;
    localJPanel1.add(this.o, localGridBagConstraints);
    z localz2 = new z(ct.a(41) + ":");
    this.n = new cb(new d(5), "", 10);
    this.n.setMinimumSize(new Dimension(70, (int)this.n.getPreferredSize().getHeight()));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 5;
    localJPanel1.add(localz2, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 5;
    localJPanel1.add(this.n, localGridBagConstraints);
    z localz3 = new z(ct.a(1437));
    this.F = new cb(new d(5), "", 10);
    this.F.setMinimumSize(new Dimension(70, (int)this.F.getPreferredSize().getHeight()));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 6;
    localJPanel1.add(localz3, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 6;
    localJPanel1.add(this.F, localGridBagConstraints);
    this.J = new z(ct.a(1140));
    this.q = new cb(new d(), "", 10);
    this.q.setMinimumSize(new Dimension(70, (int)this.q.getPreferredSize().getHeight()));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 7;
    localJPanel1.add(this.J, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 7;
    localJPanel1.add(this.q, localGridBagConstraints);
    this.l = new x(ct.a(1141));
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    localGridBagConstraints.insets = new Insets(3, 0, 3, 3);
    localJPanel5.add(this.l, "West");
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 8;
    localJPanel1.add(this.l, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(3, 3, 3, 3);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 8;
    localJPanel1.add(mc.b(), localGridBagConstraints);
    return localJPanel1;
  }

  private JPanel h()
  {
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setLayout(new BoxLayout(localJPanel1, 1));
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1139)));
    this.p = new cb(30);
    this.p.setEditable(false);
    w localw = new w();
    localw.setText("...");
    localw.setPreferredSize(new Dimension((int)localw.getPreferredSize().getWidth(), (int)this.p.getPreferredSize().getHeight()));
    localw.addActionListener(new bv(this));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    z localz = new z(ct.a(658) + ":  ");
    localJPanel2.add(localz, "West");
    localJPanel2.add(this.p, "Center");
    localJPanel2.add(localw, "East");
    localJPanel2.setAlignmentX(0.0F);
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    localJPanel2.setMaximumSize(new Dimension(700, (int)this.p.getPreferredSize().getHeight()));
    localJPanel1.add(localJPanel2);
    this.b = new x(ct.a(44));
    localJPanel1.add(this.b);
    this.c = new x(ct.a(731));
    localJPanel1.add(this.c);
    this.d = new x(ct.a(48));
    localJPanel1.add(this.d);
    JPanel localJPanel3 = new JPanel(new FlowLayout(0, 0, 0));
    this.r = new x(ct.a(1292));
    this.r.addActionListener(this.C);
    localJPanel3.add(this.r);
    localJPanel3.add(this.N);
    localJPanel3.setAlignmentX(0.0F);
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.add(localJPanel3);
    localJPanel1.add(Box.createRigidArea(a));
    return localJPanel1;
  }

  private JPanel i()
  {
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setLayout(new GridLayout(4, 1));
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1136)));
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setLayout(new GridLayout(5, 1));
    localJPanel2.setBorder(BorderFactory.createTitledBorder(ct.a(1135)));
    this.e = new x(ct.a(486));
    localJPanel2.add(this.e);
    this.f = new x(ct.a(487));
    localJPanel2.add(this.f);
    this.g = new x(ct.a(488));
    localJPanel2.add(this.g);
    this.h = new x(ct.a(489));
    localJPanel2.add(this.h);
    this.I = new x(ct.a(1264));
    localJPanel2.add(this.I);
    this.u = new x(ct.a(1288));
    localJPanel1.add(this.u);
    this.i = new x(ct.a(543));
    localJPanel1.add(this.i);
    this.j = new x(ct.a(544));
    localJPanel1.add(this.j);
    this.k = new x(ct.a(545));
    localJPanel1.add(this.k);
    JPanel localJPanel3 = new JPanel(new GridLayout(1, 2, 5, 5));
    localJPanel3.add(localJPanel2);
    localJPanel3.add(localJPanel1);
    return localJPanel3;
  }

  private bp j()
  {
    if (this.y == null)
    {
      this.y = new bp(false);
      this.y.setMultiSelectionEnabled(false);
      this.y.setFileSelectionMode(1);
      this.y.setApproveButtonText(ct.a(116));
      this.y.setDialogTitle(ct.a(159));
    }
    return this.y;
  }

  private void k()
  {
    boolean bool = this.w.isSelected();
    this.m.setEnabled(bool);
    this.t.setEnabled(bool);
    this.s.setEnabled(bool);
    this.x.setSelected(!bool);
    this.P.setSelected(!this.O.isSelected());
    this.v.setEnabled(!this.O.isSelected());
    this.M.setEnabled(bool);
    this.O.setEnabled(bool);
    this.P.setEnabled(bool);
    this.v.setEnabled(bool);
    this.L.setEnabled(bool);
    this.o.setEnabled(bool);
    this.J.setEnabled(bool);
    this.q.setEnabled(bool);
    this.l.setEnabled(bool);
    if (!bool)
      this.l.setSelected(false);
    this.N.setEnabled(this.r.isSelected());
  }

  private static Integer a(JTextField paramJTextField)
  {
    String str = paramJTextField.getText();
    try
    {
      return new Integer(str);
    }
    catch (Exception localException)
    {
    }
    return new Integer(0);
  }

  public void d()
  {
    String str = this.t.getSelectedItem().toString() + this.m.getText();
    b.a("debugging.localDebugging").a(new Boolean(this.w.isSelected()));
    b.a("debugging.showHeader").a(new Boolean(this.b.isSelected()));
    b.a("debugging.firstLineBreakpoint").a(new Boolean(this.c.isSelected()));
    b.a("debugging.variableDisplay").a(new Boolean(this.d.isSelected()));
    b.a("debugging.useOutputEncoding").a(new Boolean(this.r.isSelected()));
    b.a("debugging.outputEncoding").a((bh)this.N.getSelectedItem());
    b.a("debugging.startEndFilter").a(new Boolean(this.e.isSelected()));
    b.a("debugging.noticesdFilter").a(new Boolean(this.f.isSelected()));
    b.a("debugging.warningFilter").a(new Boolean(this.g.isSelected()));
    b.a("debugging.errorFilter").a(new Boolean(this.h.isSelected()));
    b.a("debugging.strictFilter").a(new Boolean(this.I.isSelected()));
    b.a("debugging.grabFocusOnDebugSession").a(new Boolean(this.u.isSelected()));
    b.a("debugging.autoOpenDebugWindow").a(new Boolean(this.i.isSelected()));
    b.a("debugging.autoOpenDebugMessagesWindow").a(new Boolean(this.j.isSelected()));
    b.a("debugging.autoOpenOutputWindow").a(new Boolean(this.k.isSelected()));
    b.a("debugging.useDefaultClientIP").a(new Boolean(this.O.isSelected()));
    b.a("debugging.encryptedData").a(new Boolean(this.l.isSelected()));
    b.a("debugging.customizedClientIP").a(this.v.getText());
    b.a("debugging.serverHost").a(new com.zend.ide.util.bv(str));
    b.a("debugging.dummyFile").a(this.o.getText());
    b.a("debugging.tempFilesLocation").a(new File(this.p.getText()));
    b.a("debugging.debugPort").a(a(this.n));
    b.a("debugging.httpServerPort").a(a(this.F));
    b.a("debugging.serverResponseTimeout").a(a(this.q));
    f();
  }

  public void f()
  {
    boolean bool1 = ((Boolean)b.a("debugging.localDebugging").c()).booleanValue();
    if (bool1)
      this.w.setSelected(true);
    else
      this.x.setSelected(true);
    boolean bool2 = ((Boolean)b.a("debugging.useDefaultClientIP").c()).booleanValue();
    if (bool2)
      this.O.setSelected(true);
    else
      this.P.setSelected(true);
    this.b.setSelected(((Boolean)b.a("debugging.showHeader").c()).booleanValue());
    this.c.setSelected(((Boolean)b.a("debugging.firstLineBreakpoint").c()).booleanValue());
    this.d.setSelected(((Boolean)b.a("debugging.variableDisplay").c()).booleanValue());
    this.r.setSelected(((Boolean)b.a("debugging.useOutputEncoding").c()).booleanValue());
    this.N.setSelectedItem(b.a("debugging.outputEncoding").c());
    this.e.setSelected(((Boolean)b.a("debugging.startEndFilter").c()).booleanValue());
    this.f.setSelected(((Boolean)b.a("debugging.noticesdFilter").c()).booleanValue());
    this.g.setSelected(((Boolean)b.a("debugging.warningFilter").c()).booleanValue());
    this.h.setSelected(((Boolean)b.a("debugging.errorFilter").c()).booleanValue());
    this.I.setSelected(((Boolean)b.a("debugging.strictFilter").c()).booleanValue());
    this.u.setSelected(((Boolean)b.a("debugging.grabFocusOnDebugSession").c()).booleanValue());
    this.i.setSelected(((Boolean)b.a("debugging.autoOpenDebugWindow").c()).booleanValue());
    this.i.setSelected(((Boolean)b.a("debugging.autoOpenDebugWindow").c()).booleanValue());
    this.j.setSelected(((Boolean)b.a("debugging.autoOpenDebugMessagesWindow").c()).booleanValue());
    this.k.setSelected(((Boolean)b.a("debugging.autoOpenOutputWindow").c()).booleanValue());
    this.l.setSelected(((Boolean)b.a("debugging.encryptedData").c()).booleanValue());
    this.v.setText(b.a("debugging.customizedClientIP").c().toString());
    this.n.setText(b.a("debugging.debugPort").c().toString());
    this.F.setText(b.a("debugging.httpServerPort").c().toString());
    this.o.setText(b.a("debugging.dummyFile").c().toString());
    this.p.setText(new File(b.a("debugging.tempFilesLocation").c().toString()).getAbsolutePath());
    this.q.setText(b.a("debugging.serverResponseTimeout").c().toString());
    String str = b.a("debugging.serverHost").c().toString();
    b(str);
    k();
  }

  private void l()
  {
    this.w.setSelected(((Boolean)b.a("debugging.localDebugging").b()).booleanValue());
    this.b.setSelected(((Boolean)b.a("debugging.showHeader").b()).booleanValue());
    this.c.setSelected(((Boolean)b.a("debugging.firstLineBreakpoint").b()).booleanValue());
    this.d.setSelected(((Boolean)b.a("debugging.variableDisplay").b()).booleanValue());
    this.r.setSelected(((Boolean)b.a("debugging.useOutputEncoding").b()).booleanValue());
    this.N.setSelectedItem(b.a("debugging.outputEncoding").b());
    this.e.setSelected(((Boolean)b.a("debugging.startEndFilter").b()).booleanValue());
    this.f.setSelected(((Boolean)b.a("debugging.noticesdFilter").b()).booleanValue());
    this.g.setSelected(((Boolean)b.a("debugging.warningFilter").b()).booleanValue());
    this.h.setSelected(((Boolean)b.a("debugging.errorFilter").b()).booleanValue());
    this.I.setSelected(((Boolean)b.a("debugging.strictFilter").b()).booleanValue());
    this.u.setSelected(((Boolean)b.a("debugging.grabFocusOnDebugSession").b()).booleanValue());
    this.i.setSelected(((Boolean)b.a("debugging.autoOpenDebugWindow").b()).booleanValue());
    this.j.setSelected(((Boolean)b.a("debugging.autoOpenDebugMessagesWindow").b()).booleanValue());
    this.k.setSelected(((Boolean)b.a("debugging.autoOpenOutputWindow").b()).booleanValue());
    this.O.setSelected(((Boolean)b.a("debugging.useDefaultClientIP").b()).booleanValue());
    this.l.setSelected(((Boolean)b.a("debugging.encryptedData").b()).booleanValue());
    this.v.setText(b.a("debugging.customizedClientIP").b().toString());
    this.n.setText(b.a("debugging.debugPort").b().toString());
    this.F.setText(b.a("debugging.httpServerPort").b().toString());
    this.o.setText(b.a("debugging.dummyFile").b().toString());
    this.p.setText(new File(b.a("debugging.tempFilesLocation").b().toString()).getAbsolutePath());
    this.q.setText(b.a("debugging.serverResponseTimeout").b().toString());
    String str = b.a("debugging.serverHost").b().toString();
    b(str);
    k();
  }

  private void b(String paramString)
  {
    if (paramString.startsWith(this.E))
    {
      this.t.setSelectedItem(this.E);
      this.m.setText(paramString.substring(this.E.length()));
    }
    else
    {
      this.t.setSelectedItem(this.D);
      if (paramString.startsWith(this.D))
        this.m.setText(paramString.substring(this.D.length()));
    }
    k();
  }

  public void a(String paramString)
  {
  }

  public void e()
  {
  }

  public JComponent c()
  {
    return this;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.B.d(paramBoolean);
  }

  public com.zend.ide.util.bb q()
  {
    return this.z;
  }

  public void d(String paramString)
  {
    this.A = paramString;
  }

  public String r()
  {
    return this.A;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    this.z.a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bs t()
  {
    return this.B;
  }

  static bp c(ca paramca)
  {
    return paramca.j();
  }

  static JTextField d(ca paramca)
  {
    return paramca.p;
  }

  static void a(ca paramca)
  {
    paramca.k();
  }

  static com.zend.ide.p.bb b(ca paramca)
  {
    return paramca.x;
  }

  static JTextField e(ca paramca)
  {
    return paramca.v;
  }

  static void f(ca paramca)
  {
    paramca.l();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ca
 * JD-Core Version:    0.6.0
 */