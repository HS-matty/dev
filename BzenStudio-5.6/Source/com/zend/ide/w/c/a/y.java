package com.zend.ide.w.c.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class y
  implements ActionListener
{
  final nb a;

  y(nb paramnb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    nb.a(this.a, 1);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.y
 * JD-Core Version:    0.6.0
 */