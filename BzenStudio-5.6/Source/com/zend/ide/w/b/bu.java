package com.zend.ide.w.b;

import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class bu extends JPanel
{
  private String a = ct.a(1243);
  private JLabel b;
  private bq c;
  private bq d;
  private bq e;
  final bs f;

  public bu(bs parambs)
  {
    c();
  }

  public void a(int paramInt)
  {
    String str = "    " + paramInt + this.a;
    if (paramInt == 1)
      str = str.substring(0, str.length() - 1);
    this.b.setText(str);
    validate();
  }

  public void b()
  {
    this.c.a(bs.g(this.f).d());
    this.d.a(bs.g(this.f).b());
    this.e.a(bs.g(this.f).c());
    repaint();
  }

  private void c()
  {
    setBorder(BorderFactory.createLineBorder(Color.gray));
    this.b = new JLabel(" ");
    setLayout(new BorderLayout());
    add(this.b, "North");
    JPanel localJPanel1 = new JPanel(new GridLayout(1, 3));
    JPanel localJPanel2 = new JPanel();
    Border localBorder = BorderFactory.createLineBorder(Color.darkGray);
    Dimension localDimension = new Dimension(20, 10);
    localJPanel2.add(new JLabel(ct.a(1244)));
    this.c = new bq(this.f, "", bs.g(this.f).d(), localBorder);
    this.c.setPreferredSize(localDimension);
    localJPanel2.add(this.c);
    localJPanel1.add(localJPanel2);
    localJPanel2 = new JPanel();
    localJPanel2.add(new JLabel(ct.a(1245)));
    this.d = new bq(this.f, "", bs.g(this.f).b(), localBorder);
    this.d.setPreferredSize(localDimension);
    localJPanel2.add(this.d);
    localJPanel1.add(localJPanel2);
    localJPanel2 = new JPanel();
    localJPanel2.add(new JLabel(ct.a(1246)));
    this.e = new bq(this.f, "", bs.g(this.f).c(), localBorder);
    this.e.setPreferredSize(localDimension);
    localJPanel2.add(this.e);
    localJPanel1.add(localJPanel2);
    add(localJPanel1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bu
 * JD-Core Version:    0.6.0
 */