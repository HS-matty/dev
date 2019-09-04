package com.zend.ide.w.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class w
  implements ActionListener
{
  final bv a;

  w(bv parambv)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bv.a(this.a, 1);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.w
 * JD-Core Version:    0.6.0
 */