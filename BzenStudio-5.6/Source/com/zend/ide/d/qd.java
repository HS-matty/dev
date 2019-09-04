package com.zend.ide.d;

import com.zend.ide.p.x;
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
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class qd extends JPanel
  implements a, cu, bn
{
  private bb a;
  private String b = "propertyEditor";
  private bt c;
  private x d;
  private x e;
  private x f;
  private x g;
  private x h;
  private x i;
  private x j;

  public qd()
  {
    a();
    this.a = new mc(this, null);
    mc.a((mc)this.a);
    this.c = new bt(this);
  }

  private void a()
  {
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    add(b(), "North");
  }

  private JPanel b()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setAlignmentX(0.0F);
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1782)));
    JPanel localJPanel2 = new JPanel(new GridLayout(-1, 2, 5, 5));
    this.d = new x(ct.a(595));
    this.e = new x(ct.a(1702));
    this.f = new x(ct.a(1055));
    this.g = new x(ct.a(435));
    this.h = new x(ct.a(89));
    this.i = new x(ct.a(990));
    this.j = new x(ct.a(1673));
    localJPanel2.add(this.f);
    localJPanel2.add(this.e);
    localJPanel2.add(this.g);
    localJPanel2.add(this.d);
    localJPanel2.add(this.h);
    localJPanel2.add(this.i);
    localJPanel2.add(this.j);
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
    localJPanel3.add(localJPanel2);
    localJPanel1.add(localJPanel3, "North");
    return localJPanel1;
  }

  public void d()
  {
    b.a("application.showTipsDialog").a(Boolean.valueOf(this.d.isSelected()));
    b.a("desktop.helpAgent").a(Boolean.valueOf(this.e.isSelected()));
    b.a("application.showAnalayzerDialog").a(Boolean.valueOf(this.f.isSelected()));
    b.a("project.saveAsProjectDialog").a(Boolean.valueOf(this.g.isSelected()));
    b.a("application.showListDialog").a(Boolean.valueOf(this.h.isSelected()));
    b.a("application.showUpdateDialog").a(Boolean.valueOf(this.i.isSelected()));
    b.a("application.showDebugConflictDialog").a(Boolean.valueOf(this.j.isSelected()));
    f();
  }

  public void f()
  {
    this.d.setSelected(((Boolean)b.a("application.showTipsDialog")).booleanValue());
    this.e.setSelected(((Boolean)b.a("desktop.helpAgent")).booleanValue());
    this.f.setSelected(((Boolean)b.a("application.showAnalayzerDialog")).booleanValue());
    this.g.setSelected(((Boolean)b.a("project.saveAsProjectDialog")).booleanValue());
    this.h.setSelected(((Boolean)b.a("application.showListDialog")).booleanValue());
    this.i.setSelected(((Boolean)b.a("application.showUpdateDialog")).booleanValue());
    this.j.setSelected(((Boolean)b.a("application.showDebugConflictDialog")).booleanValue());
  }

  private void c()
  {
    this.d.setSelected(((Boolean)b.a("application.showTipsDialog").b()).booleanValue());
    this.e.setSelected(((Boolean)b.a("desktop.helpAgent").b()).booleanValue());
    this.f.setSelected(((Boolean)b.a("application.showAnalayzerDialog").b()).booleanValue());
    this.g.setSelected(((Boolean)b.a("project.saveAsProjectDialog").b()).booleanValue());
    this.h.setSelected(((Boolean)b.a("application.showListDialog").b()).booleanValue());
    this.i.setSelected(((Boolean)b.a("application.showUpdateDialog").b()).booleanValue());
    this.j.setSelected(((Boolean)b.a("application.showDebugConflictDialog").b()).booleanValue());
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

  public bb q()
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

  static void a(qd paramqd)
  {
    paramqd.c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.qd
 * JD-Core Version:    0.6.0
 */