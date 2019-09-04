package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ei extends AbstractAction
{
  final fq a;

  public ei(fq paramfq)
  {
    super("DisableBreakpointAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Object[] arrayOfObject = this.a.getSelectedValues();
    for (int i = 0; i < arrayOfObject.length; i++)
      ((di)arrayOfObject[i]).c(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ei
 * JD-Core Version:    0.6.0
 */