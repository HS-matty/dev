package com.zend.ide.util;

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

class sb
  implements Runnable
{
  final MouseEvent a;
  final Point b;
  final bt c;

  sb(bt parambt, MouseEvent paramMouseEvent, Point paramPoint)
  {
  }

  public void run()
  {
    bt.a(this.c).show(this.a.getComponent(), this.b.x, this.b.y);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.sb
 * JD-Core Version:    0.6.0
 */