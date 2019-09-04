package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class rc extends AbstractAction
{
  final sc a;

  private rc(sc paramsc)
  {
    super("ViewSourceAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    sc.a(this.a, false);
  }

  rc(sc paramsc, uc paramuc)
  {
    this(paramsc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.rc
 * JD-Core Version:    0.6.0
 */