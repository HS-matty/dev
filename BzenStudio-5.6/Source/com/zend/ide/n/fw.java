package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class fw extends AbstractAction
{
  final ch a;

  public fw(ch paramch)
  {
    super("close-Document");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b().a(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.fw
 * JD-Core Version:    0.6.0
 */