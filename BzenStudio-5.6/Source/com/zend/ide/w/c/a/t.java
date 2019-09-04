package com.zend.ide.w.c.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class t
  implements ActionListener
{
  final lb a;

  t(lb paramlb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    lb.b(this.a, 0);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.t
 * JD-Core Version:    0.6.0
 */