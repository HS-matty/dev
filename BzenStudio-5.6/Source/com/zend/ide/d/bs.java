package com.zend.ide.d;

import com.zend.ide.f.zc.b.j;
import com.zend.ide.f.zc.b.l;
import com.zend.ide.p.a.d;
import com.zend.ide.util.bb;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class bs extends JPanel
  implements com.zend.ide.y.a, cu, com.zend.ide.util.bn
{
  private JCheckBox a;
  private JLabel b;
  private JTextField c;
  private JLabel d;
  private JLabel e;
  private JTextField f;
  private JLabel g;
  private JCheckBox h;
  private JCheckBox i;
  private JCheckBox j;
  private JCheckBox k;
  private JCheckBox l;
  private JCheckBox m;
  private JCheckBox J;
  private JCheckBox K;
  private JCheckBox n;
  private JCheckBox o;
  private JCheckBox p;
  private JCheckBox E;
  private JCheckBox L;
  private JTextField q;
  private JLabel r;
  private JCheckBox F;
  private JCheckBox s;
  private JLabel t;
  private JTextField u;
  private JLabel v;
  private JLabel w;
  private JTextField x;
  private JLabel y;
  private JCheckBox z;
  private JCheckBox A;
  private JCheckBox B;
  private JCheckBox C;
  private JCheckBox M;
  private static final Dimension D = new Dimension(0, 10);
  private bb G;
  private String H = "propertyEditor";
  private bt I;
  private JComboBox N;
  private String O;

  public bs()
  {
    j();
    this.G = new bq(this, null);
    bq.a((bq)this.G);
    this.I = new bt(this);
    h();
  }

  private void j()
  {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new GridLayout(1, 2));
    localJPanel.add(g());
    localJPanel.add(b());
    add(localJPanel, "Center");
  }

  private JPanel b()
  {
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(945)));
    BoxLayout localBoxLayout = new BoxLayout(localJPanel1, 1);
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setLayout(localBoxLayout);
    this.s = new JCheckBox(ct.a(946));
    this.s.addActionListener(new bn(this));
    localJPanel1.add(this.s);
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setMaximumSize(new Dimension(2147483647, this.s.getMaximumSize().height));
    localJPanel2.setLayout(new FlowLayout(0, 0, 0));
    localJPanel2.setAlignmentX(0.0F);
    localJPanel2.setBorder(null);
    this.t = new JLabel(ct.a(947));
    this.t.setBorder(BorderFactory.createEmptyBorder(4, 24, 4, 4));
    localJPanel2.add(this.t);
    this.u = new cb(new d(8), "", 4);
    localJPanel2.add(this.u);
    this.v = new JLabel(ct.a(948));
    this.v.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    localJPanel2.add(this.v);
    localJPanel1.add(localJPanel2);
    JPanel localJPanel3 = new JPanel();
    localJPanel3.setMaximumSize(new Dimension(2147483647, this.s.getMaximumSize().height));
    localJPanel3.setLayout(new FlowLayout(0, 0, 0));
    localJPanel3.setAlignmentX(0.0F);
    localJPanel3.setBorder(null);
    this.w = new JLabel(ct.a(949));
    this.w.setBorder(BorderFactory.createEmptyBorder(4, 24, 4, 4));
    localJPanel3.add(this.w);
    this.x = new cb(new d(8), "", 4);
    localJPanel3.add(this.x);
    this.y = new JLabel(ct.a(950));
    this.y.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    localJPanel3.add(this.y);
    localJPanel1.add(localJPanel3);
    Border localBorder = BorderFactory.createEmptyBorder(4, 22, 4, 4);
    this.z = new JCheckBox(ct.a(951));
    this.z.setBorder(localBorder);
    localJPanel1.add(this.z);
    this.A = new JCheckBox(ct.a(952));
    this.A.setBorder(localBorder);
    localJPanel1.add(this.A);
    this.B = new JCheckBox(ct.a(953));
    this.B.setBorder(localBorder);
    localJPanel1.add(this.B);
    localJPanel1.add(Box.createRigidArea(D));
    this.F = new JCheckBox(ct.a(1290));
    localJPanel1.add(this.F);
    this.C = new JCheckBox(ct.a(954));
    localJPanel1.add(this.C);
    this.M = new JCheckBox(ct.a(1756));
    localJPanel1.add(this.M);
    return localJPanel1;
  }

  private JPanel g()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setBorder(BorderFactory.createTitledBorder(ct.a(955)));
    BoxLayout localBoxLayout = new BoxLayout(localJPanel2, 1);
    localJPanel2.setAlignmentX(0.0F);
    localJPanel2.setLayout(localBoxLayout);
    this.a = new JCheckBox(ct.a(946));
    this.a.addActionListener(new ck(this));
    localJPanel2.add(this.a);
    JPanel localJPanel3 = new JPanel();
    localJPanel3.setMaximumSize(new Dimension(2147483647, this.a.getMaximumSize().height));
    localJPanel3.setLayout(new FlowLayout(0, 0, 0));
    localJPanel3.setAlignmentX(0.0F);
    localJPanel3.setBorder(null);
    this.b = new JLabel(ct.a(947));
    this.b.setBorder(BorderFactory.createEmptyBorder(4, 24, 4, 4));
    localJPanel3.add(this.b);
    this.c = new cb(new d(8), "", 4);
    localJPanel3.add(this.c);
    this.d = new JLabel(ct.a(948));
    this.d.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    localJPanel3.add(this.d);
    localJPanel2.add(localJPanel3);
    JPanel localJPanel4 = new JPanel();
    localJPanel4.setMaximumSize(new Dimension(2147483647, this.a.getMaximumSize().height));
    localJPanel4.setLayout(new FlowLayout(0, 0, 0));
    localJPanel4.setAlignmentX(0.0F);
    localJPanel4.setBorder(BorderFactory.createEmptyBorder());
    this.e = new JLabel(ct.a(949));
    this.e.setBorder(BorderFactory.createEmptyBorder(4, 24, 4, 4));
    localJPanel4.add(this.e);
    this.f = new cb(new d(8), "", 4);
    localJPanel4.add(this.f);
    this.g = new JLabel(ct.a(950));
    this.g.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    localJPanel4.add(this.g);
    localJPanel2.add(localJPanel4);
    Border localBorder = BorderFactory.createEmptyBorder(4, 22, 4, 4);
    this.h = new JCheckBox(ct.a(956));
    this.h.setBorder(localBorder);
    localJPanel2.add(this.h);
    this.i = new JCheckBox(ct.a(957));
    this.i.setBorder(localBorder);
    localJPanel2.add(this.i);
    this.j = new JCheckBox(ct.a(958));
    this.j.setBorder(localBorder);
    localJPanel2.add(this.j);
    localJPanel2.add(Box.createRigidArea(D));
    this.k = new JCheckBox(ct.a(959));
    localJPanel2.add(this.k);
    this.l = new JCheckBox(ct.a(960));
    localJPanel2.add(this.l);
    this.m = new JCheckBox(ct.a(961));
    localJPanel2.add(this.m);
    this.J = new JCheckBox(ct.a(1062));
    localJPanel2.add(this.J);
    this.K = new JCheckBox(ct.a(1096));
    localJPanel2.add(this.K);
    localJPanel2.add(Box.createRigidArea(D));
    this.n = new JCheckBox(ct.a(962));
    localJPanel2.add(this.n);
    this.o = new JCheckBox(ct.a(963));
    localJPanel2.add(this.o);
    localJPanel2.add(Box.createRigidArea(D));
    localJPanel2.add(Box.createRigidArea(D));
    this.E = new JCheckBox(ct.a(1291));
    localJPanel2.add(this.E);
    localJPanel2.add(this.E);
    localJPanel2.add(Box.createRigidArea(D));
    this.L = new JCheckBox(ct.a(1869));
    localJPanel2.add(this.L);
    localJPanel2.add(this.L);
    JPanel localJPanel5 = new JPanel();
    localJPanel5.setBorder(null);
    localJPanel5.setAlignmentX(0.0F);
    localJPanel5.setLayout(new FlowLayout(0));
    this.p = new JCheckBox(ct.a(964));
    this.p.addActionListener(new cl(this));
    this.p.setBorder(null);
    localJPanel5.add(this.p);
    this.q = new cb(new d(8), "", 4);
    localJPanel5.add(this.q);
    this.r = new JLabel(ct.a(950));
    localJPanel5.add(this.r);
    localJPanel2.add(localJPanel5);
    JPanel localJPanel6 = a();
    localJPanel1.add(localJPanel2, "North");
    localJPanel1.add(localJPanel6, "Center");
    return localJPanel1;
  }

  private JPanel a()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(2, 2));
    localJPanel1.add(new JLabel(ct.a(1850) + ':'), "West");
    this.N = new JComboBox();
    localJPanel1.add(this.N, "Center");
    JButton localJButton = new JButton("...");
    localJButton.addActionListener(new o(this));
    localJPanel1.add(localJButton, "East");
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localJPanel1, "North");
    localJPanel2.setBorder(BorderFactory.createTitledBorder(ct.a(1842)));
    return localJPanel2;
  }

  private void h()
  {
    boolean bool1 = this.p.isSelected();
    this.q.setEnabled(bool1);
    this.r.setEnabled(bool1);
    boolean bool2 = this.a.isSelected();
    this.b.setEnabled(bool2);
    this.c.setEnabled(bool2);
    this.d.setEnabled(bool2);
    this.e.setEnabled(bool2);
    this.f.setEnabled(bool2);
    this.g.setEnabled(bool2);
    this.h.setEnabled(bool2);
    this.i.setEnabled(bool2);
    this.j.setEnabled(bool2);
    boolean bool3 = this.s.isSelected();
    this.t.setEnabled(bool3);
    this.u.setEnabled(bool3);
    this.v.setEnabled(bool3);
    this.w.setEnabled(bool3);
    this.x.setEnabled(bool3);
    this.y.setEnabled(bool3);
    this.z.setEnabled(bool3);
    this.A.setEnabled(bool3);
    this.B.setEnabled(bool3);
    this.N.setEnabled(!com.zend.ide.util.f.a.a.b());
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
    b.a("completion.phpAutoShowCompletion").a(new Boolean(this.a.isSelected()));
    b.a("completion.phpShowFewerThan").a(a(this.c));
    b.a("completion.phpDelay").a(a(this.f));
    b.a("completion.phpAutoClassNames").a(new Boolean(this.h.isSelected()));
    b.a("completion.phpAutoVariables").a(new Boolean(this.i.isSelected()));
    b.a("completion.phpAutoFunctions").a(new Boolean(this.j.isSelected()));
    b.a("completion.phpVariablesFromOtherFiles").a(new Boolean(this.k.isSelected()));
    b.a("completion.phpObjectsFromOtherFiles").a(new Boolean(this.l.isSelected()));
    b.a("completion.phpDisableConstants").a(new Boolean(this.m.isSelected()));
    b.a("completion.phpCaseSensitiveForConstants").a(new Boolean(this.J.isSelected()));
    b.a("completion.phpclassNamesInGlobalsList").a(new Boolean(this.K.isSelected()));
    b.a("completion.phpAutoFunctionsArguments").a(new Boolean(this.n.isSelected()));
    b.a("completion.phpFullFunctionPrototype").a(new Boolean(this.o.isSelected()));
    b.a("completion.phpDescriptions").a(new Boolean(this.p.isSelected()));
    b.a("completion.phpDescriptionDelay").a(a(this.q));
    b.a("completion.phpRemoveEnding").a(new Boolean(this.E.isSelected()));
    b.a("completion.phpStrictLanguage").a(new Boolean(this.L.isSelected()));
    b.a("completion.htmlAutoShowCompletion").a(new Boolean(this.s.isSelected()));
    b.a("completion.htmlShowFewerThan").a(a(this.u));
    b.a("completion.htmlDelay").a(a(this.x));
    b.a("completion.htmlAutoTags").a(new Boolean(this.z.isSelected()));
    b.a("completion.htmlAutoAtributes").a(new Boolean(this.A.isSelected()));
    b.a("completion.htmlAutoAtributesValues").a(new Boolean(this.B.isSelected()));
    b.a("editing.htmlTagUppercase").a(new Boolean(this.C.isSelected()));
    b.a("completion.xhtmlTagStyle").a(new Boolean(this.M.isSelected()));
    b.a("completion.htmlRemoveEnding").a(new Boolean(this.F.isSelected()));
    l.a(l.a(this.N.getSelectedItem().toString()));
    f();
  }

  public void f()
  {
    this.O = l.b().d();
    this.a.setSelected(((Boolean)b.a("completion.phpAutoShowCompletion").c()).booleanValue());
    this.c.setText(b.a("completion.phpShowFewerThan").c().toString());
    this.f.setText(b.a("completion.phpDelay").c().toString());
    this.h.setSelected(((Boolean)b.a("completion.phpAutoClassNames").c()).booleanValue());
    this.i.setSelected(((Boolean)b.a("completion.phpAutoVariables").c()).booleanValue());
    this.j.setSelected(((Boolean)b.a("completion.phpAutoFunctions").c()).booleanValue());
    this.k.setSelected(((Boolean)b.a("completion.phpVariablesFromOtherFiles").c()).booleanValue());
    this.l.setSelected(((Boolean)b.a("completion.phpObjectsFromOtherFiles").c()).booleanValue());
    this.m.setSelected(((Boolean)b.a("completion.phpDisableConstants").c()).booleanValue());
    this.J.setSelected(((Boolean)b.a("completion.phpCaseSensitiveForConstants").c()).booleanValue());
    this.K.setSelected(((Boolean)b.a("completion.phpclassNamesInGlobalsList").c()).booleanValue());
    this.n.setSelected(((Boolean)b.a("completion.phpAutoFunctionsArguments").c()).booleanValue());
    this.o.setSelected(((Boolean)b.a("completion.phpFullFunctionPrototype").c()).booleanValue());
    this.p.setSelected(((Boolean)b.a("completion.phpDescriptions").c()).booleanValue());
    this.q.setText(b.a("completion.phpDescriptionDelay").c().toString());
    this.E.setSelected(((Boolean)b.a("completion.phpRemoveEnding").c()).booleanValue());
    this.L.setSelected(((Boolean)b.a("completion.phpStrictLanguage").c()).booleanValue());
    this.s.setSelected(((Boolean)b.a("completion.htmlAutoShowCompletion").c()).booleanValue());
    this.u.setText(b.a("completion.htmlShowFewerThan").c().toString());
    this.x.setText(b.a("completion.htmlDelay").c().toString());
    this.z.setSelected(((Boolean)b.a("completion.htmlAutoTags").c()).booleanValue());
    this.A.setSelected(((Boolean)b.a("completion.htmlAutoAtributes").c()).booleanValue());
    this.B.setSelected(((Boolean)b.a("completion.htmlAutoAtributesValues").c()).booleanValue());
    this.C.setSelected(((Boolean)b.a("editing.htmlTagUppercase").c()).booleanValue());
    this.M.setSelected(((Boolean)b.a("completion.xhtmlTagStyle").c()).booleanValue());
    this.F.setSelected(((Boolean)b.a("completion.htmlRemoveEnding").c()).booleanValue());
    this.N.setModel(new DefaultComboBoxModel(l.d()));
    this.N.setSelectedItem(l.b().d());
    h();
  }

  private void i()
  {
    this.a.setSelected(((Boolean)b.a("completion.phpAutoShowCompletion").b()).booleanValue());
    this.c.setText(b.a("completion.phpShowFewerThan").b().toString());
    this.f.setText(b.a("completion.phpDelay").b().toString());
    this.h.setSelected(((Boolean)b.a("completion.phpAutoClassNames").b()).booleanValue());
    this.i.setSelected(((Boolean)b.a("completion.phpAutoVariables").b()).booleanValue());
    this.j.setSelected(((Boolean)b.a("completion.phpAutoFunctions").b()).booleanValue());
    this.k.setSelected(((Boolean)b.a("completion.phpVariablesFromOtherFiles").b()).booleanValue());
    this.l.setSelected(((Boolean)b.a("completion.phpObjectsFromOtherFiles").b()).booleanValue());
    this.m.setSelected(((Boolean)b.a("completion.phpDisableConstants").b()).booleanValue());
    this.J.setSelected(((Boolean)b.a("completion.phpCaseSensitiveForConstants").b()).booleanValue());
    this.K.setSelected(((Boolean)b.a("completion.phpclassNamesInGlobalsList").b()).booleanValue());
    this.n.setSelected(((Boolean)b.a("completion.phpAutoFunctionsArguments").b()).booleanValue());
    this.o.setSelected(((Boolean)b.a("completion.phpFullFunctionPrototype").b()).booleanValue());
    this.p.setSelected(((Boolean)b.a("completion.phpDescriptions").b()).booleanValue());
    this.q.setText(b.a("completion.phpDescriptionDelay").b().toString());
    this.E.setSelected(((Boolean)b.a("completion.phpRemoveEnding").b()).booleanValue());
    this.L.setSelected(((Boolean)b.a("completion.phpRemoveEnding").b()).booleanValue());
    this.s.setSelected(((Boolean)b.a("completion.htmlAutoShowCompletion").b()).booleanValue());
    this.u.setText(b.a("completion.htmlShowFewerThan").b().toString());
    this.x.setText(b.a("completion.htmlDelay").b().toString());
    this.z.setSelected(((Boolean)b.a("completion.htmlAutoTags").b()).booleanValue());
    this.A.setSelected(((Boolean)b.a("completion.htmlAutoAtributes").b()).booleanValue());
    this.B.setSelected(((Boolean)b.a("completion.htmlAutoAtributesValues").b()).booleanValue());
    this.C.setSelected(((Boolean)b.a("editing.htmlTagUppercase").b()).booleanValue());
    this.M.setSelected(((Boolean)b.a("completion.xhtmlTagStyle").b()).booleanValue());
    this.F.setSelected(((Boolean)b.a("completion.htmlRemoveEnding").b()).booleanValue());
    h();
  }

  public void a(String paramString)
  {
  }

  public void e()
  {
    j localj1 = l.b();
    if (!localj1.d().equals(this.O))
    {
      j localj2 = l.a(this.O);
      if (localj2 != null)
        l.a(localj2);
    }
  }

  public JComponent c()
  {
    return this;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.I.d(paramBoolean);
  }

  public bb q()
  {
    return this.G;
  }

  public void d(String paramString)
  {
    this.H = paramString;
  }

  public String r()
  {
    return this.H;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(com.zend.ide.util.bn parambn)
  {
    this.G.a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public com.zend.ide.util.bs t()
  {
    return this.I;
  }

  static JCheckBox a(bs parambs)
  {
    return parambs.s;
  }

  static JLabel b(bs parambs)
  {
    return parambs.t;
  }

  static JTextField c(bs parambs)
  {
    return parambs.u;
  }

  static JLabel d(bs parambs)
  {
    return parambs.v;
  }

  static JLabel e(bs parambs)
  {
    return parambs.w;
  }

  static JTextField f(bs parambs)
  {
    return parambs.x;
  }

  static JLabel g(bs parambs)
  {
    return parambs.y;
  }

  static JCheckBox h(bs parambs)
  {
    return parambs.z;
  }

  static JCheckBox i(bs parambs)
  {
    return parambs.A;
  }

  static JCheckBox j(bs parambs)
  {
    return parambs.B;
  }

  static JCheckBox k(bs parambs)
  {
    return parambs.a;
  }

  static JLabel l(bs parambs)
  {
    return parambs.b;
  }

  static JTextField m(bs parambs)
  {
    return parambs.c;
  }

  static JLabel n(bs parambs)
  {
    return parambs.d;
  }

  static JLabel o(bs parambs)
  {
    return parambs.e;
  }

  static JTextField p(bs parambs)
  {
    return parambs.f;
  }

  static JLabel q(bs parambs)
  {
    return parambs.g;
  }

  static JCheckBox r(bs parambs)
  {
    return parambs.h;
  }

  static JCheckBox s(bs parambs)
  {
    return parambs.i;
  }

  static JCheckBox t(bs parambs)
  {
    return parambs.j;
  }

  static JCheckBox u(bs parambs)
  {
    return parambs.p;
  }

  static JTextField v(bs parambs)
  {
    return parambs.q;
  }

  static JLabel w(bs parambs)
  {
    return parambs.r;
  }

  static JComboBox a(bs parambs)
  {
    return parambs.N;
  }

  static void b(bs parambs)
  {
    parambs.i();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bs
 * JD-Core Version:    0.6.0
 */