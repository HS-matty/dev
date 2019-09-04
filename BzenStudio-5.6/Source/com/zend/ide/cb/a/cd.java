package com.zend.ide.cb.a;

import com.zend.ide.cb.q;
import com.zend.ide.i.n;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class cd extends n
{
  private x c;
  private JTextField d;
  private JPasswordField e;
  private q f;
  private com.zend.ide.cb.e g;
  private int h;
  private w b;

  public cd(Frame paramFrame, q paramq)
  {
    super(paramFrame);
    this.f = paramq;
    this.g = paramq.l();
    this.h = 1;
    setDefaultCloseOperation(2);
    a();
    setLocationRelativeTo(null);
    setVisible(true);
  }

  private void a()
  {
    setTitle(this.f.a() + ' ' + ct.a(1484));
    this.c = new x(ct.a(196));
    this.c.setSelected(this.g.l());
    this.d = new JTextField(this.g.a());
    this.e = new JPasswordField(this.g.b());
    new e(this, this.d);
    new e(this, this.e);
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel(new GridLayout(2, 1));
    localJPanel2.add(new JLabel(ct.a(1483)));
    localJPanel2.add(new JLabel(ct.a(1485)));
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
    localJPanel1.add(localJPanel2, "North");
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    JPanel localJPanel4 = new JPanel(new GridLayout(2, 1, 1, 3));
    JPanel localJPanel5 = new JPanel(new GridLayout(2, 1, 1, 3));
    localJPanel4.add(new JLabel(ct.a(190) + ' '));
    localJPanel5.add(this.d);
    localJPanel4.add(new JLabel(ct.a(191) + ' '));
    localJPanel5.add(this.e);
    localJPanel3.add(localJPanel4, "West");
    localJPanel3.add(localJPanel5);
    localJPanel3.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    localJPanel1.add(localJPanel3);
    JPanel localJPanel6 = new JPanel(new BorderLayout());
    JPanel localJPanel7 = new JPanel(new FlowLayout(0));
    localJPanel7.add(this.c);
    JPanel localJPanel8 = new JPanel(new FlowLayout(2));
    this.b = new w(new zb(this));
    w localw = new w(new yb(this));
    localJPanel8.add(this.b);
    localJPanel8.add(localw);
    this.b.setPreferredSize(localw.getPreferredSize());
    localJPanel6.add(localJPanel7, "West");
    localJPanel6.add(localJPanel8, "East");
    localJPanel6.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    localJPanel1.add(localJPanel6, "South");
    getContentPane().add(localJPanel1);
    setModal(true);
    pack();
  }

  public int b()
  {
    return this.h;
  }

  static JTextField a(cd paramcd)
  {
    return paramcd.d;
  }

  static com.zend.ide.cb.e b(cd paramcd)
  {
    return paramcd.g;
  }

  static JPasswordField c(cd paramcd)
  {
    return paramcd.e;
  }

  static x d(cd paramcd)
  {
    return paramcd.c;
  }

  static q e(cd paramcd)
  {
    return paramcd.f;
  }

  static int a(cd paramcd, int paramInt)
  {
    return paramcd.h = paramInt;
  }

  static w a(cd paramcd)
  {
    return paramcd.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.cd
 * JD-Core Version:    0.6.0
 */