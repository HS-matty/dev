package com.zend.ide.hb;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;

class rc extends AbstractAction
{
  final fc a;

  rc(fc paramfc)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (fc.d(this.a) == null)
      fc.a(this.a, new wc(this.a));
    fc.d(this.a).setVisible(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.rc
 * JD-Core Version:    0.6.0
 */