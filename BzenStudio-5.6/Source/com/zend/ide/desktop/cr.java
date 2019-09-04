package com.zend.ide.desktop;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class cr extends AbstractAction
{
  final cj a;

  public cr(cj paramcj)
  {
    super("AboutAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.handleAbout();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cr
 * JD-Core Version:    0.6.0
 */