package com.zend.ide.k;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class a extends MouseAdapter
{
  final d a;

  a(d paramd)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
      this.a.h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.k.a
 * JD-Core Version:    0.6.0
 */