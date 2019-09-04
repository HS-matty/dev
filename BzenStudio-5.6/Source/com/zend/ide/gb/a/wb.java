package com.zend.ide.gb.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class wb
  implements ActionListener
{
  final mb a;

  wb(mb parammb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    mb.a(this.a, true, false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.wb
 * JD-Core Version:    0.6.0
 */