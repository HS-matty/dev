package com.zend.ide.o;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class zb extends AbstractAction
{
  final bt a;

  public zb(bt parambt)
  {
    super("RunProfilerAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.zb
 * JD-Core Version:    0.6.0
 */