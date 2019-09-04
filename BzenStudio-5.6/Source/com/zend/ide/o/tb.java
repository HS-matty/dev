package com.zend.ide.o;

import com.zend.ide.i.l;
import com.zend.ide.i.n;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class tb extends n
  implements cu
{
  private x b;

  public tb(JFrame paramJFrame)
  {
    super(paramJFrame);
    getContentPane().setLayout(new BorderLayout());
    a();
  }

  private void a()
  {
    b();
    setModal(true);
    setTitle(ct.a(1674));
    JTextArea localJTextArea = new JTextArea(ct.a(1147));
    localJTextArea.setEditable(false);
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJTextArea.setBorder(BorderFactory.createEmptyBorder(10, 8, 10, 8));
    localJPanel1.add(localJTextArea, "Center");
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    this.b = new x(ct.a(5), false);
    this.b.setFocusPainted(false);
    localJTextArea.setBackground(localJPanel2.getBackground());
    localJTextArea.setFont(this.b.getFont());
    w localw = new w();
    localw.setText(ct.b(329));
    localw.addActionListener(new l(this));
    localJPanel2.add(this.b, "West");
    localJPanel2.add(localw, "East");
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.add(localJPanel1, "Center");
    localJPanel3.add(localJPanel2, "South");
    getContentPane().add(localJPanel3, "Center");
    pack();
    B();
  }

  public boolean d()
  {
    c();
    return super.d();
  }

  private void c()
  {
    b.a("application.showDebugConflictDialog").a(new Boolean(!this.b.isSelected()));
  }

  public void setVisible(boolean paramBoolean)
  {
    this.b.setSelected(!((Boolean)b.a("application.showDebugConflictDialog").c()).booleanValue());
    super.setVisible(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.tb
 * JD-Core Version:    0.6.0
 */