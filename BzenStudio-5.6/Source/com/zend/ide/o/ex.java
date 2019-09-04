package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ex extends AbstractAction
{
  final fk a;

  public ex(fk paramfk)
  {
    super("RunAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.n();
    this.a.O();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ex
 * JD-Core Version:    0.6.0
 */