package com.zend.ide.w.b;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class b extends MouseAdapter
{
  private Cursor a = Cursor.getPredefinedCursor(11);
  private Cursor b = Cursor.getPredefinedCursor(0);
  final n c;

  private b(n paramn)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    n.a(this.c, paramMouseEvent.getPoint());
    paramMouseEvent.getComponent().setCursor(this.a);
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    n.a(this.c, null);
    paramMouseEvent.getComponent().setCursor(this.b);
  }

  b(n paramn, o paramo)
  {
    this(paramn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.b
 * JD-Core Version:    0.6.0
 */