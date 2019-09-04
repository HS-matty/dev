package com.zend.ide.cb.a;

import com.zend.ide.n.gz;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class ed extends JDialog
{
  private int a = 0;

  public ed(gz paramgz)
  {
    a(paramgz);
  }

  private void a(gz paramgz)
  {
    getContentPane().setLayout(new BorderLayout());
    setSize(400, 400);
    setTitle(ct.a(635));
    getContentPane().add(new JScrollPane(paramgz));
    JPanel localJPanel = new JPanel(new FlowLayout(2));
    JButton localJButton1 = new JButton(new qb(this));
    JButton localJButton2 = new JButton(new pb(this));
    localJButton1.setPreferredSize(localJButton2.getPreferredSize());
    localJPanel.add(localJButton1);
    localJPanel.add(localJButton2);
    getContentPane().add(localJPanel, "South");
    setLocationRelativeTo(null);
    setModal(true);
    setVisible(true);
  }

  public int a()
  {
    return this.a;
  }

  static int a(ed paramed, int paramInt)
  {
    return paramed.a = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ed
 * JD-Core Version:    0.6.0
 */