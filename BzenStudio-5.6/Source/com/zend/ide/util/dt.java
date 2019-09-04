package com.zend.ide.util;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class dt extends AbstractAction
{
  final en a;

  public dt(en paramen)
  {
    super("closeAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.a(this.a.getSelectedIndex(), true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dt
 * JD-Core Version:    0.6.0
 */