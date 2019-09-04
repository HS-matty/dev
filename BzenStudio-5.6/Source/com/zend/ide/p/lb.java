package com.zend.ide.p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class lb
  implements ActionListener
{
  final pb a;

  lb(pb parampb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    pb.b(this.a).setSelected(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.lb
 * JD-Core Version:    0.6.0
 */