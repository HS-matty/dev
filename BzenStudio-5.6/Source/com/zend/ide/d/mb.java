package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.a;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public abstract class mb extends JPanel
  implements bn, cu, a
{
  private String a = "propertyEditor";
  private jb b = new jb(this, null);
  private bt c;
  private x d;
  private x e;
  private x f;
  private x g;
  private JComponent h;
  private JComponent i;
  private nd j;
  private nd k;
  private JColorChooser l;
  private JList m;
  private DefaultListModel n;
  private int o = -1;

  public mb()
  {
    jb.a(this.b);
    this.c = new bt(this);
    a();
  }

  protected abstract void a();

  protected JPanel e()
  {
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.setBorder(BorderFactory.createTitledBorder(ct.a(1863)));
    this.d = new x(ct.a(1892));
    this.d.setBorder(BorderFactory.createEmptyBorder(2, 9, 7, 0));
    this.d.addActionListener(new hb(this));
    localJPanel.add(this.d, "North");
    this.i = f();
    localJPanel.add(this.i, "Center");
    this.h = g();
    localJPanel.add(this.h, "East");
    h();
    return localJPanel;
  }

  protected JComponent f()
  {
    this.n = new DefaultListModel();
    this.m = new JList(this.n);
    this.m.setCellRenderer(new jd(this, null));
    this.m.setSelectionMode(0);
    this.m.getSelectionModel().addListSelectionListener(new hc(this));
    this.m.setSelectedIndex(0);
    return new JScrollPane(this.m);
  }

  protected JComponent g()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 5));
    JPanel localJPanel2 = new JPanel(new BorderLayout(5, 5));
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    this.e = new x(ct.b(1156));
    this.f = new x(ct.b(1157));
    localJPanel2.add(this.e, "West");
    localJPanel2.add(this.f, "Center");
    fd localfd = new fd(this);
    this.e.addActionListener(localfd);
    this.f.addActionListener(localfd);
    this.g = new x();
    this.g.addActionListener(new ed(this));
    z localz1 = new z(ct.a(1159));
    this.j = new nd(this);
    this.j.addMouseListener(new m(this, null));
    this.j.setOpaque(true);
    this.j.setPreferredSize(new Dimension(60, 25));
    JPanel localJPanel3 = new JPanel(new FlowLayout(2, 5, 5));
    localJPanel3.add(localz1);
    localJPanel3.add(this.j);
    z localz2 = new z(ct.a(1160));
    this.k = new nd(this);
    this.k.addMouseListener(new k(this, null));
    this.k.setOpaque(true);
    this.k.setHorizontalAlignment(0);
    this.k.setPreferredSize(new Dimension(60, 25));
    JPanel localJPanel4 = new JPanel(new FlowLayout(2, 5, 5));
    localJPanel4.add(this.g);
    localJPanel4.add(localz2);
    localJPanel4.add(this.k);
    JPanel localJPanel5 = new JPanel(new GridLayout(2, 1));
    localJPanel5.add(localJPanel3);
    localJPanel5.add(localJPanel4);
    localJPanel1.add(localJPanel5, "Center");
    localJPanel1.add(localJPanel2, "South");
    JPanel localJPanel6 = new JPanel(new BorderLayout());
    localJPanel6.add(localJPanel1, "North");
    return localJPanel6;
  }

  protected void h()
  {
    bd localbd = i();
    if (localbd != null)
    {
      Color localColor1 = localbd.b();
      Color localColor2 = localbd.c();
      int i1 = localbd.e();
      if (localColor1 != null)
        this.j.setBackground(localColor1);
      this.e.setSelected((i1 & 0x1) != 0);
      this.f.setSelected((i1 & 0x2) != 0);
      this.g.setSelected(localbd.d());
      a(localbd.d(), localColor2);
    }
  }

  private void a(JComponent paramJComponent, boolean paramBoolean)
  {
    Component[] arrayOfComponent = paramJComponent.getComponents();
    if ((arrayOfComponent != null) && (arrayOfComponent.length > 0))
      for (int i1 = 0; i1 < arrayOfComponent.length; i1++)
      {
        if (!(arrayOfComponent[i1] instanceof JComponent))
          continue;
        a((JComponent)arrayOfComponent[i1], paramBoolean);
      }
    paramJComponent.setEnabled(paramBoolean);
  }

  public boolean d(boolean paramBoolean)
  {
    return this.c.d(paramBoolean);
  }

  public bb q()
  {
    return this.b;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.a = paramString;
  }

  public String r()
  {
    return this.a;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    this.b.a(parambn.q());
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

  public void a(String paramString)
  {
  }

  public void d()
  {
    int i1 = this.n.getSize();
    for (int i2 = 0; i2 < i1; i2++)
    {
      jc localjc = (jc)this.n.getElementAt(i2);
      b.a(localjc.b()).a(localjc.a());
    }
    b.a("vcs.statusEnabled").a(new Boolean(this.d.isSelected()));
  }

  public void f()
  {
    this.n.clear();
    c localc = b.a("vcs.statusAdded");
    this.n.addElement(new jc(this, "vcs.statusAdded", localc.d(), (bd)((bd)localc.c()).clone()));
    localc = b.a("vcs.statusMergedWithConflicts");
    this.n.addElement(new jc(this, "vcs.statusMergedWithConflicts", localc.d(), (bd)((bd)localc.c()).clone()));
    localc = b.a("vcs.statusModified");
    this.n.addElement(new jc(this, "vcs.statusModified", localc.d(), (bd)((bd)localc.c()).clone()));
    localc = b.a("vcs.statusNotVersioned");
    this.n.addElement(new jc(this, "vcs.statusNotVersioned", localc.d(), (bd)((bd)localc.c()).clone()));
    localc = b.a("vcs.statusUpToDate");
    this.n.addElement(new jc(this, "vcs.statusUpToDate", localc.d(), (bd)((bd)localc.c()).clone()));
    if ((this.o > -1) && (this.n.getSize() > this.o))
      this.m.setSelectedIndex(this.o);
    else
      this.m.setSelectedIndex(0);
    this.d.setSelected(((Boolean)b.a("vcs.statusEnabled").c()).booleanValue());
    h();
    boolean bool = this.d.isSelected();
    a(this.h, bool);
    a(this.i, bool);
    this.m.validate();
    this.m.repaint();
  }

  public void e()
  {
  }

  protected void b()
  {
    this.n.clear();
    c localc = b.a("vcs.statusAdded");
    this.n.addElement(new jc(this, "vcs.statusAdded", localc.d(), (bd)((bd)localc.b()).clone()));
    localc = b.a("vcs.statusMergedWithConflicts");
    this.n.addElement(new jc(this, "vcs.statusMergedWithConflicts", localc.d(), (bd)((bd)localc.b()).clone()));
    localc = b.a("vcs.statusModified");
    this.n.addElement(new jc(this, "vcs.statusModified", localc.d(), (bd)((bd)localc.b()).clone()));
    localc = b.a("vcs.statusNotVersioned");
    this.n.addElement(new jc(this, "vcs.statusNotVersioned", localc.d(), (bd)((bd)localc.b()).clone()));
    localc = b.a("vcs.statusUpToDate");
    this.n.addElement(new jc(this, "vcs.statusUpToDate", localc.d(), (bd)((bd)localc.b()).clone()));
    if ((this.o > -1) && (this.n.getSize() > this.o))
      this.m.setSelectedIndex(this.o);
    else
      this.m.setSelectedIndex(0);
    this.d.setSelected(((Boolean)b.a("vcs.statusEnabled").b()).booleanValue());
    h();
    boolean bool = this.d.isSelected();
    a(this.h, bool);
    a(this.i, bool);
    this.m.validate();
    this.m.repaint();
  }

  protected static void a(JComponent[] paramArrayOfJComponent)
  {
    Dimension localDimension1 = new Dimension();
    for (int i1 = 0; i1 < paramArrayOfJComponent.length; i1++)
    {
      Dimension localDimension2 = paramArrayOfJComponent[i1].getPreferredSize();
      if (localDimension2.height > localDimension1.height)
        localDimension1.height = localDimension2.height;
      if (localDimension2.width <= localDimension1.width)
        continue;
      localDimension1.width = localDimension2.width;
    }
    for (i1 = 0; i1 < paramArrayOfJComponent.length; i1++)
      paramArrayOfJComponent[i1].setPreferredSize(localDimension1);
  }

  public Color a(Component paramComponent, String paramString, Color paramColor)
    throws HeadlessException
  {
    if (this.l == null)
      this.l = new JColorChooser(paramColor != null ? paramColor : Color.white);
    else
      this.l.setColor(paramColor);
    ds localds = new ds(this.l);
    JDialog localJDialog = JColorChooser.createDialog(paramComponent, paramString, true, this.l, localds, null);
    localJDialog.setVisible(true);
    return localds.b();
  }

  public bd i()
  {
    jc localjc = (jc)this.m.getSelectedValue();
    if (localjc != null)
      return localjc.a();
    return null;
  }

  private void a(boolean paramBoolean, Color paramColor)
  {
    if ((paramBoolean) && (paramColor != null))
    {
      this.k.setBackground(paramColor);
      this.k.setText("");
    }
    else
    {
      this.k.setBackground(Color.white);
      this.k.setText(ct.a(1174));
    }
    SwingUtilities.invokeLater(new ic(this, paramBoolean));
  }

  static x a(mb parammb)
  {
    return parammb.d;
  }

  static JComponent b(mb parammb)
  {
    return parammb.h;
  }

  static void a(mb parammb, JComponent paramJComponent, boolean paramBoolean)
  {
    parammb.a(paramJComponent, paramBoolean);
  }

  static JComponent c(mb parammb)
  {
    return parammb.i;
  }

  static JList d(mb parammb)
  {
    return parammb.m;
  }

  static int a(mb parammb, int paramInt)
  {
    return parammb.o = paramInt;
  }

  static nd e(mb parammb)
  {
    return parammb.k;
  }

  static x f(mb parammb)
  {
    return parammb.e;
  }

  static x g(mb parammb)
  {
    return parammb.f;
  }

  static x h(mb parammb)
  {
    return parammb.g;
  }

  static void a(mb parammb, boolean paramBoolean, Color paramColor)
  {
    parammb.a(paramBoolean, paramColor);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.mb
 * JD-Core Version:    0.6.0
 */