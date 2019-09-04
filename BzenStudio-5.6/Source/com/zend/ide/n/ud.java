package com.zend.ide.n;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ud extends MouseAdapter
{
  final gx a;

  private ud(gx paramgx)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    int i = this.a.viewToModel(paramMouseEvent.getPoint());
    if (i == 0)
      i++;
    this.a.a(i);
  }

  public void mouseEntered(MouseEvent paramMouseEvent)
  {
    gx.a(this.a, false);
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    gx.a(this.a, false);
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    gx.a(this.a, false);
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    gx.a(this.a, false);
  }

  ud(gx paramgx, we paramwe)
  {
    this(paramgx);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ud
 * JD-Core Version:    0.6.0
 */