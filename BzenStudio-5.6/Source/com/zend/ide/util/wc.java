package com.zend.ide.util;

import com.zend.ide.bd.c;
import com.zend.ide.i.n;
import com.zend.ide.p.a.d;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.Document;

class wc extends n
{
  private z b;
  private z c;
  private JTextField d;
  private JTextField e;
  private z f;
  private z g;
  private JTextField h;
  private JPasswordField i;
  private x j;
  private x k;
  final mc l;

  public wc(mc parammc)
  {
    super(c.b().h(), ct.a(1759));
    a();
  }

  private void a()
  {
    this.j = new x(ct.a(1760));
    this.j.addActionListener(new oc(this));
    this.j.setBorder(BorderFactory.createEmptyBorder(2, 0, 5, 5));
    this.b = new z(ct.a(1761));
    this.c = new z(ct.a(1762));
    this.d = new JTextField();
    this.e = new JTextField(new d(), "", this.d.getColumns());
    this.f = new z(ct.a(1763));
    this.g = new z(ct.a(1764));
    this.h = new JTextField();
    this.i = new JPasswordField();
    this.k = new x(ct.a(1765));
    this.k.setBorder(BorderFactory.createEmptyBorder(2, 0, 5, 5));
    this.k.addActionListener(new pc(this));
    Box localBox1 = new Box(1);
    localBox1.add(this.b);
    localBox1.add(Box.createVerticalStrut(15));
    localBox1.add(this.c);
    Box localBox2 = new Box(1);
    localBox2.add(this.d);
    localBox2.add(Box.createVerticalStrut(5));
    localBox2.add(this.e);
    Box localBox3 = new Box(0);
    localBox3.add(localBox1);
    localBox3.add(Box.createHorizontalStrut(5));
    localBox3.add(localBox2);
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.add(localBox3, "North");
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(this.j, "North");
    localJPanel2.add(localBox3, "Center");
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    Box localBox4 = new Box(1);
    localBox4.add(this.f);
    localBox4.add(Box.createVerticalStrut(15));
    localBox4.add(this.g);
    localBox4.setPreferredSize(localBox1.getPreferredSize());
    localBox4.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));
    Box localBox5 = new Box(1);
    localBox5.add(this.h);
    localBox5.add(Box.createVerticalStrut(5));
    localBox5.add(this.i);
    Box localBox6 = new Box(0);
    localBox6.add(localBox4);
    localBox6.add(Box.createHorizontalStrut(5));
    localBox6.add(localBox5);
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.add(localBox6, "North");
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    localJPanel4.add(this.k, "North");
    localJPanel4.add(localBox6, "Center");
    localJPanel4.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
    Box localBox7 = new Box(1);
    localBox7.add(localJPanel2);
    localBox7.add(localJPanel4);
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    localJPanel5.add(localBox7, "Center");
    localJPanel5.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    w localw1 = new w(ct.a(116));
    localw1.addActionListener(new qc(this));
    w localw2 = new w(ct.a(117));
    localw2.addActionListener(new rc(this));
    JPanel localJPanel6 = new JPanel(new FlowLayout(2));
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new sc(this));
    localJPanel6.add(localw1);
    localJPanel6.add(localw2);
    localJPanel6.add(localJButton);
    JPanel localJPanel7 = new JPanel(new BorderLayout());
    localJPanel7.add(localJPanel5, "Center");
    localJPanel7.add(localJPanel6, "South");
    add(localJPanel7, "Center");
    this.d.getDocument().addDocumentListener(new tc(this, localw1));
    this.e.getDocument().addDocumentListener(new uc(this, localw1));
    localw1.setEnabled((this.d.getText().length() > 0) && (this.e.getText().length() > 0));
    pack();
    setSize(330, 240);
    setResizable(false);
    setLocationRelativeTo(getParent());
    setModal(true);
    a(this.j.isSelected());
  }

  private void a(boolean paramBoolean)
  {
    this.b.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
    this.d.setEnabled(paramBoolean);
    this.e.setEnabled(paramBoolean);
    this.k.setEnabled(paramBoolean);
    b(paramBoolean ? this.k.isSelected() : false);
  }

  private void b(boolean paramBoolean)
  {
    this.f.setEnabled(paramBoolean);
    this.g.setEnabled(paramBoolean);
    this.h.setEnabled(paramBoolean);
    this.i.setEnabled(paramBoolean);
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.j.setSelected(mc.f());
      this.d.setText(mc.g());
      this.k.setSelected(mc.h());
      this.e.setText(mc.i().equals("-1") ? "" : mc.i());
      this.h.setText(mc.j());
      this.i.setText(mc.k().length() > 0 ? mc.k() : "");
      a(mc.f());
    }
    super.setVisible(paramBoolean);
  }

  static x a(wc paramwc)
  {
    return paramwc.j;
  }

  static void a(wc paramwc, boolean paramBoolean)
  {
    paramwc.a(paramBoolean);
  }

  static x b(wc paramwc)
  {
    return paramwc.k;
  }

  static void b(wc paramwc, boolean paramBoolean)
  {
    paramwc.b(paramBoolean);
  }

  static JTextField c(wc paramwc)
  {
    return paramwc.d;
  }

  static JTextField d(wc paramwc)
  {
    return paramwc.e;
  }

  static JTextField e(wc paramwc)
  {
    return paramwc.h;
  }

  static JPasswordField f(wc paramwc)
  {
    return paramwc.i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.wc
 * JD-Core Version:    0.6.0
 */