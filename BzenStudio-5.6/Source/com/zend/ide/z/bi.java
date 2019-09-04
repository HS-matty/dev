package com.zend.ide.z;

import com.zend.ide.p.bb;
import com.zend.ide.p.eb;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class bi extends JPanel
  implements cu
{
  private bk a;
  private bl b;
  private Color c = new Color(0, 0, 153);
  private Color d = new Color(0, 153, 204);
  private bb e;
  private bb f;
  private x m;
  private JPanel o;
  private JPanel p;
  private JPanel q;
  private DecimalFormat g;
  private q h;
  private double n = 1000000.0D;

  public bi(q paramq)
  {
    super(new BorderLayout());
    this.h = paramq;
    this.g = new DecimalFormat("#0.00", new DecimalFormatSymbols(new Locale("en")));
    this.a = new bk(this);
    this.b = new bl(this);
    add(this.a, "Center");
    i();
  }

  private void i()
  {
    JPanel localJPanel1 = new JPanel(new GridLayout(0, 1));
    s locals = new s(this, null);
    this.e = new bb(ct.b(902));
    this.e.addActionListener(locals);
    this.e.setName("graphButton");
    this.f = new bb(ct.b(903));
    this.f.addActionListener(locals);
    this.f.setName("tableButton");
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.f);
    localButtonGroup.add(this.e);
    localJPanel1.add(this.f);
    localJPanel1.add(this.e);
    this.f.setSelected(true);
    JPanel localJPanel2 = new JPanel(new FlowLayout(1));
    this.m = new x(ct.b(1056));
    this.m.setName("zeroValuesCheckBox");
    this.m.setSelected(false);
    this.m.addActionListener(new ba(this, null));
    localJPanel2.add(this.m);
    b();
    this.o = new JPanel(new BorderLayout());
    this.o.add(localJPanel1, "West");
    this.o.add(localJPanel2, "Center");
    this.o.add(this.q, "East");
    add(this.o, "South");
  }

  private JPanel b()
  {
    this.p = new JPanel(new GridLayout(0, 1, 0, 3));
    z localz1 = new z(ct.a(904));
    z localz2 = new z("    ");
    localz2.setBackground(this.d);
    localz2.setOpaque(true);
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 0));
    localJPanel1.setToolTipText(ct.a(905));
    localJPanel1.add(localz2, "West");
    localJPanel1.add(localz1, "Center");
    z localz3 = new z(ct.a(906));
    z localz4 = new z("    ");
    localz4.setBackground(this.c);
    localz4.setOpaque(true);
    JPanel localJPanel2 = new JPanel(new BorderLayout(5, 0));
    localJPanel2.setToolTipText(ct.a(907));
    localJPanel2.add(localz4, "West");
    localJPanel2.add(localz3, "Center");
    localJPanel1.setName("ownTimePanel");
    localJPanel2.setName("totalTimePanel");
    this.p.add(localJPanel1);
    this.p.add(localJPanel2);
    this.p.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 10));
    this.q = new JPanel();
    this.q.setPreferredSize(this.p.getPreferredSize());
    return this.p;
  }

  public void a(String paramString)
  {
    eb localeb = a();
    for (int i = 0; i < localeb.getRowCount(); i++)
    {
      if (!localeb.getValueAt(i, 0).toString().trim().equals(paramString))
        continue;
      localeb.setRowSelectionInterval(i, i);
      localeb.b();
      break;
    }
  }

  public void a(int paramInt)
  {
    if (paramInt != -1)
    {
      eb localeb = a();
      localeb.setRowSelectionInterval(paramInt, paramInt);
      localeb.b();
    }
  }

  public void g()
  {
    h().e();
    doLayout();
    repaint();
    validate();
    validate();
  }

  public bk c()
  {
    return this.a;
  }

  public bl d()
  {
    return this.b;
  }

  public void a(n paramn)
  {
    this.b.a(paramn);
    this.a.a(paramn);
  }

  public void a(n[] paramArrayOfn)
  {
    this.b.a(paramArrayOfn);
    this.a.a(paramArrayOfn);
  }

  public void a(boolean paramBoolean)
  {
    this.b.b(paramBoolean);
    this.a.b(paramBoolean);
  }

  private void e()
  {
    int i = -1;
    if (this.e.isSelected())
    {
      i = this.a.a().getSelectedRow();
      remove(this.a);
      add(this.b, "Center");
      this.o.remove(this.q);
      this.o.add(this.p, "East");
    }
    else
    {
      i = this.b.a().getSelectedRow();
      remove(this.b);
      add(this.a, "Center");
      this.o.remove(this.p);
      this.o.add(this.q, "East");
    }
    g();
    a(i);
  }

  public eb a()
  {
    if (this.e.isSelected())
      return this.b.a();
    return this.a.a();
  }

  public bj h()
  {
    if (this.e.isSelected())
      return this.b;
    return this.a;
  }

  static x a(bi parambi)
  {
    return parambi.m;
  }

  static bk b(bi parambi)
  {
    return parambi.a;
  }

  static bl c(bi parambi)
  {
    return parambi.b;
  }

  static void d(bi parambi)
  {
    parambi.e();
  }

  static DecimalFormat f(bi parambi)
  {
    return parambi.g;
  }

  static double a(bi parambi)
  {
    return parambi.n;
  }

  static Color b(bi parambi)
  {
    return parambi.c;
  }

  static Color g(bi parambi)
  {
    return parambi.d;
  }

  static q c(bi parambi)
  {
    return parambi.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bi
 * JD-Core Version:    0.6.0
 */