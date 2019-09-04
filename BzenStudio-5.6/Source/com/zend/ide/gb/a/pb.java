package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import com.zend.ide.m.bf;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class pb extends ob
{
  private w c;
  private w d;
  private w e;
  private w f;
  private JList g;
  private JTextField h;
  private JTextField i;
  private JTextField j;
  private bp k;
  private JLabel l;
  private JLabel m;
  private JLabel n;
  private JTextArea o;
  private nb p;
  private boolean r = false;
  private boolean s = false;
  JPanel q;

  public pb(mb parammb)
  {
    b = parammb;
    c();
    l();
  }

  private void c()
  {
    h();
    i();
    j();
    f();
    g();
    this.l = new JLabel(ct.a(1613));
    this.l.setBackground(Color.red);
    this.i = new JTextField(ct.a(686));
    this.i.setDocument(new com.zend.ide.p.a.c());
    this.l.setLabelFor(this.i);
    k();
    this.m = new JLabel(ct.a(1614));
    this.j = new JTextField();
    this.j.setEnabled(false);
    this.m.setLabelFor(this.j);
    this.o = new JTextArea(ct.a(1615));
    this.o.setFocusable(false);
    this.o.setBackground(getBackground());
    this.o.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
    this.o.setEditable(false);
    this.o.setLineWrap(true);
    this.o.setWrapStyleWord(true);
    this.n = new JLabel(ct.a(1616));
    this.n.setLabelFor(this.h);
    d();
  }

  private void d()
  {
    this.f = new w(ct.a(1350));
    this.f.addActionListener(new f(this));
  }

  private nb e()
  {
    if (this.p == null)
      this.p = new nb(this);
    return this.p;
  }

  private void f()
  {
    this.h = new JTextField();
    this.h.setDocument(new PlainDocument());
    this.h.getDocument().addDocumentListener(new g(this));
  }

  private void a(JTextField paramJTextField)
  {
    SwingUtilities.invokeLater(new h(this, paramJTextField));
  }

  private void g()
  {
    this.g = new JList(new DefaultListModel());
    this.g.getModel().addListDataListener(new i(this));
    this.g.addListSelectionListener(new k(this));
    this.g.setCellRenderer(new hb(this, null));
  }

  public void a(ArrayList paramArrayList)
  {
    if (paramArrayList.isEmpty())
    {
      b(ct.a(1311) + 1);
      this.g.setSelectedIndex(0);
      this.g.updateUI();
      return;
    }
    DefaultListModel localDefaultListModel = (DefaultListModel)this.g.getModel();
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
      localDefaultListModel.addElement(paramArrayList.get(i1));
  }

  private void h()
  {
    this.c = new w(cv.b("wsdlCreator/plus.gif"));
    this.c.addActionListener(new m(this));
  }

  private void i()
  {
    this.d = new w(cv.b("wsdlCreator/minus.gif"));
    this.d.addActionListener(new n(this));
  }

  private void j()
  {
    this.e = new w("...");
    this.e.addActionListener(new o(this));
  }

  private void k()
  {
    this.i.getDocument().addDocumentListener(new p(this));
  }

  private bp a(int paramInt)
  {
    if (this.k == null)
    {
      this.k = c();
      com.zend.ide.r.o localo = com.zend.ide.r.p.e().a("XML files");
      this.k.setFileFilter(localo.j());
    }
    this.k.setFileSelectionMode(paramInt);
    return this.k;
  }

  private void l()
  {
    setLayout(new BorderLayout());
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel1.add(this.o, "Center");
    add(localJPanel1, "North");
    JScrollPane localJScrollPane = new JScrollPane(this.g);
    JPanel localJPanel2 = new JPanel();
    localJPanel2.add(this.c);
    localJPanel2.add(this.d);
    this.q = new JPanel(new BorderLayout());
    this.q.add(localJPanel2, "North");
    this.q.add(localJScrollPane, "Center");
    this.q.setBorder(BorderFactory.createTitledBorder(""));
    this.q.setPreferredSize(new Dimension(109, 254));
    add(this.q, "West");
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.setBorder(BorderFactory.createTitledBorder(""));
    JPanel localJPanel4 = new JPanel(new BorderLayout(0, 5));
    localJPanel4.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 30));
    localJPanel4.add(this.n, "West");
    localJPanel4.add(this.h, "Center");
    localJPanel3.add(localJPanel4, "North");
    JPanel localJPanel5 = new JPanel(new BorderLayout(0, 15));
    localJPanel5.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
    JPanel localJPanel6 = new JPanel(new BorderLayout());
    localJPanel6.add(this.l, "North");
    localJPanel6.add(this.i, "Center");
    JPanel localJPanel7 = new JPanel(new BorderLayout());
    localJPanel7.add(this.m, "North");
    localJPanel7.add(this.j, "Center");
    localJPanel7.add(this.e, "East");
    JPanel localJPanel8 = new JPanel(new BorderLayout());
    localJPanel8.add(localJPanel7, "North");
    JPanel localJPanel9 = new JPanel(new FlowLayout(2));
    localJPanel9.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    localJPanel9.add(this.f);
    localJPanel5.add(localJPanel6, "North");
    localJPanel5.add(localJPanel8, "Center");
    localJPanel5.add(localJPanel9, "South");
    localJPanel3.add(localJPanel5, "Center");
    add(localJPanel3, "Center");
  }

  private String a(String paramString)
  {
    String str = a(0).getFileSystemView().getDefaultDirectory().getPath();
    return str + File.separator + paramString + ".wsdl";
  }

  private void b(String paramString)
  {
    String str = ct.a(686);
    b localb = new b(paramString, new ArrayList(), a(str), str, new ArrayList(), true, "http://schemas.xmlsoap.org/soap/encoding/", true);
    ((DefaultListModel)this.g.getModel()).addElement(localb);
  }

  void a(b paramb)
  {
    this.a = paramb;
    this.h.setText(this.a.d());
    String str1 = this.a.c();
    this.j.setText(str1);
    int i1 = str1.lastIndexOf(File.separator);
    int i2 = str1.lastIndexOf(".");
    if (i1 < i2)
      str1 = str1.substring(i1 + 1, i2);
    else
      str1 = str1.substring(i1 + 1);
    this.i.setText(str1);
    nb.a(e());
    String str2 = ct.a(686);
    this.r = this.i.getText().equals(str2);
  }

  void a()
  {
    if (this.a == null)
      return;
    this.a.b(this.h.getText());
    this.a.a(this.j.getText());
    String str1 = ct.a(686);
    String str2 = this.a.g();
    if (str2.equals(str1))
      this.a.d(this.i.getText());
  }

  void b()
  {
    boolean bool1 = (!this.i.getText().equals("")) && (!this.h.getText().equals(""));
    b.b(bool1);
    boolean bool2 = (bool1) && (b.k());
    b.c(bool2);
  }

  public boolean b(boolean paramBoolean)
  {
    a();
    return true;
  }

  public Object[] m()
  {
    return ((DefaultListModel)this.g.getModel()).toArray();
  }

  public void n()
  {
    if (this.g.getModel().getSize() > 0)
      if (this.g.getSelectedIndex() >= 0)
        b.a((b)this.g.getSelectedValue());
      else
        this.g.setSelectedIndex(0);
  }

  private boolean a(b paramb)
  {
    int i1 = (!paramb.d().equals("")) && (!paramb.c().equals("")) ? 1 : 0;
    ArrayList localArrayList = paramb.b();
    int i2 = 0;
    for (int i3 = 0; i3 < localArrayList.size(); i3++)
    {
      com.zend.ide.gb.b.c localc = (com.zend.ide.gb.b.c)localArrayList.get(i3);
      bf localbf = b.a(localc.b());
      if (localbf == null)
        return false;
      if ((!localc.c()) && (localc.e().isEmpty()))
        continue;
      i2 = 1;
    }
    return (i1 != 0) && (i2 != 0);
  }

  static nb a(pb parampb)
  {
    return parampb.e();
  }

  static JTextField b(pb parampb)
  {
    return parampb.h;
  }

  static void a(pb parampb, JTextField paramJTextField)
  {
    parampb.a(paramJTextField);
  }

  static JList c(pb parampb)
  {
    return parampb.g;
  }

  static boolean a(pb parampb)
  {
    return parampb.r;
  }

  static boolean a(pb parampb, boolean paramBoolean)
  {
    return parampb.s = paramBoolean;
  }

  static JTextField c(pb parampb)
  {
    return parampb.i;
  }

  static void a(pb parampb, String paramString)
  {
    parampb.b(paramString);
  }

  static bp a(pb parampb, int paramInt)
  {
    return parampb.a(paramInt);
  }

  static JTextField d(pb parampb)
  {
    return parampb.j;
  }

  static boolean e(pb parampb)
  {
    return parampb.s;
  }

  static boolean b(pb parampb, boolean paramBoolean)
  {
    return parampb.r = paramBoolean;
  }

  static boolean a(pb parampb, b paramb)
  {
    return parampb.a(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.pb
 * JD-Core Version:    0.6.0
 */