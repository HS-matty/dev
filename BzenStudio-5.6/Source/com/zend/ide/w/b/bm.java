package com.zend.ide.w.b;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class bm extends AbstractAction
{
  final bp a;

  private bm(bp parambp)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp.a(this.a).j();
    this.a.dispose();
  }

  bm(bp parambp, d paramd)
  {
    this(parambp);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bm
 * JD-Core Version:    0.6.0
 */