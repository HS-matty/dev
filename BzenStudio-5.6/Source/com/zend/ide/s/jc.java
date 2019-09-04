package com.zend.ide.s;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class jc
  implements KeyListener
{
  final cw a;

  jc(cw paramcw)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
  }

  public void keyReleased(KeyEvent paramKeyEvent)
  {
  }

  public void keyTyped(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyChar() == '\n') || (paramKeyEvent.getKeyChar() == '\r'))
      cw.b(this.a).a(this.a.A());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.jc
 * JD-Core Version:    0.6.0
 */