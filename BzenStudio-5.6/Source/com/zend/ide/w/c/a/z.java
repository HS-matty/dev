package com.zend.ide.w.c.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class z
  implements ActionListener
{
  final nb a;

  z(nb paramnb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    nb.b(this.a, 0);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.z
 * JD-Core Version:    0.6.0
 */