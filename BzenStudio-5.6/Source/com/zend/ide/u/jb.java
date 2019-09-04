package com.zend.ide.u;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class jb
  implements ActionListener
{
  final ce a;

  jb(ce paramce)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ce.g(this.a).setEnabled(ce.h(this.a).isSelected());
    if (!ce.h(this.a).isSelected())
      ce.g(this.a).setSelected(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.jb
 * JD-Core Version:    0.6.0
 */