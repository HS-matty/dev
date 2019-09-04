package com.zend.ide.desktop;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class dl extends AbstractAction
{
  final cj a;

  public dl(cj paramcj)
  {
    super("ToggleMessagesComponentAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.e(!this.a.S());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dl
 * JD-Core Version:    0.6.0
 */