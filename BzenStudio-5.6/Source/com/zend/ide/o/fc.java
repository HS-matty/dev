package com.zend.ide.o;

import com.zend.ide.bc.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class fc extends AbstractAction
{
  final fk a;

  public fc(fk paramfk)
  {
    super("ToggleBreakpointAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    c.a().a("add_breakpoint");
    this.a.K();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fc
 * JD-Core Version:    0.6.0
 */