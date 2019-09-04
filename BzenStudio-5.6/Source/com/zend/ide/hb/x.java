package com.zend.ide.hb;

import com.zend.ide.p.bc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JList;

class x
  implements ActionListener
{
  final rb a;

  x(rb paramrb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    rb.b(this.a).d().getActionMap().get("ok").actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.x
 * JD-Core Version:    0.6.0
 */