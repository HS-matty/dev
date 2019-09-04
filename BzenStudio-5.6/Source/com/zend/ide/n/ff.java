package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ff extends AbstractAction
{
  final cb a;

  private ff(cb paramcb)
  {
    super("toggleBookmarkAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    cb.c(this.a);
  }

  ff(cb paramcb, hc paramhc)
  {
    this(paramcb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ff
 * JD-Core Version:    0.6.0
 */