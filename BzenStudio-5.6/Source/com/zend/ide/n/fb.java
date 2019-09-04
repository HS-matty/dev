package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class fb extends AbstractAction
{
  final cb a;

  private fb(cb paramcb)
  {
    super("openBookmarksDialogAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    cb.a(this.a);
  }

  fb(cb paramcb, hc paramhc)
  {
    this(paramcb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fb
 * JD-Core Version:    0.6.0
 */