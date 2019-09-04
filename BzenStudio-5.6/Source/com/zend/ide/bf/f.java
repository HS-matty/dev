package com.zend.ide.bf;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class f extends MouseAdapter
{
  final ba a;

  f(ba paramba)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
      ba.b(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.f
 * JD-Core Version:    0.6.0
 */