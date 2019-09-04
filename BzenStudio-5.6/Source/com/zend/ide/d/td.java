package com.zend.ide.d;

import com.zend.ide.p.a.d;
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
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class td extends JPanel
  implements a, cu, bn
{
  private bb a;
  private String b = "propertyEditor";
  private bt c;
  private x d;
  private x e;
  private JComboBox f;
  private JComboBox g;
  private JTextField h;
  private JTextField i;
  private JTextField j;

  public td()
  {
    a();
    this.a = new pc(this, null);
    pc.a((pc)this.a);
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
    JPanel localJPanel1 = new JPanel(new BorderLayout(0, 5));
    JPanel localJPanel2 = new JPanel(new GridLayout(-1, 1, 5, 5));
    localJPanel1.setAlignmentX(0.0F);
    localJPanel2.setAlignmentX(0.0F);
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1530)));
    JPanel localJPanel3 = new JPanel(new GridLayout(-1, 1, 5, 7));
    this.d = new x(ct.a(1339));
    this.e = new x(ct.a(1340));
    JPanel localJPanel4 = f();
    JPanel localJPanel5 = g();
    JPanel localJPanel6 = d();
    JPanel localJPanel7 = c();
    JPanel localJPanel8 = e();
    localJPanel3.add(this.e);
    localJPanel3.add(this.d);
    localJPanel3.add(localJPanel8);
    localJPanel3.add(localJPanel7);
    localJPanel3.add(localJPanel6);
    this.e.setBorder(BorderFactory.createEmptyBorder());
    this.d.setBorder(BorderFactory.createEmptyBorder());
    localJPanel2.add(localJPanel4);
    localJPanel2.add(localJPanel5);
    JPanel localJPanel9 = new JPanel(new BorderLayout(5, 5));
    localJPanel9.add(localJPanel2, "North");
    localJPanel9.setBorder(BorderFactory.createTitledBorder(ct.a(1343)));
    JPanel localJPanel10 = new JPanel(new BorderLayout());
    localJPanel10.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
    localJPanel10.add(localJPanel3, "Center");
    localJPanel1.add(localJPanel10, "North");
    JPanel localJPanel11 = new JPanel(new BorderLayout(5, 5));
    localJPanel11.add(localJPanel1, "West");
    localJPanel11.add(localJPanel9, "Center");
    return localJPanel11;
  }

  private JPanel c()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(0, 5));
    localJPanel.add(new JLabel(ct.a(1341) + ": "), "West");
    this.h = new JTextField();
    localJPanel.add(this.h, "Center");
    return localJPanel;
  }

  private JPanel d()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(0, 5));
    localJPanel.add(new JLabel(ct.a(1405) + ": "), "West");
    this.i = new JTextField(new d(5), "", 0);
    localJPanel.add(this.i, "Center");
    return localJPanel;
  }

  private JPanel e()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(0, 5));
    localJPanel.add(new JLabel(ct.a(1794) + ": "), "West");
    this.j = new JTextField(new d(5), "", 5);
    localJPanel.add(this.j, "Center");
    return localJPanel;
  }

  private JPanel f()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(0, 5));
    localJPanel.add(new JLabel(ct.a(1344) + ": "), "West");
    this.f = new JComboBox(new String[] { ct.a(1346), ct.a(1347), ct.a(1348) });
    localJPanel.add(this.f, "Center");
    return localJPanel;
  }

  private JPanel g()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(0, 5));
    localJPanel.add(new JLabel(ct.a(1345) + ": "), "West");
    this.g = new JComboBox(new String[] { ct.a(1346), ct.a(1348) });
    localJPanel.add(this.g, "Center");
    return localJPanel;
  }

  public void d()
  {
    b.a("sql.tabbedResults").a(Boolean.valueOf(this.d.isSelected()));
    b.a("sql.pageSize").a(new Integer(this.j.getText()));
    b.a("sql.useLimit").a(Boolean.valueOf(this.e.isSelected()));
    b.a("sql.tableClickBehaviour").a(this.f.getSelectedItem().toString());
    b.a("sql.basicClickBehaviour").a(this.g.getSelectedItem().toString());
    b.a("sql.dateFormat").a(this.h.getText());
    b.a("sql.historyLimit").a(new Integer(this.i.getText()));
    f();
  }

  public void f()
  {
    this.d.setSelected(((Boolean)b.a("sql.tabbedResults")).booleanValue());
    this.j.setText(b.a("sql.pageSize").toString());
    this.e.setSelected(((Boolean)b.a("sql.useLimit")).booleanValue());
    this.f.setSelectedItem(b.a("sql.tableClickBehaviour").toString());
    this.g.setSelectedItem(b.a("sql.basicClickBehaviour").toString());
    this.h.setText((String)b.a("sql.dateFormat"));
    this.i.setText(b.a("sql.historyLimit").toString());
  }

  private void h()
  {
    this.d.setSelected(((Boolean)b.a("sql.tabbedResults").b()).booleanValue());
    this.j.setText(b.a("sql.pageSize").b().toString());
    this.e.setSelected(((Boolean)b.a("sql.useLimit").b()).booleanValue());
    this.f.setSelectedItem(b.a("sql.tableClickBehaviour").b());
    this.g.setSelectedItem(b.a("sql.basicClickBehaviour").b());
    this.h.setText((String)b.a("sql.dateFormat").b());
    this.i.setText(b.a("sql.historyLimit").b().toString());
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

  static void a(td paramtd)
  {
    paramtd.h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.td
 * JD-Core Version:    0.6.0
 */