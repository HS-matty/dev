package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

class cl
  implements ActionListener
{
  final bs a;

  cl(bs parambs)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = bs.u(this.a).isSelected();
    bs.v(this.a).setEnabled(bool);
    bs.w(this.a).setEnabled(bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cl
 * JD-Core Version:    0.6.0
 */