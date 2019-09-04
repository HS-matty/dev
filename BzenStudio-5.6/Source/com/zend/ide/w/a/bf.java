package com.zend.ide.w.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bf
  implements ActionListener
{
  final bw a;

  bf(bw parambw)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bw.b(this.a, 0);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bf
 * JD-Core Version:    0.6.0
 */