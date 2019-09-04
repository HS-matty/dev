package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class vb
  implements ActionListener
{
  final rd a;

  vb(rd paramrd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    rd.b(this.a).setEnabled(rd.a(this.a).isSelected());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.vb
 * JD-Core Version:    0.6.0
 */