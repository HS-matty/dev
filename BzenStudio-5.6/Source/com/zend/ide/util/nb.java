package com.zend.ide.util;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class nb extends AbstractAction
{
  final pb a;

  public nb(pb parampb)
  {
    super(ct.a(61));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    pb.d(this.a);
    this.a.setVisible(false);
    pb.a(this.a, 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.nb
 * JD-Core Version:    0.6.0
 */