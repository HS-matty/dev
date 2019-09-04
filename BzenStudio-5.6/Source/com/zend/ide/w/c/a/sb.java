package com.zend.ide.w.c.a;

import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.c.f;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class sb extends ab
{
  private z e;
  private z f;
  private JPasswordField g;
  private JTextField h;
  private JPanel i;
  private JPanel j;
  private JPanel k;
  private JPanel l;
  private w m;
  private w n;
  private Action o = new rb(this);
  private String p = "";
  private String q = "";
  private f r;

  public sb(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(1792));
    a();
  }

  private void a()
  {
    c();
    d();
    getContentPane().add(this.k, "Center");
    getContentPane().add(this.l, "South");
    setModal(true);
    setResizable(false);
  }

  private void c()
  {
    this.e = new z(ct.b(191));
    this.g = new JPasswordField();
    this.e.setLabelFor(this.g);
    this.g.setAction(this.o);
    this.f = new z(ct.b(190));
    this.h = new JTextField();
    this.f.setLabelFor(this.h);
    this.h.setAction(this.o);
    this.i = new JPanel(new GridLayout(2, 2));
    this.i.add(this.f);
    this.i.add(this.h);
    this.i.add(this.e);
    this.i.add(this.g);
    this.k = new JPanel(new BorderLayout());
    this.k.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.k.add(this.i, "Center");
    Dimension localDimension = this.h.getPreferredSize();
    localDimension.width = Math.max(localDimension.width, 100);
    this.h.setPreferredSize(localDimension);
    this.g.setPreferredSize(localDimension);
  }

  private void d()
  {
    this.l = new JPanel(new BorderLayout());
    this.j = new JPanel(new FlowLayout(2));
    this.m = new w(ct.a(116));
    this.m.setAction(this.o);
    this.n = new w(ct.a(117));
    this.n.addActionListener(new qb(this));
    this.j.add(this.m);
    this.j.add(this.n);
    this.l.add(this.j, "East");
    d.b(new JButton[] { this.m, this.n });
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      pack();
      B();
      this.p = this.h.getText();
      char[] arrayOfChar = this.g.getPassword();
      if (arrayOfChar != null)
        this.q = new String(arrayOfChar);
      else
        this.q = "";
    }
    super.setVisible(paramBoolean);
  }

  protected void e()
  {
    char[] arrayOfChar = this.g.getPassword();
    if ((arrayOfChar == null) || (arrayOfChar.length == 0))
      return;
    if (this.h.getText().equals(""))
      return;
    this.r.h(new String(arrayOfChar));
    this.r.g(this.h.getText());
    a(1);
    dispose();
  }

  public q b()
  {
    return this.r;
  }

  public void a(q paramq)
  {
    this.r = ((f)paramq);
    String str1 = this.r.p();
    String str2 = this.r.q();
    if ((str2 != null) && (str1 != null))
    {
      this.h.setText(this.r.p());
      this.g.setText(this.r.q());
    }
  }

  public void a(boolean paramBoolean)
  {
  }

  static void a(sb paramsb, int paramInt)
  {
    paramsb.a(paramInt);
  }

  static String a(sb paramsb)
  {
    return paramsb.q;
  }

  static JPasswordField b(sb paramsb)
  {
    return paramsb.g;
  }

  static String c(sb paramsb)
  {
    return paramsb.p;
  }

  static JTextField d(sb paramsb)
  {
    return paramsb.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.sb
 * JD-Core Version:    0.6.0
 */