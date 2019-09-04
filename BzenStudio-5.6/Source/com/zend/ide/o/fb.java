package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class fb extends AbstractAction
{
  final fk a;

  public fb(fk paramfk)
  {
    super("StopDebugAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.d())
      fk.e(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fb
 * JD-Core Version:    0.6.0
 */