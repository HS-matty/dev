package com.zend.ide.o.n;

import com.zend.ide.i.n;
import com.zend.ide.p.a.d;
import com.zend.ide.p.bj;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.ac;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class u extends n
  implements q, cu
{
  private static final String b = ct.b(1434).replaceAll("&", "");
  private x c;
  private JTextField d;
  private JTextField e;
  private JTextField f;
  private w g;
  private x h;
  private x i;
  private JTextField j;
  private JPasswordField k;
  private boolean l = false;
  private Object m = new Object();
  private bj n;
  private Color o = new Color(0, 150, 0);

  public u(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(1427), true);
    d();
  }

  private void d()
  {
    this.l = o.a().g();
    JPanel localJPanel = new JPanel(new BorderLayout(5, 5));
    localJPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel.add(e(), "Center");
    localJPanel.add(a(), "South");
    getContentPane().add(localJPanel);
    setResizable(false);
    i();
    pack();
    doLayout();
    B();
    o.a().a(this);
  }

  private JPanel e()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 5));
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(""), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    a locala = new a(this);
    z localz1 = new z();
    localz1.setText(ct.b(1428));
    z localz2 = new z();
    localz2.setText(ct.b(1429));
    z localz3 = new z();
    localz3.setText(ct.b(1431));
    this.d = new JTextField(13);
    this.e = new JTextField(6);
    this.f = new JTextField(10);
    this.d.addKeyListener(locala);
    this.e.addKeyListener(locala);
    this.f.addKeyListener(locala);
    this.e.setDocument(new d(5));
    localz2.setLabelFor(this.e);
    localz1.setLabelFor(this.d);
    localz3.setLabelFor(this.f);
    this.h = new x();
    this.h.setText(ct.b(1432));
    this.h.setFocusable(false);
    this.h.addActionListener(new i(this));
    this.i = new x(ct.a(1548));
    this.i.addActionListener(new j(this));
    z localz4 = new z();
    localz4.setText(ct.b(190));
    z localz5 = new z();
    localz5.setText(ct.b(191));
    this.j = new JTextField(10);
    this.k = new JPasswordField(10);
    this.j.addKeyListener(locala);
    this.k.addKeyListener(locala);
    localz4.setLabelFor(this.j);
    localz5.setLabelFor(this.k);
    JPanel localJPanel2 = new JPanel(new BorderLayout(10, 5));
    Box localBox1 = new Box(1);
    localBox1.add(Box.createVerticalStrut(5));
    localBox1.add(localz1);
    localBox1.add(Box.createVerticalStrut(15));
    localBox1.add(localz2);
    localBox1.add(Box.createVerticalStrut(12));
    localBox1.add(this.h);
    localJPanel2.add(localBox1, "West");
    Box localBox2 = new Box(1);
    localBox2.add(this.d);
    localBox2.add(Box.createVerticalStrut(10));
    localBox2.add(this.e);
    localBox2.add(Box.createVerticalStrut(10));
    localBox2.add(this.f);
    localJPanel2.add(localBox2, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout(13, 5));
    localJPanel3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.a(1549)), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    Box localBox3 = new Box(1);
    localBox3.add(Box.createVerticalStrut(13));
    localBox3.add(localz4);
    localBox3.add(Box.createVerticalStrut(15));
    localBox3.add(localz5);
    localJPanel3.add(localBox3, "West");
    Box localBox4 = new Box(1);
    localBox4.add(Box.createVerticalStrut(10));
    localBox4.add(this.j);
    localBox4.add(Box.createVerticalStrut(11));
    localBox4.add(this.k);
    localJPanel3.add(localBox4, "Center");
    localJPanel3.add(this.i, "North");
    this.c = new x();
    this.c.setFocusable(false);
    this.c.setText(ct.b(1430));
    this.c.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 0));
    this.d.requestFocus();
    this.k.setPreferredSize(this.j.getPreferredSize());
    JPanel localJPanel4 = new JPanel(new BorderLayout(5, 8));
    localJPanel4.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.a(1547)), BorderFactory.createEmptyBorder(3, 3, 3, 3)));
    localJPanel4.add(localJPanel2, "North");
    localJPanel4.add(this.c, "Center");
    localJPanel1.add(localJPanel4, "North");
    localJPanel1.add(localJPanel3, "Center");
    localJPanel1.add(g(), "South");
    a(this.d);
    return localJPanel1;
  }

  private void f()
  {
    boolean bool = this.i.isSelected();
    this.j.setEditable(bool);
    this.j.setEnabled(bool);
    this.k.setEditable(bool);
    this.k.setEnabled(bool);
  }

  private void a(boolean paramBoolean)
  {
    this.f.setEditable(paramBoolean);
    this.f.setEnabled(paramBoolean);
  }

  private JPanel g()
  {
    this.n = new bj();
    this.n.a(ct.a(1441), null, Color.red);
    this.n.setHorizontalAlignment(0);
    JPanel localJPanel = new JPanel(new BorderLayout(5, 5));
    localJPanel.setBorder(BorderFactory.createEmptyBorder(10, 5, 0, 5));
    this.g = new w();
    this.g.addActionListener(new m(this));
    localJPanel.add(this.n, "North");
    localJPanel.add(this.g, "Center");
    return localJPanel;
  }

  private JPanel a()
  {
    JPanel localJPanel = new JPanel(new FlowLayout(2));
    w localw = new w(ct.a(329));
    localw.addActionListener(new l(this));
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new k(this));
    localJPanel.add(localw);
    localJPanel.add(localJButton);
    return localJPanel;
  }

  public boolean d()
  {
    j();
    return super.d();
  }

  private void i()
  {
    String str1 = (String)b.a("debugging.tunnelHost");
    int i1 = ((Integer)b.a("debugging.tunnelPort")).intValue();
    String str2 = (String)b.a("debugging.tunnelReturnHost");
    boolean bool1 = ((Boolean)b.a("debugging.autoConnectTunnel")).booleanValue();
    boolean bool2 = ((Boolean)b.a("debugging.tunnelUseAuthentication")).booleanValue();
    String str3 = (String)b.a("debugging.tunnelAuthUsername");
    String str4 = (String)b.a("debugging.tunnelAuthPassword");
    try
    {
      str4 = ac.b(str4);
    }
    catch (Exception localException1)
    {
      cl.a(localException1);
    }
    if ((str1 == null) || (str1.equals("")))
    {
      String str5 = b.a("debugging.serverHost").toString();
      if (!str5.equals("http://Server_Address/"))
        try
        {
          URL localURL = new URL(str5);
          str1 = localURL.getHost();
        }
        catch (Exception localException2)
        {
        }
    }
    this.d.setText(str1);
    this.e.setText("" + i1);
    this.f.setText(str2);
    boolean bool3 = (str2 != null) && (!str2.equals(""));
    this.h.setSelected(bool3);
    this.c.setSelected(bool1);
    this.i.setSelected(bool2);
    if (bool2)
    {
      this.j.setText(str3);
      this.k.setText(str4);
    }
    a(bool3);
    f();
    k();
  }

  private void j()
  {
    String str1 = this.h.isSelected() ? this.f.getText() : "";
    String str2 = this.e.getText().equals("") ? "80" : this.e.getText();
    String str3 = "";
    try
    {
      str3 = ac.a(this.k.getPassword());
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    b.a("debugging.tunnelHost", new String(this.d.getText()));
    b.a("debugging.tunnelPort", new Integer(str2));
    b.a("debugging.tunnelReturnHost", str1);
    b.a("debugging.autoConnectTunnel", new Boolean(this.c.isSelected()));
    b.a("debugging.tunnelUseAuthentication", new Boolean(this.i.isSelected()));
    b.a("debugging.tunnelAuthUsername", new String(this.j.getText()));
    b.a("debugging.tunnelAuthPassword", new String(str3));
  }

  private void k()
  {
    this.n.o();
    if (this.l)
    {
      this.g.setText(ct.b(1433));
      this.n.a(ct.a(1442), null, this.o);
      l();
    }
    else
    {
      this.g.setText(ct.b(1434));
      this.n.a(ct.a(1441), null, Color.red);
      l();
    }
  }

  public void a()
  {
    this.l = false;
    k();
  }

  public void c()
  {
    this.l = true;
    k();
  }

  private void a(JTextField paramJTextField)
  {
    paramJTextField.getDocument().addDocumentListener(new v(this));
  }

  private void l()
  {
    if ((this.d.getText().trim().equals("")) && (this.g.getText().equals(b)))
      this.g.setEnabled(false);
    else if (!this.g.isEnabled())
      this.g.setEnabled(true);
  }

  static x a(u paramu)
  {
    return paramu.h;
  }

  static void a(u paramu, boolean paramBoolean)
  {
    paramu.a(paramBoolean);
  }

  static void b(u paramu)
  {
    paramu.f();
  }

  static Object c(u paramu)
  {
    return paramu.m;
  }

  static void d(u paramu)
  {
    paramu.j();
  }

  static boolean e(u paramu)
  {
    return paramu.l;
  }

  static w f(u paramu)
  {
    return paramu.g;
  }

  static void g(u paramu)
  {
    paramu.l();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.u
 * JD-Core Version:    0.6.0
 */