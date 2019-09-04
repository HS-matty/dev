package com.zend.ide.r;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hb
  implements ActionListener
{
  final bp a;

  hb(bp parambp)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bp.a(this.a, null);
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.hb
 * JD-Core Version:    0.6.0
 */