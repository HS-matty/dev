package com.zend.ide.u;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class bw extends AbstractAction
{
  final ce a;

  public bw(ce paramce)
  {
    super("OKAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (ce.m(this.a))
    {
      ce.a(this.a, true);
      ce.n(this.a);
      this.a.dispose();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.bw
 * JD-Core Version:    0.6.0
 */