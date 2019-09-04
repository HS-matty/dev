package com.zend.ide.cb.a;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class o extends MouseAdapter
{
  private Cursor a = Cursor.getPredefinedCursor(8);
  private Cursor b = Cursor.getPredefinedCursor(0);
  final db c;

  private o(db paramdb)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    db.a(this.c, paramMouseEvent.getPoint());
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    db.a(this.c, null);
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
    paramMouseEvent.getComponent().setCursor(this.a);
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    paramMouseEvent.getComponent().setCursor(this.b);
  }

  o(db paramdb, eb parameb)
  {
    this(paramdb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.o
 * JD-Core Version:    0.6.0
 */