package com.zend.ide.w.c.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class p
  implements ActionListener
{
  final kb a;

  p(kb paramkb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    kb.a(this.a, 1);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.a.p
 * JD-Core Version:    0.6.0
 */