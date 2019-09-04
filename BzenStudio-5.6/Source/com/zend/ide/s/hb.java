package com.zend.ide.s;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;

class hb
  implements ActionListener
{
  final bj a;

  hb(bj parambj)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (bj.e(this.a).getAction().equals(bj.d(this.a)))
      bj.d(this.a).actionPerformed(paramActionEvent);
    else
      bj.f(this.a).actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.hb
 * JD-Core Version:    0.6.0
 */