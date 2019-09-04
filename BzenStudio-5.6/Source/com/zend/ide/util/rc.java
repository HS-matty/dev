package com.zend.ide.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class rc
  implements ActionListener
{
  final wc a;

  rc(wc paramwc)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.rc
 * JD-Core Version:    0.6.0
 */