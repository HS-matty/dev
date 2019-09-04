package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ep extends AbstractAction
{
  final fk a;

  public ep(fk paramfk)
  {
    super("AddWatchAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.G();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ep
 * JD-Core Version:    0.6.0
 */