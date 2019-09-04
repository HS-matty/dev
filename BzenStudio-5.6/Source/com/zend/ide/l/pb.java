package com.zend.ide.l;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class pb extends AbstractAction
{
  final bx a;

  pb(bx parambx)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bx.b(this.a);
    bx.a(this.a, true);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.pb
 * JD-Core Version:    0.6.0
 */