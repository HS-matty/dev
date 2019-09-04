package com.zend.ide.zendPlatformIntegration.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;

class u
  implements ActionListener
{
  final ib a;

  u(ib paramib)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (ib.g(this.a).isSelected())
      ib.h(this.a).setEnabled(true);
    else
      ib.h(this.a).setEnabled(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.u
 * JD-Core Version:    0.6.0
 */