package com.zend.ide.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class j extends KeyAdapter
{
  final eo a;
  final bu b;

  j(bu parambu, eo parameo)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() != 17)
      this.b.h = true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.j
 * JD-Core Version:    0.6.0
 */