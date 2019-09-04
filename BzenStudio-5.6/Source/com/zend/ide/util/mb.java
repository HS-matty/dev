package com.zend.ide.util;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class mb extends AbstractAction
{
  final pb a;

  public mb(pb parampb)
  {
    super(ct.a(117));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.setVisible(false);
    pb.a(this.a, 0);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.mb
 * JD-Core Version:    0.6.0
 */