package com.zend.ide.db;

import com.zend.ide.bc.a;
import com.zend.ide.i.n;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class x extends n
  implements cu
{
  private int c;
  private b d = new b();
  private static Object[] e;
  private JRadioButton b;
  private JRadioButton f;
  private com.zend.ide.p.x g;
  private com.zend.ide.p.x h;
  private com.zend.ide.p.x i;
  private com.zend.ide.p.x j;
  private com.zend.ide.p.x k;
  private JTextField n;
  private JTextField l;
  private JTextField m;
  private JTextField o;
  private JTextField t;
  private JTextField p;
  private JTextField q;
  private JTextField r;
  private JTextField s;
  private bp u;
  private bp v;
  private w w;
  private w A;
  private JComboBox B;
  private JList x;
  private JList y;
  private JList z;
  private JPanel E;
  private y F;
  private JPanel C;
  private jb D;
  private jb G;
  private jb H;
  private jb I;
  private jb J;
  private w K;
  private w L;
  private w M;
  private w N;
  private int O = 0;
  private jb[] P;
  private z Q;
  private JLabel R;
  private JPanel S;
  private static Dimension T = new Dimension(20, 20);
  private JComboBox U;
  private JLabel V;
  private bh[] W;
  private bh X;

  public x(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(1332));
    c();
    s();
    a(this.b.isSelected());
    a.a(this, "PHP_DOCUMENTOR_WIZARD");
  }

  private void a()
  {
    if ((this.b.isSelected()) && (!this.l.getText().equals("")))
      a(this.l.getText());
    else
      m();
  }

  private void c()
  {
    this.C = new JPanel(new BorderLayout());
    this.C.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    this.X = bh.a;
    d();
    e();
    f();
    getContentPane().add(this.C, "Center");
    getContentPane().add(this.E, "South");
    getContentPane().add(this.S, "West");
    setModal(true);
    setSize(530, 430);
    setResizable(false);
    Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension localDimension2 = getSize();
    setLocation(localDimension1.width / 2 - localDimension2.width / 2, localDimension1.height / 2 - localDimension2.height / 2);
  }

  private void d()
  {
    g();
    h();
    i();
    j();
    k();
    this.P = new jb[] { this.D, this.G, this.H, this.I, this.J };
  }

  private void e()
  {
    this.E = new JPanel(new FlowLayout(2));
    this.K = new w(ct.b(117));
    this.L = new w(ct.b(699));
    this.M = new w(ct.b(700));
    this.N = new w(ct.b(701));
    this.K.addActionListener(new c(this));
    this.L.addActionListener(new d(this));
    this.M.addActionListener(new e(this));
    this.N.addActionListener(new f(this));
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new g(this));
    this.E.add(this.M);
    this.E.add(this.N);
    this.E.add(this.L);
    this.E.add(this.K);
    this.E.add(localJButton);
  }

  private void f()
  {
    this.Q = new z(ct.a(1408));
    this.Q.setForeground(com.zend.ide.p.e.b.b);
    this.Q.setFont(this.Q.getFont().deriveFont(1));
    JPanel localJPanel = new JPanel(new FlowLayout(1));
    localJPanel.add(this.Q);
    this.R = new JLabel(cv.b("phpdocumentor/documentor_img.gif"), 0);
    this.S = new JPanel(new BorderLayout());
    this.S.add(this.R, "Center");
    this.S.add(localJPanel, "North");
    this.S.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black)));
  }

  private void g()
  {
    this.b = new JRadioButton(ct.a(1315));
    this.b.addItemListener(new h(this));
    this.f = new JRadioButton(ct.a(1407));
    this.f.setSelected(true);
    this.f.addItemListener(new i(this));
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.f);
    localButtonGroup.add(this.b);
    this.l = new JTextField();
    this.W = bh.d();
    this.U = new JComboBox(this.W);
    this.U.setEnabled(false);
    this.A = g();
    this.A.addActionListener(new j(this));
    this.D = new k(this, new BorderLayout());
    JTextArea localJTextArea = new JTextArea(ct.a(1412));
    localJTextArea.setFocusable(false);
    localJTextArea.setBackground(this.D.getBackground());
    localJTextArea.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
    localJTextArea.setEditable(false);
    localJTextArea.setLineWrap(true);
    localJTextArea.setWrapStyleWord(true);
    JLabel localJLabel = new JLabel(ct.a(1410));
    JPanel localJPanel = new JPanel(new GridBagLayout());
    localJPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridwidth = 0;
    localJPanel.add(localJTextArea, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(20, 0, 0, 0);
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridwidth = 0;
    localJPanel.add(this.f, localGridBagConstraints);
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localJPanel.add(localJLabel, localGridBagConstraints);
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localJPanel.add(this.b, localGridBagConstraints);
    localGridBagConstraints.gridwidth = -1;
    localGridBagConstraints.weightx = 5.0D;
    localGridBagConstraints.weighty = 40000.0D;
    localGridBagConstraints.insets = new Insets(8, 3, 0, 0);
    localGridBagConstraints.fill = 2;
    localJPanel.add(this.l, localGridBagConstraints);
    localGridBagConstraints.fill = 0;
    localGridBagConstraints.weightx = 0.0D;
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.insets = new Insets(8, 5, 0, 0);
    localJPanel.add(this.A, localGridBagConstraints);
    this.D.add(localJPanel, "Center");
    this.C.add(this.D, "Center");
  }

  private void h()
  {
    this.G = new jb(this, new BorderLayout());
    this.G.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.x = new ib(this, new DefaultListModel());
    this.x.getModel().addListDataListener(new gb(this));
    this.y = new ib(this, new DefaultListModel());
    this.y.getModel().addListDataListener(new gb(this));
    this.z = new ib(this, new DefaultListModel());
    this.o = new JTextField();
    this.t = new JTextField();
    z localz1 = new z(ct.a(1317));
    z localz2 = new z(ct.a(1318));
    z localz3 = new z(ct.a(1319));
    z localz4 = new z(ct.a(1320));
    z localz5 = new z(ct.a(1321));
    w localw1 = a(this.x, 0);
    w localw2 = a(this.x);
    w localw3 = a(this.y, 1);
    w localw4 = a(this.y);
    w localw5 = a(this.z, 0);
    w localw6 = a(this.z);
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.add(localz1, "North");
    localJPanel1.add(new JScrollPane(this.x), "Center");
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    Box localBox = new Box(1);
    localBox.add(Box.createHorizontalStrut(20));
    localBox.add(localw1);
    localBox.add(Box.createVerticalStrut(4));
    localBox.add(Box.createHorizontalStrut(20));
    localBox.add(localw2);
    localJPanel2.add(localBox, "North");
    localJPanel1.add(localJPanel2, "East");
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.add(localz2, "North");
    localJPanel3.add(new JScrollPane(this.y), "Center");
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    localBox = new Box(1);
    localBox.add(Box.createHorizontalStrut(20));
    localBox.add(localw3);
    localBox.add(Box.createVerticalStrut(4));
    localBox.add(Box.createHorizontalStrut(20));
    localBox.add(localw4);
    localJPanel4.add(localBox, "North");
    localJPanel3.add(localJPanel4, "East");
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    localJPanel5.add(localz3, "North");
    localJPanel5.add(new JScrollPane(this.z), "Center");
    JPanel localJPanel6 = new JPanel(new BorderLayout());
    localBox = new Box(1);
    localBox.add(Box.createHorizontalStrut(20));
    localBox.add(localw5);
    localBox.add(Box.createVerticalStrut(4));
    localBox.add(Box.createHorizontalStrut(20));
    localBox.add(localw6);
    localJPanel6.add(localBox, "North");
    localJPanel5.add(localJPanel6, "East");
    JPanel localJPanel7 = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.gridx = 0;
    localJPanel7.add(localz4, localGridBagConstraints);
    localGridBagConstraints.weighty = 10.0D;
    localJPanel7.add(this.t, localGridBagConstraints);
    JPanel localJPanel8 = new JPanel(new GridBagLayout());
    localGridBagConstraints.weighty = 1.0D;
    localJPanel8.add(localz5, localGridBagConstraints);
    localGridBagConstraints.weighty = 10.0D;
    localJPanel8.add(this.o, localGridBagConstraints);
    localBox = new Box(1);
    localBox.add(localJPanel1, localGridBagConstraints);
    localBox.add(localJPanel3, localGridBagConstraints);
    localBox.add(localJPanel5, localGridBagConstraints);
    localBox.add(localJPanel7, localGridBagConstraints);
    localBox.add(localJPanel8, localGridBagConstraints);
    this.G.add(localBox, "Center");
  }

  private void i()
  {
    this.B = new JComboBox(h());
    this.m = new JTextField();
    this.m.setEditable(false);
    z localz1 = new z(ct.a(1322));
    localz1.setLabelFor(this.m);
    this.H = new jb(this, new BorderLayout());
    z localz2 = new z(ct.a(1323));
    localz2.setLabelFor(this.B);
    w localw = g();
    localw.addActionListener(new bb(this));
    l();
    this.F = new y(this, null);
    this.B.addItemListener(new cb(this));
    String str = "phpdocumentor/" + e[this.B.getSelectedIndex()];
    try
    {
      this.F.a(cv.b(str));
    }
    catch (Exception localException)
    {
      cl.a("Could not load image: " + str);
      cl.a(localException);
    }
    JPanel localJPanel1 = new JPanel(new GridBagLayout());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.ipady = 10;
    localGridBagConstraints.ipadx = 10;
    localJPanel1.add(localz1, localGridBagConstraints);
    localGridBagConstraints.gridwidth = -1;
    localGridBagConstraints.ipady = 0;
    localGridBagConstraints.weightx = 1.0D;
    localJPanel1.add(this.m, localGridBagConstraints);
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.fill = 0;
    localGridBagConstraints.weightx = 0.0D;
    localGridBagConstraints.weighty = 3800.0D;
    localGridBagConstraints.insets = new Insets(0, 5, 0, 0);
    localJPanel1.add(localw, localGridBagConstraints);
    JPanel localJPanel2 = new JPanel(new FlowLayout(0));
    Box localBox = new Box(1);
    localJPanel2.add(localz2);
    localBox.add(localJPanel2);
    localBox.add(this.B);
    localGridBagConstraints.weighty = 10000.0D;
    localJPanel1.add(localBox, localGridBagConstraints);
    localGridBagConstraints.weighty = 1000000.0D;
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.insets = new Insets(10, 0, 0, 0);
    localJPanel1.add(this.F, localGridBagConstraints);
    this.H.add(localJPanel1, "Center");
  }

  private void j()
  {
    this.I = new jb(this, new GridBagLayout());
    z localz1 = new z(ct.a(1324));
    this.p = new JTextField();
    localz1.setLabelFor(this.p);
    z localz2 = new z(ct.a(1325));
    this.q = new JTextField();
    localz2.setLabelFor(this.q);
    z localz3 = new z(ct.a(1326));
    this.r = new JTextField();
    localz3.setLabelFor(this.r);
    z localz4 = new z(ct.a(1327));
    this.s = new JTextField();
    localz4.setLabelFor(this.s);
    this.h = new com.zend.ide.p.x(ct.a(1328));
    this.i = new com.zend.ide.p.x(ct.a(1329));
    this.j = new com.zend.ide.p.x(ct.a(1330));
    this.k = new com.zend.ide.p.x(ct.a(1331));
    JPanel localJPanel1 = new JPanel(new GridBagLayout());
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1000.0D;
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.gridx = 0;
    localJPanel1.add(localz1, localGridBagConstraints);
    localGridBagConstraints.weighty = 100000.0D;
    localJPanel1.add(this.p, localGridBagConstraints);
    JPanel localJPanel2 = new JPanel(new GridBagLayout());
    localGridBagConstraints.weighty = 1000.0D;
    localJPanel2.add(localz2, localGridBagConstraints);
    localGridBagConstraints.weighty = 100000.0D;
    localJPanel2.add(this.q, localGridBagConstraints);
    JPanel localJPanel3 = new JPanel(new GridBagLayout());
    localGridBagConstraints.weighty = 1000.0D;
    localJPanel3.add(localz3, localGridBagConstraints);
    localGridBagConstraints.weighty = 100000.0D;
    localJPanel3.add(this.r, localGridBagConstraints);
    JPanel localJPanel4 = new JPanel(new GridBagLayout());
    localGridBagConstraints.weighty = 1000.0D;
    localJPanel4.add(localz4, localGridBagConstraints);
    localGridBagConstraints.weighty = 100000.0D;
    localJPanel4.add(this.s, localGridBagConstraints);
    JPanel localJPanel5 = new JPanel(new FlowLayout(0));
    localJPanel5.add(this.h);
    JPanel localJPanel6 = new JPanel(new FlowLayout(0));
    localJPanel6.add(this.j);
    JPanel localJPanel7 = new JPanel(new FlowLayout(0));
    localJPanel7.add(this.i);
    JPanel localJPanel8 = new JPanel(new FlowLayout(0));
    localJPanel8.add(this.k);
    localGridBagConstraints.weighty = 1.0D;
    this.I.add(localJPanel1, localGridBagConstraints);
    localGridBagConstraints.weighty = 10.0D;
    this.I.add(localJPanel2, localGridBagConstraints);
    localGridBagConstraints.weighty = 100.0D;
    this.I.add(localJPanel3, localGridBagConstraints);
    localGridBagConstraints.weighty = 1000.0D;
    this.I.add(localJPanel4, localGridBagConstraints);
    localGridBagConstraints.weighty = 10000.0D;
    this.I.add(localJPanel5, localGridBagConstraints);
    localGridBagConstraints.weighty = 100000.0D;
    this.I.add(localJPanel6, localGridBagConstraints);
    localGridBagConstraints.weighty = 1000000.0D;
    this.I.add(localJPanel7, localGridBagConstraints);
    localGridBagConstraints.weighty = 100000000.0D;
    this.I.add(localJPanel8, localGridBagConstraints);
    this.I.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
  }

  private void k()
  {
    this.J = new jb(this, new BorderLayout());
    this.V = new JLabel(ct.a(1583));
    this.V.setEnabled(false);
    this.g = new com.zend.ide.p.x(ct.a(1411));
    this.g.addActionListener(new db(this));
    this.n = new JTextField();
    this.n.setEditable(false);
    this.w = g();
    this.w.addActionListener(new eb(this));
    this.n.setEnabled(false);
    this.w.setEnabled(false);
    JPanel localJPanel1 = new JPanel(new GridBagLayout());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    JTextArea localJTextArea = new JTextArea(ct.a(1413));
    localJTextArea.setFocusable(false);
    localJTextArea.setBackground(this.J.getBackground());
    localJTextArea.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
    localJTextArea.setEditable(false);
    localJTextArea.setLineWrap(true);
    localJTextArea.setWrapStyleWord(true);
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridwidth = 0;
    localJPanel1.add(localJTextArea, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(30, 0, 0, 0);
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localJPanel1.add(this.g, localGridBagConstraints);
    localGridBagConstraints.gridwidth = -1;
    localGridBagConstraints.weightx = 5.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.insets = new Insets(8, 3, 0, 0);
    localGridBagConstraints.fill = 2;
    localJPanel1.add(this.n, localGridBagConstraints);
    localGridBagConstraints.fill = 0;
    localGridBagConstraints.weightx = 0.0D;
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.insets = new Insets(8, 5, 0, 0);
    localJPanel1.add(this.w, localGridBagConstraints);
    localGridBagConstraints.weighty = 10.0D;
    localGridBagConstraints.insets = new Insets(0, 0, 0, 0);
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.fill = 0;
    localGridBagConstraints.gridwidth = -1;
    JPanel localJPanel2 = new JPanel(new FlowLayout(0));
    localJPanel2.add(this.V);
    localJPanel2.add(this.U);
    localJPanel1.add(localJPanel2, localGridBagConstraints);
    this.J.add(localJPanel1, "Center");
  }

  private w g()
  {
    w localw = new w("...");
    int i1 = this.l.getPreferredSize().height;
    localw.setPreferredSize(new Dimension(40, i1));
    localw.setMaximumSize(new Dimension(40, i1));
    return localw;
  }

  private w a(JList paramJList, int paramInt)
  {
    w localw = new w(cv.b("phpdocumentor/plus.gif"));
    localw.setPreferredSize(T);
    localw.setToolTipText(ct.a(8));
    localw.setPreferredSize(T);
    localw.setMaximumSize(T);
    localw.addActionListener(new fb(this, paramInt, paramJList));
    return localw;
  }

  private w a(JList paramJList)
  {
    w localw = new w(cv.b("phpdocumentor/minus.gif"));
    localw.setPreferredSize(T);
    localw.setToolTipText(ct.a(310));
    localw.setMaximumSize(T);
    localw.addActionListener(new kb(this, paramJList));
    return localw;
  }

  private void m()
  {
    this.p.setText("");
    this.t.setText("");
    this.o.setText("");
    this.B.setSelectedIndex(0);
    this.s.setText("");
    this.q.setText("");
    this.r.setText("");
    this.m.setText("");
    this.h.setSelected(false);
    this.j.setSelected(false);
    this.i.setSelected(false);
    this.k.setSelected(false);
    this.g.setSelected(false);
    this.n.setEnabled(false);
    this.n.setEditable(false);
    this.U.setEnabled(false);
    this.V.setEnabled(false);
    this.w.setEnabled(false);
    ((DefaultListModel)this.x.getModel()).removeAllElements();
    ((DefaultListModel)this.y.getModel()).removeAllElements();
    ((DefaultListModel)this.z.getModel()).removeAllElements();
    p();
  }

  private bp a(int paramInt)
  {
    if (this.u == null)
    {
      this.u = new bp(true);
      this.u.setAcceptAllFileFilterUsed(true);
      this.u.setApproveButtonText(ct.a(116));
      this.u.setFileSelectionMode(2);
      this.u.setMultiSelectionEnabled(true);
    }
    this.u.setFileSelectionMode(paramInt);
    return this.u;
  }

  private bp n()
  {
    if (this.v == null)
    {
      this.v = new bp(false);
      this.v.setAcceptAllFileFilterUsed(true);
    }
    return this.v;
  }

  private void a(boolean paramBoolean)
  {
    this.l.setEnabled(paramBoolean);
    this.l.setEditable(false);
    this.A.setEnabled(paramBoolean);
  }

  private static ComboBoxModel h()
  {
    Object[] arrayOfObject = { "HTML:frames:default", "HTML:frames:earthli", "HTML:frames:l0l33t", "HTML:frames:phpdocumentor.de", "HTML:frames:phphtmllib", "HTML:frames:phpedit", "HTML:frames:DOM/default", "HTML:frames:DOM/earthli", "HTML:frames:DOM/l0l33t", "HTML:frames:DOM/phpdocumentor.de", "HTML:frames:DOM/phphtmllib", "HTML:Smarty:default", "HTML:Smarty:HandS", "HTML:Smarty:PHP", "PDF:default:default", "CHM:default:default", "XML:DocBook/peardoc2:default" };
    DefaultComboBoxModel localDefaultComboBoxModel = new DefaultComboBoxModel(arrayOfObject);
    return localDefaultComboBoxModel;
  }

  private void b(int paramInt)
  {
    this.c = paramInt;
  }

  public int i()
  {
    return this.c;
  }

  public b j()
  {
    return this.d;
  }

  private b o()
  {
    b localb = new b();
    String str1 = this.m.getText();
    String[] arrayOfString1 = a(((DefaultListModel)this.x.getModel()).toArray());
    String[] arrayOfString2 = a(((DefaultListModel)this.y.getModel()).toArray());
    String str2 = this.t.getText();
    String str3 = this.o.getText();
    String[] arrayOfString3 = a(((DefaultListModel)this.z.getModel()).toArray());
    String str4 = (String)this.B.getSelectedItem();
    String str5 = this.s.getText();
    String str6 = this.p.getText();
    String str7 = this.q.getText();
    String str8 = this.r.getText();
    boolean bool1 = this.h.isSelected();
    boolean bool2 = this.j.isSelected();
    boolean bool3 = this.i.isSelected();
    boolean bool4 = this.k.isSelected();
    localb.b(str1);
    localb.a(arrayOfString1);
    localb.b(arrayOfString2);
    localb.c(arrayOfString3);
    localb.c(str2);
    localb.a(str3);
    localb.d(str4);
    localb.e(str5);
    localb.f(str6);
    localb.g(str7);
    localb.h(str8);
    localb.a(bool1);
    localb.b(bool2);
    localb.c(bool3);
    localb.d(bool4);
    return localb;
  }

  private void a(DefaultListModel paramDefaultListModel, String[] paramArrayOfString)
  {
    paramDefaultListModel.removeAllElements();
    for (int i1 = 0; (paramArrayOfString != null) && (i1 < paramArrayOfString.length); i1++)
      paramDefaultListModel.addElement(paramArrayOfString[i1]);
  }

  public void a(hb paramhb)
  {
    this.d.a(paramhb);
    this.p.setText(this.d.j());
    this.t.setText(this.d.e());
    this.o.setText(this.d.f());
    String str = this.d.h();
    if (str != null)
      this.B.setSelectedItem(str);
    else
      this.B.setSelectedIndex(0);
    this.s.setText(this.d.i());
    this.q.setText(this.d.k());
    this.r.setText(this.d.l());
    this.m.setText(this.d.b());
    this.h.setSelected(this.d.m());
    this.j.setSelected(this.d.n());
    this.i.setSelected(this.d.o());
    this.k.setSelected(this.d.p());
    a((DefaultListModel)this.x.getModel(), this.d.c());
    a((DefaultListModel)this.y.getModel(), this.d.d());
    a((DefaultListModel)this.z.getModel(), this.d.g());
    p();
  }

  private void p()
  {
    for (int i1 = 0; i1 < this.P.length; i1++)
    {
      jb localjb = this.P[i1];
      localjb.repaint();
      localjb.revalidate();
      localjb.doLayout();
    }
  }

  private boolean a(String paramString)
  {
    File localFile = com.zend.ide.j.h.m.g(paramString);
    if (!localFile.exists())
      return false;
    hb localhb = new hb();
    try
    {
      boolean bool = localhb.a(com.zend.ide.j.h.m.f(paramString), this.X.c());
      if (!bool)
        return false;
      a(localhb);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      ba.a(this, ct.a(425, localFile.getName(), this.X.c()), ct.a(94), 0);
      return false;
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
      return false;
    }
    return true;
  }

  private void q()
  {
    if (this.g.isSelected())
    {
      String str = this.n.getText();
      bh localbh = (bh)this.U.getSelectedItem();
      if ((str != null) && (!str.equals("")))
      {
        hb localhb = this.d.q();
        FileOutputStream localFileOutputStream = null;
        try
        {
          localFileOutputStream = new FileOutputStream(str);
          localhb.a(localFileOutputStream, this.d.a(), localbh.c());
        }
        catch (UnsupportedEncodingException localIOException2)
        {
          ba.a(this, ct.a(445, str, localbh.c()), ct.a(94), 0);
        }
        catch (IOException localIOException4)
        {
        }
        finally
        {
          if (localFileOutputStream != null)
            try
            {
              localFileOutputStream.close();
            }
            catch (IOException localIOException5)
            {
            }
        }
      }
    }
  }

  private static String[] a(Object[] paramArrayOfObject)
  {
    String[] arrayOfString = new String[paramArrayOfObject.length];
    System.arraycopy(paramArrayOfObject, 0, arrayOfString, 0, paramArrayOfObject.length);
    return arrayOfString;
  }

  public void a(String[] paramArrayOfString)
  {
    ((DefaultListModel)this.x.getModel()).clear();
    if (paramArrayOfString == null)
      return;
    for (int i1 = 0; i1 < paramArrayOfString.length; i1++)
      ((DefaultListModel)this.x.getModel()).addElement(paramArrayOfString[i1]);
    this.b.setSelected(false);
  }

  public void b(String[] paramArrayOfString)
  {
    ((DefaultListModel)this.y.getModel()).clear();
    if (paramArrayOfString == null)
      return;
    for (int i1 = 0; i1 < paramArrayOfString.length; i1++)
      ((DefaultListModel)this.y.getModel()).addElement(paramArrayOfString[i1]);
    this.b.setSelected(false);
  }

  private static void l()
  {
    e = new Object[] { "ss_HTML_frames_default.png", "ss_HTML_frames_earthli.png", "ss_HTML_frames_l0l33t.png", "ss_HTML_frames_phpdoc.de.png", "ss_HTML_frames_phphtmllib.png", "ss_HTML_frames_phpedit.png", "ss_HTML_frames_DOM-default.png", "ss_HTML_frames_DOM-earthli.png", "ss_HTML_frames_DOM-l0l33t.png", "ss_HTML_frames_DOM-phpdoc.de.png", "ss_HTML_frames_DOM-phphtmllib.png", "ss_HTML_Smarty_default.png", "ss_HTML_Smarty_HandS.png", "ss_HTML_Smarty_PHP.png", "ss_PDF_default_default.png", "ss_CHM_default_default.png", "ss_XML_DocBook-peardoc2_default.png" };
  }

  private boolean r()
  {
    b localb = o();
    this.d = localb;
    q();
    b(1);
    return true;
  }

  private void b(boolean paramBoolean)
  {
    if (!this.P[this.O].a())
      return;
    this.C.remove(this.P[this.O]);
    if (paramBoolean)
      this.O += 1;
    else
      this.O -= 1;
    this.P[this.O].a(paramBoolean);
    this.C.add(this.P[this.O], "Center");
    s();
    validate();
    repaint();
  }

  private void s()
  {
    switch (this.O)
    {
    case 0:
      this.M.setEnabled(false);
      this.N.setEnabled(true);
      break;
    case 1:
      this.M.setEnabled(true);
      u();
      break;
    case 2:
      this.M.setEnabled(true);
      w();
      break;
    case 3:
      this.M.setEnabled(true);
      this.N.setEnabled(true);
      break;
    case 4:
      this.N.setEnabled(false);
    }
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      t();
      a();
      v();
    }
    super.setVisible(paramBoolean);
  }

  private void t()
  {
    if (this.O != 0)
      while (this.O > 0)
        b(false);
  }

  private boolean u()
  {
    if ((this.O == 1) && (this.x.getModel().getSize() == 0) && (this.y.getModel().getSize() == 0))
    {
      this.N.setEnabled(false);
      return false;
    }
    this.N.setEnabled(true);
    return true;
  }

  private boolean v()
  {
    if (((this.x.getModel().getSize() > 0) || (this.y.getModel().getSize() > 0)) && (!this.m.getText().equals("")))
    {
      this.L.setEnabled(true);
      return true;
    }
    this.L.setEnabled(false);
    return false;
  }

  private boolean w()
  {
    if (this.m.getText().equals(""))
    {
      this.N.setEnabled(false);
      return false;
    }
    this.N.setEnabled(true);
    return true;
  }

  static void a(x paramx, int paramInt)
  {
    paramx.b(paramInt);
  }

  static boolean a(x paramx)
  {
    return paramx.r();
  }

  static void a(x paramx, boolean paramBoolean)
  {
    paramx.b(paramBoolean);
  }

  static JRadioButton b(x paramx)
  {
    return paramx.b;
  }

  static void b(x paramx, boolean paramBoolean)
  {
    paramx.a(paramBoolean);
  }

  static void c(x paramx)
  {
    paramx.a();
  }

  static bp b(x paramx, int paramInt)
  {
    return paramx.a(paramInt);
  }

  static JTextField f(x paramx)
  {
    return paramx.l;
  }

  static bh a(x paramx, bh parambh)
  {
    return paramx.X = parambh;
  }

  static bh d(x paramx)
  {
    return paramx.X;
  }

  static JComboBox e(x paramx)
  {
    return paramx.U;
  }

  static boolean a(x paramx, String paramString)
  {
    return paramx.a(paramString);
  }

  static boolean f(x paramx)
  {
    return paramx.v();
  }

  static JTextField g(x paramx)
  {
    return paramx.m;
  }

  static boolean h(x paramx)
  {
    return paramx.w();
  }

  static Object[] x()
  {
    return e;
  }

  static JComboBox i(x paramx)
  {
    return paramx.B;
  }

  static y j(x paramx)
  {
    return paramx.F;
  }

  static com.zend.ide.p.x k(x paramx)
  {
    return paramx.g;
  }

  static JTextField l(x paramx)
  {
    return paramx.n;
  }

  static w m(x paramx)
  {
    return paramx.w;
  }

  static JLabel n(x paramx)
  {
    return paramx.V;
  }

  static bp o(x paramx)
  {
    return paramx.n();
  }

  static boolean p(x paramx)
  {
    return paramx.u();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.x
 * JD-Core Version:    0.6.0
 */