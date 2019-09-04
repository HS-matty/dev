package com.zend.ide.d;

import com.zend.ide.p.cd;
import com.zend.ide.p.z;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.d;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LookAndFeel;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class bi extends JPanel
  implements bn, cu, d
{
  private ArrayList a = new ArrayList();
  private Map b = new HashMap(20);
  private Vector[] c;
  private Map d = new HashMap(20);
  private Map e = new HashMap(30);
  private JComboBox f;
  private JList g;
  private JList h;
  private JList i;
  private JTextField j;
  private KeyStroke k = null;
  private String l;
  private com.zend.ide.p.w m;
  private com.zend.ide.p.w n;
  private com.zend.ide.p.w o;
  private com.zend.ide.p.w p;
  private com.zend.ide.p.w q;
  private com.zend.ide.p.w w;
  private com.zend.ide.p.w x;
  private int r = 1;
  private String s = "";
  private String t = "keyMap";
  private bt u;
  private bb v;

  public bi()
  {
    n();
  }

  private void n()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(10, 10));
    localJPanel.add(g(), "North");
    localJPanel.add(b(), "Center");
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    add(localJPanel, "Center");
    e(com.zend.ide.y.g.e());
    this.v = new com.zend.ide.util.s();
    d("keyMap");
    this.u = new bt(this);
    this.u.a(this);
    m();
  }

  public bs t()
  {
    return this.u;
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bb q()
  {
    return this.v;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.t = paramString;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.t;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.u.d(paramBoolean);
  }

  public void a(bn parambn)
  {
    this.v.a(parambn.q());
  }

  private JPanel b()
  {
    this.h = new JList(new DefaultListModel());
    this.h.setSelectionMode(0);
    cd localcd = new cd(this.h);
    this.j = new JTextField();
    this.j.setEditable(true);
    this.j.setBorder(BorderFactory.createLoweredBevelBorder());
    this.j.setBackground(UIManager.getLookAndFeel().getDefaults().getColor("TextField.inactiveBackground"));
    this.j.setForeground(UIManager.getLookAndFeel().getDefaults().getColor("TextField.inactiveForeground"));
    this.j.setText(ct.b(663));
    this.j.addFocusListener(new f(this));
    this.o = new com.zend.ide.p.w(ct.b(641));
    this.o.setEnabled(false);
    this.m = new com.zend.ide.p.w(ct.b(642));
    this.q = new com.zend.ide.p.w(ct.b(643));
    this.o.setAlignmentX(0.5F);
    this.m.setAlignmentX(0.5F);
    this.j.addKeyListener(new b(this, null));
    this.o.addActionListener(new v(this, null));
    this.m.addActionListener(new u(this, null));
    this.q.addActionListener(new y(this, null));
    this.q.setEnabled(false);
    Dimension localDimension = new Dimension(90, 25);
    JPanel localJPanel1 = new JPanel();
    localJPanel1.setLayout(new BoxLayout(localJPanel1, 1));
    this.q.setAlignmentX(0.5F);
    this.m.setAlignmentX(0.5F);
    this.o.setMaximumSize(localDimension);
    this.q.setMaximumSize(localDimension);
    this.m.setMaximumSize(localDimension);
    localJPanel1.add(this.m);
    localJPanel1.add(Box.createRigidArea(new Dimension(0, 5)));
    localJPanel1.setAlignmentY(0.0F);
    localJPanel1.add(this.q);
    localJPanel1.add(Box.createRigidArea(new Dimension(0, 5)));
    localJPanel1.setAlignmentY(0.0F);
    JPanel localJPanel2 = new JPanel(new BorderLayout(5, 5));
    localJPanel2.add(this.o, "East");
    localJPanel2.add(this.j, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout(4, 4));
    localJPanel3.add(localJPanel1, "East");
    localJPanel3.add(localcd, "Center");
    localJPanel3.add(new JLabel(ct.b(665)), "North");
    JPanel localJPanel4 = new JPanel(new BorderLayout(2, 2));
    localJPanel4.add(new JLabel(ct.b(667)), "North");
    localJPanel4.add(localJPanel2, "Center");
    JPanel localJPanel5 = new JPanel(new BorderLayout(5, 5));
    localJPanel5.add(localJPanel3, "Center");
    localJPanel5.add(localJPanel4, "North");
    JPanel localJPanel6 = new JPanel(new GridLayout(1, 0, 20, 20));
    localJPanel6.add(k());
    localJPanel6.add(localJPanel5);
    localJPanel6.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.a(892)), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    this.h.addListSelectionListener(new g(this));
    this.h.addPropertyChangeListener("model", new h(this));
    return localJPanel6;
  }

  private void l()
  {
    String str = (String)this.g.getSelectedValue();
    if (str == null)
    {
      this.m.setEnabled(false);
      this.q.setEnabled(false);
      return;
    }
    this.m.setEnabled(true);
    if (this.h.getSelectedIndex() == -1)
      this.q.setEnabled(false);
    else
      this.q.setEnabled(true);
  }

  private JPanel k()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(2, 2));
    z localz = new z(ct.b(662));
    this.f = new JComboBox();
    this.f.addItem(ct.b(633));
    this.f.addItem(ct.b(634));
    this.f.addItem(ct.b(635));
    this.f.addItem(ct.b(637));
    this.f.addItem(ct.b(983));
    this.f.addItem(ct.b(208));
    this.f.addItem(ct.b(242));
    this.f.addItem(ct.b(984));
    this.f.addItem(ct.b(1589));
    this.f.addItem(ct.b(639));
    this.f.addActionListener(new r(this, null));
    this.c = new Vector[10];
    for (int i1 = 0; i1 < this.f.getModel().getSize(); i1++)
      this.d.put(this.f.getModel().getElementAt(i1), new Integer(i1));
    localJPanel1.add(localz, "North");
    localJPanel1.add(this.f, "Center");
    localJPanel1.setAlignmentX(0.5F);
    this.g = new JList();
    this.g.addListSelectionListener(new i(this, null));
    this.g.setSelectionMode(0);
    cd localcd = new cd(this.g);
    JPanel localJPanel2 = new JPanel(new BorderLayout(4, 4));
    localJPanel2.add(new JLabel(ct.b(666)), "North");
    localJPanel2.add(localcd, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout(5, 5));
    localJPanel3.add(localJPanel1, "North");
    localJPanel3.add(localJPanel2, "Center");
    return localJPanel3;
  }

  private JPanel g()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 5));
    this.i = new JList();
    this.i.setSelectionMode(0);
    this.i.addListSelectionListener(new bm(this));
    this.i.setCellRenderer(new bh(null));
    DefaultListModel localDefaultListModel = new DefaultListModel();
    Iterator localIterator = com.zend.ide.y.g.f();
    while (localIterator.hasNext())
      localDefaultListModel.addElement(localIterator.next());
    this.i.setModel(localDefaultListModel);
    this.i.setSelectedValue(com.zend.ide.y.g.e(), true);
    cd localcd = new cd(this.i);
    localJPanel1.add(localcd, "Center");
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setLayout(new BoxLayout(localJPanel2, 1));
    this.w = new com.zend.ide.p.w(ct.b(645));
    this.x = new bz(this, ct.b(646));
    this.x.setToolTipText(ct.a(646));
    this.n = new com.zend.ide.p.w(ct.b(664));
    this.n.addActionListener(new s(this, null));
    this.p = new com.zend.ide.p.w(ct.b(647));
    Dimension localDimension = new Dimension(130, 25);
    this.w.setAlignmentX(0.5F);
    this.w.setMaximumSize(localDimension);
    this.x.setAlignmentX(0.5F);
    this.x.setMaximumSize(localDimension);
    this.p.setAlignmentX(0.5F);
    this.p.setMaximumSize(localDimension);
    this.n.setAlignmentX(0.5F);
    this.n.setMaximumSize(localDimension);
    this.n.setToolTipText(ct.b(668));
    localJPanel2.add(this.w);
    localJPanel2.add(Box.createRigidArea(new Dimension(0, 3)));
    localJPanel2.setAlignmentY(0.0F);
    localJPanel2.add(this.x);
    localJPanel2.add(Box.createRigidArea(new Dimension(0, 3)));
    localJPanel2.add(this.p);
    localJPanel2.add(Box.createRigidArea(new Dimension(0, 3)));
    localJPanel2.add(this.n);
    this.w.addActionListener(new t(this, null));
    this.x.addActionListener(new w(this, null));
    this.p.addActionListener(new x(this, null));
    localJPanel1.add(localJPanel2, "East");
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.b(648)), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    return localJPanel1;
  }

  public void a(int paramInt, String paramString)
  {
    this.a.add(paramString);
    if (paramInt != -1)
    {
      if (this.c[paramInt] == null)
        this.c[paramInt] = new Vector();
      this.c[paramInt].add(paramString);
      this.f.setSelectedIndex(0);
      this.j.setCaretPosition(this.j.getText().length());
    }
  }

  private void h()
  {
    String str = (String)this.g.getSelectedValue();
    DefaultListModel localDefaultListModel = (DefaultListModel)this.h.getModel();
    localDefaultListModel.clear();
    if (str != null)
    {
      Vector localVector = (Vector)com.zend.ide.y.g.a((String)this.e.get(str)).c();
      for (int i1 = 0; i1 < localVector.size(); i1++)
        localDefaultListModel.addElement(a((KeyStroke)localVector.get(i1)));
      this.h.repaint();
      this.h.revalidate();
    }
    l();
  }

  private void b(String paramString)
  {
    DefaultListModel localDefaultListModel = (DefaultListModel)this.h.getModel();
    String str2;
    if (this.k == null)
    {
      String str1 = ct.b(219);
      str2 = ct.b(220);
      JOptionPane.showConfirmDialog(getTopLevelAncestor(), str1, str2, -1, 2);
      return;
    }
    if (localDefaultListModel.contains(paramString))
    {
      JOptionPane.showConfirmDialog(getTopLevelAncestor(), ct.b(649), ct.b(132), -1, 2);
      this.o.grabFocus();
      return;
    }
    for (int i1 = 0; i1 < this.a.size(); i1++)
    {
      str2 = (String)this.a.get(i1);
      if (!c(str2).contains(a(this.k)))
        continue;
      String str3 = com.zend.ide.y.g.a(str2).f();
      JOptionPane.showConfirmDialog(getTopLevelAncestor(), ct.b(650) + str3 + ct.b(651), ct.b(132), -1, 2);
      this.o.grabFocus();
      return;
    }
    localDefaultListModel.addElement(paramString);
    com.zend.ide.y.g.a((String)this.e.get(this.g.getSelectedValue())).b(this.k);
    com.zend.ide.y.g.d();
  }

  private static Vector c(String paramString)
  {
    Vector localVector1 = (Vector)com.zend.ide.y.g.a(paramString).c();
    Vector localVector2 = new Vector();
    for (int i1 = 0; i1 < localVector1.size(); i1++)
      localVector2.add(a((KeyStroke)localVector1.get(i1)));
    return localVector2;
  }

  private static String a(KeyStroke paramKeyStroke)
  {
    String str = null;
    if (paramKeyStroke != null)
    {
      int i1 = paramKeyStroke.getModifiers();
      int i2 = paramKeyStroke.getKeyCode();
      str = KeyEvent.getKeyText(i2);
      if (!b(i1, i2))
        str = KeyEvent.getKeyModifiersText(i1) + " " + str;
    }
    return str;
  }

  private static boolean c(int paramInt1, int paramInt2)
  {
    return (b(paramInt1, paramInt2)) || (e(paramInt1, paramInt2));
  }

  private static boolean b(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 0) && (((paramInt2 >= 112) && (paramInt2 <= 123)) || (paramInt2 == 36) || (paramInt2 == 35));
  }

  private static boolean e(int paramInt1, int paramInt2)
  {
    int i1 = (paramInt2 == 16) || (paramInt2 == 17) || (paramInt2 == 18) || (paramInt2 == 157) ? 1 : 0;
    return (paramInt1 != 0) && (i1 == 0);
  }

  public void d()
  {
    f();
  }

  public void e()
  {
  }

  public void f()
  {
    this.b.clear();
    for (int i1 = 0; i1 < this.a.size(); i1++)
    {
      String str = (String)this.a.get(i1);
      this.b.put(str, com.zend.ide.y.g.a(str).c());
    }
    h();
  }

  public void a(String paramString)
  {
  }

  private void i()
  {
    String str = (String)this.i.getSelectedValue();
    com.zend.ide.y.g.k(str);
    e(str);
    this.i.repaint();
    this.i.revalidate();
    com.zend.ide.y.g.d();
    h();
  }

  private void e(String paramString)
  {
    if (paramString == null)
    {
      this.p.setEnabled(false);
      return;
    }
    if (com.zend.ide.y.g.m(paramString))
      this.p.setEnabled(false);
    else
      this.p.setEnabled(true);
  }

  private void j()
  {
    String str = (String)this.i.getSelectedValue();
    int i1 = this.i.getSelectedIndex();
    if (!com.zend.ide.y.g.m(str))
    {
      com.zend.ide.y.g.i(str);
      DefaultListModel localDefaultListModel = (DefaultListModel)this.i.getModel();
      localDefaultListModel.removeElement(str);
      this.i.setSelectedIndex(i1 - 1);
      h();
      e((String)this.i.getSelectedValue());
      this.i.repaint();
    }
  }

  private void m()
  {
    setName("keyMapPanel");
    this.n.setName("restoreDefaultsButton");
    this.w.setName("activateConfigButton");
    this.x.setName("duplicateConfigButton");
    this.m.setName("defaultValueButton");
    this.o.setName("addValueButton");
    this.p.setName("deleteConfigButton");
    this.q.setName("removeKeyButton");
    this.f.setName("categoryCombo");
    this.g.setName("commandsList");
    this.h.setName("currentKeys");
    this.i.setName("configList");
    this.j.setName("newValueField");
  }

  static JTextField a(bi parambi)
  {
    return parambi.j;
  }

  static com.zend.ide.p.w b(bi parambi)
  {
    return parambi.o;
  }

  static String a(bi parambi, String paramString)
  {
    return parambi.s = paramString;
  }

  static void c(bi parambi)
  {
    parambi.l();
  }

  static com.zend.ide.p.w e(bi parambi)
  {
    return parambi.p;
  }

  static JList d(bi parambi)
  {
    return parambi.i;
  }

  static void b(bi parambi, String paramString)
  {
    parambi.e(paramString);
  }

  static JComboBox h(bi parambi)
  {
    return parambi.f;
  }

  static Map i(bi parambi)
  {
    return parambi.d;
  }

  static Vector[] o(bi parambi)
  {
    return parambi.c;
  }

  static Map g(bi parambi)
  {
    return parambi.e;
  }

  static JList l(bi parambi)
  {
    return parambi.g;
  }

  static JList m(bi parambi)
  {
    return parambi.h;
  }

  static void f(bi parambi)
  {
    parambi.h();
  }

  static String k(bi parambi)
  {
    return parambi.s;
  }

  static void c(bi parambi, String paramString)
  {
    parambi.b(paramString);
  }

  static String b(KeyStroke paramKeyStroke)
  {
    return a(paramKeyStroke);
  }

  static ArrayList p(bi parambi)
  {
    return parambi.a;
  }

  static boolean d(int paramInt1, int paramInt2)
  {
    return c(paramInt1, paramInt2);
  }

  static KeyStroke a(bi parambi, KeyStroke paramKeyStroke)
  {
    return parambi.k = paramKeyStroke;
  }

  static String d(bi parambi, String paramString)
  {
    return parambi.l = paramString;
  }

  static KeyStroke n(bi parambi)
  {
    return parambi.k;
  }

  static String q(bi parambi)
  {
    return parambi.l;
  }

  static void r(bi parambi)
  {
    parambi.i();
  }

  static void s(bi parambi)
  {
    parambi.j();
  }

  static int j(bi parambi)
  {
    return parambi.r;
  }

  static int t(bi parambi)
  {
    return parambi.r++;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bi
 * JD-Core Version:    0.6.0
 */