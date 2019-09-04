package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ev extends AbstractAction
{
  final fk a;

  public ev(fk paramfk)
  {
    super("PauseAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.f(false);
    this.a.M();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ev
 * JD-Core Version:    0.6.0
 */