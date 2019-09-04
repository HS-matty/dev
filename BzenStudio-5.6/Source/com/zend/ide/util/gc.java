package com.zend.ide.util;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gc
  implements ActionListener
{
  final pb a;

  gc(pb parampb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (!pb.b(this.a).isSelected())
      pb.c(this.a).setSelected(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.gc
 * JD-Core Version:    0.6.0
 */