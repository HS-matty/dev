package com.zend.ide.n;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

class iw extends MouseInputAdapter
{
  private Cursor a;
  final iz b;

  iw(iz paramiz)
  {
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
    this.a = this.b.getCursor();
    this.b.setCursor(iz.c());
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    is localis = iz.a(this.b, paramMouseEvent.getY());
    if (localis == null)
      this.b.setCursor(this.a);
    else
      this.b.setCursor(iz.c());
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    this.b.setCursor(this.a);
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    is localis = iz.a(this.b, paramMouseEvent.getY());
    if (localis == null)
      return;
    if (localis.e() == 0)
      iz.b(this.b).d(localis.c());
    else
      iz.b(this.b).a(localis.c(), true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.iw
 * JD-Core Version:    0.6.0
 */