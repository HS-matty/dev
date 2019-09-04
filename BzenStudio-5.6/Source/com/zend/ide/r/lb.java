package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class lb
  implements ActionListener
{
  final y a;

  lb(y paramy)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    y.a(this.a, false);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.lb
 * JD-Core Version:    0.6.0
 */