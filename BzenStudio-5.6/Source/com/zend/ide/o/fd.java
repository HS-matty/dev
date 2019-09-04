package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class fd extends AbstractAction
{
  final fk a;

  public fd(fk paramfk)
  {
    super("ToggleOutputAreaAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b(!this.a.H());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fd
 * JD-Core Version:    0.6.0
 */