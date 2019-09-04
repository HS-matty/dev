package com.zend.ide.n;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;

class df
  implements AWTEventListener
{
  public void eventDispatched(AWTEvent paramAWTEvent)
  {
    KeyEvent localKeyEvent = (KeyEvent)paramAWTEvent;
    if (localKeyEvent.getKeyCode() != 155)
      return;
    if (localKeyEvent.getModifiers() != 0)
      return;
    if (localKeyEvent.getID() == 401)
      f.a(!f.d());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.df
 * JD-Core Version:    0.6.0
 */