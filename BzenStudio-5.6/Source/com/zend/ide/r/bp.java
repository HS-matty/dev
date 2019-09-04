package com.zend.ide.r;

import com.zend.ide.i.n;
import com.zend.ide.p.ba;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

class bp extends n
  implements cu
{
  private int c;
  private JPanel b;
  private JPanel e;
  private JPanel f;
  private JPanel q;
  private JPanel g;
  private JPanel d;
  private w h;
  private w i;
  private JTextField j;
  private JTextField k;
  private z l;
  private z m;
  private z r;
  private com.zend.ide.p.x n;
  private com.zend.ide.p.x s;
  private mb t;
  private p o;
  private o p;
  private com.zend.ide.p.d.bp u;
  private String v;

  public bp(p paramp, JDialog paramJDialog)
  {
    super(paramJDialog == null ? com.zend.ide.bd.c.b().i() : paramJDialog);
    this.o = paramp;
    c();
  }

  private void c()
  {
    setModal(true);
    this.d = new JPanel(new BorderLayout());
    this.d.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
    this.b = new JPanel(new BorderLayout());
    e();
    a();
    f();
    this.b.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(), BorderFactory.createEmptyBorder(3, 3, 3, 3)));
    this.d.add(this.b, "Center");
    this.d.add(this.g, "South");
    add(this.d, "Center");
    setSize(300, 200);
    setLocationRelativeTo(getOwner());
  }

  private void e()
  {
    this.e = new JPanel(new BorderLayout(10, 0));
    this.l = new z(ct.a(685));
    this.m = new z(ct.a(1037));
    this.j = new JTextField();
    this.l.setLabelFor(this.j);
    this.j.addKeyListener(new x(this));
    this.k = new JTextField();
    this.m.setLabelFor(this.k);
    this.k.addKeyListener(new bc(this));
    Box localBox1 = new Box(1);
    localBox1.add(Box.createVerticalStrut(4));
    localBox1.add(this.l);
    localBox1.add(Box.createVerticalStrut(8));
    localBox1.add(this.m);
    Box localBox2 = new Box(1);
    localBox2.add(this.j);
    localBox2.add(Box.createVerticalStrut(5));
    localBox2.add(this.k);
    this.f = new JPanel(new BorderLayout());
    this.n = new com.zend.ide.p.x(ct.a(1038));
    this.n.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 5));
    this.n.addItemListener(new br(this));
    this.f.add(this.n);
    this.e.add(localBox1, "West");
    this.e.add(localBox2, "Center");
    this.e.add(this.f, "South");
    this.b.add(this.e, "North");
  }

  private void a()
  {
    this.q = new JPanel(new BorderLayout(12, 0));
    this.q.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(5, 0, 5, 0)));
    this.r = new z(ct.a(1726));
    this.t = new mb(this);
    this.s = new com.zend.ide.p.x(ct.a(1727));
    this.s.setBorder(BorderFactory.createEmptyBorder(4, 0, 5, 0));
    this.s.setSelected(true);
    this.q.add(this.r, "West");
    this.q.add(this.t, "Center");
    this.q.add(this.s, "South");
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(this.q, "North");
    this.b.add(localJPanel, "Center");
  }

  public com.zend.ide.p.d.bp b()
  {
    if (this.u == null)
    {
      this.u = new com.zend.ide.p.d.bp();
      this.u.setMultiSelectionEnabled(false);
      this.u.setFileSelectionMode(0);
      this.u.setDialogTitle(ct.a(1728));
    }
    this.u.setFileFilter(p.f().j());
    return this.u;
  }

  private void f()
  {
    this.g = new JPanel(new FlowLayout(2));
    this.h = new w(ct.a(116));
    this.h.addActionListener(new bs(this));
    this.i = new w(ct.a(117));
    this.i.addActionListener(new hb(this));
    this.g.add(this.h);
    this.g.add(this.i);
  }

  private void b(boolean paramBoolean)
  {
    this.t.setEnabled(paramBoolean);
    this.r.setEnabled(paramBoolean);
    this.s.setEnabled(paramBoolean);
  }

  public o a(o paramo, int paramInt)
  {
    this.p = paramo;
    a(paramInt);
    setVisible(true);
    return this.p;
  }

  private void a(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, String paramString3, boolean paramBoolean2)
  {
    d locald = this.o.a(paramString1, paramString2, false);
    p.b(locald, paramBoolean1);
    p.a(locald, paramInt);
    p.c(locald, paramString3);
    p.b(locald, "");
    p.a(locald, true);
    p.c(locald, true);
    p.d(locald, paramBoolean2);
    this.p = locald;
  }

  private void a(String paramString1, String paramString2)
  {
    c localc = new c();
    localc.b(paramString1);
    localc.c(paramString2);
    this.o.a(localc);
    this.p = localc;
  }

  private boolean g()
  {
    String str = this.j.getText();
    if ((str == null) || (str.equals("")))
    {
      ba.a(this, ct.a(1040), ct.a(94), 0);
      return false;
    }
    if ((this.c == 1) || (this.c == 2))
    {
      if (this.o.a(str) != null)
      {
        ba.a(this, ct.a(1085, str), ct.a(1086), 0);
        return false;
      }
      if (this.o.h(str))
      {
        ba.a(this, ct.a(1087, str), ct.a(1888), 0);
        return false;
      }
    }
    return true;
  }

  private void a(int paramInt)
  {
    this.c = paramInt;
    if (paramInt == 1)
    {
      this.p = null;
      a(true);
      h();
      setTitle(ct.a(1036));
      this.n.setVisible(true);
      this.n.setSelected(false);
      this.q.setVisible(true);
      b(this.n.isSelected());
      this.t.a("");
      this.v = "";
      setSize(300, 200);
    }
    else if (paramInt == 0)
    {
      setTitle(ct.a(1089));
      this.j.setText(this.p.b());
      this.v = ((d)this.p).a();
      this.k.setText(this.p.getDescription());
      this.n.setVisible(true);
      this.n.setSelected(((d)this.p).i());
      this.q.setVisible(true);
      b(this.n.isSelected());
      this.t.a(((d)this.p).a());
      this.t.setSelectedIndex(((d)this.p).b());
      this.s.setSelected(((d)this.p).c());
      if (this.p.d())
        a(false);
      else
        a(true);
      setSize(300, 200);
    }
    else if (paramInt == 2)
    {
      this.p = null;
      a(true);
      h();
      setTitle(ct.a(1090));
      this.n.setVisible(false);
      this.q.setVisible(false);
      setSize(300, 130);
    }
  }

  private void a(boolean paramBoolean)
  {
    this.j.setEnabled(paramBoolean);
    this.l.setEnabled(paramBoolean);
    this.n.setEnabled(paramBoolean);
  }

  private void h()
  {
    this.j.setText("");
    this.k.setText("");
  }

  static w a(bp parambp)
  {
    return parambp.h;
  }

  static com.zend.ide.p.x a(bp parambp)
  {
    return parambp.n;
  }

  static void a(bp parambp, boolean paramBoolean)
  {
    parambp.b(paramBoolean);
  }

  static boolean b(bp parambp)
  {
    return parambp.g();
  }

  static int c(bp parambp)
  {
    return parambp.c;
  }

  static com.zend.ide.p.x f(bp parambp)
  {
    return parambp.s;
  }

  static mb d(bp parambp)
  {
    return parambp.t;
  }

  static String e(bp parambp)
  {
    return parambp.v;
  }

  static JTextField f(bp parambp)
  {
    return parambp.j;
  }

  static JTextField g(bp parambp)
  {
    return parambp.k;
  }

  static void a(bp parambp, String paramString1, String paramString2, boolean paramBoolean1, int paramInt, String paramString3, boolean paramBoolean2)
  {
    parambp.a(paramString1, paramString2, paramBoolean1, paramInt, paramString3, paramBoolean2);
  }

  static o h(bp parambp)
  {
    return parambp.p;
  }

  static void a(bp parambp, String paramString1, String paramString2)
  {
    parambp.a(paramString1, paramString2);
  }

  static o a(bp parambp, o paramo)
  {
    return parambp.p = paramo;
  }

  static String a(bp parambp, String paramString)
  {
    return parambp.v = paramString;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.bp
 * JD-Core Version:    0.6.0
 */