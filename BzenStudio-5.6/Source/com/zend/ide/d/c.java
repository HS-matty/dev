package com.zend.ide.d;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class c extends MouseAdapter
{
  final md a;

  c(md parammd)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() > 1)
      if (md.a(this.a))
      {
        if (md.b(this.a).getSelectedRowCount() == 1)
          md.c(this.a);
      }
      else
        Toolkit.getDefaultToolkit().beep();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.c
 * JD-Core Version:    0.6.0
 */