package com.zend.ide.desktop;

import com.zend.ide.o.n.o;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class c extends MouseAdapter
{
  final br a;

  c(br parambr)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2)
    {
      boolean bool = o.a().g();
      if (bool)
        o.a().f();
      else
        o.a().c();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.c
 * JD-Core Version:    0.6.0
 */