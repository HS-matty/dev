package com.zend.ide.d;

import com.zend.ide.n.gz;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class ce extends MouseMotionAdapter
{
  Cursor a = new Cursor(12);
  Cursor b = new Cursor(0);
  final dd c;

  ce(dd paramdd)
  {
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    int i = dd.a(this.c).viewToModel(paramMouseEvent.getPoint());
    if (dd.a(this.c, dd.b(this.c, i)) != -1)
      dd.a(this.c).setCursor(this.a);
    else
      dd.a(this.c).setCursor(this.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ce
 * JD-Core Version:    0.6.0
 */