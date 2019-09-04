package com.zend.ide.cb.a;

import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

class g
  implements Runnable
{
  final JPopupMenu a;
  final MouseEvent c;
  final pd b;

  g(pd parampd, JPopupMenu paramJPopupMenu, MouseEvent paramMouseEvent)
  {
  }

  public void run()
  {
    this.a.show(this.b, this.c.getX(), this.c.getY());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.g
 * JD-Core Version:    0.6.0
 */