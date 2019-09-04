package com.zend.ide.gb.a;

import com.zend.ide.desktop.cj;
import com.zend.ide.gb.b.a;
import com.zend.ide.gb.b.b;
import com.zend.ide.gb.b.c;
import com.zend.ide.j.u;
import com.zend.ide.m.bf;
import com.zend.ide.p.ba;
import com.zend.ide.p.cd;
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
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class rb extends ob
{
  private static JList c;
  private static com.zend.ide.p.eb d;
  private static DefaultTableModel e;
  private w f;
  private w g;
  private JTextArea h;
  private static JCheckBox i;
  private JComboBox j;
  private JComboBox[] k = new JComboBox[2];
  private JPanel l;
  private JScrollPane m;
  private JPanel r;
  private JPanel n;
  private JPanel o;
  private static c p;
  private bp q;

  public rb(mb parammb)
  {
    b = parammb;
    c();
    n();
  }

  private void c()
  {
    k();
    m();
    h();
    f();
    e();
    g();
    d();
    this.h = new JTextArea(ct.a(1637));
    this.h.setFocusable(false);
    this.h.setBackground(getBackground());
    this.h.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
    this.h.setEditable(false);
    this.h.setLineWrap(true);
    this.h.setWrapStyleWord(true);
  }

  private void d()
  {
    this.r = new JPanel();
    this.r.setBorder(BorderFactory.createTitledBorder(""));
    JTextArea localJTextArea1 = new JTextArea(ct.a(1638));
    localJTextArea1.setEditable(false);
    localJTextArea1.setBackground(getBackground());
    this.r.add(localJTextArea1);
    this.o = new JPanel();
    this.o.setBorder(BorderFactory.createTitledBorder(""));
    JTextArea localJTextArea2 = new JTextArea(ct.a(1639));
    localJTextArea2.setEditable(false);
    localJTextArea2.setBackground(getBackground());
    this.o.add(localJTextArea2);
    this.n = new JPanel();
    this.n.setBorder(BorderFactory.createTitledBorder(""));
    String str = ct.a(1643).replace(",", ",\n");
    JTextArea localJTextArea3 = new JTextArea(str);
    localJTextArea3.setEditable(false);
    localJTextArea3.setBackground(getBackground());
    this.n.add(localJTextArea3);
  }

  private void e()
  {
    i = new JCheckBox(ct.a(1640));
    i.setEnabled(false);
    i.addActionListener(new v(this));
  }

  private void f()
  {
    this.j = new kb(this, null);
    this.j.setModel(new DefaultComboBoxModel());
    this.j.setEnabled(false);
    this.j.setEditable(true);
    this.k[0] = this.j;
  }

  private void g()
  {
    d = new com.zend.ide.p.eb();
    Vector localVector = new Vector();
    localVector.add("");
    localVector.add(ct.a(1641));
    localVector.add(ct.a(1642));
    d.getTableHeader().setPreferredSize(new Dimension(200, 20));
    e = new ub(this, localVector, 0);
    d.getTableHeader().setReorderingAllowed(false);
    d.setModel(e);
    d.a(1, new x(this));
    d.getSelectionModel().setSelectionMode(0);
    d.setAutoResizeMode(2);
    d.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(20);
    d.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(100);
    d.getTableHeader().getColumnModel().getColumn(2).setPreferredWidth(100);
    TableColumn localTableColumn = d.getColumnModel().getColumn(2);
    kb localkb = new kb(this, null);
    localkb.setModel(new DefaultComboBoxModel());
    localkb.setEditable(true);
    this.k[1] = localkb;
    localTableColumn.setCellEditor(new gb(this, localkb));
    d.setDefaultRenderer(Boolean.class, new jb());
  }

  private void h()
  {
    c = new JList(new DefaultListModel());
    c.getModel().addListDataListener(new y(this));
    c.addListSelectionListener(new ab(this));
    c.setCellRenderer(new ib(this, null));
  }

  private void i()
  {
    if (p == null)
      return;
    p.a(i.isSelected());
    p.a((String)this.j.getSelectedItem());
    ArrayList localArrayList = p.e();
    localArrayList.clear();
    for (int i1 = 0; i1 < e.getRowCount(); i1++)
    {
      if (!((Boolean)e.getValueAt(i1, 0)).booleanValue())
        continue;
      localArrayList.add(new a((String)e.getValueAt(i1, 1), (String)e.getValueAt(i1, 2)));
    }
  }

  private void j()
  {
    while (e.getRowCount() > 0)
      e.removeRow(0);
    i.setEnabled(false);
    this.j.setSelectedItem("");
    this.j.setEnabled(false);
    if (p == null)
      return;
    bf localbf = b.a(p.b());
    if (localbf == null)
    {
      l();
      return;
    }
    remove(this.n);
    add(this.l);
    validate();
    this.l.repaint();
    i.setEnabled(localbf.d().length > 0);
    i.setSelected(p.c());
    this.j.setSelectedItem(p.d());
    this.j.setEnabled(p.c());
    com.zend.ide.m.v[] arrayOfv = localbf.c();
    ArrayList localArrayList = p.e();
    if (arrayOfv.length == 0)
    {
      this.l.remove(this.m);
      this.l.add(this.o, "Center");
      this.l.validate();
      this.o.repaint();
    }
    else
    {
      this.l.remove(this.o);
      this.l.add(this.m, "Center");
      this.m.repaint();
      for (int i1 = 0; i1 < arrayOfv.length; i1++)
      {
        String str = arrayOfv[i1].a();
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Boolean.FALSE;
        arrayOfObject[1] = str;
        arrayOfObject[2] = "";
        for (int i2 = 0; i2 < localArrayList.size(); i2++)
        {
          a locala = (a)localArrayList.get(i2);
          if (!locala.a().equals(str))
            continue;
          arrayOfObject[0] = Boolean.TRUE;
          arrayOfObject[2] = locala.b();
          break;
        }
        e.addRow(arrayOfObject);
      }
    }
  }

  private void l()
  {
    remove(this.l);
    add(this.n);
    validate();
    this.n.repaint();
    i.setEnabled(false);
    i.setSelected(p.c());
    this.j.setSelectedItem(p.d());
    this.j.setEnabled(false);
    ArrayList localArrayList = p.e();
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      a locala = (a)localArrayList.get(i1);
      String str = locala.a();
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Boolean.TRUE;
      arrayOfObject[1] = str;
      arrayOfObject[2] = locala.b();
      e.addRow(arrayOfObject);
    }
  }

  private void k()
  {
    this.f = new w(cv.b("wsdlCreator/plus.gif"));
    this.f.addActionListener(new cb(this));
  }

  private bp l()
  {
    if (this.q == null)
    {
      this.q = c();
      com.zend.ide.j.y localy = b.a().l().g();
      if (localy != null)
      {
        File[] arrayOfFile = localy.b();
        if (arrayOfFile.length > 0)
        {
          File localFile = arrayOfFile[0];
          this.q.setSelectedFile(localFile);
        }
      }
    }
    return this.q;
  }

  private c a(String paramString)
  {
    bf localbf = b.a(paramString);
    if (localbf == null)
    {
      localObject1 = null;
      if (a(paramString))
        localObject1 = ct.a(156);
      else
        localObject1 = ct.a(1643);
      ba.a(this, localObject1, ct.a(94), 0);
      return null;
    }
    Object localObject1 = localbf.c();
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < localObject1.length; i1++)
    {
      localObject2 = new a(localObject1[i1].a(), "");
      localArrayList.add(localObject2);
    }
    i1 = localbf.d().length != 0 ? 1 : 0;
    Object localObject2 = new c(paramString, i1, "", localArrayList);
    return (c)(c)localObject2;
  }

  private boolean a(String paramString)
  {
    com.zend.ide.j.y localy = b.a().l().g();
    if (localy == null)
      return false;
    File[] arrayOfFile = localy.b();
    return a(arrayOfFile, paramString);
  }

  private boolean a(File[] paramArrayOfFile, String paramString)
  {
    for (int i1 = 0; i1 < paramArrayOfFile.length; i1++)
    {
      File localFile = paramArrayOfFile[i1];
      if (localFile == null)
        continue;
      if (localFile.isDirectory())
      {
        if (a(localFile.listFiles(), paramString))
          return true;
      }
      else if (localFile.getPath().equals(paramString))
        return true;
    }
    return false;
  }

  private void m()
  {
    this.g = new w(cv.b("wsdlCreator/minus.gif"));
    this.g.addActionListener(new db(this));
  }

  private void n()
  {
    setLayout(new BorderLayout());
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel1.add(this.h, "Center");
    add(localJPanel1, "North");
    JScrollPane localJScrollPane = new JScrollPane(c);
    JPanel localJPanel2 = new JPanel(new FlowLayout());
    localJPanel2.add(this.f);
    localJPanel2.add(this.g);
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.setBorder(BorderFactory.createTitledBorder(""));
    localJPanel3.add(localJPanel2, "North");
    localJPanel3.add(localJScrollPane, "Center");
    localJPanel3.setPreferredSize(new Dimension(109, 254));
    add(localJPanel3, "West");
    this.l = new JPanel(new BorderLayout());
    this.l.setBorder(BorderFactory.createTitledBorder(""));
    this.m = new cd(d, 20, 30);
    this.m.setBorder(BorderFactory.createTitledBorder(""));
    this.l.add(this.m, "Center");
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    JPanel localJPanel5 = new JPanel();
    localJPanel5.setLayout(new FlowLayout(2));
    localJPanel5.add(this.j);
    localJPanel4.add(i, "West");
    localJPanel4.add(localJPanel5, "Center");
    this.j.setPreferredSize(new Dimension(131, 22));
    this.l.add(localJPanel4, "North");
    add(this.l, "Center");
  }

  void a(b paramb)
  {
    DefaultListModel localDefaultListModel = (DefaultListModel)c.getModel();
    localDefaultListModel.removeAllElements();
    this.a = paramb;
    ArrayList localArrayList = this.a.b();
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
      localDefaultListModel.addElement(localArrayList.get(i1));
    if (localDefaultListModel.isEmpty())
    {
      remove(this.l);
      add(this.r, "Center");
      validate();
    }
    else
    {
      remove(this.r);
      add(this.l, "Center");
      c.setSelectedIndex(0);
    }
  }

  void a()
  {
    if (this.a == null)
      return;
    i();
    ArrayList localArrayList = new ArrayList();
    DefaultListModel localDefaultListModel = (DefaultListModel)c.getModel();
    for (int i1 = 0; i1 < localDefaultListModel.size(); i1++)
      localArrayList.add(localDefaultListModel.getElementAt(i1));
    this.a.a(localArrayList);
  }

  void b()
  {
    o();
  }

  public boolean b(boolean paramBoolean)
  {
    a();
    if ((paramBoolean) && (!m()))
    {
      int i1 = ba.b(b, ct.a(1751), ct.a(1752), 0);
      return i1 == 0;
    }
    return true;
  }

  private boolean m()
  {
    ArrayList localArrayList1 = this.a.b();
    int i1 = localArrayList1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      c localc = (c)localArrayList1.get(i2);
      ArrayList localArrayList2 = localc.e();
      int i3 = localArrayList2.size();
      for (int i4 = 0; i4 < i3; i4++)
      {
        a locala = (a)localArrayList2.get(i4);
        String str = locala.b();
        if ((str == null) || (str.equals("")) || (str.trim().equals("")))
          return false;
      }
      if ((localc.c()) && ((localc.d() == null) || (localc.d().trim().equals(""))))
        return false;
    }
    return true;
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(!paramBoolean2);
  }

  private static boolean a(boolean paramBoolean)
  {
    DefaultListModel localDefaultListModel = (DefaultListModel)c.getModel();
    for (int i1 = 0; i1 < localDefaultListModel.size(); i1++)
    {
      c localc = (c)localDefaultListModel.getElementAt(i1);
      bf localbf = b.a(localc.b());
      if (localbf != null)
        continue;
      if (paramBoolean)
        SwingUtilities.invokeLater(new eb());
      return false;
    }
    return true;
  }

  private static void o()
  {
    boolean bool = p();
    b.b(bool);
    b.c(bool);
  }

  private static boolean p()
  {
    boolean bool = false;
    if (p != null)
    {
      bool = i.isSelected();
      for (int i1 = 0; i1 < e.getRowCount(); i1++)
      {
        if (!((Boolean)e.getValueAt(i1, 0)).booleanValue())
          continue;
        bool = true;
        break;
      }
    }
    if (!bool)
    {
      ListModel localListModel = c.getModel();
      String str = "";
      if (p != null)
        str = p.b();
      for (int i2 = 0; i2 < localListModel.getSize(); i2++)
      {
        c localc = (c)localListModel.getElementAt(i2);
        if ((localc.b().equals(str)) || ((localc.e().size() <= 0) && (!localc.c())))
          continue;
        bool = true;
        break;
      }
    }
    return (bool) && (a(false));
  }

  public boolean q()
  {
    return (p()) && (m());
  }

  static c r()
  {
    return p;
  }

  static JCheckBox s()
  {
    return i;
  }

  static JComboBox a(rb paramrb)
  {
    return paramrb.j;
  }

  static void t()
  {
    o();
  }

  static JList u()
  {
    return c;
  }

  static JPanel b(rb paramrb)
  {
    return paramrb.r;
  }

  static JPanel c(rb paramrb)
  {
    return paramrb.l;
  }

  static c a(c paramc)
  {
    p = paramc;
    return paramc;
  }

  static void d(rb paramrb)
  {
    paramrb.i();
  }

  static void e(rb paramrb)
  {
    paramrb.j();
  }

  static bp f(rb paramrb)
  {
    return paramrb.l();
  }

  static c a(rb paramrb, String paramString)
  {
    return paramrb.a(paramString);
  }

  static JComboBox[] g(rb paramrb)
  {
    return paramrb.k;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.rb
 * JD-Core Version:    0.6.0
 */