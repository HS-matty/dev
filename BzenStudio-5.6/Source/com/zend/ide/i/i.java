package com.zend.ide.i;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class i extends AbstractAction
{
  final o a;

  public i(o paramo)
  {
    b();
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    o.b(this.a, !o.b(this.a));
    b();
  }

  public void b()
  {
    if (o.b(this.a))
      putValue("Name", "disable");
    else
      putValue("Name", "enable");
    this.a.repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.i
 * JD-Core Version:    0.6.0
 */