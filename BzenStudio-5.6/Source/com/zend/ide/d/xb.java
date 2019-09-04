package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

class xb
  implements ActionListener
{
  final rd a;

  xb(rd paramrd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool = rd.e(this.a).isSelected();
    rd.f(this.a).setEnabled(bool);
    rd.g(this.a).setEnabled(bool);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.xb
 * JD-Core Version:    0.6.0
 */