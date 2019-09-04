package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.util.xc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class db
  implements ActionListener
{
  final ib a;

  db(ib paramib)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (ib.e(this.a).isSelected())
      ib.f(this.a).setEnabled(true);
    else
      ib.f(this.a).setEnabled(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.db
 * JD-Core Version:    0.6.0
 */