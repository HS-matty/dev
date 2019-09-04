package com.zend.ide.n;

import java.awt.Component;
import java.awt.event.MouseEvent;

class i extends MouseEvent
{
  public i(Component paramComponent, MouseEvent paramMouseEvent)
  {
    super(paramComponent, paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiers(), paramMouseEvent.getX(), paramMouseEvent.getY(), paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.i
 * JD-Core Version:    0.6.0
 */