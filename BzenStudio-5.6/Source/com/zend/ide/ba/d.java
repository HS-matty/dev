package com.zend.ide.ba;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class d extends MouseAdapter
{
  final f a;

  d(f paramf)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
      f.a(this.a).h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.d
 * JD-Core Version:    0.6.0
 */