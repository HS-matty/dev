package com.zend.ide.d;

import com.zend.ide.util.f.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;

class o
  implements ActionListener
{
  private Action a = new i(new qc(this));
  final bs b;

  o(bs parambs)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.o
 * JD-Core Version:    0.6.0
 */