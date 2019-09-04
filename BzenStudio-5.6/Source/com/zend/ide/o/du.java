package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class du extends AbstractAction
{
  final fq a;

  public du(fq paramfq)
  {
    super("RemoveSelectedBreakpointsAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Object[] arrayOfObject = this.a.getSelectedValues();
    for (int i = 0; i < arrayOfObject.length; i++)
      fq.b(this.a).b((di)arrayOfObject[i]);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.du
 * JD-Core Version:    0.6.0
 */