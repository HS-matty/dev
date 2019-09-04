package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;

class nc extends AbstractAction
{
  final sc a;

  private nc(sc paramsc)
  {
    super("CloseDialogAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.f();
    sc.a(this.a).c().setVisible(false);
  }

  nc(sc paramsc, uc paramuc)
  {
    this(paramsc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.nc
 * JD-Core Version:    0.6.0
 */