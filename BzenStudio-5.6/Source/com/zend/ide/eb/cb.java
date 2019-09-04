package com.zend.ide.eb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cb
  implements ActionListener
{
  final l a;

  cb(l paraml)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    l.a(this.a, null);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.cb
 * JD-Core Version:    0.6.0
 */