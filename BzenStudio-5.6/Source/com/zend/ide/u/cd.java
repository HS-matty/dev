package com.zend.ide.u;

import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class cd extends com.zend.ide.i.n
{
  private JPanel c;
  private JPanel d;
  private cc e;
  private z f;
  private w g;
  private JButton h;
  private bh i;

  public cd(JFrame paramJFrame)
  {
    super(paramJFrame, false);
    c();
  }

  public void a(bh parambh)
  {
    this.i = parambh;
  }

  public void a()
  {
    pack();
    setVisible(true);
  }

  private void c()
  {
    setTitle(ct.a(446));
    this.e = new cc(this);
    Dimension localDimension = new Dimension(64, 64);
    this.e.setMinimumSize(localDimension);
    this.e.setPreferredSize(localDimension);
    this.f = new z(ct.a(447));
    this.g = new w(ct.b(448));
    this.g.addActionListener(new n(this));
    this.c = new JPanel(new FlowLayout(0));
    this.d = new JPanel(new FlowLayout(2));
    this.c.add(this.e);
    this.c.add(this.f);
    this.d.add(this.g);
    this.h = new JButton(ct.a(117));
    this.h.addActionListener(new s(this));
    this.d.add(this.h);
    getContentPane().add(this.c, "Center");
    getContentPane().add(this.d, "South");
    pack();
    B();
  }

  static bh b(cd paramcd)
  {
    return paramcd.i;
  }

  static cc a(cd paramcd)
  {
    return paramcd.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.cd
 * JD-Core Version:    0.6.0
 */