package com.zend.ide.util;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hc
  implements ActionListener
{
  final pb a;

  hc(pb parampb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (pb.c(this.a).isSelected())
      pb.b(this.a).setSelected(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.hc
 * JD-Core Version:    0.6.0
 */