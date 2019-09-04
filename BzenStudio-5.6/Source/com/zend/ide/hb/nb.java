package com.zend.ide.hb;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;

class nb extends AbstractAction
{
  final r a;

  nb(r paramr)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (r.b(this.a) == null)
      r.a(this.a, new rb(this.a));
    r.b(this.a).setVisible(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.nb
 * JD-Core Version:    0.6.0
 */