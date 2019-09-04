package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class eq extends AbstractAction
{
  final fk a;

  public eq(fk paramfk)
  {
    super("FinishDebugAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    fk.e(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.eq
 * JD-Core Version:    0.6.0
 */