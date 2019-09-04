package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

class wb
  implements ActionListener
{
  final rd a;

  wb(rd paramrd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    rd.d(this.a).setEnabled(rd.c(this.a).isSelected());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.wb
 * JD-Core Version:    0.6.0
 */