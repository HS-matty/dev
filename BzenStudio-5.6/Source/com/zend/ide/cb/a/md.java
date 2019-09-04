package com.zend.ide.cb.a;

import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

class md
  implements Runnable
{
  final JPopupMenu a;
  final MouseEvent b;
  final s c;

  md(s params, JPopupMenu paramJPopupMenu, MouseEvent paramMouseEvent)
  {
  }

  public void run()
  {
    this.a.show(s.b(this.c), this.b.getX(), this.b.getY());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.md
 * JD-Core Version:    0.6.0
 */