package com.zend.ide.util;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class jc extends AbstractAction
{
  final en a;

  public jc(en paramen)
  {
    super("closeOthersAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.jc
 * JD-Core Version:    0.6.0
 */