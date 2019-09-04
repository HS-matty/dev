package com.zend.ide.i;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.mc;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class x extends n
  implements cu
{
  private com.zend.ide.p.x c;

  public x(JFrame paramJFrame)
  {
    super(paramJFrame);
    getContentPane().setLayout(new BorderLayout());
    c();
  }

  private void c()
  {
    setModal(true);
    setTitle(ct.a(991));
    JLabel localJLabel = new JLabel(ct.a(992));
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJLabel.setBorder(BorderFactory.createEmptyBorder(10, 8, 10, 100));
    localJPanel1.add(localJLabel, "Center");
    JPanel localJPanel2 = new JPanel(new FlowLayout(0));
    this.c = new com.zend.ide.p.x(ct.a(5), false);
    this.c.setFocusPainted(false);
    localJPanel2.add(this.c);
    JPanel localJPanel3 = new JPanel(new FlowLayout(2));
    com.zend.ide.p.w localw1 = new com.zend.ide.p.w();
    localw1.setText(ct.b(994));
    v localv = new v(this);
    localw1.addActionListener(localv);
    com.zend.ide.p.w localw2 = new com.zend.ide.p.w();
    localw2.setText(ct.b(995));
    w localw = new w(this);
    localw2.addActionListener(localw);
    localJPanel3.add(mc.b());
    localJPanel3.add(localw1);
    localJPanel3.add(localw2);
    JPanel localJPanel4 = new JPanel(new BorderLayout());
    JPanel localJPanel5 = new JPanel(new BorderLayout());
    localJPanel4.add(localJPanel2, "Center");
    localJPanel4.add(localJPanel3, "South");
    localJPanel5.add(localJPanel1, "Center");
    localJPanel5.add(localJPanel4, "South");
    getContentPane().add(localJPanel5, "Center");
    pack();
    B();
  }

  public boolean d()
  {
    e();
    return super.d();
  }

  private void e()
  {
    b.a("application.showUpdateDialog").a(new Boolean(!this.c.isSelected()));
  }

  public void f()
  {
    this.c.setSelected(!((Boolean)b.a("application.showUpdateDialog").c()).booleanValue());
    super.setVisible(true);
  }

  static void a(x paramx)
  {
    paramx.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.x
 * JD-Core Version:    0.6.0
 */