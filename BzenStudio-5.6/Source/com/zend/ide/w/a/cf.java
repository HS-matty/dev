package com.zend.ide.w.a;

import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.w.ab;
import com.zend.ide.w.q;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class cf extends ab
{
  private z g;
  private JPasswordField h;
  private JPanel i;
  private JPanel j;
  private JPanel k;
  private JPanel l;
  private w m;
  private w n;
  private Action o = new ce(this);
  private String p = "";
  private String q = "";

  public cf(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(732));
    g();
  }

  private void g()
  {
    h();
    i();
    getContentPane().add(this.k, "Center");
    getContentPane().add(this.l, "South");
    setModal(true);
    setResizable(false);
  }

  private void h()
  {
    this.g = new z();
    this.h = new JPasswordField();
    this.g.setLabelFor(this.h);
    this.h.setAction(this.o);
    this.i = new JPanel(new GridLayout(2, 1));
    this.i.add(this.g);
    this.i.add(this.h);
    this.k = new JPanel(new BorderLayout());
    this.k.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.k.add(this.i, "Center");
  }

  private void i()
  {
    this.l = new JPanel(new BorderLayout());
    this.j = new JPanel(new FlowLayout(2));
    this.m = new w(ct.a(116));
    this.m.setAction(this.o);
    this.n = new w(ct.a(117));
    this.n.addActionListener(new bj(this));
    this.j.add(this.m);
    this.j.add(this.n);
    this.l.add(this.j, "East");
  }

  public void a(String paramString)
  {
    this.p = paramString;
  }

  String j()
  {
    return this.q;
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.g.setText(ct.a(1710, this.p));
      pack();
      B();
    }
    super.setVisible(paramBoolean);
  }

  protected void e()
  {
    char[] arrayOfChar = this.h.getPassword();
    if ((arrayOfChar == null) || (arrayOfChar.length == 0))
      return;
    this.q = new String(arrayOfChar);
    this.h.setText("");
    a(1);
    dispose();
  }

  public q b()
  {
    return null;
  }

  public void a(q paramq)
  {
  }

  public void a(boolean paramBoolean)
  {
  }

  static void a(cf paramcf, int paramInt)
  {
    paramcf.a(paramInt);
  }

  static JPasswordField a(cf paramcf)
  {
    return paramcf.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.cf
 * JD-Core Version:    0.6.0
 */