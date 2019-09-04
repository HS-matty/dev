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
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class nb extends mb
{
  private x d;
  private x e;
  private x f;
  private x g;
  private x h;
  private x i;
  private x j;
  private JTextField k;
  private JTextField l;
  private bp m;

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
    this.k = new cb();
    this.k.setEditable(false);
    this.k.setBackground(Color.white);
    w localw = new w();
    localw.setText("...");
    localw.setPreferredSize(new Dimension((int)localw.getPreferredSize().getWidth(), (int)this.k.getPreferredSize().getHeight()));
    localw.addActionListener(new fb(this));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    z localz1 = new z(ct.a(586) + ": ");
    localz1.setLabelFor(this.k);
    localJPanel2.add(localz1, "West");
    localJPanel2.add(this.k, "Center");
    localJPanel2.add(localw, "East");
    JPanel localJPanel3 = new JPanel(new GridLayout(-1, 1, 5, 5));
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
    localJPanel3.add(localJPanel2);
    this.l = new JTextField();
    z localz2 = new z(ct.a(1334) + ": ");
    localz2.setLabelFor(this.l);
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    localJPanel4.add(localz2, "West");
    localJPanel4.add(this.l, "Center");
    localJPanel3.add(localJPanel4);
    a(new JComponent[] { localz1, localz2 });
    localJPanel1.add(localJPanel3);
    return localJPanel1;
  }

  private JPanel c()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1135)));
    JPanel localJPanel2 = new JPanel(new GridLayout(-1, 2, 5, 5));
    this.d = new x(ct.a(607));
    this.e = new x(ct.a(608));
    this.f = new x(ct.a(609));
    this.g = new x(ct.a(610));
    this.h = new x(ct.a(611));
    this.i = new x(ct.a(1022));
    localJPanel2.add(this.d);
    localJPanel2.add(this.e);
    localJPanel2.add(this.f);
    localJPanel2.add(this.g);
    localJPanel2.add(this.h);
    localJPanel2.add(this.i);
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
    this.j = new x(ct.a(1271));
    localJPanel2.add(this.j);
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
    localJPanel3.add(localJPanel2);
    localJPanel1.add(localJPanel3, "North");
    return localJPanel1;
  }

  private bp e()
  {
    if (this.m == null)
    {
      this.m = new bp(false);
      this.m.setMultiSelectionEnabled(false);
      this.m.setFileSelectionMode(0);
      this.m.setApproveButtonText(ct.a(116));
      this.m.setDialogTitle(ct.a(159));
    }
    return this.m;
  }

  protected void b()
  {
    super.b();
    this.k.setText(((File)b.a("cvs.cvsCommandLine").c()).getAbsolutePath());
    this.l.setText((String)b.a("cvs_rsh_env_var").b());
    this.d.setSelected(((Boolean)b.a("cvs.showUpdateDialog").b()).booleanValue());
    this.e.setSelected(((Boolean)b.a("cvs.showCommitDialog").b()).booleanValue());
    this.f.setSelected(((Boolean)b.a("cvs.showAddDialog").b()).booleanValue());
    this.g.setSelected(((Boolean)b.a("cvs.showStatusDialog").b()).booleanValue());
    this.h.setSelected(((Boolean)b.a("cvs.showDiffDialog").b()).booleanValue());
    this.i.setSelected(((Boolean)b.a("cvs.showLogDialog").b()).booleanValue());
    this.j.setSelected(((Boolean)b.a("cvs.showVisualDiff").b()).booleanValue());
  }

  public void d()
  {
    super.d();
    b.a("cvs.cvsCommandLine").a(new File(this.k.getText()));
    b.a("cvs_rsh_env_var").a(this.l.getText());
    b.a("cvs.showUpdateDialog").a(new Boolean(this.d.isSelected()));
    b.a("cvs.showCommitDialog").a(new Boolean(this.e.isSelected()));
    b.a("cvs.showAddDialog").a(new Boolean(this.f.isSelected()));
    b.a("cvs.showStatusDialog").a(new Boolean(this.g.isSelected()));
    b.a("cvs.showDiffDialog").a(new Boolean(this.h.isSelected()));
    b.a("cvs.showLogDialog").a(new Boolean(this.i.isSelected()));
    b.a("cvs.showVisualDiff").a(new Boolean(this.j.isSelected()));
    f();
  }

  public void e()
  {
    super.e();
  }

  public void f()
  {
    super.f();
    this.k.setText(((File)b.a("cvs.cvsCommandLine").c()).getAbsolutePath());
    this.l.setText((String)b.a("cvs_rsh_env_var").c());
    this.d.setSelected(((Boolean)b.a("cvs.showUpdateDialog").c()).booleanValue());
    this.e.setSelected(((Boolean)b.a("cvs.showCommitDialog").c()).booleanValue());
    this.f.setSelected(((Boolean)b.a("cvs.showAddDialog").c()).booleanValue());
    this.g.setSelected(((Boolean)b.a("cvs.showStatusDialog").c()).booleanValue());
    this.h.setSelected(((Boolean)b.a("cvs.showDiffDialog").c()).booleanValue());
    this.i.setSelected(((Boolean)b.a("cvs.showLogDialog").c()).booleanValue());
    this.j.setSelected(((Boolean)b.a("cvs.showVisualDiff").c()).booleanValue());
  }

  static bp a(nb paramnb)
  {
    return paramnb.e();
  }

  static JTextField b(nb paramnb)
  {
    return paramnb.k;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.nb
 * JD-Core Version:    0.6.0
 */