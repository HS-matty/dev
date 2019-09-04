package com.zend.ide.s;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class d extends MouseAdapter
{
  final cw a;

  d(cw paramcw)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
      cw.b(this.a).a(this.a.A());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.d
 * JD-Core Version:    0.6.0
 */