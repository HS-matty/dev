package com.zend.ide.desktop;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class df extends AbstractAction
{
  final cj a;

  public df(cj paramcj)
  {
    super("RebuildCodeCompletionDBAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (cj.g(this.a) != null)
      cj.g(this.a).b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.df
 * JD-Core Version:    0.6.0
 */