package com.zend.ide.util.f;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class l extends AbstractAction
{
  final p a;

  public l(p paramp)
  {
    super("CancelAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.e.b().setVisible(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.l
 * JD-Core Version:    0.6.0
 */