package com.zend.ide.l;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class bt extends AbstractAction
{
  final g a;

  public bt(g paramg)
  {
    super("SaveProjectAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.e())
      this.a.n();
    else
      this.a.b(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bt
 * JD-Core Version:    0.6.0
 */