package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bt
  implements ActionListener
{
  final bg a;

  bt(bg parambg)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bg.a(this.a);
    this.a.setVisible(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bt
 * JD-Core Version:    0.6.0
 */