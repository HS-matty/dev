package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class qc extends AbstractAction
{
  final sc a;

  private qc(sc paramsc)
  {
    super("RemoveFromTableAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    sc.f(this.a);
  }

  qc(sc paramsc, uc paramuc)
  {
    this(paramsc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.qc
 * JD-Core Version:    0.6.0
 */