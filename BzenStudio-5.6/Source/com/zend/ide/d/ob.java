package com.zend.ide.d;

import com.zend.ide.p.d.bp;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ob extends mb
{
  private x d;
  private x e;
  private x f;
  private x g;
  private x h;
  private x i;
  private x j;
  private x k;
  private x l;
  private x m;
  private JTextField n;
  private bp o;

  protected void a()
  {
    setLayout(new BorderLayout(5, 5));
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    add(a(), "North");
    add(e(), "Center");
    f();
  }

  private JPanel a()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 5));
    localJPanel1.add(b(), "North");
    localJPanel1.add(c(), "Center");
    localJPanel1.add(d(), "South");
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localJPanel1, "North");
    return localJPanel2;
  }

  private JPanel b()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1373)));
    this.n = new cb();
    this.n.setEditable(false);
    this.n.setBackground(Color.white);
    w localw = new w();
    localw.setText("...");
    localw.setPreferredSize(new Dimension((int)localw.getPreferredSize().getWidth(), (int)this.n.getPreferredSize().getHeight()));
    localw.addActionListener(new ib(this));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    z localz = new z(ct.a(1592) + ": ");
    localz.setLabelFor(this.n);
    localJPanel2.add(localz, "West");
    localJPanel2.add(this.n, "Center");
    localJPanel2.add(localw, "East");
    JPanel localJPanel3 = new JPanel(new GridLayout(-1, 1, 5, 5));
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
    localJPanel3.add(localJPanel2);
    localJPanel1.add(localJPanel3);
    return localJPanel1;
  }

  private JPanel c()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1135)));
    JPanel localJPanel2 = new JPanel(new GridLayout(-1, 2, 5, 5));
    this.d = new x(ct.a(1800));
    this.e = new x(ct.a(1801));
    this.f = new x(ct.a(1802));
    this.g = new x(ct.a(1803));
    this.h = new x(ct.a(1804));
    this.i = new x(ct.a(1805));
    this.j = new x(ct.a(1652));
    this.k = new x(ct.a(1653));
    this.l = new x(ct.a(1654));
    localJPanel2.add(this.d);
    localJPanel2.add(this.e);
    localJPanel2.add(this.f);
    localJPanel2.add(this.g);
    localJPanel2.add(this.h);
    localJPanel2.add(this.i);
    localJPanel2.add(this.j);
    localJPanel2.add(this.k);
    localJPanel2.add(this.l);
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
    localJPanel3.add(localJPanel2);
    localJPanel1.add(localJPanel3, "North");
    return localJPanel1;
  }

  private JPanel d()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1591)));
    JPanel localJPanel2 = new JPanel(new GridLayout(-1, 1, 5, 5));
    this.m = new x(ct.a(1271));
    localJPanel2.add(this.m);
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
    localJPanel3.add(localJPanel2);
    localJPanel1.add(localJPanel3, "North");
    return localJPanel1;
  }

  private bp e()
  {
    if (this.o == null)
    {
      this.o = new bp(false);
      this.o.setMultiSelectionEnabled(false);
      this.o.setFileSelectionMode(0);
      this.o.setApproveButtonText(ct.a(116));
      this.o.setDialogTitle(ct.a(159));
    }
    return this.o;
  }

  protected void b()
  {
    super.b();
    this.n.setText(((File)b.a("svn.svnCommandLine").b()).getAbsolutePath());
    this.d.setSelected(((Boolean)b.a("svn.showUpdateDialog").b()).booleanValue());
    this.e.setSelected(((Boolean)b.a("svn.showCommitDialog").b()).booleanValue());
    this.f.setSelected(((Boolean)b.a("svn.showAddDialog").b()).booleanValue());
    this.g.setSelected(((Boolean)b.a("svn.showStatusDialog").b()).booleanValue());
    this.h.setSelected(((Boolean)b.a("svn.showDiffDialog").b()).booleanValue());
    this.i.setSelected(((Boolean)b.a("svn.showLogDialog").b()).booleanValue());
    this.j.setSelected(((Boolean)b.a("svn.showDeleteDialog").b()).booleanValue());
    this.k.setSelected(((Boolean)b.a("svn.showRevertDialog").b()).booleanValue());
    this.l.setSelected(((Boolean)b.a("svn.showResolveDialog").b()).booleanValue());
    this.m.setSelected(((Boolean)b.a("svn.showVisualDiff").b()).booleanValue());
  }

  public void d()
  {
    super.d();
    b.a("svn.svnCommandLine").a(new File(this.n.getText()));
    b.a("svn.showUpdateDialog").a(new Boolean(this.d.isSelected()));
    b.a("svn.showCommitDialog").a(new Boolean(this.e.isSelected()));
    b.a("svn.showAddDialog").a(new Boolean(this.f.isSelected()));
    b.a("svn.showStatusDialog").a(new Boolean(this.g.isSelected()));
    b.a("svn.showDiffDialog").a(new Boolean(this.h.isSelected()));
    b.a("svn.showLogDialog").a(new Boolean(this.i.isSelected()));
    b.a("svn.showDeleteDialog").a(new Boolean(this.j.isSelected()));
    b.a("svn.showRevertDialog").a(new Boolean(this.k.isSelected()));
    b.a("svn.showResolveDialog").a(new Boolean(this.l.isSelected()));
    b.a("svn.showVisualDiff").a(new Boolean(this.m.isSelected()));
    f();
  }

  public void e()
  {
    super.e();
  }

  public void f()
  {
    super.f();
    this.n.setText(((File)b.a("svn.svnCommandLine").c()).getAbsolutePath());
    this.d.setSelected(((Boolean)b.a("svn.showUpdateDialog").c()).booleanValue());
    this.e.setSelected(((Boolean)b.a("svn.showCommitDialog").c()).booleanValue());
    this.f.setSelected(((Boolean)b.a("svn.showAddDialog").c()).booleanValue());
    this.g.setSelected(((Boolean)b.a("svn.showStatusDialog").c()).booleanValue());
    this.h.setSelected(((Boolean)b.a("svn.showDiffDialog").c()).booleanValue());
    this.i.setSelected(((Boolean)b.a("svn.showLogDialog").c()).booleanValue());
    this.j.setSelected(((Boolean)b.a("svn.showDeleteDialog").c()).booleanValue());
    this.k.setSelected(((Boolean)b.a("svn.showRevertDialog").c()).booleanValue());
    this.l.setSelected(((Boolean)b.a("svn.showResolveDialog").c()).booleanValue());
    this.m.setSelected(((Boolean)b.a("svn.showVisualDiff").c()).booleanValue());
  }

  static bp a(ob paramob)
  {
    return paramob.e();
  }

  static JTextField b(ob paramob)
  {
    return paramob.n;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ob
 * JD-Core Version:    0.6.0
 */