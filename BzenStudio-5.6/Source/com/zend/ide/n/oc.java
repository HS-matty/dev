package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class oc extends AbstractAction
{
  final sc a;

  private oc(sc paramsc)
  {
    super("GoToAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    sc.a(this.a, true);
  }

  oc(sc paramsc, uc paramuc)
  {
    this(paramsc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.oc
 * JD-Core Version:    0.6.0
 */