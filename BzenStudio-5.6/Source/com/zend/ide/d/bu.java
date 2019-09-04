package com.zend.ide.d;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class bu extends KeyAdapter
{
  final cb a;

  bu(cb paramcb)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 10)
      this.a.getTopLevelAncestor().requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bu
 * JD-Core Version:    0.6.0
 */