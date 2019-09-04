package com.zend.ide.d;

import com.zend.ide.p.a.d;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.e.f;
import com.zend.ide.p.x;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.util.bh;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.cm;
import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.fb;
import com.zend.ide.y.a;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.util.Hashtable;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class od extends JPanel
  implements a, cu, bn
{
  private com.zend.ide.util.bb a;
  private String b = "propertyEditor";
  private bt c;
  private JComboBox d;
  private JComboBox e;
  private JComboBox f;
  private com.zend.ide.p.bb g;
  private com.zend.ide.p.bb h;
  private x i;
  private x j;
  private x k;
  private x l;
  private x m;
  private x n;
  private x o;
  private x p;
  private JTextField q;
  private JTextField r;
  private JTextField s;
  private JTextField t;
  private JTextField u;
  private JTextField v;
  private JPanel w;
  private JPanel x;
  private pd y;
  private ButtonGroup z;
  private FlowLayout A = new FlowLayout(0, 0, 0);
  private bp B;
  private cm C;
  private Hashtable D;
  private com.zend.ide.p.bb E;

  public od()
  {
    a();
    this.a = new lc(this, null);
    lc.a((lc)this.a);
    this.c = new bt(this);
  }

  private void a()
  {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setLayout(new BorderLayout(5, 5));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.setBorder(BorderFactory.createTitledBorder(ct.a(1797)));
    localJPanel2.add(b(), "North");
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.setBorder(BorderFactory.createTitledBorder("PHP"));
    localJPanel3.add(d(), "North");
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    localJPanel4.setBorder(BorderFactory.createTitledBorder(ct.a(1798)));
    localJPanel4.add(e(), "North");
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    localJPanel5.setBorder(BorderFactory.createTitledBorder(ct.a(530)));
    localJPanel5.add(f(), "North");
    JPanel localJPanel6 = new JPanel(new BorderLayout(5, 5));
    localJPanel6.add(localJPanel2, "North");
    localJPanel6.add(localJPanel3, "Center");
    JPanel localJPanel7 = new JPanel(new BorderLayout(5, 5));
    localJPanel7.add(localJPanel4, "North");
    localJPanel7.add(localJPanel5, "Center");
    localJPanel1.add(localJPanel6, "Center");
    localJPanel1.add(localJPanel7, "East");
    add(localJPanel1, "Center");
  }

  private JPanel b()
  {
    JPanel localJPanel1 = new JPanel();
    BoxLayout localBoxLayout = new BoxLayout(localJPanel1, 1);
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setLayout(localBoxLayout);
    this.i = new x(ct.a(1076));
    this.i.setAlignmentX(0.0F);
    this.j = new x(ct.a(1826));
    this.j.setAlignmentX(0.0F);
    this.d = new JComboBox(ct.a);
    this.d.setRenderer(new id(this));
    this.e = new JComboBox(cv.c());
    JPanel localJPanel2 = new JPanel(new BorderLayout(3, 5));
    localJPanel2.add(this.e, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout(5, 5));
    this.v = new cb(new d(2), "", 2);
    localJPanel3.add(new JLabel(ct.a(1168)), "West");
    localJPanel3.add(this.v, "Center");
    localJPanel3.setMaximumSize(new Dimension(2147483647, (int)this.v.getPreferredSize().getHeight()));
    localJPanel2.add(localJPanel3, "East");
    c();
    this.f = new JComboBox(bh.d());
    this.f.setEditable(true);
    this.f.addItemListener(new z(this));
    int i1 = 18;
    if (cr.c() == 3)
      i1 = 20;
    JPanel localJPanel4 = new JPanel(new BorderLayout(5, 5));
    Box localBox1 = new Box(1);
    localBox1.add(Box.createVerticalStrut(4));
    localBox1.add(new com.zend.ide.p.z(ct.a(429) + ":"));
    localBox1.add(Box.createVerticalStrut(i1));
    localBox1.add(new com.zend.ide.p.z(ct.a(11) + ":"));
    localBox1.add(Box.createVerticalStrut(i1));
    localBox1.add(new com.zend.ide.p.z(ct.a(430) + ":"));
    localJPanel4.add(localBox1, "West");
    Box localBox2 = new Box(1);
    localBox2.add(this.d);
    localBox2.add(Box.createVerticalStrut(10));
    localBox2.add(localJPanel2);
    localBox2.add(Box.createVerticalStrut(10));
    localBox2.add(this.f);
    localJPanel4.add(localBox2, "Center");
    localJPanel4.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
    if (f.g())
      localJPanel1.add(a(this.i));
    localJPanel1.add(a(this.j));
    localJPanel1.add(localJPanel4);
    return localJPanel1;
  }

  private void c()
  {
    this.D = new Hashtable();
    bh[] arrayOfbh = bh.d();
    for (int i1 = 0; i1 < arrayOfbh.length; i1++)
      this.D.put(arrayOfbh[i1].toString(), arrayOfbh[i1]);
  }

  private JPanel a(JComponent paramJComponent)
  {
    JPanel localJPanel = new JPanel(this.A);
    localJPanel.add(paramJComponent);
    return localJPanel;
  }

  private JPanel d()
  {
    JPanel localJPanel1 = new JPanel();
    JPanel localJPanel2 = new JPanel(this.A);
    BoxLayout localBoxLayout = new BoxLayout(localJPanel1, 1);
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setLayout(localBoxLayout);
    com.zend.ide.p.z localz = new com.zend.ide.p.z(ct.a(1309) + ":");
    this.k = new x(ct.a(30));
    this.p = new x(ct.a(1828));
    this.y = new pd(this);
    this.g = new com.zend.ide.p.bb("PHP4");
    this.h = new com.zend.ide.p.bb("PHP5");
    this.g.setActionCommand("PHP4");
    this.h.setActionCommand("PHP5");
    this.z = new ButtonGroup();
    this.z.add(this.g);
    this.z.add(this.h);
    this.g.addItemListener(new bb(this));
    localJPanel2.add(localz);
    localJPanel2.add(this.g);
    localJPanel2.add(this.h);
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 0));
    localJPanel1.add(localJPanel2);
    localJPanel1.add(Box.createVerticalStrut(4));
    localJPanel1.add(a(this.p));
    localJPanel1.add(Box.createVerticalStrut(4));
    localJPanel1.add(a(this.k));
    localJPanel1.add(Box.createVerticalStrut(4));
    localJPanel1.add(this.y);
    return localJPanel1;
  }

  private JPanel e()
  {
    JPanel localJPanel = new JPanel(this.A);
    localJPanel.setAlignmentX(0.0F);
    BoxLayout localBoxLayout = new BoxLayout(localJPanel, 1);
    localJPanel.setLayout(localBoxLayout);
    this.l = new x(ct.a(1675));
    this.l.setEnabled(cr.c() == 1);
    this.t = new cb(15);
    localJPanel.add(a(this.l));
    this.x = a(ct.a(1799), this.t);
    localJPanel.add(this.x);
    return localJPanel;
  }

  private JPanel a(String paramString, JComponent paramJComponent)
  {
    JPanel localJPanel = new JPanel(new BorderLayout(5, 5));
    com.zend.ide.p.z localz = new com.zend.ide.p.z(paramString);
    localJPanel.add(localz, "West");
    localJPanel.add(paramJComponent, "Center");
    localJPanel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
    return localJPanel;
  }

  private JPanel a(String paramString, JTextField paramJTextField)
  {
    JPanel localJPanel = new JPanel(new BorderLayout(3, 3));
    kd localkd = new kd(this, paramJTextField);
    com.zend.ide.p.z localz = new com.zend.ide.p.z(paramString);
    localJPanel.add(localz, "West");
    localJPanel.add(paramJTextField, "Center");
    localJPanel.add(localkd, "East");
    localz.setAlignmentX(0.0F);
    paramJTextField.setAlignmentX(0.0F);
    localkd.setAlignmentX(0.0F);
    localJPanel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
    return localJPanel;
  }

  private JPanel f()
  {
    JPanel localJPanel1 = new JPanel();
    BoxLayout localBoxLayout = new BoxLayout(localJPanel1, 1);
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setLayout(localBoxLayout);
    this.m = new x(ct.a(857));
    this.n = new x(ct.a(749));
    this.n.addActionListener(new lb(this));
    this.o = new x(ct.a(427));
    this.s = new cb(new d(6), "", 10);
    this.r = new cb(new d(6), "1000", 10);
    this.u = new cb(15);
    localJPanel1.add(a(this.m));
    localJPanel1.add(Box.createVerticalStrut(4));
    localJPanel1.add(a(this.n));
    localJPanel1.add(Box.createVerticalStrut(4));
    JPanel localJPanel2 = a(this.o);
    this.w = a(ct.a(750) + ":", this.s);
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
    this.w.setBorder(BorderFactory.createEmptyBorder(3, 13, 5, 4));
    localJPanel1.add(localJPanel2);
    localJPanel1.add(Box.createVerticalStrut(4));
    localJPanel1.add(this.w);
    localJPanel1.add(Box.createVerticalStrut(4));
    localJPanel1.add(a(ct.a(632) + ":", this.r));
    localJPanel1.add(Box.createVerticalStrut(4));
    localJPanel1.add(a(ct.a(523) + ":", this.u));
    return localJPanel1;
  }

  private bp g()
  {
    if (this.B == null)
    {
      this.B = new bp(false);
      this.B.setMultiSelectionEnabled(false);
      this.B.setApproveButtonText(ct.a(116));
      this.B.setDialogTitle(ct.a(159));
      this.B.setFileFilter(p.f().j());
    }
    return this.B;
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
    if (f.g())
      b.a("desktop.laf").a(new Boolean(this.i.isSelected()));
    b.a("desktop.antialiasing").a(new Boolean(this.j.isSelected()));
    b.a("editing.supportAspTags").a(new Boolean(this.k.isSelected()));
    if (cr.c() == 1)
      b.a("desktop.internalBrowser").a(new Boolean(this.l.isSelected()));
    b.a("desktop.showHiddenFiles").a(new Boolean(this.m.isSelected()));
    b.a("filesystem.filesystemModificationCheckEnabled").a(new Boolean(this.n.isSelected()));
    b.a("editing.automaticFileReload").a(new Boolean(this.o.isSelected()));
    b.a("desktop.language").a(this.d.getSelectedItem());
    Font localFont = new Font(this.e.getSelectedItem().toString(), 0, Integer.parseInt(this.v.getText()));
    b.a("desktop.font").a(localFont);
    b.a("editing.encoding").a(new bh(this.f.getSelectedItem().toString()));
    b.a("desktop.phpVersion").a(new fb(this.z.getSelection().getActionCommand()));
    if (this.g.isSelected())
      b.a("desktop.includeFrameworkData").a(new Boolean(false));
    else
      b.a("desktop.includeFrameworkData").a(new Boolean(this.p.isSelected()));
    b.a("browser.commandLine").a(this.t.getText());
    b.a("editing.manualUrl").a(new cm(this.q.getText(), this.E.isSelected()));
    b.a("encoder.encoderCommandLine").a(new File(this.u.getText()));
    b.a("filesystem.filesystemModificationCheckTime").a(a(this.s));
    b.a("editing.searchResultDisplaySize").a(a(this.r));
    f();
  }

  public void f()
  {
    if (f.g())
      this.i.setSelected(((Boolean)b.a("desktop.laf")).booleanValue());
    this.j.setSelected(((Boolean)b.a("desktop.antialiasing")).booleanValue());
    this.k.setSelected(((Boolean)b.a("editing.supportAspTags")).booleanValue());
    if (cr.c() == 1)
      this.l.setSelected(((Boolean)b.a("desktop.internalBrowser")).booleanValue());
    this.m.setSelected(((Boolean)b.a("desktop.showHiddenFiles")).booleanValue());
    this.n.setSelected(((Boolean)b.a("filesystem.filesystemModificationCheckEnabled")).booleanValue());
    this.o.setSelected(((Boolean)b.a("editing.automaticFileReload")).booleanValue());
    this.d.setSelectedItem(b.a("desktop.language"));
    Font localFont = (Font)b.a("desktop.font");
    this.e.setSelectedItem(localFont.getFamily());
    this.v.setText(String.valueOf(localFont.getSize()));
    bh localbh = (bh)b.a("editing.encoding");
    if (!this.D.contains(localbh))
    {
      this.D.put(localbh.toString(), localbh);
      ((DefaultComboBoxModel)this.f.getModel()).addElement(localbh);
    }
    this.f.setSelectedItem(localbh);
    fb localfb = (fb)b.a("desktop.phpVersion");
    this.z.setSelected(localfb.toString().equals("PHP5") ? this.h.getModel() : this.g.getModel(), true);
    this.p.setSelected(((Boolean)b.a("desktop.includeFrameworkData")).booleanValue());
    this.t.setText((String)b.a("browser.commandLine"));
    this.C = ((cm)b.a("editing.manualUrl"));
    this.q.setText(this.C.toString());
    this.u.setText(a(b.a("encoder.encoderCommandLine")));
    this.s.setText(((Integer)b.a("filesystem.filesystemModificationCheckTime")).toString());
    this.r.setText(((Integer)b.a("editing.searchResultDisplaySize")).toString());
    this.y.a(this.C);
    i();
  }

  private String a(Object paramObject)
  {
    if ((paramObject instanceof File))
      return ((File)paramObject).getAbsolutePath();
    return "";
  }

  private void h()
  {
    if (f.g())
      this.i.setSelected(((Boolean)b.b("desktop.laf")).booleanValue());
    this.j.setSelected(((Boolean)b.b("desktop.antialiasing")).booleanValue());
    this.k.setSelected(((Boolean)b.b("editing.supportAspTags")).booleanValue());
    if (cr.c() == 1)
      this.l.setSelected(((Boolean)b.b("desktop.internalBrowser")).booleanValue());
    this.m.setSelected(((Boolean)b.b("desktop.showHiddenFiles")).booleanValue());
    this.n.setSelected(((Boolean)b.b("filesystem.filesystemModificationCheckEnabled")).booleanValue());
    this.o.setSelected(((Boolean)b.b("editing.automaticFileReload")).booleanValue());
    this.d.setSelectedItem(b.b("desktop.language"));
    Font localFont = (Font)b.b("desktop.font");
    this.e.setSelectedItem(localFont.getFamily());
    this.v.setText(String.valueOf(localFont.getSize()));
    this.f.setSelectedItem(b.b("editing.encoding"));
    fb localfb = (fb)b.b("desktop.phpVersion");
    this.z.setSelected(localfb.equals("PHP5") ? this.h.getModel() : this.g.getModel(), true);
    this.t.setText((String)b.b("browser.commandLine"));
    this.C = ((cm)b.b("editing.manualUrl"));
    this.q.setText(this.C.toString());
    this.u.setText(((File)b.b("encoder.encoderCommandLine")).getAbsolutePath());
    this.s.setText(b.b("filesystem.filesystemModificationCheckTime").toString());
    this.r.setText(((Integer)b.b("editing.searchResultDisplaySize")).toString());
    this.y.a(this.C);
    i();
  }

  private void i()
  {
    boolean bool = this.n.isSelected();
    this.o.setEnabled(bool);
    Component[] arrayOfComponent = this.w.getComponents();
    for (int i1 = 0; i1 < arrayOfComponent.length; i1++)
      arrayOfComponent[i1].setEnabled(bool);
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
    return this.c.d(paramBoolean);
  }

  public com.zend.ide.util.bb q()
  {
    return this.a;
  }

  public void d(String paramString)
  {
    this.b = paramString;
  }

  public String r()
  {
    return this.b;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    this.a.a(parambn.q());
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
    return this.c;
  }

  static Hashtable a(od paramod)
  {
    return paramod.D;
  }

  static JComboBox b(od paramod)
  {
    return paramod.f;
  }

  static com.zend.ide.p.bb c(od paramod)
  {
    return paramod.g;
  }

  static x d(od paramod)
  {
    return paramod.p;
  }

  static void e(od paramod)
  {
    paramod.i();
  }

  static void f(od paramod)
  {
    paramod.h();
  }

  static JTextField a(od paramod, JTextField paramJTextField)
  {
    return paramod.q = paramJTextField;
  }

  static FlowLayout g(od paramod)
  {
    return paramod.A;
  }

  static com.zend.ide.p.bb a(od paramod, com.zend.ide.p.bb parambb)
  {
    return paramod.E = parambb;
  }

  static JTextField h(od paramod)
  {
    return paramod.q;
  }

  static com.zend.ide.p.bb i(od paramod)
  {
    return paramod.E;
  }

  static bp j(od paramod)
  {
    return paramod.g();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.od
 * JD-Core Version:    0.6.0
 */