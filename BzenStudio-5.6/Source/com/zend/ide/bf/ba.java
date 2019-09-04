package com.zend.ide.bf;

import com.zend.ide.bc.a;
import com.zend.ide.i.n;
import com.zend.ide.n.gz;
import com.zend.ide.p.cd;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.w;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ba extends JPanel
  implements cu
{
  private n x;
  private bp z;
  private JPanel a;
  private JPanel b;
  private JPanel c;
  private com.zend.ide.p.eb d;
  private gz e;
  private JScrollPane f;
  private JScrollPane g;
  private w h;
  private w i;
  private w j;
  private w A;
  private w B;
  private w C;
  private z k;
  private JComboBox l;
  private w m;
  private w n;
  private w o;
  private JTextField p;
  private JTextField q;
  private gz r;
  private JScrollPane s;
  private JComboBox t;
  private com.zend.ide.p.z u;
  private com.zend.ide.p.z v;
  private com.zend.ide.p.z w;
  private ab y = new ab(this);

  public ba(n paramn)
  {
    this.x = paramn;
    b();
  }

  private void b()
  {
    c();
    d();
    e();
    f();
    a.a(this, "CUSTOMIZATION_TEMPLATES");
  }

  private void c()
  {
    this.d = new com.zend.ide.p.eb();
    this.d.getTableHeader().setReorderingAllowed(false);
    Vector localVector = new Vector();
    localVector.add(ct.a(1202));
    localVector.add(ct.a(1203));
    localVector.add(ct.a(1204));
    bb localbb = new bb(this, new Vector(), localVector);
    this.d.setModel(localbb);
    this.d.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(200);
    this.d.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(50);
    this.d.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(200);
    this.d.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(50);
    d[] arrayOfd = r.b().d();
    for (int i1 = 0; i1 < arrayOfd.length; i1++)
    {
      d locald = arrayOfd[i1];
      localbb.addRow(new Object[] { locald.a(), locald.d(), locald.b() });
    }
    this.d.getSelectionModel().addListSelectionListener(new e(this));
    this.d.addMouseListener(new f(this));
    this.d.addHierarchyListener(new g(this));
    this.d.getActionMap().put("editTemplate", this.y);
    this.d.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "editTemplate");
    this.d.a(0, 1);
    setPreferredSize(new Dimension(400, 400));
  }

  private void a()
  {
    int i1 = this.d.getSelectedRow();
    if (i1 == -1)
    {
      this.e.setText("");
      return;
    }
    Object localObject1 = this.d.getValueAt(i1, 1);
    Object localObject2 = this.d.getValueAt(i1, 0);
    d locald = r.b().a(localObject1, localObject2);
    if (locald != null)
      this.e.setText(locald.c());
  }

  private void d()
  {
    this.h = new w(ct.a(8));
    this.h.addActionListener(new h(this));
    this.j = new w(ct.a(1205));
    this.y.putValue("Name", ct.a(1205));
    this.j.setAction(this.y);
    this.i = new w(ct.a(310));
    this.i.addActionListener(new i(this));
    this.A = new w(ct.a(1739));
    this.A.addActionListener(new eb(this));
    this.B = new w(ct.a(1740));
    this.B.addActionListener(new fb(this));
    this.C = new w(ct.a(1741));
    this.C.addActionListener(new gb(this));
  }

  private void e()
  {
    this.e = new jb(this);
    this.e.a(false);
    this.e.setEditable(false);
    this.f = new cd(this.e);
  }

  private void f()
  {
    this.b = new JPanel(new BorderLayout(5, 5));
    this.b.add(this.h, "North");
    this.b.add(this.j, "Center");
    this.b.add(this.i, "South");
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 5));
    localJPanel1.add(this.C, "North");
    localJPanel1.add(this.A, "Center");
    localJPanel1.add(this.B, "South");
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.GRAY), BorderFactory.createEmptyBorder(5, 0, 0, 0)));
    JPanel localJPanel2 = new JPanel(new BorderLayout(5, 5));
    localJPanel2.add(this.b, "North");
    localJPanel2.add(localJPanel1, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout(5, 5));
    localJPanel3.add(localJPanel2, "North");
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    this.a = new JPanel(new BorderLayout(10, 10));
    this.g = new cd(this.d);
    this.a.add(this.g, "Center");
    JPanel localJPanel4 = new JPanel(new BorderLayout(10, 10));
    localJPanel4.add(this.g, "Center");
    localJPanel4.add(localJPanel3, "East");
    localJPanel4.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10), BorderFactory.createTitledBorder(' ' + ct.a(1213) + ": ")));
    this.c = new JPanel(new BorderLayout());
    this.c.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10), BorderFactory.createTitledBorder(' ' + ct.a(1342) + ' ')));
    this.c.add(this.f, "Center");
    setLayout(new GridLayout(2, 1));
    add(localJPanel4);
    add(this.c);
  }

  private void h()
  {
    int i1 = this.d.getSelectedRow();
    if (i1 == -1)
      return;
    Object localObject1 = this.d.getValueAt(i1, 1);
    Object localObject2 = this.d.getValueAt(i1, 0);
    d locald = r.b().a(localObject1, localObject2);
    g().a(locald);
    g().setVisible(true);
    c localc = (c)g().f();
    if (localc != null)
    {
      r.b().b(locald.d(), locald.a());
      r.b().a(localc.d(), localc);
      ((DefaultTableModel)this.d.e()).removeRow(this.d.b(i1));
      ((DefaultTableModel)this.d.e()).addRow(new Object[] { localc.a(), localc.d(), localc.b() });
      this.d.repaint();
      int i2 = this.d.a(localc.a(), 0);
      this.d.getSelectionModel().setSelectionInterval(i2, i2);
      this.d.b();
    }
  }

  private void a(File paramFile)
  {
    try
    {
      bf localbf = (bf)com.a.f.a(paramFile.getPath());
      d[] arrayOfd = localbf.b();
      for (int i1 = 0; i1 < arrayOfd.length; i1++)
      {
        d locald = arrayOfd[i1];
        while (r.b().a(locald))
        {
          JOptionPane.showMessageDialog(this, ct.a(1275, locald.a(), (String)locald.d()));
          g().a(locald);
          g().setVisible(true);
          locald = g().f();
          if (locald != null)
            continue;
        }
        if (locald == null)
          continue;
        r.b().a(locald.d(), locald);
        ((DefaultTableModel)this.d.e()).addRow(new Object[] { locald.a(), locald.d(), locald.b() });
        this.d.repaint();
        int i2 = this.d.a(locald.a(), 0);
        this.d.getSelectionModel().setSelectionInterval(i2, i2);
        this.d.b();
      }
      JOptionPane.showMessageDialog(this, ct.a(1742), ct.a(1743), 1);
    }
    catch (Exception localException)
    {
      JOptionPane.showMessageDialog(this, ct.a(1744), ct.a(1743), 0);
      cl.a(localException);
    }
  }

  private void a(File paramFile, boolean paramBoolean)
  {
    d[] arrayOfd;
    if (paramBoolean)
    {
      arrayOfd = r.b().d();
    }
    else
    {
      localObject1 = this.d.getSelectedRows();
      ArrayList localArrayList = new ArrayList(localObject1.length);
      for (int i1 = 0; i1 < localObject1.length; i1++)
      {
        Object localObject2 = this.d.getValueAt(localObject1[i1], 1);
        Object localObject3 = this.d.getValueAt(localObject1[i1], 0);
        d locald = r.b().a(localObject2, localObject3);
        localArrayList.add(locald);
      }
      arrayOfd = new d[localArrayList.size()];
      localArrayList.toArray(arrayOfd);
    }
    Object localObject1 = new bf();
    ((bf)localObject1).a(arrayOfd);
    try
    {
      com.a.f.a(paramFile.getPath(), localObject1);
    }
    catch (Exception localException)
    {
      JOptionPane.showMessageDialog(this, ct.a(1745), ct.a(1746), 0);
      cl.a(localException);
      return;
    }
    JOptionPane.showMessageDialog(this, ct.a(1747), ct.a(1746), 1);
  }

  private bp a(int paramInt)
  {
    if (this.z == null)
    {
      this.z = new bp(false);
      this.z.setFileSelectionMode(0);
      this.z.setFileFilter(p.e().c("XML files").j());
    }
    if (paramInt == 0)
      this.z.setDialogTitle(ct.a(1748));
    else
      this.z.setDialogTitle(ct.a(1749));
    return this.z;
  }

  private z g()
  {
    if (this.k == null)
      this.k = new z(this);
    return this.k;
  }

  static void a(ba paramba)
  {
    paramba.a();
  }

  static void b(ba paramba)
  {
    paramba.h();
  }

  static z c(ba paramba)
  {
    return paramba.g();
  }

  static com.zend.ide.p.eb d(ba paramba)
  {
    return paramba.d;
  }

  static bp a(ba paramba, int paramInt)
  {
    return paramba.a(paramInt);
  }

  static void a(ba paramba, File paramFile, boolean paramBoolean)
  {
    paramba.a(paramFile, paramBoolean);
  }

  static void a(ba paramba, File paramFile)
  {
    paramba.a(paramFile);
  }

  static n e(ba paramba)
  {
    return paramba.x;
  }

  static gz a(ba paramba, gz paramgz)
  {
    return paramba.r = paramgz;
  }

  static gz f(ba paramba)
  {
    return paramba.r;
  }

  static JScrollPane a(ba paramba, JScrollPane paramJScrollPane)
  {
    return paramba.s = paramJScrollPane;
  }

  static JScrollPane g(ba paramba)
  {
    return paramba.s;
  }

  static JComboBox a(ba paramba, JComboBox paramJComboBox)
  {
    return paramba.l = paramJComboBox;
  }

  static JComboBox b(ba paramba, JComboBox paramJComboBox)
  {
    return paramba.t = paramJComboBox;
  }

  static JComboBox h(ba paramba)
  {
    return paramba.l;
  }

  static JComboBox i(ba paramba)
  {
    return paramba.t;
  }

  static com.zend.ide.p.z a(ba paramba, com.zend.ide.p.z paramz)
  {
    return paramba.v = paramz;
  }

  static com.zend.ide.p.z j(ba paramba)
  {
    return paramba.v;
  }

  static JTextField a(ba paramba, JTextField paramJTextField)
  {
    return paramba.p = paramJTextField;
  }

  static JTextField k(ba paramba)
  {
    return paramba.p;
  }

  static com.zend.ide.p.z b(ba paramba, com.zend.ide.p.z paramz)
  {
    return paramba.u = paramz;
  }

  static com.zend.ide.p.z l(ba paramba)
  {
    return paramba.u;
  }

  static JTextField b(ba paramba, JTextField paramJTextField)
  {
    return paramba.q = paramJTextField;
  }

  static JTextField m(ba paramba)
  {
    return paramba.q;
  }

  static com.zend.ide.p.z c(ba paramba, com.zend.ide.p.z paramz)
  {
    return paramba.w = paramz;
  }

  static com.zend.ide.p.z n(ba paramba)
  {
    return paramba.w;
  }

  static w c(ba paramba, w paramw)
  {
    return paramba.o = paramw;
  }

  static w g(ba paramba)
  {
    return paramba.o;
  }

  static w a(ba paramba, w paramw)
  {
    return paramba.m = paramw;
  }

  static w o(ba paramba)
  {
    return paramba.m;
  }

  static w b(ba paramba, w paramw)
  {
    return paramba.n = paramw;
  }

  static w p(ba paramba)
  {
    return paramba.n;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.ba
 * JD-Core Version:    0.6.0
 */