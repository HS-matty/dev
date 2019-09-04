package com.zend.ide.w.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class q
  implements ActionListener
{
  final bt a;

  q(bt parambt)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bt.a(this.a, 1);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.q
 * JD-Core Version:    0.6.0
 */