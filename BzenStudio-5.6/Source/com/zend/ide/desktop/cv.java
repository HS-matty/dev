package com.zend.ide.desktop;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class cv extends AbstractAction
{
  final cj a;

  public cv(cj paramcj)
  {
    super("ExitApplicationAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.c(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.cv
 * JD-Core Version:    0.6.0
 */