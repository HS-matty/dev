package com.zend.ide.r;

import com.zend.ide.p.cd;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;

public class ba extends JPanel
  implements r, cu
{
  private p a;
  private JDialog x;
  private JPanel b;
  private JPanel c;
  private JPanel d;
  private JPanel e;
  private JPanel k;
  private JPanel s;
  private JPanel t;
  private JPanel u;
  private JPanel f;
  private JList g;
  private JList h;
  private JList v;
  private JList w;
  private JScrollPane i;
  private JScrollPane j;
  private com.zend.ide.p.z l;
  private com.zend.ide.p.w m;
  private com.zend.ide.p.w n;
  private com.zend.ide.p.w F;
  private com.zend.ide.p.w o;
  private com.zend.ide.p.w p;
  private com.zend.ide.p.w y;
  private com.zend.ide.p.w z;
  private com.zend.ide.p.w B;
  private com.zend.ide.p.w C;
  private n q;
  private m r;
  private bp D;
  private bq E;
  private ListCellRenderer A;

  public ba(p paramp, JDialog paramJDialog)
  {
    this.x = paramJDialog;
    if (paramp == null)
      throw new RuntimeException("fileTypeManager can't be null !");
    this.a = paramp;
    u();
    paramp.a(this);
    setSize(550, 400);
    setPreferredSize(new Dimension(550, 400));
    setMaximumSize(new Dimension(550, 400));
  }

  private void u()
  {
    b();
    c();
    d();
    f();
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    add(this.f, "Center");
    e();
    n();
    this.g.setSelectedIndex(0);
    this.h.setSelectedIndex(0);
  }

  private void b()
  {
    this.b = k();
    this.d = g();
  }

  private void c()
  {
    this.t = l();
    this.k = m();
  }

  private void d()
  {
    JPanel localJPanel1 = new JPanel(new GridLayout(1, 2));
    localJPanel1.add(this.b);
    localJPanel1.add(this.d);
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1077)));
    JPanel localJPanel2 = new JPanel(new GridLayout(1, 2));
    localJPanel2.add(this.t);
    localJPanel2.add(this.k);
    localJPanel2.setBorder(BorderFactory.createTitledBorder(ct.a(1078)));
    localJPanel2.setPreferredSize(new Dimension(300, 300));
    this.f = new JPanel(new GridLayout(2, 1, 10, 0));
    this.f.add(localJPanel1);
    this.f.add(localJPanel2);
  }

  private JPanel g()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    this.e = new JPanel(new BorderLayout(0, 5));
    this.o = new com.zend.ide.p.w(ct.a(8));
    this.p = new com.zend.ide.p.w(ct.a(310));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    this.h = new z(this, new DefaultListModel());
    this.A = new bm(this);
    this.h.setCellRenderer(this.A);
    this.h.setSelectionMode(0);
    this.r = new m(this, null);
    this.h.addListSelectionListener(this.r);
    this.j = new cd(this.h);
    this.l = new com.zend.ide.p.z(ct.a(1033));
    this.l.setBorder(BorderFactory.createEmptyBorder(0, 6, 0, 0));
    localJPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(3, 5, 5, 5), BorderFactory.createEtchedBorder()));
    localJPanel2.add(this.j);
    this.e.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.e.add(this.o, "North");
    this.e.add(this.p, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.add(this.e, "North");
    localJPanel1.add(this.l, "North");
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(localJPanel3, "East");
    return localJPanel1;
  }

  private JPanel k()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    this.c = new JPanel(new BorderLayout());
    this.m = new com.zend.ide.p.w(ct.a(8));
    this.F = new com.zend.ide.p.w(ct.a(635));
    this.n = new com.zend.ide.p.w(ct.a(310));
    this.g = new v(this, new DefaultListModel());
    this.g.setSelectionMode(0);
    this.i = new cd(this.g);
    com.zend.ide.p.z localz = new com.zend.ide.p.z(ct.a(1032));
    localz.setBorder(BorderFactory.createEmptyBorder(5, 6, 0, 0));
    this.c.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(3, 5, 5, 5), BorderFactory.createEtchedBorder()));
    localJPanel2.add(this.i, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout(0, 5));
    localJPanel3.add(this.m, "North");
    localJPanel3.add(this.F, "Center");
    localJPanel3.add(this.n, "South");
    this.c.add(localJPanel3, "North");
    localJPanel1.add(localz, "North");
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(this.c, "East");
    this.q = new n(this, null);
    this.g.addListSelectionListener(this.q);
    return localJPanel1;
  }

  private JPanel l()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    this.s = new JPanel(new BorderLayout());
    this.y = new com.zend.ide.p.w(ct.a(8));
    this.z = new com.zend.ide.p.w(ct.a(310));
    this.v = new w(this, new DefaultListModel());
    this.v.setSelectionMode(0);
    cd localcd = new cd(this.v);
    this.s.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(3, 5, 5, 5), BorderFactory.createEtchedBorder()));
    localJPanel2.add(localcd, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout(0, 5));
    localJPanel3.add(this.y, "North");
    localJPanel3.add(this.z, "Center");
    this.s.add(localJPanel3, "North");
    JLabel localJLabel = new JLabel(ct.a(1079));
    localJLabel.setBorder(BorderFactory.createEmptyBorder(5, 6, 0, 0));
    localJPanel1.add(localJLabel, "North");
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(this.s, "East");
    this.v.addListSelectionListener(new bn(this, null));
    return localJPanel1;
  }

  private JPanel m()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(3, 5, 5, 5), BorderFactory.createEtchedBorder()));
    this.w = new g(this, new DefaultListModel());
    this.w.addListSelectionListener(new h(this));
    this.w.setSelectionMode(0);
    cd localcd = new cd(this.w);
    localJPanel2.add(localcd, "Center");
    com.zend.ide.p.z localz = new com.zend.ide.p.z(ct.a(1080));
    localz.setBorder(BorderFactory.createEmptyBorder(5, 6, 0, 0));
    this.u = new JPanel(new BorderLayout());
    this.u.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.B = new com.zend.ide.p.w(ct.a(8));
    this.C = new com.zend.ide.p.w(ct.a(310));
    JPanel localJPanel3 = new JPanel(new BorderLayout(0, 5));
    localJPanel3.add(this.B, "North");
    localJPanel3.add(this.C, "Center");
    this.u.add(localJPanel3, "North");
    localJPanel1.add(localz, "North");
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(this.u, "East");
    return localJPanel1;
  }

  private void e()
  {
    Iterator localIterator = p.e().g();
    DefaultListModel localDefaultListModel = (DefaultListModel)this.g.getModel();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      localDefaultListModel.addElement(locald);
    }
  }

  private void n()
  {
    Iterator localIterator = p.e().d();
    while (localIterator.hasNext())
    {
      o localo = (o)localIterator.next();
      DefaultListModel localDefaultListModel = (DefaultListModel)this.v.getModel();
      localDefaultListModel.addElement(localo);
    }
    this.v.setSelectedIndex(0);
  }

  private void f()
  {
    this.m.addActionListener(new i(this));
    this.F.addActionListener(new j(this));
    this.n.addActionListener(new k(this));
    this.o.addActionListener(new l(this));
    this.p.addActionListener(new bb(this));
    this.y.addActionListener(new bd(this));
    this.z.addActionListener(new be(this));
    this.B.addActionListener(new bf(this));
    this.C.addActionListener(new jb(this));
  }

  protected o a(o paramo, int paramInt)
  {
    if (this.D == null)
      this.D = new bp(this.a, this.x);
    return this.D.a(paramo, paramInt);
  }

  private void h()
  {
    String str = com.zend.ide.p.ba.c(this, ct.a(1034), ct.a(1035), -1);
    if (str == null)
      return;
    if ((locald = this.a.b(str)) != null)
    {
      com.zend.ide.p.ba.a(this, ct.a(1081, locald.b()), ct.a(1082), 0);
      return;
    }
    d locald = (d)this.g.getSelectedValue();
    this.a.a(locald, new f(str));
    j();
  }

  private void i()
  {
    f localf = (f)this.h.getSelectedValue();
    d locald = (d)this.g.getSelectedValue();
    this.a.b(locald, localf);
    ((DefaultListModel)this.h.getModel()).removeElement(localf);
    j();
  }

  private void j()
  {
    d locald = (d)this.g.getSelectedValue();
    if (locald != null)
      this.h.setListData(locald.h());
    else
      this.h.setListData(new Object[0]);
  }

  private void o()
  {
    o localo = a(null, 2);
    if (localo != null)
    {
      DefaultListModel localDefaultListModel = (DefaultListModel)this.v.getModel();
      if (!localDefaultListModel.contains(localo))
        localDefaultListModel.addElement(localo);
      this.a.a(localo);
      this.v.setSelectedValue(localo, true);
    }
  }

  private void p()
  {
    s().a();
    Object[] arrayOfObject = this.E.e();
    if ((arrayOfObject == null) || (arrayOfObject.length == 0))
      return;
    for (int i1 = 0; i1 < arrayOfObject.length; i1++)
    {
      d locald = (d)arrayOfObject[i1];
      if ((locald == null) || (((c)this.v.getSelectedValue()).c(locald)))
        continue;
      ((c)this.v.getSelectedValue()).a(locald);
    }
    r();
  }

  private void q()
  {
    d locald = (d)this.w.getSelectedValue();
    int i1 = this.w.getSelectedIndex();
    if (locald != null)
    {
      ((c)this.v.getSelectedValue()).b(locald);
      r();
      try
      {
        this.w.setSelectedIndex(i1);
      }
      catch (Exception localException)
      {
        this.w.setSelectedIndex(0);
      }
    }
  }

  private void a(d paramd)
  {
    Iterator localIterator = this.a.d();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.c(paramd))
        localc.b(paramd);
    }
    ((DefaultListModel)this.w.getModel()).removeElement(paramd);
    r();
  }

  private void r()
  {
    o localo = (o)this.v.getSelectedValue();
    if (localo != null)
      this.w.setListData(((c)localo).e().toArray());
    else
      this.w.setListData(new Object[0]);
  }

  public void a(bo parambo)
  {
    JList localJList = this.g;
    DefaultListModel localDefaultListModel = (DefaultListModel)localJList.getModel();
    int i1 = localDefaultListModel.indexOf(parambo.c());
    if (i1 == -1)
    {
      localJList = this.v;
      localDefaultListModel = (DefaultListModel)localJList.getModel();
      i1 = localDefaultListModel.indexOf(parambo.c());
    }
    if (i1 != -1)
    {
      localDefaultListModel.removeElement(parambo.c());
      localDefaultListModel.add(i1, parambo.b());
      localJList.setSelectedIndex(i1);
    }
  }

  public void a(o paramo)
  {
    if ((!(paramo instanceof c)) && (!((DefaultListModel)this.g.getModel()).contains(paramo)))
    {
      DefaultListModel localDefaultListModel = (DefaultListModel)this.g.getModel();
      localDefaultListModel.addElement(paramo);
      this.g.setSelectedValue(paramo, true);
    }
  }

  public void c(o paramo)
  {
  }

  private bq s()
  {
    if (this.E == null)
      this.E = new bq(this);
    return this.E;
  }

  private void t()
  {
    o localo = (o)this.v.getSelectedValue();
    if (localo == null)
      return;
    boolean bool = localo.d();
    if (!bool)
    {
      this.B.setEnabled(true);
      if (this.w.getSelectedValue() != null)
        this.C.setEnabled(true);
      else
        this.C.setEnabled(false);
    }
    else
    {
      this.B.setEnabled(false);
      this.C.setEnabled(false);
    }
  }

  static JList a(ba paramba)
  {
    return paramba.g;
  }

  static JList b(ba paramba)
  {
    return paramba.v;
  }

  static void d(ba paramba)
  {
    paramba.t();
  }

  static p a(ba paramba)
  {
    return paramba.a;
  }

  static void a(ba paramba, d paramd)
  {
    paramba.a(paramd);
  }

  static void b(ba paramba)
  {
    paramba.h();
  }

  static void h(ba paramba)
  {
    paramba.i();
  }

  static void c(ba paramba)
  {
    paramba.o();
  }

  static void g(ba paramba)
  {
    paramba.p();
  }

  static void e(ba paramba)
  {
    paramba.q();
  }

  static void f(ba paramba)
  {
    paramba.r();
  }

  static com.zend.ide.p.w f(ba paramba)
  {
    return paramba.z;
  }

  static com.zend.ide.p.w g(ba paramba)
  {
    return paramba.B;
  }

  static com.zend.ide.p.w k(ba paramba)
  {
    return paramba.C;
  }

  static void i(ba paramba)
  {
    paramba.j();
  }

  static com.zend.ide.p.w m(ba paramba)
  {
    return paramba.n;
  }

  static com.zend.ide.p.w j(ba paramba)
  {
    return paramba.F;
  }

  static JList k(ba paramba)
  {
    return paramba.h;
  }

  static com.zend.ide.p.w l(ba paramba)
  {
    return paramba.p;
  }

  static JDialog m(ba paramba)
  {
    return paramba.x;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.ba
 * JD-Core Version:    0.6.0
 */