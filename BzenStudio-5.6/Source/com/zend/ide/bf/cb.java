package com.zend.ide.bf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cb
  implements ActionListener
{
  final z a;

  cb(z paramz)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    z.a(this.a, null);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.cb
 * JD-Core Version:    0.6.0
 */