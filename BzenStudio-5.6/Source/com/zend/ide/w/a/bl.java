package com.zend.ide.w.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bl
  implements ActionListener
{
  final bz a;

  bl(bz parambz)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bz.a(this.a, 1);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.bl
 * JD-Core Version:    0.6.0
 */