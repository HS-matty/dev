package com.zend.ide.cb.a.b;

import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

class fb
  implements Runnable
{
  final JPopupMenu a;
  final MouseEvent c;
  final db b;

  fb(db paramdb, JPopupMenu paramJPopupMenu, MouseEvent paramMouseEvent)
  {
  }

  public void run()
  {
    this.a.show(db.a(this.b), this.c.getX(), this.c.getY());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.fb
 * JD-Core Version:    0.6.0
 */