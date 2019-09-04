package com.zend.ide.cb.a;

import com.zend.ide.bc.a;
import com.zend.ide.bd.c;
import com.zend.ide.be.k;
import com.zend.ide.cb.e;
import com.zend.ide.cb.q;
import com.zend.ide.cb.r;
import com.zend.ide.cb.t;
import com.zend.ide.cb.u;
import com.zend.ide.i.n;
import com.zend.ide.p.ba;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.File;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class dd extends n
  implements cu
{
  private JComboBox c;
  private JTextField d;
  private JTextField e;
  private JTextField f;
  private JTextField g;
  private jd h;
  private JPasswordField i;
  private x j;
  private x k;
  private x l;
  private x m;
  private x n;
  private x o;
  private com.zend.ide.p.z p;
  private com.zend.ide.p.z q;
  private com.zend.ide.p.z r;
  private com.zend.ide.p.z s;
  private com.zend.ide.p.z t;
  private com.zend.ide.p.w u;
  private com.zend.ide.p.w v;
  private com.zend.ide.p.w w;
  private JSpinner x;
  private q y;
  private u z;
  private String A;
  private static boolean b;
  private k B = c.b().d();
  private boolean C;

  public dd(Frame paramFrame, String paramString, q paramq, u paramu)
  {
    super(paramFrame, paramString, true);
    this.z = paramu;
    a();
    d();
    a(paramq);
  }

  public dd(Frame paramFrame, String paramString, u paramu)
  {
    this(paramFrame, paramString, null, paramu);
  }

  private void a()
  {
    setDefaultCloseOperation(2);
    getContentPane().setLayout(new BorderLayout());
    this.f = new JTextField();
    this.f.setDocument(new com.zend.ide.p.a.d(5));
    this.j = new x(ct.a(1503));
    this.k = new x(ct.a(1504));
    this.l = new x(ct.a(1505));
    this.l.setSelected(true);
    this.m = new x(ct.a(1506));
    this.n = new x(ct.a(196));
    this.o = new x(ct.a(1507));
    c(true);
    this.n.addActionListener(new y(this));
    this.c = new JComboBox(t.a().b());
    this.d = new JTextField();
    this.e = new JTextField();
    this.h = new jd(this);
    this.g = new JTextField();
    this.i = new JPasswordField();
    new cb(this, this.d);
    new cb(this, this.e);
    new cb(this, this.h.a());
    new cb(this, this.f);
    new cb(this, this.g);
    new cb(this, this.i);
    this.x = new ke(10, 10, 3600, 10, 4);
    a(true);
    this.o.addActionListener(new z(this));
    a(false);
    JPanel localJPanel1 = new JPanel(new GridLayout(-1, 1, 1, 3));
    JPanel localJPanel2 = new JPanel(new GridLayout(-1, 1, 1, 3));
    localJPanel2.add(new com.zend.ide.p.z(ct.a(1508)));
    localJPanel1.add(this.c);
    localJPanel2.add(new com.zend.ide.p.z(ct.a(1509)));
    localJPanel1.add(this.d);
    this.p = new com.zend.ide.p.z(ct.a(1510));
    localJPanel2.add(this.p);
    localJPanel1.add(this.e);
    this.q = new com.zend.ide.p.z(ct.a(1511));
    localJPanel2.add(this.q);
    localJPanel1.add(this.f);
    this.r = new com.zend.ide.p.z(ct.a(1450));
    localJPanel2.add(this.r);
    localJPanel1.add(this.h);
    this.s = new com.zend.ide.p.z(ct.a(190) + ' ');
    localJPanel2.add(this.s);
    localJPanel1.add(this.g);
    this.t = new com.zend.ide.p.z(ct.a(191) + ' ');
    localJPanel2.add(this.t);
    localJPanel1.add(this.i);
    Dimension localDimension = localJPanel2.getPreferredSize();
    localDimension.height = localJPanel1.getPreferredSize().height;
    localJPanel2.setPreferredSize(localDimension);
    localDimension = localJPanel1.getPreferredSize();
    localDimension.width = Math.max(localDimension.width, 200);
    localJPanel1.setPreferredSize(localDimension);
    JPanel localJPanel3 = new JPanel(new FlowLayout(0));
    localJPanel3.add(localJPanel2);
    localJPanel3.add(localJPanel1);
    JPanel localJPanel4 = new JPanel(new GridLayout(-1, 1, 5, 1));
    localJPanel4.add(this.m);
    localJPanel4.add(this.l);
    JPanel localJPanel5 = new JPanel(new GridLayout(-1, 1, 5, 1));
    localJPanel5.add(this.n);
    localJPanel5.add(new JLabel(" "));
    JPanel localJPanel6 = new JPanel(new BorderLayout(0, 0));
    JPanel localJPanel7 = new JPanel(new FlowLayout(0, 5, 0));
    localJPanel7.add(localJPanel4);
    localJPanel7.add(localJPanel5);
    localJPanel6.add(localJPanel7);
    JPanel localJPanel8 = new JPanel(new FlowLayout(0, 5, 0));
    localJPanel8.add(this.o);
    localJPanel8.add(this.x);
    localJPanel8.add(new JLabel(ct.a(1512)));
    localJPanel6.add(localJPanel8, "South");
    localJPanel3.setBorder(BorderFactory.createTitledBorder(ct.a(1513)));
    localJPanel6.setBorder(BorderFactory.createTitledBorder(ct.a(1514)));
    JPanel localJPanel9 = new JPanel(new BorderLayout());
    localJPanel9.add(localJPanel3);
    localJPanel9.add(localJPanel6, "South");
    getContentPane().add(localJPanel9);
    getContentPane().add(d(), "South");
    this.c.addItemListener(new fd(this));
    if (this.c.getItemCount() > 0)
    {
      this.c.setSelectedItem("MySQL");
      c();
    }
    pack();
    setLocationRelativeTo(null);
    setResizable(false);
    a.a(getContentPane(), "SQL_SERVER_SETTINGS");
  }

  private void c()
  {
    r localr = t.a().a((String)this.c.getSelectedItem());
    int i1 = localr.a();
    if (i1 >= 0)
      this.f.setText(String.valueOf(i1));
    else
      this.f.setText("");
    this.e.setEnabled(localr.d());
    this.p.setEnabled(localr.d());
    this.f.setEnabled(localr.e());
    this.q.setEnabled(localr.e());
    this.h.setEnabled(localr.f());
    this.r.setEnabled(localr.f());
    this.h.a(localr.h());
    this.g.setEnabled(localr.g());
    this.s.setEnabled(localr.g());
    this.i.setEnabled(localr.g());
    this.t.setEnabled(localr.g());
    this.j.setEnabled(localr.b());
    this.k.setEnabled(localr.c());
    this.n.setEnabled(localr.g());
    this.r.setText(localr.a());
  }

  private void d()
  {
    a(this.d);
    a(this.e);
    a(this.f);
    a(jd.a(this.h));
  }

  private JPanel d()
  {
    this.v = new com.zend.ide.p.w(new oc(this));
    this.w = new com.zend.ide.p.w(new mc(this));
    this.u = new com.zend.ide.p.w(new pc(this));
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new FlowLayout(2));
    Dimension localDimension = com.zend.ide.p.e.d.a(new JButton[] { this.v, this.w, this.u });
    this.v.setPreferredSize(localDimension);
    this.v.setMaximumSize(localDimension);
    this.v.setMinimumSize(localDimension);
    this.w.setPreferredSize(localDimension);
    this.w.setMaximumSize(localDimension);
    this.w.setMinimumSize(localDimension);
    this.u.setPreferredSize(localDimension);
    this.u.setMaximumSize(localDimension);
    this.u.setMinimumSize(localDimension);
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new ne(this));
    localJButton.setPreferredSize(localDimension);
    localJButton.setMaximumSize(localDimension);
    localJButton.setMinimumSize(localDimension);
    localJPanel.add(this.v);
    localJPanel.add(this.u);
    localJPanel.add(this.w);
    localJPanel.add(localJButton);
    return localJPanel;
  }

  public void a(q paramq)
  {
    if (paramq == null)
      return;
    c(paramq);
    b(paramq);
  }

  private void b(q paramq)
  {
    if (paramq == null)
      return;
    e locale = paramq.l();
    b(paramq.a());
    c(locale.c());
    a(locale.j());
    b(locale.e());
    d(locale.d());
    e(locale.a());
    f(locale.b());
    c(locale.l());
    b(locale.f());
    d(locale.g());
    e(locale.i());
    a(locale.n());
    a(locale.m());
    f(locale.h());
    this.c.setEnabled(false);
  }

  public String e()
  {
    return (String)this.c.getSelectedItem();
  }

  public String f()
  {
    return this.d.getText();
  }

  public String g()
  {
    return this.e.getText();
  }

  public int h()
  {
    try
    {
      return Integer.parseInt(this.f.getText());
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0;
  }

  public String i()
  {
    return this.h.a();
  }

  public String j()
  {
    return this.g.getText();
  }

  public String k()
  {
    return new String(this.i.getPassword());
  }

  public boolean l()
  {
    return this.n.isSelected();
  }

  public boolean m()
  {
    return this.j.isSelected();
  }

  public boolean n()
  {
    return this.k.isSelected();
  }

  public boolean o()
  {
    return this.l.isSelected();
  }

  public boolean p()
  {
    return this.o.isSelected();
  }

  public void a(boolean paramBoolean)
  {
    this.o.setSelected(paramBoolean);
    this.x.setEnabled(paramBoolean);
  }

  public void a(int paramInt)
  {
    this.x.setValue(new Integer(paramInt));
  }

  public int q()
  {
    return ((Integer)this.x.getValue()).intValue();
  }

  public void a(String paramString)
  {
    this.c.setSelectedItem(paramString);
  }

  public void b(String paramString)
  {
    this.d.setText(paramString);
  }

  public void c(String paramString)
  {
    this.e.setText(paramString);
  }

  public void b(int paramInt)
  {
    this.f.setText(String.valueOf(paramInt));
  }

  public void d(String paramString)
  {
    this.h.a(paramString);
  }

  public void e(String paramString)
  {
    this.g.setText(paramString);
  }

  public void f(String paramString)
  {
    this.i.setText(paramString);
  }

  public void b(boolean paramBoolean)
  {
    this.j.setSelected(paramBoolean);
  }

  public void c(boolean paramBoolean)
  {
    this.n.setSelected(paramBoolean);
    if (paramBoolean)
    {
      this.m.setEnabled(true);
    }
    else
    {
      this.m.setSelected(false);
      this.m.setEnabled(false);
    }
  }

  public void d(boolean paramBoolean)
  {
    this.k.setSelected(paramBoolean);
  }

  public void e(boolean paramBoolean)
  {
    this.l.setSelected(paramBoolean);
  }

  public boolean r()
  {
    return this.m.isSelected();
  }

  public void f(boolean paramBoolean)
  {
    this.m.setSelected(paramBoolean);
  }

  private boolean s()
  {
    boolean bool1 = w().a(false);
    e locale1 = w().l();
    e locale2 = t();
    boolean bool2 = a(locale1, locale2);
    String str1 = w().a();
    String str2 = f();
    if (!str1.equalsIgnoreCase(str2))
    {
      if (this.z.a(str2))
      {
        com.zend.ide.cb.c.w.a(null, ct.a(1515), c.b().h());
        return false;
      }
      w().a(str2);
    }
    if (bool1)
    {
      q localq = null;
      try
      {
        localq = a(locale2);
        localq.a();
        localq.b();
      }
      catch (Exception localException)
      {
        if (!a(localq, localException, false))
          return false;
        locale2 = localq.l();
      }
    }
    w().a(locale2);
    if (bool1)
    {
      if (bool2)
        try
        {
          w().b();
          w().a();
          return true;
        }
        catch (com.zend.ide.cb.d locald1)
        {
          a(w(), locald1, false);
          try
          {
            w().b();
            w().a();
          }
          catch (com.zend.ide.cb.d locald2)
          {
            return true;
          }
          w().a(str1);
          w().a(locale1);
          b(w());
          try
          {
            w().b();
            w().a();
          }
          catch (com.zend.ide.cb.d locald3)
          {
          }
          return false;
        }
      w().a(false);
      w().a(true);
    }
    return true;
  }

  private e t()
  {
    e locale = new e();
    locale.e(l());
    locale.f(f());
    locale.e(e());
    locale.d(o());
    locale.f(p());
    locale.b(q());
    locale.c(r());
    locale.d(i());
    locale.c(g());
    locale.b(k());
    locale.a(h());
    locale.a(m());
    locale.a(j());
    locale.b(n());
    return locale;
  }

  private static boolean a(e parame1, e parame2)
  {
    return (!parame1.d().equals(parame2.d())) || (!parame1.c().equals(parame2.c())) || (!parame1.b().equals(parame2.b())) || (!parame1.a().equals(parame2.a())) || (parame1.e() != parame2.e()) || (parame1.f() != parame2.f()) || (parame1.g() != parame2.g());
  }

  private boolean u()
  {
    q localq = null;
    try
    {
      localq = a(t());
      if (this.z.a(localq.a()))
      {
        com.zend.ide.cb.c.w.a(null, ct.a(1515), c.b().h());
        return false;
      }
      localq.a();
      this.z.a(localq);
    }
    catch (Exception localException1)
    {
      if (!a(localq, localException1, false))
        return false;
      try
      {
        localq.a();
        this.z.a(localq);
      }
      catch (Exception localException2)
      {
        a(localq, localException1, true);
        return false;
      }
    }
    return true;
  }

  private q a(e parame)
  {
    r localr = t.a().a(e());
    q localq = localr.a(parame);
    return localq;
  }

  private void v()
  {
    if (!this.C)
    {
      h(false);
      mb.a(ct.a(1516), c.b().h(), ct.a(1517), 1);
    }
  }

  public q w()
  {
    return this.y;
  }

  public void c(q paramq)
  {
    this.y = paramq;
  }

  private void e()
  {
    if (b)
    {
      g(false);
      return;
    }
    if (!a(this.d))
    {
      g(false);
      return;
    }
    if ("SQLite".equals(this.A))
    {
      g(a(jd.a(this.h)));
      return;
    }
    if ("MySQL".equals(this.A))
    {
      g((a(this.f)) && (a(this.e)));
      return;
    }
    g((a(this.f)) && (a(jd.a(this.h))) && (a(this.e)));
  }

  private boolean a(JTextComponent paramJTextComponent)
  {
    return paramJTextComponent.getText().length() > 0;
  }

  private synchronized void g(boolean paramBoolean)
  {
    this.v.setEnabled(paramBoolean);
    this.u.setEnabled(paramBoolean);
  }

  private boolean a(q paramq, boolean paramBoolean)
  {
    cd localcd = new cd(c.b().h(), paramq);
    if (localcd.b() == 0)
      try
      {
        h(true);
        e locale = paramq.l();
        e(locale.a());
        f(locale.b());
        c(locale.l());
        paramq.a();
        paramq.b();
        if ((paramBoolean) && (!this.C))
          v();
        h(false);
        return true;
      }
      catch (com.zend.ide.cb.d locald)
      {
        return a(paramq, locald, paramBoolean);
      }
    return false;
  }

  private boolean a(q paramq, Throwable paramThrowable, boolean paramBoolean)
  {
    h(false);
    if (this.C)
      return false;
    if (paramq == null)
    {
      com.zend.ide.cb.c.w.a(null, paramThrowable.getMessage(), c.b().h());
      return false;
    }
    if ((paramThrowable.getCause() != null) && ((paramThrowable.getCause() instanceof SQLException)))
    {
      if (paramq.a((SQLException)paramThrowable.getCause()))
        return a(paramq, paramBoolean);
      com.zend.ide.cb.c.w.a(paramq, paramThrowable.getMessage(), c.b().h());
    }
    else
    {
      com.zend.ide.cb.c.w.a(paramq, paramThrowable.getMessage(), c.b().h());
    }
    return false;
  }

  private boolean a(r paramr)
  {
    if (paramr.h())
    {
      File localFile = new File(jd.a(this.h).getText());
      if (!localFile.exists())
      {
        String str = ct.a(1522, localFile.getName());
        return ba.a(this, str, this.A, 0, 3) == 0;
      }
    }
    return true;
  }

  private boolean a()
  {
    r localr = t.a().a(this.A);
    if (!a(localr))
      return false;
    q localq = null;
    try
    {
      localq = a(t());
      if ((w() != null) && (!localq.a().equalsIgnoreCase(w().a())) && (this.z.a(localq.a())))
      {
        com.zend.ide.cb.c.w.a(null, ct.a(1515), c.b().h());
        return false;
      }
      localq.a();
      localq.b();
      if (!this.C)
      {
        v();
        return true;
      }
    }
    catch (Throwable localThrowable)
    {
      if (!this.C)
        a(localq, localThrowable, true);
    }
    return false;
  }

  private void h(boolean paramBoolean)
  {
    if (paramBoolean != b)
    {
      b = paramBoolean;
      if (b)
      {
        g(false);
        this.B.a(ct.a(1523));
      }
      else
      {
        this.B.b(ct.a(1523));
        g(true);
      }
    }
  }

  private void a(JTextField paramJTextField)
  {
    paramJTextField.getDocument().addDocumentListener(new oe(this));
  }

  static x a(dd paramdd)
  {
    return paramdd.n;
  }

  static x b(dd paramdd)
  {
    return paramdd.m;
  }

  static x c(dd paramdd)
  {
    return paramdd.o;
  }

  static JSpinner d(dd paramdd)
  {
    return paramdd.x;
  }

  static void e(dd paramdd)
  {
    paramdd.c();
  }

  static String a(dd paramdd, String paramString)
  {
    return paramdd.A = paramString;
  }

  static JComboBox f(dd paramdd)
  {
    return paramdd.c;
  }

  static void g(dd paramdd)
  {
    paramdd.e();
  }

  static boolean b()
  {
    return b;
  }

  static void a(dd paramdd, boolean paramBoolean)
  {
    paramdd.h(paramBoolean);
  }

  static boolean h(dd paramdd)
  {
    return paramdd.a();
  }

  static String h(dd paramdd)
  {
    return paramdd.A;
  }

  static boolean a(dd paramdd, r paramr)
  {
    return paramdd.a(paramr);
  }

  static boolean i(dd paramdd)
  {
    return paramdd.u();
  }

  static boolean j(dd paramdd)
  {
    return paramdd.s();
  }

  static boolean b(dd paramdd, boolean paramBoolean)
  {
    return paramdd.C = paramBoolean;
  }

  static com.zend.ide.p.w k(dd paramdd)
  {
    return paramdd.v;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.dd
 * JD-Core Version:    0.6.0
 */