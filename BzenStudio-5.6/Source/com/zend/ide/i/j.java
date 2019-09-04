package com.zend.ide.i;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class j extends AbstractAction
{
  final p a;

  public j(p paramp)
  {
    super("CancelAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.setVisible(false);
    this.a.c = 0;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.j
 * JD-Core Version:    0.6.0
 */