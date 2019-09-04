package com.zend.ide.hb;

import com.zend.ide.b.d;
import com.zend.ide.b.m;
import com.zend.ide.bd.c;
import com.zend.ide.i.n;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Document;

class rb extends n
{
  private com.zend.ide.p.bc b;
  private JTextField c;
  private dc h;
  private boolean d = true;
  private boolean e = true;
  private boolean f = true;
  final r g;

  public rb(r paramr)
  {
    super(c.b().h(), ct.a(1704));
    a();
  }

  private void a()
  {
    setLayout(new BorderLayout());
    c();
    e();
    f();
    pack();
    setSize(350, 400);
    B();
    setModal(true);
    this.h = new dc(this);
  }

  private void c()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    z localz = new z(ct.b(1705));
    localz.setBorder(BorderFactory.createEmptyBorder(0, 0, 3, 0));
    this.c = new JTextField();
    this.c.getDocument().addDocumentListener(new s(this));
    this.c.addKeyListener(new a(this));
    this.c.addActionListener(new t(this));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localz, "North");
    localJPanel2.add(this.c, "Center");
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 2, 5, 2));
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(d(), "South");
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    add(localJPanel1, "North");
  }

  private JPanel d()
  {
    JPanel localJPanel = new JPanel(new FlowLayout(0));
    com.zend.ide.p.x localx1 = new com.zend.ide.p.x(ct.b(1755));
    localx1.addActionListener(new u(this, localx1));
    com.zend.ide.p.x localx2 = new com.zend.ide.p.x(ct.b(1706));
    localx2.addActionListener(new v(this, localx2));
    com.zend.ide.p.x localx3 = new com.zend.ide.p.x(ct.b(1707));
    localx3.addActionListener(new tb(this, localx3));
    localx1.setSelected(true);
    localx2.setSelected(true);
    localx3.setSelected(true);
    localJPanel.add(localx1);
    localJPanel.add(localx2);
    localJPanel.add(localx3);
    localJPanel.setBorder(BorderFactory.createTitledBorder(ct.a(1708)));
    return localJPanel;
  }

  private void e()
  {
    this.b = new w(this);
    this.b.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 3, 3, 3), this.b.getBorder()));
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(this.b, "Center");
    localJPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5), BorderFactory.createTitledBorder(ct.a(1709))));
    add(localJPanel, "Center");
  }

  private void f()
  {
    JPanel localJPanel = new JPanel(new FlowLayout(2));
    com.zend.ide.p.w localw1 = new com.zend.ide.p.w(ct.a(116));
    localw1.addActionListener(new x(this));
    localJPanel.add(localw1);
    com.zend.ide.p.w localw2 = new com.zend.ide.p.w(ct.a(117));
    localw2.addActionListener(new cc(this));
    localJPanel.add(localw2);
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new bc(this));
    localJPanel.add(localJButton);
    add(localJPanel, "South");
  }

  private void g()
  {
    this.b.f();
    this.c.setText("");
  }

  private void d()
  {
    setVisible(false);
    Object localObject = this.b.d().getSelectedValue();
    if (localObject != null)
      this.g.a(((d)localObject).f().c(), ((d)localObject).f().d());
    g();
  }

  private void a(String paramString)
  {
    this.h.a(150, paramString);
  }

  public void setVisible(boolean paramBoolean)
  {
    this.c.grabFocus();
    super.setVisible(paramBoolean);
  }

  static JTextField a(rb paramrb)
  {
    return paramrb.c;
  }

  static void a(rb paramrb, String paramString)
  {
    paramrb.a(paramString);
  }

  static com.zend.ide.p.bc b(rb paramrb)
  {
    return paramrb.b;
  }

  static void a(rb paramrb)
  {
    paramrb.d();
  }

  static boolean b(rb paramrb, boolean paramBoolean)
  {
    return paramrb.d = paramBoolean;
  }

  static boolean c(rb paramrb, boolean paramBoolean)
  {
    return paramrb.e = paramBoolean;
  }

  static boolean a(rb paramrb, boolean paramBoolean)
  {
    return paramrb.f = paramBoolean;
  }

  static void b(rb paramrb)
  {
    paramrb.g();
  }

  static boolean c(rb paramrb)
  {
    return paramrb.d;
  }

  static boolean d(rb paramrb)
  {
    return paramrb.e;
  }

  static boolean e(rb paramrb)
  {
    return paramrb.f;
  }

  static dc f(rb paramrb)
  {
    return paramrb.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.rb
 * JD-Core Version:    0.6.0
 */