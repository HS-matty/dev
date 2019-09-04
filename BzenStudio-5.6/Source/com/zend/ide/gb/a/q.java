package com.zend.ide.gb.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

class q
  implements ActionListener
{
  final nb a;

  q(nb paramnb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    nb.e(this.a).setEnabled(!nb.b(this.a).isSelected());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.q
 * JD-Core Version:    0.6.0
 */