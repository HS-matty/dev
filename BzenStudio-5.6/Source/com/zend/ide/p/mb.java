package com.zend.ide.p;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ListModel;

class mb extends AbstractAction
{
  final bw a;

  public mb(bw parambw)
  {
    super("selectAll");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a.getSelectionMode() == 2)
      this.a.setSelectionInterval(0, this.a.getModel().getSize());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.mb
 * JD-Core Version:    0.6.0
 */